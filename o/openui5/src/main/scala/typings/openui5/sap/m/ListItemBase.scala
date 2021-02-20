package typings.openui5.sap.m

import typings.jquery.JQueryStatic
import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemBase extends Control {
  
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @since 1.28.0
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): ListItemBase = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): ListItemBase = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>detailPress</code> event of this
    * <code>sap.m.ListItemBase</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.ListItemBase</code> itself.Fires when the user clicks on the detail button of
    * the control.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ListItemBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachDetailPress(oData: js.Any, fnFunction: js.Any): ListItemBase = js.native
  def attachDetailPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ListItemBase = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>detailTap</code> event of this
    * <code>sap.m.ListItemBase</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.ListItemBase</code> itself.Fires when the user taps on the detail button of the
    * control.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ListItemBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachDetailTap(oData: js.Any, fnFunction: js.Any): ListItemBase = js.native
  def attachDetailTap(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ListItemBase = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.m.ListItemBase</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.ListItemBase</code> itself.Fires when the user clicks on the
    * control.<b>Note:</b> This event is not fired when the parent <code>mode</code> is
    * <code>SingleSelectMaster</code> or when the <code>includeItemInSelection</code> property is set to
    * <code>true</code>.If there is an interactive element that handles its own <code>press</code> event
    * then the list item's <code>press</code> event is not fired.Also see {@link
    * sap.m.ListBase#attachItemPress}.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ListItemBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): ListItemBase = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ListItemBase = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>tap</code> event of this
    * <code>sap.m.ListItemBase</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.ListItemBase</code> itself.Fires when the user taps on the control.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ListItemBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachTap(oData: js.Any, fnFunction: js.Any): ListItemBase = js.native
  def attachTap(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ListItemBase = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>detailPress</code> event of this
    * <code>sap.m.ListItemBase</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachDetailPress(fnFunction: js.Any, oListener: js.Any): ListItemBase = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>detailTap</code> event of this
    * <code>sap.m.ListItemBase</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachDetailTap(fnFunction: js.Any, oListener: js.Any): ListItemBase = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.m.ListItemBase</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): ListItemBase = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>tap</code> event of this
    * <code>sap.m.ListItemBase</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachTap(fnFunction: js.Any, oListener: js.Any): ListItemBase = js.native
  
  /**
    * Fires event <code>detailPress</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireDetailPress(mArguments: js.Any): ListItemBase = js.native
  
  /**
    * Fires event <code>detailTap</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireDetailTap(mArguments: js.Any): ListItemBase = js.native
  
  /**
    * Fires event <code>press</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): ListItemBase = js.native
  
  /**
    * Fires event <code>tap</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireTap(mArguments: js.Any): ListItemBase = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    * @since 1.28.0
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  
  /**
    * Gets current value of property <code>counter</code>.Defines the counter value of the list items.
    * @returns Value of property <code>counter</code>
    */
  def getCounter(): Double = js.native
  
  /**
    * Gets current value of property <code>selected</code>.Defines the selected state of the list
    * items.<b>Note:</b> Binding the <code>selected</code> property in single selection modes may cause
    * unwanted results if you have more than one selected items in your binding.Default value is
    * <code>false</code>.
    * @returns Value of property <code>selected</code>
    */
  def getSelected(): Boolean = js.native
  
  /**
    * Returns the tabbable DOM elements as a jQuery collection
    * @since 1.26
    * @returns jQuery object
    */
  def getTabbables(): JQueryStatic = js.native
  
  /**
    * Gets current value of property <code>type</code>.Defines the visual indication and behavior of the
    * list items, e.g. <code>Active</code>, <code>Navigation</code>, <code>Detail</code>.Default value is
    * <code>Inactive</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): ListType = js.native
  
  /**
    * Gets current value of property <code>unread</code>.Activates the unread indicator for the list item,
    * if set to <code>true</code>.<b>Note:</b> This flag is ignored when the <code>showUnread</code>
    * property of the parent is set to <code>false</code>.Default value is <code>false</code>.
    * @returns Value of property <code>unread</code>
    */
  def getUnread(): Boolean = js.native
  
  /**
    * Returns the state of the item selection as a boolean
    */
  var isSelected: js.Any = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @since 1.28.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @since 1.28.0
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  
  /**
    * Sets a new value for property <code>counter</code>.Defines the counter value of the list items.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param iCounter New value for property <code>counter</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCounter(iCounter: Double): ListItemBase = js.native
  
  /**
    * Sets a new value for property <code>selected</code>.Defines the selected state of the list
    * items.<b>Note:</b> Binding the <code>selected</code> property in single selection modes may cause
    * unwanted results if you have more than one selected items in your binding.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bSelected New value for property <code>selected</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSelected(bSelected: Boolean): ListItemBase = js.native
  
  /**
    * Sets a new value for property <code>type</code>.Defines the visual indication and behavior of the
    * list items, e.g. <code>Active</code>, <code>Navigation</code>, <code>Detail</code>.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Inactive</code>.
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: ListType): ListItemBase = js.native
  
  /**
    * Sets a new value for property <code>unread</code>.Activates the unread indicator for the list item,
    * if set to <code>true</code>.<b>Note:</b> This flag is ignored when the <code>showUnread</code>
    * property of the parent is set to <code>false</code>.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bUnread New value for property <code>unread</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUnread(bUnread: Boolean): ListItemBase = js.native
}
