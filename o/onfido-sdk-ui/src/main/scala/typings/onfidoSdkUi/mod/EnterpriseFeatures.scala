package typings.onfidoSdkUi.mod

import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseFeatures extends StObject {
  
  var cobrand: js.UndefOr[EnterpriseCobranding] = js.undefined
  
  var hideOnfidoLogo: js.UndefOr[Boolean] = js.undefined
  
  var logoCobrand: js.UndefOr[EnterpriseLogoCobranding] = js.undefined
  
  var onSubmitDocument: js.UndefOr[js.Function1[/* data */ FormData, js.Promise[EnterpriseCallbackResponse]]] = js.undefined
  
  var onSubmitSelfie: js.UndefOr[js.Function1[/* data */ FormData, js.Promise[EnterpriseCallbackResponse]]] = js.undefined
  
  var onSubmitVideo: js.UndefOr[js.Function1[/* data */ FormData, js.Promise[EnterpriseCallbackResponse]]] = js.undefined
  
  var useCustomizedApiRequests: js.UndefOr[Boolean] = js.undefined
}
object EnterpriseFeatures {
  
  inline def apply(): EnterpriseFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterpriseFeatures] (val x: Self) extends AnyVal {
    
    inline def setCobrand(value: EnterpriseCobranding): Self = StObject.set(x, "cobrand", value.asInstanceOf[js.Any])
    
    inline def setCobrandUndefined: Self = StObject.set(x, "cobrand", js.undefined)
    
    inline def setHideOnfidoLogo(value: Boolean): Self = StObject.set(x, "hideOnfidoLogo", value.asInstanceOf[js.Any])
    
    inline def setHideOnfidoLogoUndefined: Self = StObject.set(x, "hideOnfidoLogo", js.undefined)
    
    inline def setLogoCobrand(value: EnterpriseLogoCobranding): Self = StObject.set(x, "logoCobrand", value.asInstanceOf[js.Any])
    
    inline def setLogoCobrandUndefined: Self = StObject.set(x, "logoCobrand", js.undefined)
    
    inline def setOnSubmitDocument(value: /* data */ FormData => js.Promise[EnterpriseCallbackResponse]): Self = StObject.set(x, "onSubmitDocument", js.Any.fromFunction1(value))
    
    inline def setOnSubmitDocumentUndefined: Self = StObject.set(x, "onSubmitDocument", js.undefined)
    
    inline def setOnSubmitSelfie(value: /* data */ FormData => js.Promise[EnterpriseCallbackResponse]): Self = StObject.set(x, "onSubmitSelfie", js.Any.fromFunction1(value))
    
    inline def setOnSubmitSelfieUndefined: Self = StObject.set(x, "onSubmitSelfie", js.undefined)
    
    inline def setOnSubmitVideo(value: /* data */ FormData => js.Promise[EnterpriseCallbackResponse]): Self = StObject.set(x, "onSubmitVideo", js.Any.fromFunction1(value))
    
    inline def setOnSubmitVideoUndefined: Self = StObject.set(x, "onSubmitVideo", js.undefined)
    
    inline def setUseCustomizedApiRequests(value: Boolean): Self = StObject.set(x, "useCustomizedApiRequests", value.asInstanceOf[js.Any])
    
    inline def setUseCustomizedApiRequestsUndefined: Self = StObject.set(x, "useCustomizedApiRequests", js.undefined)
  }
}
