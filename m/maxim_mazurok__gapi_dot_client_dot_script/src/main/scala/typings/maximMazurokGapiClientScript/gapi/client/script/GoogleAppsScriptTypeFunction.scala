package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsScriptTypeFunction extends StObject {
  
  /** The function name in the script project. */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleAppsScriptTypeFunction {
  
  @scala.inline
  def apply(): GoogleAppsScriptTypeFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeFunction]
  }
  
  @scala.inline
  implicit class GoogleAppsScriptTypeFunctionMutableBuilder[Self <: GoogleAppsScriptTypeFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
