package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchCondition extends js.Object {
  var ConditionType: mfilesLib.MFilesNs.MFConditionType
  var Expression: IExpression
  var TypedValue: ITypedValue
  def Clone(): ISearchCondition
  def Set(
    Expression: IExpression,
    ConditionType: mfilesLib.MFilesNs.MFConditionType,
    TypedValue: ITypedValue
  ): scala.Unit
}

object ISearchCondition {
  @scala.inline
  def apply(
    Clone: js.Function0[ISearchCondition],
    ConditionType: mfilesLib.MFilesNs.MFConditionType,
    Expression: IExpression,
    Set: js.Function3[IExpression, mfilesLib.MFilesNs.MFConditionType, ITypedValue, scala.Unit],
    TypedValue: ITypedValue
  ): ISearchCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("ConditionType")(ConditionType)
    __obj.updateDynamic("Expression")(Expression)
    __obj.updateDynamic("Set")(Set)
    __obj.updateDynamic("TypedValue")(TypedValue)
    __obj.asInstanceOf[ISearchCondition]
  }
}

