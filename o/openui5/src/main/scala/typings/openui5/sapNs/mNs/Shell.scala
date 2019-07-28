package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Shell")
@js.native
class Shell protected () extends Control {
  /**
    * Constructor for a new Shell.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>logout</code> event of this
    * <code>sap.m.Shell</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Shell</code> itself.Fires when the user presses the logout button/link.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Shell</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachLogout(oData: js.Any, fnFunction: js.Any): Shell = js.native
  def attachLogout(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Shell = js.native
  /**
    * Destroys the app in the aggregation <code>app</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyApp(): Shell = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>logout</code> event of this
    * <code>sap.m.Shell</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachLogout(fnFunction: js.Any, oListener: js.Any): Shell = js.native
  /**
    * Fires event <code>logout</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireLogout(mArguments: js.Any): Shell = js.native
  /**
    * Gets content of aggregation <code>app</code>.A Shell contains an App or a SplitApp (they may be
    * wrapped in a View). Other control types are not allowed.
    */
  def getApp(): Control = js.native
  /**
    * Gets current value of property <code>appWidthLimited</code>.Determines whether the width of the
    * content (the aggregated App) should be limited or extended to the full screen width.Default value is
    * <code>true</code>.
    * @returns Value of property <code>appWidthLimited</code>
    */
  def getAppWidthLimited(): Boolean = js.native
  /**
    * Gets current value of property <code>backgroundColor</code>.Defines the background color of the
    * Shell. If set, this color will override the default background defined by the theme. This should
    * only be set when really required.Any configured background image will be placed above this colored
    * background.Use the backgroundRepeat property to define whether this image should be stretched to
    * cover the complete Shell or whether it should be tiled.
    * @since 1.11.2
    * @returns Value of property <code>backgroundColor</code>
    */
  def getBackgroundColor(): js.Any = js.native
  /**
    * Gets current value of property <code>backgroundImage</code>.Defines the background image of the
    * Shell. If set, this image will override the default background defined by the theme. This should
    * only be set when really required.This background image will be placed above any color set for the
    * background.Use the backgroundRepeat property to define whether this image should be stretched to
    * cover the complete Shell or whether it should be tiled.
    * @since 1.11.2
    * @returns Value of property <code>backgroundImage</code>
    */
  def getBackgroundImage(): js.Any = js.native
  /**
    * Gets current value of property <code>backgroundOpacity</code>.Defines the opacity of the background
    * image. The opacity can be set between 0 (fully transparent) and 1 (fully opaque).This can be used to
    * improve readability of the Shell content by making the background image partly transparent.Default
    * value is <code>1</code>.
    * @since 1.11.2
    * @returns Value of property <code>backgroundOpacity</code>
    */
  def getBackgroundOpacity(): Double = js.native
  /**
    * Gets current value of property <code>backgroundRepeat</code>.Determines whether the background image
    * (if configured) should be proportionally stretched to cover the whole Shell (false, default) or
    * whether it should be tiled (true).Default value is <code>false</code>.
    * @since 1.11.2
    * @returns Value of property <code>backgroundRepeat</code>
    */
  def getBackgroundRepeat(): Boolean = js.native
  /**
    * Gets current value of property <code>headerRightText</code>.Defines texts, such as the name of the
    * logged-in user, which should be displayed on the right side of the header (if there is enough space
    * to display the header at all - this only happens on very tall screens (1568px height), otherwise, it
    * is always hidden).
    * @returns Value of property <code>headerRightText</code>
    */
  def getHeaderRightText(): String = js.native
  /**
    * Gets current value of property <code>homeIcon</code>.Sets the icon used for the mobile device home
    * screen and the icon to be used for bookmarks by desktop browsers.This property should be only set
    * once, and as early as possible. Subsequent calls replace the previous icon settings and may lead to
    * different behavior depending on the browser.Different image sizes for device home screen need to be
    * given as PNG images, an ICO file needs to be given as desktop browser bookmark icon (other file
    * formats may not work in all browsers).The <code>precomposed</code> flag defines whether there is
    * already a glow effect contained in the home screen images (or whether iOS should add such an
    * effect). The given structure could look like
    * con_72x72.png','tablet@2':'tablet-retina_144x144.png','precomposed':true,'favicon':'favicon.ico'}See
    * jQuery.sap.setIcons() for full documentation.
    * @returns Value of property <code>homeIcon</code>
    */
  def getHomeIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>logo</code>.Defines the logo to be displayed next to the App
    * when the screen is sufficiently large.
    * @returns Value of property <code>logo</code>
    */
  def getLogo(): js.Any = js.native
  /**
    * Gets current value of property <code>showLogout</code>.Determines whether the Logout button should
    * be displayed. Currently, this only happens on very tall screens (1568px height), otherwise, it is
    * always hidden.Default value is <code>true</code>.
    * @returns Value of property <code>showLogout</code>
    */
  def getShowLogout(): Boolean = js.native
  /**
    * Gets current value of property <code>title</code>.Defines the application title, which may or may
    * not be displayed outside the actual application, depending on the available screen size.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  /**
    * Sets the aggregated <code>app</code>.
    * @param oApp The app to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setApp(oApp: Control): Shell = js.native
  /**
    * Sets a new value for property <code>appWidthLimited</code>.Determines whether the width of the
    * content (the aggregated App) should be limited or extended to the full screen width.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bAppWidthLimited New value for property <code>appWidthLimited</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAppWidthLimited(bAppWidthLimited: Boolean): Shell = js.native
  /**
    * Sets a new value for property <code>backgroundColor</code>.Defines the background color of the
    * Shell. If set, this color will override the default background defined by the theme. This should
    * only be set when really required.Any configured background image will be placed above this colored
    * background.Use the backgroundRepeat property to define whether this image should be stretched to
    * cover the complete Shell or whether it should be tiled.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.11.2
    * @param sBackgroundColor New value for property <code>backgroundColor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundColor(sBackgroundColor: js.Any): Shell = js.native
  /**
    * Sets a new value for property <code>backgroundImage</code>.Defines the background image of the
    * Shell. If set, this image will override the default background defined by the theme. This should
    * only be set when really required.This background image will be placed above any color set for the
    * background.Use the backgroundRepeat property to define whether this image should be stretched to
    * cover the complete Shell or whether it should be tiled.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.11.2
    * @param sBackgroundImage New value for property <code>backgroundImage</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundImage(sBackgroundImage: js.Any): Shell = js.native
  /**
    * Sets a new value for property <code>backgroundOpacity</code>.Defines the opacity of the background
    * image. The opacity can be set between 0 (fully transparent) and 1 (fully opaque).This can be used to
    * improve readability of the Shell content by making the background image partly transparent.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>1</code>.
    * @since 1.11.2
    * @param fBackgroundOpacity New value for property <code>backgroundOpacity</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundOpacity(fBackgroundOpacity: Double): Shell = js.native
  /**
    * Sets a new value for property <code>backgroundRepeat</code>.Determines whether the background image
    * (if configured) should be proportionally stretched to cover the whole Shell (false, default) or
    * whether it should be tiled (true).When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.11.2
    * @param bBackgroundRepeat New value for property <code>backgroundRepeat</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundRepeat(bBackgroundRepeat: Boolean): Shell = js.native
  /**
    * Sets a new value for property <code>headerRightText</code>.Defines texts, such as the name of the
    * logged-in user, which should be displayed on the right side of the header (if there is enough space
    * to display the header at all - this only happens on very tall screens (1568px height), otherwise, it
    * is always hidden).When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param sHeaderRightText New value for property <code>headerRightText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeaderRightText(sHeaderRightText: String): Shell = js.native
  /**
    * Sets a new value for property <code>homeIcon</code>.Sets the icon used for the mobile device home
    * screen and the icon to be used for bookmarks by desktop browsers.This property should be only set
    * once, and as early as possible. Subsequent calls replace the previous icon settings and may lead to
    * different behavior depending on the browser.Different image sizes for device home screen need to be
    * given as PNG images, an ICO file needs to be given as desktop browser bookmark icon (other file
    * formats may not work in all browsers).The <code>precomposed</code> flag defines whether there is
    * already a glow effect contained in the home screen images (or whether iOS should add such an
    * effect). The given structure could look like
    * con_72x72.png','tablet@2':'tablet-retina_144x144.png','precomposed':true,'favicon':'favicon.ico'}See
    * jQuery.sap.setIcons() for full documentation.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param oHomeIcon New value for property <code>homeIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHomeIcon(oHomeIcon: js.Any): Shell = js.native
  /**
    * Sets a new value for property <code>logo</code>.Defines the logo to be displayed next to the App
    * when the screen is sufficiently large.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sLogo New value for property <code>logo</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLogo(sLogo: js.Any): Shell = js.native
  /**
    * Sets a new value for property <code>showLogout</code>.Determines whether the Logout button should be
    * displayed. Currently, this only happens on very tall screens (1568px height), otherwise, it is
    * always hidden.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bShowLogout New value for property <code>showLogout</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowLogout(bShowLogout: Boolean): Shell = js.native
  /**
    * Sets a new value for property <code>title</code>.Defines the application title, which may or may not
    * be displayed outside the actual application, depending on the available screen size.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: String): Shell = js.native
}

