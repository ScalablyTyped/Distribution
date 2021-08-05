package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertHistoryState extends StObject {
  
  var appId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var assignedTo: js.UndefOr[NullableOption[String]] = js.undefined
  
  var comments: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var feedback: js.UndefOr[NullableOption[AlertFeedback]] = js.undefined
  
  var status: js.UndefOr[NullableOption[AlertStatus]] = js.undefined
  
  var updatedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var user: js.UndefOr[NullableOption[String]] = js.undefined
}
object AlertHistoryState {
  
  inline def apply(): AlertHistoryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertHistoryState]
  }
  
  extension [Self <: AlertHistoryState](x: Self) {
    
    inline def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAssignedTo(value: NullableOption[String]): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    inline def setAssignedToNull: Self = StObject.set(x, "assignedTo", null)
    
    inline def setAssignedToUndefined: Self = StObject.set(x, "assignedTo", js.undefined)
    
    inline def setComments(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: String*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setFeedback(value: NullableOption[AlertFeedback]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackNull: Self = StObject.set(x, "feedback", null)
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    inline def setStatus(value: NullableOption[AlertStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "updatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDateTimeNull: Self = StObject.set(x, "updatedDateTime", null)
    
    inline def setUpdatedDateTimeUndefined: Self = StObject.set(x, "updatedDateTime", js.undefined)
    
    inline def setUser(value: NullableOption[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
