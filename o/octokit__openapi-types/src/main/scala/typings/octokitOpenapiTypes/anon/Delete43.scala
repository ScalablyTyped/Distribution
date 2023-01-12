package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete43 extends StObject {
  
  /**
    * Revokes the installation token you're using to authenticate as an installation and access this endpoint.
    *
    * Once an installation token is revoked, the token is invalidated and cannot be used. Other endpoints that require the revoked installation token must have a new installation token to work. You can create a new token using the "[Create an installation access token for an app](https://docs.github.com/rest/reference/apps#create-an-installation-access-token-for-an-app)" endpoint.
    *
    * You must use an [installation access token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  var delete: `43`
}
object Delete43 {
  
  inline def apply(delete: `43`): Delete43 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete43]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delete43] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: `43`): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
