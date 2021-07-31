package typings.openui5.sap.ui.model.analytics.odata4analytics

import typings.openui5.anon.TypeofFilterOperator
import typings.openui5.sap.ui.model.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterExpression extends StObject {
  
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
  def addCondition(sPropertyName: String, sOperator: TypeofFilterOperator, oValue: js.Any, oValue2: js.Any): FilterExpression
  
  /**
    * Add a set condition to the filter expression.A set condition tests if the value of a property is
    * included in a set of given values. It is a convenience method forthis particular use case
    * eliminating the need for multiple API calls.
    * @param sPropertyName The name of the property bound in the condition
    * @param aValues values defining the set
    * @returns This object for method chaining
    */
  def addSetCondition(sPropertyName: String, aValues: js.Array[js.Any]): FilterExpression
  
  /**
    * Add an array of UI5 filter conditions to the filter expression.The UI5 filter condition is combined
    * with the other given conditions using a logical AND. This methodis particularly useful for passing
    * forward already created UI5 filter arrays.
    * @param aUI5Filter Array of UI5 filter objects
    * @returns This object for method chaining
    */
  def addUI5FilterConditions(aUI5Filter: js.Array[Filter]): FilterExpression
  
  /**
    * Check if request is compliant with basic filter constraints expressed in metadata:(a) all properties
    * required in the filter expression have been referenced (b) the single-value filter restrictions have
    * been obeyed
    * @returns The value true. In case the expression violates some of the rules, an exception with some
    * explanatory         message is thrown
    */
  def checkValidity(): Boolean
  
  /**
    * Clear expression from any conditions that may have been set previously
    */
  def clear(): Unit
  
  /**
    * Get description for this entity type
    * @returns The object representing the entity type
    */
  def getEntityType(): EntityType
  
  /**
    * Get an array of SAPUI5 Filter objects corresponding to this expression.
    * @returns List of filter objects representing this expression
    */
  def getExpressionAsUI5FilterArray(): js.Array[Filter]
  
  /**
    * Get the value for the OData system query option $filter corresponding to this expression.
    * @returns The $filter value for the filter expression
    */
  def getURIFilterOptionValue(): String
  
  /**
    * Remove all conditions for some property from the filter expression.All previously set conditions for
    * some property are removed from the filter expression.
    * @param sPropertyName The name of the property bound in the condition
    * @returns This object for method chaining
    */
  def removeConditions(sPropertyName: String): FilterExpression
}
object FilterExpression {
  
  @scala.inline
  def apply(
    addCondition: (String, TypeofFilterOperator, js.Any, js.Any) => FilterExpression,
    addSetCondition: (String, js.Array[js.Any]) => FilterExpression,
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
  implicit class FilterExpressionMutableBuilder[Self <: FilterExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCondition(value: (String, TypeofFilterOperator, js.Any, js.Any) => FilterExpression): Self = StObject.set(x, "addCondition", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAddSetCondition(value: (String, js.Array[js.Any]) => FilterExpression): Self = StObject.set(x, "addSetCondition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddUI5FilterConditions(value: js.Array[Filter] => FilterExpression): Self = StObject.set(x, "addUI5FilterConditions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckValidity(value: () => Boolean): Self = StObject.set(x, "checkValidity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEntityType(value: () => EntityType): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExpressionAsUI5FilterArray(value: () => js.Array[Filter]): Self = StObject.set(x, "getExpressionAsUI5FilterArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetURIFilterOptionValue(value: () => String): Self = StObject.set(x, "getURIFilterOptionValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveConditions(value: String => FilterExpression): Self = StObject.set(x, "removeConditions", js.Any.fromFunction1(value))
  }
}
