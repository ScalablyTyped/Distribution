package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.MessagePopover")
@js.native
class MessagePopover protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
         * Constructor for a new MessagePopoverAccepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no id is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new MessagePopoverAccepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no id is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Adds some item to the aggregation <code>items</code>.
         * @param oItem the item to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addItem(oItem: MessagePopoverItem): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>afterClose</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired after the popover is
         * closed
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachAfterClose(oData: js.Any, fnFunction: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>afterClose</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired after the popover is
         * closed
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachAfterClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>afterOpen</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired after the popover is
         * opened
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachAfterOpen(oData: js.Any, fnFunction: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>afterOpen</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired after the popover is
         * opened
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachAfterOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>beforeClose</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired before the popover is
         * closed
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachBeforeClose(oData: js.Any, fnFunction: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>beforeClose</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired before the popover is
         * closed
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachBeforeClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>beforeOpen</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired before the popover is
         * opened
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachBeforeOpen(oData: js.Any, fnFunction: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>beforeOpen</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired before the popover is
         * opened
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachBeforeOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>itemSelect</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired when description is shown
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachItemSelect(oData: js.Any, fnFunction: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>itemSelect</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired when description is shown
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachItemSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>listSelect</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired when one of the lists is
         * shown when (not) filtered  by type
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachListSelect(oData: js.Any, fnFunction: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>listSelect</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired when one of the lists is
         * shown when (not) filtered  by type
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachListSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>longtextLoaded</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired when the long text
         * description data from a remote URL is loaded
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachLongtextLoaded(oData: js.Any, fnFunction: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>longtextLoaded</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired when the long text
         * description data from a remote URL is loaded
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachLongtextLoaded(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>urlValidated</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired when a validation of a URL
         * from long text description is ready
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachUrlValidated(oData: js.Any, fnFunction: js.Any): MessagePopover = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>urlValidated</code> event of this
         * <code>sap.m.MessagePopover</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MessagePopover</code> itself.This event will be fired when a validation of a URL
         * from long text description is ready
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MessagePopover</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachUrlValidated(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Closes the MessagePopover
         * @returns Reference to the 'this' for chaining purposes
        */
  def close(): MessagePopover = js.native
  /**
         * Destroys the headerButton in the aggregation <code>headerButton</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyHeaderButton(): MessagePopover = js.native
  /**
         * Destroys all the items in the aggregation <code>items</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyItems(): MessagePopover = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>afterClose</code> event of this
         * <code>sap.m.MessagePopover</code>.The passed function and listener object must match the ones used
         * for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachAfterClose(fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>afterOpen</code> event of this
         * <code>sap.m.MessagePopover</code>.The passed function and listener object must match the ones used
         * for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachAfterOpen(fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>beforeClose</code> event of this
         * <code>sap.m.MessagePopover</code>.The passed function and listener object must match the ones used
         * for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachBeforeClose(fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>beforeOpen</code> event of this
         * <code>sap.m.MessagePopover</code>.The passed function and listener object must match the ones used
         * for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachBeforeOpen(fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>itemSelect</code> event of this
         * <code>sap.m.MessagePopover</code>.The passed function and listener object must match the ones used
         * for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachItemSelect(fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>listSelect</code> event of this
         * <code>sap.m.MessagePopover</code>.The passed function and listener object must match the ones used
         * for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachListSelect(fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>longtextLoaded</code> event of this
         * <code>sap.m.MessagePopover</code>.The passed function and listener object must match the ones used
         * for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachLongtextLoaded(fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>urlValidated</code> event of this
         * <code>sap.m.MessagePopover</code>.The passed function and listener object must match the ones used
         * for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachUrlValidated(fnFunction: js.Any, oListener: js.Any): MessagePopover = js.native
  /**
         * Fires event <code>afterClose</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>Refers to the control
         * which opens the popover</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireAfterClose(mArguments: js.Any): MessagePopover = js.native
  /**
         * Fires event <code>afterOpen</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>This refers to the
         * control which opens the popover</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireAfterOpen(mArguments: js.Any): MessagePopover = js.native
  /**
         * Fires event <code>beforeClose</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>Refers to the control
         * which opens the popoverSee sap.ui.core.MessageType enum values for types</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireBeforeClose(mArguments: js.Any): MessagePopover = js.native
  /**
         * Fires event <code>beforeOpen</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>openBy</code> of type <code>sap.ui.core.Control</code>Refers to the control
         * which opens the popover</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireBeforeOpen(mArguments: js.Any): MessagePopover = js.native
  /**
         * Fires event <code>itemSelect</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>item</code> of type <code>sap.m.MessagePopoverItem</code>Refers to the
         * message popover item that is being presented</li><li><code>messageTypeFilter</code> of type
         * <code>sap.ui.core.MessageType</code>Refers to the type of messages being shownSee
         * sap.ui.core.MessageType values for types</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireItemSelect(mArguments: js.Any): MessagePopover = js.native
  /**
         * Fires event <code>listSelect</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>messageTypeFilter</code> of type <code>sap.ui.core.MessageType</code>This
         * parameter refers to the type of messages being shown.</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireListSelect(mArguments: js.Any): MessagePopover = js.native
  /**
         * Fires event <code>longtextLoaded</code> to attached listeners.
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireLongtextLoaded(mArguments: js.Any): MessagePopover = js.native
  /**
         * Fires event <code>urlValidated</code> to attached listeners.
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireUrlValidated(mArguments: js.Any): MessagePopover = js.native
  /**
         * Gets current value of property <code>asyncDescriptionHandler</code>.Callback function for resolving
         * a promise after description has been asynchronously loaded inside this function
         * @returns Value of property <code>asyncDescriptionHandler</code>
        */
  def getAsyncDescriptionHandler(): js.Any = js.native
  /**
         * Gets current value of property <code>asyncURLHandler</code>.Callback function for resolving a
         * promise after a link has been asynchronously validated inside this function
         * @returns Value of property <code>asyncURLHandler</code>
        */
  def getAsyncURLHandler(): js.Any = js.native
  /**
         * Gets content of aggregation <code>headerButton</code>.A custom header button
        */
  def getHeaderButton(): Button = js.native
  /**
         * Gets current value of property <code>initiallyExpanded</code>.Sets the initial state of the control
         * - expanded or collapsed. By default the control opens as expandedDefault value is <code>true</code>.
         * @returns Value of property <code>initiallyExpanded</code>
        */
  def getInitiallyExpanded(): scala.Boolean = js.native
  /**
         * Gets content of aggregation <code>items</code>.A list with message items
        */
  def getItems(): js.Array[MessagePopoverItem] = js.native
  /**
         * Gets current value of property <code>placement</code>.Determines the position, where the control
         * will appear on the screen. Possible values are: sap.m.VerticalPlacementType.Top,
         * sap.m.VerticalPlacementType.Bottom and sap.m.VerticalPlacementType.Vertical.The default value is
         * sap.m.VerticalPlacementType.Vertical. Setting this property while the control is open, will not
         * cause any re-rendering and changing of the position. Changes will only be applied with the next
         * interaction.Default value is <code>Vertical</code>.
         * @returns Value of property <code>placement</code>
        */
  def getPlacement(): VerticalPlacementType = js.native
  /**
         * Checks for the provided <code>sap.m.MessagePopoverItem</code> in the aggregation
         * <code>items</code>.and returns its index if found or -1 otherwise.
         * @param oItem The item whose index is looked for
         * @returns The index of the provided control in the aggregation if found, or -1 otherwise
        */
  def indexOfItem(oItem: MessagePopoverItem): scala.Double = js.native
  /**
         * Inserts a item into the aggregation <code>items</code>.
         * @param oItem the item to insert; if empty, nothing is inserted
         * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
         * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
         * greater than the current size of the aggregation, the item is inserted at             the last
         * position
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def insertItem(oItem: MessagePopoverItem, iIndex: scala.Double): MessagePopover = js.native
  /**
         * The method checks if the MessagePopover is open. It returns true when the MessagePopover is
         * currently open(this includes opening and closing animations), otherwise it returns false
         * @returns Whether the MessagePopover is open
        */
  def isOpen(): scala.Boolean = js.native
  /**
         * Opens the MessagePopover
         * @param oControl Control which opens the MessagePopover
         * @returns Reference to the 'this' for chaining purposes
        */
  def openBy(oControl: openui5Lib.sapNs.uiNs.coreNs.Control): MessagePopover = js.native
  /**
         * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
         * from the hosting UIArea.
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllItems(): js.Array[MessagePopoverItem] = js.native
  /**
         * Removes a item from the aggregation <code>items</code>.
         * @param vItem The item to remove or its index or id
         * @returns The removed item or <code>null</code>
        */
  def removeItem(vItem: java.lang.String): MessagePopoverItem = js.native
  /**
         * Removes a item from the aggregation <code>items</code>.
         * @param vItem The item to remove or its index or id
         * @returns The removed item or <code>null</code>
        */
  def removeItem(vItem: MessagePopoverItem): MessagePopoverItem = js.native
  /**
         * Removes a item from the aggregation <code>items</code>.
         * @param vItem The item to remove or its index or id
         * @returns The removed item or <code>null</code>
        */
  def removeItem(vItem: scala.Double): MessagePopoverItem = js.native
  /**
         * Sets a new value for property <code>asyncDescriptionHandler</code>.Callback function for resolving a
         * promise after description has been asynchronously loaded inside this functionWhen called with a
         * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
         * restored.
         * @param oAsyncDescriptionHandler New value for property <code>asyncDescriptionHandler</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setAsyncDescriptionHandler(oAsyncDescriptionHandler: js.Any): MessagePopover = js.native
  /**
         * Sets a new value for property <code>asyncURLHandler</code>.Callback function for resolving a promise
         * after a link has been asynchronously validated inside this functionWhen called with a value of
         * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
         * @param oAsyncURLHandler New value for property <code>asyncURLHandler</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setAsyncURLHandler(oAsyncURLHandler: js.Any): MessagePopover = js.native
  /**
         * Setter for default description and URL validation callbacks across all instances of MessagePopover
         * @param mDefaultHandlers An object setting default callbacks
        */
  def setDefaultHandlers(mDefaultHandlers: js.Any): scala.Unit = js.native
  /**
         * Sets the aggregated <code>headerButton</code>.
         * @param oHeaderButton The headerButton to set
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setHeaderButton(oHeaderButton: Button): MessagePopover = js.native
  /**
         * Sets a new value for property <code>initiallyExpanded</code>.Sets the initial state of the control -
         * expanded or collapsed. By default the control opens as expandedWhen called with a value of
         * <code>null</code> or <code>undefined</code>, the default value of the property will be
         * restored.Default value is <code>true</code>.
         * @param bInitiallyExpanded New value for property <code>initiallyExpanded</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setInitiallyExpanded(bInitiallyExpanded: scala.Boolean): MessagePopover = js.native
  /**
         * This method toggles between open and closed state of the MessagePopover instance.oControl parameter
         * is mandatory in the same way as in 'openBy' method
         * @param oControl Control which opens the MessagePopover
         * @returns Reference to the 'this' for chaining purposes
        */
  def toggle(oControl: openui5Lib.sapNs.uiNs.coreNs.Control): MessagePopover = js.native
}

