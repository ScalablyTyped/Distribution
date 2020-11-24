package typings.mlLevenbergMarquardt.mod

import typings.mlLevenbergMarquardt.anon.PartialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ml-levenberg-marquardt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /** Implementation of the Levenberg-Marquardt curve fitting method. */
  def apply(d: Data, fn: FittedFunction): Result = js.native
  def apply(d: Data, fn: FittedFunction, o: PartialOptions): Result = js.native
}
