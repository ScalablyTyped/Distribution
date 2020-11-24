package typings.openui5.sap.ui.model.analytics.odata4analytics

import typings.openui5.anon.TypeofFilterOperator
import typings.openui5.sap.ui.model.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterExpression extends js.Object {
  
  /**
    * Add a condition to the filter expression.Multiple conditions on the same property are combined with
    * a logical OR first, and in a second step conditions fordifferent properties are combined with a
    * logical AND.
    * @param sPropertyName The name of the property bound in the condition
    * @param sOperator operator used for the condition
    * @param oValue value to be used for this condition
    * @param oValue2 (optional) as second value to be used for this condition
    * @returns This object for method chaining
    */
  def addCondition(sPropertyName: String, sOperator: TypeofFilterOperator, oValue: js.Any, oValue2: js.Any): FilterExpression = js.native
  
  /**
    * Add a set condition to the filter expression.A set condition tests if the value of a property is
    * included in a set of given values. It is a convenience method forthis particular use case
    * eliminating the need for multiple API calls.
    * @param sPropertyName The name of the property bound in the condition
    * @param aValues values defining the set
    * @returns This object for method chaining
    */
  def addSetCondition(sPropertyName: String, aValues: js.Array[_]): FilterExpression = js.native
  
  /**
    * Add an array of UI5 filter conditions to the filter expression.The UI5 filter condition is combined
    * with the other given conditions using a logical AND. This methodis particularly useful for passing
    * forward already created UI5 filter arrays.
    * @param aUI5Filter Array of UI5 filter objects
    * @returns This object for method chaining
    */
  def addUI5FilterConditions(aUI5Filter: js.Array[Filter]): FilterExpression = js.native
  
  /**
    * Check if request is compliant with basic filter constraints expressed in metadata:(a) all properties
    * required in the filter expression have been referenced (b) the single-value filter restrictions have
    * been obeyed
    * @returns The value true. In case the expression violates some of the rules, an exception with some
    * explanatory         message is thrown
    */
  def checkValidity(): Boolean = js.native
  
  /**
    * Clear expression from any conditions that may have been set previously
    */
  def clear(): Unit = js.native
  
  /**
    * Get description for this entity type
    * @returns The object representing the entity type
    */
  def getEntityType(): EntityType = js.native
  
  /**
    * Get an array of SAPUI5 Filter objects corresponding to this expression.
    * @returns List of filter objects representing this expression
    */
  def getExpressionAsUI5FilterArray(): js.Array[Filter] = js.native
  
  /**
    * Get the value for the OData system query option $filter corresponding to this expression.
    * @returns The $filter value for the filter expression
    */
  def getURIFilterOptionValue(): String = js.native
  
  /**
    * Remove all conditions for some property from the filter expression.All previously set conditions for
    * some property are removed from the filter expression.
    * @param sPropertyName The name of the property bound in the condition
    * @returns This object for method chaining
    */
  def removeConditions(sPropertyName: String): FilterExpression = js.native
}
object FilterExpression {
  
  @scala.inline
  def apply(
    addCondition: (String, TypeofFilterOperator, js.Any, js.Any) => FilterExpression,
    addSetCondition: (String, js.Array[_]) => FilterExpression,
    addUI5FilterConditions: js.Array[Filter] => FilterExpression,
    checkValidity: () => Boolean,
    clear: () => Unit,
    getEntityType: () => EntityType,
    getExpressionAsUI5FilterArray: () => js.Array[Filter],
    getURIFilterOptionValue: () => String,
    removeConditions: String => FilterExpression
  ): FilterExpression = {
    val __obj = js.Dynamic.literal(addCondition = js.Any.fromFunction4(addCondition), addSetCondition = js.Any.fromFunction2(addSetCondition), addUI5FilterConditions = js.Any.fromFunction1(addUI5FilterConditions), checkValidity = js.Any.fromFunction0(checkValidity), clear = js.Any.fromFunction0(clear), getEntityType = js.Any.fromFunction0(getEntityType), getExpressionAsUI5FilterArray = js.Any.fromFunction0(getExpressionAsUI5FilterArray), getURIFilterOptionValue = js.Any.fromFunction0(getURIFilterOptionValue), removeConditions = js.Any.fromFunction1(removeConditions))
    __obj.asInstanceOf[FilterExpression]
  }
  
  @scala.inline
  implicit class FilterExpressionOps[Self <: FilterExpression] (val x: Self) extends AnyVal {
    
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
    def setAddCondition(value: (String, TypeofFilterOperator, js.Any, js.Any) => FilterExpression): Self = this.set("addCondition", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAddSetCondition(value: (String, js.Array[_]) => FilterExpression): Self = this.set("addSetCondition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddUI5FilterConditions(value: js.Array[Filter] => FilterExpression): Self = this.set("addUI5FilterConditions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckValidity(value: () => Boolean): Self = this.set("checkValidity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEntityType(value: () => EntityType): Self = this.set("getEntityType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExpressionAsUI5FilterArray(value: () => js.Array[Filter]): Self = this.set("getExpressionAsUI5FilterArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetURIFilterOptionValue(value: () => String): Self = this.set("getURIFilterOptionValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveConditions(value: String => FilterExpression): Self = this.set("removeConditions", js.Any.fromFunction1(value))
  }
}
