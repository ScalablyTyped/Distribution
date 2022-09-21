package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runActivityMod {
  
  inline def apply(
    pKey: Any,
    processId: Any,
    activityName: Any,
    canDoHistory: Any,
    parameters: Any,
    iconClass: Any,
    lastShownProcessId: Any,
    validateLastActivity: Any
  ): Any = (^.asInstanceOf[js.Dynamic].apply(pKey.asInstanceOf[js.Any], processId.asInstanceOf[js.Any], activityName.asInstanceOf[js.Any], canDoHistory.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], iconClass.asInstanceOf[js.Any], lastShownProcessId.asInstanceOf[js.Any], validateLastActivity.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@nginstack/web-framework/lib/process/runActivity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/process/runActivity", "processManager_")
  @js.native
  val processManager: Any = js.native
}
