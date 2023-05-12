package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryExclude extends StObject {
  
  /**
    * List organization migrations
    * @description Lists the most recent migrations, including both exports (which can be started through the REST API) and imports (which cannot be started using the REST API).
    *
    * A list of `repositories` is only returned for export migrations.
    */
  var get: ParametersQueryExclude
  
  /**
    * Start an organization migration
    * @description Initiates the generation of a migration archive.
    */
  var post: RequestBodyContentApplicationjsonExcludeattachments
}
object GetParametersQueryExclude {
  
  inline def apply(get: ParametersQueryExclude, post: RequestBodyContentApplicationjsonExcludeattachments): GetParametersQueryExclude = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryExclude]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryExclude] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryExclude): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonExcludeattachments): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
