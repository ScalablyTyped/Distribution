package typings.parameter.mod

import typings.parameter.parameterStrings.`enum`
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ParameterRuleItem extends StObject
object _ParameterRuleItem {
  
  @scala.inline
  def ParameterRuleArray(`type`: array | arrayQuestionmark): typings.parameter.mod.ParameterRuleArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parameter.mod.ParameterRuleArray]
  }
  
  @scala.inline
  def ParameterRuleCustom(`type`: String): typings.parameter.mod.ParameterRuleCustom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parameter.mod.ParameterRuleCustom]
  }
  
  @scala.inline
  def ParameterRuleDateTime(
    `type`: date | dateQuestionmark | dateTime | dateTimeQuestionmark | datetime_ | datetimeQuestionmark
  ): typings.parameter.mod.ParameterRuleDateTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parameter.mod.ParameterRuleDateTime]
  }
  
  @scala.inline
  def ParameterRuleEmail(`type`: email | emailQuestionmark): typings.parameter.mod.ParameterRuleEmail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parameter.mod.ParameterRuleEmail]
  }
  
  @scala.inline
  def ParameterRuleEnum(`type`: `enum` | enumQuestionmark, values: js.Array[js.Any]): typings.parameter.mod.ParameterRuleEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parameter.mod.ParameterRuleEnum]
  }
  
  @scala.inline
  def ParameterRuleID(`type`: id | idQuestionmark): typings.parameter.mod.ParameterRuleID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parameter.mod.ParameterRuleID]
  }
  
  @scala.inline
  def ParameterRuleNumber(`type`: int | integer | number | intQuestionmark | integerQuestionmark | numberQuestionmark): typings.parameter.mod.ParameterRuleNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parameter.mod.ParameterRuleNumber]
  }
  
  @scala.inline
  def ParameterRuleObject(`type`: `object` | objectQuestionmark): typings.parameter.mod.ParameterRuleObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parameter.mod.ParameterRuleObject]
  }
  
  @scala.inline
  def ParameterRulePassword(`type`: password | passwordQuestionmark): typings.parameter.mod.ParameterRulePassword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parameter.mod.ParameterRulePassword]
  }
  
  @scala.inline
  def ParameterRuleString(`type`: string | stringQuestionmark): typings.parameter.mod.ParameterRuleString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parameter.mod.ParameterRuleString]
  }
  
  @scala.inline
  def ParameterRuleUrl(`type`: url | urlQuestionmark): typings.parameter.mod.ParameterRuleUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parameter.mod.ParameterRuleUrl]
  }
}
