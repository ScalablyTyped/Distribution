package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationAssignmentResource
  extends StObject
     with Entity {
  
  // Indicates whether this resource should be copied to each student submission for modification and submission. Required
  var distributeForStudentWork: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Resource object that has been associated with this assignment.
  var resource: js.UndefOr[NullableOption[EducationResource]] = js.undefined
}
object EducationAssignmentResource {
  
  inline def apply(): EducationAssignmentResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationAssignmentResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EducationAssignmentResource] (val x: Self) extends AnyVal {
    
    inline def setDistributeForStudentWork(value: NullableOption[Boolean]): Self = StObject.set(x, "distributeForStudentWork", value.asInstanceOf[js.Any])
    
    inline def setDistributeForStudentWorkNull: Self = StObject.set(x, "distributeForStudentWork", null)
    
    inline def setDistributeForStudentWorkUndefined: Self = StObject.set(x, "distributeForStudentWork", js.undefined)
    
    inline def setResource(value: NullableOption[EducationResource]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
