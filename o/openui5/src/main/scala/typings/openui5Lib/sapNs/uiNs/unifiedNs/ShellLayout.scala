package typings
package openui5Lib.sapNs.uiNs.unifiedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.ShellLayout")
@js.native
class ShellLayout protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new ShellLayout.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): ShellLayout = js.native
  /**
    * Adds some paneContent to the aggregation <code>paneContent</code>.
    * @param oPaneContent the paneContent to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addPaneContent(oPaneContent: openui5Lib.sapNs.uiNs.coreNs.Control): ShellLayout = js.native
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
  def getContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
    * Gets content of aggregation <code>header</code>.The control to appear in the header area.
    */
  def getHeader(): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Gets current value of property <code>headerHiding</code>.Whether the header can be hidden (manually
    * or automatically). This feature is only available when touch events are supported.Default value is
    * <code>false</code>.
    * @returns Value of property <code>headerHiding</code>
    */
  def getHeaderHiding(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>headerVisible</code>.If set to false, no header (and no items,
    * search, ...) is shown.Default value is <code>true</code>.
    * @returns Value of property <code>headerVisible</code>
    */
  def getHeaderVisible(): scala.Boolean = js.native
  /**
    * Gets content of aggregation <code>paneContent</code>.The content to appear in the pane area.
    */
  def getPaneContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
    * Gets current value of property <code>showPane</code>.Shows / Hides the side pane.Default value is
    * <code>false</code>.
    * @returns Value of property <code>showPane</code>
    */
  def getShowPane(): scala.Boolean = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
    * returns its index if found or -1 otherwise.
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>paneContent</code>.and returns its index if found or -1 otherwise.
    * @param oPaneContent The paneContent whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfPaneContent(oPaneContent: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Double = js.native
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): ShellLayout = js.native
  /**
    * Inserts a paneContent into the aggregation <code>paneContent</code>.
    * @param oPaneContent the paneContent to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the paneContent should be inserted at; for            
    * a negative value of <code>iIndex</code>, the paneContent is inserted at position 0; for a value     
    *        greater than the current size of the aggregation, the paneContent is inserted at            
    * the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertPaneContent(oPaneContent: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): ShellLayout = js.native
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
    * Removes all the controls from the aggregation <code>paneContent</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllPaneContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def removeContent(vContent: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  def removeContent(vContent: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  def removePaneContent(vPaneContent: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  def removePaneContent(vPaneContent: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Removes a paneContent from the aggregation <code>paneContent</code>.
    * @param vPaneContent The paneContent to remove or its index or id
    * @returns The removed paneContent or <code>null</code>
    */
  def removePaneContent(vPaneContent: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Sets the aggregated <code>header</code>.
    * @param oHeader The header to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeader(oHeader: openui5Lib.sapNs.uiNs.coreNs.Control): ShellLayout = js.native
  /**
    * Sets a new value for property <code>headerHiding</code>.Whether the header can be hidden (manually
    * or automatically). This feature is only available when touch events are supported.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bHeaderHiding New value for property <code>headerHiding</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeaderHiding(bHeaderHiding: scala.Boolean): ShellLayout = js.native
  /**
    * Sets a new value for property <code>headerVisible</code>.If set to false, no header (and no items,
    * search, ...) is shown.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>true</code>.
    * @param bHeaderVisible New value for property <code>headerVisible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeaderVisible(bHeaderVisible: scala.Boolean): ShellLayout = js.native
  /**
    * Sets a new value for property <code>showPane</code>.Shows / Hides the side pane.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bShowPane New value for property <code>showPane</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowPane(bShowPane: scala.Boolean): ShellLayout = js.native
}

