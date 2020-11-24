package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends Control {
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>error</code> event of this
    * <code>sap.m.Image</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Image</code> itself.Event is fired when the image resource can't be loaded. If
    * densityAware is set to true, the event is fired when none of the fallback resources can be loaded.
    * @since 1.36.2
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Image</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachError(oData: js.Any, fnFunction: js.Any): Image = js.native
  def attachError(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Image = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>load</code> event of this
    * <code>sap.m.Image</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Image</code> itself.Event is fired when the image resource is loaded.
    * @since 1.36.2
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Image</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachLoad(oData: js.Any, fnFunction: js.Any): Image = js.native
  def attachLoad(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Image = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.m.Image</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Image</code> itself.Event is fired when the user clicks on the control.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Image</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): Image = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Image = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>tap</code> event of this
    * <code>sap.m.Image</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Image</code> itself.Event is fired when the user clicks on the control. (This event is
    * deprecated, use the press event instead)
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Image</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachTap(oData: js.Any, fnFunction: js.Any): Image = js.native
  def attachTap(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Image = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>error</code> event of this
    * <code>sap.m.Image</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @since 1.36.2
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachError(fnFunction: js.Any, oListener: js.Any): Image = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>load</code> event of this
    * <code>sap.m.Image</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @since 1.36.2
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachLoad(fnFunction: js.Any, oListener: js.Any): Image = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.m.Image</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): Image = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>tap</code> event of this
    * <code>sap.m.Image</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachTap(fnFunction: js.Any, oListener: js.Any): Image = js.native
  
  /**
    * Fires event <code>error</code> to attached listeners.
    * @since 1.36.2
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireError(mArguments: js.Any): Image = js.native
  
  /**
    * Fires event <code>load</code> to attached listeners.
    * @since 1.36.2
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireLoad(mArguments: js.Any): Image = js.native
  
  /**
    * Fires event <code>press</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): Image = js.native
  
  /**
    * Fires event <code>tap</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireTap(mArguments: js.Any): Image = js.native
  
  /**
    * Gets current value of property <code>activeSrc</code>.The source property which is used when the
    * image is pressed.Default value is <code></code>.
    * @returns Value of property <code>activeSrc</code>
    */
  def getActiveSrc(): js.Any = js.native
  
  /**
    * Gets current value of property <code>alt</code>.The alternative text that is displayed in case the
    * Image is not available, or cannot be displayed.If the image is set to decorative this property is
    * ignored.
    * @returns Value of property <code>alt</code>
    */
  def getAlt(): String = js.native
  
  /**
    * Gets current value of property <code>backgroundPosition</code>.Defines the position of the image in
    * sap.m.ImageMode.Background mode. This property is set on the output DOM element using CSS style
    * 'background-position'. This property takes effect only when the 'mode' property is set to
    * sap.m.ImageMode.Background.Default value is <code>initial</code>.
    * @since 1.30.0
    * @returns Value of property <code>backgroundPosition</code>
    */
  def getBackgroundPosition(): String = js.native
  
  /**
    * Gets current value of property <code>backgroundRepeat</code>.Defines whether the source image is
    * repeated when the output DOM element is bigger than the source. This property is set on the output
    * DOM element using CSS style 'background-repeat'. This property takes effect only when the 'mode'
    * property is set to sap.m.ImageMode.Background.Default value is <code>no-repeat</code>.
    * @since 1.30.0
    * @returns Value of property <code>backgroundRepeat</code>
    */
  def getBackgroundRepeat(): String = js.native
  
  /**
    * Gets current value of property <code>backgroundSize</code>.Defines the size of the image in
    * sap.m.ImageMode.Background mode. This property is set on the output DOM element using CSS style
    * 'background-size'. This property takes effect only when the 'mode' property is set to
    * sap.m.ImageMode.Background.Default value is <code>cover</code>.
    * @since 1.30.0
    * @returns Value of property <code>backgroundSize</code>
    */
  def getBackgroundSize(): String = js.native
  
  /**
    * Gets current value of property <code>decorative</code>.A decorative image is included for design
    * reasons. Accessibility tools will ignore decorative images.Note: If the Image has an image map
    * (useMap is set), this property will be overridden (the image will not be rendered as decorative).A
    * decorative image has no ALT attribute, so the Alt property is ignored if the image is
    * decorative.Default value is <code>true</code>.
    * @returns Value of property <code>decorative</code>
    */
  def getDecorative(): Boolean = js.native
  
  /**
    * Gets current value of property <code>densityAware</code>.If this is set to false, the src image will
    * be loaded directly without attempting to fetch the density perfect image for high density device.By
    * default, this is set to true but then one or more requests are sent trying to get the density
    * perfect version of image if this version of image doesn't exist on the server.If bandwidth is the
    * key for the application, set this value to false.Default value is <code>true</code>.
    * @returns Value of property <code>densityAware</code>
    */
  def getDensityAware(): Boolean = js.native
  
  /**
    * Gets current value of property <code>height</code>.When the empty value is kept, the original size
    * is not changed. It is also possible to make settings for width or height only, the original ratio
    * between width/height is maintained. When 'mode' property is set to sap.m.ImageMode.Background, this
    * property always needs to be set. Otherwise the output DOM element has a 0 size.
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  
  /**
    * Gets current value of property <code>mode</code>.Defines how the src and the activeSrc is output to
    * the Dom Element. When set to sap.m.ImageMode.Image which is the default value, the src (activeSrc)
    * is set to the 'src' attribute of the 'img' tag. When set to sap.m.ImageMode.Background, the src
    * (activeSrc) is set to the CSS style 'background-image' and the root DOM element is rendered as a
    * 'span' tag instead of an 'img' tag.Default value is <code>Image</code>.
    * @since 1.30.0
    * @returns Value of property <code>mode</code>
    */
  def getMode(): ImageMode = js.native
  
  /**
    * Gets current value of property <code>src</code>.Relative or absolute path to URL where the image
    * file is stored. The path will be adapted to the density aware format according to the density of the
    * device following the convention that [imageName]@[densityValue].[extension]
    * @returns Value of property <code>src</code>
    */
  def getSrc(): js.Any = js.native
  
  /**
    * Gets current value of property <code>useMap</code>.The name of the image map that defines the
    * clickable areas
    * @returns Value of property <code>useMap</code>
    */
  def getUseMap(): String = js.native
  
  /**
    * Gets current value of property <code>width</code>.When the empty value is kept, the original size is
    * not changed. It is also possible to make settings for width or height only, the original ratio
    * between width/height is maintained. When 'mode' property is set to sap.m.ImageMode.Background, this
    * property always needs to be set. Otherwise the output DOM element has a 0 size.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  
  /**
    * This overrides the default setter of the activeSrc property in order to avoid the rerendering.
    * @param sActiveSrc undefined
    * @returns <code>this</code> pointer for chaining
    */
  def setActiveSrc(sActiveSrc: js.Any): Image = js.native
  
  /**
    * Sets a new value for property <code>alt</code>.The alternative text that is displayed in case the
    * Image is not available, or cannot be displayed.If the image is set to decorative this property is
    * ignored.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sAlt New value for property <code>alt</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAlt(sAlt: String): Image = js.native
  
  /**
    * Sets a new value for property <code>backgroundPosition</code>.Defines the position of the image in
    * sap.m.ImageMode.Background mode. This property is set on the output DOM element using CSS style
    * 'background-position'. This property takes effect only when the 'mode' property is set to
    * sap.m.ImageMode.Background.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>initial</code>.
    * @since 1.30.0
    * @param sBackgroundPosition New value for property <code>backgroundPosition</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundPosition(sBackgroundPosition: String): Image = js.native
  
  /**
    * Sets a new value for property <code>backgroundRepeat</code>.Defines whether the source image is
    * repeated when the output DOM element is bigger than the source. This property is set on the output
    * DOM element using CSS style 'background-repeat'. This property takes effect only when the 'mode'
    * property is set to sap.m.ImageMode.Background.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>no-repeat</code>.
    * @since 1.30.0
    * @param sBackgroundRepeat New value for property <code>backgroundRepeat</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundRepeat(sBackgroundRepeat: String): Image = js.native
  
  /**
    * Sets a new value for property <code>backgroundSize</code>.Defines the size of the image in
    * sap.m.ImageMode.Background mode. This property is set on the output DOM element using CSS style
    * 'background-size'. This property takes effect only when the 'mode' property is set to
    * sap.m.ImageMode.Background.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>cover</code>.
    * @since 1.30.0
    * @param sBackgroundSize New value for property <code>backgroundSize</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundSize(sBackgroundSize: String): Image = js.native
  
  /**
    * Sets a new value for property <code>decorative</code>.A decorative image is included for design
    * reasons. Accessibility tools will ignore decorative images.Note: If the Image has an image map
    * (useMap is set), this property will be overridden (the image will not be rendered as decorative).A
    * decorative image has no ALT attribute, so the Alt property is ignored if the image is
    * decorative.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bDecorative New value for property <code>decorative</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDecorative(bDecorative: Boolean): Image = js.native
  
  /**
    * Sets a new value for property <code>densityAware</code>.If this is set to false, the src image will
    * be loaded directly without attempting to fetch the density perfect image for high density device.By
    * default, this is set to true but then one or more requests are sent trying to get the density
    * perfect version of image if this version of image doesn't exist on the server.If bandwidth is the
    * key for the application, set this value to false.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bDensityAware New value for property <code>densityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDensityAware(bDensityAware: Boolean): Image = js.native
  
  /**
    * Sets a new value for property <code>height</code>.When the empty value is kept, the original size is
    * not changed. It is also possible to make settings for width or height only, the original ratio
    * between width/height is maintained. When 'mode' property is set to sap.m.ImageMode.Background, this
    * property always needs to be set. Otherwise the output DOM element has a 0 size.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): Image = js.native
  
  /**
    * Sets a new value for property <code>mode</code>.Defines how the src and the activeSrc is output to
    * the Dom Element. When set to sap.m.ImageMode.Image which is the default value, the src (activeSrc)
    * is set to the 'src' attribute of the 'img' tag. When set to sap.m.ImageMode.Background, the src
    * (activeSrc) is set to the CSS style 'background-image' and the root DOM element is rendered as a
    * 'span' tag instead of an 'img' tag.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Image</code>.
    * @since 1.30.0
    * @param sMode New value for property <code>mode</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMode(sMode: ImageMode): Image = js.native
  
  /**
    * This overrides the default setter of the src property and update the dom node.
    * @param sSrc undefined
    */
  def setSrc(sSrc: js.Any): Unit = js.native
  
  /**
    * Sets a new value for property <code>useMap</code>.The name of the image map that defines the
    * clickable areasWhen called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sUseMap New value for property <code>useMap</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUseMap(sUseMap: String): Image = js.native
  
  /**
    * Sets a new value for property <code>width</code>.When the empty value is kept, the original size is
    * not changed. It is also possible to make settings for width or height only, the original ratio
    * between width/height is maintained. When 'mode' property is set to sap.m.ImageMode.Background, this
    * property always needs to be set. Otherwise the output DOM element has a 0 size.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Image = js.native
}
