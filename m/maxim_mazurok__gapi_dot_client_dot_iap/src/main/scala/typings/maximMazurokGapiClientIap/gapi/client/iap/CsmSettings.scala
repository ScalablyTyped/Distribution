package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsmSettings extends StObject {
  
  /** Audience claim set in the generated RCToken. This value is not validated by IAP. */
  var rctokenAud: js.UndefOr[String] = js.undefined
}
object CsmSettings {
  
  inline def apply(): CsmSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsmSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CsmSettings] (val x: Self) extends AnyVal {
    
    inline def setRctokenAud(value: String): Self = StObject.set(x, "rctokenAud", value.asInstanceOf[js.Any])
    
    inline def setRctokenAudUndefined: Self = StObject.set(x, "rctokenAud", js.undefined)
  }
}
