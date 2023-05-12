package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAppslug extends StObject {
  
  /**
    * Get an app
    * @description **Note**: The `:app_slug` is just the URL-friendly name of your GitHub App. You can find this on the settings page for your GitHub App (e.g., `https://github.com/settings/apps/:app_slug`).
    *
    * If the GitHub App you specify is public, you can access this endpoint without authenticating. If the GitHub App you specify is private, you must authenticate with a [personal access token](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or an [installation access token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  var get: ParametersPathAppslug
}
object GetParametersPathAppslug {
  
  inline def apply(get: ParametersPathAppslug): GetParametersPathAppslug = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAppslug]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathAppslug] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathAppslug): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
