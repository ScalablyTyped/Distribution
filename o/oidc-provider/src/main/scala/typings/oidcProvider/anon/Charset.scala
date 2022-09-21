package typings.oidcProvider.anon

import typings.oidcProvider.mod.CanBePromise
import typings.oidcProvider.mod.ErrorOut
import typings.oidcProvider.mod.KoaContextWithOIDC
import typings.oidcProvider.mod.UnknownObject
import typings.oidcProvider.mod.errors.OIDCProviderError
import typings.oidcProvider.oidcProviderStrings.`base-20`
import typings.oidcProvider.oidcProviderStrings.digits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Charset extends StObject {
  
  var charset: js.UndefOr[`base-20` | digits] = js.undefined
  
  var deviceInfo: js.UndefOr[js.Function1[/* ctx */ KoaContextWithOIDC, UnknownObject]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var mask: js.UndefOr[String] = js.undefined
  
  // tslint:disable-line:void-return
  var successSource: js.UndefOr[js.Function1[/* ctx */ KoaContextWithOIDC, CanBePromise[js.UndefOr[Unit]]]] = js.undefined
  
  // tslint:disable-line:void-return
  var userCodeConfirmSource: js.UndefOr[
    js.Function5[
      /* ctx */ KoaContextWithOIDC, 
      /* form */ String, 
      /* client */ typings.oidcProvider.mod.Client, 
      /* deviceInfo */ UnknownObject, 
      /* userCode */ String, 
      CanBePromise[js.UndefOr[Unit]]
    ]
  ] = js.undefined
  
  var userCodeInputSource: js.UndefOr[
    js.Function4[
      /* ctx */ KoaContextWithOIDC, 
      /* form */ String, 
      /* out */ js.UndefOr[ErrorOut], 
      /* err */ js.UndefOr[OIDCProviderError | js.Error], 
      CanBePromise[js.UndefOr[Unit]]
    ]
  ] = js.undefined
}
object Charset {
  
  inline def apply(): Charset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Charset]
  }
  
  extension [Self <: Charset](x: Self) {
    
    inline def setCharset(value: `base-20` | digits): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    inline def setDeviceInfo(value: /* ctx */ KoaContextWithOIDC => UnknownObject): Self = StObject.set(x, "deviceInfo", js.Any.fromFunction1(value))
    
    inline def setDeviceInfoUndefined: Self = StObject.set(x, "deviceInfo", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setSuccessSource(value: /* ctx */ KoaContextWithOIDC => CanBePromise[js.UndefOr[Unit]]): Self = StObject.set(x, "successSource", js.Any.fromFunction1(value))
    
    inline def setSuccessSourceUndefined: Self = StObject.set(x, "successSource", js.undefined)
    
    inline def setUserCodeConfirmSource(
      value: (/* ctx */ KoaContextWithOIDC, /* form */ String, /* client */ typings.oidcProvider.mod.Client, /* deviceInfo */ UnknownObject, /* userCode */ String) => CanBePromise[js.UndefOr[Unit]]
    ): Self = StObject.set(x, "userCodeConfirmSource", js.Any.fromFunction5(value))
    
    inline def setUserCodeConfirmSourceUndefined: Self = StObject.set(x, "userCodeConfirmSource", js.undefined)
    
    inline def setUserCodeInputSource(
      value: (/* ctx */ KoaContextWithOIDC, /* form */ String, /* out */ js.UndefOr[ErrorOut], /* err */ js.UndefOr[OIDCProviderError | js.Error]) => CanBePromise[js.UndefOr[Unit]]
    ): Self = StObject.set(x, "userCodeInputSource", js.Any.fromFunction4(value))
    
    inline def setUserCodeInputSourceUndefined: Self = StObject.set(x, "userCodeInputSource", js.undefined)
  }
}
