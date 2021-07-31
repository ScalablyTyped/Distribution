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
  
  var values: js.UndefOr[NullableOption[js.Any]] = js.undefined
}
object WorkbookFilterCriteria {
  
  @scala.inline
  def apply(): WorkbookFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFilterCriteria]
  }
  
  @scala.inline
  implicit class WorkbookFilterCriteriaMutableBuilder[Self <: WorkbookFilterCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: NullableOption[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorNull: Self = StObject.set(x, "color", null)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCriterion1(value: NullableOption[String]): Self = StObject.set(x, "criterion1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriterion1Null: Self = StObject.set(x, "criterion1", null)
    
    @scala.inline
    def setCriterion1Undefined: Self = StObject.set(x, "criterion1", js.undefined)
    
    @scala.inline
    def setCriterion2(value: NullableOption[String]): Self = StObject.set(x, "criterion2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriterion2Null: Self = StObject.set(x, "criterion2", null)
    
    @scala.inline
    def setCriterion2Undefined: Self = StObject.set(x, "criterion2", js.undefined)
    
    @scala.inline
    def setDynamicCriteria(value: String): Self = StObject.set(x, "dynamicCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicCriteriaUndefined: Self = StObject.set(x, "dynamicCriteria", js.undefined)
    
    @scala.inline
    def setFilterOn(value: String): Self = StObject.set(x, "filterOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOnUndefined: Self = StObject.set(x, "filterOn", js.undefined)
    
    @scala.inline
    def setIcon(value: NullableOption[WorkbookIcon]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconNull: Self = StObject.set(x, "icon", null)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setValues(value: NullableOption[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesNull: Self = StObject.set(x, "values", null)
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
