package typings.parameter.mod

import typings.parameter.parameterStrings.date
import typings.parameter.parameterStrings.dateQuestionmark
import typings.parameter.parameterStrings.dateTime
import typings.parameter.parameterStrings.dateTimeQuestionmark
import typings.parameter.parameterStrings.datetimeQuestionmark
import typings.parameter.parameterStrings.datetime_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRuleDateTime
  extends StObject
     with ParameterRuleBase
     with _ParameterRuleItem {
  
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_ParameterRuleDateTime: date | dateQuestionmark | dateTime | dateTimeQuestionmark | datetime_ | datetimeQuestionmark
}
object ParameterRuleDateTime {
  
  @scala.inline
  def apply(
    `type`: date | dateQuestionmark | dateTime | dateTimeQuestionmark | datetime_ | datetimeQuestionmark
  ): ParameterRuleDateTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleDateTime]
  }
  
  @scala.inline
  implicit class ParameterRuleDateTimeMutableBuilder[Self <: ParameterRuleDateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    @scala.inline
    def setType(
      value: date | dateQuestionmark | dateTime | dateTimeQuestionmark | datetime_ | datetimeQuestionmark
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
