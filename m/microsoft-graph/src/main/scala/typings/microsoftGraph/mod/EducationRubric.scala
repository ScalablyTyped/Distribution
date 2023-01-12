package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationRubric
  extends StObject
     with Entity {
  
  // The user who created this resource.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The description of this rubric.
  var description: js.UndefOr[NullableOption[EducationItemBody]] = js.undefined
  
  // The name of this rubric.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The grading type of this rubric -- null for a no-points rubric, or educationAssignmentPointsGradeType for a points
    * rubric.
    */
  var grading: js.UndefOr[NullableOption[EducationAssignmentGradeType]] = js.undefined
  
  // The last user to modify the resource.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Moment in time when the resource was last modified. The Timestamp type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of levels making up this rubric.
  var levels: js.UndefOr[NullableOption[js.Array[RubricLevel]]] = js.undefined
  
  // The collection of qualities making up this rubric.
  var qualities: js.UndefOr[NullableOption[js.Array[RubricQuality]]] = js.undefined
}
object EducationRubric {
  
  inline def apply(): EducationRubric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationRubric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EducationRubric] (val x: Self) extends AnyVal {
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[EducationItemBody]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGrading(value: NullableOption[EducationAssignmentGradeType]): Self = StObject.set(x, "grading", value.asInstanceOf[js.Any])
    
    inline def setGradingNull: Self = StObject.set(x, "grading", null)
    
    inline def setGradingUndefined: Self = StObject.set(x, "grading", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setLevels(value: NullableOption[js.Array[RubricLevel]]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsNull: Self = StObject.set(x, "levels", null)
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setLevelsVarargs(value: RubricLevel*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setQualities(value: NullableOption[js.Array[RubricQuality]]): Self = StObject.set(x, "qualities", value.asInstanceOf[js.Any])
    
    inline def setQualitiesNull: Self = StObject.set(x, "qualities", null)
    
    inline def setQualitiesUndefined: Self = StObject.set(x, "qualities", js.undefined)
    
    inline def setQualitiesVarargs(value: RubricQuality*): Self = StObject.set(x, "qualities", js.Array(value*))
  }
}
