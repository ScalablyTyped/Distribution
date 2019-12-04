package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Interpolation")
@js.native
abstract class Interpolation () extends js.Object {
  @JSName("apply")
  def apply(start: Double, end: Double, a: Double): Double = js.native
  /* protected */ def applyInternal(a: Double): Double = js.native
}

