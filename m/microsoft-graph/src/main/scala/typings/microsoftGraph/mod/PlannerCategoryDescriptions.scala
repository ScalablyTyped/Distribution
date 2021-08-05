package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerCategoryDescriptions extends StObject {
  
  // The label associated with Category 1
  var category1: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The label associated with Category 2
  var category2: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The label associated with Category 3
  var category3: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The label associated with Category 4
  var category4: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The label associated with Category 5
  var category5: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The label associated with Category 6
  var category6: js.UndefOr[NullableOption[String]] = js.undefined
}
object PlannerCategoryDescriptions {
  
  inline def apply(): PlannerCategoryDescriptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerCategoryDescriptions]
  }
  
  extension [Self <: PlannerCategoryDescriptions](x: Self) {
    
    inline def setCategory1(value: NullableOption[String]): Self = StObject.set(x, "category1", value.asInstanceOf[js.Any])
    
    inline def setCategory1Null: Self = StObject.set(x, "category1", null)
    
    inline def setCategory1Undefined: Self = StObject.set(x, "category1", js.undefined)
    
    inline def setCategory2(value: NullableOption[String]): Self = StObject.set(x, "category2", value.asInstanceOf[js.Any])
    
    inline def setCategory2Null: Self = StObject.set(x, "category2", null)
    
    inline def setCategory2Undefined: Self = StObject.set(x, "category2", js.undefined)
    
    inline def setCategory3(value: NullableOption[String]): Self = StObject.set(x, "category3", value.asInstanceOf[js.Any])
    
    inline def setCategory3Null: Self = StObject.set(x, "category3", null)
    
    inline def setCategory3Undefined: Self = StObject.set(x, "category3", js.undefined)
    
    inline def setCategory4(value: NullableOption[String]): Self = StObject.set(x, "category4", value.asInstanceOf[js.Any])
    
    inline def setCategory4Null: Self = StObject.set(x, "category4", null)
    
    inline def setCategory4Undefined: Self = StObject.set(x, "category4", js.undefined)
    
    inline def setCategory5(value: NullableOption[String]): Self = StObject.set(x, "category5", value.asInstanceOf[js.Any])
    
    inline def setCategory5Null: Self = StObject.set(x, "category5", null)
    
    inline def setCategory5Undefined: Self = StObject.set(x, "category5", js.undefined)
    
    inline def setCategory6(value: NullableOption[String]): Self = StObject.set(x, "category6", value.asInstanceOf[js.Any])
    
    inline def setCategory6Null: Self = StObject.set(x, "category6", null)
    
    inline def setCategory6Undefined: Self = StObject.set(x, "category6", js.undefined)
  }
}
