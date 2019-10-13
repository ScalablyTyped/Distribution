package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Sdk.Query.ConditionExpression")
@js.native
class ConditionExpression protected () extends js.Object {
  /**
    * Contains a condition expression used to filter the results of the query.
    * @param name entityName The logical name of the entity in the condition expression.
    * @param name attributeName The logical name of the attribute in the condition expression.
    * @param name operator The condition operator.
    * @param name values The value(s) to compare.
    *  Use one of the following classes that inherit from Sdk.Query.ValueBase: </para>
    *  - Sdk.Query.Booleans </para>
    *  - Sdk.Query.BooleanManagedProperties </para>
    *  - Sdk.Query.Dates </para>
    *  - Sdk.Query.Decimals </para>
    *  - Sdk.Query.Doubles </para>
    *  - Sdk.Query.EntityReferences </para>
    *  - Sdk.Query.Guids </para>
    *  - Sdk.Query.Ints </para>
    *  - Sdk.Query.Longs </para>
    *  - Sdk.Query.Money </para>
    *  - Sdk.Query.OptionSets </para>
    *  - Sdk.Query.Strings </para>
    */
  def this(entityName: java.lang.String, attributeName: java.lang.String, operator: ConditionOperator) = this()
  def this(
    entityName: java.lang.String,
    attributeName: java.lang.String,
    operator: ConditionOperator,
    values: ValueBase
  ) = this()
  /**
    * Returns the logical name of the attribute in the condition expression.
    */
  def getAttributeName(): java.lang.String = js.native
  /**
    * Returns the logical name of the entity in the condition expression.
    */
  def getEntityName(): java.lang.String = js.native
  /**
    * Returns the condition operator.
    */
  def getOperator(): ConditionOperator = js.native
  /**
    * Returns the values for the attribute.
    */
  def getValues(): ValueBase = js.native
  /**
    * Sets the logical name of the attribute in the condition expression.
    * @param name The logical name of the attribute in the condition expression.
    */
  def setAttributeName(name: java.lang.String): Unit = js.native
  /**
    * Sets the logical name of the entity in the condition expression.
    * @param name The logical name of the entity in the condition expression.
    */
  def setEntityName(name: java.lang.String): Unit = js.native
  /**
    * Sets the condition operator.
    * @param operator The condition operator.
    */
  def setOperator(operator: ConditionOperator): Unit = js.native
  /**
    * Sets the values for the attribute.
    * @param The value(s) to compare
    *  Use one of the following classes that inherit from Sdk.Query.ValueBase:
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
  def setValues(values: ValueBase): Unit = js.native
}

