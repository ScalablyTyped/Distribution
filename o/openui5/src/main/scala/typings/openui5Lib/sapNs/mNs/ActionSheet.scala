package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ActionSheet")
@js.native
class ActionSheet protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new ActionSheet.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some button to the aggregation <code>buttons</code>.
    * @param oButton the button to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addButton(oButton: Button): ActionSheet = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterClose</code> event of this
    * <code>sap.m.ActionSheet</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ActionSheet</code> itself.This event will be fired after the ActionSheet is closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ActionSheet</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterClose(oData: js.Any, fnFunction: js.Any): ActionSheet = js.native
  def attachAfterClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ActionSheet = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterOpen</code> event of this
    * <code>sap.m.ActionSheet</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ActionSheet</code> itself.This event will be fired after the ActionSheet is opened.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ActionSheet</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterOpen(oData: js.Any, fnFunction: js.Any): ActionSheet = js.native
  def attachAfterOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ActionSheet = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>beforeClose</code> event of this
    * <code>sap.m.ActionSheet</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ActionSheet</code> itself.This event will be fired before the ActionSheet is closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ActionSheet</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachBeforeClose(oData: js.Any, fnFunction: js.Any): ActionSheet = js.native
  def attachBeforeClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ActionSheet = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>beforeOpen</code> event of this
    * <code>sap.m.ActionSheet</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ActionSheet</code> itself.This event will be fired before the ActionSheet is opened.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ActionSheet</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachBeforeOpen(oData: js.Any, fnFunction: js.Any): ActionSheet = js.native
  def attachBeforeOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ActionSheet = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>cancelButtonPress</code> event of this
    * <code>sap.m.ActionSheet</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ActionSheet</code> itself.This event is fired when the cancelButton is clicked. For
    * iPad, this event is also fired when showCancelButton is set to true, and Popover is closed by
    * clicking outside.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ActionSheet</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachCancelButtonPress(oData: js.Any, fnFunction: js.Any): ActionSheet = js.native
  def attachCancelButtonPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ActionSheet = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>cancelButtonTap</code> event of this
    * <code>sap.m.ActionSheet</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ActionSheet</code> itself.This event is fired when the cancelButton is tapped. For iPad,
    * this event is also fired when showCancelButton is set to true, and Popover is closed by tapping
    * outside.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ActionSheet</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachCancelButtonTap(oData: js.Any, fnFunction: js.Any): ActionSheet = js.native
  def attachCancelButtonTap(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ActionSheet = js.native
  /**
    * Calling this method will make the ActionSheet disappear from the screen.
    */
  def close(): scala.Unit = js.native
  /**
    * Destroys all the buttons in the aggregation <code>buttons</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyButtons(): ActionSheet = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterClose</code> event of this
    * <code>sap.m.ActionSheet</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterClose(fnFunction: js.Any, oListener: js.Any): ActionSheet = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterOpen</code> event of this
    * <code>sap.m.ActionSheet</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterOpen(fnFunction: js.Any, oListener: js.Any): ActionSheet = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>beforeClose</code> event of this
    * <code>sap.m.ActionSheet</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachBeforeClose(fnFunction: js.Any, oListener: js.Any): ActionSheet = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>beforeOpen</code> event of this
    * <code>sap.m.ActionSheet</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachBeforeOpen(fnFunction: js.Any, oListener: js.Any): ActionSheet = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>cancelButtonPress</code> event of this
    * <code>sap.m.ActionSheet</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachCancelButtonPress(fnFunction: js.Any, oListener: js.Any): ActionSheet = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>cancelButtonTap</code> event of this
    * <code>sap.m.ActionSheet</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachCancelButtonTap(fnFunction: js.Any, oListener: js.Any): ActionSheet = js.native
  /**
    * Fires event <code>afterClose</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterClose(mArguments: js.Any): ActionSheet = js.native
  /**
    * Fires event <code>afterOpen</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterOpen(mArguments: js.Any): ActionSheet = js.native
  /**
    * Fires event <code>beforeClose</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireBeforeClose(mArguments: js.Any): ActionSheet = js.native
  /**
    * Fires event <code>beforeOpen</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireBeforeOpen(mArguments: js.Any): ActionSheet = js.native
  /**
    * Fires event <code>cancelButtonPress</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireCancelButtonPress(mArguments: js.Any): ActionSheet = js.native
  /**
    * Fires event <code>cancelButtonTap</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireCancelButtonTap(mArguments: js.Any): ActionSheet = js.native
  /**
    * Gets content of aggregation <code>buttons</code>.These buttons are added to the content area in
    * ActionSheet control. When button is tapped, the ActionSheet is closed before the tap event listener
    * is called.
    */
  def getButtons(): js.Array[Button] = js.native
  /**
    * Gets current value of property <code>cancelButtonText</code>.This is the text displayed in the
    * cancelButton. Default value is "Cancel", and it's translated according to the current locale
    * setting. This property will be ignored when running either in iPad or showCancelButton is set to
    * false.
    * @returns Value of property <code>cancelButtonText</code>
    */
  def getCancelButtonText(): java.lang.String = js.native
  /**
    * Gets current value of property <code>placement</code>.The ActionSheet behaves as a sap.m.Popover in
    * iPad and this property is the information about on which side will the popover be placed at.
    * Possible values are sap.m.PlacementType.Left, sap.m.PlacementType.Right, sap.m.PlacementType.Top,
    * sap.m.PlacementType.Bottom, sap.m.PlacementType.Horizontal,
    * sap.m.PlacementType.HorizontalPreferedLeft, sap.m.PlacementType.HorizontalPreferedRight,
    * sap.m.PlacementType.Vertical, sap.m.PlacementType.VerticalPreferedTop,
    * sap.m.PlacementType.VerticalPreferedBottom. The default value is sap.m.PlacementType.Bottom.Default
    * value is <code>Bottom</code>.
    * @returns Value of property <code>placement</code>
    */
  def getPlacement(): PlacementType = js.native
  /**
    * Gets current value of property <code>showCancelButton</code>.If this is set to true, there will be a
    * cancel button shown below the action buttons. There won't be any cancel button shown in iPad
    * regardless of this property. The default value is set to true.Default value is <code>true</code>.
    * @returns Value of property <code>showCancelButton</code>
    */
  def getShowCancelButton(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>title</code>.Title will be shown in the header area in iPhone
    * and every Android devices. This property will be ignored in tablets and desktop browser.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): java.lang.String = js.native
  /**
    * Checks for the provided <code>sap.m.Button</code> in the aggregation <code>buttons</code>.and
    * returns its index if found or -1 otherwise.
    * @param oButton The button whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfButton(oButton: Button): scala.Double = js.native
  /**
    * Inserts a button into the aggregation <code>buttons</code>.
    * @param oButton the button to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the button should be inserted at; for             a
    * negative value of <code>iIndex</code>, the button is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the button is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertButton(oButton: Button, iIndex: scala.Double): ActionSheet = js.native
  /**
    * The method checks if the ActionSheet is open. It returns true when the ActionSheet is currently open
    * (this includes opening and closing animations), otherwise it returns false.
    */
  def isOpen(): scala.Boolean = js.native
  /**
    * Calling this method will make the ActionSheet visible on the screen.
    * @param oControl The ActionSheet behaves as a sap.m.Popover in iPad and the control parameter is the
    * object to which the popover will be placed. It can be not only a UI5 control, but also an existing
    * dom reference. The side of the placement depends on the placement property set in the popover. In
    * other platforms, ActionSheet behaves as a standard dialog and this parameter is ignored because
    * dialog is aligned to the screen.
    */
  def openBy(oControl: js.Any): scala.Unit = js.native
  /**
    * Removes all the controls from the aggregation <code>buttons</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllButtons(): js.Array[Button] = js.native
  def removeButton(vButton: java.lang.String): Button = js.native
  def removeButton(vButton: Button): Button = js.native
  /**
    * Removes a button from the aggregation <code>buttons</code>.
    * @param vButton The button to remove or its index or id
    * @returns The removed button or <code>null</code>
    */
  def removeButton(vButton: scala.Double): Button = js.native
  /**
    * Sets a new value for property <code>cancelButtonText</code>.This is the text displayed in the
    * cancelButton. Default value is "Cancel", and it's translated according to the current locale
    * setting. This property will be ignored when running either in iPad or showCancelButton is set to
    * false.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sCancelButtonText New value for property <code>cancelButtonText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCancelButtonText(sCancelButtonText: java.lang.String): ActionSheet = js.native
  /**
    * Sets a new value for property <code>placement</code>.The ActionSheet behaves as a sap.m.Popover in
    * iPad and this property is the information about on which side will the popover be placed at.
    * Possible values are sap.m.PlacementType.Left, sap.m.PlacementType.Right, sap.m.PlacementType.Top,
    * sap.m.PlacementType.Bottom, sap.m.PlacementType.Horizontal,
    * sap.m.PlacementType.HorizontalPreferedLeft, sap.m.PlacementType.HorizontalPreferedRight,
    * sap.m.PlacementType.Vertical, sap.m.PlacementType.VerticalPreferedTop,
    * sap.m.PlacementType.VerticalPreferedBottom. The default value is sap.m.PlacementType.Bottom.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>Bottom</code>.
    * @param sPlacement New value for property <code>placement</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPlacement(sPlacement: PlacementType): ActionSheet = js.native
  /**
    * Sets a new value for property <code>showCancelButton</code>.If this is set to true, there will be a
    * cancel button shown below the action buttons. There won't be any cancel button shown in iPad
    * regardless of this property. The default value is set to true.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bShowCancelButton New value for property <code>showCancelButton</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowCancelButton(bShowCancelButton: scala.Boolean): ActionSheet = js.native
  /**
    * Sets a new value for property <code>title</code>.Title will be shown in the header area in iPhone
    * and every Android devices. This property will be ignored in tablets and desktop browser.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: java.lang.String): ActionSheet = js.native
}

