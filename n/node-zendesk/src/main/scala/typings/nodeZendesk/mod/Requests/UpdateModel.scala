package typings.nodeZendesk.mod.Requests

import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#update-request|Zendesk Requests Update}
  */
@js.native
trait UpdateModel extends StObject {
  
  var additional_collaborators: js.UndefOr[js.Array[Collaborator | String | ZendeskID]] = js.native
  
  var comment: js.UndefOr[typings.nodeZendesk.mod.Requests.Comments.CreateModel] = js.native
  
  var solved: js.UndefOr[Boolean] = js.native
}
object UpdateModel {
  
  @scala.inline
  def apply(): UpdateModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateModel]
  }
  
  @scala.inline
  implicit class UpdateModelMutableBuilder[Self <: UpdateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditional_collaborators(value: js.Array[Collaborator | String | ZendeskID]): Self = StObject.set(x, "additional_collaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditional_collaboratorsUndefined: Self = StObject.set(x, "additional_collaborators", js.undefined)
    
    @scala.inline
    def setAdditional_collaboratorsVarargs(value: (Collaborator | String | ZendeskID)*): Self = StObject.set(x, "additional_collaborators", js.Array(value :_*))
    
    @scala.inline
    def setComment(value: typings.nodeZendesk.mod.Requests.Comments.CreateModel): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setSolved(value: Boolean): Self = StObject.set(x, "solved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolvedUndefined: Self = StObject.set(x, "solved", js.undefined)
  }
}
