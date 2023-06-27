package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmedia extends StObject {
  
  val RANGESETS: TypeofRANGESETS = js.native
  
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
    *     the last interval (infinity)
    * 	 - `mParams.unit`: The unit used for the values above, e.g. `"px"`
    * 	 - `mParams.name`: The name of the entered interval, if available
    */
  def attachHandler(
    /**
    * The handler function to call when the event occurs. This function will be called in the context of the
    * `oListener` instance (if present) or on the `window` instance. A map with information about the entered
    * range set is provided as a single argument to the handler (see details above).
    */
  fnFunction: js.Function1[/* p1 */ From, Unit]
  ): Unit = js.native
  def attachHandler(
    /**
    * The handler function to call when the event occurs. This function will be called in the context of the
    * `oListener` instance (if present) or on the `window` instance. A map with information about the entered
    * range set is provided as a single argument to the handler (see details above).
    */
  fnFunction: js.Function1[/* p1 */ From, Unit],
    /**
    * The object that wants to be notified when the event occurs (`this` context within the handler function).
    * If it is not specified, the handler function is called in the context of the `window`.
    */
  oListener: js.Object
  ): Unit = js.native
  def attachHandler(
    /**
    * The handler function to call when the event occurs. This function will be called in the context of the
    * `oListener` instance (if present) or on the `window` instance. A map with information about the entered
    * range set is provided as a single argument to the handler (see details above).
    */
  fnFunction: js.Function1[/* p1 */ From, Unit],
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
  ): Unit = js.native
  def attachHandler(
    /**
    * The handler function to call when the event occurs. This function will be called in the context of the
    * `oListener` instance (if present) or on the `window` instance. A map with information about the entered
    * range set is provided as a single argument to the handler (see details above).
    */
  fnFunction: js.Function1[/* p1 */ From, Unit],
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
  ): Unit = js.native
  
  /**
    * Removes a previously attached event handler from the change events of the screen width.
    *
    * The passed parameters must match those used for registration with {@link #.attachHandler} beforehand.
    */
  def detachHandler(/**
    * The handler function to detach from the event
    */
  fnFunction: js.Function): Unit = js.native
  def detachHandler(
    /**
    * The handler function to detach from the event
    */
  fnFunction: js.Function,
    /**
    * The object that wanted to be notified when the event occurred
    */
  oListener: js.Object
  ): Unit = js.native
  def detachHandler(
    /**
    * The handler function to detach from the event
    */
  fnFunction: js.Function,
    /**
    * The object that wanted to be notified when the event occurred
    */
  oListener: js.Object,
    /**
    * The name of the range set to listen to. If no name is provided, the {@link sap.ui.Device.media.RANGESETS.SAP_STANDARD default range set }
    * is used.
    */
  sName: String
  ): Unit = js.native
  def detachHandler(
    /**
    * The handler function to detach from the event
    */
  fnFunction: js.Function,
    /**
    * The object that wanted to be notified when the event occurred
    */
  oListener: Unit,
    /**
    * The name of the range set to listen to. If no name is provided, the {@link sap.ui.Device.media.RANGESETS.SAP_STANDARD default range set }
    * is used.
    */
  sName: String
  ): Unit = js.native
  
  /**
    * Returns information about the current active range of the range set with the given name.
    *
    * If the optional parameter `iWidth` is given, the active range will be determined for that width, otherwise
    * it is determined for the current window size.
    *
    * @returns Information about the current active interval of the range set. The returned object has the
    * same structure as the argument of the event handlers ({@link sap.ui.Device.media.attachHandler})
    */
  def getCurrentRange(
    /**
    * The name of the range set. The range set must be initialized beforehand ({@link sap.ui.Device.media.initRangeSet})
    */
  sName: String
  ): From = js.native
  def getCurrentRange(
    /**
    * The name of the range set. The range set must be initialized beforehand ({@link sap.ui.Device.media.initRangeSet})
    */
  sName: String,
    /**
    * An optional width, based on which the range should be determined; If `iWidth` is not a number, the window
    * size will be used.
    */
  iWidth: int
  ): From = js.native
  
  /**
    * Returns `true` if a range set with the given name is already initialized.
    *
    * @returns Returns `true` if a range set with the given name is already initialized
    */
  def hasRangeSet(/**
    * The name of the range set.
    */
  sName: String): Boolean = js.native
  
  /**
    * Initializes a screen width media query range set.
    *
    * This initialization step makes the range set ready to be used for one of the other functions in namespace
    * `sap.ui.Device.media`. The most important {@link sap.ui.Device.media.RANGESETS predefined range sets }
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
    *     they are specified a CSS class (e.g. `sapUiMedia-MyRangeSet-Small`) is also added to the document root
    *     depending on the current active range. This can be suppressed via parameter `bSuppressClasses`.
    */
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
    * or custom one. The name must be a valid id and consist only of letters and numeric digits.
    */
  sName: String
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
    * or custom one. The name must be a valid id and consist only of letters and numeric digits.
    */
  sName: String,
    /**
    * The range borders
    */
  aRangeBorders: js.Array[int]
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
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
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
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
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
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
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
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
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
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
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
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
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
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
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
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
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
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
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
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
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
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
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
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
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
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
  ): Unit = js.native
  def initRangeSet(
    /**
    * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined }
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
  ): Unit = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Removes a previously initialized range set and detaches all registered handlers.
    *
    * Only custom range sets can be removed via this function. Initialized predefined range sets ({@link sap.ui.Device.media.RANGESETS})
    * cannot be removed.
    */
  def removeRangeSet(/**
    * The name of the range set which should be removed.
    */
  sName: String): Unit = js.native
}
