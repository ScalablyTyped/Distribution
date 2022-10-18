package typings.openui5.sapMLibraryMod

import typings.openui5.sapMLibraryMod.^
import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def closeKeyboard(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeKeyboard")().asInstanceOf[Unit]

inline def getIScroll(/**
  * Control to start the search at
  */
oControl: default): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIScroll")(oControl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Object]]

inline def getInvalidDate(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getInvalidDate")().asInstanceOf[Null]

inline def getLocale(): typings.openui5.sapUiCoreLocaleMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocale")().asInstanceOf[typings.openui5.sapUiCoreLocaleMod.default]

inline def getLocaleData(): typings.openui5.sapUiCoreLocaleDataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleData")().asInstanceOf[typings.openui5.sapUiCoreLocaleDataMod.default]

inline def getScrollDelegate(
  /**
  * Starting point for the search
  */
oControl: default,
  /**
  * Whether the search should stop on component level (`false`) or not
  */
bGlobal: Boolean
): js.UndefOr[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollDelegate")(oControl.asInstanceOf[js.Any], bGlobal.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Object]]

inline def isDate(/**
  * Any variable to test.
  */
value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

type SelectColumnRatio = String

type ValueCSSColor = String
