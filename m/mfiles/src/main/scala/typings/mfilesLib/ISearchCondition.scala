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
    Clone: () => ISearchCondition,
    ConditionType: mfilesLib.MFilesNs.MFConditionType,
    Expression: IExpression,
    Set: (IExpression, mfilesLib.MFilesNs.MFConditionType, ITypedValue) => scala.Unit,
    TypedValue: ITypedValue
  ): ISearchCondition = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ConditionType = ConditionType, Expression = Expression, Set = js.Any.fromFunction3(Set), TypedValue = TypedValue)
  
    __obj.asInstanceOf[ISearchCondition]
  }
}

