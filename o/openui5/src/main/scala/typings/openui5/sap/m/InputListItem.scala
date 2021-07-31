package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.TextDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputListItem
  extends StObject
     with ListItemBase {
  
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: Control): InputListItem = js.native
  
  /**
    * Binds aggregation <code>content</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindContent(oBindingInfo: js.Any): InputListItem = js.native
  
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): InputListItem = js.native
  
  /**
    * Gets content of aggregation <code>content</code>.Content controls can be added
    */
  def getContent(): js.Array[Control] = js.native
  
  /**
    * Gets current value of property <code>label</code>.Label of the list item
    * @returns Value of property <code>label</code>
    */
  def getLabel(): String = js.native
  
  /**
    * Gets current value of property <code>labelTextDirection</code>.This property specifies the label
    * text directionality with enumerated options. By default, the label inherits text direction from the
    * DOM.Default value is <code>Inherit</code>.
    * @since 1.30.0
    * @returns Value of property <code>labelTextDirection</code>
    */
  def getLabelTextDirection(): TextDirection = js.native
  
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
    * returns its index if found or -1 otherwise.
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: Control): Double = js.native
  
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: Control, iIndex: Double): InputListItem = js.native
  
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[Control] = js.native
  
  def removeContent(vContent: String): Control = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: Double): Control = js.native
  def removeContent(vContent: Control): Control = js.native
  
  /**
    * Sets a new value for property <code>label</code>.Label of the list itemWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sLabel New value for property <code>label</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLabel(sLabel: String): InputListItem = js.native
  
  /**
    * Sets a new value for property <code>labelTextDirection</code>.This property specifies the label text
    * directionality with enumerated options. By default, the label inherits text direction from the
    * DOM.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Inherit</code>.
    * @since 1.30.0
    * @param sLabelTextDirection New value for property <code>labelTextDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLabelTextDirection(sLabelTextDirection: TextDirection): InputListItem = js.native
  
  /**
    * Unbinds aggregation <code>content</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindContent(): InputListItem = js.native
}
