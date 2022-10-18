package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.HideBrowser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUtilMobileMod extends Shortcut {
  
  @JSImport("sap/ui/util/Mobile", JSImport.Default)
  @js.native
  val default: Mobile = js.native
  
  /**
    * @SINCE 1.58
    */
  @js.native
  trait Mobile extends StObject {
    
    /**
      * Does some basic modifications to the HTML page that make it more suitable for mobile apps. Only the first
      * call to this method is executed, subsequent calls are ignored. Note that this method is also called by
      * the constructor of toplevel controls like sap.m.App, sap.m.SplitApp and sap.m.Shell. Exception: if `homeIcon`
      * or `mobileWebAppCapable` were not set, subsequent calls have the chance to set them.
      *
      * The "options" parameter configures what exactly should be done.
      *
      * It can have the following properties:
      * 	 - viewport: whether to set the viewport in a way that disables zooming (default: true)
      * 	 - statusBar: the iOS status bar color, "default", "black" or "black-translucent" (default: "default")
      *
      * 	 - hideBrowser: whether the browser UI should be hidden as far as possible to make the app feel more
      * 			native (default: true)
      * 	 - preventScroll: whether native scrolling should be disabled in order to prevent the "rubber-band"
      * 			effect where the whole window is moved (default: true)
      * 	 - preventPhoneNumberDetection: whether Safari Mobile should be prevented from transforming any numbers
      * 			that look like phone numbers into clickable links; this should be left as "true", otherwise it might
      * 			break controls because Safari actually changes the DOM. This only affects all page content which is created
      * 			after init() is called.
      * 	 - rootId: the ID of the root element that should be made fullscreen; only used when hideBrowser is
      * 			set (default: the document.body)
      * 	 - useFullScreenHeight: a boolean that defines whether the height of the html root element should be
      * 			set to 100%, which is required for other elements to cover the full height (default: true) homeIcon:
      * 			deprecated since 1.12, use sap/ui/util/Mobile.setIcons instead.
      */
    def init(): Unit = js.native
    def init(/**
      * configures what exactly should be done
      */
    options: HideBrowser): Unit = js.native
    
    /**
      * Sets the bookmark icon for desktop browsers and the icon to be displayed on the home screen of iOS devices
      * after the user does "add to home screen".
      *
      * Only call this method once and call it early when the page is loading: browsers behave differently when
      * the favicon is modified while the page is alive. Some update the displayed icon inside the browser but
      * use an old icon for bookmarks. When a favicon is given, any other existing favicon in the document will
      * be removed. When at least one home icon is given, all existing home icons will be removed and new home
      * icon tags for all four resolutions will be created.
      *
      * The home icons must be in PNG format and given in different sizes for iPad/iPhone with and without retina
      * display. The favicon is used in the browser and for desktop shortcuts and should optimally be in ICO
      * format: ICO files can contain different image sizes for different usage locations. E.g. a 16x16px version
      * is used inside browsers.
      *
      * All icons are given in an an object holding icon URLs and other settings. The properties of this object
      * are:
      * 	 - phone: a 60x60 pixel version for non-retina iPhones
      * 	 - tablet: a 76x76 pixel version for non-retina iPads
      * 	 - phone@2: a 120x120 pixel version for retina iPhones
      * 	 - tablet@2: a 152x152 pixel version for retina iPads
      * 	 - precomposed: whether the home icons already have some glare effect (otherwise iOS will add it) (default:
      * 			false)
      * 	 - favicon: the ICO file to be used inside the browser and for desktop shortcuts
      *
      * One example is:
      * ```javascript
      *
      * {
      *    'phone':'phone-icon_60x60.png',
      *    'phone@2':'phone-retina_120x120.png',
      *    'tablet':'tablet-icon_76x76.png',
      *    'tablet@2':'tablet-retina_152x152.png',
      *    'precomposed':true,
      *    'favicon':'desktop.ico'
      * }
      * ```
      *  If one of the sizes is not given, the largest available alternative image will be used instead for this
      * size. On Android these icons may or may not be used by the device. Apparently chances can be improved
      * by using icons with glare effect, so the "precomposed" property can be set to "true". Some Android devices
      * may also use the favicon for bookmarks instead of the home icons.
      */
    def setIcons(oIcons: js.Object): Unit = js.native
    
    /**
      * Sets the "apple-mobile-web-app-capable" and "mobile-web-app-capable" meta information which defines whether
      * the application is loaded in full screen mode (browser address bar and toolbar are hidden) after the
      * user does "add to home screen" on mobile devices. Currently this meta tag is only supported by iOS Safari
      * and mobile Chrome from version 31.
      *
      * If the application opens new tabs because of attachments, url and so on, setting this to false will let
      * the user be able to go from the new tab back to the application tab after the application is added to
      * home screen.
      *
      * Note: this function only has effect when the application runs on iOS Safari and mobile Chrome from version
      * 31.
      */
    def setWebAppCapable(
      /**
      * whether the Application will be loaded in full screen mode after added to home screen from iOS Safari
      * or mobile Chrome from version 31.
      */
    bValue: Boolean
    ): Unit = js.native
  }
  
  type _To = Mobile
  
  /* This means you don't have to write `default`, but can instead just say `sapUiUtilMobileMod.foo` */
  override def _to: Mobile = default
}
