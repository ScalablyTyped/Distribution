package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.TabContainerItem")
@js.native
class TabContainerItem protected () extends Element {
  /**
    * Constructor for a new <code>TabContainerItem</code>.Accepts an object literal <code>mSettings</code>
    * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: Control): TabContainerItem = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>itemPropertyChanged</code> event of this
    * <code>sap.m.TabContainerItem</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.TabContainerItem</code> itself.Sends information that some of the properties
    * have changed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TabContainerItem</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachItemPropertyChanged(oData: js.Any, fnFunction: js.Any): TabContainerItem = js.native
  def attachItemPropertyChanged(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TabContainerItem = js.native
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): TabContainerItem = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>itemPropertyChanged</code> event of
    * this <code>sap.m.TabContainerItem</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachItemPropertyChanged(fnFunction: js.Any, oListener: js.Any): TabContainerItem = js.native
  /**
    * Fires event <code>itemPropertyChanged</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>itemChanged</code> of type <code>sap.m.TabContainerItem</code>The item
    * changed.</li><li><code>propertyKey</code> of type <code>string</code>The key of the
    * property.</li><li><code>propertyValue</code> of type <code>mixed</code>The value of the
    * property.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireItemPropertyChanged(mArguments: js.Any): TabContainerItem = js.native
  /**
    * Gets content of aggregation <code>content</code>.The content displayed for this item.
    */
  def getContent(): js.Array[Control] = js.native
  /**
    * Gets current value of property <code>key</code>.Determines the name of the item. Can be used as
    * input for subsequent actions.
    * @returns Value of property <code>key</code>
    */
  def getKey(): String = js.native
  /**
    * Gets current value of property <code>modified</code>.Shows if a control is edited (default is
    * false). Items that are marked as modified have a * symbol to indicate that they haven't been
    * saved.Default value is <code>false</code>.
    * @returns Value of property <code>modified</code>
    */
  def getModified(): Boolean = js.native
  /**
    * Gets current value of property <code>name</code>.Determines the text to be displayed for the
    * item.Default value is <code></code>.
    * @returns Value of property <code>name</code>
    */
  def getName(): String = js.native
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
  def insertContent(oContent: Control, iIndex: Double): TabContainerItem = js.native
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
    * Sets a new value for property <code>key</code>.Determines the name of the item. Can be used as input
    * for subsequent actions.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param sKey New value for property <code>key</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setKey(sKey: String): TabContainerItem = js.native
  /**
    * Sets a new value for property <code>modified</code>.Shows if a control is edited (default is false).
    * Items that are marked as modified have a * symbol to indicate that they haven't been saved.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @param bModified New value for property <code>modified</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setModified(bModified: Boolean): TabContainerItem = js.native
  /**
    * Sets a new value for property <code>name</code>.Determines the text to be displayed for the
    * item.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code></code>.
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: String): TabContainerItem = js.native
  def setProperty(sName: String, vValue: String, bSuppressInvalidation: Boolean): TabContainerItem = js.native
  /**
    * Overwrites the method in order to suppress invalidation for some properties.
    * @param sName Property name to be set
    * @param vValue Property value to be set
    * @param bSuppressInvalidation Whether invalidation to be suppressed
    * @returns This instance for chaining
    */
  def setProperty(sName: String, vValue: Boolean, bSuppressInvalidation: Boolean): TabContainerItem = js.native
}

