package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icon extends Control {
  
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Icon = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): Icon = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.ui.core.Icon</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.ui.core.Icon</code> itself.This event is fired when icon is pressed/activated by the user.
    * When a handler is attached to this event, the Icon gets tab stop. If you want to disable this
    * behavior, set the noTabStop property to true.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.core.Icon</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): Icon = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Icon = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.ui.core.Icon</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): Icon = js.native
  
  /**
    * Fires event <code>press</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): Icon = js.native
  
  /**
    * Gets current value of property <code>activeBackgroundColor</code>.Background color for Icon in
    * active state.
    * @returns Value of property <code>activeBackgroundColor</code>
    */
  def getActiveBackgroundColor(): String = js.native
  
  /**
    * Gets current value of property <code>activeColor</code>.This color is shown when icon is
    * pressed/activated by the user.
    * @returns Value of property <code>activeColor</code>
    */
  def getActiveColor(): String = js.native
  
  /**
    * Gets current value of property <code>alt</code>.This defines the alternative text which is used for
    * outputting the aria-label attribute on the DOM.
    * @since 1.30.0
    * @returns Value of property <code>alt</code>
    */
  def getAlt(): String = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  
  /**
    * Gets current value of property <code>backgroundColor</code>.Background color of the Icon in normal
    * state.
    * @returns Value of property <code>backgroundColor</code>
    */
  def getBackgroundColor(): String = js.native
  
  /**
    * Gets current value of property <code>color</code>.The color of the Icon. If color is not defined
    * here, the Icon inherits the color from its DOM parent.
    * @returns Value of property <code>color</code>
    */
  def getColor(): String = js.native
  
  /**
    * Gets current value of property <code>decorative</code>.A decorative icon is included for design
    * reasons. Accessibility tools will ignore decorative icons. Tab stop isn't affected by this property
    * anymore and it's now controlled by the existence of press event handler and the noTabStop
    * property.Default value is <code>true</code>.
    * @since 1.16.4
    * @returns Value of property <code>decorative</code>
    */
  def getDecorative(): Boolean = js.native
  
  /**
    * Gets current value of property <code>height</code>.This is the height of the DOM element which
    * contains the Icon. Setting this property doesn't affect the size of the font. If you want to make
    * the font bigger, increase the size property.
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  
  /**
    * Gets current value of property <code>hoverBackgroundColor</code>.Background color for Icon in hover
    * state. This property has no visual effect when run on mobile device.
    * @returns Value of property <code>hoverBackgroundColor</code>
    */
  def getHoverBackgroundColor(): String = js.native
  
  /**
    * Gets current value of property <code>hoverColor</code>.This color is shown when icon is hovered.
    * This property has no visual effect when run on mobile device.
    * @returns Value of property <code>hoverColor</code>
    */
  def getHoverColor(): String = js.native
  
  /**
    * Gets current value of property <code>noTabStop</code>.Defines whether the tab stop of icon is
    * controlled by the existence of press event handler. When it's set to false, Icon control has tab
    * stop when press event handler is attached.If it's set to true, Icon control never has tab stop no
    * matter whether press event handler exists or not.Default value is <code>false</code>.
    * @since 1.30.1
    * @returns Value of property <code>noTabStop</code>
    */
  def getNoTabStop(): Boolean = js.native
  
  /**
    * Gets current value of property <code>size</code>.Since Icon uses font, this property will be applied
    * to the css font-size property on the rendered DOM element.
    * @returns Value of property <code>size</code>
    */
  def getSize(): js.Any = js.native
  
  /**
    * Gets current value of property <code>src</code>.This property should be set by the return value of
    * calling sap.ui.core.IconPool.getIconURI with a Icon name parameter and an optional collection
    * parameter which is required when using application extended Icons. A list of standard FontIcon is
    * available here.
    * @returns Value of property <code>src</code>
    */
  def getSrc(): js.Any = js.native
  
  /**
    * Gets current value of property <code>useIconTooltip</code>.Decides whether a default Icon tooltip
    * should be used if no tooltip is set.Default value is <code>true</code>.
    * @since 1.30.0
    * @returns Value of property <code>useIconTooltip</code>
    */
  def getUseIconTooltip(): Boolean = js.native
  
  /**
    * Gets current value of property <code>width</code>.This is the width of the DOM element which
    * contains the Icon. Setting this property doesn't affect the size of the font. If you want to make
    * the font bigger, increase the size property.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  
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
    * Sets a new value for property <code>activeBackgroundColor</code>.Background color for Icon in active
    * state.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sActiveBackgroundColor New value for property <code>activeBackgroundColor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActiveBackgroundColor(sActiveBackgroundColor: String): Icon = js.native
  
  /**
    * Sets a new value for property <code>activeColor</code>.This color is shown when icon is
    * pressed/activated by the user.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sActiveColor New value for property <code>activeColor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActiveColor(sActiveColor: String): Icon = js.native
  
  /**
    * Sets a new value for property <code>alt</code>.This defines the alternative text which is used for
    * outputting the aria-label attribute on the DOM.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.30.0
    * @param sAlt New value for property <code>alt</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAlt(sAlt: String): Icon = js.native
  
  /**
    * Sets a new value for property <code>backgroundColor</code>.Background color of the Icon in normal
    * state.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sBackgroundColor New value for property <code>backgroundColor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundColor(sBackgroundColor: String): Icon = js.native
  
  /**
    * Sets a new value for property <code>color</code>.The color of the Icon. If color is not defined
    * here, the Icon inherits the color from its DOM parent.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.
    * @param sColor New value for property <code>color</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColor(sColor: String): Icon = js.native
  
  /**
    * Sets a new value for property <code>decorative</code>.A decorative icon is included for design
    * reasons. Accessibility tools will ignore decorative icons. Tab stop isn't affected by this property
    * anymore and it's now controlled by the existence of press event handler and the noTabStop
    * property.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @since 1.16.4
    * @param bDecorative New value for property <code>decorative</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDecorative(bDecorative: Boolean): Icon = js.native
  
  /**
    * Sets a new value for property <code>height</code>.This is the height of the DOM element which
    * contains the Icon. Setting this property doesn't affect the size of the font. If you want to make
    * the font bigger, increase the size property.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): Icon = js.native
  
  /**
    * Sets a new value for property <code>hoverBackgroundColor</code>.Background color for Icon in hover
    * state. This property has no visual effect when run on mobile device.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sHoverBackgroundColor New value for property <code>hoverBackgroundColor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHoverBackgroundColor(sHoverBackgroundColor: String): Icon = js.native
  
  /**
    * Sets a new value for property <code>hoverColor</code>.This color is shown when icon is hovered. This
    * property has no visual effect when run on mobile device.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sHoverColor New value for property <code>hoverColor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHoverColor(sHoverColor: String): Icon = js.native
  
  /**
    * Sets a new value for property <code>noTabStop</code>.Defines whether the tab stop of icon is
    * controlled by the existence of press event handler. When it's set to false, Icon control has tab
    * stop when press event handler is attached.If it's set to true, Icon control never has tab stop no
    * matter whether press event handler exists or not.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.30.1
    * @param bNoTabStop New value for property <code>noTabStop</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNoTabStop(bNoTabStop: Boolean): Icon = js.native
  
  /**
    * Sets a new value for property <code>size</code>.Since Icon uses font, this property will be applied
    * to the css font-size property on the rendered DOM element.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sSize New value for property <code>size</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSize(sSize: js.Any): Icon = js.native
  
  /**
    * Sets a new value for property <code>src</code>.This property should be set by the return value of
    * calling sap.ui.core.IconPool.getIconURI with a Icon name parameter and an optional collection
    * parameter which is required when using application extended Icons. A list of standard FontIcon is
    * available here.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sSrc New value for property <code>src</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSrc(sSrc: js.Any): Icon = js.native
  
  /**
    * Sets a new value for property <code>useIconTooltip</code>.Decides whether a default Icon tooltip
    * should be used if no tooltip is set.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @since 1.30.0
    * @param bUseIconTooltip New value for property <code>useIconTooltip</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUseIconTooltip(bUseIconTooltip: Boolean): Icon = js.native
  
  /**
    * Sets a new value for property <code>width</code>.This is the width of the DOM element which contains
    * the Icon. Setting this property doesn't affect the size of the font. If you want to make the font
    * bigger, increase the size property.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Icon = js.native
}
