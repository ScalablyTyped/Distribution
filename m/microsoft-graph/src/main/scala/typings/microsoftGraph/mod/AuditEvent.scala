package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEvent
  extends StObject
     with Entity {
  
  // Friendly name of the activity.
  var activity: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date time in UTC when the activity was performed.
  var activityDateTime: js.UndefOr[String] = js.undefined
  
  // The HTTP operation type of the activity.
  var activityOperationType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The result of the activity.
  var activityResult: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of activity that was being performed.
  var activityType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // AAD user and application that are associated with the audit event.
  var actor: js.UndefOr[NullableOption[AuditActor]] = js.undefined
  
  // Audit category.
  var category: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Component name.
  var componentName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The client request Id that is used to correlate activity within the system.
  var correlationId: js.UndefOr[String] = js.undefined
  
  // Event display name.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Resources being modified.
  var resources: js.UndefOr[NullableOption[js.Array[AuditResource]]] = js.undefined
}
object AuditEvent {
  
  inline def apply(): AuditEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditEvent] (val x: Self) extends AnyVal {
    
    inline def setActivity(value: NullableOption[String]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityDateTime(value: String): Self = StObject.set(x, "activityDateTime", value.asInstanceOf[js.Any])
    
    inline def setActivityDateTimeUndefined: Self = StObject.set(x, "activityDateTime", js.undefined)
    
    inline def setActivityNull: Self = StObject.set(x, "activity", null)
    
    inline def setActivityOperationType(value: NullableOption[String]): Self = StObject.set(x, "activityOperationType", value.asInstanceOf[js.Any])
    
    inline def setActivityOperationTypeNull: Self = StObject.set(x, "activityOperationType", null)
    
    inline def setActivityOperationTypeUndefined: Self = StObject.set(x, "activityOperationType", js.undefined)
    
    inline def setActivityResult(value: NullableOption[String]): Self = StObject.set(x, "activityResult", value.asInstanceOf[js.Any])
    
    inline def setActivityResultNull: Self = StObject.set(x, "activityResult", null)
    
    inline def setActivityResultUndefined: Self = StObject.set(x, "activityResult", js.undefined)
    
    inline def setActivityType(value: NullableOption[String]): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    inline def setActivityTypeNull: Self = StObject.set(x, "activityType", null)
    
    inline def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setActor(value: NullableOption[AuditActor]): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorNull: Self = StObject.set(x, "actor", null)
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setCategory(value: NullableOption[String]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setComponentName(value: NullableOption[String]): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameNull: Self = StObject.set(x, "componentName", null)
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setResources(value: NullableOption[js.Array[AuditResource]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesNull: Self = StObject.set(x, "resources", null)
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: AuditResource*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
