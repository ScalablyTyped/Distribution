package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolElements extends StObject {
  
  /**
    * Search for an element on the page, starting from the document root. The located element will be returned as a web element JSON object.
    * First argument to be passed is the locator strategy, which is detailed on the [WebDriver docs](https://www.w3.org/TR/webdriver/#locator-strategies).
    *
    * The locator stragy can be one of:
    * - `css selector`
    * - `link text`
    * - `partial link text`
    * - `tag name`
    * - `xpath`
    *
    * @example
    * module.exports = {
    *  'demo Test' : function(browser) {
    *     browser.element('css selector', 'body', function(result) {
    *       console.log(result.value)
    *     });
    *   },
    *
    *   'es6 async demo Test': async function(browser) {
    *     const result = await browser.element('css selector', 'body');
    *     console.log('result value is:', result);
    *   },
    *
    *   'demo Test with page object': function(browser) {
    *     const loginPage = browser.page.login();
    *     loginPage.api.element('@resultContainer', function(result) {
    *       console.log(result.value)
    *     });
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/element.html
    */
  def element(`using`: LocateStrategy, value: String): Awaitable[this.type, ElementResult] = js.native
  def element(
    `using`: LocateStrategy,
    value: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[ElementResult], Unit]
  ): Awaitable[this.type, ElementResult] = js.native
  
  /**
    * Get the element on the page that currently has focus.
    * The element will be returned as a [Web Element](https://www.w3.org/TR/webdriver1/#dfn-web-elements) id.
    *
    * @example
    * module.exports = {
    *  'demo Test' : function(browser) {
    *     browser.elementActive(function(result) {
    *       console.log(result.value)
    *     });
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/elementActive.html
    */
  def elementActive(): Awaitable[this.type, String] = js.native
  def elementActive(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  
  /**
    * Move to the element and performs a double-click in the middle of the given element if
    * element is given else double-clicks at the current mouse coordinates (set by `.moveTo()`).
    *
    */
  def elementIdDoubleClick(webElementId: String): Awaitable[this.type, Null] = js.native
  def elementIdDoubleClick(
    webElementId: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Search for an element on the page, starting from the identified element. The located element will be returned as a Web Element JSON object.
    *
    * This command operates on a protocol level and requires a [Web Element ID](https://www.w3.org/TR/webdriver1/#dfn-web-elements).
    * Read more on [Element retrieval](https://www.w3.org/TR/webdriver1/#element-retrieval) on the W3C WebDriver spec page.
    *
    * @example
    * module.exports = {
    *  'demo Test' : function(browser) {
    *     browser.findElement('.some-element', (result) => {
    *       this.elementIdElement(result.value.getId(), 'css selector', '.new-element', function(result) {
    *         console.log(result.value);
    *       });
    *     });
    *   },
    *
    *   'es6 async demo Test': async function(browser) {
    *     const elementObject = await browser.findElement('.some-element');
    *     const result = await browser.elementIdElement(elementId.getId(), 'css selector', '.new-element');
    *     console.log(result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/elementIdElement.html
    */
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
  
  /**
    * Search for multiple elements on the page, starting from the identified element. The located element will be returned as a web element JSON objects.
    *
    * @example
    * module.exports = {
    *  'demo Test' : function(browser) {
    *     browser.findElement('#main', (result) => {
    *       browser.elementIdElements(result.value.getId(), 'css selector', 'ul li', function(result) {
    *         console.log(result.value)
    *       });
    *     });
    *   },
    *
    *   'es6 async demo Test': async function(browser) {
    *     const elementObject = await browser.findElement('#main');
    *     const result = await browser.elementIdElements(elementObject.getId(), 'css selector', 'ul li');
    *     console.log(result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/elementIdElements.html
    */
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
  
  /**
    * Test if two web element IDs refer to the same DOM element.
    *
    * This command is __deprecated__ and is only available on the [JSON Wire protocol](https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#sessionsessionidelementidequalsother)
    *
    * @example
    * module.exports = {
    *  'demo Test' : function(browser) {
    *     browser.elementIdEquals('<ID-1>', '<ID-2>', function(result) {
    *       console.log(result.value)
    *     });
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/elementIdEquals.html
    *
    * @deprecated In favour of WebElement.equals(a, b) from Selenium Webdriver.
    */
  def elementIdEquals(id: String, otherId: String): Awaitable[this.type, Boolean] = js.native
  def elementIdEquals(
    id: String,
    otherId: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  
  /**
    *
    * Retrieve the value of a specified DOM property for the given element.
    * For all the available DOM element properties, consult the [Element doc at MDN](https://developer.mozilla.org/en-US/docs/Web/API/element).
    */
  def elementIdProperty(webElementId: String, DOMPropertyName: String): Awaitable[this.type, Any] = js.native
  def elementIdProperty(
    webElementId: String,
    DOMPropertyName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
  ): Awaitable[this.type, Any] = js.native
  
  /**
    * Search for multiple elements on the page, starting from the document root. The located elements will be returned as web element JSON objects.
    * First argument to be passed is the locator strategy, which is detailed on the [WebDriver docs](https://www.w3.org/TR/webdriver/#locator-strategies).
    *
    * * The locator strategy can be one of:
    * - `css selector`
    * - `link text`
    * - `partial link text`
    * - `tag name`
    * - `xpath`
    *
    * @example
    * module.exports = {
    *  'demo Test' : function(browser) {
    *     browser.elements('css selector', 'ul li', function(result) {
    *       console.log(result.value)
    *     });
    *   },
    *
    *   'es6 async demo Test': async function(browser) {
    *     const result = await browser.elements('css selector', 'ul li');
    *     console.log('result value is:', result);
    *   },
    *
    *   'page object demo Test': function (browser) {
    *      var nightwatch = browser.page.nightwatch();
    *      nightwatch
    *        .navigate()
    *        .assert.titleContains('Nightwatch.js');
    *
    *      nightwatch.api.elements('@featuresList', function(result) {
    *        console.log(result);
    *      });
    *
    *      browser.end();
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/elements.html
    */
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
}
