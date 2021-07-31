package typings.plottable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowUtilsMod {
  
  @JSImport("plottable/build/src/utils/windowUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def debounce[T /* <: js.Function */](msec: Double, callback: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(msec.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def debounce[T /* <: js.Function */](msec: Double, callback: T, context: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(msec.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def deprecated(callingMethod: String, version: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(callingMethod.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def deprecated(callingMethod: String, version: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(callingMethod.asInstanceOf[js.Any], version.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setTimeout(f: js.Function, time: Double, args: js.Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(f.asInstanceOf[js.Any], time.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def warn(warning: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(warning.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
