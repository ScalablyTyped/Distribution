package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestSignatureVerification extends StObject {
  
  // Specifies which weak algorithms are allowed. The possible values are: rsaSha1, unknownFutureValue.
  var allowedWeakAlgorithms: js.UndefOr[NullableOption[WeakAlgorithms]] = js.undefined
  
  // Specifies whether signed authentication requests for this application should be required.
  var isSignedRequestRequired: js.UndefOr[Boolean] = js.undefined
}
object RequestSignatureVerification {
  
  inline def apply(): RequestSignatureVerification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSignatureVerification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestSignatureVerification] (val x: Self) extends AnyVal {
    
    inline def setAllowedWeakAlgorithms(value: NullableOption[WeakAlgorithms]): Self = StObject.set(x, "allowedWeakAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setAllowedWeakAlgorithmsNull: Self = StObject.set(x, "allowedWeakAlgorithms", null)
    
    inline def setAllowedWeakAlgorithmsUndefined: Self = StObject.set(x, "allowedWeakAlgorithms", js.undefined)
    
    inline def setIsSignedRequestRequired(value: Boolean): Self = StObject.set(x, "isSignedRequestRequired", value.asInstanceOf[js.Any])
    
    inline def setIsSignedRequestRequiredUndefined: Self = StObject.set(x, "isSignedRequestRequired", js.undefined)
  }
}
