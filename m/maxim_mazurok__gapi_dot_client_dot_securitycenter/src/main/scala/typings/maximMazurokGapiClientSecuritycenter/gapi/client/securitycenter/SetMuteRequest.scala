package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetMuteRequest extends StObject {
  
  /** Required. The desired state of the Mute. */
  var mute: js.UndefOr[String] = js.undefined
}
object SetMuteRequest {
  
  inline def apply(): SetMuteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetMuteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetMuteRequest] (val x: Self) extends AnyVal {
    
    inline def setMute(value: String): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
  }
}
