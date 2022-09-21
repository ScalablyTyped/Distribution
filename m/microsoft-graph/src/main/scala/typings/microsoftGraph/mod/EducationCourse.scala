package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationCourse extends StObject {
  
  // Unique identifier for the course.
  var courseNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Description of the course.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the course.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // ID of the course from the syncing system.
  var externalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Subject of the course.
  var subject: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationCourse {
  
  inline def apply(): EducationCourse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationCourse]
  }
  
  extension [Self <: EducationCourse](x: Self) {
    
    inline def setCourseNumber(value: NullableOption[String]): Self = StObject.set(x, "courseNumber", value.asInstanceOf[js.Any])
    
    inline def setCourseNumberNull: Self = StObject.set(x, "courseNumber", null)
    
    inline def setCourseNumberUndefined: Self = StObject.set(x, "courseNumber", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setSubject(value: NullableOption[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
