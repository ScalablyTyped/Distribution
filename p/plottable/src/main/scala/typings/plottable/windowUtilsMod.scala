package typings.plottable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowUtilsMod {
  
  @JSImport("plottable/build/src/utils/windowUtils", "debounce")
  @js.native
  def debounce[T /* <: js.Function */](msec: Double, callback: T): T = js.native
  @JSImport("plottable/build/src/utils/windowUtils", "debounce")
  @js.native
  def debounce[T /* <: js.Function */](msec: Double, callback: T, context: js.Any): T = js.native
  
  @JSImport("plottable/build/src/utils/windowUtils", "deprecated")
  @js.native
  def deprecated(callingMethod: String, version: String): Unit = js.native
  @JSImport("plottable/build/src/utils/windowUtils", "deprecated")
  @js.native
  def deprecated(callingMethod: String, version: String, message: String): Unit = js.native
  
  @JSImport("plottable/build/src/utils/windowUtils", "setTimeout")
  @js.native
  def setTimeout(f: js.Function, time: Double, args: js.Any*): Double = js.native
  
  @JSImport("plottable/build/src/utils/windowUtils", "warn")
  @js.native
  def warn(warning: String): Unit = js.native
}
