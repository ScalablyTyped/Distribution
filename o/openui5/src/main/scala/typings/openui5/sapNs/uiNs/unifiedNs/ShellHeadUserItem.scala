package typings.openui5.sapNs.uiNs.unifiedNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import typings.openui5.sapNs.uiNs.coreNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.ShellHeadUserItem")
@js.native
class ShellHeadUserItem protected () extends Element {
  /**
    * Constructor for a new ShellHeadUserItem.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): ShellHeadUserItem = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): ShellHeadUserItem = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.ui.unified.ShellHeadUserItem</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.ShellHeadUserItem</code> itself.Event is fired when the user presses
    * the button.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.ShellHeadUserItem</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): ShellHeadUserItem = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ShellHeadUserItem = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.ui.unified.ShellHeadUserItem</code>.The passed function and listener object must match the
    * ones used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): ShellHeadUserItem = js.native
  /**
    * Fires event <code>press</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): ShellHeadUserItem = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>image</code>.An image of the user, normally an URI to a image
    * but also an icon from the sap.ui.core.IconPool is possible.
    * @returns Value of property <code>image</code>
    */
  def getImage(): js.Any = js.native
  /**
    * Gets current value of property <code>showPopupIndicator</code>.The user item is intended to be used
    * for user settings. Normally these settings are done via a Menu or Dialog.If this property is set to
    * true an indicator for such a popup mechanismn is shown in the item.Default value is
    * <code>true</code>.
    * @since 1.27.0
    * @returns Value of property <code>showPopupIndicator</code>
    */
  def getShowPopupIndicator(): Boolean = js.native
  /**
    * Gets current value of property <code>username</code>.The name of the user.Default value is
    * <code></code>.
    * @returns Value of property <code>username</code>
    */
  def getUsername(): String = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  /**
    * Sets a new value for property <code>image</code>.An image of the user, normally an URI to a image
    * but also an icon from the sap.ui.core.IconPool is possible.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sImage New value for property <code>image</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setImage(sImage: js.Any): ShellHeadUserItem = js.native
  /**
    * Sets a new value for property <code>showPopupIndicator</code>.The user item is intended to be used
    * for user settings. Normally these settings are done via a Menu or Dialog.If this property is set to
    * true an indicator for such a popup mechanismn is shown in the item.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @since 1.27.0
    * @param bShowPopupIndicator New value for property <code>showPopupIndicator</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowPopupIndicator(bShowPopupIndicator: Boolean): ShellHeadUserItem = js.native
  /**
    * Sets a new value for property <code>username</code>.The name of the user.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sUsername New value for property <code>username</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUsername(sUsername: String): ShellHeadUserItem = js.native
}

