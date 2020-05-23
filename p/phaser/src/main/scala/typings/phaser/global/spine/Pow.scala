package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Pow")
@js.native
class Pow protected ()
  extends typings.phaser.spine.Pow {
  def this(power: Double) = this()
  /* CompleteClass */
  override var power: Double = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(start: Double, end: Double, a: Double): Double = js.native
  /* CompleteClass */
  /* protected */ override def applyInternal(a: Double): Double = js.native
}

