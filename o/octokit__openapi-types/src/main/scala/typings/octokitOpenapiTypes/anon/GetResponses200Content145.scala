package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content145 extends StObject {
  
  /**
    * Gets the level of access that workflows outside of the repository have to actions and reusable workflows in the repository.
    * This endpoint only applies to internal repositories. For more information, see "[Managing GitHub Actions settings for a repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#allowing-access-to-components-in-an-internal-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the
    * repository `administration` permission to use this endpoint.
    */
  var get: Responses200Content145
  
  /**
    * Sets the level of access that workflows outside of the repository have to actions and reusable workflows in the repository.
    * This endpoint only applies to internal repositories. For more information, see "[Managing GitHub Actions settings for a repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#allowing-access-to-components-in-an-internal-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the
    * repository `administration` permission to use this endpoint.
    */
  var put: RequestBodyContent145
}
object GetResponses200Content145 {
  
  inline def apply(get: Responses200Content145, put: RequestBodyContent145): GetResponses200Content145 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content145]
  }
  
  extension [Self <: GetResponses200Content145](x: Self) {
    
    inline def setGet(value: Responses200Content145): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent145): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
