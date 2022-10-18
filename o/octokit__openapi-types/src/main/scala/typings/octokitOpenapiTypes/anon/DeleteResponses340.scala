package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses340 extends StObject {
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Delete a team](https://docs.github.com/rest/reference/teams#delete-a-team) endpoint.
    *
    * To delete a team, the authenticated user must be an organization owner or team maintainer.
    *
    * If you are an organization owner, deleting a parent team will delete all of its child teams as well.
    */
  var delete: Responses340
  
  /** **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the [Get a team by name](https://docs.github.com/rest/reference/teams#get-a-team-by-name) endpoint. */
  var get: ParametersPath607
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Update a team](https://docs.github.com/rest/reference/teams#update-a-team) endpoint.
    *
    * To edit a team, the authenticated user must either be an organization owner or a team maintainer.
    *
    * **Note:** With nested teams, the `privacy` for parent teams cannot be `secret`.
    */
  var patch: ParametersPath607RequestBodyContentApplicationjsonNameParentteamid
}
object DeleteResponses340 {
  
  inline def apply(
    delete: Responses340,
    get: ParametersPath607,
    patch: ParametersPath607RequestBodyContentApplicationjsonNameParentteamid
  ): DeleteResponses340 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses340]
  }
  
  extension [Self <: DeleteResponses340](x: Self) {
    
    inline def setDelete(value: Responses340): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath607): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: ParametersPath607RequestBodyContentApplicationjsonNameParentteamid): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
