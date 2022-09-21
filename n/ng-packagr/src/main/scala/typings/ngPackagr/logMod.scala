package typings.ngPackagr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  @JSImport("ng-packagr/lib/utils/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debug(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def error(err: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def error(err: js.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def info(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def msg(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("msg")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def success(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warn(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
