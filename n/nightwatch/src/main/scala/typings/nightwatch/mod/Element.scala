package typings.nightwatch.mod

import typings.nightwatch.anon.Fn0
import typings.nightwatch.anon.Fn1
import typings.nightwatch.anon.Fn2
import typings.nightwatch.anon.FnCall
import typings.nightwatch.anon.FnCallUsingSelectorAttributeCallback
import typings.nightwatch.anon.FnCallUsingSelectorCallback
import typings.nightwatch.anon.FnCallUsingSelectorCssPropertyCallback
import typings.nightwatch.anon.FnCallUsingSelectorInputValueCallback
import typings.nightwatch.anon.FnCallUsingSelectorPropertyCallback
import typings.nightwatch.anon.Height
import typings.nightwatch.nightwatchStrings.string
import typings.seleniumWebdriver.mod.By
import typings.seleniumWebdriver.mod.WebElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nightwatch", "Element")
@js.native
open class Element ()
  extends StObject
     with _Definition {
  
  var abortOnFailure: Boolean = js.native
  
  def accessibleName(selector: Definition): String = js.native
  
  def arialRole(selector: Definition): String = js.native
  
  def attr(selector: Definition): String = js.native
  
  def attribute(selector: Definition): String = js.native
  
  def clear(selector: Definition): Awaitable[this.type, Null] = js.native
  def clear(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def clear(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, Null] = js.native
  def clear(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("clear")
  var clear_Original: Fn0 = js.native
  
  def click(selector: Definition): Awaitable[this.type, Null] = js.native
  def click(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def click(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, Null] = js.native
  def click(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("click")
  var click_Original: Fn0 = js.native
  
  def css(selector: Definition): String = js.native
  
  def element(locator: Definition): this.type = js.native
  def element(locator: Definition, options: Any): this.type = js.native
  def element(locator: By): this.type = js.native
  def element(locator: By, options: Any): this.type = js.native
  def element(locator: WebElement): this.type = js.native
  def element(locator: WebElement, options: Any): this.type = js.native
  @JSName("element")
  var element_Original: js.Function2[/* locator */ Definition | By | WebElement, /* options */ js.UndefOr[Any], this.type] = js.native
  
  def find(selector: Definition): Any = js.native
  def find(selector: By): Any = js.native
  def find(selector: WebElement): Any = js.native
  
  def findAll(selector: Definition): Any = js.native
  
  def findElement(selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def findElement(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def findElement(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def findElement(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  @JSName("findElement")
  var findElement_Original: FnCall = js.native
  
  def findElements(selector: Definition): Awaitable[this.type, js.Array[JSON_WEB_OBJECT]] = js.native
  def findElements(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[JSON_WEB_OBJECT]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[JSON_WEB_OBJECT]] = js.native
  def findElements(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, js.Array[JSON_WEB_OBJECT]] = js.native
  def findElements(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[JSON_WEB_OBJECT]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[JSON_WEB_OBJECT]] = js.native
  @JSName("findElements")
  var findElements_Original: FnCallUsingSelectorCallback = js.native
  
  def get(selector: Definition): Any = js.native
  def get(selector: By): Any = js.native
  def get(selector: WebElement): Any = js.native
  
  def getAccessibleName(selector: Definition): Awaitable[this.type, String] = js.native
  def getAccessibleName(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  def getAccessibleName(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, String] = js.native
  def getAccessibleName(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("getAccessibleName")
  var getAccessibleName_Original: Fn1 = js.native
  
  def getAriaRole(selector: Definition): Awaitable[this.type, String] = js.native
  def getAriaRole(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  def getAriaRole(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, String] = js.native
  def getAriaRole(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("getAriaRole")
  var getAriaRole_Original: Fn1 = js.native
  
  def getAttribute(selector: Definition, attribute: String): Awaitable[this.type, String | Null] = js.native
  def getAttribute(
    selector: Definition,
    attribute: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String | Null], Unit]
  ): Awaitable[this.type, String | Null] = js.native
  def getAttribute(`using`: LocateStrategy, selector: Definition, attribute: String): Awaitable[this.type, String | Null] = js.native
  def getAttribute(
    `using`: LocateStrategy,
    selector: Definition,
    attribute: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String | Null], Unit]
  ): Awaitable[this.type, String | Null] = js.native
  @JSName("getAttribute")
  var getAttribute_Original: FnCallUsingSelectorAttributeCallback = js.native
  
  def getCssValue(selector: Definition, cssProperty: String): Awaitable[this.type, String] = js.native
  def getCssValue(
    selector: Definition,
    cssProperty: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  def getCssValue(`using`: LocateStrategy, selector: Definition, cssProperty: String): Awaitable[this.type, String] = js.native
  def getCssValue(
    `using`: LocateStrategy,
    selector: Definition,
    cssProperty: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("getCssValue")
  var getCssValue_Original: FnCallUsingSelectorCssPropertyCallback = js.native
  
  def getId(): String = js.native
  
  def getProperty(selector: Definition, property: String): Awaitable[this.type, Any] = js.native
  def getProperty(
    selector: Definition,
    property: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
  ): Awaitable[this.type, Any] = js.native
  def getProperty(`using`: LocateStrategy, selector: Definition, property: String): Awaitable[this.type, Any] = js.native
  def getProperty(
    `using`: LocateStrategy,
    selector: Definition,
    property: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
  ): Awaitable[this.type, Any] = js.native
  @JSName("getProperty")
  var getProperty_Original: FnCallUsingSelectorPropertyCallback = js.native
  
  def getRect(): Awaitable[this.type, WindowSizeAndPosition] = js.native
  def getRect(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[WindowSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, WindowSizeAndPosition] = js.native
  @JSName("getRect")
  var getRect_Original: js.Function1[
    /* callback */ js.UndefOr[
      js.ThisFunction1[
        /* this */ NightwatchAPI, 
        /* result */ NightwatchCallbackResult[WindowSizeAndPosition], 
        Unit
      ]
    ], 
    Awaitable[this.type, WindowSizeAndPosition]
  ] = js.native
  
  def getTagName(selector: Definition): Awaitable[this.type, String] = js.native
  def getTagName(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  def getTagName(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, String] = js.native
  def getTagName(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("getTagName")
  var getTagName_Original: Fn1 = js.native
  
  def getText(selector: Definition): Awaitable[this.type, String] = js.native
  def getText(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  def getText(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, String] = js.native
  def getText(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("getText")
  var getText_Original: Fn1 = js.native
  
  def getWebElement(): js.Promise[WebElement] = js.native
  
  var index: Double = js.native
  
  def isComponent(): Boolean = js.native
  
  def isDisplayed(id: String): this.type = js.native
  def isDisplayed(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): this.type = js.native
  @JSName("isDisplayed")
  var isDisplayed_Original: js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
    ], 
    this.type
  ] = js.native
  
  def isEnabled(selector: Definition): Awaitable[this.type, Boolean] = js.native
  def isEnabled(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def isEnabled(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, Boolean] = js.native
  def isEnabled(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("isEnabled")
  var isEnabled_Original: Fn2 = js.native
  
  def isSelected(selector: Definition): Awaitable[this.type, Boolean] = js.native
  def isSelected(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def isSelected(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, Boolean] = js.native
  def isSelected(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  @JSName("isSelected")
  var isSelected_Original: Fn2 = js.native
  
  var locateStrategy: String = js.native
  
  var message: String = js.native
  
  var name: String = js.native
  
  var parent: Any = js.native
  
  def prop(selector: Definition): Any = js.native
  
  def property(selector: Definition): Any = js.native
  
  var pseudoSelector: Null = js.native
  
  def rect(): Height = js.native
  
  var resolvedElement: Any = js.native
  
  var retryInterval: Double = js.native
  
  def screenshot(selector: Definition): string = js.native
  
  var selector: String = js.native
  
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
  def sendKeys(`using`: LocateStrategy, selector: Definition, inputValue: String): Awaitable[this.type, Null] = js.native
  def sendKeys(
    `using`: LocateStrategy,
    selector: Definition,
    inputValue: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def sendKeys(`using`: LocateStrategy, selector: Definition, inputValue: js.Array[String]): Awaitable[this.type, Null] = js.native
  def sendKeys(
    `using`: LocateStrategy,
    selector: Definition,
    inputValue: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  @JSName("sendKeys")
  var sendKeys_Original: FnCallUsingSelectorInputValueCallback = js.native
  
  def submit(id: String): this.type = js.native
  def submit(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  @JSName("submit")
  var submit_Original: js.Function2[
    /* id */ String, 
    /* callback */ js.UndefOr[
      js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
    ], 
    this.type
  ] = js.native
  
  var suppressNotFoundErrors: Boolean = js.native
  
  def tagName(selector: Definition): String = js.native
  
  def takeScreenshot(selector: Definition): Awaitable[this.type, String] = js.native
  def takeScreenshot(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  def takeScreenshot(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, String] = js.native
  def takeScreenshot(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  @JSName("takeScreenshot")
  var takeScreenshot_Original: Fn1 = js.native
  
  def text(selector: Definition): String = js.native
  
  var timeout: Double = js.native
  
  var webElement: WebElement = js.native
}
