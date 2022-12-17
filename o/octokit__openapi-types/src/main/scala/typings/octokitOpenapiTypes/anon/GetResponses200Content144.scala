package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content144 extends StObject {
  
  /**
    * Gets the GitHub Actions permissions policy for a repository, including whether GitHub Actions is enabled and the actions and reusable workflows allowed to run in the repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  var get: Responses200Content144
  
  /**
    * Sets the GitHub Actions permissions policy for enabling GitHub Actions and allowed actions and reusable workflows in the repository.
    *
    * If the repository belongs to an organization or enterprise that has set restrictive permissions at the organization or enterprise levels, such as `allowed_actions` to `selected` actions and reusable workflows, then you cannot override them for the repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  var put: RequestBodyContentApplicationjsonEnabled
}
object GetResponses200Content144 {
  
  inline def apply(get: Responses200Content144, put: RequestBodyContentApplicationjsonEnabled): GetResponses200Content144 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content144]
  }
  
  extension [Self <: GetResponses200Content144](x: Self) {
    
    inline def setGet(value: Responses200Content144): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonEnabled): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
