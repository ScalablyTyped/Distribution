package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath154Query extends StObject {
  
  /**
    * List project cards
    * @description Lists the project cards in a project.
    */
  var get: ParametersPath154Query
  
  /** Create a project card */
  var post: RequestBodyContentApplicationjsonOneOf
}
object GetParametersPath154Query {
  
  inline def apply(get: ParametersPath154Query, post: RequestBodyContentApplicationjsonOneOf): GetParametersPath154Query = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath154Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath154Query] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath154Query): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonOneOf): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
