package typings.oidcProvider.anon

import typings.oidcProvider.mod.CanBePromise
import typings.oidcProvider.mod.IssueRegistrationAccessTokenFunction
import typings.oidcProvider.mod.KoaContextWithOIDC
import typings.oidcProvider.mod.RotateRegistrationAccessTokenFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssueRegistrationAccessToken extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var issueRegistrationAccessToken: js.UndefOr[IssueRegistrationAccessTokenFunction | Boolean] = js.undefined
  
  var rotateRegistrationAccessToken: js.UndefOr[RotateRegistrationAccessTokenFunction | Boolean] = js.undefined
}
object IssueRegistrationAccessToken {
  
  inline def apply(): IssueRegistrationAccessToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssueRegistrationAccessToken]
  }
  
  extension [Self <: IssueRegistrationAccessToken](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIssueRegistrationAccessToken(value: IssueRegistrationAccessTokenFunction | Boolean): Self = StObject.set(x, "issueRegistrationAccessToken", value.asInstanceOf[js.Any])
    
    inline def setIssueRegistrationAccessTokenFunction2(value: (/* ctx */ KoaContextWithOIDC, /* client */ typings.oidcProvider.mod.Client) => Boolean): Self = StObject.set(x, "issueRegistrationAccessToken", js.Any.fromFunction2(value))
    
    inline def setIssueRegistrationAccessTokenUndefined: Self = StObject.set(x, "issueRegistrationAccessToken", js.undefined)
    
    inline def setRotateRegistrationAccessToken(value: RotateRegistrationAccessTokenFunction | Boolean): Self = StObject.set(x, "rotateRegistrationAccessToken", value.asInstanceOf[js.Any])
    
    inline def setRotateRegistrationAccessTokenFunction1(value: /* ctx */ KoaContextWithOIDC => CanBePromise[Boolean]): Self = StObject.set(x, "rotateRegistrationAccessToken", js.Any.fromFunction1(value))
    
    inline def setRotateRegistrationAccessTokenUndefined: Self = StObject.set(x, "rotateRegistrationAccessToken", js.undefined)
  }
}
