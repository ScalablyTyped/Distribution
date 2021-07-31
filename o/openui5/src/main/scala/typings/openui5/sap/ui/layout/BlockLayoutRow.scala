package typings.openui5.sap.ui.layout

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockLayoutRow
  extends StObject
     with Control {
  
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: BlockLayoutCell): BlockLayoutRow = js.native
  
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): BlockLayoutRow = js.native
  
  /**
    * Gets content of aggregation <code>content</code>.The content cells to be included in the row.
    */
  def getContent(): js.Array[BlockLayoutCell] = js.native
  
  /**
    * Gets current value of property <code>scrollable</code>.Sets the rendering mode of the BlockLayoutRow
    * to scrollable. In scrollable mode, the cells getaligned side by side, with horizontal scroll bar for
    * the row.Default value is <code>false</code>.
    * @returns Value of property <code>scrollable</code>
    */
  def getScrollable(): Boolean = js.native
  
  /**
    * Checks for the provided <code>sap.ui.layout.BlockLayoutCell</code> in the aggregation
    * <code>content</code>.and returns its index if found or -1 otherwise.
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: BlockLayoutCell): Double = js.native
  
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: BlockLayoutCell, iIndex: Double): BlockLayoutRow = js.native
  
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[BlockLayoutCell] = js.native
  
  def removeContent(vContent: String): BlockLayoutCell = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: Double): BlockLayoutCell = js.native
  def removeContent(vContent: BlockLayoutCell): BlockLayoutCell = js.native
  
  /**
    * Sets a new value for property <code>scrollable</code>.Sets the rendering mode of the BlockLayoutRow
    * to scrollable. In scrollable mode, the cells getaligned side by side, with horizontal scroll bar for
    * the row.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>false</code>.
    * @param bScrollable New value for property <code>scrollable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setScrollable(bScrollable: Boolean): BlockLayoutRow = js.native
}
