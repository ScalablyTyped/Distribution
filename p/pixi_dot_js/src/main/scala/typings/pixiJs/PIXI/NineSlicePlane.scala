package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The NineSlicePlane allows you to stretch a texture using 9-slice scaling. The corners will remain unscaled (useful
  * for buttons with rounded corners for example) and the other areas will be scaled horizontally and or vertically
  *
  *```js
  * let Plane9 = new PIXI.NineSlicePlane(PIXI.Texture.from('BoxWithRoundedCorners.png'), 15, 15, 15, 15);
  *  ```
  * <pre>
  *      A                          B
  *    +---+----------------------+---+
  *  C | 1 |          2           | 3 |
  *    +---+----------------------+---+
  *    |   |                      |   |
  *    | 4 |          5           | 6 |
  *    |   |                      |   |
  *    +---+----------------------+---+
  *  D | 7 |          8           | 9 |
  *    +---+----------------------+---+
  
  *  When changing this objects width and/or height:
  *     areas 1 3 7 and 9 will remain unscaled.
  *     areas 2 and 8 will be stretched horizontally
  *     areas 4 and 6 will be stretched vertically
  *     area 5 will be stretched both horizontally and vertically
  * </pre>
  *
  * @class
  * @extends PIXI.SimplePlane
  * @memberof PIXI
  *
  */
@js.native
trait NineSlicePlane extends SimplePlane {
  
  /**
    * The height of the NineSlicePlane, setting this will actually modify the vertices and UV's of this plane
    *
    * @member {number} PIXI.NineSlicePlane#_height
    * @override
    */
  var _height: Double = js.native
  
  /**
    * Refreshes NineSlicePlane coords. All of them.
    */
  def _refresh(): Unit = js.native
  
  /**
    * The width of the NineSlicePlane, setting this will actually modify the vertices and UV's of this plane
    *
    * @member {number} PIXI.NineSlicePlane#_width
    * @override
    */
  var _width: Double = js.native
  
  /**
    * The height of the bottom row
    *
    * @member {number}
    */
  var bottomHeight: Double = js.native
  
  /**
    * The width of the left column
    *
    * @member {number}
    */
  var leftWidth: Double = js.native
  
  /**
    * The width of the right column
    *
    * @member {number}
    */
  var rightWidth: Double = js.native
  
  /**
    * The height of the top row
    *
    * @member {number}
    */
  var topHeight: Double = js.native
  
  /**
    * Updates the horizontal vertices.
    *
    */
  def updateHorizontalVertices(): Unit = js.native
  
  /**
    * Updates the vertical vertices.
    *
    */
  def updateVerticalVertices(): Unit = js.native
}
