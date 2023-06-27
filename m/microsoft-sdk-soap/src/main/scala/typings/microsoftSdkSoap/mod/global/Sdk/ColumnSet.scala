package typings.microsoftSdkSoap.mod.global.Sdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.ColumnSet")
@js.native
open class ColumnSet protected () extends StObject {
  /**
    * Specifies the attributes for which non- null values are returned from a query.
    * @param allColumns If Boolean true value is passed as the first parameter all columns will be included. (Not recommended for production code).
    */
  def this(allColumns: scala.Boolean) = this()
  /**
    * Specifies the attributes for which non- null values are returned from a query.
    * @param columns Comma separated string values for attribute logical names.
    */
  def this(columns: java.lang.String*) = this()
  /**
    * Specifies the attributes for which non- null values are returned from a query.
    * @param columns An array of string values.
    */
  def this(columns: js.Array[java.lang.String]) = this()
  
  /**
    * Adds a column to the collection.
    * @param column The logical name of the attribute to add.
    */
  def addColumn(column: java.lang.String): Unit = js.native
  
  /**
    * Adds a string array of column names.
    * @param columns A string array of column names.
    */
  def addColumns(columns: js.Array[java.lang.String]): Unit = js.native
  
  /**
    * Whether all columns will be returned.
    */
  def getAllColumns(): scala.Boolean = js.native
  
  /**
    * Gets the collection of column names.
    * @returns The collection of column names.
    */
  def getColumns(): Collection[java.lang.String] = js.native
  
  /**
    * Gets the number of columns.
    */
  def getCount(): scala.Double = js.native
  
  /// prototype methods
  /**
    * Removes a column from the ColumnSet.
    * @param columnName The logical name of an attribute to be removed from the ColumnSet.
    * @param errorIfNotFound Whether to throw an error when the column to remove is not found. The default is false
    */
  def removeColumn(columnName: java.lang.String): Unit = js.native
  def removeColumn(columnName: java.lang.String, errorIfNotFound: scala.Boolean): Unit = js.native
  
  /**
    * Sets the AllColumns property.
    * @param allColumns A boolean value.
    */
  def setAllColumns(allColumns: scala.Boolean): Unit = js.native
  
  /**
    * XML nodes for columnSet properties.
    */
  def toValueXml(): java.lang.String = js.native
  
  /**
    * The XML node with "<d:columnSet>" as the root element.
    */
  def toXml(): java.lang.String = js.native
}
