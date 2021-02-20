package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipBase extends Control {
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>closed</code> event of this
    * <code>sap.ui.core.TooltipBase</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.core.TooltipBase</code> itself.This event is fired when the Tooltip has been
    * closed
    * @since 1.11.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.core.TooltipBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachClosed(oData: js.Any, fnFunction: js.Any): TooltipBase = js.native
  def attachClosed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TooltipBase = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>closed</code> event of this
    * <code>sap.ui.core.TooltipBase</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @since 1.11.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachClosed(fnFunction: js.Any, oListener: js.Any): TooltipBase = js.native
  
  /**
    * Fires event <code>closed</code> to attached listeners.
    * @since 1.11.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireClosed(mArguments: js.Any): TooltipBase = js.native
  
  /**
    * Gets current value of property <code>atPosition</code>.Optional. At position defines which position
    * on the target control to align the positioned tooltip.Default value is <code>begin bottom</code>.
    * @returns Value of property <code>atPosition</code>
    */
  def getAtPosition(): js.Any = js.native
  
  /**
    * Gets current value of property <code>closeDelay</code>.Closing delay of the tooltip in
    * millisecondsDefault value is <code>100</code>.
    * @returns Value of property <code>closeDelay</code>
    */
  def getCloseDelay(): Double = js.native
  
  /**
    * Gets current value of property <code>closeDuration</code>.Optional. Close Duration in
    * milliseconds.Default value is <code>200</code>.
    * @returns Value of property <code>closeDuration</code>
    */
  def getCloseDuration(): Double = js.native
  
  /**
    * Gets current value of property <code>collision</code>.Optional. Collision - when the positioned
    * element overflows the window in some direction, move it to an alternative position.Default value is
    * <code>flip</code>.
    * @returns Value of property <code>collision</code>
    */
  def getCollision(): js.Any = js.native
  
  /**
    * Gets current value of property <code>myPosition</code>.Optional. My position defines which position
    * on the extended tooltip being positioned to align with the target control.Default value is
    * <code>begin top</code>.
    * @returns Value of property <code>myPosition</code>
    */
  def getMyPosition(): js.Any = js.native
  
  /**
    * Gets current value of property <code>offset</code>.Optional. Offset adds these left-top values to
    * the calculated position.Example: "10 3".Default value is <code>10 3</code>.
    * @returns Value of property <code>offset</code>
    */
  def getOffset(): String = js.native
  
  /**
    * Gets current value of property <code>openDelay</code>.Opening delay of the tooltip in
    * millisecondsDefault value is <code>500</code>.
    * @returns Value of property <code>openDelay</code>
    */
  def getOpenDelay(): Double = js.native
  
  /**
    * Gets current value of property <code>openDuration</code>.Optional. Open Duration in
    * milliseconds.Default value is <code>200</code>.
    * @returns Value of property <code>openDuration</code>
    */
  def getOpenDuration(): Double = js.native
  
  /**
    * Gets current value of property <code>text</code>.The text that is shown in the tooltip that extends
    * the TooltipBase class, for example in RichTooltip.Default value is <code></code>.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  
  /**
    * Sets a new value for property <code>atPosition</code>.Optional. At position defines which position
    * on the target control to align the positioned tooltip.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>begin bottom</code>.
    * @param sAtPosition New value for property <code>atPosition</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAtPosition(sAtPosition: js.Any): TooltipBase = js.native
  
  /**
    * Sets a new value for property <code>closeDelay</code>.Closing delay of the tooltip in
    * millisecondsWhen called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>100</code>.
    * @param iCloseDelay New value for property <code>closeDelay</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCloseDelay(iCloseDelay: Double): TooltipBase = js.native
  
  /**
    * Sets a new value for property <code>closeDuration</code>.Optional. Close Duration in
    * milliseconds.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>200</code>.
    * @param iCloseDuration New value for property <code>closeDuration</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCloseDuration(iCloseDuration: Double): TooltipBase = js.native
  
  /**
    * Sets a new value for property <code>collision</code>.Optional. Collision - when the positioned
    * element overflows the window in some direction, move it to an alternative position.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>flip</code>.
    * @param sCollision New value for property <code>collision</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCollision(sCollision: js.Any): TooltipBase = js.native
  
  /**
    * Sets a new value for property <code>myPosition</code>.Optional. My position defines which position
    * on the extended tooltip being positioned to align with the target control.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>begin top</code>.
    * @param sMyPosition New value for property <code>myPosition</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMyPosition(sMyPosition: js.Any): TooltipBase = js.native
  
  /**
    * Sets a new value for property <code>offset</code>.Optional. Offset adds these left-top values to the
    * calculated position.Example: "10 3".When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is <code>10
    * 3</code>.
    * @param sOffset New value for property <code>offset</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setOffset(sOffset: String): TooltipBase = js.native
  
  /**
    * Sets a new value for property <code>openDelay</code>.Opening delay of the tooltip in
    * millisecondsWhen called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>500</code>.
    * @param iOpenDelay New value for property <code>openDelay</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setOpenDelay(iOpenDelay: Double): TooltipBase = js.native
  
  /**
    * Sets a new value for property <code>openDuration</code>.Optional. Open Duration in milliseconds.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>200</code>.
    * @param iOpenDuration New value for property <code>openDuration</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setOpenDuration(iOpenDuration: Double): TooltipBase = js.native
  
  /**
    * Sets a new value for property <code>text</code>.The text that is shown in the tooltip that extends
    * the TooltipBase class, for example in RichTooltip.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code></code>.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): TooltipBase = js.native
}
