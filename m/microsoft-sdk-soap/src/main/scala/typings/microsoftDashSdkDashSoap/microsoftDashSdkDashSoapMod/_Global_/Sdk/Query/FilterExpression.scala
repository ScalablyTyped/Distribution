package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query

import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies complex condition and logical filter expressions used for filtering the results of the query.
  * @param logicalOperator The filter operator.
  */
@JSGlobal("Sdk.Query.FilterExpression")
@js.native
class FilterExpression protected () extends js.Object {
  def this(logicalOperator: LogicalOperator) = this()
  /**
    * Adds a condition to the filter expression setting the attribute name, condition operator, and values.
    * @param entityName The entityName of the new ConditionExpression that will be instantiated using the other parameters.
    * @param attributeName The attribute name to use in the condition expression.
    * @param conditionOperator The condition operator if the first parameter is a string.
    * @param values The value(s) to compare.
    *  Use one of the following classes that
    *  - Sdk.Query.Booleans
    *  - Sdk.Query.BooleanManagedProperties
    *  - Sdk.Query.Dates
    *  - Sdk.Query.Decimals
    *  - Sdk.Query.Doubles
    *  - Sdk.Query.EntityReferences
    *  - Sdk.Query.Guids
    *  - Sdk.Query.Ints
    *  - Sdk.Query.Longs
    *  - Sdk.Query.Money
    *  - Sdk.Query.OptionSets
    *  - Sdk.Query.Strings
    */
  def addCondition(entityName: String, attributeName: String, conditionOperator: ConditionOperator): Unit = js.native
  def addCondition(entityName: String, attributeName: String, conditionOperator: ConditionOperator, values: ValueBase): Unit = js.native
  /**
    * Adds a condition to the filter expression setting the attribute name, condition operator, and values.
    * @param conditionExpression The expression that will set the condition.
    */
  def addCondition(firstParam: ConditionExpression): Unit = js.native
  /**
    * Adds a child filter to the filter expression.
    * @param filterExpression The filter to add.
    */
  def addFilter(filterExpression: FilterExpression): Unit = js.native
  /**
    * Adds a child filter to the filter expression.
    * @param logicalOperator Creates new FilterExpression with the specified logical operator and adds it.
    */
  def addFilter(logicalOperator: LogicalOperator): Unit = js.native
  /**
    * Returns a collection of Sdk.Query.ConditionExpression values.
    */
  def getConditions(): Collection[ConditionExpression] = js.native
  /**
    * Gets the logical AND/OR filter operator.
    */
  def getFilterOperator(): LogicalOperator = js.native
  /**
    * Returns an Sdk.Collection of Sdk.Query.FilterExpression.
    */
  def getFilters(): Collection[FilterExpression] = js.native
  /**
    * Gets whether the expression is part of a quick find query.
    */
  def getIsQuickFindFilter(): Boolean = js.native
  /**
    * Sets the filter operator.
    * @param filterOperator The filter operator.
    */
  def setFilterOperator(filterOperator: LogicalOperator): Unit = js.native
  /**
    * Sets whether the expression is part of a quick find query.
    * @param isQuickFind True if the filter is part of a quick find query; otherwise, false.
    */
  def setIsQuickFindFilter(isQuickFind: Boolean): Unit = js.native
}

