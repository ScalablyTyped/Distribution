package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevertBuiltInVariableResponse extends StObject {
  
  /** Whether the built-in variable is enabled after reversion. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object RevertBuiltInVariableResponse {
  
  inline def apply(): RevertBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertBuiltInVariableResponse]
  }
  
  extension [Self <: RevertBuiltInVariableResponse](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
