package typings.novncCore

import typings.novncCore.novncCoreStrings.debug
import typings.novncCore.novncCoreStrings.error
import typings.novncCore.novncCoreStrings.info
import typings.novncCore.novncCoreStrings.none
import typings.novncCore.novncCoreStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggingMod {
  
  @JSImport("novnc-core/lib/util/logging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLogging(): debug | info | warn | error | none = ^.asInstanceOf[js.Dynamic].applyDynamic("get_logging")().asInstanceOf[debug | info | warn | error | none]
  
  inline def initLogging(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init_logging")().asInstanceOf[Unit]
  
  inline def initLogging_debug(level: debug): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init_logging")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def initLogging_error(level: error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init_logging")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def initLogging_info(level: info): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init_logging")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def initLogging_none(level: none): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init_logging")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def initLogging_warn(level: warn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init_logging")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
