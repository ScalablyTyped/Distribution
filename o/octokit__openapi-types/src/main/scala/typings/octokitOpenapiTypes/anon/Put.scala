package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Put extends StObject {
  
  /**
    * Unsuspend an app installation
    * @description Removes a GitHub App installation suspension.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var delete: Responses9
  
  /**
    * Suspend an app installation
    * @description Suspends a GitHub App on a user, organization, or business account, which blocks the app from accessing the account's resources. When a GitHub App is suspended, the app's access to the GitHub API or webhook events is blocked for that account.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var put: Responses9
}
object Put {
  
  inline def apply(delete: Responses9, put: Responses9): Put = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[Put]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Put] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses9): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses9): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
