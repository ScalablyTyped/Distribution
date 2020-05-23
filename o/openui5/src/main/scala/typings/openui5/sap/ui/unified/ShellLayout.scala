package typings.openui5.sap.ui.unified

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellLayout extends Control {
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: Control): ShellLayout = js.native
  /**
    * Adds some paneContent to the aggregation <code>paneContent</code>.
    * @param oPaneContent the paneContent to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addPaneContent(oPaneContent: Control): ShellLayout = js.native
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): ShellLayout = js.native
  /**
    * Destroys the header in the aggregation <code>header</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyHeader(): ShellLayout = js.native
  /**
    * Destroys all the paneContent in the aggregation <code>paneContent</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyPaneContent(): ShellLayout = js.native
  /**
    * Gets content of aggregation <code>content</code>.The content to appear in the main canvas.
    */
  def getContent(): js.Array[Control] = js.native
  /**
    * Gets content of aggregation <code>header</code>.The control to appear in the header area.
    */
  def getHeader(): Control = js.native
  /**
    * Gets current value of property <code>headerHiding</code>.Whether the header can be hidden (manually
    * or automatically). This feature is only available when touch events are supported.Default value is
    * <code>false</code>.
    * @returns Value of property <code>headerHiding</code>
    */
  def getHeaderHiding(): Boolean = js.native
  /**
    * Gets current value of property <code>headerVisible</code>.If set to false, no header (and no items,
    * search, ...) is shown.Default value is <code>true</code>.
    * @returns Value of property <code>headerVisible</code>
    */
  def getHeaderVisible(): Boolean = js.native
  /**
    * Gets content of aggregation <code>paneContent</code>.The content to appear in the pane area.
    */
  def getPaneContent(): js.Array[Control] = js.native
  /**
    * Gets current value of property <code>showPane</code>.Shows / Hides the side pane.Default value is
    * <code>false</code>.
    * @returns Value of property <code>showPane</code>
    */
  def getShowPane(): Boolean = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
    * returns its index if found or -1 otherwise.
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: Control): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>paneContent</code>.and returns its index if found or -1 otherwise.
    * @param oPaneContent The paneContent whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfPaneContent(oPaneContent: Control): Double = js.native
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: Control, iIndex: Double): ShellLayout = js.native
  /**
    * Inserts a paneContent into the aggregation <code>paneContent</code>.
    * @param oPaneContent the paneContent to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the paneContent should be inserted at; for            
    * a negative value of <code>iIndex</code>, the paneContent is inserted at position 0; for a value     
    *        greater than the current size of the aggregation, the paneContent is inserted at            
    * the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertPaneContent(oPaneContent: Control, iIndex: Double): ShellLayout = js.native
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[Control] = js.native
  /**
    * Removes all the controls from the aggregation <code>paneContent</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllPaneContent(): js.Array[Control] = js.native
  def removeContent(vContent: String): Control = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: Double): Control = js.native
  def removeContent(vContent: Control): Control = js.native
  def removePaneContent(vPaneContent: String): Control = js.native
  /**
    * Removes a paneContent from the aggregation <code>paneContent</code>.
    * @param vPaneContent The paneContent to remove or its index or id
    * @returns The removed paneContent or <code>null</code>
    */
  def removePaneContent(vPaneContent: Double): Control = js.native
  def removePaneContent(vPaneContent: Control): Control = js.native
  /**
    * Sets the aggregated <code>header</code>.
    * @param oHeader The header to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeader(oHeader: Control): ShellLayout = js.native
  /**
    * Sets a new value for property <code>headerHiding</code>.Whether the header can be hidden (manually
    * or automatically). This feature is only available when touch events are supported.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bHeaderHiding New value for property <code>headerHiding</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeaderHiding(bHeaderHiding: Boolean): ShellLayout = js.native
  /**
    * Sets a new value for property <code>headerVisible</code>.If set to false, no header (and no items,
    * search, ...) is shown.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>true</code>.
    * @param bHeaderVisible New value for property <code>headerVisible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeaderVisible(bHeaderVisible: Boolean): ShellLayout = js.native
  /**
    * Sets a new value for property <code>showPane</code>.Shows / Hides the side pane.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bShowPane New value for property <code>showPane</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowPane(bShowPane: Boolean): ShellLayout = js.native
}

