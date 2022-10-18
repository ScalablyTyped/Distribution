package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerificationRequest extends StObject {
  
  var verificationRequest: js.UndefOr[Boolean] = js.undefined
}
object VerificationRequest {
  
  inline def apply(): VerificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerificationRequest]
  }
  
  extension [Self <: VerificationRequest](x: Self) {
    
    inline def setVerificationRequest(value: Boolean): Self = StObject.set(x, "verificationRequest", value.asInstanceOf[js.Any])
    
    inline def setVerificationRequestUndefined: Self = StObject.set(x, "verificationRequest", js.undefined)
  }
}
