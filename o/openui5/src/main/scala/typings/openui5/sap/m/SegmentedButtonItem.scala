package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentedButtonItem extends Item {
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.m.SegmentedButtonItem</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.SegmentedButtonItem</code> itself.Fires when the user clicks on an individual
    * button.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SegmentedButtonItem</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): SegmentedButtonItem = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SegmentedButtonItem = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.m.SegmentedButtonItem</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): SegmentedButtonItem = js.native
  
  /**
    * Fires event <code>press</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): SegmentedButtonItem = js.native
  
  /**
    * Gets current value of property <code>icon</code>.The icon, which belongs to the button.This can be
    * an URI to an image or an icon font URI.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): String = js.native
  
  /**
    * Gets current value of property <code>visible</code>.Whether the button should be visible on the
    * screen. If set to false, a placeholder is rendered instead of the real button.Default value is
    * <code>true</code>.
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Gets current value of property <code>width</code>.Sets the width of the buttons.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  
  /**
    * Sets a new value for property <code>icon</code>.The icon, which belongs to the button.This can be an
    * URI to an image or an icon font URI.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: String): SegmentedButtonItem = js.native
  
  /**
    * Sets a new value for property <code>visible</code>.Whether the button should be visible on the
    * screen. If set to false, a placeholder is rendered instead of the real button.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: Boolean): SegmentedButtonItem = js.native
  
  /**
    * Sets a new value for property <code>width</code>.Sets the width of the buttons.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): SegmentedButtonItem = js.native
}
