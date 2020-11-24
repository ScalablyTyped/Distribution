package typings.microsoftSdkSoap.mod.global.Sdk.Query

import typings.microsoftSdkSoap.mod.global.Sdk.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.Query.QueryExpression")
@js.native
class QueryExpression protected () extends QueryBase {
  /**
    * Initializes a new instance of the QueryExpression class setting the entity name.
    * @param entityName The name of the entity.
    */
  def this(entityName: String) = this()
  
  /// prototype methods
  /**
    *  Contains a condition expression used to filter the results of the query.
    * @param entityName The logical name of the entity in the condition expression.
    * @param attributeName The logical name of the attribute in the condition expression.
    * @param operator The condition operator.
    * @param values The value(s) to compare. Use one of the following classes that inherit from Sdk.Query.ValueBase:
    *          Sdk.Query.Booleans
    *          Sdk.Query.BooleanManagedProperties
    *          Sdk.Query.Dates
    *          Sdk.Query.Decimals
    *          Sdk.Query.Doubles
    *          Sdk.Query.EntityReferences
    *          Sdk.Query.Guids
    *          Sdk.Query.Ints
    *          Sdk.Query.Longs
    *          Sdk.Query.Money
    *          Sdk.Query.OptionSets
    *          Sdk.Query.Strings
    */
  def addCondition(entityName: String, attributeName: String, conditionOperator: ConditionOperator, values: ValueBase): Unit = js.native
  
  /**
    * Adds the specified link to the query expression setting the entity name to link to, the attribute name to link from and the attribute name to link to.
    * @param firstParam The name of entity to link from.
    * @param linkFromAttributeName The name of the attribute to link from.
    * @param linkToAttributeName The name of the attribute to link to.
    * @param joinOperator The join operator. The default value is Inner
    */
  def addLink(
    firstParam: String,
    linkFromAttributeName: String,
    linkToAttributeName: String,
    joinOperator: JoinOperator
  ): Unit = js.native
  /**
    * Adds the specified link to the query expression setting the entity name to link to, the attribute name to link from and the attribute name to link to.
    * @param firstParam An Sdk.Query.LinkEntity instance.
    */
  def addLink(firstParam: LinkEntity): Unit = js.native
  
  /**
    * Adds the specified order expression to the query expression.
    * @param attributeName The name of the attribute.
    * @param orderType The order, ascending or descending. Ascending is the default if not specified.
    */
  def addOrder(attributeName: String, orderType: OrderType): Unit = js.native
  
  /**
    * Gets the complex condition and logical filter expressions that filter the results of the query.
    */
  def getCriteria(): FilterExpression = js.native
  
  /**
    * Gets whether the results of the query contain duplicate entity instances.
    */
  def getDistinct(): Boolean = js.native
  
  /**
    * Gets an Sdk.Collection of Sdk.Query.LinkEntity instances.
    */
  def getLinkEntities(): Collection[LinkEntity] = js.native
  
  /**
    * Gets a value that indicates that no shared locks are issued against the data that would prohibit other transactions from modifying the data in the records returned from the query.
    */
  def getNoLock(): Boolean = js.native
  
  /**
    * Sets the complex condition and logical filter expressions that filter the results of the query.
    * @param criteria The query condition and filter criteria.
    */
  def setCriteria(criteria: FilterExpression): Unit = js.native
  
  /**
    * Sets whether the results of the query contain duplicate entity instances.
    */
  def setDistinct(isDistinct: Boolean): Unit = js.native
  
  /**
    * Sets a value that indicates that no shared locks are issued against the data that would prohibit other transactions from modifying the data in the records returned from the query.
    * @param isNoLock True if there are no shared locks are issued against the data that would prohibit other transactions from modifying the data in the records returned from the query; otherwise, false.
    */
  def setNoLock(isNoLock: Boolean): Unit = js.native
}
