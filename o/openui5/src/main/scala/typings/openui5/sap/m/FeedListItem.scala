package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedListItem extends ListItemBase {
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>iconPress</code> event of this
    * <code>sap.m.FeedListItem</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.FeedListItem</code> itself.Event is fired when the icon is pressed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.FeedListItem</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachIconPress(oData: js.Any, fnFunction: js.Any): FeedListItem = js.native
  def attachIconPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FeedListItem = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>senderPress</code> event of this
    * <code>sap.m.FeedListItem</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.FeedListItem</code> itself.Event is fired when name of the sender is pressed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.FeedListItem</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSenderPress(oData: js.Any, fnFunction: js.Any): FeedListItem = js.native
  def attachSenderPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FeedListItem = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>iconPress</code> event of this
    * <code>sap.m.FeedListItem</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachIconPress(fnFunction: js.Any, oListener: js.Any): FeedListItem = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>senderPress</code> event of this
    * <code>sap.m.FeedListItem</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSenderPress(fnFunction: js.Any, oListener: js.Any): FeedListItem = js.native
  /**
    * Fires event <code>iconPress</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>domRef</code> of type <code>string</code>Dom reference of the feed item's
    * icon to be used for positioning.</li><li><code>getDomRef</code> of type
    * <code>function</code>Function to retrieve the DOM reference for the <code>iconPress</code> event.The
    * function returns the DOM element of the icon or null</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireIconPress(mArguments: js.Any): FeedListItem = js.native
  /**
    * Fires event <code>senderPress</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>domRef</code> of type <code>string</code>Dom reference of the feed item's
    * sender string to be used for positioning.</li><li><code>getDomRef</code> of type
    * <code>function</code>Function to retrieve the DOM reference for the <code>senderPress</code>
    * event.The function returns the DOM element of the sender link or null</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSenderPress(mArguments: js.Any): FeedListItem = js.native
  /**
    * Gets current value of property <code>activeIcon</code>.Icon displayed when the list item is active.
    * @returns Value of property <code>activeIcon</code>
    */
  def getActiveIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>icon</code>.Icon to be displayed as graphical element within
    * the FeedListItem. This can be an image or an icon from the icon font. If no icon is provided, a
    * default person-placeholder icon is displayed.Icon is only shown if showIcon = true.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>iconActive</code>.If true, icon is an link, which will fire
    * 'iconPress' events. If false, icon is normal imageDefault value is <code>true</code>.
    * @returns Value of property <code>iconActive</code>
    */
  def getIconActive(): Boolean = js.native
  /**
    * Gets current value of property <code>iconDensityAware</code>.By default, this is set to true but
    * then one or more requests are sent trying to get the density perfect version of image if this
    * version of image doesn't exist on the server.If bandwidth is the key for the application, set this
    * value to false.Default value is <code>true</code>.
    * @returns Value of property <code>iconDensityAware</code>
    */
  def getIconDensityAware(): Boolean = js.native
  /**
    * Gets current value of property <code>info</code>.The Info text.
    * @returns Value of property <code>info</code>
    */
  def getInfo(): String = js.native
  /**
    * Gets current value of property <code>maxCharacters</code>.The expand and collapse feature is set by
    * default and uses 300 characters on mobile devices and 500 characters on desktops as limits. Based on
    * these values, the text of the FeedListItem is collapsed once text reaches these limits. In this
    * case, only the specified number of characters is displayed. By clicking on the text link More, the
    * entire text can be displayed. The text link Less collapses the text. The application is able to set
    * the value to its needs.
    * @returns Value of property <code>maxCharacters</code>
    */
  def getMaxCharacters(): Double = js.native
  /**
    * Gets current value of property <code>sender</code>.Sender of the chunk
    * @returns Value of property <code>sender</code>
    */
  def getSender(): String = js.native
  /**
    * Gets current value of property <code>senderActive</code>.If true, sender string is an link, which
    * will fire 'senderPress' events. If false, sender is normal text.Default value is <code>true</code>.
    * @returns Value of property <code>senderActive</code>
    */
  def getSenderActive(): Boolean = js.native
  /**
    * Gets current value of property <code>showIcon</code>.If set to "true" (default), icons will be
    * displayed, if set to false icons are hiddenDefault value is <code>true</code>.
    * @returns Value of property <code>showIcon</code>
    */
  def getShowIcon(): Boolean = js.native
  /**
    * Gets current value of property <code>text</code>.The FeedListItem text.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  /**
    * Gets current value of property <code>timestamp</code>.This chunks timestamp
    * @returns Value of property <code>timestamp</code>
    */
  def getTimestamp(): String = js.native
  /**
    * Sets a new value for property <code>activeIcon</code>.Icon displayed when the list item is
    * active.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sActiveIcon New value for property <code>activeIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActiveIcon(sActiveIcon: js.Any): FeedListItem = js.native
  /**
    * Sets a new value for property <code>icon</code>.Icon to be displayed as graphical element within the
    * FeedListItem. This can be an image or an icon from the icon font. If no icon is provided, a default
    * person-placeholder icon is displayed.Icon is only shown if showIcon = true.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): FeedListItem = js.native
  /**
    * Sets a new value for property <code>iconActive</code>.If true, icon is an link, which will fire
    * 'iconPress' events. If false, icon is normal imageWhen called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bIconActive New value for property <code>iconActive</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconActive(bIconActive: Boolean): FeedListItem = js.native
  /**
    * Sets a new value for property <code>iconDensityAware</code>.By default, this is set to true but then
    * one or more requests are sent trying to get the density perfect version of image if this version of
    * image doesn't exist on the server.If bandwidth is the key for the application, set this value to
    * false.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @param bIconDensityAware New value for property <code>iconDensityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconDensityAware(bIconDensityAware: Boolean): FeedListItem = js.native
  /**
    * Sets a new value for property <code>info</code>.The Info text.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sInfo New value for property <code>info</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInfo(sInfo: String): FeedListItem = js.native
  /**
    * Sets a new value for property <code>maxCharacters</code>.The expand and collapse feature is set by
    * default and uses 300 characters on mobile devices and 500 characters on desktops as limits. Based on
    * these values, the text of the FeedListItem is collapsed once text reaches these limits. In this
    * case, only the specified number of characters is displayed. By clicking on the text link More, the
    * entire text can be displayed. The text link Less collapses the text. The application is able to set
    * the value to its needs.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param iMaxCharacters New value for property <code>maxCharacters</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxCharacters(iMaxCharacters: Double): FeedListItem = js.native
  /**
    * Sets a new value for property <code>sender</code>.Sender of the chunkWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sSender New value for property <code>sender</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSender(sSender: String): FeedListItem = js.native
  /**
    * Sets a new value for property <code>senderActive</code>.If true, sender string is an link, which
    * will fire 'senderPress' events. If false, sender is normal text.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bSenderActive New value for property <code>senderActive</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSenderActive(bSenderActive: Boolean): FeedListItem = js.native
  /**
    * Sets a new value for property <code>showIcon</code>.If set to "true" (default), icons will be
    * displayed, if set to false icons are hiddenWhen called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bShowIcon New value for property <code>showIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowIcon(bShowIcon: Boolean): FeedListItem = js.native
  /**
    * Sets a new value for property <code>text</code>.The FeedListItem text.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): FeedListItem = js.native
  /**
    * Sets a new value for property <code>timestamp</code>.This chunks timestampWhen called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sTimestamp New value for property <code>timestamp</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTimestamp(sTimestamp: String): FeedListItem = js.native
}

