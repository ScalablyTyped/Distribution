package typings.openui5.global.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Specifies <code>IconTabBar</code> header mode.
  */
inline def IconTabHeaderMode(value: scala.Nothing): js.UndefOr[typings.openui5.sap.m.IconTabHeaderMode & scala.Nothing] = typings.openui5.global.sap.m.^.asInstanceOf[js.Dynamic].applyDynamic("IconTabHeaderMode")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.openui5.sap.m.IconTabHeaderMode & scala.Nothing]]

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
inline def Support: js.Any = typings.openui5.global.sap.m.^.asInstanceOf[js.Dynamic].selectDynamic("Support").asInstanceOf[js.Any]
inline def Support_=(x: js.Any): scala.Unit = typings.openui5.global.sap.m.^.asInstanceOf[js.Dynamic].updateDynamic("Support")(x.asInstanceOf[js.Any])

/**
  * Hide the soft keyboard.
  * @since 1.20
  */
inline def closeKeyboard: js.Any = typings.openui5.global.sap.m.^.asInstanceOf[js.Dynamic].selectDynamic("closeKeyboard").asInstanceOf[js.Any]
inline def closeKeyboard_=(x: js.Any): scala.Unit = typings.openui5.global.sap.m.^.asInstanceOf[js.Dynamic].updateDynamic("closeKeyboard")(x.asInstanceOf[js.Any])

/**
  * Search given control's parents and try to find iScroll.
  * @since 1.11
  */
inline def getIScroll: js.Any = typings.openui5.global.sap.m.^.asInstanceOf[js.Dynamic].selectDynamic("getIScroll").asInstanceOf[js.Any]
inline def getIScroll_=(x: js.Any): scala.Unit = typings.openui5.global.sap.m.^.asInstanceOf[js.Dynamic].updateDynamic("getIScroll")(x.asInstanceOf[js.Any])

/**
  * Returns invalid date value of UI5.
  * @since 1.10
  */
inline def getInvalidDate(): scala.Unit = typings.openui5.global.sap.m.^.asInstanceOf[js.Dynamic].applyDynamic("getInvalidDate")().asInstanceOf[scala.Unit]

/**
  * Finds default locale settings once and returns always the same.We should not need to create new
  * instance to get same locale settingsThis method keep the locale instance in the scope and returns
  * the same after first run
  * @since 1.10
  * @returns sap.ui.core.Locale instane
  */
inline def getLocale(): js.Any = typings.openui5.global.sap.m.^.asInstanceOf[js.Dynamic].applyDynamic("getLocale")().asInstanceOf[js.Any]

/**
  * Finds default locale data once and returns always the same.
  * @since 1.10
  * @returns sap.ui.core.LocaleData instance
  */
inline def getLocaleData(): js.Any = typings.openui5.global.sap.m.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleData")().asInstanceOf[js.Any]

/**
  * Search given control's parents and try to find ScrollDelegate.
  * @since 1.11
  */
inline def getScrollDelegate: js.Any = typings.openui5.global.sap.m.^.asInstanceOf[js.Dynamic].selectDynamic("getScrollDelegate").asInstanceOf[js.Any]
inline def getScrollDelegate_=(x: js.Any): scala.Unit = typings.openui5.global.sap.m.^.asInstanceOf[js.Dynamic].updateDynamic("getScrollDelegate")(x.asInstanceOf[js.Any])

/**
  * Checks if the given parameter is a valid JsDate Object.
  * @since 1.10
  * @param value Any variable to test.
  */
inline def isDate(value: js.Any): scala.Boolean = typings.openui5.global.sap.m.^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
