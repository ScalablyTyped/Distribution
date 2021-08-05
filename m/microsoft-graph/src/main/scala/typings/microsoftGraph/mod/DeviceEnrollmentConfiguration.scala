package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceEnrollmentConfiguration
  extends StObject
     with Entity {
  
  // The list of group assignments for the device configuration profile.
  var assignments: js.UndefOr[NullableOption[js.Array[EnrollmentConfigurationAssignment]]] = js.undefined
  
  // Not yet documented
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // Not yet documented
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Not yet documented
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Not yet documented
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // Not yet documented
  var priority: js.UndefOr[Double] = js.undefined
  
  // Not yet documented
  var version: js.UndefOr[Double] = js.undefined
}
object DeviceEnrollmentConfiguration {
  
  inline def apply(): DeviceEnrollmentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentConfiguration]
  }
  
  extension [Self <: DeviceEnrollmentConfiguration](x: Self) {
    
    inline def setAssignments(value: NullableOption[js.Array[EnrollmentConfigurationAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: EnrollmentConfigurationAssignment*): Self = StObject.set(x, "assignments", js.Array(value :_*))
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
