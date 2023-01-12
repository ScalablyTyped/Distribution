package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.AuditableModel
import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Metrics {
  
  trait ListPayload extends StObject {
    
    val ticket_metrics: js.Array[typings.nodeZendesk.mod.Tickets.Metrics.ResponseModel]
  }
  object ListPayload {
    
    inline def apply(ticket_metrics: js.Array[typings.nodeZendesk.mod.Tickets.Metrics.ResponseModel]): typings.nodeZendesk.mod.Tickets.Metrics.ListPayload = {
      val __obj = js.Dynamic.literal(ticket_metrics = ticket_metrics.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Tickets.Metrics.ListPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.nodeZendesk.mod.Tickets.Metrics.ListPayload] (val x: Self) extends AnyVal {
      
      inline def setTicket_metrics(value: js.Array[typings.nodeZendesk.mod.Tickets.Metrics.ResponseModel]): Self = StObject.set(x, "ticket_metrics", value.asInstanceOf[js.Any])
      
      inline def setTicket_metricsVarargs(value: typings.nodeZendesk.mod.Tickets.Metrics.ResponseModel*): Self = StObject.set(x, "ticket_metrics", js.Array(value*))
    }
  }
  
  trait MinutesObject extends StObject {
    
    var business: Double
    
    var calendar: Double
  }
  object MinutesObject {
    
    inline def apply(business: Double, calendar: Double): MinutesObject = {
      val __obj = js.Dynamic.literal(business = business.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinutesObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinutesObject] (val x: Self) extends AnyVal {
      
      inline def setBusiness(value: Double): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
      
      inline def setCalendar(value: Double): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseModel
    extends StObject
       with AuditableModel {
    
    val agent_wait_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
    
    val assigned_at: js.UndefOr[String | Null] = js.undefined
    
    val assignee_stations: js.UndefOr[Double] = js.undefined
    
    val assignee_updated_at: js.UndefOr[String | Null] = js.undefined
    
    val first_resolution_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
    
    val full_resolution_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
    
    val group_stations: js.UndefOr[Double] = js.undefined
    
    val initially_assigned_at: js.UndefOr[String | Null] = js.undefined
    
    val latest_comment_added_at: js.UndefOr[String | Null] = js.undefined
    
    val reopens: js.UndefOr[Double] = js.undefined
    
    val replies: js.UndefOr[Double] = js.undefined
    
    val reply_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
    
    val requester_updated_at: js.UndefOr[String | Null] = js.undefined
    
    val requester_wait_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
    
    val solved_at: js.UndefOr[String | Null] = js.undefined
    
    val ticket_id: js.UndefOr[ZendeskID] = js.undefined
    
    val url: js.UndefOr[String] = js.undefined
  }
  object ResponseModel {
    
    inline def apply(created_at: String, id: ZendeskID): typings.nodeZendesk.mod.Tickets.Metrics.ResponseModel = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = null)
      __obj.asInstanceOf[typings.nodeZendesk.mod.Tickets.Metrics.ResponseModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.nodeZendesk.mod.Tickets.Metrics.ResponseModel] (val x: Self) extends AnyVal {
      
      inline def setAgent_wait_time_in_minutes(value: MinutesObject): Self = StObject.set(x, "agent_wait_time_in_minutes", value.asInstanceOf[js.Any])
      
      inline def setAgent_wait_time_in_minutesUndefined: Self = StObject.set(x, "agent_wait_time_in_minutes", js.undefined)
      
      inline def setAssigned_at(value: String): Self = StObject.set(x, "assigned_at", value.asInstanceOf[js.Any])
      
      inline def setAssigned_atNull: Self = StObject.set(x, "assigned_at", null)
      
      inline def setAssigned_atUndefined: Self = StObject.set(x, "assigned_at", js.undefined)
      
      inline def setAssignee_stations(value: Double): Self = StObject.set(x, "assignee_stations", value.asInstanceOf[js.Any])
      
      inline def setAssignee_stationsUndefined: Self = StObject.set(x, "assignee_stations", js.undefined)
      
      inline def setAssignee_updated_at(value: String): Self = StObject.set(x, "assignee_updated_at", value.asInstanceOf[js.Any])
      
      inline def setAssignee_updated_atNull: Self = StObject.set(x, "assignee_updated_at", null)
      
      inline def setAssignee_updated_atUndefined: Self = StObject.set(x, "assignee_updated_at", js.undefined)
      
      inline def setFirst_resolution_time_in_minutes(value: MinutesObject): Self = StObject.set(x, "first_resolution_time_in_minutes", value.asInstanceOf[js.Any])
      
      inline def setFirst_resolution_time_in_minutesUndefined: Self = StObject.set(x, "first_resolution_time_in_minutes", js.undefined)
      
      inline def setFull_resolution_time_in_minutes(value: MinutesObject): Self = StObject.set(x, "full_resolution_time_in_minutes", value.asInstanceOf[js.Any])
      
      inline def setFull_resolution_time_in_minutesUndefined: Self = StObject.set(x, "full_resolution_time_in_minutes", js.undefined)
      
      inline def setGroup_stations(value: Double): Self = StObject.set(x, "group_stations", value.asInstanceOf[js.Any])
      
      inline def setGroup_stationsUndefined: Self = StObject.set(x, "group_stations", js.undefined)
      
      inline def setInitially_assigned_at(value: String): Self = StObject.set(x, "initially_assigned_at", value.asInstanceOf[js.Any])
      
      inline def setInitially_assigned_atNull: Self = StObject.set(x, "initially_assigned_at", null)
      
      inline def setInitially_assigned_atUndefined: Self = StObject.set(x, "initially_assigned_at", js.undefined)
      
      inline def setLatest_comment_added_at(value: String): Self = StObject.set(x, "latest_comment_added_at", value.asInstanceOf[js.Any])
      
      inline def setLatest_comment_added_atNull: Self = StObject.set(x, "latest_comment_added_at", null)
      
      inline def setLatest_comment_added_atUndefined: Self = StObject.set(x, "latest_comment_added_at", js.undefined)
      
      inline def setReopens(value: Double): Self = StObject.set(x, "reopens", value.asInstanceOf[js.Any])
      
      inline def setReopensUndefined: Self = StObject.set(x, "reopens", js.undefined)
      
      inline def setReplies(value: Double): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
      
      inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
      
      inline def setReply_time_in_minutes(value: MinutesObject): Self = StObject.set(x, "reply_time_in_minutes", value.asInstanceOf[js.Any])
      
      inline def setReply_time_in_minutesUndefined: Self = StObject.set(x, "reply_time_in_minutes", js.undefined)
      
      inline def setRequester_updated_at(value: String): Self = StObject.set(x, "requester_updated_at", value.asInstanceOf[js.Any])
      
      inline def setRequester_updated_atNull: Self = StObject.set(x, "requester_updated_at", null)
      
      inline def setRequester_updated_atUndefined: Self = StObject.set(x, "requester_updated_at", js.undefined)
      
      inline def setRequester_wait_time_in_minutes(value: MinutesObject): Self = StObject.set(x, "requester_wait_time_in_minutes", value.asInstanceOf[js.Any])
      
      inline def setRequester_wait_time_in_minutesUndefined: Self = StObject.set(x, "requester_wait_time_in_minutes", js.undefined)
      
      inline def setSolved_at(value: String): Self = StObject.set(x, "solved_at", value.asInstanceOf[js.Any])
      
      inline def setSolved_atNull: Self = StObject.set(x, "solved_at", null)
      
      inline def setSolved_atUndefined: Self = StObject.set(x, "solved_at", js.undefined)
      
      inline def setTicket_id(value: ZendeskID): Self = StObject.set(x, "ticket_id", value.asInstanceOf[js.Any])
      
      inline def setTicket_idUndefined: Self = StObject.set(x, "ticket_id", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait ResponsePayload extends StObject {
    
    val ticket_metric: typings.nodeZendesk.mod.Tickets.Metrics.ResponseModel
  }
  object ResponsePayload {
    
    inline def apply(ticket_metric: typings.nodeZendesk.mod.Tickets.Metrics.ResponseModel): typings.nodeZendesk.mod.Tickets.Metrics.ResponsePayload = {
      val __obj = js.Dynamic.literal(ticket_metric = ticket_metric.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Tickets.Metrics.ResponsePayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.nodeZendesk.mod.Tickets.Metrics.ResponsePayload] (val x: Self) extends AnyVal {
      
      inline def setTicket_metric(value: typings.nodeZendesk.mod.Tickets.Metrics.ResponseModel): Self = StObject.set(x, "ticket_metric", value.asInstanceOf[js.Any])
    }
  }
}
