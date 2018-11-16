package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.NewsContent")
@js.native
class NewsContent protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
         * Constructor for a new sap.m.NewsContent control.Accepts an object literal <code>mSettings</code>
         * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
         * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
         * settings object.
         * @param sId id for the new control, generated automatically if no id is given
         * @param mSettings initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new sap.m.NewsContent control.Accepts an object literal <code>mSettings</code>
         * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
         * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
         * settings object.
         * @param sId id for the new control, generated automatically if no id is given
         * @param mSettings initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
         * <code>sap.m.NewsContent</code>.When called, the context of the event handler (its <code>this</code>)
         * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
         * <code>sap.m.NewsContent</code> itself.The event is fired when the user chooses the news content.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.NewsContent</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachPress(oData: js.Any, fnFunction: js.Any): NewsContent = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
         * <code>sap.m.NewsContent</code>.When called, the context of the event handler (its <code>this</code>)
         * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
         * <code>sap.m.NewsContent</code> itself.The event is fired when the user chooses the news content.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.NewsContent</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): NewsContent = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
         * <code>sap.m.NewsContent</code>.The passed function and listener object must match the ones used for
         * event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachPress(fnFunction: js.Any, oListener: js.Any): NewsContent = js.native
  /**
         * Fires event <code>press</code> to attached listeners.
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def firePress(mArguments: js.Any): NewsContent = js.native
  /**
         * Gets current value of property <code>contentText</code>.The content text.
         * @returns Value of property <code>contentText</code>
        */
  def getContentText(): java.lang.String = js.native
  /**
         * Gets current value of property <code>size</code>.Updates the size of the chart. If not set then the
         * default size is applied based on the device tile.Default value is <code>Auto</code>.
         * @returns Value of property <code>size</code>
        */
  def getSize(): Size = js.native
  /**
         * Gets current value of property <code>subheader</code>.The subheader.
         * @returns Value of property <code>subheader</code>
        */
  def getSubheader(): java.lang.String = js.native
  /**
         * Sets a new value for property <code>size</code>.Updates the size of the chart. If not set then the
         * default size is applied based on the device tile.When called with a value of <code>null</code> or
         * <code>undefined</code>, the default value of the property will be restored.Default value is
         * <code>Auto</code>.
         * @param sSize New value for property <code>size</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setSize(sSize: Size): NewsContent = js.native
  /**
         * Sets a new value for property <code>subheader</code>.The subheader.When called with a value of
         * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
         * @param sSubheader New value for property <code>subheader</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setSubheader(sSubheader: java.lang.String): NewsContent = js.native
}

