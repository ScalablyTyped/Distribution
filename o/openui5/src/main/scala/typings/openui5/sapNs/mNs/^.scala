package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m")
@js.native
object ^ extends js.Object {
  /**
    * <pre><code>sap.m.Support</code> shows the technical information for SAPUI5 Mobile Applications.This
    * technical information includes   * SAPUI5 Version   * User Agent   * Configurations (Bootstrap and
    * Computed)   * URI parameters   * All loaded module namesIn order to show the device information, the
    * user must follow the following gestures.   1 - Hold two finger for 3 seconds minimum.   2 - Tab with
    * a third finger while holding the first two fingers.NOTE: This class is internal and all its
    * functions must not be used by an applicationAs <code>sap.m.Support</code> is a static class, a
    * <code>jQuery.sap.require("sap.m.Support");</code>statement must be implicitly executed before the
    * class is used.Enable Support:--------------------------------------------------//import
    * libraryjQuery.sap.require("sap.m.Support");//By default after require, support is enabled but
    * implicitly we can callsap.m.Support.on();Disable
    * Support:--------------------------------------------------sap.m.Support.off();</pre>
    * @since 1.11.0
    */
  var Support: js.Any = js.native
  /**
    * Hide the soft keyboard.
    * @since 1.20
    */
  var closeKeyboard: js.Any = js.native
  /**
    * Search given control's parents and try to find iScroll.
    * @since 1.11
    */
  var getIScroll: js.Any = js.native
  /**
    * Search given control's parents and try to find ScrollDelegate.
    * @since 1.11
    */
  var getScrollDelegate: js.Any = js.native
  /**
    * Returns invalid date value of UI5.
    * @since 1.10
    */
  def getInvalidDate(): Unit = js.native
  /**
    * Finds default locale settings once and returns always the same.We should not need to create new
    * instance to get same locale settingsThis method keep the locale instance in the scope and returns
    * the same after first run
    * @since 1.10
    * @returns sap.ui.core.Locale instane
    */
  def getLocale(): js.Any = js.native
  /**
    * Finds default locale data once and returns always the same.
    * @since 1.10
    * @returns sap.ui.core.LocaleData instance
    */
  def getLocaleData(): js.Any = js.native
  /**
    * Checks if the given parameter is a valid JsDate Object.
    * @since 1.10
    * @param value Any variable to test.
    */
  def isDate(value: js.Any): Boolean = js.native
}

