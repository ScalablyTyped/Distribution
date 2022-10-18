package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiDeviceMod extends Shortcut {
  
  @JSImport("sap/ui/Device", JSImport.Default)
  @js.native
  val default: Device = js.native
  
  object browser {
    
    object BROWSER {
      
      @JSImport("sap/ui/Device", "browser.BROWSER.ANDROID")
      @js.native
      val ANDROID: /* undefined */ Any = js.native
      
      @JSImport("sap/ui/Device", "browser.BROWSER.CHROME")
      @js.native
      val CHROME: /* undefined */ Any = js.native
      
      @JSImport("sap/ui/Device", "browser.BROWSER.FIREFOX")
      @js.native
      val FIREFOX: /* undefined */ Any = js.native
      
      @JSImport("sap/ui/Device", "browser.BROWSER.SAFARI")
      @js.native
      val SAFARI: /* undefined */ Any = js.native
    }
    
    @JSImport("sap/ui/Device", "browser.blink")
    @js.native
    val blink: Boolean = js.native
    
    @JSImport("sap/ui/Device", "browser.chrome")
    @js.native
    val chrome: Boolean = js.native
    
    @JSImport("sap/ui/Device", "browser.firefox")
    @js.native
    val firefox: Boolean = js.native
    
    @JSImport("sap/ui/Device", "browser.fullscreen")
    @js.native
    val fullscreen: Boolean = js.native
    
    @JSImport("sap/ui/Device", "browser.mobile")
    @js.native
    val mobile: Boolean = js.native
    
    @JSImport("sap/ui/Device", "browser.mozilla")
    @js.native
    val mozilla: Boolean = js.native
    
    @JSImport("sap/ui/Device", "browser.name")
    @js.native
    val name: String = js.native
    
    @JSImport("sap/ui/Device", "browser.safari")
    @js.native
    val safari: Boolean = js.native
    
    @JSImport("sap/ui/Device", "browser.version")
    @js.native
    val version: float = js.native
    
    @JSImport("sap/ui/Device", "browser.versionStr")
    @js.native
    val versionStr: String = js.native
    
    @JSImport("sap/ui/Device", "browser.webkit")
    @js.native
    val webkit: Boolean = js.native
    
    @JSImport("sap/ui/Device", "browser.webview")
    @js.native
    val webview: Boolean = js.native
  }
  
  object media {
    
    @JSImport("sap/ui/Device", "media")
    @js.native
    val ^ : js.Any = js.native
    
    object RANGESETS {
      
      @JSImport("sap/ui/Device", "media.RANGESETS.SAP_3STEPS")
      @js.native
      val SAP_3STEPS: /* undefined */ Any = js.native
      
      @JSImport("sap/ui/Device", "media.RANGESETS.SAP_4STEPS")
      @js.native
      val SAP_4STEPS: /* undefined */ Any = js.native
      
      @JSImport("sap/ui/Device", "media.RANGESETS.SAP_6STEPS")
      @js.native
      val SAP_6STEPS: /* undefined */ Any = js.native
      
      @JSImport("sap/ui/Device", "media.RANGESETS.SAP_STANDARD")
      @js.native
      val SAP_STANDARD: /* undefined */ Any = js.native
      
      @JSImport("sap/ui/Device", "media.RANGESETS.SAP_STANDARD_EXTENDED")
      @js.native
      val SAP_STANDARD_EXTENDED: /* undefined */ Any = js.native
    }
    
    /**
      * Registers the given event handler to change events of the screen width based on the range set with the
      * specified name.
      *
      * The event is fired whenever the screen width changes and the current screen width is in a different interval
      * of the given range set than before the width change.
      *
      * The event handler is called with a single argument: a map `mParams` which provides the following information
      * about the entered interval:
      * 	 - `mParams.from`: The start value (inclusive) of the entered interval as a number
      * 	 - `mParams.to`: The end value (exclusive) range of the entered interval as a number or undefined for
      * 			the last interval (infinity)
      * 	 - `mParams.unit`: The unit used for the values above, e.g. `"px"`
      * 	 - `mParams.name`: The name of the entered interval, if available
      */
    inline def attachHandler(
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the `window` instance. A map with information about the entered
      * range set is provided as a single argument to the handler (see details above).
      */
    fnFunction: js.Function1[/* p1 */ To, Unit]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def attachHandler(
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the `window` instance. A map with information about the entered
      * range set is provided as a single argument to the handler (see details above).
      */
    fnFunction: js.Function1[/* p1 */ To, Unit],
      /**
      * The object that wants to be notified when the event occurs (`this` context within the handler function).
      * If it is not specified, the handler function is called in the context of the `window`.
      */
    oListener: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def attachHandler(
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the `window` instance. A map with information about the entered
      * range set is provided as a single argument to the handler (see details above).
      */
    fnFunction: js.Function1[/* p1 */ To, Unit],
      /**
      * The object that wants to be notified when the event occurs (`this` context within the handler function).
      * If it is not specified, the handler function is called in the context of the `window`.
      */
    oListener: js.Object,
      /**
      * The name of the range set to listen to. The range set must be initialized beforehand ({@link sap.ui.Device.media.initRangeSet}).
      * If no name is provided, the {@link sap.ui.Device.media.RANGESETS.SAP_STANDARD default range set} is used.
      */
    sName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any], sName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def attachHandler(
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the `window` instance. A map with information about the entered
      * range set is provided as a single argument to the handler (see details above).
      */
    fnFunction: js.Function1[/* p1 */ To, Unit],
      /**
      * The object that wants to be notified when the event occurs (`this` context within the handler function).
      * If it is not specified, the handler function is called in the context of the `window`.
      */
    oListener: Unit,
      /**
      * The name of the range set to listen to. The range set must be initialized beforehand ({@link sap.ui.Device.media.initRangeSet}).
      * If no name is provided, the {@link sap.ui.Device.media.RANGESETS.SAP_STANDARD default range set} is used.
      */
    sName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any], sName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Removes a previously attached event handler from the change events of the screen width.
      *
      * The passed parameters must match those used for registration with {@link #.attachHandler} beforehand.
      */
    inline def detachHandler(/**
      * The handler function to detach from the event
      */
    fnFunction: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def detachHandler(
      /**
      * The handler function to detach from the event
      */
    fnFunction: js.Function,
      /**
      * The object that wanted to be notified when the event occurred
      */
    oListener: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def detachHandler(
      /**
      * The handler function to detach from the event
      */
    fnFunction: js.Function,
      /**
      * The object that wanted to be notified when the event occurred
      */
    oListener: js.Object,
      /**
      * The name of the range set to listen to. If no name is provided, the {@link sap.ui.Device.media.RANGESETS.SAP_STANDARD
      * default range set} is used.
      */
    sName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any], sName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def detachHandler(
      /**
      * The handler function to detach from the event
      */
    fnFunction: js.Function,
      /**
      * The object that wanted to be notified when the event occurred
      */
    oListener: Unit,
      /**
      * The name of the range set to listen to. If no name is provided, the {@link sap.ui.Device.media.RANGESETS.SAP_STANDARD
      * default range set} is used.
      */
    sName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any], sName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Returns information about the current active range of the range set with the given name.
      *
      * If the optional parameter `iWidth` is given, the active range will be determined for that width, otherwise
      * it is determined for the current window size.
      *
      * @returns Information about the current active interval of the range set. The returned object has the
      * same structure as the argument of the event handlers ({@link sap.ui.Device.media.attachHandler})
      */
    inline def getCurrentRange(
      /**
      * The name of the range set. The range set must be initialized beforehand ({@link sap.ui.Device.media.initRangeSet})
      */
    sName: String
    ): To = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentRange")(sName.asInstanceOf[js.Any]).asInstanceOf[To]
    inline def getCurrentRange(
      /**
      * The name of the range set. The range set must be initialized beforehand ({@link sap.ui.Device.media.initRangeSet})
      */
    sName: String,
      /**
      * An optional width, based on which the range should be determined; If `iWidth` is not a number, the window
      * size will be used.
      */
    iWidth: int
    ): To = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentRange")(sName.asInstanceOf[js.Any], iWidth.asInstanceOf[js.Any])).asInstanceOf[To]
    
    /**
      * Returns `true` if a range set with the given name is already initialized.
      *
      * @returns Returns `true` if a range set with the given name is already initialized
      */
    inline def hasRangeSet(/**
      * The name of the range set.
      */
    sName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasRangeSet")(sName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Initializes a screen width media query range set.
      *
      * This initialization step makes the range set ready to be used for one of the other functions in namespace
      * `sap.ui.Device.media`. The most important {@link sap.ui.Device.media.RANGESETS predefined range sets}
      * are initialized automatically.
      *
      * To make a not yet initialized {@link sap.ui.Device.media.RANGESETS predefined range set} ready to be
      * used, call this function with the name of the range set to be initialized:
      * ```javascript
      *
      * sap.ui.Device.media.initRangeSet(sap.ui.Device.media.RANGESETS.SAP_3STEPS);
      * ```
      *
      *
      * Alternatively it is possible to define custom range sets as shown in the following example:
      * ```javascript
      *
      * sap.ui.Device.media.initRangeSet("MyRangeSet", [200, 400], "px", ["Small", "Medium", "Large"]);
      * ```
      *  This example defines the following named ranges:
      * 	 - `"Small"`: For screens smaller than 200 pixels.
      * 	 - `"Medium"`: For screens greater than or equal to 200 pixels and smaller than 400 pixels.
      * 	 - `"Large"`: For screens greater than or equal to 400 pixels.  The range names are optional. If
      * 			they are specified a CSS class (e.g. `sapUiMedia-MyRangeSet-Small`) is also added to the document root
      * 			depending on the current active range. This can be suppressed via parameter `bSuppressClasses`.
      */
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: js.Array[int]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: js.Array[int],
      /**
      * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
      * (default), `"em"` or `"rem"`
      */
    sUnit: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: js.Array[int],
      /**
      * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
      * (default), `"em"` or `"rem"`
      */
    sUnit: String,
      /**
      * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
      * are specified, CSS classes are also added to the document root as described above. This behavior can
      * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
      * `n+1` ranges. Therefore `n+1` names must be provided.
      */
    aRangeNames: js.Array[String]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: js.Array[int],
      /**
      * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
      * (default), `"em"` or `"rem"`
      */
    sUnit: String,
      /**
      * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
      * are specified, CSS classes are also added to the document root as described above. This behavior can
      * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
      * `n+1` ranges. Therefore `n+1` names must be provided.
      */
    aRangeNames: js.Array[String],
      /**
      * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
      * provided
      */
    bSuppressClasses: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: js.Array[int],
      /**
      * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
      * (default), `"em"` or `"rem"`
      */
    sUnit: String,
      /**
      * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
      * are specified, CSS classes are also added to the document root as described above. This behavior can
      * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
      * `n+1` ranges. Therefore `n+1` names must be provided.
      */
    aRangeNames: Unit,
      /**
      * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
      * provided
      */
    bSuppressClasses: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: js.Array[int],
      /**
      * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
      * (default), `"em"` or `"rem"`
      */
    sUnit: Unit,
      /**
      * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
      * are specified, CSS classes are also added to the document root as described above. This behavior can
      * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
      * `n+1` ranges. Therefore `n+1` names must be provided.
      */
    aRangeNames: js.Array[String]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: js.Array[int],
      /**
      * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
      * (default), `"em"` or `"rem"`
      */
    sUnit: Unit,
      /**
      * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
      * are specified, CSS classes are also added to the document root as described above. This behavior can
      * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
      * `n+1` ranges. Therefore `n+1` names must be provided.
      */
    aRangeNames: js.Array[String],
      /**
      * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
      * provided
      */
    bSuppressClasses: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: js.Array[int],
      /**
      * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
      * (default), `"em"` or `"rem"`
      */
    sUnit: Unit,
      /**
      * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
      * are specified, CSS classes are also added to the document root as described above. This behavior can
      * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
      * `n+1` ranges. Therefore `n+1` names must be provided.
      */
    aRangeNames: Unit,
      /**
      * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
      * provided
      */
    bSuppressClasses: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: Unit,
      /**
      * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
      * (default), `"em"` or `"rem"`
      */
    sUnit: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: Unit,
      /**
      * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
      * (default), `"em"` or `"rem"`
      */
    sUnit: String,
      /**
      * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
      * are specified, CSS classes are also added to the document root as described above. This behavior can
      * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
      * `n+1` ranges. Therefore `n+1` names must be provided.
      */
    aRangeNames: js.Array[String]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: Unit,
      /**
      * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
      * (default), `"em"` or `"rem"`
      */
    sUnit: String,
      /**
      * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
      * are specified, CSS classes are also added to the document root as described above. This behavior can
      * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
      * `n+1` ranges. Therefore `n+1` names must be provided.
      */
    aRangeNames: js.Array[String],
      /**
      * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
      * provided
      */
    bSuppressClasses: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: Unit,
      /**
      * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
      * (default), `"em"` or `"rem"`
      */
    sUnit: String,
      /**
      * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
      * are specified, CSS classes are also added to the document root as described above. This behavior can
      * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
      * `n+1` ranges. Therefore `n+1` names must be provided.
      */
    aRangeNames: Unit,
      /**
      * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
      * provided
      */
    bSuppressClasses: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: Unit,
      /**
      * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
      * (default), `"em"` or `"rem"`
      */
    sUnit: Unit,
      /**
      * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
      * are specified, CSS classes are also added to the document root as described above. This behavior can
      * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
      * `n+1` ranges. Therefore `n+1` names must be provided.
      */
    aRangeNames: js.Array[String]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: Unit,
      /**
      * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
      * (default), `"em"` or `"rem"`
      */
    sUnit: Unit,
      /**
      * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
      * are specified, CSS classes are also added to the document root as described above. This behavior can
      * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
      * `n+1` ranges. Therefore `n+1` names must be provided.
      */
    aRangeNames: js.Array[String],
      /**
      * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
      * provided
      */
    bSuppressClasses: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initRangeSet(
      /**
      * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
      * or custom one. The name must be a valid id and consist only of letters and numeric digits.
      */
    sName: String,
      /**
      * The range borders
      */
    aRangeBorders: Unit,
      /**
      * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
      * (default), `"em"` or `"rem"`
      */
    sUnit: Unit,
      /**
      * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
      * are specified, CSS classes are also added to the document root as described above. This behavior can
      * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
      * `n+1` ranges. Therefore `n+1` names must be provided.
      */
    aRangeNames: Unit,
      /**
      * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
      * provided
      */
    bSuppressClasses: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Removes a previously initialized range set and detaches all registered handlers.
      *
      * Only custom range sets can be removed via this function. Initialized predefined range sets ({@link sap.ui.Device.media.RANGESETS})
      * cannot be removed.
      */
    inline def removeRangeSet(/**
      * The name of the range set which should be removed.
      */
    sName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeRangeSet")(sName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object orientation {
    
    @JSImport("sap/ui/Device", "orientation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Registers the given event handler to orientation change events of the document's window.
      *
      * The event is fired whenever the screen orientation changes and the width of the document's window becomes
      * greater than its height or the other way round.
      *
      * The event handler is called with a single argument: a map `mParams` which provides the following information:
      *
      * 	 - `mParams.landscape`: If this flag is set to `true`, the screen is currently in landscape mode, otherwise
      * 			in portrait mode.
      */
    inline def attachHandler(
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the `window` instance. A map with information about the orientation
      * is provided as a single argument to the handler (see details above).
      */
    fnFunction: js.Function
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def attachHandler(
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the `window` instance. A map with information about the orientation
      * is provided as a single argument to the handler (see details above).
      */
    fnFunction: js.Function,
      /**
      * The object that wants to be notified when the event occurs (`this` context within the handler function).
      * If it is not specified, the handler function is called in the context of the `window`.
      */
    oListener: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Removes a previously attached event handler from the orientation change events.
      *
      * The passed parameters must match those used for registration with {@link #.attachHandler} beforehand.
      */
    inline def detachHandler(/**
      * The handler function to detach from the event
      */
    fnFunction: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def detachHandler(
      /**
      * The handler function to detach from the event
      */
    fnFunction: js.Function,
      /**
      * The object that wanted to be notified when the event occurred
      */
    oListener: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("sap/ui/Device", "orientation.landscape")
    @js.native
    val landscape: Boolean = js.native
    
    @JSImport("sap/ui/Device", "orientation.portrait")
    @js.native
    val portrait: Boolean = js.native
  }
  
  object os {
    
    object OS {
      
      @JSImport("sap/ui/Device", "os.OS.ANDROID")
      @js.native
      val ANDROID: /* undefined */ Any = js.native
      
      @JSImport("sap/ui/Device", "os.OS.IOS")
      @js.native
      val IOS: /* undefined */ Any = js.native
      
      @JSImport("sap/ui/Device", "os.OS.LINUX")
      @js.native
      val LINUX: /* undefined */ Any = js.native
      
      @JSImport("sap/ui/Device", "os.OS.MACINTOSH")
      @js.native
      val MACINTOSH: /* undefined */ Any = js.native
      
      @JSImport("sap/ui/Device", "os.OS.WINDOWS")
      @js.native
      val WINDOWS: /* undefined */ Any = js.native
    }
    
    @JSImport("sap/ui/Device", "os.android")
    @js.native
    val android: Boolean = js.native
    
    @JSImport("sap/ui/Device", "os.ios")
    @js.native
    val ios: Boolean = js.native
    
    @JSImport("sap/ui/Device", "os.linux")
    @js.native
    val linux: Boolean = js.native
    
    @JSImport("sap/ui/Device", "os.macintosh")
    @js.native
    val macintosh: Boolean = js.native
    
    @JSImport("sap/ui/Device", "os.name")
    @js.native
    val name: String = js.native
    
    @JSImport("sap/ui/Device", "os.version")
    @js.native
    val version: float = js.native
    
    @JSImport("sap/ui/Device", "os.versionStr")
    @js.native
    val versionStr: String = js.native
    
    @JSImport("sap/ui/Device", "os.windows")
    @js.native
    val windows: Boolean = js.native
  }
  
  object resize {
    
    @JSImport("sap/ui/Device", "resize")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Registers the given event handler to resize change events of the document's window.
      *
      * The event is fired whenever the document's window size changes.
      *
      * The event handler is called with a single argument: a map `mParams` which provides the following information:
      *
      * 	 - `mParams.height`: The height of the document's window in pixels.
      * 	 - `mParams.width`: The width of the document's window in pixels.
      */
    inline def attachHandler(
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the `window` instance. A map with information about the size
      * is provided as a single argument to the handler (see details above).
      */
    fnFunction: js.Function
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def attachHandler(
      /**
      * The handler function to call when the event occurs. This function will be called in the context of the
      * `oListener` instance (if present) or on the `window` instance. A map with information about the size
      * is provided as a single argument to the handler (see details above).
      */
    fnFunction: js.Function,
      /**
      * The object that wants to be notified when the event occurs (`this` context within the handler function).
      * If it is not specified, the handler function is called in the context of the `window`.
      */
    oListener: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Removes a previously attached event handler from the resize events.
      *
      * The passed parameters must match those used for registration with {@link #.attachHandler} beforehand.
      */
    inline def detachHandler(/**
      * The handler function to detach from the event
      */
    fnFunction: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def detachHandler(
      /**
      * The handler function to detach from the event
      */
    fnFunction: js.Function,
      /**
      * The object that wanted to be notified when the event occurred
      */
    oListener: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("sap/ui/Device", "resize.height")
    @js.native
    val height: int = js.native
    
    @JSImport("sap/ui/Device", "resize.width")
    @js.native
    val width: int = js.native
  }
  
  object support {
    
    @JSImport("sap/ui/Device", "support.matchmedia")
    @js.native
    val matchmedia: Boolean = js.native
    
    @JSImport("sap/ui/Device", "support.matchmedialistener")
    @js.native
    val matchmedialistener: Boolean = js.native
    
    @JSImport("sap/ui/Device", "support.orientation")
    @js.native
    val orientation: Boolean = js.native
    
    @JSImport("sap/ui/Device", "support.pointer")
    @js.native
    val pointer: Boolean = js.native
    
    @JSImport("sap/ui/Device", "support.retina")
    @js.native
    val retina: Boolean = js.native
    
    @JSImport("sap/ui/Device", "support.touch")
    @js.native
    val touch: Boolean = js.native
    
    @JSImport("sap/ui/Device", "support.websocket")
    @js.native
    val websocket: Boolean = js.native
  }
  
  object system {
    
    @JSImport("sap/ui/Device", "system.combi")
    @js.native
    val combi: Boolean = js.native
    
    @JSImport("sap/ui/Device", "system.desktop")
    @js.native
    val desktop: Boolean = js.native
    
    @JSImport("sap/ui/Device", "system.phone")
    @js.native
    val phone: Boolean = js.native
    
    @JSImport("sap/ui/Device", "system.tablet")
    @js.native
    val tablet: Boolean = js.native
  }
  
  /**
    * Device and Feature Detection API: Provides information about the used browser / device and cross platform
    * support for certain events like media queries, orientation change or resizing.
    *
    * This API is independent from any other part of the UI5 framework. This allows it to be loaded beforehand,
    * if it is needed, to create the UI5 bootstrap dynamically depending on the capabilities of the browser
    * or device.
    */
  trait Device extends StObject
  
  type _To = Device
  
  /* This means you don't have to write `default`, but can instead just say `sapUiDeviceMod.foo` */
  override def _to: Device = default
}
