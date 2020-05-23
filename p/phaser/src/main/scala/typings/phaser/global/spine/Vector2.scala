package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Vector2")
@js.native
class Vector2 ()
  extends typings.phaser.spine.Vector2 {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  /* CompleteClass */
  override var x: Double = js.native
  /* CompleteClass */
  override var y: Double = js.native
  /* CompleteClass */
  override def length(): Double = js.native
  /* CompleteClass */
  override def normalize(): this.type = js.native
  /* CompleteClass */
  override def set(x: Double, y: Double): typings.phaser.spine.Vector2 = js.native
}

