package typings.mfiles

import typings.mfiles.MFiles.MFConditionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchCondition extends js.Object {
  var ConditionType: MFConditionType
  var Expression: IExpression
  var TypedValue: ITypedValue
  def Clone(): ISearchCondition
  def Set(Expression: IExpression, ConditionType: MFConditionType, TypedValue: ITypedValue): Unit
}

object ISearchCondition {
  @scala.inline
  def apply(
    Clone: () => ISearchCondition,
    ConditionType: MFConditionType,
    Expression: IExpression,
    Set: (IExpression, MFConditionType, ITypedValue) => Unit,
    TypedValue: ITypedValue
  ): ISearchCondition = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ConditionType = ConditionType.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], Set = js.Any.fromFunction3(Set), TypedValue = TypedValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISearchCondition]
  }
}

