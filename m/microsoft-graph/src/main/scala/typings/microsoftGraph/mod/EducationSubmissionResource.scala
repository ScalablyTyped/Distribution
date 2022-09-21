package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationSubmissionResource
  extends StObject
     with Entity {
  
  // Pointer to the assignment from which this resource was copied. If this is null, the student uploaded the resource.
  var assignmentResourceUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Resource object.
  var resource: js.UndefOr[NullableOption[EducationResource]] = js.undefined
}
object EducationSubmissionResource {
  
  inline def apply(): EducationSubmissionResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationSubmissionResource]
  }
  
  extension [Self <: EducationSubmissionResource](x: Self) {
    
    inline def setAssignmentResourceUrl(value: NullableOption[String]): Self = StObject.set(x, "assignmentResourceUrl", value.asInstanceOf[js.Any])
    
    inline def setAssignmentResourceUrlNull: Self = StObject.set(x, "assignmentResourceUrl", null)
    
    inline def setAssignmentResourceUrlUndefined: Self = StObject.set(x, "assignmentResourceUrl", js.undefined)
    
    inline def setResource(value: NullableOption[EducationResource]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
