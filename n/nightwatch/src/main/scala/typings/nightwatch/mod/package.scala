package typings.nightwatch.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nightwatch.anon.Name
import typings.nightwatch.mod.^
import typings.nightwatch.nightwatchStrings.`then`
import typings.seleniumWebdriver.mod.By
import typings.seleniumWebdriver.mod.RelativeBy
import typings.seleniumWebdriver.mod.WebElement
import typings.std.Omit
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ELEMENT_KEY: /* "element-6066-11e4-a52e-4f735466cecf" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ELEMENT_KEY").asInstanceOf[/* "element-6066-11e4-a52e-4f735466cecf" */ String]

inline def globalElement(locator: Definition): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("globalElement")(locator.asInstanceOf[js.Any]).asInstanceOf[Element]
inline def globalElement(locator: Definition, options: Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("globalElement")(locator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element]
inline def globalElement(locator: By): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("globalElement")(locator.asInstanceOf[js.Any]).asInstanceOf[Element]
inline def globalElement(locator: By, options: Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("globalElement")(locator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element]
inline def globalElement(locator: WebElement): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("globalElement")(locator.asInstanceOf[js.Any]).asInstanceOf[Element]
inline def globalElement(locator: WebElement, options: Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("globalElement")(locator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element]

type AsyncFunc = js.ThisFunction1[/* this */ DescribeInstance, /* browser */ NightwatchBrowser, PromiseLike[Any]]

type Awaitable[T, V] = (Omit[T, `then`]) & PromiseLike[V]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.nightwatch.mod.ElementProperties
  - typings.nightwatch.mod.Element
  - typings.seleniumWebdriver.mod.RelativeBy
*/
type Definition = _Definition | String | RelativeBy

type EnhancedPageObject[Commands, Elements, Sections /* <: EnhancedPageObjectSections */] = Nightwatch & SharedCommands & NightwatchCustomCommands & Commands & (Name[Commands, Elements, Sections])

type EnhancedPageObjectSections = StringDictionary[EnhancedSectionInstance[Any, Any, Any]]

type EnhancedSectionInstance[Commands, Elements, Sections /* <: EnhancedPageObjectSections */] = EnhancedPageObject[Commands, Elements, Sections]

type ExclusiveSuiteFunction = js.Function2[
/* title */ String, 
/* fn */ js.UndefOr[js.ThisFunction0[/* this */ DescribeInstance, Unit]], 
this.type]

type ExtendDescribeThis[T] = DescribeInstance & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? T[P]} */ js.Any)

type GlobalNightwatchTestHook = js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[Any], Unit], Unit]

type GlobalNightwatchTestHookEach = js.Function2[
/* browser */ NightwatchBrowser, 
/* done */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
Unit]

type NightwatchAssert = js.Function6[
/* passed */ Boolean, 
/* receivedValue */ js.UndefOr[Any], 
/* expectedValue */ js.UndefOr[Any], 
/* message */ js.UndefOr[String], 
/* abortOnFailure */ js.UndefOr[Boolean], 
/* originalStackTrace */ js.UndefOr[String], 
Unit]

type NightwatchBddTestHook = js.Function1[/* callback */ NightwatchBddTestHookCallback, Unit]

type NightwatchBddTestHookCallback = js.ThisFunction2[
/* this */ DescribeInstance, 
/* browser */ NightwatchBrowser, 
/* done */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
Unit]

type NightwatchElement = WebElement

type NightwatchPosition = WindowPosition

type NightwatchSize = WindowSize

type NightwatchSizeAndPosition = WindowSizeAndPosition

type NightwatchTest = js.Function1[/* browser */ js.UndefOr[NightwatchBrowser], Unit]

type NightwatchTestHook = GlobalNightwatchTestHookEach | GlobalNightwatchTestHook

type NightwatchTestSettings = StringDictionary[NightwatchTestSettingScreenshots]

type NormalFunc = js.ThisFunction1[/* this */ DescribeInstance, /* browser */ NightwatchBrowser, Unit]

type PageElements = StringDictionary[Definition]

type PendingSuiteFunction = js.Function2[
/* title */ String, 
/* fn */ js.UndefOr[js.ThisFunction0[/* this */ DescribeInstance, Unit]], 
this.type | Unit]
