package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/utils/windowUtils", JSImport.Namespace)
@js.native
object windowUtilsMod extends js.Object {
  
  def debounce[T /* <: js.Function */](msec: Double, callback: T): T = js.native
  def debounce[T /* <: js.Function */](msec: Double, callback: T, context: js.Any): T = js.native
  
  def deprecated(callingMethod: String, version: String): Unit = js.native
  def deprecated(callingMethod: String, version: String, message: String): Unit = js.native
  
  def setTimeout(f: js.Function, time: Double, args: js.Any*): Double = js.native
  
  def warn(warning: String): Unit = js.native
}
