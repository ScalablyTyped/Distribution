package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Vector2")
@js.native
class Vector2 () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  def length(): Double = js.native
  def normalize(): this.type = js.native
  def set(x: Double, y: Double): Vector2 = js.native
}

