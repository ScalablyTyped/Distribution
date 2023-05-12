package typings.mercadopagoSdkJs.mercadopagocore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var advancedFraudPrevention: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[Locale] = js.undefined
  
  var trackingDisabled: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setAdvancedFraudPrevention(value: Boolean): Self = StObject.set(x, "advancedFraudPrevention", value.asInstanceOf[js.Any])
    
    inline def setAdvancedFraudPreventionUndefined: Self = StObject.set(x, "advancedFraudPrevention", js.undefined)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setTrackingDisabled(value: Boolean): Self = StObject.set(x, "trackingDisabled", value.asInstanceOf[js.Any])
    
    inline def setTrackingDisabledUndefined: Self = StObject.set(x, "trackingDisabled", js.undefined)
  }
}
