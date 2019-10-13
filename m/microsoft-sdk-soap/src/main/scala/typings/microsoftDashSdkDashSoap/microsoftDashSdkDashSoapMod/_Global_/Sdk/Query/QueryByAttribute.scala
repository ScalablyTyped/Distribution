package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query

import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.AttributeBase
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Sdk.Query.QueryByAttribute")
@js.native
class QueryByAttribute protected () extends QueryBase {
  /**
    * Initializes a new instance of the QueryByAttribute class setting the entity name.
    * @param entityName The logical name of the entity.
    *
    */
  def this(entityName: java.lang.String) = this()
  /// prototype methods
  /**
    * Adds the attribute with values to include in the query.
    * @param attributeValue One of the classes that inherit from Sdk.AttributeBase including the value to use as criteria.
    */
  def addAttributeValue(attributeValue: AttributeBase): Unit = js.native
  /**
    * Adds an order to apply to the results of the query.
    * @param order An order expression.
    */
  def addOrder(order: OrderExpression): Unit = js.native
  /**
    * Gets An Sdk.Collection of Sdk.AttributeBase attributes.
    */
  def getAttributeValues(): Collection[AttributeBase] = js.native
  /**
    * Removes an attribute with values to include in the query.
    * @param attributeValue One of the classes that inherit from Sdk.AttributeBase including the value to use as criteria.
    * @param errorIfNotFound Whether to throw an error when the attribute to remove is not found. The default is false.
    */
  def removeAttributeValue(attributeValue: AttributeBase): Unit = js.native
  def removeAttributeValue(attributeValue: AttributeBase, errorIfNotFound: scala.Boolean): Unit = js.native
  /**
    * Sets an Sdk.Collection of Sdk.Query.OrderExpression instances that define the order in which the entity instances are returned from the query.
    * @param orders An Sdk.Collection of Sdk.Query.OrderExpression instances that define the order in which the entity instances are returned from the query.
    */
  def setOrders(orders: Collection[OrderExpression]): Unit = js.native
}

