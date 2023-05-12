package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.IdentitySet
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionEvent
  extends StObject
     with Entity {
  
  // The user who created the retentionEvent.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The date time when the retentionEvent was created.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Optional information about the event.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the event.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var eventPropagationResults: js.UndefOr[NullableOption[js.Array[EventPropagationResult]]] = js.undefined
  
  /**
    * Represents the workload (SharePoint Online, OneDrive for Business, Exchange Online) and identification information
    * associated with a retention event.
    */
  var eventQueries: js.UndefOr[NullableOption[js.Array[EventQuery]]] = js.undefined
  
  var eventStatus: js.UndefOr[NullableOption[RetentionEventStatus]] = js.undefined
  
  // Optional time when the event should be triggered.
  var eventTriggerDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user who last modified the retentionEvent.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The latest date time when the retentionEvent was modified.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Last time the status of the event was updated.
  var lastStatusUpdateDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies the event that will start the retention period for labels that use this event type when an event is created.
  var retentionEventType: js.UndefOr[NullableOption[RetentionEventType]] = js.undefined
}
object RetentionEvent {
  
  inline def apply(): RetentionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetentionEvent] (val x: Self) extends AnyVal {
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEventPropagationResults(value: NullableOption[js.Array[EventPropagationResult]]): Self = StObject.set(x, "eventPropagationResults", value.asInstanceOf[js.Any])
    
    inline def setEventPropagationResultsNull: Self = StObject.set(x, "eventPropagationResults", null)
    
    inline def setEventPropagationResultsUndefined: Self = StObject.set(x, "eventPropagationResults", js.undefined)
    
    inline def setEventPropagationResultsVarargs(value: EventPropagationResult*): Self = StObject.set(x, "eventPropagationResults", js.Array(value*))
    
    inline def setEventQueries(value: NullableOption[js.Array[EventQuery]]): Self = StObject.set(x, "eventQueries", value.asInstanceOf[js.Any])
    
    inline def setEventQueriesNull: Self = StObject.set(x, "eventQueries", null)
    
    inline def setEventQueriesUndefined: Self = StObject.set(x, "eventQueries", js.undefined)
    
    inline def setEventQueriesVarargs(value: EventQuery*): Self = StObject.set(x, "eventQueries", js.Array(value*))
    
    inline def setEventStatus(value: NullableOption[RetentionEventStatus]): Self = StObject.set(x, "eventStatus", value.asInstanceOf[js.Any])
    
    inline def setEventStatusNull: Self = StObject.set(x, "eventStatus", null)
    
    inline def setEventStatusUndefined: Self = StObject.set(x, "eventStatus", js.undefined)
    
    inline def setEventTriggerDateTime(value: NullableOption[String]): Self = StObject.set(x, "eventTriggerDateTime", value.asInstanceOf[js.Any])
    
    inline def setEventTriggerDateTimeNull: Self = StObject.set(x, "eventTriggerDateTime", null)
    
    inline def setEventTriggerDateTimeUndefined: Self = StObject.set(x, "eventTriggerDateTime", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setLastStatusUpdateDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastStatusUpdateDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastStatusUpdateDateTimeNull: Self = StObject.set(x, "lastStatusUpdateDateTime", null)
    
    inline def setLastStatusUpdateDateTimeUndefined: Self = StObject.set(x, "lastStatusUpdateDateTime", js.undefined)
    
    inline def setRetentionEventType(value: NullableOption[RetentionEventType]): Self = StObject.set(x, "retentionEventType", value.asInstanceOf[js.Any])
    
    inline def setRetentionEventTypeNull: Self = StObject.set(x, "retentionEventType", null)
    
    inline def setRetentionEventTypeUndefined: Self = StObject.set(x, "retentionEventType", js.undefined)
  }
}
