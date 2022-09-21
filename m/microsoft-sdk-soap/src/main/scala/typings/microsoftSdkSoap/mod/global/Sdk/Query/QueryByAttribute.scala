package typings.microsoftSdkSoap.mod.global.Sdk.Query

import typings.microsoftSdkSoap.mod.global.Sdk.AttributeBase
import typings.microsoftSdkSoap.mod.global.Sdk.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.Query.QueryByAttribute")
@js.native
open class QueryByAttribute protected () extends QueryBase {
  /**
    * Initializes a new instance of the QueryByAttribute class setting the entity name.
    * @param entityName The logical name of the entity.
    *
    */
  def this(entityName: String) = this()
  
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
  def removeAttributeValue(attributeValue: AttributeBase, errorIfNotFound: Boolean): Unit = js.native
  
  /**
    * Sets an Sdk.Collection of Sdk.Query.OrderExpression instances that define the order in which the entity instances are returned from the query.
    * @param orders An Sdk.Collection of Sdk.Query.OrderExpression instances that define the order in which the entity instances are returned from the query.
    */
  def setOrders(orders: Collection[OrderExpression]): Unit = js.native
}
