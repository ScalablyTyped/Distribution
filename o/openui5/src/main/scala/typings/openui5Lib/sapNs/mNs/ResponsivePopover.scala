package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ResponsivePopover")
@js.native
class ResponsivePopover protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
         * Constructor for a new ResponsivePopover.Accepts an object literal <code>mSettings</code> that
         * defines initialproperty values, aggregated and associated objects as well as event handlers.See
         * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
         * settings object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new ResponsivePopover.Accepts an object literal <code>mSettings</code> that
         * defines initialproperty values, aggregated and associated objects as well as event handlers.See
         * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
         * settings object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): ResponsivePopover = js.native
  /**
         * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addAriaDescribedBy(vAriaDescribedBy: openui5Lib.sapNs.uiNs.coreNs.Control): ResponsivePopover = js.native
  /**
         * Adds content to the ResponsivePopover
         * @param oControl The control to be added to the content
        */
  def addContent(oControl: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Unit = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>afterClose</code> event of this
         * <code>sap.m.ResponsivePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ResponsivePopover</code> itself.Event is fired after popover or dialog is
         * closed.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ResponsivePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachAfterClose(oData: js.Any, fnFunction: js.Any): ResponsivePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>afterClose</code> event of this
         * <code>sap.m.ResponsivePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ResponsivePopover</code> itself.Event is fired after popover or dialog is
         * closed.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ResponsivePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachAfterClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ResponsivePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>afterOpen</code> event of this
         * <code>sap.m.ResponsivePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ResponsivePopover</code> itself.Event is fired after popover or dialog is open.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ResponsivePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachAfterOpen(oData: js.Any, fnFunction: js.Any): ResponsivePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>afterOpen</code> event of this
         * <code>sap.m.ResponsivePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ResponsivePopover</code> itself.Event is fired after popover or dialog is open.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ResponsivePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachAfterOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ResponsivePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>beforeClose</code> event of this
         * <code>sap.m.ResponsivePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ResponsivePopover</code> itself.Event is fired before popover or dialog is
         * closed.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ResponsivePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachBeforeClose(oData: js.Any, fnFunction: js.Any): ResponsivePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>beforeClose</code> event of this
         * <code>sap.m.ResponsivePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ResponsivePopover</code> itself.Event is fired before popover or dialog is
         * closed.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ResponsivePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachBeforeClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ResponsivePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>beforeOpen</code> event of this
         * <code>sap.m.ResponsivePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ResponsivePopover</code> itself.Event is fired before popover or dialog is open.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ResponsivePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachBeforeOpen(oData: js.Any, fnFunction: js.Any): ResponsivePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>beforeOpen</code> event of this
         * <code>sap.m.ResponsivePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ResponsivePopover</code> itself.Event is fired before popover or dialog is open.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ResponsivePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachBeforeOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ResponsivePopover = js.native
  /**
         * Closes the ResponsivePopover.
        */
  def close(): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
         * Destroys the beginButton in the aggregation <code>beginButton</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyBeginButton(): ResponsivePopover = js.native
  /**
         * Destroys all the content in the aggregation <code>content</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyContent(): ResponsivePopover = js.native
  /**
         * Destroys the customHeader in the aggregation <code>customHeader</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyCustomHeader(): ResponsivePopover = js.native
  /**
         * Destroys the endButton in the aggregation <code>endButton</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyEndButton(): ResponsivePopover = js.native
  /**
         * Destroys the subHeader in the aggregation <code>subHeader</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroySubHeader(): ResponsivePopover = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>afterClose</code> event of this
         * <code>sap.m.ResponsivePopover</code>.The passed function and listener object must match the ones
         * used for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachAfterClose(fnFunction: js.Any, oListener: js.Any): ResponsivePopover = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>afterOpen</code> event of this
         * <code>sap.m.ResponsivePopover</code>.The passed function and listener object must match the ones
         * used for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachAfterOpen(fnFunction: js.Any, oListener: js.Any): ResponsivePopover = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>beforeClose</code> event of this
         * <code>sap.m.ResponsivePopover</code>.The passed function and listener object must match the ones
         * used for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachBeforeClose(fnFunction: js.Any, oListener: js.Any): ResponsivePopover = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>beforeOpen</code> event of this
         * <code>sap.m.ResponsivePopover</code>.The passed function and listener object must match the ones
         * used for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachBeforeOpen(fnFunction: js.Any, oListener: js.Any): ResponsivePopover = js.native
  /**
         * Fires event <code>afterClose</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>This parameter
         * contains the control which is passed as the parameter when calling openBy method. When runs on the
         * phone, this parameter is undefined.</li><li><code>origin</code> of type
         * <code>sap.m.Button</code>This parameter contains the control which triggers the close of the
         * ResponsivePopover. This parameter is undefined when runs on desktop or tablet.</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireAfterClose(mArguments: js.Any): ResponsivePopover = js.native
  /**
         * Fires event <code>afterOpen</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>This parameter
         * contains the control which is passed as the parameter when calling openBy method. When runs on the
         * phone, this parameter is undefined.</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireAfterOpen(mArguments: js.Any): ResponsivePopover = js.native
  /**
         * Fires event <code>beforeClose</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>This parameter
         * contains the control which is passed as the parameter when calling openBy method. When runs on the
         * phone, this parameter is undefined.</li><li><code>origin</code> of type
         * <code>sap.m.Button</code>This parameter contains the control which triggers the close of the
         * ResponsivePopover. This parameter is undefined when runs on desktop or tablet.</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireBeforeClose(mArguments: js.Any): ResponsivePopover = js.native
  /**
         * Fires event <code>beforeOpen</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>This parameter
         * contains the control which is passed as the parameter when calling openBy method. When runs on the
         * phone, this parameter is undefined.</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireBeforeOpen(mArguments: js.Any): ResponsivePopover = js.native
  /**
         * Returns array of IDs of the elements which are the current targets of the association
         * <code>ariaDescribedBy</code>.
        */
  def getAriaDescribedBy(): js.Array[_] = js.native
  /**
         * Getter for beginButton aggregation
         * @returns The button that is set as a beginButton aggregation
        */
  def getBeginButton(): Button = js.native
  /**
         * Gets content of aggregation <code>content</code>.Content is supported by both variants. Please see
         * the documentation on sap.m.Popover#content and sap.m.Dialog#content
        */
  def getContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
         * Gets current value of property <code>contentHeight</code>.This property is supported by both
         * variants. Please see the documentation on sap.m.Popover#contentHeight and sap.m.Dialog#contentHeight
         * @returns Value of property <code>contentHeight</code>
        */
  def getContentHeight(): js.Any = js.native
  /**
         * Gets current value of property <code>contentWidth</code>.This property is supported by both
         * variants. Please see the documentation on sap.m.Popover#contentWidth and sap.m.Dialog#contentWidth
         * @returns Value of property <code>contentWidth</code>
        */
  def getContentWidth(): js.Any = js.native
  /**
         * Gets content of aggregation <code>customHeader</code>.CustomHeader is supported by both variants.
         * Please see the documentation on sap.m.Popover#customHeader and sap.m.Dialog#customHeader
        */
  def getCustomHeader(): IBar = js.native
  /**
         * Getter for endButton aggregation
         * @returns The button that is set as a endButton aggregation
        */
  def getEndButton(): Button = js.native
  /**
         * Gets current value of property <code>horizontalScrolling</code>.This property is supported by both
         * variants. Please see the documentation on sap.m.Popover#horizontalScrolling and
         * sap.m.Dialog#horizontalScrollingDefault value is <code>true</code>.
         * @returns Value of property <code>horizontalScrolling</code>
        */
  def getHorizontalScrolling(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>icon</code>.This property only takes effect  on phone. Please
         * see the documentation sap.m.Dialog#icon.
         * @returns Value of property <code>icon</code>
        */
  def getIcon(): js.Any = js.native
  /**
         * ID of the element which is the current target of the association <code>initialFocus</code>, or
         * <code>null</code>.
        */
  def getInitialFocus(): js.Any = js.native
  /**
         * Gets current value of property <code>modal</code>.This property only takes effect on desktop or
         * tablet. Please see the documentation sap.m.Popover#modal.
         * @returns Value of property <code>modal</code>
        */
  def getModal(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>offsetX</code>.This property only takes effect on desktop or
         * tablet. Please see the documentation sap.m.Popover#offsetX.
         * @returns Value of property <code>offsetX</code>
        */
  def getOffsetX(): scala.Double = js.native
  /**
         * Gets current value of property <code>offsetY</code>.This property only takes effect on desktop or
         * tablet. Please see the documentation sap.m.Popover#offsetY.
         * @returns Value of property <code>offsetY</code>
        */
  def getOffsetY(): scala.Double = js.native
  /**
         * Gets current value of property <code>placement</code>.This property only takes effect on desktop or
         * tablet. Please see the documentation sap.m.Popover#placement.Default value is <code>Right</code>.
         * @returns Value of property <code>placement</code>
        */
  def getPlacement(): PlacementType = js.native
  /**
         * Gets current value of property <code>resizable</code>.Whether resize option is enabled.Default value
         * is <code>false</code>.
         * @since 1.36.4
         * @returns Value of property <code>resizable</code>
        */
  def getResizable(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>showCloseButton</code>.Determines if a close button should be
         * inserted into the dialog's header dynamically to close the dialog. This property only takes effect
         * on phone.Default value is <code>true</code>.
         * @returns Value of property <code>showCloseButton</code>
        */
  def getShowCloseButton(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>showHeader</code>.This property is supported by both variants.
         * Please see the documentation on sap.m.Popover#showHeader and sap.m.Dialog#showHeaderDefault value is
         * <code>true</code>.
         * @returns Value of property <code>showHeader</code>
        */
  def getShowHeader(): scala.Boolean = js.native
  /**
         * Gets content of aggregation <code>subHeader</code>.SubHeader is supported by both variants. Please
         * see the documentation on sap.m.Popover#subHeader and sap.m.Dialog#subHeader
        */
  def getSubHeader(): IBar = js.native
  /**
         * Gets current value of property <code>title</code>.This property is supported by both variants.
         * Please see the documentation on sap.m.Popover#title and sap.m.Dialog#title
         * @returns Value of property <code>title</code>
        */
  def getTitle(): java.lang.String = js.native
  /**
         * Gets current value of property <code>verticalScrolling</code>.This property is supported by both
         * variants. Please see the documentation on sap.m.Popover#verticalScrolling and
         * sap.m.Dialog#verticalScrollingDefault value is <code>true</code>.
         * @returns Value of property <code>verticalScrolling</code>
        */
  def getVerticalScrolling(): scala.Boolean = js.native
  /**
         * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
         * returns its index if found or -1 otherwise.
         * @param oContent The content whose index is looked for
         * @returns The index of the provided control in the aggregation if found, or -1 otherwise
        */
  def indexOfContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Double = js.native
  /**
         * Inserts a content into the aggregation <code>content</code>.
         * @param oContent the content to insert; if empty, nothing is inserted
         * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
         * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
         *  greater than the current size of the aggregation, the content is inserted at             the last
         * position
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def insertContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): ResponsivePopover = js.native
  /**
         * Checks whether the ResponsivePopover is currently open.
        */
  def isOpen(): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
         * Opens the ResponsivePopover. The ResponsivePopover is positioned relatively to the control parameter
         * on tablet or desktop and is full screen on phone. Therefore the control parameter is only used on
         * tablet or desktop and is ignored on phone.
         * @param oControl         When this control is displayed on tablet or desktop, the ResponsivePopover
         * is positioned relatively to this control.
        */
  def openBy(oControl: js.Any): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
         * Removes all the controls in the association named <code>ariaDescribedBy</code>.
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllAriaDescribedBy(): js.Array[_] = js.native
  /**
         * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
         * from the hosting UIArea.
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
         * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
         * @returns The removed ariaDescribedBy or <code>null</code>
        */
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
         * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
         * @returns The removed ariaDescribedBy or <code>null</code>
        */
  def removeAriaDescribedBy(vAriaDescribedBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
         * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
         * @returns The removed ariaDescribedBy or <code>null</code>
        */
  def removeAriaDescribedBy(vAriaDescribedBy: scala.Double): js.Any = js.native
  /**
         * Removes a content from the aggregation <code>content</code>.
         * @param vContent The content to remove or its index or id
         * @returns The removed content or <code>null</code>
        */
  def removeContent(vContent: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
         * Removes a content from the aggregation <code>content</code>.
         * @param vContent The content to remove or its index or id
         * @returns The removed content or <code>null</code>
        */
  def removeContent(vContent: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
         * Removes a content from the aggregation <code>content</code>.
         * @param vContent The content to remove or its index or id
         * @returns The removed content or <code>null</code>
        */
  def removeContent(vContent: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
         * Setter for beginButton aggregation
         * @param oButton The button that will be set as an aggregation
         * @returns Pointer to the control instance for chaining
        */
  def setBeginButton(oButton: Button): ResponsivePopover = js.native
  /**
         * Sets a new value for property <code>contentHeight</code>.This property is supported by both
         * variants. Please see the documentation on sap.m.Popover#contentHeight and
         * sap.m.Dialog#contentHeightWhen called with a value of <code>null</code> or <code>undefined</code>,
         * the default value of the property will be restored.
         * @param sContentHeight New value for property <code>contentHeight</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setContentHeight(sContentHeight: js.Any): ResponsivePopover = js.native
  /**
         * Sets a new value for property <code>contentWidth</code>.This property is supported by both variants.
         * Please see the documentation on sap.m.Popover#contentWidth and sap.m.Dialog#contentWidthWhen called
         * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
         * be restored.
         * @param sContentWidth New value for property <code>contentWidth</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setContentWidth(sContentWidth: js.Any): ResponsivePopover = js.native
  /**
         * Sets the aggregated <code>customHeader</code>.
         * @param oCustomHeader The customHeader to set
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setCustomHeader(oCustomHeader: IBar): ResponsivePopover = js.native
  /**
         * Setter for endButton aggregation
         * @param oButton The button that will be set as an aggregation
         * @returns Pointer to the control instance for chaining
        */
  def setEndButton(oButton: Button): ResponsivePopover = js.native
  /**
         * Sets a new value for property <code>horizontalScrolling</code>.This property is supported by both
         * variants. Please see the documentation on sap.m.Popover#horizontalScrolling and
         * sap.m.Dialog#horizontalScrollingWhen called with a value of <code>null</code> or
         * <code>undefined</code>, the default value of the property will be restored.Default value is
         * <code>true</code>.
         * @param bHorizontalScrolling New value for property <code>horizontalScrolling</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setHorizontalScrolling(bHorizontalScrolling: scala.Boolean): ResponsivePopover = js.native
  /**
         * Sets a new value for property <code>icon</code>.This property only takes effect  on phone. Please
         * see the documentation sap.m.Dialog#icon.When called with a value of <code>null</code> or
         * <code>undefined</code>, the default value of the property will be restored.
         * @param sIcon New value for property <code>icon</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setIcon(sIcon: js.Any): ResponsivePopover = js.native
  /**
         * Sets the associated <code>initialFocus</code>.
         * @param oInitialFocus ID of an element which becomes the new target of this initialFocus association;
         * alternatively, an element instance may be given
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setInitialFocus(oInitialFocus: js.Any): ResponsivePopover = js.native
  /**
         * Sets the associated <code>initialFocus</code>.
         * @param oInitialFocus ID of an element which becomes the new target of this initialFocus association;
         * alternatively, an element instance may be given
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setInitialFocus(oInitialFocus: openui5Lib.sapNs.uiNs.coreNs.Control): ResponsivePopover = js.native
  /**
         * Sets a new value for property <code>modal</code>.This property only takes effect on desktop or
         * tablet. Please see the documentation sap.m.Popover#modal.When called with a value of
         * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
         * @param bModal New value for property <code>modal</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setModal(bModal: scala.Boolean): ResponsivePopover = js.native
  /**
         * Sets a new value for property <code>offsetX</code>.This property only takes effect on desktop or
         * tablet. Please see the documentation sap.m.Popover#offsetX.When called with a value of
         * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
         * @param iOffsetX New value for property <code>offsetX</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setOffsetX(iOffsetX: scala.Double): ResponsivePopover = js.native
  /**
         * Sets a new value for property <code>offsetY</code>.This property only takes effect on desktop or
         * tablet. Please see the documentation sap.m.Popover#offsetY.When called with a value of
         * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
         * @param iOffsetY New value for property <code>offsetY</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setOffsetY(iOffsetY: scala.Double): ResponsivePopover = js.native
  /**
         * Sets a new value for property <code>placement</code>.This property only takes effect on desktop or
         * tablet. Please see the documentation sap.m.Popover#placement.When called with a value of
         * <code>null</code> or <code>undefined</code>, the default value of the property will be
         * restored.Default value is <code>Right</code>.
         * @param sPlacement New value for property <code>placement</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setPlacement(sPlacement: PlacementType): ResponsivePopover = js.native
  /**
         * Sets a new value for property <code>resizable</code>.Whether resize option is enabled.When called
         * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
         * be restored.Default value is <code>false</code>.
         * @since 1.36.4
         * @param bResizable New value for property <code>resizable</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setResizable(bResizable: scala.Boolean): ResponsivePopover = js.native
  /**
         * Determines if the close button to the ResponsivePopover is shown or not. Works only when
         * ResponsivePopover is used as a dialog
         * @param bShowCloseButton Defines whether the close button is shown
         * @returns Pointer to the control instance for chaining
        */
  def setShowCloseButton(bShowCloseButton: scala.Boolean): ResponsivePopover = js.native
  /**
         * Sets a new value for property <code>showHeader</code>.This property is supported by both variants.
         * Please see the documentation on sap.m.Popover#showHeader and sap.m.Dialog#showHeaderWhen called with
         * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
         * restored.Default value is <code>true</code>.
         * @param bShowHeader New value for property <code>showHeader</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setShowHeader(bShowHeader: scala.Boolean): ResponsivePopover = js.native
  /**
         * Sets the aggregated <code>subHeader</code>.
         * @param oSubHeader The subHeader to set
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setSubHeader(oSubHeader: IBar): ResponsivePopover = js.native
  /**
         * Sets a new value for property <code>title</code>.This property is supported by both variants. Please
         * see the documentation on sap.m.Popover#title and sap.m.Dialog#titleWhen called with a value of
         * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
         * @param sTitle New value for property <code>title</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setTitle(sTitle: java.lang.String): ResponsivePopover = js.native
  /**
         * Sets a new value for property <code>verticalScrolling</code>.This property is supported by both
         * variants. Please see the documentation on sap.m.Popover#verticalScrolling and
         * sap.m.Dialog#verticalScrollingWhen called with a value of <code>null</code> or
         * <code>undefined</code>, the default value of the property will be restored.Default value is
         * <code>true</code>.
         * @param bVerticalScrolling New value for property <code>verticalScrolling</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setVerticalScrolling(bVerticalScrolling: scala.Boolean): ResponsivePopover = js.native
}

