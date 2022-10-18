package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Patch extends StObject {
  
  /**
    * Returns the webhook configuration for a GitHub App. For more information about configuring a webhook for your app, see "[Creating a GitHub App](/developers/apps/creating-a-github-app)."
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: Responses200Content229
  
  /**
    * Updates the webhook configuration for a GitHub App. For more information about configuring a webhook for your app, see "[Creating a GitHub App](/developers/apps/creating-a-github-app)."
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var patch: RequestBodyContentApplicationjsonSecret
}
object Patch {
  
  inline def apply(get: Responses200Content229, patch: RequestBodyContentApplicationjsonSecret): Patch = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patch]
  }
  
  extension [Self <: Patch](x: Self) {
    
    inline def setGet(value: Responses200Content229): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonSecret): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
