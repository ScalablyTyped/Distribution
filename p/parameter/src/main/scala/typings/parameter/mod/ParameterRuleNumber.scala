package typings.parameter.mod

import typings.parameter.parameterStrings.int
import typings.parameter.parameterStrings.intQuestionmark
import typings.parameter.parameterStrings.integer
import typings.parameter.parameterStrings.integerQuestionmark
import typings.parameter.parameterStrings.number
import typings.parameter.parameterStrings.numberQuestionmark
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
  implicit class ParameterRuleNumberOps[Self <: ParameterRuleNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: int | integer | number | intQuestionmark | integerQuestionmark | numberQuestionmark): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
}
