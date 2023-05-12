package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryIncludesparents extends StObject {
  
  /**
    * Get all repository rulesets
    * @description Get all the rulesets for a repository.
    */
  var get: ParametersQueryIncludesparents
  
  /**
    * Create a repository ruleset
    * @description Create a ruleset for a repository.
    */
  var post: RequestBodyContentApplicationjsonBypassmode
}
object GetParametersQueryIncludesparents {
  
  inline def apply(get: ParametersQueryIncludesparents, post: RequestBodyContentApplicationjsonBypassmode): GetParametersQueryIncludesparents = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryIncludesparents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryIncludesparents] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryIncludesparents): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonBypassmode): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
