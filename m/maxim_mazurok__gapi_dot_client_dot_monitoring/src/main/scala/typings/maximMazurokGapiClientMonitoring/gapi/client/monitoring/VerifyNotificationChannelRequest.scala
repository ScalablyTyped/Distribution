package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyNotificationChannelRequest extends StObject {
  
  /**
    * Required. The verification code that was delivered to the channel as a result of invoking the SendNotificationChannelVerificationCode API method or that was retrieved from a
    * verified channel via GetNotificationChannelVerificationCode. For example, one might have "G-123456" or "TKNZGhhd2EyN3I1MnRnMjRv" (in general, one is only guaranteed that the code is
    * valid UTF-8; one should not make any assumptions regarding the structure or format of the code).
    */
  var code: js.UndefOr[String] = js.undefined
}
object VerifyNotificationChannelRequest {
  
  inline def apply(): VerifyNotificationChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyNotificationChannelRequest]
  }
  
  extension [Self <: VerifyNotificationChannelRequest](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
