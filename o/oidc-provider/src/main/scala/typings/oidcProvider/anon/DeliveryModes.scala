package typings.oidcProvider.anon

import typings.oidcProvider.mod.Account
import typings.oidcProvider.mod.BackchannelAuthenticationRequest
import typings.oidcProvider.mod.CIBADeliveryMode
import typings.oidcProvider.mod.CanBePromise
import typings.oidcProvider.mod.KoaContextWithOIDC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryModes extends StObject {
  
  var deliveryModes: js.Array[CIBADeliveryMode]
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var processLoginHint: js.UndefOr[
    js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* loginHint */ js.UndefOr[String], 
      CanBePromise[js.UndefOr[String]]
    ]
  ] = js.undefined
  
  var processLoginHintToken: js.UndefOr[
    js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* loginHintToken */ js.UndefOr[String], 
      CanBePromise[js.UndefOr[String]]
    ]
  ] = js.undefined
  
  var triggerAuthenticationDevice: js.UndefOr[
    js.Function4[
      /* ctx */ KoaContextWithOIDC, 
      /* request */ BackchannelAuthenticationRequest, 
      /* account */ Account, 
      /* client */ typings.oidcProvider.mod.Client, 
      CanBePromise[Unit]
    ]
  ] = js.undefined
  
  var validateBindingMessage: js.UndefOr[
    js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* bindingMessage */ js.UndefOr[String], 
      CanBePromise[Unit]
    ]
  ] = js.undefined
  
  var validateRequestContext: js.UndefOr[
    js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* requestContext */ js.UndefOr[String], 
      CanBePromise[Unit]
    ]
  ] = js.undefined
  
  var verifyUserCode: js.UndefOr[
    js.Function2[/* ctx */ KoaContextWithOIDC, /* userCode */ js.UndefOr[String], CanBePromise[Unit]]
  ] = js.undefined
}
object DeliveryModes {
  
  inline def apply(deliveryModes: js.Array[CIBADeliveryMode]): DeliveryModes = {
    val __obj = js.Dynamic.literal(deliveryModes = deliveryModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryModes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeliveryModes] (val x: Self) extends AnyVal {
    
    inline def setDeliveryModes(value: js.Array[CIBADeliveryMode]): Self = StObject.set(x, "deliveryModes", value.asInstanceOf[js.Any])
    
    inline def setDeliveryModesVarargs(value: CIBADeliveryMode*): Self = StObject.set(x, "deliveryModes", js.Array(value*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setProcessLoginHint(
      value: (/* ctx */ KoaContextWithOIDC, /* loginHint */ js.UndefOr[String]) => CanBePromise[js.UndefOr[String]]
    ): Self = StObject.set(x, "processLoginHint", js.Any.fromFunction2(value))
    
    inline def setProcessLoginHintToken(
      value: (/* ctx */ KoaContextWithOIDC, /* loginHintToken */ js.UndefOr[String]) => CanBePromise[js.UndefOr[String]]
    ): Self = StObject.set(x, "processLoginHintToken", js.Any.fromFunction2(value))
    
    inline def setProcessLoginHintTokenUndefined: Self = StObject.set(x, "processLoginHintToken", js.undefined)
    
    inline def setProcessLoginHintUndefined: Self = StObject.set(x, "processLoginHint", js.undefined)
    
    inline def setTriggerAuthenticationDevice(
      value: (/* ctx */ KoaContextWithOIDC, /* request */ BackchannelAuthenticationRequest, /* account */ Account, /* client */ typings.oidcProvider.mod.Client) => CanBePromise[Unit]
    ): Self = StObject.set(x, "triggerAuthenticationDevice", js.Any.fromFunction4(value))
    
    inline def setTriggerAuthenticationDeviceUndefined: Self = StObject.set(x, "triggerAuthenticationDevice", js.undefined)
    
    inline def setValidateBindingMessage(
      value: (/* ctx */ KoaContextWithOIDC, /* bindingMessage */ js.UndefOr[String]) => CanBePromise[Unit]
    ): Self = StObject.set(x, "validateBindingMessage", js.Any.fromFunction2(value))
    
    inline def setValidateBindingMessageUndefined: Self = StObject.set(x, "validateBindingMessage", js.undefined)
    
    inline def setValidateRequestContext(
      value: (/* ctx */ KoaContextWithOIDC, /* requestContext */ js.UndefOr[String]) => CanBePromise[Unit]
    ): Self = StObject.set(x, "validateRequestContext", js.Any.fromFunction2(value))
    
    inline def setValidateRequestContextUndefined: Self = StObject.set(x, "validateRequestContext", js.undefined)
    
    inline def setVerifyUserCode(value: (/* ctx */ KoaContextWithOIDC, /* userCode */ js.UndefOr[String]) => CanBePromise[Unit]): Self = StObject.set(x, "verifyUserCode", js.Any.fromFunction2(value))
    
    inline def setVerifyUserCodeUndefined: Self = StObject.set(x, "verifyUserCode", js.undefined)
  }
}
