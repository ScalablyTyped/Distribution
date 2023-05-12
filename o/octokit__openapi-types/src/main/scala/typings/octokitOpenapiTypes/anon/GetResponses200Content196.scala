package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content196 extends StObject {
  
  /**
    * Get a code scanning default setup configuration
    * @description Gets a code scanning default setup configuration.
    * You must use an access token with the `repo` scope to use this endpoint with private repos or the `public_repo`
    * scope for public repos. GitHub Apps must have the `repo` write permission to use this endpoint.
    */
  var get: Responses200Content196
  
  /**
    * Update a code scanning default setup configuration
    * @description Updates a code scanning default setup configuration.
    * You must use an access token with the `repo` scope to use this endpoint with private repos or the `public_repo`
    * scope for public repos. GitHub Apps must have the `repo` write permission to use this endpoint.
    */
  var patch: RequestBodyContent197
}
object GetResponses200Content196 {
  
  inline def apply(get: Responses200Content196, patch: RequestBodyContent197): GetResponses200Content196 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content196]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content196] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content196): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContent197): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
