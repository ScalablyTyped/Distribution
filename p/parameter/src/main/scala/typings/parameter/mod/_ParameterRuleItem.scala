package typings.parameter.mod

import typings.parameter.parameterStrings.`object`
import typings.parameter.parameterStrings.array
import typings.parameter.parameterStrings.arrayQuestionmark
import typings.parameter.parameterStrings.date
import typings.parameter.parameterStrings.dateQuestionmark
import typings.parameter.parameterStrings.dateTime
import typings.parameter.parameterStrings.dateTimeQuestionmark
import typings.parameter.parameterStrings.datetimeQuestionmark
import typings.parameter.parameterStrings.datetime_
import typings.parameter.parameterStrings.email
import typings.parameter.parameterStrings.emailQuestionmark
import typings.parameter.parameterStrings.enum
import typings.parameter.parameterStrings.enumQuestionmark
import typings.parameter.parameterStrings.id
import typings.parameter.parameterStrings.idQuestionmark
import typings.parameter.parameterStrings.int
import typings.parameter.parameterStrings.intQuestionmark
import typings.parameter.parameterStrings.integer
import typings.parameter.parameterStrings.integerQuestionmark
import typings.parameter.parameterStrings.number
import typings.parameter.parameterStrings.numberQuestionmark
import typings.parameter.parameterStrings.objectQuestionmark
import typings.parameter.parameterStrings.password
import typings.parameter.parameterStrings.passwordQuestionmark
import typings.parameter.parameterStrings.string
import typings.parameter.parameterStrings.stringQuestionmark
import typings.parameter.parameterStrings.url
import typings.parameter.parameterStrings.urlQuestionmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ParameterRuleItem extends js.Object
object _ParameterRuleItem {
  
  @scala.inline
  def ParameterRuleID(`type`: id | idQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleNumber(`type`: int | integer | number | intQuestionmark | integerQuestionmark | numberQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleObject(`type`: `object` | objectQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleString(`type`: string | stringQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleEmail(`type`: email | emailQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleEnum(`type`: enum | enumQuestionmark, values: js.Array[_]): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRulePassword(`type`: password | passwordQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleUrl(`type`: url | urlQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleArray(`type`: array | arrayQuestionmark): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleCustom(`type`: String): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
  
  @scala.inline
  def ParameterRuleDateTime(
    `type`: date | dateQuestionmark | dateTime | dateTimeQuestionmark | datetime_ | datetimeQuestionmark
  ): _ParameterRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParameterRuleItem]
  }
}
