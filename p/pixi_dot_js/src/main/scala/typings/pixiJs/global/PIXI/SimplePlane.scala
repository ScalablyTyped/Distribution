package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The SimplePlane allows you to draw a texture across several points and then manipulate these points
  *
  *```js
  * for (let i = 0; i < 20; i++) {
  *     points.push(new PIXI.Point(i * 50, 0));
  * };
  * let SimplePlane = new PIXI.SimplePlane(PIXI.Texture.from("snake.png"), points);
  *  ```
  *
  * @class
  * @extends PIXI.Mesh
  * @memberof PIXI
  *
  */
@JSGlobal("PIXI.SimplePlane")
@js.native
class SimplePlane protected ()
  extends typings.pixiJs.PIXI.SimplePlane {
  def this(texture: typings.pixiJs.PIXI.Texture, verticesX: Double, verticesY: Double) = this()
}

