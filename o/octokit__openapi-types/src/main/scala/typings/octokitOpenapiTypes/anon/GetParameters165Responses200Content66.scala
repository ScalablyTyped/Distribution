package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters165Responses200Content66 extends StObject {
  
  /**
    * Get default workflow permissions for a repository
    * @description Gets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in a repository,
    * as well as if GitHub Actions can submit approving pull request reviews.
    * For more information, see "[Setting the permissions of the GITHUB_TOKEN for your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#setting-the-permissions-of-the-github_token-for-your-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the repository `administration` permission to use this API.
    */
  var get: Parameters165Responses200Content66
  
  /**
    * Set default workflow permissions for a repository
    * @description Sets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in a repository, and sets if GitHub Actions
    * can submit approving pull request reviews.
    * For more information, see "[Setting the permissions of the GITHUB_TOKEN for your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#setting-the-permissions-of-the-github_token-for-your-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the repository `administration` permission to use this API.
    */
  var put: RequestBodyContent67
}
object GetParameters165Responses200Content66 {
  
  inline def apply(get: Parameters165Responses200Content66, put: RequestBodyContent67): GetParameters165Responses200Content66 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters165Responses200Content66]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters165Responses200Content66] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters165Responses200Content66): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent67): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
