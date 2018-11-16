package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Interpolation")
@js.native
abstract class Interpolation () extends js.Object {
  @JSName("apply")
  def apply(start: scala.Double, end: scala.Double, a: scala.Double): scala.Double = js.native
  /* protected */ def applyInternal(a: scala.Double): scala.Double = js.native
}

