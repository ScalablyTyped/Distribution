package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters144Responses200Content18 extends StObject {
  
  /**
    * Gets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in a repository,
    * as well as if GitHub Actions can submit approving pull request reviews.
    * For more information, see "[Setting the permissions of the GITHUB_TOKEN for your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#setting-the-permissions-of-the-github_token-for-your-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the repository `administration` permission to use this API.
    */
  var get: Parameters144Responses200Content18
  
  /**
    * Sets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in a repository, and sets if GitHub Actions
    * can submit approving pull request reviews.
    * For more information, see "[Setting the permissions of the GITHUB_TOKEN for your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#setting-the-permissions-of-the-github_token-for-your-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the repository `administration` permission to use this API.
    */
  var put: Parameters144RequestBodyContent19
}
object GetParameters144Responses200Content18 {
  
  inline def apply(get: Parameters144Responses200Content18, put: Parameters144RequestBodyContent19): GetParameters144Responses200Content18 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters144Responses200Content18]
  }
  
  extension [Self <: GetParameters144Responses200Content18](x: Self) {
    
    inline def setGet(value: Parameters144Responses200Content18): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters144RequestBodyContent19): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
