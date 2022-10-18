package typings.novncCore

import typings.novncCore.novncCoreStrings.debug
import typings.novncCore.novncCoreStrings.error
import typings.novncCore.novncCoreStrings.info
import typings.novncCore.novncCoreStrings.none
import typings.novncCore.novncCoreStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilLoggingMod {
  
  @JSImport("novnc-core/lib/util/logging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLogging(): debug | info | warn | error | none = ^.asInstanceOf[js.Dynamic].applyDynamic("get_logging")().asInstanceOf[debug | info | warn | error | none]
  
  inline def initLogging(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init_logging")().asInstanceOf[Unit]
  inline def initLogging(level: debug | info | warn | error | none): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init_logging")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
