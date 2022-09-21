package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.APPROVE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COMMENT
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.REQUEST_CHANGES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comments extends StObject {
  
  /** @description **Required** when using `REQUEST_CHANGES` or `COMMENT` for the `event` parameter. The body text of the pull request review. */
  var body: js.UndefOr[String] = js.undefined
  
  /** @description Use the following table to specify the location, destination, and contents of the draft review comment. */
  var comments: js.UndefOr[js.Array[Side]] = js.undefined
  
  /** @description The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment outdated if a subsequent commit modifies the line you specify as the `position`. Defaults to the most recent commit in the pull request when you do not specify a value. */
  var commit_id: js.UndefOr[String] = js.undefined
  
  /**
    * @description The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull request review](https://docs.github.com/rest/pulls#submit-a-review-for-a-pull-request) when you are ready.
    * @enum {string}
    */
  var event: js.UndefOr[APPROVE | REQUEST_CHANGES | COMMENT] = js.undefined
}
object Comments {
  
  inline def apply(): Comments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comments]
  }
  
  extension [Self <: Comments](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setComments(value: js.Array[Side]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: Side*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
    
    inline def setCommit_idUndefined: Self = StObject.set(x, "commit_id", js.undefined)
    
    inline def setEvent(value: APPROVE | REQUEST_CHANGES | COMMENT): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
