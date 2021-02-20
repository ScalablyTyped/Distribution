package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceEnrollmentConfiguration extends Entity {
  
  // The list of group assignments for the device configuration profile.
  var assignments: js.UndefOr[NullableOption[js.Array[EnrollmentConfigurationAssignment]]] = js.native
  
  // Not yet documented
  var createdDateTime: js.UndefOr[String] = js.native
  
  // Not yet documented
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Not yet documented
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Not yet documented
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  // Not yet documented
  var priority: js.UndefOr[Double] = js.native
  
  // Not yet documented
  var version: js.UndefOr[Double] = js.native
}
object DeviceEnrollmentConfiguration {
  
  @scala.inline
  def apply(): DeviceEnrollmentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentConfiguration]
  }
  
  @scala.inline
  implicit class DeviceEnrollmentConfigurationMutableBuilder[Self <: DeviceEnrollmentConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignments(value: NullableOption[js.Array[EnrollmentConfigurationAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    @scala.inline
    def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsVarargs(value: EnrollmentConfigurationAssignment*): Self = StObject.set(x, "assignments", js.Array(value :_*))
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
