package typings.openui5.global.sap.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Device {
  
  object browser {
    
    @JSGlobal("sap.ui.Device.browser")
    @js.native
    val ^ : js.Any = js.native
    
    object BROWSER {
      
      @JSGlobal("sap.ui.Device.browser.BROWSER")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Android stock browser name.
        */
      @JSGlobal("sap.ui.Device.browser.BROWSER.ANDROID")
      @js.native
      def ANDROID: js.Any = js.native
      @scala.inline
      def ANDROID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANDROID")(x.asInstanceOf[js.Any])
      
      /**
        * Chrome browser name.
        */
      @JSGlobal("sap.ui.Device.browser.BROWSER.CHROME")
      @js.native
      def CHROME: js.Any = js.native
      @scala.inline
      def CHROME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHROME")(x.asInstanceOf[js.Any])
      
      /**
        * Edge browser name.
        * @since 1.28.0
        */
      @JSGlobal("sap.ui.Device.browser.BROWSER.EDGE")
      @js.native
      def EDGE: js.Any = js.native
      @scala.inline
      def EDGE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDGE")(x.asInstanceOf[js.Any])
      
      /**
        * Firefox browser name.
        */
      @JSGlobal("sap.ui.Device.browser.BROWSER.FIREFOX")
      @js.native
      def FIREFOX: js.Any = js.native
      @scala.inline
      def FIREFOX_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIREFOX")(x.asInstanceOf[js.Any])
      
      /**
        * Internet Explorer browser name.
        */
      @JSGlobal("sap.ui.Device.browser.BROWSER.INTERNET_EXPLORER")
      @js.native
      def INTERNET_EXPLORER: js.Any = js.native
      @scala.inline
      def INTERNET_EXPLORER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERNET_EXPLORER")(x.asInstanceOf[js.Any])
      
      /**
        * Safari browser name.
        */
      @JSGlobal("sap.ui.Device.browser.BROWSER.SAFARI")
      @js.native
      def SAFARI: js.Any = js.native
      @scala.inline
      def SAFARI_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAFARI")(x.asInstanceOf[js.Any])
    }
    
    /**
      * If this flag is set to <code>true</code>, the Google Chrome browser is used.
      */
    @JSGlobal("sap.ui.Device.browser.chrome")
    @js.native
    def chrome: Boolean = js.native
    @scala.inline
    def chrome_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chrome")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the Microsoft Edge browser is used.
      * @since 1.30.0
      */
    @JSGlobal("sap.ui.Device.browser.edge")
    @js.native
    def edge: Boolean = js.native
    @scala.inline
    def edge_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edge")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the Mozilla Firefox browser is used.
      */
    @JSGlobal("sap.ui.Device.browser.firefox")
    @js.native
    def firefox: Boolean = js.native
    @scala.inline
    def firefox_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firefox")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the Safari browser runs in standalone fullscreen mode on
      * iOS.<b>Note:</b> This flag is only available if the Safari browser was detected. Furthermore, if
      * this mode is detected,technically not a standard Safari is used. There might be slight differences
      * in behavior and detection, e.g.the availability of {@link sap.ui.Device.browser#version}.
      * @since 1.31.0
      */
    @JSGlobal("sap.ui.Device.browser.fullscreen")
    @js.native
    def fullscreen: Boolean = js.native
    @scala.inline
    def fullscreen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the Microsoft Internet Explorer browser is used.
      */
    @JSGlobal("sap.ui.Device.browser.internet_explorer")
    @js.native
    def internetExplorer: Boolean = js.native
    
    @scala.inline
    def internetExplorer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("internet_explorer")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the mobile variant of the browser is used.<b>Note:</b>
      * This information might not be available for all browsers.
      */
    @JSGlobal("sap.ui.Device.browser.mobile")
    @js.native
    def mobile: Boolean = js.native
    @scala.inline
    def mobile_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mobile")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, a browser featuring a Mozilla engine is used.
      * @since 1.20.0
      */
    @JSGlobal("sap.ui.Device.browser.mozilla")
    @js.native
    def mozilla: Boolean = js.native
    @scala.inline
    def mozilla_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mozilla")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the Microsoft Internet Explorer browser is used.
      * @since 1.20.0
      */
    @JSGlobal("sap.ui.Device.browser.msie")
    @js.native
    def msie: Boolean = js.native
    @scala.inline
    def msie_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("msie")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the browser.
      */
    @JSGlobal("sap.ui.Device.browser.name")
    @js.native
    def name: String = js.native
    @scala.inline
    def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the Apple Safari browser is used.<b>Note:</b>This flag is
      * also <code>true</code> when the standalone (fullscreen) mode or webview is used on iOS
      * devices.Please also note the flags {@link sap.ui.Device.browser#fullscreen} and {@link
      * sap.ui.Device.browser#webview}.
      */
    @JSGlobal("sap.ui.Device.browser.safari")
    @js.native
    def safari: Boolean = js.native
    @scala.inline
    def safari_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safari")(x.asInstanceOf[js.Any])
    
    /**
      * The version of the browser as <code>float</code>.Might be <code>-1</code> if no version can be
      * determined.
      */
    @JSGlobal("sap.ui.Device.browser.version")
    @js.native
    def version: Double = js.native
    
    /**
      * The version of the browser as <code>string</code>.Might be empty if no version can be determined.
      */
    @JSGlobal("sap.ui.Device.browser.versionStr")
    @js.native
    def versionStr: String = js.native
    @scala.inline
    def versionStr_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionStr")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def version_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, a browser featuring a Webkit engine is used.
      * @since 1.20.0
      */
    @JSGlobal("sap.ui.Device.browser.webkit")
    @js.native
    def webkit: Boolean = js.native
    @scala.inline
    def webkit_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webkit")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the Safari browser runs in webview mode on
      * iOS.<b>Note:</b> This flag is only available if the Safari browser was detected. Furthermore, if
      * this mode is detected,technically not a standard Safari is used. There might be slight differences
      * in behavior and detection, e.g.the availability of {@link sap.ui.Device.browser#version}.
      * @since 1.31.0
      */
    @JSGlobal("sap.ui.Device.browser.webview")
    @js.native
    def webview: Boolean = js.native
    @scala.inline
    def webview_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webview")(x.asInstanceOf[js.Any])
  }
  
  object media {
    
    object RANGESETS {
      
      @JSGlobal("sap.ui.Device.media.RANGESETS")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * A 3-step range set (S-L).The ranges of this set are:<ul><li><code>"S"</code>: For screens smaller
        * than 520 pixels.</li><li><code>"M"</code>: For screens greater than or equal to 520 pixels and
        * smaller than 960 pixels.</li><li><code>"L"</code>: For screens greater than or equal to 960
        * pixels.</li></ul>To use this range set, you must initialize it explicitly ({@link
        * sap.ui.Device.media.html#initRangeSet}).If this range set is initialized, a CSS class is added to
        * the page root (<code>html</code> tag) which indicates the currentscreen width range:
        * <code>sapUiMedia-3Step-<i>NAME_OF_THE_INTERVAL</i></code>.
        */
      @JSGlobal("sap.ui.Device.media.RANGESETS.SAP_3STEPS")
      @js.native
      def SAP_3STEPS: js.Any = js.native
      @scala.inline
      def SAP_3STEPS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAP_3STEPS")(x.asInstanceOf[js.Any])
      
      /**
        * A 4-step range set (S-XL).The ranges of this set are:<ul><li><code>"S"</code>: For screens smaller
        * than 520 pixels.</li><li><code>"M"</code>: For screens greater than or equal to 520 pixels and
        * smaller than 760 pixels.</li><li><code>"L"</code>: For screens greater than or equal to 760 pixels
        * and smaller than 960 pixels.</li><li><code>"XL"</code>: For screens greater than or equal to 960
        * pixels.</li></ul>To use this range set, you must initialize it explicitly ({@link
        * sap.ui.Device.media.html#initRangeSet}).If this range set is initialized, a CSS class is added to
        * the page root (<code>html</code> tag) which indicates the currentscreen width range:
        * <code>sapUiMedia-4Step-<i>NAME_OF_THE_INTERVAL</i></code>.
        */
      @JSGlobal("sap.ui.Device.media.RANGESETS.SAP_4STEPS")
      @js.native
      def SAP_4STEPS: js.Any = js.native
      @scala.inline
      def SAP_4STEPS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAP_4STEPS")(x.asInstanceOf[js.Any])
      
      /**
        * A 6-step range set (XS-XXL).The ranges of this set are:<ul><li><code>"XS"</code>: For screens
        * smaller than 241 pixels.</li><li><code>"S"</code>: For screens greater than or equal to 241 pixels
        * and smaller than 400 pixels.</li><li><code>"M"</code>: For screens greater than or equal to 400
        * pixels and smaller than 541 pixels.</li><li><code>"L"</code>: For screens greater than or equal to
        * 541 pixels and smaller than 768 pixels.</li><li><code>"XL"</code>: For screens greater than or equal
        * to 768 pixels and smaller than 960 pixels.</li><li><code>"XXL"</code>: For screens greater than or
        * equal to 960 pixels.</li></ul>To use this range set, you must initialize it explicitly ({@link
        * sap.ui.Device.media.html#initRangeSet}).If this range set is initialized, a CSS class is added to
        * the page root (<code>html</code> tag) which indicates the currentscreen width range:
        * <code>sapUiMedia-6Step-<i>NAME_OF_THE_INTERVAL</i></code>.
        */
      @JSGlobal("sap.ui.Device.media.RANGESETS.SAP_6STEPS")
      @js.native
      def SAP_6STEPS: js.Any = js.native
      @scala.inline
      def SAP_6STEPS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAP_6STEPS")(x.asInstanceOf[js.Any])
      
      /**
        * A 3-step range set (Phone, Tablet, Desktop).The ranges of this set are:<ul><li><code>"Phone"</code>:
        * For screens smaller than 600 pixels.</li><li><code>"Tablet"</code>: For screens greater than or
        * equal to 600 pixels and smaller than 1024 pixels.</li><li><code>"Desktop"</code>: For screens
        * greater than or equal to 1024 pixels.</li></ul>This range set is initialized by default. An
        * initialization via {@link sap.ui.Device.media.html#initRangeSet} is not needed.A CSS class is added
        * to the page root (<code>html</code> tag) which indicates the currentscreen width range:
        * <code>sapUiMedia-Std-<i>NAME_OF_THE_INTERVAL</i></code>.Furthermore there are 5 additional CSS
        * classes to hide elements based on the width of the screen:<ul><li><code>sapUiHideOnPhone</code>:
        * Will be hidden if the screen has 600px or more</li><li><code>sapUiHideOnTablet</code>: Will be
        * hidden if the screen has less than 600px or more than
        * 1023px</li><li><code>sapUiHideOnDesktop</code>: Will be hidden if the screen is smaller than
        * 1024px</li><li><code>sapUiVisibleOnlyOnPhone</code>: Will be visible if the screen has less than
        * 600px</li><li><code>sapUiVisibleOnlyOnTablet</code>: Will be visible if the screen has 600px or more
        * but less than 1024px</li><li><code>sapUiVisibleOnlyOnDesktop</code>: Will be visible if the screen
        * has 1024px or more</li></ul>
        */
      @JSGlobal("sap.ui.Device.media.RANGESETS.SAP_STANDARD")
      @js.native
      def SAP_STANDARD: js.Any = js.native
      @scala.inline
      def SAP_STANDARD_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAP_STANDARD")(x.asInstanceOf[js.Any])
      
      /**
        * A 4-step range set (Phone, Tablet, Desktop, LargeDesktop).The ranges of this set
        * are:<ul><li><code>"Phone"</code>: For screens smaller than 600
        * pixels.</li><li><code>"Tablet"</code>: For screens greater than or equal to 600 pixels and smaller
        * than 1024 pixels.</li><li><code>"Desktop"</code>: For screens greater than or equal to 1024 pixels
        * and smaller than 1440 pixels.</li><li><code>"LargeDesktop"</code>: For screens greater than or equal
        * to 1440 pixels.</li></ul>This range set is initialized by default. An initialization via {@link
        * sap.ui.Device.media.html#initRangeSet} is not needed.A CSS class is added to the page root
        * (<code>html</code> tag) which indicates the currentscreen width range:
        * <code>sapUiMedia-StdExt-<i>NAME_OF_THE_INTERVAL</i></code>.
        */
      @JSGlobal("sap.ui.Device.media.RANGESETS.SAP_STANDARD_EXTENDED")
      @js.native
      def SAP_STANDARD_EXTENDED: js.Any = js.native
      @scala.inline
      def SAP_STANDARD_EXTENDED_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAP_STANDARD_EXTENDED")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Registers the given event handler to change events of the screen width based on the range set with
      * the specified name.The event is fired whenever the screen width changes and the current screen width
      * is ina different interval of the given range set than before the width change.The event handler is
      * called with a single argument: a map <code>mParams</code> which provides the following
      * informationabout the entered interval:<ul><li><code>mParams.from</code>: The start value (inclusive)
      * of the entered interval as a number</li><li><code>mParams.to</code>: The end value (exclusive) range
      * of the entered interval as a number or undefined for the last interval
      * (infinity)</li><li><code>mParams.unit</code>: The unit used for the values above, e.g.
      * <code>"px"</code></li><li><code>mParams.name</code>: The name of the entered interval, if
      * available</li></ul>
      * @param fnFunction The handler function to call when the event occurs. This function will be called
      * in the context of the                      <code>oListener</code> instance (if present) or on the
      * <code>window</code> instance. A map with information                      about the entered range
      * set is provided as a single argument to the handler (see details above).
      * @param oListener The object that wants to be notified when the event occurs (<code>this</code>
      * context within the                       handler function). If it is not specified, the handler
      * function is called in the context of the <code>window</code>.
      * @param sName The name of the range set to listen to. The range set must be initialized beforehand   
      *              ({@link sap.ui.Device.media.html#initRangeSet}). If no name is provided, the           
      *      {@link sap.ui.Device.media.RANGESETS.SAP_STANDARD default range set} is used.
      */
    @JSGlobal("sap.ui.Device.media.attachHandler")
    @js.native
    def attachHandler(fnFunction: js.Any, oListener: js.Any, sName: String): Unit = js.native
    
    /**
      * Removes a previously attached event handler from the change events of the screen width.The passed
      * parameters must match those used for registration with {@link #attachHandler} beforehand.
      * @param fnFunction The handler function to detach from the event
      * @param oListener The object that wanted to be notified when the event occurred
      * @param sName The name of the range set to listen to. If no name is provided, the                 
      * {@link sap.ui.Device.media.RANGESETS.SAP_STANDARD default range set} is used.
      */
    @JSGlobal("sap.ui.Device.media.detachHandler")
    @js.native
    def detachHandler(fnFunction: js.Any, oListener: js.Any, sName: String): Unit = js.native
    
    /**
      * Returns information about the current active range of the range set with the given name.
      * @param sName The name of the range set. The range set must be initialized beforehand ({@link
      * sap.ui.Device.media.html#initRangeSet})
      * @returns Information about the current active interval of the range set. The returned map has the
      * same structure as the argument of the event handlers ({link sap.ui.Device.media#attachHandler})
      */
    @JSGlobal("sap.ui.Device.media.getCurrentRange")
    @js.native
    def getCurrentRange(sName: String): js.Any = js.native
    
    /**
      * Returns <code>true</code> if a range set with the given name is already initialized.
      * @param sName The name of the range set.
      * @returns Returns <code>true</code> if a range set with the given name is already initialized
      */
    @JSGlobal("sap.ui.Device.media.hasRangeSet")
    @js.native
    def hasRangeSet(sName: String): Boolean = js.native
    
    /**
      * Initializes a screen width media query range set.This initialization step makes the range set ready
      * to be used for one of the other functions in namespace <code>sap.ui.Device.media</code>.The most
      * important {@link sap.ui.Device.media.RANGESETS predefined range sets} are initialized
      * automatically.To make a not yet initialized {@link sap.ui.Device.media.RANGESETS predefined range
      * set} ready to be used, call this function with thename of the range set to be
      * :<pre>sap.ui.Device.media.initRangeSet(sap.ui.Device.media.RANGESETS.SAP_3STEPS);</pre>Alternatively
      * it is possible to define custom range sets as shown in the following
      * example:<pre>sap.ui.Device.media.initRangeSet("MyRangeSet", [200, 400], "px", ["Small", "Medium",
      * "Large"]);</pre>This example defines the following named ranges:<ul><li><code>"Small"</code>: For
      * screens smaller than 200 pixels.</li><li><code>"Medium"</code>: For screens greater than or equal to
      * 200 pixels and smaller than 400 pixels.</li><li><code>"Large"</code>: For screens greater than or
      * equal to 400 pixels.</li></ul>The range names are optional. If they are specified a CSS class (e.g.
      * <code>sapUiMedia-MyRangeSet-Small</code>) is alsoadded to the document root depending on the current
      * active range. This can be suppressed via parameter <code>bSuppressClasses</code>.
      * @param sName The name of the range set to be initialized - either a {@link
      * sap.ui.Device.media.RANGESETS predefined} or custom one.                  The name must be a valid
      * id and consist only of letters and numeric digits.
      * @param aRangeBorders The range borders
      * @param sUnit The unit which should be used for the values given in <code>aRangeBorders</code>.      
      *              The allowed values are <code>"px"</code> (default), <code>"em"</code> or
      * <code>"rem"</code>
      * @param aRangeNames The names of the ranges. The names must be a valid id and consist only of letters
      * and digits. If names            are specified, CSS classes are also added to the document root as
      * described above. This behavior can be            switched off explicitly by using
      * <code>bSuppressClasses</code>. <b>Note:</b> <code>aRangeBorders</code> with <code>n</code> entries  
      *          define <code>n+1</code> ranges. Therefore <code>n+1</code> names must be provided.
      * @param bSuppressClasses Whether or not writing of CSS classes to the document root should be
      * suppressed when            <code>aRangeNames</code> are provided
      */
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(sName: String): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: js.UndefOr[scala.Nothing],
      sUnit: js.UndefOr[scala.Nothing],
      aRangeNames: js.UndefOr[scala.Nothing],
      bSuppressClasses: Boolean
    ): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: js.UndefOr[scala.Nothing],
      sUnit: js.UndefOr[scala.Nothing],
      aRangeNames: js.Array[String]
    ): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: js.UndefOr[scala.Nothing],
      sUnit: js.UndefOr[scala.Nothing],
      aRangeNames: js.Array[String],
      bSuppressClasses: Boolean
    ): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(sName: String, aRangeBorders: js.UndefOr[scala.Nothing], sUnit: String): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: js.UndefOr[scala.Nothing],
      sUnit: String,
      aRangeNames: js.UndefOr[scala.Nothing],
      bSuppressClasses: Boolean
    ): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: js.UndefOr[scala.Nothing],
      sUnit: String,
      aRangeNames: js.Array[String]
    ): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: js.UndefOr[scala.Nothing],
      sUnit: String,
      aRangeNames: js.Array[String],
      bSuppressClasses: Boolean
    ): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(sName: String, aRangeBorders: Double): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: Double,
      sUnit: js.UndefOr[scala.Nothing],
      aRangeNames: js.UndefOr[scala.Nothing],
      bSuppressClasses: Boolean
    ): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: Double,
      sUnit: js.UndefOr[scala.Nothing],
      aRangeNames: js.Array[String]
    ): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: Double,
      sUnit: js.UndefOr[scala.Nothing],
      aRangeNames: js.Array[String],
      bSuppressClasses: Boolean
    ): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(sName: String, aRangeBorders: Double, sUnit: String): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: Double,
      sUnit: String,
      aRangeNames: js.UndefOr[scala.Nothing],
      bSuppressClasses: Boolean
    ): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(sName: String, aRangeBorders: Double, sUnit: String, aRangeNames: js.Array[String]): Unit = js.native
    @JSGlobal("sap.ui.Device.media.initRangeSet")
    @js.native
    def initRangeSet(
      sName: String,
      aRangeBorders: Double,
      sUnit: String,
      aRangeNames: js.Array[String],
      bSuppressClasses: Boolean
    ): Unit = js.native
    
    /**
      * Removes a previously initialized range set and detaches all registered handlers.Only custom range
      * sets can be removed via this function. Initialized predefined range sets({@link
      * sap.ui.Device.media#RANGESETS}) cannot be removed.
      * @param sName The name of the range set which should be removed.
      */
    @JSGlobal("sap.ui.Device.media.removeRangeSet")
    @js.native
    def removeRangeSet(sName: String): Unit = js.native
  }
  
  object orientation {
    
    @JSGlobal("sap.ui.Device.orientation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Registers the given event handler to orientation change events of the document's window.The event is
      * fired whenever the screen orientation changes and the width of the document's windowbecomes greater
      * than its height or the other way round.The event handler is called with a single argument: a map
      * <code>mParams</code> which provides the following
      * information:<ul><li><code>mParams.landscape</code>: If this flag is set to <code>true</code>, the
      * screen is currently in landscape mode, otherwise in portrait mode.</li></ul>
      * @param fnFunction The handler function to call when the event occurs. This function will be called
      * in the context of the                      <code>oListener</code> instance (if present) or on the
      * <code>window</code> instance. A map with information                      about the orientation is
      * provided as a single argument to the handler (see details above).
      * @param oListener The object that wants to be notified when the event occurs (<code>this</code>
      * context within the                       handler function). If it is not specified, the handler
      * function is called in the context of the <code>window</code>.
      */
    @JSGlobal("sap.ui.Device.orientation.attachHandler")
    @js.native
    def attachHandler(fnFunction: js.Any): Unit = js.native
    @JSGlobal("sap.ui.Device.orientation.attachHandler")
    @js.native
    def attachHandler(fnFunction: js.Any, oListener: js.Any): Unit = js.native
    
    /**
      * Removes a previously attached event handler from the orientation change events.The passed parameters
      * must match those used for registration with {@link #attachHandler} beforehand.
      * @param fnFunction The handler function to detach from the event
      * @param oListener The object that wanted to be notified when the event occurred
      */
    @JSGlobal("sap.ui.Device.orientation.detachHandler")
    @js.native
    def detachHandler(fnFunction: js.Any): Unit = js.native
    @JSGlobal("sap.ui.Device.orientation.detachHandler")
    @js.native
    def detachHandler(fnFunction: js.Any, oListener: js.Any): Unit = js.native
    
    /**
      * If this flag is set to <code>true</code>, the screen is currently in landscape mode (the width is
      * greater than the height).
      */
    @JSGlobal("sap.ui.Device.orientation.landscape")
    @js.native
    def landscape: Boolean = js.native
    @scala.inline
    def landscape_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("landscape")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the screen is currently in portrait mode (the height is
      * greater than the width).
      */
    @JSGlobal("sap.ui.Device.orientation.portrait")
    @js.native
    def portrait: Boolean = js.native
    @scala.inline
    def portrait_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portrait")(x.asInstanceOf[js.Any])
  }
  
  object os {
    
    @JSGlobal("sap.ui.Device.os")
    @js.native
    val ^ : js.Any = js.native
    
    object OS {
      
      @JSGlobal("sap.ui.Device.os.OS")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Android operating system name.
        */
      @JSGlobal("sap.ui.Device.os.OS.ANDROID")
      @js.native
      def ANDROID: js.Any = js.native
      @scala.inline
      def ANDROID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANDROID")(x.asInstanceOf[js.Any])
      
      /**
        * Blackberry operating system name.
        */
      @JSGlobal("sap.ui.Device.os.OS.BLACKBERRY")
      @js.native
      def BLACKBERRY: js.Any = js.native
      @scala.inline
      def BLACKBERRY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLACKBERRY")(x.asInstanceOf[js.Any])
      
      /**
        * iOS operating system name.
        */
      @JSGlobal("sap.ui.Device.os.OS.IOS")
      @js.native
      def IOS: js.Any = js.native
      @scala.inline
      def IOS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IOS")(x.asInstanceOf[js.Any])
      
      /**
        * Linux operating system name.
        */
      @JSGlobal("sap.ui.Device.os.OS.LINUX")
      @js.native
      def LINUX: js.Any = js.native
      @scala.inline
      def LINUX_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINUX")(x.asInstanceOf[js.Any])
      
      /**
        * MAC operating system name.
        */
      @JSGlobal("sap.ui.Device.os.OS.MACINTOSH")
      @js.native
      def MACINTOSH: js.Any = js.native
      @scala.inline
      def MACINTOSH_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MACINTOSH")(x.asInstanceOf[js.Any])
      
      /**
        * Windows operating system name.
        */
      @JSGlobal("sap.ui.Device.os.OS.WINDOWS")
      @js.native
      def WINDOWS: js.Any = js.native
      @scala.inline
      def WINDOWS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS")(x.asInstanceOf[js.Any])
      
      /**
        * Windows Phone operating system name.
        */
      @JSGlobal("sap.ui.Device.os.OS.WINDOWS_PHONE")
      @js.native
      def WINDOWS_PHONE: js.Any = js.native
      @scala.inline
      def WINDOWS_PHONE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS_PHONE")(x.asInstanceOf[js.Any])
    }
    
    /**
      * If this flag is set to <code>true</code>, an Android operating system is used.
      */
    @JSGlobal("sap.ui.Device.os.android")
    @js.native
    def android: Boolean = js.native
    @scala.inline
    def android_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("android")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, a Blackberry operating system is used.
      */
    @JSGlobal("sap.ui.Device.os.blackberry")
    @js.native
    def blackberry: Boolean = js.native
    @scala.inline
    def blackberry_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blackberry")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, an iOS operating system is used.
      */
    @JSGlobal("sap.ui.Device.os.ios")
    @js.native
    def ios: Boolean = js.native
    @scala.inline
    def ios_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ios")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, a Linux operating system is used.
      */
    @JSGlobal("sap.ui.Device.os.linux")
    @js.native
    def linux: Boolean = js.native
    @scala.inline
    def linux_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linux")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, a Mac operating system is used.
      */
    @JSGlobal("sap.ui.Device.os.macintosh")
    @js.native
    def macintosh: Boolean = js.native
    @scala.inline
    def macintosh_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("macintosh")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the operating system.
      */
    @JSGlobal("sap.ui.Device.os.name")
    @js.native
    def name: String = js.native
    @scala.inline
    def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    /**
      * The version of the operating system as <code>float</code>.Might be <code>-1</code> if no version can
      * be determined.
      */
    @JSGlobal("sap.ui.Device.os.version")
    @js.native
    def version: Double = js.native
    
    /**
      * The version of the operating system as <code>string</code>.Might be empty if no version can be
      * determined.
      */
    @JSGlobal("sap.ui.Device.os.versionStr")
    @js.native
    def versionStr: String = js.native
    @scala.inline
    def versionStr_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionStr")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def version_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, a Windows operating system is used.
      */
    @JSGlobal("sap.ui.Device.os.windows")
    @js.native
    def windows: Boolean = js.native
    
    /**
      * If this flag is set to <code>true</code>, a Windows Phone operating system is used.
      */
    @JSGlobal("sap.ui.Device.os.windows_phone")
    @js.native
    def windowsPhone: Boolean = js.native
    
    @scala.inline
    def windowsPhone_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windows_phone")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def windows_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windows")(x.asInstanceOf[js.Any])
  }
  
  object resize {
    
    @JSGlobal("sap.ui.Device.resize")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Registers the given event handler to resize change events of the document's window.The event is
      * fired whenever the document's window size changes.The event handler is called with a single
      * argument: a map <code>mParams</code> which provides the following
      * information:<ul><li><code>mParams.height</code>: The height of the document's window in
      * pixels.</li><li><code>mParams.width</code>: The width of the document's window in pixels.</li></ul>
      * @param fnFunction The handler function to call when the event occurs. This function will be called
      * in the context of the                      <code>oListener</code> instance (if present) or on the
      * <code>window</code> instance. A map with information                      about the size is provided
      * as a single argument to the handler (see details above).
      * @param oListener The object that wants to be notified when the event occurs (<code>this</code>
      * context within the                       handler function). If it is not specified, the handler
      * function is called in the context of the <code>window</code>.
      */
    @JSGlobal("sap.ui.Device.resize.attachHandler")
    @js.native
    def attachHandler(fnFunction: js.Any): Unit = js.native
    @JSGlobal("sap.ui.Device.resize.attachHandler")
    @js.native
    def attachHandler(fnFunction: js.Any, oListener: js.Any): Unit = js.native
    
    /**
      * Removes a previously attached event handler from the resize events.The passed parameters must match
      * those used for registration with {@link #attachHandler} beforehand.
      * @param fnFunction The handler function to detach from the event
      * @param oListener The object that wanted to be notified when the event occurred
      */
    @JSGlobal("sap.ui.Device.resize.detachHandler")
    @js.native
    def detachHandler(fnFunction: js.Any): Unit = js.native
    @JSGlobal("sap.ui.Device.resize.detachHandler")
    @js.native
    def detachHandler(fnFunction: js.Any, oListener: js.Any): Unit = js.native
    
    /**
      * The current height of the document's window in pixels.
      */
    @JSGlobal("sap.ui.Device.resize.height")
    @js.native
    def height: Double = js.native
    @scala.inline
    def height_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
    
    /**
      * The current width of the document's window in pixels.
      */
    @JSGlobal("sap.ui.Device.resize.width")
    @js.native
    def width: Double = js.native
    @scala.inline
    def width_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
  }
  
  object support {
    
    @JSGlobal("sap.ui.Device.support")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * If this flag is set to <code>true</code>, the used browser natively supports media queries via
      * JavaScript.<b>Note:</b> The {@link sap.ui.Device.media media queries API} of the device API can also
      * be used when there is no native support.
      */
    @JSGlobal("sap.ui.Device.support.matchmedia")
    @js.native
    def matchmedia: Boolean = js.native
    @scala.inline
    def matchmedia_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchmedia")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the used browser natively supports events of media queries
      * via JavaScript.<b>Note:</b> The {@link sap.ui.Device.media media queries API} of the device API can
      * also be used when there is no native support.
      */
    @JSGlobal("sap.ui.Device.support.matchmedialistener")
    @js.native
    def matchmedialistener: Boolean = js.native
    @scala.inline
    def matchmedialistener_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchmedialistener")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the used browser natively supports the
      * <code>orientationchange</code> event.<b>Note:</b> The {@link sap.ui.Device.orientation orientation
      * event} of the device API can also be used when there is no native support.
      */
    @JSGlobal("sap.ui.Device.support.orientation")
    @js.native
    def orientation: Boolean = js.native
    @scala.inline
    def orientation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orientation")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the used browser supports pointer events.
      */
    @JSGlobal("sap.ui.Device.support.pointer")
    @js.native
    def pointer: Boolean = js.native
    @scala.inline
    def pointer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointer")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the device has a display with a high resolution.
      */
    @JSGlobal("sap.ui.Device.support.retina")
    @js.native
    def retina: Boolean = js.native
    @scala.inline
    def retina_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("retina")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the used browser supports touch events.<b>Note:</b> This
      * flag indicates whether the used browser supports touch events or not.This does not necessarily mean
      * that the used device has a touchable screen.
      */
    @JSGlobal("sap.ui.Device.support.touch")
    @js.native
    def touch: Boolean = js.native
    @scala.inline
    def touch_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touch")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the used browser supports web sockets.
      */
    @JSGlobal("sap.ui.Device.support.websocket")
    @js.native
    def websocket: Boolean = js.native
    @scala.inline
    def websocket_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("websocket")(x.asInstanceOf[js.Any])
  }
  
  object system {
    
    @JSGlobal("sap.ui.Device.system")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * If this flag is set to <code>true</code>, the device is recognized as a combination of a desktop
      * system and tablet.Furthermore, a CSS class <code>sap-combi</code> is added to the document root
      * element.<b>Note:</b> This property is mainly for Microsoft Windows 8 (and following) devices where
      * the mouse and touch event may be supportednatively by the browser being used. This property is set
      * to <code>true</code> only when both mouse and touch event are natively supported.
      */
    @JSGlobal("sap.ui.Device.system.combi")
    @js.native
    def combi: Boolean = js.native
    @scala.inline
    def combi_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("combi")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the device is recognized as a desktop system.Furthermore,
      * a CSS class <code>sap-desktop</code> is added to the document root element.
      */
    @JSGlobal("sap.ui.Device.system.desktop")
    @js.native
    def desktop: Boolean = js.native
    @scala.inline
    def desktop_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktop")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the device is recognized as a phone.Furthermore, a CSS
      * class <code>sap-phone</code> is added to the document root element.
      */
    @JSGlobal("sap.ui.Device.system.phone")
    @js.native
    def phone: Boolean = js.native
    @scala.inline
    def phone_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phone")(x.asInstanceOf[js.Any])
    
    /**
      * If this flag is set to <code>true</code>, the device is recognized as a tablet.Furthermore, a CSS
      * class <code>sap-tablet</code> is added to the document root element.
      */
    @JSGlobal("sap.ui.Device.system.tablet")
    @js.native
    def tablet: Boolean = js.native
    @scala.inline
    def tablet_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tablet")(x.asInstanceOf[js.Any])
  }
}
