package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertHistoryState extends StObject {
  
  var appId: js.UndefOr[NullableOption[String]] = js.native
  
  var assignedTo: js.UndefOr[NullableOption[String]] = js.native
  
  var comments: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  var feedback: js.UndefOr[NullableOption[AlertFeedback]] = js.native
  
  var status: js.UndefOr[NullableOption[AlertStatus]] = js.native
  
  var updatedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  var user: js.UndefOr[NullableOption[String]] = js.native
}
object AlertHistoryState {
  
  @scala.inline
  def apply(): AlertHistoryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertHistoryState]
  }
  
  @scala.inline
  implicit class AlertHistoryStateMutableBuilder[Self <: AlertHistoryState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setAssignedTo(value: NullableOption[String]): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedToNull: Self = StObject.set(x, "assignedTo", null)
    
    @scala.inline
    def setAssignedToUndefined: Self = StObject.set(x, "assignedTo", js.undefined)
    
    @scala.inline
    def setComments(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: String*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setFeedback(value: NullableOption[AlertFeedback]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackNull: Self = StObject.set(x, "feedback", null)
    
    @scala.inline
    def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    @scala.inline
    def setStatus(value: NullableOption[AlertStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUpdatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "updatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDateTimeNull: Self = StObject.set(x, "updatedDateTime", null)
    
    @scala.inline
    def setUpdatedDateTimeUndefined: Self = StObject.set(x, "updatedDateTime", js.undefined)
    
    @scala.inline
    def setUser(value: NullableOption[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNull: Self = StObject.set(x, "user", null)
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
