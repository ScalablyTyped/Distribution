package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacOSCustomConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // Payload. (UTF8 encoded byte array)
  var payload: js.UndefOr[String] = js.undefined
  
  // Payload file name (.mobileconfig
  var payloadFileName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name that is displayed to the user.
  var payloadName: js.UndefOr[String] = js.undefined
}
object MacOSCustomConfiguration {
  
  inline def apply(): MacOSCustomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacOSCustomConfiguration]
  }
  
  extension [Self <: MacOSCustomConfiguration](x: Self) {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadFileName(value: NullableOption[String]): Self = StObject.set(x, "payloadFileName", value.asInstanceOf[js.Any])
    
    inline def setPayloadFileNameNull: Self = StObject.set(x, "payloadFileName", null)
    
    inline def setPayloadFileNameUndefined: Self = StObject.set(x, "payloadFileName", js.undefined)
    
    inline def setPayloadName(value: String): Self = StObject.set(x, "payloadName", value.asInstanceOf[js.Any])
    
    inline def setPayloadNameUndefined: Self = StObject.set(x, "payloadName", js.undefined)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
