package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceAuthorizationParameters
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var client_id: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
}
object DeviceAuthorizationParameters {
  
  @scala.inline
  def apply(): DeviceAuthorizationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceAuthorizationParameters]
  }
  
  @scala.inline
  implicit class DeviceAuthorizationParametersMutableBuilder[Self <: DeviceAuthorizationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
