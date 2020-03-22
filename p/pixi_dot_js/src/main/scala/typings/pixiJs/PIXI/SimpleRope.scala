package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The rope allows you to draw a texture across several points and then manipulate these points
  *
  *```js
  * for (let i = 0; i < 20; i++) {
  *     points.push(new PIXI.Point(i * 50, 0));
  * };
  * let rope = new PIXI.SimpleRope(PIXI.Texture.from("snake.png"), points);
  *  ```
  *
  * @class
  * @extends PIXI.Mesh
  * @memberof PIXI
  *
  */
@JSGlobal("PIXI.SimpleRope")
@js.native
class SimpleRope protected () extends Mesh {
  def this(texture: Texture, points: js.Array[Point]) = this()
  def this(texture: Texture, points: js.Array[Point], textureScale: Double) = this()
  /**
    * re-calculate vertices by rope points each frame
    *
    * @member {boolean} PIXI.SimpleRope#autoUpdate
    */
  var autoUpdate: Boolean = js.native
}

