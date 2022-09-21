package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookFilterCriteria extends StObject {
  
  var color: js.UndefOr[NullableOption[String]] = js.undefined
  
  var criterion1: js.UndefOr[NullableOption[String]] = js.undefined
  
  var criterion2: js.UndefOr[NullableOption[String]] = js.undefined
  
  var dynamicCriteria: js.UndefOr[String] = js.undefined
  
  var filterOn: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[NullableOption[WorkbookIcon]] = js.undefined
  
  var operator: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[NullableOption[Any]] = js.undefined
}
object WorkbookFilterCriteria {
  
  inline def apply(): WorkbookFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFilterCriteria]
  }
  
  extension [Self <: WorkbookFilterCriteria](x: Self) {
    
    inline def setColor(value: NullableOption[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCriterion1(value: NullableOption[String]): Self = StObject.set(x, "criterion1", value.asInstanceOf[js.Any])
    
    inline def setCriterion1Null: Self = StObject.set(x, "criterion1", null)
    
    inline def setCriterion1Undefined: Self = StObject.set(x, "criterion1", js.undefined)
    
    inline def setCriterion2(value: NullableOption[String]): Self = StObject.set(x, "criterion2", value.asInstanceOf[js.Any])
    
    inline def setCriterion2Null: Self = StObject.set(x, "criterion2", null)
    
    inline def setCriterion2Undefined: Self = StObject.set(x, "criterion2", js.undefined)
    
    inline def setDynamicCriteria(value: String): Self = StObject.set(x, "dynamicCriteria", value.asInstanceOf[js.Any])
    
    inline def setDynamicCriteriaUndefined: Self = StObject.set(x, "dynamicCriteria", js.undefined)
    
    inline def setFilterOn(value: String): Self = StObject.set(x, "filterOn", value.asInstanceOf[js.Any])
    
    inline def setFilterOnUndefined: Self = StObject.set(x, "filterOn", js.undefined)
    
    inline def setIcon(value: NullableOption[WorkbookIcon]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setValues(value: NullableOption[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
