package typings.parameter.mod

import typings.parameter.parameterStrings.int
import typings.parameter.parameterStrings.intQuestionmark
import typings.parameter.parameterStrings.integer
import typings.parameter.parameterStrings.integerQuestionmark
import typings.parameter.parameterStrings.number
import typings.parameter.parameterStrings.numberQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterRuleNumber
  extends ParameterRuleBase
     with _ParameterRuleItem {
  
  /**
    * The maximum of the value, value must >= min.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * The minimum of the value, value must <= max
    */
  var min: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_ParameterRuleNumber: int | integer | number | intQuestionmark | integerQuestionmark | numberQuestionmark = js.native
}
object ParameterRuleNumber {
  
  @scala.inline
  def apply(`type`: int | integer | number | intQuestionmark | integerQuestionmark | numberQuestionmark): ParameterRuleNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleNumber]
  }
  
  @scala.inline
  implicit class ParameterRuleNumberMutableBuilder[Self <: ParameterRuleNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setType(value: int | integer | number | intQuestionmark | integerQuestionmark | numberQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
