package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedContent
  extends StObject
     with Control {
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.m.FeedContent</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.FeedContent</code> itself.The event is fired when the user chooses the feed content.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.FeedContent</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): FeedContent = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FeedContent = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.m.FeedContent</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): FeedContent = js.native
  
  /**
    * Fires event <code>press</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): FeedContent = js.native
  
  /**
    * Gets current value of property <code>contentText</code>.The content text.
    * @returns Value of property <code>contentText</code>
    */
  def getContentText(): String = js.native
  
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
  def getSubheader(): String = js.native
  
  /**
    * Gets current value of property <code>truncateValueTo</code>.The number of characters to display for
    * the value property.Default value is <code>4</code>.
    * @returns Value of property <code>truncateValueTo</code>
    */
  def getTruncateValueTo(): Double = js.native
  
  /**
    * Gets current value of property <code>value</code>.The actual value.
    * @returns Value of property <code>value</code>
    */
  def getValue(): String = js.native
  
  /**
    * Gets current value of property <code>valueColor</code>.The semantic color of the value.
    * @returns Value of property <code>valueColor</code>
    */
  def getValueColor(): ValueColor = js.native
  
  /**
    * Sets a new value for property <code>size</code>.Updates the size of the chart. If not set then the
    * default size is applied based on the device tile.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Auto</code>.
    * @param sSize New value for property <code>size</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSize(sSize: Size): FeedContent = js.native
  
  /**
    * Sets a new value for property <code>subheader</code>.The subheader.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sSubheader New value for property <code>subheader</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSubheader(sSubheader: String): FeedContent = js.native
  
  /**
    * Sets a new value for property <code>truncateValueTo</code>.The number of characters to display for
    * the value property.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>4</code>.
    * @param iTruncateValueTo New value for property <code>truncateValueTo</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTruncateValueTo(iTruncateValueTo: Double): FeedContent = js.native
  
  /**
    * Sets a new value for property <code>value</code>.The actual value.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: String): FeedContent = js.native
  
  /**
    * Sets a new value for property <code>valueColor</code>.The semantic color of the value.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sValueColor New value for property <code>valueColor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueColor(sValueColor: ValueColor): FeedContent = js.native
}
