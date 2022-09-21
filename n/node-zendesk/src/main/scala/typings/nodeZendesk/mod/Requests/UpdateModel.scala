package typings.nodeZendesk.mod.Requests

import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#update-request|Zendesk Requests Update}
  */
trait UpdateModel extends StObject {
  
  var additional_collaborators: js.UndefOr[js.Array[Collaborator | String | ZendeskID]] = js.undefined
  
  var comment: js.UndefOr[typings.nodeZendesk.mod.Requests.Comments.CreateModel] = js.undefined
  
  var solved: js.UndefOr[Boolean] = js.undefined
}
object UpdateModel {
  
  inline def apply(): UpdateModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateModel]
  }
  
  extension [Self <: UpdateModel](x: Self) {
    
    inline def setAdditional_collaborators(value: js.Array[Collaborator | String | ZendeskID]): Self = StObject.set(x, "additional_collaborators", value.asInstanceOf[js.Any])
    
    inline def setAdditional_collaboratorsUndefined: Self = StObject.set(x, "additional_collaborators", js.undefined)
    
    inline def setAdditional_collaboratorsVarargs(value: (Collaborator | String | ZendeskID)*): Self = StObject.set(x, "additional_collaborators", js.Array(value*))
    
    inline def setComment(value: typings.nodeZendesk.mod.Requests.Comments.CreateModel): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setSolved(value: Boolean): Self = StObject.set(x, "solved", value.asInstanceOf[js.Any])
    
    inline def setSolvedUndefined: Self = StObject.set(x, "solved", js.undefined)
  }
}
