package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.NotificationListBase")
@js.native
class NotificationListBase protected () extends ListItemBase {
  /**
         * Constructor for a new NotificationListBase.Accepts an object literal <code>mSettings</code> that
         * defines initialproperty values, aggregated and associated objects as well as event handlers.See
         * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
         * settings object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new NotificationListBase.Accepts an object literal <code>mSettings</code> that
         * defines initialproperty values, aggregated and associated objects as well as event handlers.See
         * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
         * settings object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Returns the sap.m.Image or the sap.ui.core.Control used in the NotificationListBase's author
         * picture.
         * @returns The notification author picture text
        */
  def _getAuthorImage(): Image | openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
         * Returns the sap.m.Text control used in the NotificationListBase's author name.
         * @returns The notification author name text
        */
  def _getAuthorName(): Text = js.native
  /**
         * Returns the sap.m.Text control used in the NotificationListBase's header title.
         * @returns The datetime control inside the Notification List Base control
        */
  def _getDateTimeText(): Text = js.native
  /**
         * Returns the sap.m.Text control used in the NotificationListBase's header title.
         * @returns The title control inside the Notification List Base control
        */
  def _getHeaderTitle(): Text = js.native
  /**
         * Returns the sap.m.OverflowToolbar control used in the NotificationListBase.
         * @returns The footer toolbar
        */
  def _getToolbar(): OverflowToolbar = js.native
  /**
         * Adds some button to the aggregation <code>buttons</code>.
         * @param oButton the button to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addButton(oButton: Button): NotificationListBase = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>close</code> event of this
         * <code>sap.m.NotificationListBase</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.NotificationListBase</code> itself.Fired when the close button of the
         * notification is pressed.<br><b>Note:</b> Pressing the close button doesn't destroy the notification
         * automatically.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.NotificationListBase</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachClose(oData: js.Any, fnFunction: js.Any): NotificationListBase = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>close</code> event of this
         * <code>sap.m.NotificationListBase</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.NotificationListBase</code> itself.Fired when the close button of the
         * notification is pressed.<br><b>Note:</b> Pressing the close button doesn't destroy the notification
         * automatically.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.NotificationListBase</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): NotificationListBase = js.native
  /**
         * Destroys all the buttons in the aggregation <code>buttons</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyButtons(): NotificationListBase = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>close</code> event of this
         * <code>sap.m.NotificationListBase</code>.The passed function and listener object must match the ones
         * used for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachClose(fnFunction: js.Any, oListener: js.Any): NotificationListBase = js.native
  /**
         * Fires event <code>close</code> to attached listeners.
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireClose(mArguments: js.Any): NotificationListBase = js.native
  /**
         * Gets current value of property <code>authorName</code>.Determines the notification group's author
         * name.Default value is <code></code>.
         * @returns Value of property <code>authorName</code>
        */
  def getAuthorName(): java.lang.String = js.native
  /**
         * Gets current value of property <code>authorPicture</code>.Determines the URL of the notification
         * group's author picture.
         * @returns Value of property <code>authorPicture</code>
        */
  def getAuthorPicture(): js.Any = js.native
  /**
         * Gets content of aggregation <code>buttons</code>.Action buttons.
        */
  def getButtons(): js.Array[Button] = js.native
  /**
         * Gets current value of property <code>datetime</code>.Determines the due date of the
         * NotificationListItem.Default value is <code></code>.
         * @returns Value of property <code>datetime</code>
        */
  def getDatetime(): java.lang.String = js.native
  /**
         * Gets current value of property <code>priority</code>.Determines the priority of the
         * Notification.Default value is <code>None</code>.
         * @returns Value of property <code>priority</code>
        */
  def getPriority(): openui5Lib.sapNs.uiNs.coreNs.Priority = js.native
  /**
         * Gets current value of property <code>showButtons</code>.Determines the action buttons
         * visibility.Default value is <code>true</code>.
         * @returns Value of property <code>showButtons</code>
        */
  def getShowButtons(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>showCloseButton</code>.Determines the visibility of the close
         * button.Default value is <code>true</code>.
         * @returns Value of property <code>showCloseButton</code>
        */
  def getShowCloseButton(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>title</code>.Determines the title of the NotificationListBase
         * item.Default value is <code></code>.
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
  def insertButton(oButton: Button, iIndex: scala.Double): NotificationListBase = js.native
  /**
         * Removes all the controls from the aggregation <code>buttons</code>.Additionally, it unregisters them
         * from the hosting UIArea.
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllButtons(): js.Array[Button] = js.native
  /**
         * Removes a button from the aggregation <code>buttons</code>.
         * @param vButton The button to remove or its index or id
         * @returns The removed button or <code>null</code>
        */
  def removeButton(vButton: java.lang.String): Button = js.native
  /**
         * Removes a button from the aggregation <code>buttons</code>.
         * @param vButton The button to remove or its index or id
         * @returns The removed button or <code>null</code>
        */
  def removeButton(vButton: Button): Button = js.native
  /**
         * Removes a button from the aggregation <code>buttons</code>.
         * @param vButton The button to remove or its index or id
         * @returns The removed button or <code>null</code>
        */
  def removeButton(vButton: scala.Double): Button = js.native
  /**
         * Sets a new value for property <code>authorName</code>.Determines the notification group's author
         * name.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
         * the property will be restored.Default value is <code></code>.
         * @param sAuthorName New value for property <code>authorName</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setAuthorName(sAuthorName: java.lang.String): NotificationListBase = js.native
  /**
         * Sets a new value for property <code>authorPicture</code>.Determines the URL of the notification
         * group's author picture.When called with a value of <code>null</code> or <code>undefined</code>, the
         * default value of the property will be restored.
         * @param sAuthorPicture New value for property <code>authorPicture</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setAuthorPicture(sAuthorPicture: js.Any): NotificationListBase = js.native
  /**
         * Sets a new value for property <code>datetime</code>.Determines the due date of the
         * NotificationListItem.When called with a value of <code>null</code> or <code>undefined</code>, the
         * default value of the property will be restored.Default value is <code></code>.
         * @param sDatetime New value for property <code>datetime</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setDatetime(sDatetime: java.lang.String): NotificationListBase = js.native
  /**
         * Sets a new value for property <code>priority</code>.Determines the priority of the Notification.When
         * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
         * property will be restored.Default value is <code>None</code>.
         * @param sPriority New value for property <code>priority</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setPriority(sPriority: openui5Lib.sapNs.uiNs.coreNs.Priority): NotificationListBase = js.native
  /**
         * Sets a new value for property <code>showButtons</code>.Determines the action buttons visibility.When
         * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
         * property will be restored.Default value is <code>true</code>.
         * @param bShowButtons New value for property <code>showButtons</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setShowButtons(bShowButtons: scala.Boolean): NotificationListBase = js.native
  /**
         * Sets a new value for property <code>showCloseButton</code>.Determines the visibility of the close
         * button.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
         * the property will be restored.Default value is <code>true</code>.
         * @param bShowCloseButton New value for property <code>showCloseButton</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setShowCloseButton(bShowCloseButton: scala.Boolean): NotificationListBase = js.native
  /**
         * Sets a new value for property <code>title</code>.Determines the title of the NotificationListBase
         * item.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
         * the property will be restored.Default value is <code></code>.
         * @param sTitle New value for property <code>title</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setTitle(sTitle: java.lang.String): NotificationListBase = js.native
}

