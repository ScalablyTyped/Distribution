package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait P13nColumnsItem
  extends StObject
     with Item {
  
  /**
    * Gets current value of property <code>columnKey</code>.This property contains the unique table column
    * key
    * @since 1.26.0
    * @returns Value of property <code>columnKey</code>
    */
  def getColumnKey(): String = js.native
  
  /**
    * Gets current value of property <code>index</code>.This property contains the index of a table column
    * @since 1.26.0
    * @returns Value of property <code>index</code>
    */
  def getIndex(): Double = js.native
  
  /**
    * Gets current value of property <code>total</code>.This property contains the total flag of a table
    * column.
    * @since 1.26.0
    * @returns Value of property <code>total</code>
    */
  def getTotal(): Boolean = js.native
  
  /**
    * Gets current value of property <code>visible</code>.This property decides whether a P13nColumnsItem
    * is visible
    * @since 1.26.0
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Gets current value of property <code>width</code>.This property contains the with of a table column.
    * @since 1.26.0
    * @returns Value of property <code>width</code>
    */
  def getWidth(): String = js.native
  
  /**
    * Sets a new value for property <code>columnKey</code>.This property contains the unique table column
    * keyWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @since 1.26.0
    * @param sColumnKey New value for property <code>columnKey</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumnKey(sColumnKey: String): P13nColumnsItem = js.native
  
  /**
    * Sets a new value for property <code>index</code>.This property contains the index of a table
    * columnWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @since 1.26.0
    * @param iIndex New value for property <code>index</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIndex(iIndex: Double): P13nColumnsItem = js.native
  
  /**
    * Sets a new value for property <code>total</code>.This property contains the total flag of a table
    * column.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @since 1.26.0
    * @param bTotal New value for property <code>total</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTotal(bTotal: Boolean): P13nColumnsItem = js.native
  
  /**
    * Sets a new value for property <code>visible</code>.This property decides whether a P13nColumnsItem
    * is visibleWhen called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @since 1.26.0
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: Boolean): P13nColumnsItem = js.native
  
  /**
    * Sets a new value for property <code>width</code>.This property contains the with of a table
    * column.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @since 1.26.0
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: String): P13nColumnsItem = js.native
}
