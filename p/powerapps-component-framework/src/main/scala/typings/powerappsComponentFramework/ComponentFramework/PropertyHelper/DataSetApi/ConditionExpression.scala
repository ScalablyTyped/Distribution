package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.ConditionOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An expression used to represent a filter condition.
  */
@js.native
trait ConditionExpression extends js.Object {
  
  /**
    * The name of the data-set column to apply the filter on.
    */
  var attributeName: String = js.native
  
  /**
    * The value evaluated by the condition
    */
  var conditionOperator: ConditionOperator = js.native
  
  /**
    * Entity alias name so filtering can be used on linked entities.
    */
  var entityAliasName: js.UndefOr[String] = js.native
  
  /**
    * The value evaluated by the condition.
    */
  var value: String | js.Array[String] = js.native
}
object ConditionExpression {
  
  @scala.inline
  def apply(attributeName: String, conditionOperator: ConditionOperator, value: String | js.Array[String]): ConditionExpression = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], conditionOperator = conditionOperator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionExpression]
  }
  
  @scala.inline
  implicit class ConditionExpressionOps[Self <: ConditionExpression] (val x: Self) extends AnyVal {
    
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
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionOperator(value: ConditionOperator): Self = this.set("conditionOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | js.Array[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityAliasName(value: String): Self = this.set("entityAliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityAliasName: Self = this.set("entityAliasName", js.undefined)
  }
}
