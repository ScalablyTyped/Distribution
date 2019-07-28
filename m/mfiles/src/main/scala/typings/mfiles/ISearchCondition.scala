package typings.mfiles

import typings.mfiles.MFilesNs.MFConditionType
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ConditionType = ConditionType, Expression = Expression, Set = js.Any.fromFunction3(Set), TypedValue = TypedValue)
  
    __obj.asInstanceOf[ISearchCondition]
  }
}

