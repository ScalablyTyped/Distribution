package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Menu")
@js.native
class Menu protected () extends Control {
  /**
    * Constructor for a new Menu.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: MenuItem): Menu = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>closed</code> event of this
    * <code>sap.m.Menu</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Menu</code> itself.Fired when the menu is closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Menu</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachClosed(oData: js.Any, fnFunction: js.Any): Menu = js.native
  def attachClosed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Menu = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>itemSelected</code> event of this
    * <code>sap.m.Menu</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Menu</code> itself.Fired when a <code>MenuItem</code> is selected.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Menu</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachItemSelected(oData: js.Any, fnFunction: js.Any): Menu = js.native
  def attachItemSelected(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Menu = js.native
  /**
    * Binds aggregation <code>items</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindItems(oBindingInfo: js.Any): Menu = js.native
  /**
    * Closes the <code>Menu</code>.
    */
  def close(): Unit = js.native
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): Menu = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>closed</code> event of this
    * <code>sap.m.Menu</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachClosed(fnFunction: js.Any, oListener: js.Any): Menu = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>itemSelected</code> event of this
    * <code>sap.m.Menu</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachItemSelected(fnFunction: js.Any, oListener: js.Any): Menu = js.native
  /**
    * Fires event <code>closed</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireClosed(mArguments: js.Any): Menu = js.native
  /**
    * Fires event <code>itemSelected</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>item</code> of type <code>sap.m.MenuItem</code>The <code>MenuItem</code>
    * which was selected.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireItemSelected(mArguments: js.Any): Menu = js.native
  /**
    * Gets content of aggregation <code>items</code>.Defines the items contained within this control.
    */
  def getItems(): js.Array[MenuItem] = js.native
  /**
    * Gets current value of property <code>title</code>.Defines the <code>Menu</code> title.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  /**
    * Checks for the provided <code>sap.m.MenuItem</code> in the aggregation <code>items</code>.and
    * returns its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: MenuItem): Double = js.native
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: MenuItem, iIndex: Double): Menu = js.native
  /**
    * Opens the <code>Menu</code> next to the given control.
    * @param oControl The control that defines the position for the menu
    * @param bWithKeyboard Whether the menu is opened with a shortcut or not
    */
  def openBy(oControl: js.Any, bWithKeyboard: js.Any): Unit = js.native
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[MenuItem] = js.native
  def removeItem(vItem: String): MenuItem = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: Double): MenuItem = js.native
  def removeItem(vItem: MenuItem): MenuItem = js.native
  /**
    * Sets the title of the <code>Menu</code>.
    * @param sTitle The new title of the <code>Menu</code>
    */
  def setTitle(sTitle: String): Unit = js.native
  /**
    * Unbinds aggregation <code>items</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindItems(): Menu = js.native
}

