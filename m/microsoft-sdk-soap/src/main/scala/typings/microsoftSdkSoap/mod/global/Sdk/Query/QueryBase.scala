package typings.microsoftSdkSoap.mod.global.Sdk.Query

import typings.microsoftSdkSoap.mod.global.Sdk.Collection
import typings.microsoftSdkSoap.mod.global.Sdk.ColumnSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.Query.QueryBase")
@js.native
class QueryBase protected () extends StObject {
  /**
    * Internal Use Only.
    * @param type An Abstract class for different query classes to inherit from.
    */
  def this(`type`: String) = this()
  
  /**
    * Adds the specified column to the column set.
    * @param columnName The logical name of the column to add.
    */
  def addColumn(columnName: String): Unit = js.native
  
  /**
    * Gets the columns to include.
    */
  def getColumnSet(): ColumnSet = js.native
  
  /**
    * Gets the logical name of the entity.
    */
  def getEntityName(): String = js.native
  
  /**
    * Gets an Sdk.Collection of Sdk.Query.OrderExpression instances that define the order in which the entity instances are returned from the query.
    */
  def getOrders(): Collection[OrderExpression] = js.native
  
  /**
    * Gets the number of pages and the number of entity instances per page returned from the query.
    */
  def getPageInfo(): PagingInfo = js.native
  
  /**
    *
    */
  def getQueryType(): String = js.native
  
  /**
    * Gets the number of rows to be returned.
    */
  def getTopCount(): Double = js.native
  
  /**
    * Removes a column from the ColumnSet used by the query.
    * @param columnName The logical name of an attribute to be removed from the ColumnSet.
    * @param errorIfNotFound Whether to throw an error when the column to remove is not found. The default is false.
    */
  def removeColumn(columnName: String): Unit = js.native
  def removeColumn(columnName: String, errorIfNotFound: Boolean): Unit = js.native
  
  /**
    * Sets the columns to include.
    * @param columns Pass each attribute logical name as an argument.
    */
  def setColumnSet(columns: String*): Unit = js.native
  /**
    * Sets the columns to include.
    * @param columns An array of attribute logical names for the columns to return.
    */
  def setColumnSet(columns: js.Array[String]): Unit = js.native
  /**
    * Sets the columns to include.
    * @param columns An Sdk.ColumnSet instance.
    */
  def setColumnSet(columns: ColumnSet): Unit = js.native
  
  /**
    * Sets the logical name of the entity.
    * @param name The logical name of the entity.
    */
  def setEntityName(name: String): Unit = js.native
  
  /**
    * Sets the number of pages and the number of entity instances per page returned from the query.
    * @param pageInfo The number of pages and the number of entity instances per page returned from the query.
    */
  def setPageInfo(pageInfo: PagingInfo): Unit = js.native
  
  /**
    * Sets the number of rows to be returned.
    * @param count The number of rows to be returned.
    */
  def setTopCount(count: Double): Unit = js.native
  
  /**
    * Gets the serialized QueryExpression values.
    */
  def toValueXml(): String = js.native
  
  /**
    * Gets the serialized QueryExpression.
    */
  def toXml(): String = js.native
}
