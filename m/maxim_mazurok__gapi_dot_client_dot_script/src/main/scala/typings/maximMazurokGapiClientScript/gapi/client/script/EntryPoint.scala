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
  
  @scala.inline
  def apply(): EntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntryPoint]
  }
  
  @scala.inline
  implicit class EntryPointMutableBuilder[Self <: EntryPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOn(value: GoogleAppsScriptTypeAddOnEntryPoint): Self = StObject.set(x, "addOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnUndefined: Self = StObject.set(x, "addOn", js.undefined)
    
    @scala.inline
    def setEntryPointType(value: String): Self = StObject.set(x, "entryPointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointTypeUndefined: Self = StObject.set(x, "entryPointType", js.undefined)
    
    @scala.inline
    def setExecutionApi(value: GoogleAppsScriptTypeExecutionApiEntryPoint): Self = StObject.set(x, "executionApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionApiUndefined: Self = StObject.set(x, "executionApi", js.undefined)
    
    @scala.inline
    def setWebApp(value: GoogleAppsScriptTypeWebAppEntryPoint): Self = StObject.set(x, "webApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAppUndefined: Self = StObject.set(x, "webApp", js.undefined)
  }
}
