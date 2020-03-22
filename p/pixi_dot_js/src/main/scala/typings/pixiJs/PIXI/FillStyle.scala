package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fill style object for Graphics.
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.FillStyle")
@js.native
class FillStyle () extends js.Object {
  /**
    * The alpha value used when filling the Graphics object.
    *
    * @member {number} PIXI.FillStyle#alpha
    * @default 1
    */
  var alpha: Double = js.native
  /**
    * The hex color value used when coloring the Graphics object.
    *
    * @member {number} PIXI.FillStyle#color
    * @default 1
    */
  var color: Double = js.native
  /**
    * The transform aplpied to the texture.
    *
    * @member {string} PIXI.FillStyle#matrix
    * @default 0
    */
  var matrix: String = js.native
  /**
    * The texture to be used for the fill.
    *
    * @member {string} PIXI.FillStyle#texture
    * @default 0
    */
  var texture: String = js.native
  /**
    * If the current fill is visible.
    *
    * @member {boolean} PIXI.FillStyle#visible
    * @default false
    */
  var visible: Boolean = js.native
  /**
    * Destroy and don't use after this
    */
  def destroy(): Unit = js.native
  /**
    * Reset
    */
  def reset(): Unit = js.native
}

