package typings
package openui5Lib.sapNs.uiNs.unifiedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.ShellOverlay")
@js.native
class ShellOverlay protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
           * Constructor for a new ShellOverlay.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId id for the new control, generated automatically if no id is given
           * @param mSettings initial settings for the new control
          */
  def this(sId: java.lang.String) = this()
  /**
           * Constructor for a new ShellOverlay.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId id for the new control, generated automatically if no id is given
           * @param mSettings initial settings for the new control
          */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
           * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
           * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): ShellOverlay = js.native
  /**
           * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
           * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def addAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): ShellOverlay = js.native
  /**
           * Adds some content to the aggregation <code>content</code>.
           * @param oContent the content to add; if empty, nothing is inserted
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def addContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): ShellOverlay = js.native
  /**
           * Attaches event handler <code>fnFunction</code> to the <code>closed</code> event of this
           * <code>sap.ui.unified.ShellOverlay</code>.When called, the context of the event handler (its
           * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
           * to this <code>sap.ui.unified.ShellOverlay</code> itself.Fired when the overlay was closed.
           * @param oData An application-specific payload object that will be passed to the event handler along
           * with the event object when firing the event
           * @param fnFunction The function to be called when the event occurs
           * @param oListener Context object to call the event handler with. Defaults to this
           * <code>sap.ui.unified.ShellOverlay</code> itself
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def attachClosed(oData: js.Any, fnFunction: js.Any): ShellOverlay = js.native
  /**
           * Attaches event handler <code>fnFunction</code> to the <code>closed</code> event of this
           * <code>sap.ui.unified.ShellOverlay</code>.When called, the context of the event handler (its
           * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
           * to this <code>sap.ui.unified.ShellOverlay</code> itself.Fired when the overlay was closed.
           * @param oData An application-specific payload object that will be passed to the event handler along
           * with the event object when firing the event
           * @param fnFunction The function to be called when the event occurs
           * @param oListener Context object to call the event handler with. Defaults to this
           * <code>sap.ui.unified.ShellOverlay</code> itself
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def attachClosed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ShellOverlay = js.native
  /**
           * Closes the ShellOverlay.
          */
  def close(): scala.Unit = js.native
  /**
           * Destroys all the content in the aggregation <code>content</code>.
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def destroyContent(): ShellOverlay = js.native
  /**
           * Destroys the search in the aggregation <code>search</code>.
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def destroySearch(): ShellOverlay = js.native
  /**
           * Detaches event handler <code>fnFunction</code> from the <code>closed</code> event of this
           * <code>sap.ui.unified.ShellOverlay</code>.The passed function and listener object must match the ones
           * used for event registration.
           * @param fnFunction The function to be called, when the event occurs
           * @param oListener Context object on which the given function had to be called
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def detachClosed(fnFunction: js.Any, oListener: js.Any): ShellOverlay = js.native
  /**
           * Fires event <code>closed</code> to attached listeners.
           * @param mArguments The arguments to pass along with the event
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def fireClosed(mArguments: js.Any): ShellOverlay = js.native
  /**
           * Returns array of IDs of the elements which are the current targets of the association
           * <code>ariaLabelledBy</code>.
          */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
           * Gets content of aggregation <code>content</code>.The content to appear in the overlay.
          */
  def getContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
           * Gets content of aggregation <code>search</code>.Experimental (This aggregation might change in
           * future!): The search control which should be displayed in the overlay header.
          */
  def getSearch(): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
           * ID of the element which is the current target of the association <code>shell</code>, or
           * <code>null</code>.
          */
  def getShell(): js.Any = js.native
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
  def insertContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): ShellOverlay = js.native
  /**
           * Opens the ShellOverlay.
          */
  def open(): scala.Unit = js.native
  /**
           * Removes all the controls in the association named <code>ariaLabelledBy</code>.
           * @returns An array of the removed elements (might be empty)
          */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
           * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
           * from the hosting UIArea.
           * @returns An array of the removed elements (might be empty)
          */
  def removeAllContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
           * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
           * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
           * @returns The removed ariaLabelledBy or <code>null</code>
          */
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
           * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
           * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
           * @returns The removed ariaLabelledBy or <code>null</code>
          */
  def removeAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
           * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
           * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
           * @returns The removed ariaLabelledBy or <code>null</code>
          */
  def removeAriaLabelledBy(vAriaLabelledBy: scala.Double): js.Any = js.native
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
           * Sets the aggregated <code>search</code>.
           * @param oSearch The search to set
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setSearch(oSearch: openui5Lib.sapNs.uiNs.coreNs.Control): ShellOverlay = js.native
  /**
           * Sets the associated <code>shell</code>.
           * @param oShell ID of an element which becomes the new target of this shell association;
           * alternatively, an element instance may be given
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setShell(oShell: js.Any): ShellOverlay = js.native
  /**
           * Sets the associated <code>shell</code>.
           * @param oShell ID of an element which becomes the new target of this shell association;
           * alternatively, an element instance may be given
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setShell(oShell: ShellLayout): ShellOverlay = js.native
}

