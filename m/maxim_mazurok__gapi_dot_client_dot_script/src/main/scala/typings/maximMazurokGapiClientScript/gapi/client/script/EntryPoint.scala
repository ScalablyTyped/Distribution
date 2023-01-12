package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryPoint extends StObject {
  
  /** Add-on properties. */
  var addOn: js.UndefOr[GoogleAppsScriptTypeAddOnEntryPoint] = js.undefined
  
  /** The type of the entry point. */
  var entryPointType: js.UndefOr[String] = js.undefined
  
  /** An entry point specification for Apps Script API execution calls. */
  var executionApi: js.UndefOr[GoogleAppsScriptTypeExecutionApiEntryPoint] = js.undefined
  
  /** An entry point specification for web apps. */
  var webApp: js.UndefOr[GoogleAppsScriptTypeWebAppEntryPoint] = js.undefined
}
object EntryPoint {
  
  inline def apply(): EntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntryPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntryPoint] (val x: Self) extends AnyVal {
    
    inline def setAddOn(value: GoogleAppsScriptTypeAddOnEntryPoint): Self = StObject.set(x, "addOn", value.asInstanceOf[js.Any])
    
    inline def setAddOnUndefined: Self = StObject.set(x, "addOn", js.undefined)
    
    inline def setEntryPointType(value: String): Self = StObject.set(x, "entryPointType", value.asInstanceOf[js.Any])
    
    inline def setEntryPointTypeUndefined: Self = StObject.set(x, "entryPointType", js.undefined)
    
    inline def setExecutionApi(value: GoogleAppsScriptTypeExecutionApiEntryPoint): Self = StObject.set(x, "executionApi", value.asInstanceOf[js.Any])
    
    inline def setExecutionApiUndefined: Self = StObject.set(x, "executionApi", js.undefined)
    
    inline def setWebApp(value: GoogleAppsScriptTypeWebAppEntryPoint): Self = StObject.set(x, "webApp", value.asInstanceOf[js.Any])
    
    inline def setWebAppUndefined: Self = StObject.set(x, "webApp", js.undefined)
  }
}
