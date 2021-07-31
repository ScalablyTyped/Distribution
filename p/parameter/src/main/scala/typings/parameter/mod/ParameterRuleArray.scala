package typings.parameter.mod

import typings.parameter.parameterStrings.array
import typings.parameter.parameterStrings.arrayQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRuleArray
  extends StObject
     with ParameterRuleBase
     with _ParameterRuleItem {
  
  var itemType: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var rule: js.UndefOr[ParameterRules] = js.undefined
  
  @JSName("type")
  var type_ParameterRuleArray: array | arrayQuestionmark
}
object ParameterRuleArray {
  
  @scala.inline
  def apply(`type`: array | arrayQuestionmark): ParameterRuleArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleArray]
  }
  
  @scala.inline
  implicit class ParameterRuleArrayMutableBuilder[Self <: ParameterRuleArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setRule(value: ParameterRules): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setType(value: array | arrayQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
