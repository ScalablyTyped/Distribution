package typings.metamaskUtils

import typings.debug.mod.Debugger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoggingMod {
  
  @JSImport("@metamask/utils/dist/logging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createModuleLogger(projectLogger: Debugger, moduleName: String): Debugger = (^.asInstanceOf[js.Dynamic].applyDynamic("createModuleLogger")(projectLogger.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[Debugger]
  
  inline def createProjectLogger(projectName: String): Debugger = ^.asInstanceOf[js.Dynamic].applyDynamic("createProjectLogger")(projectName.asInstanceOf[js.Any]).asInstanceOf[Debugger]
}
