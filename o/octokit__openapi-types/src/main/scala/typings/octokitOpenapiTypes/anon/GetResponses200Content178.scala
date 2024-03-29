package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content178 extends StObject {
  
  /**
    * Get the level of access for workflows outside of the repository
    * @description Gets the level of access that workflows outside of the repository have to actions and reusable workflows in the repository.
    * This endpoint only applies to private repositories.
    * For more information, see "[Allowing access to components in a private repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#allowing-access-to-components-in-a-private-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the
    * repository `administration` permission to use this endpoint.
    */
  var get: Responses200Content178
  
  /**
    * Set the level of access for workflows outside of the repository
    * @description Sets the level of access that workflows outside of the repository have to actions and reusable workflows in the repository.
    * This endpoint only applies to private repositories.
    * For more information, see "[Allowing access to components in a private repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#allowing-access-to-components-in-a-private-repository)".
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the
    * repository `administration` permission to use this endpoint.
    */
  var put: RequestBodyContent178
}
object GetResponses200Content178 {
  
  inline def apply(get: Responses200Content178, put: RequestBodyContent178): GetResponses200Content178 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content178]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content178] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content178): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent178): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
