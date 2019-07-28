package typings.openui5.sapNs.uiNs.unifiedNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import typings.openui5.sapNs.uiNs.coreNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.Menu")
@js.native
class Menu protected () extends Control {
  /**
    * Constructor for a new Menu control.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId Id for the new control, generated automatically if no id is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @since 1.26.3
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Menu = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): Menu = js.native
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: MenuItemBase): Menu = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>itemSelect</code> event of this
    * <code>sap.ui.unified.Menu</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.Menu</code> itself.Fired on the root menu of a menu hierarchy whenever
    * a user selects an item within the menu or within one of its direct or indirect submenus.<b>Note:</b>
    * There is also a select event available for each single menu item. This event and the event of the
    * menu items are redundant.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.Menu</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachItemSelect(oData: js.Any, fnFunction: js.Any): Menu = js.native
  def attachItemSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Menu = js.native
  /**
    * Closes the menu.
    */
  def close(): Unit = js.native
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): Menu = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>itemSelect</code> event of this
    * <code>sap.ui.unified.Menu</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachItemSelect(fnFunction: js.Any, oListener: js.Any): Menu = js.native
  /**
    * Fires event <code>itemSelect</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>item</code> of type <code>sap.ui.unified.MenuItemBase</code>The action
    * (item) which was selected by the user.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireItemSelect(mArguments: js.Any): Menu = js.native
  /**
    * Gets current value of property <code>ariaDescription</code>.Accessible label / description of the
    * menu for assistive technologies like screenreaders.
    * @returns Value of property <code>ariaDescription</code>
    */
  def getAriaDescription(): String = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    * @since 1.26.3
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>enabled</code>.When a menu is disabled none of its items can be
    * selected by the user.The enabled property of an item (@link sap.ui.unified.MenuItemBase#getEnabled)
    * has no effect when the menu of the item is disabled.Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  /**
    * Gets content of aggregation <code>items</code>.The available actions to be displayed as items of the
    * menu.
    */
  def getItems(): js.Array[MenuItemBase] = js.native
  /**
    * Gets current value of property <code>maxVisibleItems</code>.The maximum number of items which are
    * displayed before an overflow mechanism takes effect.A value smaller than 1 means an infinite number
    * of visible items.The overall height of the menu is limited by the height of the screen. If the
    * maximum possible height is reached, anoverflow takes effect, even if the maximum number of visible
    * items is not yet reached.Default value is <code>0</code>.
    * @returns Value of property <code>maxVisibleItems</code>
    */
  def getMaxVisibleItems(): Double = js.native
  /**
    * Gets current value of property <code>pageSize</code>.The keyboard can be used to navigate through
    * the items of a menu. Beside the arrow keys for single steps and the <i>Home</i> / <i>End</i> keys
    * for jumpingto the first / last item, the <i>Page Up</i> / <i>Page Down</i> keys can be used to jump
    * an arbitrary number of items up or down. This number can be defined via the <code>pageSize</code>
    * property.For values smaller than 1, paging behaves in a similar way to when using the <i>Home</i> /
    * <i>End</i> keys. If the value equals 1, the paging behavior is similar to that of the arrow
    * keys.Default value is <code>5</code>.
    * @since 1.25.0
    * @returns Value of property <code>pageSize</code>
    */
  def getPageSize(): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.MenuItemBase</code> in the aggregation
    * <code>items</code>.and returns its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: MenuItemBase): Double = js.native
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: MenuItemBase, iIndex: Double): Menu = js.native
  def open(bWithKeyboard: Boolean, oOpenerRef: js.Any, sMy: js.Any, sAt: js.Any, oOf: js.Any): Unit = js.native
  def open(bWithKeyboard: Boolean, oOpenerRef: js.Any, sMy: js.Any, sAt: js.Any, oOf: js.Any, sOffset: String): Unit = js.native
  def open(
    bWithKeyboard: Boolean,
    oOpenerRef: js.Any,
    sMy: js.Any,
    sAt: js.Any,
    oOf: js.Any,
    sOffset: String,
    sCollision: js.Any
  ): Unit = js.native
  def open(bWithKeyboard: Boolean, oOpenerRef: js.Any, sMy: js.Any, sAt: js.Any, oOf: Element): Unit = js.native
  def open(
    bWithKeyboard: Boolean,
    oOpenerRef: js.Any,
    sMy: js.Any,
    sAt: js.Any,
    oOf: Element,
    sOffset: String
  ): Unit = js.native
  def open(
    bWithKeyboard: Boolean,
    oOpenerRef: js.Any,
    sMy: js.Any,
    sAt: js.Any,
    oOf: Element,
    sOffset: String,
    sCollision: js.Any
  ): Unit = js.native
  def open(bWithKeyboard: Boolean, oOpenerRef: Element, sMy: js.Any, sAt: js.Any, oOf: js.Any): Unit = js.native
  def open(
    bWithKeyboard: Boolean,
    oOpenerRef: Element,
    sMy: js.Any,
    sAt: js.Any,
    oOf: js.Any,
    sOffset: String
  ): Unit = js.native
  def open(
    bWithKeyboard: Boolean,
    oOpenerRef: Element,
    sMy: js.Any,
    sAt: js.Any,
    oOf: js.Any,
    sOffset: String,
    sCollision: js.Any
  ): Unit = js.native
  /**
    * Opens the menu at the specified position.The position of the menu is defined relative to an element
    * in the visible DOM by specifyingthe docking location of the menu and of the related element.See
    * {@link sap.ui.core.Popup#open Popup#open} for further details about popup positioning.
    * @param bWithKeyboard Indicates whether or not the first item shall be highlighted when the menu is
    * opened (keyboard case)
    * @param oOpenerRef The element which will get the focus back again after the menu was closed
    * @param sMy The reference docking location of the menu for positioning the menu on the screen
    * @param sAt The 'of' element's reference docking location for positioning the menu on the screen
    * @param oOf The menu is positioned relatively to this element based on the given dock locations
    * @param sOffset The offset relative to the docking point, specified as a string with space-separated
    * pixel values (e.g. "0 10" to move the popup 10 pixels to the right)
    * @param sCollision The collision defines how the position of the menu should be adjusted in case it
    * overflows the window in some direction
    */
  def open(bWithKeyboard: Boolean, oOpenerRef: Element, sMy: js.Any, sAt: js.Any, oOf: Element): Unit = js.native
  def open(
    bWithKeyboard: Boolean,
    oOpenerRef: Element,
    sMy: js.Any,
    sAt: js.Any,
    oOf: Element,
    sOffset: String
  ): Unit = js.native
  def open(
    bWithKeyboard: Boolean,
    oOpenerRef: Element,
    sMy: js.Any,
    sAt: js.Any,
    oOf: Element,
    sOffset: String,
    sCollision: js.Any
  ): Unit = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @since 1.26.3
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[MenuItemBase] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @since 1.26.3
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  def removeItem(vItem: String): MenuItemBase = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: Double): MenuItemBase = js.native
  def removeItem(vItem: MenuItemBase): MenuItemBase = js.native
  /**
    * Sets a new value for property <code>ariaDescription</code>.Accessible label / description of the
    * menu for assistive technologies like screenreaders.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sAriaDescription New value for property <code>ariaDescription</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAriaDescription(sAriaDescription: String): Menu = js.native
  /**
    * Sets a new value for property <code>enabled</code>.When a menu is disabled none of its items can be
    * selected by the user.The enabled property of an item (@link sap.ui.unified.MenuItemBase#getEnabled)
    * has no effect when the menu of the item is disabled.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): Menu = js.native
  /**
    * Sets a new value for property <code>maxVisibleItems</code>.The maximum number of items which are
    * displayed before an overflow mechanism takes effect.A value smaller than 1 means an infinite number
    * of visible items.The overall height of the menu is limited by the height of the screen. If the
    * maximum possible height is reached, anoverflow takes effect, even if the maximum number of visible
    * items is not yet reached.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>0</code>.
    * @param iMaxVisibleItems New value for property <code>maxVisibleItems</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxVisibleItems(iMaxVisibleItems: Double): Menu = js.native
  /**
    * Sets a new value for property <code>pageSize</code>.The keyboard can be used to navigate through the
    * items of a menu. Beside the arrow keys for single steps and the <i>Home</i> / <i>End</i> keys for
    * jumpingto the first / last item, the <i>Page Up</i> / <i>Page Down</i> keys can be used to jump an
    * arbitrary number of items up or down. This number can be defined via the <code>pageSize</code>
    * property.For values smaller than 1, paging behaves in a similar way to when using the <i>Home</i> /
    * <i>End</i> keys. If the value equals 1, the paging behavior is similar to that of the arrow
    * keys.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>5</code>.
    * @since 1.25.0
    * @param iPageSize New value for property <code>pageSize</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPageSize(iPageSize: Double): Menu = js.native
}

