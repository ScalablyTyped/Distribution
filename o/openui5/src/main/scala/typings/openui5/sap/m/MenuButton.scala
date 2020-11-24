package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.TextDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuButton extends Control {
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>defaultAction</code> event of this
    * <code>sap.m.MenuButton</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.MenuButton</code> itself.Fired when the <code>buttonMode</code> is set to
    * <code>Split</code> and the user presses the main buttonunless <code>useDefaultActionOnly</code> is
    * set to <code>false</code> and another actionfrom the menu has been selected previously.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.MenuButton</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachDefaultAction(oData: js.Any, fnFunction: js.Any): MenuButton = js.native
  def attachDefaultAction(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MenuButton = js.native
  
  /**
    * Binds aggregation <code>menu</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindMenu(oBindingInfo: js.Any): MenuButton = js.native
  
  /**
    * Destroys the menu in the aggregation <code>menu</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyMenu(): MenuButton = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>defaultAction</code> event of this
    * <code>sap.m.MenuButton</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachDefaultAction(fnFunction: js.Any, oListener: js.Any): MenuButton = js.native
  
  /**
    * Fires event <code>defaultAction</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireDefaultAction(mArguments: js.Any): MenuButton = js.native
  
  /**
    * Gets current value of property <code>activeIcon</code>.The source property of an alternative icon
    * for the active (pressed) state of the button.Both active and default icon properties should be
    * defined and of the same type - image or icon font.If the <code>icon</code> property is not set or
    * has a different type, the active icon is not displayed.
    * @returns Value of property <code>activeIcon</code>
    */
  def getActiveIcon(): js.Any = js.native
  
  /**
    * Gets current value of property <code>buttonMode</code>.Defines whether the <code>MenuButton</code>
    * is set to <code>Regular</code> or <code>Split</code> mode.Default value is <code>Regular</code>.
    * @returns Value of property <code>buttonMode</code>
    */
  def getButtonMode(): MenuButtonMode = js.native
  
  /**
    * Gets current value of property <code>enabled</code>.Boolean property to enable the control (default
    * is <code>true</code>).<br/><b>Note:</b> Depending on custom settings, the buttons that are disabled
    * have other colors than the enabled ones.Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  
  /**
    * Gets current value of property <code>icon</code>.Defines the icon to be displayed as a graphical
    * element within the button.It can be an image or an icon from the icon font.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  
  /**
    * Gets current value of property <code>iconDensityAware</code>.When set to <code>true</code>
    * (default), one or more requests are sent trying to get thedensity perfect version of image if this
    * version of image doesn't exist on the server.If only one version of image is provided, set this
    * value to <code>false</code> toavoid the attempt of fetching density perfect image.Default value is
    * <code>true</code>.
    * @returns Value of property <code>iconDensityAware</code>
    */
  def getIconDensityAware(): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>menu</code>.Defines the menu that opens for this button.
    */
  def getMenu(): Menu = js.native
  
  /**
    * Gets current value of property <code>text</code>.Defines the text of the
    * <code>MenuButton</code>.<br/><b>Note:</b> In <code>Split</code> <code>buttonMode</code> with
    * <code>useDefaultActionOnly</code>set to <code>false</code>, the text is changed to display the last
    * selected item's text,while in <code>Regular</code> <code>buttonMode<code> the text stays unchanged.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  
  /**
    * Gets current value of property <code>textDirection</code>.Specifies the element's text
    * directionality with enumerated options.By default, the control inherits text direction from the
    * DOM.Default value is <code>Inherit</code>.
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): TextDirection = js.native
  
  /**
    * Gets current value of property <code>type</code>.Defines the type of the <code>MenuButton</code>
    * (for example, Default, Accept, Reject, Back, etc.)Default value is <code>Default</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): ButtonType = js.native
  
  /**
    * Gets current value of property <code>useDefaultActionOnly</code>.Controls whether the default action
    * handler is invoked always or it is invoked only until a menu item is selected.Usable only if
    * <code>buttonMode</code> is set to <code>Split</code>.Default value is <code>false</code>.
    * @returns Value of property <code>useDefaultActionOnly</code>
    */
  def getUseDefaultActionOnly(): Boolean = js.native
  
  /**
    * Gets current value of property <code>width</code>.Defines the width of the <code>MenuButton</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  
  /**
    * Sets a new value for property <code>activeIcon</code>.The source property of an alternative icon for
    * the active (pressed) state of the button.Both active and default icon properties should be defined
    * and of the same type - image or icon font.If the <code>icon</code> property is not set or has a
    * different type, the active icon is not displayed.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sActiveIcon New value for property <code>activeIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActiveIcon(sActiveIcon: js.Any): MenuButton = js.native
  
  /**
    * Sets the <code>buttonМode</code> of the control.
    * @param sMode The new button mode
    * @returns This instance
    */
  def setButtonMode(sMode: MenuButtonMode): MenuButton = js.native
  
  /**
    * Sets a new value for property <code>enabled</code>.Boolean property to enable the control (default
    * is <code>true</code>).<br/><b>Note:</b> Depending on custom settings, the buttons that are disabled
    * have other colors than the enabled ones.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): MenuButton = js.native
  
  /**
    * Sets a new value for property <code>iconDensityAware</code>.When set to <code>true</code> (default),
    * one or more requests are sent trying to get thedensity perfect version of image if this version of
    * image doesn't exist on the server.If only one version of image is provided, set this value to
    * <code>false</code> toavoid the attempt of fetching density perfect image.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bIconDensityAware New value for property <code>iconDensityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconDensityAware(bIconDensityAware: Boolean): MenuButton = js.native
  
  /**
    * Sets the aggregated <code>menu</code>.
    * @param oMenu The menu to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMenu(oMenu: Menu): MenuButton = js.native
  
  /**
    * Sets a new value for property <code>textDirection</code>.Specifies the element's text directionality
    * with enumerated options.By default, the control inherits text direction from the DOM.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>Inherit</code>.
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: TextDirection): MenuButton = js.native
  
  /**
    * Sets a new value for property <code>useDefaultActionOnly</code>.Controls whether the default action
    * handler is invoked always or it is invoked only until a menu item is selected.Usable only if
    * <code>buttonMode</code> is set to <code>Split</code>.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param sUseDefaultActionOnly New value for property <code>useDefaultActionOnly</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUseDefaultActionOnly(sUseDefaultActionOnly: Boolean): MenuButton = js.native
  
  /**
    * Sets a new value for property <code>width</code>.Defines the width of the
    * <code>MenuButton</code>.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): MenuButton = js.native
  
  /**
    * Unbinds aggregation <code>menu</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindMenu(): MenuButton = js.native
}
