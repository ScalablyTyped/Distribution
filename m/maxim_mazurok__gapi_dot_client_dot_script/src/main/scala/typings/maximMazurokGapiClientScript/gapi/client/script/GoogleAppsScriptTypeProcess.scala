package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsScriptTypeProcess extends StObject {
  
  /** Duration the execution spent executing. */
  var duration: js.UndefOr[String] = js.undefined
  
  /** Name of the function the started the execution. */
  var functionName: js.UndefOr[String] = js.undefined
  
  /** The executions status. */
  var processStatus: js.UndefOr[String] = js.undefined
  
  /** The executions type. */
  var processType: js.UndefOr[String] = js.undefined
  
  /** Name of the script being executed. */
  var projectName: js.UndefOr[String] = js.undefined
  
  /** Time the execution started. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** The executing users access level to the script. */
  var userAccessLevel: js.UndefOr[String] = js.undefined
}
object GoogleAppsScriptTypeProcess {
  
  inline def apply(): GoogleAppsScriptTypeProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeProcess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAppsScriptTypeProcess] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setProcessStatus(value: String): Self = StObject.set(x, "processStatus", value.asInstanceOf[js.Any])
    
    inline def setProcessStatusUndefined: Self = StObject.set(x, "processStatus", js.undefined)
    
    inline def setProcessType(value: String): Self = StObject.set(x, "processType", value.asInstanceOf[js.Any])
    
    inline def setProcessTypeUndefined: Self = StObject.set(x, "processType", js.undefined)
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setUserAccessLevel(value: String): Self = StObject.set(x, "userAccessLevel", value.asInstanceOf[js.Any])
    
    inline def setUserAccessLevelUndefined: Self = StObject.set(x, "userAccessLevel", js.undefined)
  }
}
