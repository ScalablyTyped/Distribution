package typings.phaser.Phaser.Math

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math.ToXY")
@js.native
object ToXY extends js.Object {
  /**
    * Returns a Vec2 containing the x and y position of the given index in a `width` x `height` sized grid.
    * 
    * For example, in a 6 x 4 grid, index 16 would equal x: 4 y: 2.
    * 
    * If the given index is out of range an empty Vec2 is returned.
    * @param index The position within the grid to get the x/y value for.
    * @param width The width of the grid.
    * @param height The height of the grid.
    * @param out An optional Vector2 to store the result in. If not given, a new Vector2 instance will be created.
    */
  def apply(index: integer, width: integer, height: integer): Vector2 = js.native
  def apply(index: integer, width: integer, height: integer, out: Vector2): Vector2 = js.native
}

