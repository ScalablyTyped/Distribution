package typings.plottable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsWindowUtilsMod {
  
  @JSImport("plottable/build/src/utils/windowUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounce[T /* <: js.Function */](msec: Double, callback: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(msec.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def debounce[T /* <: js.Function */](msec: Double, callback: T, context: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(msec.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def deprecated(callingMethod: String, version: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(callingMethod.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deprecated(callingMethod: String, version: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(callingMethod.asInstanceOf[js.Any], version.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTimeout(f: js.Function, time: Double, args: Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")((scala.List(f.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  
  inline def warn(warning: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(warning.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
