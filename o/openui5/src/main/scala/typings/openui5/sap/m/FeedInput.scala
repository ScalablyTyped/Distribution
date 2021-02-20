package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.TooltipBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedInput extends Control {
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>post</code> event of this
    * <code>sap.m.FeedInput</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.FeedInput</code> itself.The Post event is triggered when the user has entered a value
    * and pressed the post button. After firing this event, the value is reset.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.FeedInput</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPost(oData: js.Any, fnFunction: js.Any): FeedInput = js.native
  def attachPost(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FeedInput = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>post</code> event of this
    * <code>sap.m.FeedInput</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPost(fnFunction: js.Any, oListener: js.Any): FeedInput = js.native
  
  /**
    * Fires event <code>post</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>value</code> of type <code>string</code>The value of the feed input before
    * reseting it.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePost(mArguments: js.Any): FeedInput = js.native
  
  /**
    * Gets current value of property <code>ariaLabelForPicture</code>.Text for Picture which will be read
    * by screenreader.If a new ariaLabelForPicture is set, any previously set ariaLabelForPicture is
    * deactivated.
    * @since 1.30
    * @returns Value of property <code>ariaLabelForPicture</code>
    */
  def getAriaLabelForPicture(): String = js.native
  
  /**
    * Gets current value of property <code>buttonTooltip</code>.Sets a new tooltip for Submit button. The
    * tooltip can either be a simple string (which in most cases will be rendered as the title attribute
    * of this element)or an instance of sap.ui.core.TooltipBase.If a new tooltip is set, any previously
    * set tooltip is deactivated.The default value is set language dependent.Default value is
    * <code>Submit</code>.
    * @since 1.28
    * @returns Value of property <code>buttonTooltip</code>
    */
  def getButtonTooltip(): TooltipBase = js.native
  
  /**
    * Gets current value of property <code>enabled</code>.Set this flag to "false" to disable both text
    * input and post button.Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  
  /**
    * Gets current value of property <code>icon</code>.Icon to be displayed as a graphical element within
    * the feed input. This can be an image or an icon from the icon font.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  
  /**
    * Gets current value of property <code>iconDensityAware</code>.Some mobile devices support higher
    * resolution images while others do not. Therefore, you should provide image resources for all
    * relevant densities.If the property is set to "true", one or more requests are sent to the server to
    * try and get the perfect density version of an image. If an image of a certain density is not
    * available, the image control falls back to the default image, which should be provided.If you do not
    * have higher resolution images, you should set the property to "false" to avoid unnecessary
    * round-trips.Please be aware that this property is relevant only for images and not for icons.Default
    * value is <code>true</code>.
    * @returns Value of property <code>iconDensityAware</code>
    */
  def getIconDensityAware(): Boolean = js.native
  
  /**
    * Gets current value of property <code>maxLength</code>.The maximum length (the maximum number of
    * characters) for the feed input's value. By default this is not limited.Default value is
    * <code>0</code>.
    * @returns Value of property <code>maxLength</code>
    */
  def getMaxLength(): Double = js.native
  
  /**
    * Gets current value of property <code>placeholder</code>.The placeholder text shown in the input area
    * as long as the user has not entered any text value.Default value is <code>Post something
    * here</code>.
    * @returns Value of property <code>placeholder</code>
    */
  def getPlaceholder(): String = js.native
  
  /**
    * Gets current value of property <code>showIcon</code>.If set to "true" (default), icons will be
    * displayed. In case no icon is provided the standard placeholder will be displayed. if set to "false"
    * icons are hiddenDefault value is <code>true</code>.
    * @returns Value of property <code>showIcon</code>
    */
  def getShowIcon(): Boolean = js.native
  
  /**
    * Gets current value of property <code>value</code>.The text value of the feed input. As long as the
    * user has not entered any text the post button is disabled
    * @returns Value of property <code>value</code>
    */
  def getValue(): String = js.native
  
  /**
    * Sets a new value for property <code>ariaLabelForPicture</code>.Text for Picture which will be read
    * by screenreader.If a new ariaLabelForPicture is set, any previously set ariaLabelForPicture is
    * deactivated.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @since 1.30
    * @param sAriaLabelForPicture New value for property <code>ariaLabelForPicture</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAriaLabelForPicture(sAriaLabelForPicture: String): FeedInput = js.native
  
  /**
    * Sets a new value for property <code>buttonTooltip</code>.Sets a new tooltip for Submit button. The
    * tooltip can either be a simple string (which in most cases will be rendered as the title attribute
    * of this element)or an instance of sap.ui.core.TooltipBase.If a new tooltip is set, any previously
    * set tooltip is deactivated.The default value is set language dependent.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Submit</code>.
    * @since 1.28
    * @param sButtonTooltip New value for property <code>buttonTooltip</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setButtonTooltip(sButtonTooltip: TooltipBase): FeedInput = js.native
  
  /**
    * Sets a new value for property <code>enabled</code>.Set this flag to "false" to disable both text
    * input and post button.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): FeedInput = js.native
  
  /**
    * Sets a new value for property <code>icon</code>.Icon to be displayed as a graphical element within
    * the feed input. This can be an image or an icon from the icon font.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): FeedInput = js.native
  
  /**
    * Sets a new value for property <code>iconDensityAware</code>.Some mobile devices support higher
    * resolution images while others do not. Therefore, you should provide image resources for all
    * relevant densities.If the property is set to "true", one or more requests are sent to the server to
    * try and get the perfect density version of an image. If an image of a certain density is not
    * available, the image control falls back to the default image, which should be provided.If you do not
    * have higher resolution images, you should set the property to "false" to avoid unnecessary
    * round-trips.Please be aware that this property is relevant only for images and not for icons.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>true</code>.
    * @param bIconDensityAware New value for property <code>iconDensityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconDensityAware(bIconDensityAware: Boolean): FeedInput = js.native
  
  /**
    * Sets a new value for property <code>maxLength</code>.The maximum length (the maximum number of
    * characters) for the feed input's value. By default this is not limited.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>0</code>.
    * @param iMaxLength New value for property <code>maxLength</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxLength(iMaxLength: Double): FeedInput = js.native
  
  /**
    * Sets a new value for property <code>placeholder</code>.The placeholder text shown in the input area
    * as long as the user has not entered any text value.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Post something here</code>.
    * @param sPlaceholder New value for property <code>placeholder</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPlaceholder(sPlaceholder: String): FeedInput = js.native
  
  /**
    * Sets a new value for property <code>showIcon</code>.If set to "true" (default), icons will be
    * displayed. In case no icon is provided the standard placeholder will be displayed. if set to "false"
    * icons are hiddenWhen called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bShowIcon New value for property <code>showIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowIcon(bShowIcon: Boolean): FeedInput = js.native
  
  /**
    * Sets a new value for property <code>value</code>.The text value of the feed input. As long as the
    * user has not entered any text the post button is disabledWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: String): FeedInput = js.native
}
