package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizationJob
  extends StObject
     with Entity {
  
  var schedule: js.UndefOr[NullableOption[SynchronizationSchedule]] = js.undefined
  
  var schema: js.UndefOr[NullableOption[SynchronizationSchema]] = js.undefined
  
  var status: js.UndefOr[NullableOption[SynchronizationStatus]] = js.undefined
  
  var synchronizationJobSettings: js.UndefOr[NullableOption[js.Array[KeyValuePair]]] = js.undefined
  
  var templateId: js.UndefOr[NullableOption[String]] = js.undefined
}
object SynchronizationJob {
  
  inline def apply(): SynchronizationJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizationJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynchronizationJob] (val x: Self) extends AnyVal {
    
    inline def setSchedule(value: NullableOption[SynchronizationSchedule]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleNull: Self = StObject.set(x, "schedule", null)
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setSchema(value: NullableOption[SynchronizationSchema]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaNull: Self = StObject.set(x, "schema", null)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setStatus(value: NullableOption[SynchronizationStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSynchronizationJobSettings(value: NullableOption[js.Array[KeyValuePair]]): Self = StObject.set(x, "synchronizationJobSettings", value.asInstanceOf[js.Any])
    
    inline def setSynchronizationJobSettingsNull: Self = StObject.set(x, "synchronizationJobSettings", null)
    
    inline def setSynchronizationJobSettingsUndefined: Self = StObject.set(x, "synchronizationJobSettings", js.undefined)
    
    inline def setSynchronizationJobSettingsVarargs(value: KeyValuePair*): Self = StObject.set(x, "synchronizationJobSettings", js.Array(value*))
    
    inline def setTemplateId(value: NullableOption[String]): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdNull: Self = StObject.set(x, "templateId", null)
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
