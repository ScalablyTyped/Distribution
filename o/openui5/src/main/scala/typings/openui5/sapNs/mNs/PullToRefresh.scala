package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.PullToRefresh")
@js.native
class PullToRefresh protected () extends Control {
  /**
    * Constructor for a new PullToRefresh.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>refresh</code> event of this
    * <code>sap.m.PullToRefresh</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.PullToRefresh</code> itself.Event indicates that the user has requested new data
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.PullToRefresh</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachRefresh(oData: js.Any, fnFunction: js.Any): PullToRefresh = js.native
  def attachRefresh(oData: js.Any, fnFunction: js.Any, oListener: js.Any): PullToRefresh = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>refresh</code> event of this
    * <code>sap.m.PullToRefresh</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachRefresh(fnFunction: js.Any, oListener: js.Any): PullToRefresh = js.native
  /**
    * Fires event <code>refresh</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireRefresh(mArguments: js.Any): PullToRefresh = js.native
  /**
    * Gets current value of property <code>customIcon</code>.Provide a URI to a custom icon image to
    * replace the SAP logo. Large images are scaled down to max 50px height.
    * @returns Value of property <code>customIcon</code>
    */
  def getCustomIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>description</code>.Optional description. May be used to inform
    * a user, for example, when the list has been updated last time.
    * @returns Value of property <code>description</code>
    */
  def getDescription(): String = js.native
  /**
    * Gets current value of property <code>iconDensityAware</code>.By default, this is set to true but
    * then one or more requests are sent trying to get the density perfect version of image if this
    * version of image doesn't exist on the server.If bandwidth is the key for the application, set this
    * value to false.Default value is <code>true</code>.
    * @returns Value of property <code>iconDensityAware</code>
    */
  def getIconDensityAware(): Boolean = js.native
  /**
    * Gets current value of property <code>showIcon</code>.Set to true to display an icon/logo. Icon must
    * be set either in the customIcon property or in the CSS theme for the PullToRefresh control.Default
    * value is <code>false</code>.
    * @returns Value of property <code>showIcon</code>
    */
  def getShowIcon(): Boolean = js.native
  /**
    * Hides the control and resets it to the normal state. In non-touch environments the control is not
    * hidden.
    */
  def hide(): Unit = js.native
  /**
    * Sets a new value for property <code>customIcon</code>.Provide a URI to a custom icon image to
    * replace the SAP logo. Large images are scaled down to max 50px height.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sCustomIcon New value for property <code>customIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomIcon(sCustomIcon: js.Any): PullToRefresh = js.native
  /**
    * Sets a new value for property <code>description</code>.Optional description. May be used to inform a
    * user, for example, when the list has been updated last time.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sDescription New value for property <code>description</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDescription(sDescription: String): PullToRefresh = js.native
  /**
    * Sets a new value for property <code>iconDensityAware</code>.By default, this is set to true but then
    * one or more requests are sent trying to get the density perfect version of image if this version of
    * image doesn't exist on the server.If bandwidth is the key for the application, set this value to
    * false.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @param bIconDensityAware New value for property <code>iconDensityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconDensityAware(bIconDensityAware: Boolean): PullToRefresh = js.native
  /**
    * Sets a new value for property <code>showIcon</code>.Set to true to display an icon/logo. Icon must
    * be set either in the customIcon property or in the CSS theme for the PullToRefresh control.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @param bShowIcon New value for property <code>showIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowIcon(bShowIcon: Boolean): PullToRefresh = js.native
}

