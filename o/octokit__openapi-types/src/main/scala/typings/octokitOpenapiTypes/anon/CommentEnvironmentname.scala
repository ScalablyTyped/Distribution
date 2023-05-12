package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentEnvironmentname extends StObject {
  
  /** @description Comment associated with the pending deployment protection rule. **Required when state is not provided.** */
  var comment: String
  
  /** @description The name of the environment to approve or reject. */
  var environment_name: String
}
object CommentEnvironmentname {
  
  inline def apply(comment: String, environment_name: String): CommentEnvironmentname = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], environment_name = environment_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentEnvironmentname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentEnvironmentname] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_name(value: String): Self = StObject.set(x, "environment_name", value.asInstanceOf[js.Any])
  }
}
