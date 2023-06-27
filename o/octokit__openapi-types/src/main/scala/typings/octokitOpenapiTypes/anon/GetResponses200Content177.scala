package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content177 extends StObject {
  
  /**
    * Get GitHub Actions permissions for a repository
    * @description Gets the GitHub Actions permissions policy for a repository, including whether GitHub Actions is enabled and the actions and reusable workflows allowed to run in the repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  var get: Responses200Content177
  
  /**
    * Set GitHub Actions permissions for a repository
    * @description Sets the GitHub Actions permissions policy for enabling GitHub Actions and allowed actions and reusable workflows in the repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  var put: RequestBodyContentApplicationjsonEnabled
}
object GetResponses200Content177 {
  
  inline def apply(get: Responses200Content177, put: RequestBodyContentApplicationjsonEnabled): GetResponses200Content177 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content177]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content177] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content177): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonEnabled): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
