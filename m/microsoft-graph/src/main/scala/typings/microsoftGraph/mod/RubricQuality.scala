package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RubricQuality extends StObject {
  
  // The collection of criteria for this rubric quality.
  var criteria: js.UndefOr[NullableOption[js.Array[RubricCriterion]]] = js.undefined
  
  // The description of this rubric quality.
  var description: js.UndefOr[NullableOption[EducationItemBody]] = js.undefined
  
  // The name of this rubric quality.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The ID of this resource.
  var qualityId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // If present, a numerical weight for this quality. Weights must add up to 100.
  var weight: js.UndefOr[NullableOption[Double]] = js.undefined
}
object RubricQuality {
  
  inline def apply(): RubricQuality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RubricQuality]
  }
  
  extension [Self <: RubricQuality](x: Self) {
    
    inline def setCriteria(value: NullableOption[js.Array[RubricCriterion]]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaNull: Self = StObject.set(x, "criteria", null)
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setCriteriaVarargs(value: RubricCriterion*): Self = StObject.set(x, "criteria", js.Array(value*))
    
    inline def setDescription(value: NullableOption[EducationItemBody]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setQualityId(value: NullableOption[String]): Self = StObject.set(x, "qualityId", value.asInstanceOf[js.Any])
    
    inline def setQualityIdNull: Self = StObject.set(x, "qualityId", null)
    
    inline def setQualityIdUndefined: Self = StObject.set(x, "qualityId", js.undefined)
    
    inline def setWeight(value: NullableOption[Double]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightNull: Self = StObject.set(x, "weight", null)
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
