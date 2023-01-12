package typings.oidcProvider.anon

import typings.oidcProvider.mod.CanBePromise
import typings.oidcProvider.mod.KoaContextWithOIDC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogoutSource extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  // tslint:disable-line:void-return
  var logoutSource: js.UndefOr[
    js.Function2[/* ctx */ KoaContextWithOIDC, /* form */ String, CanBePromise[js.UndefOr[Unit]]]
  ] = js.undefined
  
  var postLogoutSuccessSource: js.UndefOr[js.Function1[/* ctx */ KoaContextWithOIDC, CanBePromise[js.UndefOr[Unit]]]] = js.undefined
}
object LogoutSource {
  
  inline def apply(): LogoutSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogoutSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogoutSource] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLogoutSource(value: (/* ctx */ KoaContextWithOIDC, /* form */ String) => CanBePromise[js.UndefOr[Unit]]): Self = StObject.set(x, "logoutSource", js.Any.fromFunction2(value))
    
    inline def setLogoutSourceUndefined: Self = StObject.set(x, "logoutSource", js.undefined)
    
    inline def setPostLogoutSuccessSource(value: /* ctx */ KoaContextWithOIDC => CanBePromise[js.UndefOr[Unit]]): Self = StObject.set(x, "postLogoutSuccessSource", js.Any.fromFunction1(value))
    
    inline def setPostLogoutSuccessSourceUndefined: Self = StObject.set(x, "postLogoutSuccessSource", js.undefined)
  }
}
