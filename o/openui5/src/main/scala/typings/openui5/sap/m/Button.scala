package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.TextDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Button extends Control {
  
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): Button = js.native
  def addAriaDescribedBy(vAriaDescribedBy: Control): Button = js.native
  
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Button = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): Button = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.m.Button</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Button</code> itself.Event is fired when the user clicks on the control.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Button</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): Button = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Button = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>tap</code> event of this
    * <code>sap.m.Button</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Button</code> itself.Event is fired when the user taps the control.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Button</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachTap(oData: js.Any, fnFunction: js.Any): Button = js.native
  def attachTap(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Button = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.m.Button</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): Button = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>tap</code> event of this
    * <code>sap.m.Button</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachTap(fnFunction: js.Any, oListener: js.Any): Button = js.native
  
  /**
    * Fires event <code>press</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): Button = js.native
  
  /**
    * Fires event <code>tap</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireTap(mArguments: js.Any): Button = js.native
  
  /**
    * Gets current value of property <code>activeIcon</code>.The source property of an alternative icon
    * for the active (depressed) state of the button.Both active and default icon properties should be
    * defined and have the same type: image or icon font.If the <code>icon</code> property is not set or
    * has a different type, the active icon is not displayed.
    * @returns Value of property <code>activeIcon</code>
    */
  def getActiveIcon(): js.Any = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaDescribedBy</code>.
    */
  def getAriaDescribedBy(): js.Array[_] = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  
  /**
    * Gets current value of property <code>enabled</code>.Boolean property to enable the control (default
    * is true). Buttons that are disabled have other colors than enabled ones, depending on custom
    * settingsDefault value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  
  /**
    * Gets current value of property <code>icon</code>.Icon to be displayed as graphical element within
    * the button. This can be an image or an icon from the icon font.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  
  /**
    * Gets current value of property <code>iconDensityAware</code>.By default, this is set to true but
    * then one or more requests are sent trying to get the density perfect version of image if this
    * version of image doesn't exist on the server.If only one version of image is provided, set this
    * value to false to avoid the attempt of fetching density perfect image.Default value is
    * <code>true</code>.
    * @returns Value of property <code>iconDensityAware</code>
    */
  def getIconDensityAware(): Boolean = js.native
  
  /**
    * Gets current value of property <code>iconFirst</code>.If set to true (default), the display sequence
    * is 1. icon 2. control textDefault value is <code>true</code>.
    * @returns Value of property <code>iconFirst</code>
    */
  def getIconFirst(): Boolean = js.native
  
  /**
    * Defines to which DOM reference the Popup should be docked
    * @returns the DOM reference that Popup should dock to
    */
  def getPopupAnchorDomRef(): js.Any = js.native
  
  /**
    * Gets current value of property <code>text</code>.Button text
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  
  /**
    * Gets current value of property <code>textDirection</code>.This property specifies the element's text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): TextDirection = js.native
  
  /**
    * Gets current value of property <code>type</code>.Type of a button (e.g. Default, Accept, Reject,
    * Back, etc.)Default value is <code>Default</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): ButtonType = js.native
  
  /**
    * Gets current value of property <code>width</code>.Defines the width of the button.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaDescribedBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaDescribedBy(): js.Array[_] = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
    * @returns The removed ariaDescribedBy or <code>null</code>
    */
  def removeAriaDescribedBy(vAriaDescribedBy: Double): js.Any = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Control): js.Any = js.native
  
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  
  /**
    * Sets a new value for property <code>activeIcon</code>.The source property of an alternative icon for
    * the active (depressed) state of the button.Both active and default icon properties should be defined
    * and have the same type: image or icon font.If the <code>icon</code> property is not set or has a
    * different type, the active icon is not displayed.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sActiveIcon New value for property <code>activeIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActiveIcon(sActiveIcon: js.Any): Button = js.native
  
  /**
    * Sets a new value for property <code>enabled</code>.Boolean property to enable the control (default
    * is true). Buttons that are disabled have other colors than enabled ones, depending on custom
    * settingsWhen called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): Button = js.native
  
  /**
    * Property setter for the icon
    * @param sIcon new value of the Icon property
    * @returns this to allow method chaining
    */
  def setIcon(sIcon: js.Any): Button = js.native
  
  /**
    * Sets a new value for property <code>iconDensityAware</code>.By default, this is set to true but then
    * one or more requests are sent trying to get the density perfect version of image if this version of
    * image doesn't exist on the server.If only one version of image is provided, set this value to false
    * to avoid the attempt of fetching density perfect image.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bIconDensityAware New value for property <code>iconDensityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconDensityAware(bIconDensityAware: Boolean): Button = js.native
  
  /**
    * Sets a new value for property <code>iconFirst</code>.If set to true (default), the display sequence
    * is 1. icon 2. control textWhen called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>true</code>.
    * @param bIconFirst New value for property <code>iconFirst</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconFirst(bIconFirst: Boolean): Button = js.native
  
  /**
    * Property setter for the text
    * @param sText new value of the Text attribute
    * @returns this to allow method chaining
    */
  def setText(sText: String): Button = js.native
  
  /**
    * Sets a new value for property <code>textDirection</code>.This property specifies the element's text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: TextDirection): Button = js.native
  
  /**
    * Sets a new value for property <code>type</code>.Type of a button (e.g. Default, Accept, Reject,
    * Back, etc.)When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>Default</code>.
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: ButtonType): Button = js.native
  
  /**
    * Sets a new value for property <code>width</code>.Defines the width of the button.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Button = js.native
}
