package typings.mfiles

import typings.mfiles.MFiles.MFConditionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchCondition extends StObject {
  
  def Clone(): ISearchCondition
  
  var ConditionType: MFConditionType
  
  var Expression: IExpression
  
  def Set(Expression: IExpression, ConditionType: MFConditionType, TypedValue: ITypedValue): Unit
  
  var TypedValue: ITypedValue
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
  implicit class ISearchConditionMutableBuilder[Self <: ISearchCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => ISearchCondition): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConditionType(value: MFConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: IExpression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: (IExpression, MFConditionType, ITypedValue) => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTypedValue(value: ITypedValue): Self = StObject.set(x, "TypedValue", value.asInstanceOf[js.Any])
  }
}
