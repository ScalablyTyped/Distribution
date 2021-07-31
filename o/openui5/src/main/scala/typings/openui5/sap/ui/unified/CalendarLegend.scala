package typings.openui5.sap.ui.unified

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarLegend
  extends StObject
     with Control {
  
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: CalendarLegendItem): CalendarLegend = js.native
  
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): CalendarLegend = js.native
  
  /**
    * Gets current value of property <code>columnWidth</code>.Width of the columns created in which the
    * items are arranged.Default value is <code>120px</code>.
    * @returns Value of property <code>columnWidth</code>
    */
  def getColumnWidth(): js.Any = js.native
  
  /**
    * Gets content of aggregation <code>items</code>.Items to be displayed.
    */
  def getItems(): js.Array[CalendarLegendItem] = js.native
  
  /**
    * Checks for the provided <code>sap.ui.unified.CalendarLegendItem</code> in the aggregation
    * <code>items</code>.and returns its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: CalendarLegendItem): Double = js.native
  
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: CalendarLegendItem, iIndex: Double): CalendarLegend = js.native
  
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[CalendarLegendItem] = js.native
  
  def removeItem(vItem: String): CalendarLegendItem = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: Double): CalendarLegendItem = js.native
  def removeItem(vItem: CalendarLegendItem): CalendarLegendItem = js.native
  
  /**
    * Sets a new value for property <code>columnWidth</code>.Width of the columns created in which the
    * items are arranged.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>120px</code>.
    * @param sColumnWidth New value for property <code>columnWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumnWidth(sColumnWidth: js.Any): CalendarLegend = js.native
}
