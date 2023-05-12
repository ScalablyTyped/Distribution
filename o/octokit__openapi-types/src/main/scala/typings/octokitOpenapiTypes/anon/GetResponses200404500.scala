package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200404500 extends StObject {
  
  /**
    * Get all organization repository rulesets
    * @description Get all the repository rulesets for an organization.
    */
  var get: Responses200404500
  
  /**
    * Create an organization repository ruleset
    * @description Create a repository ruleset for an organization.
    */
  var post: RequestBodyContentApplicationjsonBypassactors
}
object GetResponses200404500 {
  
  inline def apply(get: Responses200404500, post: RequestBodyContentApplicationjsonBypassactors): GetResponses200404500 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200404500]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200404500] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200404500): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonBypassactors): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
