package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Interpolation")
@js.native
abstract class Interpolation () extends js.Object {
  @JSName("apply")
  def apply(start: Double, end: Double, a: Double): Double = js.native
  /* protected */ def applyInternal(a: Double): Double = js.native
}

