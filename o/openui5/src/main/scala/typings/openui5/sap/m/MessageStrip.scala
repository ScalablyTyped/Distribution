package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageStrip extends Control {
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>close</code> event of this
    * <code>sap.m.MessageStrip</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.MessageStrip</code> itself.This event will be fired after the container is
    * closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.MessageStrip</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachClose(oData: js.Any, fnFunction: js.Any): MessageStrip = js.native
  def attachClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MessageStrip = js.native
  
  /**
    * Closes the MessageStrip.This method sets the visible property of the MessageStrip to false.The
    * MessageStrip can be shown again by setting the visible property to true.
    */
  def close(): Unit = js.native
  
  /**
    * Destroys the link in the aggregation <code>link</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyLink(): MessageStrip = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>close</code> event of this
    * <code>sap.m.MessageStrip</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachClose(fnFunction: js.Any, oListener: js.Any): MessageStrip = js.native
  
  /**
    * Fires event <code>close</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireClose(mArguments: js.Any): MessageStrip = js.native
  
  /**
    * Gets current value of property <code>customIcon</code>.Determines a custom icon which is
    * displayed.If none is set, the default icon for this message type is used.Default value is
    * <code></code>.
    * @returns Value of property <code>customIcon</code>
    */
  def getCustomIcon(): js.Any = js.native
  
  /**
    * Gets content of aggregation <code>link</code>.Adds a sap.m.Link control which will be displayed at
    * the end of the message.
    */
  def getLink(): Link = js.native
  
  /**
    * Gets current value of property <code>showCloseButton</code>.Determines if the message has a close
    * button in the upper right corner.Default value is <code>false</code>.
    * @returns Value of property <code>showCloseButton</code>
    */
  def getShowCloseButton(): Boolean = js.native
  
  /**
    * Gets current value of property <code>showIcon</code>.Determines if an icon is displayed for the
    * message.Default value is <code>false</code>.
    * @returns Value of property <code>showIcon</code>
    */
  def getShowIcon(): Boolean = js.native
  
  /**
    * Gets current value of property <code>text</code>.Determines the text of the message.Default value is
    * <code></code>.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  
  /**
    * Gets current value of property <code>type</code>.Determines the type of messages that are displayed
    * in the MessageStrip.Possible values are: Information (default), Success, Warning, Error.If None is
    * passed, the value is set to Information and a warning is displayed in the console.Default value is
    * <code>Information</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): MessageType = js.native
  
  /**
    * Sets a new value for property <code>customIcon</code>.Determines a custom icon which is displayed.If
    * none is set, the default icon for this message type is used.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sCustomIcon New value for property <code>customIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomIcon(sCustomIcon: js.Any): MessageStrip = js.native
  
  /**
    * Sets the aggregated <code>link</code>.
    * @param oLink The link to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLink(oLink: Link): MessageStrip = js.native
  
  /**
    * Sets a new value for property <code>showCloseButton</code>.Determines if the message has a close
    * button in the upper right corner.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bShowCloseButton New value for property <code>showCloseButton</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowCloseButton(bShowCloseButton: Boolean): MessageStrip = js.native
  
  /**
    * Sets a new value for property <code>showIcon</code>.Determines if an icon is displayed for the
    * message.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>false</code>.
    * @param bShowIcon New value for property <code>showIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowIcon(bShowIcon: Boolean): MessageStrip = js.native
  
  /**
    * Setter for property text.Default value is empty/undefined
    * @param sText new value for property text
    * @returns this to allow method chaining
    */
  def setText(sText: String): MessageStrip = js.native
  
  /**
    * Setter for property type.Default value is sap.ui.core.MessageType.Information
    * @param sType The Message type
    * @returns this to allow method chaining
    */
  def setType(sType: MessageType): MessageStrip = js.native
}
