package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200122 extends StObject {
  
  /**
    * Deletes a connection between a team and an external group.
    *
    * You can manage team membership with your IdP using Enterprise Managed Users for GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  var delete: ParametersPathTeamslugResponses
  
  /**
    * Lists a connection between a team and an external group.
    *
    * You can manage team membership with your identity provider using Enterprise Managed Users for GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)" in the GitHub Help documentation.
    */
  var get: Responses200122
  
  /**
    * Creates a connection between a team and an external group.  Only one external group can be linked to a team.
    *
    * You can manage team membership with your identity provider using Enterprise Managed Users for GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)" in the GitHub Help documentation.
    */
  var patch: RequestBodyContentApplicationjsonGroupidNumber
}
object GetResponses200122 {
  
  inline def apply(
    delete: ParametersPathTeamslugResponses,
    get: Responses200122,
    patch: RequestBodyContentApplicationjsonGroupidNumber
  ): GetResponses200122 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200122]
  }
  
  extension [Self <: GetResponses200122](x: Self) {
    
    inline def setDelete(value: ParametersPathTeamslugResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200122): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonGroupidNumber): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
