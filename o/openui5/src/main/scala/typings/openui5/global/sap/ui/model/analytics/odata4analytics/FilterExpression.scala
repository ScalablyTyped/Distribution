package typings.openui5.global.sap.ui.model.analytics.odata4analytics

import typings.openui5.anon.TypeofFilterOperator
import typings.openui5.sap.ui.model.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.FilterExpression")
@js.native
class FilterExpression protected ()
  extends typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression {
  /**
    * Create a representation of a filter expression for a given entity type. It can be rendered as value
    * for the $filter systemquery option.
    * @param oModel DataJS object for the OData model containing this entity type
    * @param oSchema DataJS object for the schema containing this entity type
    * @param oEntityType object for the entity type
    */
  def this(
    oModel: js.Any,
    oSchema: js.Any,
    oEntityType: typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType
  ) = this()
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
  /* CompleteClass */
  override def addCondition(sPropertyName: String, sOperator: TypeofFilterOperator, oValue: js.Any, oValue2: js.Any): typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression = js.native
  /**
    * Add a set condition to the filter expression.A set condition tests if the value of a property is
    * included in a set of given values. It is a convenience method forthis particular use case
    * eliminating the need for multiple API calls.
    * @param sPropertyName The name of the property bound in the condition
    * @param aValues values defining the set
    * @returns This object for method chaining
    */
  /* CompleteClass */
  override def addSetCondition(sPropertyName: String, aValues: js.Array[_]): typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression = js.native
  /**
    * Add an array of UI5 filter conditions to the filter expression.The UI5 filter condition is combined
    * with the other given conditions using a logical AND. This methodis particularly useful for passing
    * forward already created UI5 filter arrays.
    * @param aUI5Filter Array of UI5 filter objects
    * @returns This object for method chaining
    */
  /* CompleteClass */
  override def addUI5FilterConditions(aUI5Filter: js.Array[Filter]): typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression = js.native
  /**
    * Check if request is compliant with basic filter constraints expressed in metadata:(a) all properties
    * required in the filter expression have been referenced (b) the single-value filter restrictions have
    * been obeyed
    * @returns The value true. In case the expression violates some of the rules, an exception with some
    * explanatory         message is thrown
    */
  /* CompleteClass */
  override def checkValidity(): Boolean = js.native
  /**
    * Clear expression from any conditions that may have been set previously
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * Get description for this entity type
    * @returns The object representing the entity type
    */
  /* CompleteClass */
  override def getEntityType(): typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType = js.native
  /**
    * Get an array of SAPUI5 Filter objects corresponding to this expression.
    * @returns List of filter objects representing this expression
    */
  /* CompleteClass */
  override def getExpressionAsUI5FilterArray(): js.Array[Filter] = js.native
  /**
    * Get the value for the OData system query option $filter corresponding to this expression.
    * @returns The $filter value for the filter expression
    */
  /* CompleteClass */
  override def getURIFilterOptionValue(): String = js.native
  /**
    * Remove all conditions for some property from the filter expression.All previously set conditions for
    * some property are removed from the filter expression.
    * @param sPropertyName The name of the property bound in the condition
    * @returns This object for method chaining
    */
  /* CompleteClass */
  override def removeConditions(sPropertyName: String): typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression = js.native
}

