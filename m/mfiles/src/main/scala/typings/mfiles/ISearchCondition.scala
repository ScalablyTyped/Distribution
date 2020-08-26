package typings.mfiles

import typings.mfiles.MFiles.MFConditionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchCondition extends js.Object {
  var ConditionType: MFConditionType = js.native
  var Expression: IExpression = js.native
  var TypedValue: ITypedValue = js.native
  def Clone(): ISearchCondition = js.native
  def Set(Expression: IExpression, ConditionType: MFConditionType, TypedValue: ITypedValue): Unit = js.native
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
  @scala.inline
  implicit class ISearchConditionOps[Self <: ISearchCondition] (val x: Self) extends AnyVal {
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
    def setClone(value: () => ISearchCondition): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setConditionType(value: MFConditionType): Self = this.set("ConditionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpression(value: IExpression): Self = this.set("Expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: (IExpression, MFConditionType, ITypedValue) => Unit): Self = this.set("Set", js.Any.fromFunction3(value))
    @scala.inline
    def setTypedValue(value: ITypedValue): Self = this.set("TypedValue", value.asInstanceOf[js.Any])
  }
  
}

