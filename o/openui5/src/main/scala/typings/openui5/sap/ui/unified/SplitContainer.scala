package typings.openui5.sap.ui.unified

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitContainer extends Control {
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: Control): SplitContainer = js.native
  /**
    * Adds some secondaryContent to the aggregation <code>secondaryContent</code>.
    * @param oSecondaryContent the secondaryContent to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSecondaryContent(oSecondaryContent: Control): SplitContainer = js.native
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): SplitContainer = js.native
  /**
    * Destroys all the secondaryContent in the aggregation <code>secondaryContent</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySecondaryContent(): SplitContainer = js.native
  /**
    * Gets content of aggregation <code>content</code>.The content to appear in the main area.
    */
  def getContent(): js.Array[Control] = js.native
  /**
    * Gets current value of property <code>orientation</code>.Whether to show the secondary content on the
    * left ("Horizontal", default) or on the top ("Vertical").Default value is <code>Horizontal</code>.
    * @since 1.22.0
    * @returns Value of property <code>orientation</code>
    */
  def getOrientation(): Orientation = js.native
  /**
    * Gets content of aggregation <code>secondaryContent</code>.The content to appear in the secondary
    * area.
    */
  def getSecondaryContent(): js.Array[Control] = js.native
  /**
    * Gets current value of property <code>secondaryContentSize</code>.The width if the secondary content.
    * The height is always 100%.Default value is <code>250px</code>.
    * @returns Value of property <code>secondaryContentSize</code>
    */
  def getSecondaryContentSize(): js.Any = js.native
  /**
    * Gets current value of property <code>secondaryContentWidth</code>.Do not use. Use
    * secondaryContentSize instead.Default value is <code>250px</code>.
    * @returns Value of property <code>secondaryContentWidth</code>
    */
  def getSecondaryContentWidth(): js.Any = js.native
  /**
    * Gets current value of property <code>showSecondaryContent</code>.Shows / Hides the secondary area.
    * @returns Value of property <code>showSecondaryContent</code>
    */
  def getShowSecondaryContent(): Boolean = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
    * returns its index if found or -1 otherwise.
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: Control): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>secondaryContent</code>.and returns its index if found or -1 otherwise.
    * @param oSecondaryContent The secondaryContent whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSecondaryContent(oSecondaryContent: Control): Double = js.native
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: Control, iIndex: Double): SplitContainer = js.native
  /**
    * Inserts a secondaryContent into the aggregation <code>secondaryContent</code>.
    * @param oSecondaryContent the secondaryContent to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the secondaryContent should be inserted at; for        
    *     a negative value of <code>iIndex</code>, the secondaryContent is inserted at position 0; for a
    * value             greater than the current size of the aggregation, the secondaryContent is inserted
    * at             the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSecondaryContent(oSecondaryContent: Control, iIndex: Double): SplitContainer = js.native
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[Control] = js.native
  /**
    * Removes all the controls from the aggregation <code>secondaryContent</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSecondaryContent(): js.Array[Control] = js.native
  def removeContent(vContent: String): Control = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: Double): Control = js.native
  def removeContent(vContent: Control): Control = js.native
  def removeSecondaryContent(vSecondaryContent: String): Control = js.native
  /**
    * Removes a secondaryContent from the aggregation <code>secondaryContent</code>.
    * @param vSecondaryContent The secondaryContent to remove or its index or id
    * @returns The removed secondaryContent or <code>null</code>
    */
  def removeSecondaryContent(vSecondaryContent: Double): Control = js.native
  def removeSecondaryContent(vSecondaryContent: Control): Control = js.native
  /**
    * Sets a new value for property <code>orientation</code>.Whether to show the secondary content on the
    * left ("Horizontal", default) or on the top ("Vertical").When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Horizontal</code>.
    * @since 1.22.0
    * @param sOrientation New value for property <code>orientation</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setOrientation(sOrientation: Orientation): SplitContainer = js.native
  /**
    * Sets a new value for property <code>secondaryContentSize</code>.The width if the secondary content.
    * The height is always 100%.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>250px</code>.
    * @param sSecondaryContentSize New value for property <code>secondaryContentSize</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSecondaryContentSize(sSecondaryContentSize: js.Any): SplitContainer = js.native
  /**
    * Sets a new value for property <code>secondaryContentWidth</code>.Do not use. Use
    * secondaryContentSize instead.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>250px</code>.
    * @param sSecondaryContentWidth New value for property <code>secondaryContentWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSecondaryContentWidth(sSecondaryContentWidth: js.Any): SplitContainer = js.native
  /**
    * Sets a new value for property <code>showSecondaryContent</code>.Shows / Hides the secondary
    * area.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param bShowSecondaryContent New value for property <code>showSecondaryContent</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowSecondaryContent(bShowSecondaryContent: Boolean): SplitContainer = js.native
}

