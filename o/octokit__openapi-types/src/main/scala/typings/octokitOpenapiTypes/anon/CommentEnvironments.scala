package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.approved
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentEnvironments extends StObject {
  
  /**
    * @description The comment submitted with the deployment review
    * @example Ship it!
    */
  var comment: String
  
  /** @description The list of environments that were approved or rejected */
  var environments: js.Array[CreatedatHtmlurl]
  
  /**
    * @description Whether deployment to the environment(s) was approved or rejected or pending (with comments)
    * @example approved
    * @enum {string}
    */
  var state: approved | rejected | pending
  
  var user: Avatarurl
}
object CommentEnvironments {
  
  inline def apply(
    comment: String,
    environments: js.Array[CreatedatHtmlurl],
    state: approved | rejected | pending,
    user: Avatarurl
  ): CommentEnvironments = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentEnvironments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentEnvironments] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setEnvironments(value: js.Array[CreatedatHtmlurl]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsVarargs(value: CreatedatHtmlurl*): Self = StObject.set(x, "environments", js.Array(value*))
    
    inline def setState(value: approved | rejected | pending): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
