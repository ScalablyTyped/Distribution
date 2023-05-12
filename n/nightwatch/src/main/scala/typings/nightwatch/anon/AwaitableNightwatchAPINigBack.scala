package typings.nightwatch.anon

import org.scalablytyped.runtime.StringDictionary
import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.ExceptionThrownEvent
import typings.nightwatch.expectMod.Expect
import typings.nightwatch.mod.AppiumCommands
import typings.nightwatch.mod.Assert
import typings.nightwatch.mod.Awaitable
import typings.nightwatch.mod.Cookie
import typings.nightwatch.mod.Definition
import typings.nightwatch.mod.Element
import typings.nightwatch.mod.ElementResult
import typings.nightwatch.mod.Ensure
import typings.nightwatch.mod.ExecuteAsyncScriptFunction
import typings.nightwatch.mod.ExecuteScriptFunction
import typings.nightwatch.mod.JSON_WEB_OBJECT
import typings.nightwatch.mod.LocateStrategy
import typings.nightwatch.mod.NightwatchAPI
import typings.nightwatch.mod.NightwatchCallbackResult
import typings.nightwatch.mod.NightwatchCustomPageObjects
import typings.nightwatch.mod.NightwatchElement
import typings.nightwatch.mod.NightwatchGlobals
import typings.nightwatch.mod.NightwatchKeys
import typings.nightwatch.mod.NightwatchLogEntry
import typings.nightwatch.mod.NightwatchLogTypes
import typings.nightwatch.mod.NightwatchNodeAssertionsResult
import typings.nightwatch.mod.NightwatchPage
import typings.nightwatch.mod.NightwatchPosition
import typings.nightwatch.mod.NightwatchServerStatusResult
import typings.nightwatch.mod.NightwatchSizeAndPosition
import typings.nightwatch.mod.NightwatchTestOptions
import typings.nightwatch.mod.NightwatchTestSuite
import typings.nightwatch.mod.VoidToNull
import typings.nightwatch.mod.WindowPosition
import typings.nightwatch.mod.WindowSizeAndPosition
import typings.nightwatch.mod.WindowType
import typings.nightwatch.nightwatchInts.`0`
import typings.nightwatch.nightwatchInts.`1`
import typings.nightwatch.nightwatchInts.`2`
import typings.nightwatch.nightwatchStrings.DELETE
import typings.nightwatch.nightwatchStrings.GET
import typings.nightwatch.nightwatchStrings.LANDSCAPE
import typings.nightwatch.nightwatchStrings.PORTRAIT
import typings.nightwatch.nightwatchStrings.POST
import typings.nightwatch.nightwatchStrings.`implicit`
import typings.nightwatch.nightwatchStrings.delete_
import typings.nightwatch.nightwatchStrings.left
import typings.nightwatch.nightwatchStrings.middle
import typings.nightwatch.nightwatchStrings.pageLoad
import typings.nightwatch.nightwatchStrings.post_
import typings.nightwatch.nightwatchStrings.right
import typings.nightwatch.nightwatchStrings.script
import typings.seleniumWebdriver.mod.Actions
import typings.seleniumWebdriver.mod.By
import typings.seleniumWebdriver.mod.WebElement
import typings.std.HTMLScriptElement
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined nightwatch.nightwatch.Awaitable<nightwatch.nightwatch.NightwatchAPI, nightwatch.nightwatch.NightwatchNodeAssertionsResult | std.Error> */
@js.native
trait AwaitableNightwatchAPINigBack extends StObject {
  
  var Keys: NightwatchKeys = js.native
  
  var WEBDRIVER_ELEMENT_ID: String = js.native
  
  def __isBrowserName(browser: String, alternateName: String): Boolean = js.native
  @JSName("__isBrowserName")
  var __isBrowserName_Original: js.Function2[/* browser */ String, /* alternateName */ String, Boolean] = js.native
  
  def __isPlatformName(platform: String): Boolean = js.native
  @JSName("__isPlatformName")
  var __isPlatformName_Original: js.Function1[/* platform */ String, Boolean] = js.native
  
  def acceptAlert(): Awaitable[this.type, Null] = js.native
  def acceptAlert(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("acceptAlert")
  var acceptAlert_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def actions(): Actions = js.native
  def actions(options: Async): Actions = js.native
  @JSName("actions")
  var actions_Original: js.Function1[/* options */ js.UndefOr[Async], Actions] = js.native
  
  var appium: AppiumCommands = js.native
  
  var assert: Assert = js.native
  
  def axeInject(): Awaitable[this.type, Null] = js.native
  @JSName("axeInject")
  var axeInject_Original: js.Function0[Awaitable[this.type, Null]] = js.native
  
  def axeRun(): Awaitable[this.type, Null] = js.native
  def axeRun(selector: String): Awaitable[this.type, Null] = js.native
  def axeRun(selector: String, options: StringDictionary[Any]): Awaitable[this.type, Null] = js.native
  def axeRun(
    selector: String,
    options: StringDictionary[Any],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def axeRun(
    selector: String,
    options: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def axeRun(selector: Unit, options: StringDictionary[Any]): Awaitable[this.type, Null] = js.native
  def axeRun(
    selector: Unit,
    options: StringDictionary[Any],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def axeRun(
    selector: Unit,
    options: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("axeRun")
  var axeRun_Original: js.Function3[
    /* selector */ js.UndefOr[String], 
    /* options */ js.UndefOr[StringDictionary[Any]], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def back(): Awaitable[this.type, Null] = js.native
  def back(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("back")
  var back_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  var baseUrl: String = js.native
  
  var browserName: String = js.native
  
  def captureBrowserConsoleLogs(onEventCallback: js.Function1[/* event */ PickConsoleAPICalledEvent, Unit]): Awaitable[this.type, Null] = js.native
  def captureBrowserConsoleLogs(
    onEventCallback: js.Function1[/* event */ PickConsoleAPICalledEvent, Unit],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("captureBrowserConsoleLogs")
  var captureBrowserConsoleLogs_Original: js.Function2[
    /* onEventCallback */ js.Function1[/* event */ PickConsoleAPICalledEvent, Unit], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def captureBrowserExceptions(onExceptionCallback: js.Function1[/* event */ ExceptionThrownEvent, Unit]): Awaitable[this.type, Null] = js.native
  def captureBrowserExceptions(
    onExceptionCallback: js.Function1[/* event */ ExceptionThrownEvent, Unit],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("captureBrowserExceptions")
  var captureBrowserExceptions_Original: js.Function2[
    /* onExceptionCallback */ js.Function1[/* event */ ExceptionThrownEvent, Unit], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def captureNetworkRequests(onRequestCallback: js.Function1[/* requestParams */ RequestWillBeSentEvent, Unit]): Awaitable[this.type, Null] = js.native
  def captureNetworkRequests(
    onRequestCallback: js.Function1[/* requestParams */ RequestWillBeSentEvent, Unit],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("captureNetworkRequests")
  var captureNetworkRequests_Original: js.Function2[
    /* onRequestCallback */ js.Function1[/* requestParams */ RequestWillBeSentEvent, Unit], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def clearValue(selector: Definition): Awaitable[this.type, Null] = js.native
  def clearValue(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("clearValue")
  var clearValue_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def click(selector: Definition): Awaitable[this.type, Null] = js.native
  def click(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  def clickAndHold(selector: String): Awaitable[this.type, Null] = js.native
  def clickAndHold(
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("clickAndHold")
  var clickAndHold_Original: js.Function2[
    /* selector */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  @JSName("click")
  var click_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def closeWindow(): Awaitable[this.type, Null] = js.native
  def closeWindow(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("closeWindow")
  var closeWindow_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def contexts(): Awaitable[this.type, js.Array[String]] = js.native
  def contexts(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[String]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[String]] = js.native
  @JSName("contexts")
  var contexts_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[js.Array[String]], 
        Unit
      ]
    ], 
    Awaitable[this.type, js.Array[String]]
  ] = js.native
  
  def cookie(method: GET | DELETE): Awaitable[this.type, js.Array[Cookie] | Null] = js.native
  def cookie(
    method: GET | DELETE,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[Cookie] | Null], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[Cookie] | Null] = js.native
  @JSName("cookie")
  var cookie_Original: js.Function2[
    /* method */ GET | DELETE, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[js.Array[Cookie] | Null], 
        Unit
      ]
    ], 
    Awaitable[this.type, js.Array[Cookie] | Null]
  ] = js.native
  
  def currentContext(): Awaitable[this.type, String | Null] = js.native
  def currentContext(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String | Null], Unit]
  ): Awaitable[this.type, String | Null] = js.native
  @JSName("currentContext")
  var currentContext_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String | Null], Unit]
    ], 
    Awaitable[this.type, String | Null]
  ] = js.native
  
  var currentTest: NightwatchTestSuite = js.native
  
  def debug(): Awaitable[this.type, Unit] = js.native
  def debug(config: Unit, callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): Awaitable[this.type, Unit] = js.native
  def debug(config: Preview): Awaitable[this.type, Unit] = js.native
  def debug(config: Preview, callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): Awaitable[this.type, Unit] = js.native
  @JSName("debug")
  var debug_Original: js.Function2[
    /* config */ js.UndefOr[Preview], 
    /* callback */ js.UndefOr[js.ThisFunction0[/* this */ NightwatchAPI, Unit]], 
    Awaitable[this.type, Unit]
  ] = js.native
  
  def deleteCookie(cookieName: String): Awaitable[this.type, Null] = js.native
  def deleteCookie(
    cookieName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("deleteCookie")
  var deleteCookie_Original: js.Function2[
    /* cookieName */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def deleteCookies(): Awaitable[this.type, Null] = js.native
  def deleteCookies(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("deleteCookies")
  var deleteCookies_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def dismissAlert(): Awaitable[this.type, Null] = js.native
  def dismissAlert(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("dismissAlert")
  var dismissAlert_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def doubleClick(selector: String): Awaitable[this.type, Null] = js.native
  def doubleClick(
    selector: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("doubleClick")
  var doubleClick_Original: js.Function2[
    /* selector */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def dragAndDrop(selector: Definition, destination: NightwatchElement): Awaitable[this.type, Null] = js.native
  def dragAndDrop(
    selector: Definition,
    destination: NightwatchElement,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def dragAndDrop(selector: Definition, destination: NightwatchPosition): Awaitable[this.type, Null] = js.native
  def dragAndDrop(
    selector: Definition,
    destination: NightwatchPosition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("dragAndDrop")
  var dragAndDrop_Original: js.Function3[
    /* selector */ Definition, 
    /* destination */ NightwatchElement | NightwatchPosition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def element(`using`: LocateStrategy, value: String): Awaitable[this.type, ElementResult] = js.native
  def element(
    `using`: LocateStrategy,
    value: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ElementResult], Unit]
  ): Awaitable[this.type, ElementResult] = js.native
  
  def elementActive(): Awaitable[this.type, String] = js.native
  def elementActive(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("elementActive")
  var elementActive_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def elementIdAttribute(id: String, attributeName: String): Awaitable[this.type, String | Null] = js.native
  def elementIdAttribute(
    id: String,
    attributeName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String | Null], Unit]
  ): Awaitable[this.type, String | Null] = js.native
  @JSName("elementIdAttribute")
  var elementIdAttribute_Original: js.Function3[
    /* id */ String, 
    /* attributeName */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String | Null], Unit]
    ], 
    Awaitable[this.type, String | Null]
  ] = js.native
  
  def elementIdClear(id: String): Awaitable[this.type, Null] = js.native
  def elementIdClear(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("elementIdClear")
  var elementIdClear_Original: js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def elementIdClick(id: String): Awaitable[this.type, Null] = js.native
  def elementIdClick(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("elementIdClick")
  var elementIdClick_Original: js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def elementIdCssProperty(id: String, cssPropertyName: String): Awaitable[this.type, String] = js.native
  def elementIdCssProperty(
    id: String,
    cssPropertyName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("elementIdCssProperty")
  var elementIdCssProperty_Original: js.Function3[
    /* id */ String, 
    /* cssPropertyName */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def elementIdDisplayed(id: String): Awaitable[this.type, Boolean] = js.native
  def elementIdDisplayed(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("elementIdDisplayed")
  var elementIdDisplayed_Original: js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
    ], 
    Awaitable[this.type, Boolean]
  ] = js.native
  
  def elementIdDoubleClick(webElementId: String): Awaitable[this.type, Null] = js.native
  def elementIdDoubleClick(
    webElementId: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("elementIdDoubleClick")
  var elementIdDoubleClick_Original: js.Function2[
    /* webElementId */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def elementIdElement(id: String, `using`: LocateStrategy, value: String): Awaitable[this.type, ElementResult | js.Array[Any]] = js.native
  def elementIdElement(
    id: String,
    `using`: LocateStrategy,
    value: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[ElementResult | js.Array[Any]], 
      Unit
    ]
  ): Awaitable[this.type, ElementResult | js.Array[Any]] = js.native
  @JSName("elementIdElement")
  var elementIdElement_Original: js.Function4[
    /* id */ String, 
    /* using */ LocateStrategy, 
    /* value */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[ElementResult | js.Array[Any]], 
        Unit
      ]
    ], 
    Awaitable[this.type, ElementResult | js.Array[Any]]
  ] = js.native
  
  def elementIdElements(id: String, `using`: LocateStrategy, value: String): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def elementIdElements(
    id: String,
    `using`: LocateStrategy,
    value: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  @JSName("elementIdElements")
  var elementIdElements_Original: js.Function4[
    /* id */ String, 
    /* using */ LocateStrategy, 
    /* value */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
        Unit
      ]
    ], 
    Awaitable[this.type, js.Array[ElementResult]]
  ] = js.native
  
  def elementIdEnabled(id: String): Awaitable[this.type, Boolean] = js.native
  def elementIdEnabled(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("elementIdEnabled")
  var elementIdEnabled_Original: js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
    ], 
    Awaitable[this.type, Boolean]
  ] = js.native
  
  def elementIdEquals(id: String, otherId: String): Awaitable[this.type, Boolean] = js.native
  def elementIdEquals(
    id: String,
    otherId: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("elementIdEquals")
  var elementIdEquals_Original: js.Function3[
    /* id */ String, 
    /* otherId */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
    ], 
    Awaitable[this.type, Boolean]
  ] = js.native
  
  def elementIdLocation(id: String): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def elementIdLocation(
    id: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  
  def elementIdLocationInView(id: String): Awaitable[this.type, NightwatchPosition] = js.native
  def elementIdLocationInView(
    id: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchPosition] = js.native
  @JSName("elementIdLocationInView")
  var elementIdLocationInView_Original: js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[NightwatchPosition], 
        Unit
      ]
    ], 
    Awaitable[this.type, NightwatchPosition]
  ] = js.native
  
  @JSName("elementIdLocation")
  var elementIdLocation_Original: js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
        Unit
      ]
    ], 
    Awaitable[this.type, NightwatchSizeAndPosition]
  ] = js.native
  
  def elementIdName(id: String): Awaitable[this.type, String] = js.native
  def elementIdName(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("elementIdName")
  var elementIdName_Original: js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def elementIdProperty(webElementId: String, DOMPropertyName: String): Awaitable[this.type, Any] = js.native
  def elementIdProperty(
    webElementId: String,
    DOMPropertyName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
  ): Awaitable[this.type, Any] = js.native
  @JSName("elementIdProperty")
  var elementIdProperty_Original: js.Function3[
    /* webElementId */ String, 
    /* DOMPropertyName */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
    ], 
    Awaitable[this.type, Any]
  ] = js.native
  
  def elementIdSelected(id: String): Awaitable[this.type, Boolean] = js.native
  def elementIdSelected(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("elementIdSelected")
  var elementIdSelected_Original: js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
    ], 
    Awaitable[this.type, Boolean]
  ] = js.native
  
  def elementIdSize(id: String): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def elementIdSize(
    id: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  @JSName("elementIdSize")
  var elementIdSize_Original: js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
        Unit
      ]
    ], 
    Awaitable[this.type, NightwatchSizeAndPosition]
  ] = js.native
  
  def elementIdText(id: String): Awaitable[this.type, String] = js.native
  def elementIdText(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("elementIdText")
  var elementIdText_Original: js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def elementIdValue(id: String): Awaitable[this.type, String] = js.native
  def elementIdValue(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("elementIdValue")
  var elementIdValue_Original: js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  @JSName("element")
  var element_Original: js.Function3[
    /* using */ LocateStrategy, 
    /* value */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ElementResult], Unit]
    ], 
    Awaitable[this.type, ElementResult]
  ] = js.native
  
  def elements(`using`: LocateStrategy, value: String): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def elements(
    `using`: LocateStrategy,
    value: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  @JSName("elements")
  var elements_Original: js.Function3[
    /* using */ LocateStrategy, 
    /* value */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
        Unit
      ]
    ], 
    Awaitable[this.type, js.Array[ElementResult]]
  ] = js.native
  
  def enablePerformanceMetrics(): Awaitable[this.type, Null] = js.native
  def enablePerformanceMetrics(enable: Boolean): Awaitable[this.type, Null] = js.native
  def enablePerformanceMetrics(
    enable: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def enablePerformanceMetrics(
    enable: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("enablePerformanceMetrics")
  var enablePerformanceMetrics_Original: js.Function2[
    /* enable */ js.UndefOr[Boolean], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def end(): Awaitable[this.type, Null] = js.native
  def end(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("end")
  var end_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  var ensure: Ensure = js.native
  
  def execute[ReturnValue](body: String): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def execute[ReturnValue](
    body: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[VoidToNull[ReturnValue]], 
      Unit
    ]
  ): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def execute[ReturnValue](body: ExecuteScriptFunction[js.Array[Any], ReturnValue]): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def execute[ReturnValue](
    body: ExecuteScriptFunction[js.Array[Any], ReturnValue],
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[VoidToNull[ReturnValue]], 
      Unit
    ]
  ): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  
  def executeAsync[ReturnValue](script: String): Awaitable[this.type, ReturnValue] = js.native
  def executeAsync[ReturnValue](
    script: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ReturnValue], Unit]
  ): Awaitable[this.type, ReturnValue] = js.native
  def executeAsync[ReturnValue](script: ExecuteAsyncScriptFunction[js.Array[Any], ReturnValue]): Awaitable[this.type, ReturnValue] = js.native
  def executeAsync[ReturnValue](
    script: ExecuteAsyncScriptFunction[js.Array[Any], ReturnValue],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ReturnValue], Unit]
  ): Awaitable[this.type, ReturnValue] = js.native
  
  def executeAsyncScript[ReturnValue](script: String): Awaitable[this.type, ReturnValue] = js.native
  def executeAsyncScript[ReturnValue](
    script: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ReturnValue], Unit]
  ): Awaitable[this.type, ReturnValue] = js.native
  def executeAsyncScript[ReturnValue](script: ExecuteAsyncScriptFunction[js.Array[Any], ReturnValue]): Awaitable[this.type, ReturnValue] = js.native
  def executeAsyncScript[ReturnValue](
    script: ExecuteAsyncScriptFunction[js.Array[Any], ReturnValue],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ReturnValue], Unit]
  ): Awaitable[this.type, ReturnValue] = js.native
  @JSName("executeAsyncScript")
  var executeAsyncScript_Original: js.Function2[
    /* script */ (ExecuteAsyncScriptFunction[js.Array[Any], Any]) | String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
    ], 
    Awaitable[this.type, Any]
  ] = js.native
  
  @JSName("executeAsync")
  var executeAsync_Original: js.Function2[
    /* script */ (ExecuteAsyncScriptFunction[js.Array[Any], Any]) | String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
    ], 
    Awaitable[this.type, Any]
  ] = js.native
  
  def executeScript[ReturnValue](body: String): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def executeScript[ReturnValue](
    body: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[VoidToNull[ReturnValue]], 
      Unit
    ]
  ): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def executeScript[ReturnValue](body: ExecuteScriptFunction[js.Array[Any], ReturnValue]): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  def executeScript[ReturnValue](
    body: ExecuteScriptFunction[js.Array[Any], ReturnValue],
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[VoidToNull[ReturnValue]], 
      Unit
    ]
  ): Awaitable[this.type, VoidToNull[ReturnValue]] = js.native
  @JSName("executeScript")
  var executeScript_Original: js.Function2[
    /* body */ (ExecuteScriptFunction[js.Array[Any], Any]) | String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[VoidToNull[Any]], 
        Unit
      ]
    ], 
    Awaitable[this.type, VoidToNull[Any]]
  ] = js.native
  
  @JSName("execute")
  var execute_Original: js.Function2[
    /* body */ (ExecuteScriptFunction[js.Array[Any], Any]) | String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[VoidToNull[Any]], 
        Unit
      ]
    ], 
    Awaitable[this.type, VoidToNull[Any]]
  ] = js.native
  
  var expect: Expect = js.native
  
  def findElement(selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def findElement(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  @JSName("findElement")
  var findElement_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
        Unit
      ]
    ], 
    Awaitable[this.type, JSON_WEB_OBJECT]
  ] = js.native
  
  def findElements(selector: Definition): Awaitable[this.type, js.Array[JSON_WEB_OBJECT]] = js.native
  def findElements(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[JSON_WEB_OBJECT]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[JSON_WEB_OBJECT]] = js.native
  @JSName("findElements")
  var findElements_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[js.Array[JSON_WEB_OBJECT]], 
        Unit
      ]
    ], 
    Awaitable[this.type, js.Array[JSON_WEB_OBJECT]]
  ] = js.native
  
  def forward(): Awaitable[this.type, Null] = js.native
  def forward(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("forward")
  var forward_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def frame(): Awaitable[this.type, Null] = js.native
  def frame(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  def frameParent(): Awaitable[this.type, Null] = js.native
  def frameParent(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("frameParent")
  var frameParent_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  @JSName("frame")
  var frame_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def fullscreenWindow(): Awaitable[this.type, Null] = js.native
  def fullscreenWindow(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("fullscreenWindow")
  var fullscreenWindow_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def getAccessibleName(selector: Definition): Awaitable[this.type, String] = js.native
  def getAccessibleName(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("getAccessibleName")
  var getAccessibleName_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def getAlertText(): Awaitable[this.type, String] = js.native
  def getAlertText(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("getAlertText")
  var getAlertText_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def getAriaRole(selector: Definition): Awaitable[this.type, String] = js.native
  def getAriaRole(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("getAriaRole")
  var getAriaRole_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def getAttribute(selector: Definition, attribute: String): Awaitable[this.type, String | Null] = js.native
  def getAttribute(
    selector: Definition,
    attribute: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String | Null], Unit]
  ): Awaitable[this.type, String | Null] = js.native
  @JSName("getAttribute")
  var getAttribute_Original: js.Function3[
    /* selector */ Definition, 
    /* attribute */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String | Null], Unit]
    ], 
    Awaitable[this.type, String | Null]
  ] = js.native
  
  def getCookie(name: String): Awaitable[this.type, Cookie] = js.native
  def getCookie(
    name: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Cookie], Unit]
  ): Awaitable[this.type, Cookie] = js.native
  @JSName("getCookie")
  var getCookie_Original: js.Function2[
    /* name */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Cookie], Unit]
    ], 
    Awaitable[this.type, Cookie]
  ] = js.native
  
  def getCookies(): Awaitable[this.type, js.Array[Cookie]] = js.native
  def getCookies(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[Cookie]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[Cookie]] = js.native
  @JSName("getCookies")
  var getCookies_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[js.Array[Cookie]], 
        Unit
      ]
    ], 
    Awaitable[this.type, js.Array[Cookie]]
  ] = js.native
  
  def getCssProperty(selector: Definition, cssProperty: String): Awaitable[this.type, String] = js.native
  def getCssProperty(
    selector: Definition,
    cssProperty: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("getCssProperty")
  var getCssProperty_Original: js.Function3[
    /* selector */ Definition, 
    /* cssProperty */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def getCurrentUrl(): Awaitable[this.type, String] = js.native
  def getCurrentUrl(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("getCurrentUrl")
  var getCurrentUrl_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def getElementProperty(selector: Definition, property: String): Awaitable[this.type, Any] = js.native
  def getElementProperty(
    selector: Definition,
    property: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
  ): Awaitable[this.type, Any] = js.native
  @JSName("getElementProperty")
  var getElementProperty_Original: js.Function3[
    /* selector */ Definition, 
    /* property */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
    ], 
    Awaitable[this.type, Any]
  ] = js.native
  
  def getElementRect(selector: Definition): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def getElementRect(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  @JSName("getElementRect")
  var getElementRect_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
        Unit
      ]
    ], 
    Awaitable[this.type, NightwatchSizeAndPosition]
  ] = js.native
  
  def getElementSize(selector: Definition): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def getElementSize(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  @JSName("getElementSize")
  var getElementSize_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
        Unit
      ]
    ], 
    Awaitable[this.type, NightwatchSizeAndPosition]
  ] = js.native
  
  def getFirstElementChild(selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getFirstElementChild(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  @JSName("getFirstElementChild")
  var getFirstElementChild_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
        Unit
      ]
    ], 
    Awaitable[this.type, JSON_WEB_OBJECT]
  ] = js.native
  
  def getLastElementChild(selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getLastElementChild(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  @JSName("getLastElementChild")
  var getLastElementChild_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
        Unit
      ]
    ], 
    Awaitable[this.type, JSON_WEB_OBJECT]
  ] = js.native
  
  def getLocation(selector: Definition): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def getLocation(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  
  def getLocationInView(selector: Definition): Awaitable[this.type, NightwatchPosition] = js.native
  def getLocationInView(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchPosition] = js.native
  @JSName("getLocationInView")
  var getLocationInView_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[NightwatchPosition], 
        Unit
      ]
    ], 
    Awaitable[this.type, NightwatchPosition]
  ] = js.native
  
  @JSName("getLocation")
  var getLocation_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
        Unit
      ]
    ], 
    Awaitable[this.type, NightwatchSizeAndPosition]
  ] = js.native
  
  def getLog(typestring: String): Awaitable[this.type, js.Array[NightwatchLogEntry]] = js.native
  def getLog(
    typestring: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* log */ js.Array[NightwatchLogEntry], Unit]
  ): Awaitable[this.type, js.Array[NightwatchLogEntry]] = js.native
  
  def getLogTypes(): Awaitable[this.type, js.Array[NightwatchLogTypes]] = js.native
  def getLogTypes(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ js.Array[NightwatchLogTypes], Unit]
  ): Awaitable[this.type, js.Array[NightwatchLogTypes]] = js.native
  @JSName("getLogTypes")
  var getLogTypes_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ js.Array[NightwatchLogTypes], Unit]
    ], 
    Awaitable[this.type, js.Array[NightwatchLogTypes]]
  ] = js.native
  
  @JSName("getLog")
  var getLog_Original: js.Function2[
    /* typestring */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* log */ js.Array[NightwatchLogEntry], Unit]
    ], 
    Awaitable[this.type, js.Array[NightwatchLogEntry]]
  ] = js.native
  
  def getNextSibling(selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getNextSibling(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  @JSName("getNextSibling")
  var getNextSibling_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
        Unit
      ]
    ], 
    Awaitable[this.type, JSON_WEB_OBJECT]
  ] = js.native
  
  def getOrientation(): Awaitable[this.type, LANDSCAPE | PORTRAIT] = js.native
  def getOrientation(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[LANDSCAPE | PORTRAIT], 
      Unit
    ]
  ): Awaitable[this.type, LANDSCAPE | PORTRAIT] = js.native
  @JSName("getOrientation")
  var getOrientation_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[LANDSCAPE | PORTRAIT], 
        Unit
      ]
    ], 
    Awaitable[this.type, LANDSCAPE | PORTRAIT]
  ] = js.native
  
  def getPerformanceMetrics(): Awaitable[this.type, StringDictionary[Double]] = js.native
  def getPerformanceMetrics(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[StringDictionary[Double]], 
      Unit
    ]
  ): Awaitable[this.type, StringDictionary[Double]] = js.native
  @JSName("getPerformanceMetrics")
  var getPerformanceMetrics_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[StringDictionary[Double]], 
        Unit
      ]
    ], 
    Awaitable[this.type, StringDictionary[Double]]
  ] = js.native
  
  def getPreviousSibling(selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getPreviousSibling(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  @JSName("getPreviousSibling")
  var getPreviousSibling_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
        Unit
      ]
    ], 
    Awaitable[this.type, JSON_WEB_OBJECT]
  ] = js.native
  
  def getShadowRoot(selector: Definition): Awaitable[this.type, Element | Null] = js.native
  def getShadowRoot(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Element | Null], 
      Unit
    ]
  ): Awaitable[this.type, Element | Null] = js.native
  def getShadowRoot(selector: By): Awaitable[this.type, Element | Null] = js.native
  def getShadowRoot(
    selector: By,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Element | Null], 
      Unit
    ]
  ): Awaitable[this.type, Element | Null] = js.native
  def getShadowRoot(selector: WebElement): Awaitable[this.type, Element | Null] = js.native
  def getShadowRoot(
    selector: WebElement,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Element | Null], 
      Unit
    ]
  ): Awaitable[this.type, Element | Null] = js.native
  @JSName("getShadowRoot")
  var getShadowRoot_Original: js.Function2[
    /* selector */ Definition | WebElement | By, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[Element | Null], 
        Unit
      ]
    ], 
    Awaitable[this.type, Element | Null]
  ] = js.native
  
  def getTagName(selector: Definition): Awaitable[this.type, String] = js.native
  def getTagName(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("getTagName")
  var getTagName_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def getText(selector: Definition): Awaitable[this.type, String] = js.native
  def getText(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("getText")
  var getText_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def getTitle(): Awaitable[this.type, String] = js.native
  def getTitle(callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ String, Unit]): Awaitable[this.type, String] = js.native
  @JSName("getTitle")
  var getTitle_Original: js.Function1[
    /* callback */ js.UndefOr[js.ThisFunction1[/* this */ NightwatchAPI, /* result */ String, Unit]], 
    Awaitable[this.type, String]
  ] = js.native
  
  def getValue(selector: Definition): Awaitable[this.type, String] = js.native
  def getValue(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("getValue")
  var getValue_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def getWindowPosition(): Awaitable[this.type, WindowPosition] = js.native
  def getWindowPosition(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[WindowPosition], 
      Unit
    ]
  ): Awaitable[this.type, WindowPosition] = js.native
  @JSName("getWindowPosition")
  var getWindowPosition_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[WindowPosition], 
        Unit
      ]
    ], 
    Awaitable[this.type, WindowPosition]
  ] = js.native
  
  def getWindowRect(): Awaitable[this.type, WindowSizeAndPosition] = js.native
  def getWindowRect(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[WindowSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, WindowSizeAndPosition] = js.native
  @JSName("getWindowRect")
  var getWindowRect_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[WindowSizeAndPosition], 
        Unit
      ]
    ], 
    Awaitable[this.type, WindowSizeAndPosition]
  ] = js.native
  
  def getWindowSize(): Awaitable[this.type, WindowSizeAndPosition] = js.native
  def getWindowSize(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[WindowSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, WindowSizeAndPosition] = js.native
  @JSName("getWindowSize")
  var getWindowSize_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[WindowSizeAndPosition], 
        Unit
      ]
    ], 
    Awaitable[this.type, WindowSizeAndPosition]
  ] = js.native
  
  var globals: NightwatchGlobals = js.native
  
  def hasDescendants(selector: Definition): Awaitable[this.type, Boolean] = js.native
  def hasDescendants(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("hasDescendants")
  var hasDescendants_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
    ], 
    Awaitable[this.type, Boolean]
  ] = js.native
  
  def init(): Awaitable[this.type, Null] = js.native
  def init(url: String): Awaitable[this.type, Null] = js.native
  def init(
    url: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def init(
    url: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("init")
  var init_Original: js.Function2[
    /* url */ js.UndefOr[String], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def injectScript(scriptUrl: String): Awaitable[this.type, HTMLScriptElement] = js.native
  def injectScript(scriptUrl: String, id: String): Awaitable[this.type, HTMLScriptElement] = js.native
  def injectScript(
    scriptUrl: String,
    id: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[HTMLScriptElement], 
      Unit
    ]
  ): Awaitable[this.type, HTMLScriptElement] = js.native
  def injectScript(
    scriptUrl: String,
    id: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[HTMLScriptElement], 
      Unit
    ]
  ): Awaitable[this.type, HTMLScriptElement] = js.native
  @JSName("injectScript")
  var injectScript_Original: js.Function3[
    /* scriptUrl */ String, 
    /* id */ js.UndefOr[String], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[HTMLScriptElement], 
        Unit
      ]
    ], 
    Awaitable[this.type, HTMLScriptElement]
  ] = js.native
  
  def isAndroid(): Boolean = js.native
  @JSName("isAndroid")
  var isAndroid_Original: js.Function0[Boolean] = js.native
  
  def isAppiumClient(): Boolean = js.native
  @JSName("isAppiumClient")
  var isAppiumClient_Original: js.Function0[Boolean] = js.native
  
  def isChrome(): Boolean = js.native
  @JSName("isChrome")
  var isChrome_Original: js.Function0[Boolean] = js.native
  
  def isEdge(): Boolean = js.native
  @JSName("isEdge")
  var isEdge_Original: js.Function0[Boolean] = js.native
  
  def isEnabled(selector: Definition): Awaitable[this.type, Boolean] = js.native
  def isEnabled(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("isEnabled")
  var isEnabled_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
    ], 
    Awaitable[this.type, Boolean]
  ] = js.native
  
  def isFirefox(): Boolean = js.native
  @JSName("isFirefox")
  var isFirefox_Original: js.Function0[Boolean] = js.native
  
  def isIOS(): Boolean = js.native
  @JSName("isIOS")
  var isIOS_Original: js.Function0[Boolean] = js.native
  
  def isInternetExplorer(): Boolean = js.native
  @JSName("isInternetExplorer")
  var isInternetExplorer_Original: js.Function0[Boolean] = js.native
  
  def isLogAvailable(typeString: String): Awaitable[this.type, Boolean] = js.native
  def isLogAvailable(
    typeString: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ Boolean, Unit]
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("isLogAvailable")
  var isLogAvailable_Original: js.Function2[
    /* typeString */ String, 
    /* callback */ js.UndefOr[js.ThisFunction1[/* this */ NightwatchAPI, /* result */ Boolean, Unit]], 
    Awaitable[this.type, Boolean]
  ] = js.native
  
  def isMobile(): Boolean = js.native
  @JSName("isMobile")
  var isMobile_Original: js.Function0[Boolean] = js.native
  
  def isOpera(): Boolean = js.native
  @JSName("isOpera")
  var isOpera_Original: js.Function0[Boolean] = js.native
  
  def isPresent(selector: Definition): Awaitable[this.type, Boolean] = js.native
  def isPresent(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("isPresent")
  var isPresent_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
    ], 
    Awaitable[this.type, Boolean]
  ] = js.native
  
  def isSafari(): Boolean = js.native
  @JSName("isSafari")
  var isSafari_Original: js.Function0[Boolean] = js.native
  
  def isSelected(selector: Definition): Awaitable[this.type, Boolean] = js.native
  def isSelected(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("isSelected")
  var isSelected_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
    ], 
    Awaitable[this.type, Boolean]
  ] = js.native
  
  def isVisible(selector: Definition): Awaitable[this.type, Boolean] = js.native
  def isVisible(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("isVisible")
  var isVisible_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
    ], 
    Awaitable[this.type, Boolean]
  ] = js.native
  
  def keys(keysToSend: String): Awaitable[this.type, Null] = js.native
  def keys(
    keysToSend: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def keys(keysToSend: js.Array[String]): Awaitable[this.type, Null] = js.native
  def keys(
    keysToSend: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("keys")
  var keys_Original: js.Function2[
    /* keysToSend */ String | js.Array[String], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  var launchUrl: String = js.native
  
  var launch_url: String = js.native
  
  def maximizeWindow(): Awaitable[this.type, Null] = js.native
  def maximizeWindow(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("maximizeWindow")
  var maximizeWindow_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def minimizeWindow(): Awaitable[this.type, Null] = js.native
  def minimizeWindow(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("minimizeWindow")
  var minimizeWindow_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def mockNetworkResponse(urlToIntercept: String): Awaitable[this.type, Null] = js.native
  def mockNetworkResponse(
    urlToIntercept: String,
    response: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def mockNetworkResponse(urlToIntercept: String, response: Body): Awaitable[this.type, Null] = js.native
  def mockNetworkResponse(
    urlToIntercept: String,
    response: Body,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("mockNetworkResponse")
  var mockNetworkResponse_Original: js.Function3[
    /* urlToIntercept */ String, 
    /* response */ js.UndefOr[Body], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def mouseButtonClick(button: `0` | `1` | `2` | left | middle | right): Awaitable[this.type, Null] = js.native
  def mouseButtonClick(
    button: `0` | `1` | `2` | left | middle | right,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("mouseButtonClick")
  var mouseButtonClick_Original: js.Function2[
    /* button */ `0` | `1` | `2` | left | middle | right, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def mouseButtonDown(button: `0` | `1` | `2` | left | middle | right): Awaitable[this.type, Null] = js.native
  def mouseButtonDown(
    button: `0` | `1` | `2` | left | middle | right,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("mouseButtonDown")
  var mouseButtonDown_Original: js.Function2[
    /* button */ `0` | `1` | `2` | left | middle | right, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def mouseButtonUp(button: `0` | `1` | `2` | left | middle | right): Awaitable[this.type, Null] = js.native
  def mouseButtonUp(
    button: `0` | `1` | `2` | left | middle | right,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("mouseButtonUp")
  var mouseButtonUp_Original: js.Function2[
    /* button */ `0` | `1` | `2` | left | middle | right, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def moveTo(): Awaitable[this.type, Null] = js.native
  def moveTo(elementId: String): Awaitable[this.type, Null] = js.native
  def moveTo(
    elementId: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def moveTo(
    elementId: Null,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  def moveToElement(selector: Definition, xoffset: Double, yoffset: Double): Awaitable[this.type, Null] = js.native
  def moveToElement(
    selector: Definition,
    xoffset: Double,
    yoffset: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("moveToElement")
  var moveToElement_Original: js.Function4[
    /* selector */ Definition, 
    /* xoffset */ Double, 
    /* yoffset */ Double, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  @JSName("moveTo")
  var moveTo_Original: js.Function2[
    /* elementId */ String | Null, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def navigateTo(url: String): Awaitable[this.type, Null] = js.native
  def navigateTo(
    url: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("navigateTo")
  var navigateTo_Original: js.Function2[
    /* url */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def openNewWindow(): Awaitable[this.type, Null] = js.native
  def openNewWindow(
    `type`: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def openNewWindow(`type`: WindowType): Awaitable[this.type, Null] = js.native
  def openNewWindow(
    `type`: WindowType,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("openNewWindow")
  var openNewWindow_Original: js.Function2[
    /* type */ js.UndefOr[WindowType], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  var options: NightwatchTestOptions = js.native
  
  var page: NightwatchPage & NightwatchCustomPageObjects = js.native
  
  def pageSource(): Awaitable[this.type, String] = js.native
  def pageSource(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("pageSource")
  var pageSource_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def pause(): Awaitable[this.type, Unit] = js.native
  def pause(ms: Double): Awaitable[this.type, Unit] = js.native
  def pause(ms: Double, callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): Awaitable[this.type, Unit] = js.native
  def pause(ms: Unit, callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): Awaitable[this.type, Unit] = js.native
  @JSName("pause")
  var pause_Original: js.Function2[
    /* ms */ js.UndefOr[Double], 
    /* callback */ js.UndefOr[js.ThisFunction0[/* this */ NightwatchAPI, Unit]], 
    Awaitable[this.type, Unit]
  ] = js.native
  
  def perform(callback: js.Function0[js.UndefOr[js.Promise[Any]]]): Awaitable[this.type, js.UndefOr[js.Error]] = js.native
  def perform(callback: js.Function1[/* done */ js.Function0[Unit], Unit]): Awaitable[this.type, js.UndefOr[js.Error]] = js.native
  def perform(callback: js.Function2[/* client */ NightwatchAPI, /* done */ js.Function0[Unit], Unit]): Awaitable[this.type, js.UndefOr[js.Error]] = js.native
  @JSName("perform")
  var perform_Original: js.Function1[
    /* callback */ js.Function0[js.UndefOr[js.Promise[Any]]] | (js.Function1[/* done */ js.Function0[Unit], Unit]) | (js.Function2[/* client */ NightwatchAPI, /* done */ js.Function0[Unit], Unit]), 
    Awaitable[this.type, js.UndefOr[js.Error]]
  ] = js.native
  
  var platformName: String = js.native
  
  def quit(): Awaitable[this.type, Null] = js.native
  def quit(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("quit")
  var quit_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def refresh(): Awaitable[this.type, Null] = js.native
  def refresh(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("refresh")
  var refresh_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def registerBasicAuth(username: String, password: String): Awaitable[this.type, Null] = js.native
  def registerBasicAuth(
    username: String,
    password: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("registerBasicAuth")
  var registerBasicAuth_Original: js.Function3[
    /* username */ String, 
    /* password */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def releaseMouseButton(): Awaitable[this.type, Null] = js.native
  def releaseMouseButton(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("releaseMouseButton")
  var releaseMouseButton_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def resizeWindow(width: Double, height: Double): Awaitable[this.type, Null] = js.native
  def resizeWindow(
    width: Double,
    height: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("resizeWindow")
  var resizeWindow_Original: js.Function3[
    /* width */ Double, 
    /* height */ Double, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def rightClick(selector: Definition): Awaitable[this.type, Null] = js.native
  def rightClick(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("rightClick")
  var rightClick_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def saveScreenshot(fileName: String): Awaitable[this.type, String] = js.native
  def saveScreenshot(
    fileName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("saveScreenshot")
  var saveScreenshot_Original: js.Function2[
    /* fileName */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def screenshot(): Awaitable[this.type, String] = js.native
  def screenshot(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("screenshot")
  var screenshot_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def sendKeys(selector: Definition, inputValue: String): Awaitable[this.type, Null] = js.native
  def sendKeys(
    selector: Definition,
    inputValue: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def sendKeys(selector: Definition, inputValue: js.Array[String]): Awaitable[this.type, Null] = js.native
  def sendKeys(
    selector: Definition,
    inputValue: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("sendKeys")
  var sendKeys_Original: js.Function3[
    /* selector */ Definition, 
    /* inputValue */ String | js.Array[String], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def session(): Awaitable[this.type, Record[String, Any]] = js.native
  def session(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Record[String, Any]], 
      Unit
    ]
  ): Awaitable[this.type, Record[String, Any]] = js.native
  
  var sessionId: String = js.native
  
  def sessionLog(typeString: String): Awaitable[this.type, js.Array[NightwatchLogEntry]] = js.native
  def sessionLog(
    typeString: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[NightwatchLogEntry]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[NightwatchLogEntry]] = js.native
  
  def sessionLogTypes(): Awaitable[this.type, js.Array[NightwatchLogTypes]] = js.native
  def sessionLogTypes(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[NightwatchLogTypes]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[NightwatchLogTypes]] = js.native
  @JSName("sessionLogTypes")
  var sessionLogTypes_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[js.Array[NightwatchLogTypes]], 
        Unit
      ]
    ], 
    Awaitable[this.type, js.Array[NightwatchLogTypes]]
  ] = js.native
  
  @JSName("sessionLog")
  var sessionLog_Original: js.Function2[
    /* typeString */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[js.Array[NightwatchLogEntry]], 
        Unit
      ]
    ], 
    Awaitable[this.type, js.Array[NightwatchLogEntry]]
  ] = js.native
  
  @JSName("session")
  var session_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[Record[String, Any]], 
        Unit
      ]
    ], 
    Awaitable[this.type, Record[String, Any]]
  ] = js.native
  
  def sessions(): Awaitable[this.type, js.Array[Record[String, Any]]] = js.native
  def sessions(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[Record[String, Any]]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[Record[String, Any]]] = js.native
  @JSName("sessions")
  var sessions_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[js.Array[Record[String, Any]]], 
        Unit
      ]
    ], 
    Awaitable[this.type, js.Array[Record[String, Any]]]
  ] = js.native
  
  def setAlertText(value: String): Awaitable[this.type, Null] = js.native
  def setAlertText(
    value: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("setAlertText")
  var setAlertText_Original: js.Function2[
    /* value */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def setAttribute(selector: Definition, attribute: String, value: String): Awaitable[this.type, Boolean] = js.native
  def setAttribute(
    selector: Definition,
    attribute: String,
    value: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("setAttribute")
  var setAttribute_Original: js.Function4[
    /* selector */ Definition, 
    /* attribute */ String, 
    /* value */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
    ], 
    Awaitable[this.type, Boolean]
  ] = js.native
  
  def setContext(context: String): Awaitable[this.type, Null] = js.native
  def setContext(
    context: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("setContext")
  var setContext_Original: js.Function2[
    /* context */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def setCookie(cookie: Cookie): Awaitable[this.type, Null] = js.native
  def setCookie(
    cookie: Cookie,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("setCookie")
  var setCookie_Original: js.Function2[
    /* cookie */ Cookie, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def setDeviceDimensions(): Awaitable[this.type, Null] = js.native
  def setDeviceDimensions(
    metrics: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def setDeviceDimensions(metrics: DeviceScaleFactor): Awaitable[this.type, Null] = js.native
  def setDeviceDimensions(
    metrics: DeviceScaleFactor,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("setDeviceDimensions")
  var setDeviceDimensions_Original: js.Function2[
    /* metrics */ js.UndefOr[DeviceScaleFactor], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def setGeolocation(): Awaitable[this.type, Null] = js.native
  def setGeolocation(
    coordinates: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def setGeolocation(coordinates: Accuracy): Awaitable[this.type, Null] = js.native
  def setGeolocation(
    coordinates: Accuracy,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("setGeolocation")
  var setGeolocation_Original: js.Function2[
    /* coordinates */ js.UndefOr[Accuracy], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def setNetworkConditions(spec: Downloadthroughput): Awaitable[this.type, Null] = js.native
  def setNetworkConditions(
    spec: Downloadthroughput,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("setNetworkConditions")
  var setNetworkConditions_Original: js.Function2[
    /* spec */ Downloadthroughput, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def setOrientation(orientation: LANDSCAPE | PORTRAIT): Awaitable[this.type, LANDSCAPE | PORTRAIT] = js.native
  def setOrientation(
    orientation: LANDSCAPE | PORTRAIT,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[LANDSCAPE | PORTRAIT], 
      Unit
    ]
  ): Awaitable[this.type, LANDSCAPE | PORTRAIT] = js.native
  @JSName("setOrientation")
  var setOrientation_Original: js.Function2[
    /* orientation */ LANDSCAPE | PORTRAIT, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[LANDSCAPE | PORTRAIT], 
        Unit
      ]
    ], 
    Awaitable[this.type, LANDSCAPE | PORTRAIT]
  ] = js.native
  
  def setPassword(selector: Definition, inputValue: String): Awaitable[this.type, Null] = js.native
  def setPassword(
    selector: Definition,
    inputValue: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def setPassword(selector: Definition, inputValue: js.Array[String]): Awaitable[this.type, Null] = js.native
  def setPassword(
    selector: Definition,
    inputValue: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("setPassword")
  var setPassword_Original: js.Function3[
    /* selector */ Definition, 
    /* inputValue */ String | js.Array[String], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def setSessionId(sessionId: String): this.type = js.native
  @JSName("setSessionId")
  var setSessionId_Original: js.Function1[/* sessionId */ String, this.type] = js.native
  
  def setValue(selector: Definition, inputValue: String): Awaitable[this.type, Null] = js.native
  def setValue(
    selector: Definition,
    inputValue: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def setValue(selector: Definition, inputValue: js.Array[String]): Awaitable[this.type, Null] = js.native
  def setValue(
    selector: Definition,
    inputValue: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("setValue")
  var setValue_Original: js.Function3[
    /* selector */ Definition, 
    /* inputValue */ String | js.Array[String], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def setWindowPosition(offsetX: Double, offsetY: Double): Awaitable[this.type, Null] = js.native
  def setWindowPosition(
    offsetX: Double,
    offsetY: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("setWindowPosition")
  var setWindowPosition_Original: js.Function3[
    /* offsetX */ Double, 
    /* offsetY */ Double, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def setWindowRect(options: WindowSizeAndPosition): Awaitable[this.type, Null] = js.native
  def setWindowRect(
    options: WindowSizeAndPosition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("setWindowRect")
  var setWindowRect_Original: js.Function2[
    /* options */ WindowSizeAndPosition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def setWindowSize(width: Double, height: Double): Awaitable[this.type, Null] = js.native
  def setWindowSize(
    width: Double,
    height: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("setWindowSize")
  var setWindowSize_Original: js.Function3[
    /* width */ Double, 
    /* height */ Double, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def source(): Awaitable[this.type, String] = js.native
  def source(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("source")
  var source_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def status(): Awaitable[this.type, NightwatchServerStatusResult] = js.native
  def status(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchServerStatusResult], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchServerStatusResult] = js.native
  @JSName("status")
  var status_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[NightwatchServerStatusResult], 
        Unit
      ]
    ], 
    Awaitable[this.type, NightwatchServerStatusResult]
  ] = js.native
  
  def submit(id: String): Awaitable[this.type, Null] = js.native
  def submit(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  def submitForm(selector: Definition): Awaitable[this.type, Null] = js.native
  def submitForm(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("submitForm")
  var submitForm_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  @JSName("submit")
  var submit_Original: js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def switchToWindow(handleOrName: String): Awaitable[this.type, Null] = js.native
  def switchToWindow(
    handleOrName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("switchToWindow")
  var switchToWindow_Original: js.Function2[
    /* handleOrName */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def switchWindow(handleOrName: String): Awaitable[this.type, Null] = js.native
  def switchWindow(
    handleOrName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("switchWindow")
  var switchWindow_Original: js.Function2[
    /* handleOrName */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def takeElementScreenshot(selector: Definition): Awaitable[this.type, String] = js.native
  def takeElementScreenshot(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("takeElementScreenshot")
  var takeElementScreenshot_Original: js.Function2[
    /* selector */ Definition, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def takeHeapSnapshot(): Awaitable[this.type, String] = js.native
  def takeHeapSnapshot(heapSnapshotLocation: String): Awaitable[this.type, String] = js.native
  def takeHeapSnapshot(
    heapSnapshotLocation: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  def takeHeapSnapshot(
    heapSnapshotLocation: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("takeHeapSnapshot")
  var takeHeapSnapshot_Original: js.Function2[
    /* heapSnapshotLocation */ js.UndefOr[String], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  /* standard es5 */
  def `then`[TResult1, TResult2](): PromiseLike[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[
      /* value */ NightwatchNodeAssertionsResult | js.Error, 
      TResult1 | PromiseLike[TResult1]
    ]
  ): PromiseLike[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[
      /* value */ NightwatchNodeAssertionsResult | js.Error, 
      TResult1 | PromiseLike[TResult1]
    ],
    onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
  ): PromiseLike[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): PromiseLike[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): PromiseLike[TResult1 | TResult2] = js.native
  
  def timeouts(typeOfOperation: script | `implicit` | pageLoad, ms: Double): Awaitable[this.type, Null] = js.native
  def timeouts(
    typeOfOperation: script | `implicit` | pageLoad,
    ms: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  def timeoutsAsyncScript(ms: Double): Awaitable[this.type, Null] = js.native
  def timeoutsAsyncScript(
    ms: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("timeoutsAsyncScript")
  var timeoutsAsyncScript_Original: js.Function2[
    /* ms */ Double, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def timeoutsImplicitWait(ms: Double): Awaitable[this.type, Null] = js.native
  def timeoutsImplicitWait(
    ms: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("timeoutsImplicitWait")
  var timeoutsImplicitWait_Original: js.Function2[
    /* ms */ Double, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  @JSName("timeouts")
  var timeouts_Original: js.Function3[
    /* typeOfOperation */ script | `implicit` | pageLoad, 
    /* ms */ Double, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def title(): Awaitable[this.type, String] = js.native
  def title(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("title")
  var title_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def updateValue(selector: Definition, inputValue: String): Awaitable[this.type, Null] = js.native
  def updateValue(
    selector: Definition,
    inputValue: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def updateValue(selector: Definition, inputValue: js.Array[String]): Awaitable[this.type, Null] = js.native
  def updateValue(
    selector: Definition,
    inputValue: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("updateValue")
  var updateValue_Original: js.Function3[
    /* selector */ Definition, 
    /* inputValue */ String | js.Array[String], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def uploadFile(selector: Definition, filePath: String): Awaitable[this.type, Null] = js.native
  def uploadFile(
    selector: Definition,
    filePath: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("uploadFile")
  var uploadFile_Original: js.Function3[
    /* selector */ Definition, 
    /* filePath */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def url(): Awaitable[this.type, String] = js.native
  def url(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  
  def urlHash(hash: String): Awaitable[this.type, Null] = js.native
  def urlHash(
    hash: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("urlHash")
  var urlHash_Original: js.Function2[
    /* hash */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  @JSName("url")
  var url_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def useCss(): Awaitable[this.type, Unit] = js.native
  def useCss(callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): Awaitable[this.type, Unit] = js.native
  @JSName("useCss")
  var useCss_Original: js.Function1[
    /* callback */ js.UndefOr[js.ThisFunction0[/* this */ NightwatchAPI, Unit]], 
    Awaitable[this.type, Unit]
  ] = js.native
  
  def useXpath(): Awaitable[this.type, Unit] = js.native
  def useXpath(callback: js.ThisFunction0[/* this */ NightwatchAPI, Unit]): Awaitable[this.type, Unit] = js.native
  @JSName("useXpath")
  var useXpath_Original: js.Function1[
    /* callback */ js.UndefOr[js.ThisFunction0[/* this */ NightwatchAPI, Unit]], 
    Awaitable[this.type, Unit]
  ] = js.native
  
  var verify: Assert = js.native
  
  def waitForElementNotPresent(selector: Definition): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(selector: Definition, time: Double): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(selector: Definition, time: Double, poll: Double): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(selector: Definition, time: Double, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(selector: Definition, time: Double, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(selector: Definition, time: Unit, poll: Double): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(selector: Definition, time: Unit, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(selector: Definition, time: Unit, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  @JSName("waitForElementNotPresent")
  var waitForElementNotPresent_Original: js.Function6[
    /* selector */ Definition, 
    /* time */ js.UndefOr[Double], 
    /* poll */ js.UndefOr[Double], 
    /* abortOnFailure */ js.UndefOr[Boolean], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
        Unit
      ]
    ], 
    /* message */ js.UndefOr[String], 
    Awaitable[this.type, js.Array[ElementResult]]
  ] = js.native
  
  def waitForElementNotVisible(selector: Definition): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(selector: Definition, time: Double): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(selector: Definition, time: Double, poll: Double): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(selector: Definition, time: Double, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(selector: Definition, time: Double, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(selector: Definition, time: Unit, poll: Double): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(selector: Definition, time: Unit, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(selector: Definition, time: Unit, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("waitForElementNotVisible")
  var waitForElementNotVisible_Original: js.Function6[
    /* selector */ Definition, 
    /* time */ js.UndefOr[Double], 
    /* poll */ js.UndefOr[Double], 
    /* abortOnFailure */ js.UndefOr[Boolean], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
    ], 
    /* message */ js.UndefOr[String], 
    Awaitable[this.type, Boolean]
  ] = js.native
  
  def waitForElementPresent(selector: Definition): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(selector: Definition, time: Double): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(selector: Definition, time: Double, poll: Double): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(selector: Definition, time: Double, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(selector: Definition, time: Double, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(selector: Definition, time: Unit, poll: Double): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(selector: Definition, time: Unit, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(selector: Definition, time: Unit, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
      Unit
    ],
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  @JSName("waitForElementPresent")
  var waitForElementPresent_Original: js.Function6[
    /* selector */ Definition, 
    /* time */ js.UndefOr[Double], 
    /* poll */ js.UndefOr[Double], 
    /* abortOnFailure */ js.UndefOr[Boolean], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[js.Array[ElementResult]], 
        Unit
      ]
    ], 
    /* message */ js.UndefOr[String], 
    Awaitable[this.type, js.Array[ElementResult]]
  ] = js.native
  
  def waitForElementVisible(selector: Definition): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(selector: Definition, time: Double): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(selector: Definition, time: Double, poll: Double): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(selector: Definition, time: Double, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(selector: Definition, time: Double, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(selector: Definition, time: Unit, poll: Double): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(selector: Definition, time: Unit, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(selector: Definition, time: Unit, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("waitForElementVisible")
  var waitForElementVisible_Original: js.Function6[
    /* selector */ Definition, 
    /* time */ js.UndefOr[Double], 
    /* poll */ js.UndefOr[Double], 
    /* abortOnFailure */ js.UndefOr[Boolean], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
    ], 
    /* message */ js.UndefOr[String], 
    Awaitable[this.type, Boolean]
  ] = js.native
  
  def waitUntil(conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]]): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]],
    waitTimeMs: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]],
    waitTimeMs: Double,
    retryInterval: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]],
    waitTimeMs: Double,
    retryInterval: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]],
    waitTimeMs: Double,
    retryInterval: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]],
    waitTimeMs: Unit,
    retryInterval: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]],
    waitTimeMs: Unit,
    retryInterval: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]],
    waitTimeMs: Unit,
    retryInterval: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit]): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit],
    waitTimeMs: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit],
    waitTimeMs: Double,
    retryInterval: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit],
    waitTimeMs: Double,
    retryInterval: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit],
    waitTimeMs: Double,
    retryInterval: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit],
    waitTimeMs: Unit,
    retryInterval: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit],
    waitTimeMs: Unit,
    retryInterval: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit],
    waitTimeMs: Unit,
    retryInterval: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ],
    waitTimeMs: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ],
    waitTimeMs: Double,
    retryInterval: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ],
    waitTimeMs: Double,
    retryInterval: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ],
    waitTimeMs: Double,
    retryInterval: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ],
    waitTimeMs: Unit,
    retryInterval: Double
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ],
    waitTimeMs: Unit,
    retryInterval: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def waitUntil(
    conditionFn: js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ],
    waitTimeMs: Unit,
    retryInterval: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("waitUntil")
  var waitUntil_Original: js.Function4[
    /* conditionFn */ (js.ThisFunction0[/* this */ NightwatchAPI, js.UndefOr[js.Promise[Any]]]) | (js.ThisFunction1[/* this */ NightwatchAPI, /* done */ js.Function0[Unit], Unit]) | (js.ThisFunction2[
      /* this */ NightwatchAPI, 
      /* client */ NightwatchAPI, 
      /* done */ js.Function0[Unit], 
      Unit
    ]), 
    /* waitTimeMs */ js.UndefOr[Double], 
    /* retryInterval */ js.UndefOr[Double], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def window(method: post_ | delete_ | POST | DELETE): Awaitable[this.type, Null] = js.native
  def window(method: post_ | delete_ | POST | DELETE, handleOrName: String): Awaitable[this.type, Null] = js.native
  def window(
    method: post_ | delete_ | POST | DELETE,
    handleOrName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def window(
    method: post_ | delete_ | POST | DELETE,
    handleOrName: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  def windowHandle(): Awaitable[this.type, String] = js.native
  def windowHandle(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("windowHandle")
  var windowHandle_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
    ], 
    Awaitable[this.type, String]
  ] = js.native
  
  def windowHandles(): Awaitable[this.type, js.Array[String]] = js.native
  def windowHandles(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[String]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[String]] = js.native
  @JSName("windowHandles")
  var windowHandles_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[js.Array[String]], 
        Unit
      ]
    ], 
    Awaitable[this.type, js.Array[String]]
  ] = js.native
  
  def windowMaximize(): Awaitable[this.type, Null] = js.native
  def windowMaximize(handleOrName: String): Awaitable[this.type, Null] = js.native
  def windowMaximize(
    handleOrName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def windowMaximize(
    handleOrName: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("windowMaximize")
  var windowMaximize_Original: js.Function2[
    /* handleOrName */ js.UndefOr[String], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def windowPosition(windowHandle: String, offsetX: Double, offsetY: Double): Awaitable[this.type, Null] = js.native
  def windowPosition(
    windowHandle: String,
    offsetX: Double,
    offsetY: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("windowPosition")
  var windowPosition_Original: js.Function4[
    /* windowHandle */ String, 
    /* offsetX */ Double, 
    /* offsetY */ Double, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def windowRect(options: Height): Awaitable[this.type, Null] = js.native
  def windowRect(
    options: Height,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("windowRect")
  var windowRect_Original: js.Function2[
    /* options */ Height, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  def windowSize(windowHandle: String, width: Double, height: Double): Awaitable[this.type, Null] = js.native
  def windowSize(
    windowHandle: String,
    width: Double,
    height: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("windowSize")
  var windowSize_Original: js.Function4[
    /* windowHandle */ String, 
    /* width */ Double, 
    /* height */ Double, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
  
  @JSName("window")
  var window_Original: js.Function3[
    /* method */ post_ | delete_ | POST | DELETE, 
    /* handleOrName */ js.UndefOr[String], 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
    ], 
    Awaitable[this.type, Null]
  ] = js.native
}
