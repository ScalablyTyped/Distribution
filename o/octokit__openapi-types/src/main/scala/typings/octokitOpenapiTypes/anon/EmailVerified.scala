package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailVerified extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var verified: js.UndefOr[Boolean] = js.undefined
}
object EmailVerified {
  
  inline def apply(): EmailVerified = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailVerified]
  }
  
  extension [Self <: EmailVerified](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
