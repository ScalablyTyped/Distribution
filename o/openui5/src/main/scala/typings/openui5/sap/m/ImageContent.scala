package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageContent extends Control {
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.m.ImageContent</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.ImageContent</code> itself.The event is fired when the user chooses the image
    * content.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ImageContent</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): ImageContent = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ImageContent = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.m.ImageContent</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): ImageContent = js.native
  /**
    * Fires event <code>press</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): ImageContent = js.native
  /**
    * Gets current value of property <code>description</code>.Description of image. This text is used to
    * provide ScreenReader information.
    * @returns Value of property <code>description</code>
    */
  def getDescription(): String = js.native
  /**
    * Gets current value of property <code>src</code>.The image to be displayed as a graphical element
    * within the imageContent. This can be an image or an icon from the icon font.
    * @returns Value of property <code>src</code>
    */
  def getSrc(): js.Any = js.native
  /**
    * Sets a new value for property <code>description</code>.Description of image. This text is used to
    * provide ScreenReader information.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sDescription New value for property <code>description</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDescription(sDescription: String): ImageContent = js.native
  /**
    * Sets a new value for property <code>src</code>.The image to be displayed as a graphical element
    * within the imageContent. This can be an image or an icon from the icon font.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sSrc New value for property <code>src</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSrc(sSrc: js.Any): ImageContent = js.native
}

