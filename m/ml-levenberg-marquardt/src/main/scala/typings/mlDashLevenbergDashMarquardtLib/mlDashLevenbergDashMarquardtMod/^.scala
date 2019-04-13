package typings
package mlDashLevenbergDashMarquardtLib.mlDashLevenbergDashMarquardtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ml-levenberg-marquardt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Implementation of the Levenberg-Marquardt curve fitting method. */
  def apply(d: Data, fn: FittedFunction): Result = js.native
  def apply(d: Data, fn: FittedFunction, o: stdLib.Partial[Options]): Result = js.native
}

