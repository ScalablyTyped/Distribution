package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.App")
@js.native
class App protected () extends NavContainer {
  /**
    * Constructor for a new App.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>orientationChange</code> event of this
    * <code>sap.m.App</code>.When called, the context of the event handler (its <code>this</code>) will be
    * bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.App</code> itself.Fired when the orientation (portrait/landscape) of the device is
    * changed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.App</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachOrientationChange(oData: js.Any, fnFunction: js.Any): App = js.native
  def attachOrientationChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): App = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>orientationChange</code> event of this
    * <code>sap.m.App</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachOrientationChange(fnFunction: js.Any, oListener: js.Any): App = js.native
  /**
    * Fires event <code>orientationChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>landscape</code> of type <code>boolean</code>Whether the device is in
    * landscape orientation.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireOrientationChange(mArguments: js.Any): App = js.native
  /**
    * Gets current value of property <code>backgroundColor</code>.Background color of the App. If set,
    * this color will override the default background defined by the theme. So this should only be set
    * when really required.Any configured background image will be placed above this colored background.
    * But any theme adaptation in the Theme Designer will override this setting.Use the "backgroundRepeat"
    * property to define whether this image should be stretched to cover the complete App or whether it
    * should be tiled.
    * @since 1.11.2
    * @returns Value of property <code>backgroundColor</code>
    */
  def getBackgroundColor(): String = js.native
  /**
    * Gets current value of property <code>backgroundImage</code>.Background image of the App. If set,
    * this image will override the default background defined by the theme. So this should only be set
    * when really required.This background image will be placed above any color set for the background.
    * But any theme adaptation in the Theme Designer will override this image setting.Use the
    * "backgroundRepeat" property to define whether this image should be stretched to cover the complete
    * App or whether it should be tiled.
    * @since 1.11.2
    * @returns Value of property <code>backgroundImage</code>
    */
  def getBackgroundImage(): js.Any = js.native
  /**
    * Gets current value of property <code>backgroundOpacity</code>.Opacity of the background image. The
    * opacity can be set between 0 (fully transparent) and 1 fully opaque).This can be used to make the
    * application content better readable by making the background image partly transparent.Default value
    * is <code>1</code>.
    * @since 1.11.2
    * @returns Value of property <code>backgroundOpacity</code>
    */
  def getBackgroundOpacity(): Double = js.native
  /**
    * Gets current value of property <code>backgroundRepeat</code>.Whether the background image (if
    * configured) should be proportionally stretched to cover the whole App (false) or whether it should
    * be tiled (true).Default value is <code>false</code>.
    * @since 1.11.2
    * @returns Value of property <code>backgroundRepeat</code>
    */
  def getBackgroundRepeat(): Boolean = js.native
  /**
    * Gets current value of property <code>homeIcon</code>.The icon to be displayed on the home screen of
    * iOS devices after the user does "add to home screen".Note that only the first attempt to set the
    * homeIcon will be executed, subsequent settings are ignored.This icon must be in PNG format. The
    * property can either hold the URL of one single icon which is used for all devices (and possibly
    * scaled, which looks not perfect), or an object holding icon URLs for the different required sizes.A
    * desktop icon (used for bookmarks and overriding the favicon) can also be configured. This requires
    * an object to be given and the "icon" property of this object then defines the desktop bookmark icon.
    * For this icon, PNG is not supported by Internet Explorer. The ICO format is supported by all
    * browsers. ICO is also preferred for this desktop icon setting because the file can contain different
    * images for different resolutions.One example
    * one-retina.png','tablet':'tablet-icon.png','tablet@2':'tablet-retina.png','icon':'desktop.ico'});The
    * respective image sizes are 57/114 px for the phone and 72/144 px for the tablet.If an object is
    * given but one of the sizes is not given, the largest given icon will be used for this size.On
    * Android these icons may or may not be used by the device. Apparently chances can be improved by
    * adding glare effect and rounded corners, setting the file name so it ends with "-precomposed.png"
    * and setting the "homeIconPrecomposed" property to "true".
    * @returns Value of property <code>homeIcon</code>
    */
  def getHomeIcon(): js.Any = js.native
  /**
    * Sets a new value for property <code>backgroundColor</code>.Background color of the App. If set, this
    * color will override the default background defined by the theme. So this should only be set when
    * really required.Any configured background image will be placed above this colored background. But
    * any theme adaptation in the Theme Designer will override this setting.Use the "backgroundRepeat"
    * property to define whether this image should be stretched to cover the complete App or whether it
    * should be tiled.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @since 1.11.2
    * @param sBackgroundColor New value for property <code>backgroundColor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundColor(sBackgroundColor: String): App = js.native
  /**
    * Sets a new value for property <code>backgroundImage</code>.Background image of the App. If set, this
    * image will override the default background defined by the theme. So this should only be set when
    * really required.This background image will be placed above any color set for the background. But any
    * theme adaptation in the Theme Designer will override this image setting.Use the "backgroundRepeat"
    * property to define whether this image should be stretched to cover the complete App or whether it
    * should be tiled.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @since 1.11.2
    * @param sBackgroundImage New value for property <code>backgroundImage</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundImage(sBackgroundImage: js.Any): App = js.native
  /**
    * Sets a new value for property <code>backgroundOpacity</code>.Opacity of the background image. The
    * opacity can be set between 0 (fully transparent) and 1 fully opaque).This can be used to make the
    * application content better readable by making the background image partly transparent.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>1</code>.
    * @since 1.11.2
    * @param fBackgroundOpacity New value for property <code>backgroundOpacity</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundOpacity(fBackgroundOpacity: Double): App = js.native
  /**
    * Sets a new value for property <code>backgroundRepeat</code>.Whether the background image (if
    * configured) should be proportionally stretched to cover the whole App (false) or whether it should
    * be tiled (true).When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>false</code>.
    * @since 1.11.2
    * @param bBackgroundRepeat New value for property <code>backgroundRepeat</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundRepeat(bBackgroundRepeat: Boolean): App = js.native
  /**
    * Sets a new value for property <code>homeIcon</code>.The icon to be displayed on the home screen of
    * iOS devices after the user does "add to home screen".Note that only the first attempt to set the
    * homeIcon will be executed, subsequent settings are ignored.This icon must be in PNG format. The
    * property can either hold the URL of one single icon which is used for all devices (and possibly
    * scaled, which looks not perfect), or an object holding icon URLs for the different required sizes.A
    * desktop icon (used for bookmarks and overriding the favicon) can also be configured. This requires
    * an object to be given and the "icon" property of this object then defines the desktop bookmark icon.
    * For this icon, PNG is not supported by Internet Explorer. The ICO format is supported by all
    * browsers. ICO is also preferred for this desktop icon setting because the file can contain different
    * images for different resolutions.One example
    * one-retina.png','tablet':'tablet-icon.png','tablet@2':'tablet-retina.png','icon':'desktop.ico'});The
    * respective image sizes are 57/114 px for the phone and 72/144 px for the tablet.If an object is
    * given but one of the sizes is not given, the largest given icon will be used for this size.On
    * Android these icons may or may not be used by the device. Apparently chances can be improved by
    * adding glare effect and rounded corners, setting the file name so it ends with "-precomposed.png"
    * and setting the "homeIconPrecomposed" property to "true".When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param oHomeIcon New value for property <code>homeIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHomeIcon(oHomeIcon: js.Any): App = js.native
}

