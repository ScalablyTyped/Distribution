package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RubricCriterion extends StObject {
  
  // The description of this criterion.
  var description: js.UndefOr[NullableOption[EducationItemBody]] = js.undefined
}
object RubricCriterion {
  
  inline def apply(): RubricCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RubricCriterion]
  }
  
  extension [Self <: RubricCriterion](x: Self) {
    
    inline def setDescription(value: NullableOption[EducationItemBody]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
