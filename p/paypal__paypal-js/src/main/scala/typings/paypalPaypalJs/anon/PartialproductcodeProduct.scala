package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.subscriptionsCommonsMod.API
import typings.paypalPaypalJs.subscriptionsCommonsMod.IntegrationArtifact
import typings.paypalPaypalJs.subscriptionsCommonsMod.ProductCode
import typings.paypalPaypalJs.subscriptionsCommonsMod.ProductFeature
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  product_code :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.ProductCode,   product_feature :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.ProductFeature,   api :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.API,   integration_artifact :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.IntegrationArtifact,   experience :std.Partial<{  user_experience_flow :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.UserExperienceFlow,   entry_point :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.Payment,   payment_method :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.Payment | 'PAY_WITH_CRYPTO',   channel :'WEB' | 'MOBILE_WEB' | 'MOBILE_APP' | 'BATCH',   product_flow :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.ProductFlow}>,   initiator :{  product_code :'EXPRESS_CHECKOUT' | 'WEBSITE_PAYMENTS_STANDARD' | undefined}}> */
trait PartialproductcodeProduct extends StObject {
  
  var api: js.UndefOr[API] = js.undefined
  
  var experience: js.UndefOr[Partial[Channel]] = js.undefined
  
  var initiator: js.UndefOr[Productcode] = js.undefined
  
  var integration_artifact: js.UndefOr[IntegrationArtifact] = js.undefined
  
  var product_code: js.UndefOr[ProductCode] = js.undefined
  
  var product_feature: js.UndefOr[ProductFeature] = js.undefined
}
object PartialproductcodeProduct {
  
  inline def apply(): PartialproductcodeProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialproductcodeProduct]
  }
  
  extension [Self <: PartialproductcodeProduct](x: Self) {
    
    inline def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setExperience(value: Partial[Channel]): Self = StObject.set(x, "experience", value.asInstanceOf[js.Any])
    
    inline def setExperienceUndefined: Self = StObject.set(x, "experience", js.undefined)
    
    inline def setInitiator(value: Productcode): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setIntegration_artifact(value: IntegrationArtifact): Self = StObject.set(x, "integration_artifact", value.asInstanceOf[js.Any])
    
    inline def setIntegration_artifactUndefined: Self = StObject.set(x, "integration_artifact", js.undefined)
    
    inline def setProduct_code(value: ProductCode): Self = StObject.set(x, "product_code", value.asInstanceOf[js.Any])
    
    inline def setProduct_codeUndefined: Self = StObject.set(x, "product_code", js.undefined)
    
    inline def setProduct_feature(value: ProductFeature): Self = StObject.set(x, "product_feature", value.asInstanceOf[js.Any])
    
    inline def setProduct_featureUndefined: Self = StObject.set(x, "product_feature", js.undefined)
  }
}
