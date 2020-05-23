package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.ValueState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog extends Control {
  /**
    * Returns the custom header instance when the customHeader aggregation is set. Otherwise it returns
    * the internal managedheader instance. This method can be called within composite controls which use
    * sap.m.Dialog inside.
    */
  def _getAnyHeader(): Unit = js.native
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): Dialog = js.native
  def addAriaDescribedBy(vAriaDescribedBy: Control): Dialog = js.native
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Dialog = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): Dialog = js.native
  /**
    * Adds some button to the aggregation <code>buttons</code>.
    * @since 1.21.1
    * @param oButton the button to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addButton(oButton: Button): Dialog = js.native
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: Control): Dialog = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterClose</code> event of this
    * <code>sap.m.Dialog</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Dialog</code> itself.This event will be fired after the dialog is closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Dialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterClose(oData: js.Any, fnFunction: js.Any): Dialog = js.native
  def attachAfterClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Dialog = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterOpen</code> event of this
    * <code>sap.m.Dialog</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Dialog</code> itself.This event will be fired after the dialog is opened.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Dialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterOpen(oData: js.Any, fnFunction: js.Any): Dialog = js.native
  def attachAfterOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Dialog = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>beforeClose</code> event of this
    * <code>sap.m.Dialog</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Dialog</code> itself.This event will be fired before the dialog is closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Dialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachBeforeClose(oData: js.Any, fnFunction: js.Any): Dialog = js.native
  def attachBeforeClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Dialog = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>beforeOpen</code> event of this
    * <code>sap.m.Dialog</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Dialog</code> itself.This event will be fired before the dialog is opened.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Dialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachBeforeOpen(oData: js.Any, fnFunction: js.Any): Dialog = js.native
  def attachBeforeOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Dialog = js.native
  /**
    * Close the dialog.
    */
  def close(): Unit = js.native
  /**
    * Destroys the beginButton in the aggregation <code>beginButton</code>.
    * @since 1.15.1
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyBeginButton(): Dialog = js.native
  /**
    * Destroys all the buttons in the aggregation <code>buttons</code>.
    * @since 1.21.1
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyButtons(): Dialog = js.native
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): Dialog = js.native
  /**
    * Destroys the customHeader in the aggregation <code>customHeader</code>.
    * @since 1.15.1
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyCustomHeader(): Dialog = js.native
  /**
    * Destroys the endButton in the aggregation <code>endButton</code>.
    * @since 1.15.1
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyEndButton(): Dialog = js.native
  /**
    * Destroys the subHeader in the aggregation <code>subHeader</code>.
    * @since 1.12.2
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySubHeader(): Dialog = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterClose</code> event of this
    * <code>sap.m.Dialog</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterClose(fnFunction: js.Any, oListener: js.Any): Dialog = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterOpen</code> event of this
    * <code>sap.m.Dialog</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterOpen(fnFunction: js.Any, oListener: js.Any): Dialog = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>beforeClose</code> event of this
    * <code>sap.m.Dialog</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachBeforeClose(fnFunction: js.Any, oListener: js.Any): Dialog = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>beforeOpen</code> event of this
    * <code>sap.m.Dialog</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachBeforeOpen(fnFunction: js.Any, oListener: js.Any): Dialog = js.native
  /**
    * Fires event <code>afterClose</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>origin</code> of type <code>sap.m.Button</code>This indicates the trigger
    * of closing the dialog. If dialog is closed by either leftButton or rightButton, the button that
    * closes the dialog is set to this parameter. Otherwise this parameter is set to null.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterClose(mArguments: js.Any): Dialog = js.native
  /**
    * Fires event <code>afterOpen</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterOpen(mArguments: js.Any): Dialog = js.native
  /**
    * Fires event <code>beforeClose</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>origin</code> of type <code>sap.m.Button</code>This indicates the trigger
    * of closing the dialog. If dialog is closed by either leftButton or rightButton, the button that
    * closes the dialog is set to this parameter. Otherwise this parameter is set to null.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireBeforeClose(mArguments: js.Any): Dialog = js.native
  /**
    * Fires event <code>beforeOpen</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireBeforeOpen(mArguments: js.Any): Dialog = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaDescribedBy</code>.
    */
  def getAriaDescribedBy(): js.Array[_] = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets content of aggregation <code>beginButton</code>.The button which is rendered to the left side
    * (right side in RTL mode) of the endButton in the footer area inside the dialog. From UI5 version
    * 1.21.1, there's a new aggregation "buttons" created with which more than 2 buttons can be added to
    * the footer area of dialog. If the new "buttons" aggregation is set, any change made to this
    * aggregation has no effect anymore. When runs on the phone, this button (and the endButton together
    * when set) is (are) rendered at the center of the footer area. When runs on the other platforms, this
    * button (and the endButton together when set) is (are) rendered at the right side (left side in RTL
    * mode) of the footer area.
    * @since 1.15.1
    */
  def getBeginButton(): Button = js.native
  /**
    * Gets content of aggregation <code>buttons</code>.Buttons can be added to the footer area of dialog
    * through this aggregation. When this aggregation is set, any change to beginButton and endButton has
    * no effect anymore. Buttons which are inside this aggregation are aligned at the right side (left
    * side in RTL mode) of the footer instead of in the middle of the footer.
    * @since 1.21.1
    */
  def getButtons(): js.Array[Button] = js.native
  /**
    * Gets content of aggregation <code>content</code>.The content inside the dialog.<br/><b>Note:</b>
    * When the content of the <code>Dialog</code> is comprised of controls that use <code>position:
    * absolute</code>, such as <code>SplitContainer</code>, the dialog has to have either <code>stretch:
    * true</code> or <code>contentHeight</code> set.
    */
  def getContent(): js.Array[Control] = js.native
  /**
    * Gets current value of property <code>contentHeight</code>.Preferred height of content in Dialog. If
    * the preferred height is bigger than the available space on screen, it will be overwritten by the
    * maximum available height on screen in order to make sure that dialog isn't cut off.
    * @since 1.12.1
    * @returns Value of property <code>contentHeight</code>
    */
  def getContentHeight(): js.Any = js.native
  /**
    * Gets current value of property <code>contentWidth</code>.Preferred width of content in Dialog. This
    * property affects the width of dialog on phone in landscape mode, tablet or desktop, because the
    * dialog has a fixed width on phone in portrait mode. If the preferred width is less than the minimum
    * width of dilaog or more than the available width of the screen, it will be overwritten by the min or
    * max value. The current mininum value of dialog width on tablet is 400px.
    * @since 1.12.1
    * @returns Value of property <code>contentWidth</code>
    */
  def getContentWidth(): js.Any = js.native
  /**
    * Gets content of aggregation <code>customHeader</code>.CustomHeader is only supported in theme
    * sap_bluecrystal. When it's set, the icon, title and showHeader are properties ignored. Only the
    * customHeader is shown as the header of the dialog.
    * @since 1.15.1
    */
  def getCustomHeader(): IBar = js.native
  /**
    * Gets current value of property <code>draggable</code>.Indicates whether the dialog is draggable. If
    * this property is set to true, the dialog will be draggable by it's header. This property has a
    * default value false. The Dialog can be draggable only in desktop mode.Default value is
    * <code>false</code>.
    * @since 1.30
    * @returns Value of property <code>draggable</code>
    */
  def getDraggable(): Boolean = js.native
  /**
    * Gets content of aggregation <code>endButton</code>.The button which is rendered to the right side
    * (left side in RTL mode) of the beginButton in the footer area inside the dialog. From UI5 version
    * 1.21.1, there's a new aggregation "buttons" created with which more than 2 buttons can be added to
    * the footer area of dialog. If the new "buttons" aggregation is set, any change made to this
    * aggregation has no effect anymore. When runs on the phone, this button (and the beginButton together
    * when set) is (are) rendered at the center of the footer area. When runs on the other platforms, this
    * button (and the beginButton together when set) is (are) rendered at the right side (left side in RTL
    * mode) of the footer area.
    * @since 1.15.1
    */
  def getEndButton(): Button = js.native
  /**
    * Gets current value of property <code>horizontalScrolling</code>.Indicates if user can scroll
    * horizontally inside dialog when the content is bigger than the content area.Dialog detects if
    * there's sap.m.NavContainer, sap.m.Page, or sap.m.ScrollContainer as direct child added to dialog. If
    * there is, dialog will turn off scrolling by setting this property to false automatically ignoring
    * the existing value of this property.Default value is <code>true</code>.
    * @since 1.15.1
    * @returns Value of property <code>horizontalScrolling</code>
    */
  def getHorizontalScrolling(): Boolean = js.native
  /**
    * Gets current value of property <code>icon</code>.Icon displayed in the dialog's header. This icon is
    * invisible on the iOS platform and it's density aware. You can use the density convention (@2, @1.5,
    * etc.) to provide higher resolution image for higher density screen.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * ID of the element which is the current target of the association <code>initialFocus</code>, or
    * <code>null</code>.
    * @since 1.15.0
    */
  def getInitialFocus(): js.Any = js.native
  /**
    * ID of the element which is the current target of the association <code>leftButton</code>, or
    * <code>null</code>.
    */
  def getLeftButton(): js.Any = js.native
  /**
    * Gets current value of property <code>resizable</code>.Indicates whether the dialog is resizable. the
    * dialog is resizable. If this property is set to true, the dialog will have a resize handler in it's
    * bottom right corner. This property has a default value false. The Dialog can be resizable only in
    * desktop mode.Default value is <code>false</code>.
    * @since 1.30
    * @returns Value of property <code>resizable</code>
    */
  def getResizable(): Boolean = js.native
  /**
    * ID of the element which is the current target of the association <code>rightButton</code>, or
    * <code>null</code>.
    */
  def getRightButton(): js.Any = js.native
  /**
    * Gets current value of property <code>showHeader</code>.Determines whether the header is shown inside
    * the dialog. If this property is set to true, the text and icon property are ignored. This property
    * has a default value true.Default value is <code>true</code>.
    * @since 1.15.1
    * @returns Value of property <code>showHeader</code>
    */
  def getShowHeader(): Boolean = js.native
  /**
    * Gets current value of property <code>state</code>.The state affects the icon and the title color. If
    * other than "None" is set, a predefined icon will be added to the dialog. Setting icon property will
    * overwrite the predefined icon. The default value is "None" which doesn't add any icon to the Dialog
    * control. This property is by now only supported by blue crystal theme.Default value is
    * <code>None</code>.
    * @since 1.11.2
    * @returns Value of property <code>state</code>
    */
  def getState(): ValueState = js.native
  /**
    * Gets current value of property <code>stretch</code>.Determines  if the dialog will be stretched to
    * full screen. This property is only applicable to standard dialog and message type dialog ignores
    * this property.Default value is <code>false</code>.
    * @since 1.13.1
    * @returns Value of property <code>stretch</code>
    */
  def getStretch(): Boolean = js.native
  /**
    * Gets current value of property <code>stretchOnPhone</code>.Determines whether the dialog will
    * displayed on full screen on a phone.Default value is <code>false</code>.
    * @since 1.11.2
    * @returns Value of property <code>stretchOnPhone</code>
    */
  def getStretchOnPhone(): Boolean = js.native
  /**
    * Gets content of aggregation <code>subHeader</code>.When subHeader is assigned to Dialog, it's
    * rendered directly after the main header in Dialog. SubHeader is out of the content area and won't be
    * scrolled when content's size is bigger than the content area's size.
    * @since 1.12.2
    */
  def getSubHeader(): IBar = js.native
  /**
    * Gets current value of property <code>title</code>.Title text appears in the dialog header.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  /**
    * Gets current value of property <code>type</code>.The type of the dialog. In theme sap_bluecrystal,
    * the type "message" will limit the dialog's width within 480px on tablet and desktop.Default value is
    * <code>Standard</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): DialogType = js.native
  /**
    * Gets current value of property <code>verticalScrolling</code>.Indicates if user can scroll
    * vertically inside dialog when the content is bigger than the content area.Dialog detects if there's
    * sap.m.NavContainer, sap.m.Page, or sap.m.ScrollContainer as direct child added to dialog. If there
    * is, dialog will turn off scrolling by setting this property to false automatically ignoring the
    * existing value of this property.Default value is <code>true</code>.
    * @since 1.15.1
    * @returns Value of property <code>verticalScrolling</code>
    */
  def getVerticalScrolling(): Boolean = js.native
  /**
    * Checks for the provided <code>sap.m.Button</code> in the aggregation <code>buttons</code>.and
    * returns its index if found or -1 otherwise.
    * @since 1.21.1
    * @param oButton The button whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfButton(oButton: Button): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
    * returns its index if found or -1 otherwise.
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: Control): Double = js.native
  /**
    * Inserts a button into the aggregation <code>buttons</code>.
    * @since 1.21.1
    * @param oButton the button to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the button should be inserted at; for             a
    * negative value of <code>iIndex</code>, the button is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the button is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertButton(oButton: Button, iIndex: Double): Dialog = js.native
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: Control, iIndex: Double): Dialog = js.native
  /**
    * The method checks if the Dialog is open. It returns true when the Dialog is currently open (this
    * includes opening and closing animations), otherwise it returns false.
    * @since 1.9.1
    */
  def isOpen(): Unit = js.native
  /**
    * Open the dialog.
    */
  def open(): Unit = js.native
  /**
    * Removes all the controls in the association named <code>ariaDescribedBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaDescribedBy(): js.Array[_] = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Removes all the controls from the aggregation <code>buttons</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @since 1.21.1
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllButtons(): js.Array[Button] = js.native
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[Control] = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
    * @returns The removed ariaDescribedBy or <code>null</code>
    */
  def removeAriaDescribedBy(vAriaDescribedBy: Double): js.Any = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Control): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  def removeButton(vButton: String): Button = js.native
  /**
    * Removes a button from the aggregation <code>buttons</code>.
    * @since 1.21.1
    * @param vButton The button to remove or its index or id
    * @returns The removed button or <code>null</code>
    */
  def removeButton(vButton: Double): Button = js.native
  def removeButton(vButton: Button): Button = js.native
  def removeContent(vContent: String): Control = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: Double): Control = js.native
  def removeContent(vContent: Control): Control = js.native
  /**
    * Sets the aggregated <code>beginButton</code>.
    * @since 1.15.1
    * @param oBeginButton The beginButton to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBeginButton(oBeginButton: Button): Dialog = js.native
  /**
    * Sets a new value for property <code>contentHeight</code>.Preferred height of content in Dialog. If
    * the preferred height is bigger than the available space on screen, it will be overwritten by the
    * maximum available height on screen in order to make sure that dialog isn't cut off.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.12.1
    * @param sContentHeight New value for property <code>contentHeight</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContentHeight(sContentHeight: js.Any): Dialog = js.native
  /**
    * Sets a new value for property <code>contentWidth</code>.Preferred width of content in Dialog. This
    * property affects the width of dialog on phone in landscape mode, tablet or desktop, because the
    * dialog has a fixed width on phone in portrait mode. If the preferred width is less than the minimum
    * width of dilaog or more than the available width of the screen, it will be overwritten by the min or
    * max value. The current mininum value of dialog width on tablet is 400px.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.12.1
    * @param sContentWidth New value for property <code>contentWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContentWidth(sContentWidth: js.Any): Dialog = js.native
  /**
    * Sets the aggregated <code>customHeader</code>.
    * @since 1.15.1
    * @param oCustomHeader The customHeader to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomHeader(oCustomHeader: IBar): Dialog = js.native
  /**
    * Sets a new value for property <code>draggable</code>.Indicates whether the dialog is draggable. If
    * this property is set to true, the dialog will be draggable by it's header. This property has a
    * default value false. The Dialog can be draggable only in desktop mode.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @since 1.30
    * @param bDraggable New value for property <code>draggable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDraggable(bDraggable: Boolean): Dialog = js.native
  /**
    * Sets the aggregated <code>endButton</code>.
    * @since 1.15.1
    * @param oEndButton The endButton to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEndButton(oEndButton: Button): Dialog = js.native
  /**
    * Sets a new value for property <code>horizontalScrolling</code>.Indicates if user can scroll
    * horizontally inside dialog when the content is bigger than the content area.Dialog detects if
    * there's sap.m.NavContainer, sap.m.Page, or sap.m.ScrollContainer as direct child added to dialog. If
    * there is, dialog will turn off scrolling by setting this property to false automatically ignoring
    * the existing value of this property.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @since 1.15.1
    * @param bHorizontalScrolling New value for property <code>horizontalScrolling</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHorizontalScrolling(bHorizontalScrolling: Boolean): Dialog = js.native
  /**
    * Sets a new value for property <code>icon</code>.Icon displayed in the dialog's header. This icon is
    * invisible on the iOS platform and it's density aware. You can use the density convention (@2, @1.5,
    * etc.) to provide higher resolution image for higher density screen.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): Dialog = js.native
  /**
    * Sets the associated <code>initialFocus</code>.
    * @since 1.15.0
    * @param oInitialFocus ID of an element which becomes the new target of this initialFocus association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInitialFocus(oInitialFocus: js.Any): Dialog = js.native
  def setInitialFocus(oInitialFocus: Control): Dialog = js.native
  /**
    * Sets the associated <code>leftButton</code>.
    * @param oLeftButton ID of an element which becomes the new target of this leftButton association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLeftButton(oLeftButton: js.Any): Dialog = js.native
  def setLeftButton(oLeftButton: Button): Dialog = js.native
  /**
    * Sets a new value for property <code>resizable</code>.Indicates whether the dialog is resizable. the
    * dialog is resizable. If this property is set to true, the dialog will have a resize handler in it's
    * bottom right corner. This property has a default value false. The Dialog can be resizable only in
    * desktop mode.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>false</code>.
    * @since 1.30
    * @param bResizable New value for property <code>resizable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setResizable(bResizable: Boolean): Dialog = js.native
  /**
    * Sets the associated <code>rightButton</code>.
    * @param oRightButton ID of an element which becomes the new target of this rightButton association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRightButton(oRightButton: js.Any): Dialog = js.native
  def setRightButton(oRightButton: Button): Dialog = js.native
  /**
    * Sets a new value for property <code>showHeader</code>.Determines whether the header is shown inside
    * the dialog. If this property is set to true, the text and icon property are ignored. This property
    * has a default value true.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>true</code>.
    * @since 1.15.1
    * @param bShowHeader New value for property <code>showHeader</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowHeader(bShowHeader: Boolean): Dialog = js.native
  /**
    * Sets a new value for property <code>state</code>.The state affects the icon and the title color. If
    * other than "None" is set, a predefined icon will be added to the dialog. Setting icon property will
    * overwrite the predefined icon. The default value is "None" which doesn't add any icon to the Dialog
    * control. This property is by now only supported by blue crystal theme.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>None</code>.
    * @since 1.11.2
    * @param sState New value for property <code>state</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setState(sState: ValueState): Dialog = js.native
  /**
    * Sets a new value for property <code>stretch</code>.Determines  if the dialog will be stretched to
    * full screen. This property is only applicable to standard dialog and message type dialog ignores
    * this property.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>false</code>.
    * @since 1.13.1
    * @param bStretch New value for property <code>stretch</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStretch(bStretch: Boolean): Dialog = js.native
  /**
    * Sets a new value for property <code>stretchOnPhone</code>.Determines whether the dialog will
    * displayed on full screen on a phone.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.11.2
    * @param bStretchOnPhone New value for property <code>stretchOnPhone</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStretchOnPhone(bStretchOnPhone: Boolean): Dialog = js.native
  /**
    * Sets the aggregated <code>subHeader</code>.
    * @since 1.12.2
    * @param oSubHeader The subHeader to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSubHeader(oSubHeader: IBar): Dialog = js.native
  /**
    * Sets a new value for property <code>title</code>.Title text appears in the dialog header.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: String): Dialog = js.native
  /**
    * Sets a new value for property <code>type</code>.The type of the dialog. In theme sap_bluecrystal,
    * the type "message" will limit the dialog's width within 480px on tablet and desktop.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Standard</code>.
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: DialogType): Dialog = js.native
  /**
    * Sets a new value for property <code>verticalScrolling</code>.Indicates if user can scroll vertically
    * inside dialog when the content is bigger than the content area.Dialog detects if there's
    * sap.m.NavContainer, sap.m.Page, or sap.m.ScrollContainer as direct child added to dialog. If there
    * is, dialog will turn off scrolling by setting this property to false automatically ignoring the
    * existing value of this property.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @since 1.15.1
    * @param bVerticalScrolling New value for property <code>verticalScrolling</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVerticalScrolling(bVerticalScrolling: Boolean): Dialog = js.native
}

