package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceEnrollmentConfiguration
  extends StObject
     with Entity {
  
  // The list of group assignments for the device configuration profile
  var assignments: js.UndefOr[NullableOption[js.Array[EnrollmentConfigurationAssignment]]] = js.undefined
  
  // Created date time in UTC of the device enrollment configuration
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // The description of the device enrollment configuration
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the device enrollment configuration
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Last modified date time in UTC of the device enrollment configuration
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject
    * only to the configuration with the lowest priority value.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  // The version of the device enrollment configuration
  var version: js.UndefOr[Double] = js.undefined
}
object DeviceEnrollmentConfiguration {
  
  inline def apply(): DeviceEnrollmentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceEnrollmentConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAssignments(value: NullableOption[js.Array[EnrollmentConfigurationAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: EnrollmentConfigurationAssignment*): Self = StObject.set(x, "assignments", js.Array(value*))
    
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
