package typings.nightwatch.mod

import typings.seleniumWebdriver.mod.By
import typings.seleniumWebdriver.mod.WebElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementCommands extends StObject {
  
  /**
    * Clear a textarea or a text input element's value.
    * Starting with v1.1 `clearValue()` will wait for the element to be present (until the specified timeout).
    *
    * If the element is not found, an error is thrown which will cause the test to fail.
    * Starting with `v1.2` you can suppress element not found errors by specifying the `suppressNotFoundErrors` flag.
    *
    * @example
    *   describe('clearValue Command demo', function() {
    *     test('demo test', function() {
    *       browser.clearValue('#login input[type=text]');
    *
    *       browser.clearValue('#login input[type=text]', function(result) {
    *         console.log('clearValue result', result);
    *       });
    *
    *       // with explicit locate strategy
    *       browser.clearValue('css selector', '#login input[type=text]');
    *
    *       // with selector object - see https://nightwatchjs.org/guide#element-properties
    *       browser.clearValue({
    *         selector: '#login input[type=text]',
    *         index: 1,
    *         suppressNotFoundErrors: true
    *       });
    *
    *       browser.clearValue({
    *         selector: '#login input[type=text]',
    *         timeout: 2000 // overwrite the default timeout (in ms) to check if the element is present
    *       });
    *
    *     });
    *
    *   });
    *
    * @see https://nightwatchjs.org/api/clearValue.html
    */
  def clearValue(selector: Definition): Awaitable[this.type, Null] = js.native
  def clearValue(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def clearValue(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, Null] = js.native
  def clearValue(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Simulates a click event on the given DOM element.
    * The element is scrolled into view if it is not already pointer-interactable.
    * See the WebDriver specification for <a href="https://www.w3.org/TR/webdriver/#element-interactability" target="_blank">element interactability</a>.
    *
    * @example
    * module.exports = {
    *   demoTest() {
    *     browser.click('#main ul li a.first');
    *
    *     browser.click('#main ul li a.first', function(result) {
    *       console.log('Click result', result);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.click('css selector', '#main ul li a.first');
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.click({
    *       selector: '#main ul li a',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     });
    *
    *     browser.click({
    *       selector: '#main ul li a.first',
    *       timeout: 2000 // overwrite the default timeout (in ms) to check if the element is present
    *     });
    *   },
    *
    *   demoTestAsync: async function(browser) {
    *     const result = await browser.click('#main ul li a.first');
    *     console.log('Click result', result);
    *   }
    * }
    *
    *
    * @see https://nightwatchjs.org/api/click.html
    */
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
  
  /**
    * Drag an element to the given position or destination element.
    *
    * @example
    * module.exports = {
    *   demoTest(browser) {
    *     browser.dragAndDrop('#main', {x: 100, y:100}):
    *
    *
    *
    *  //using webElement as a destination
    *   demoTestAsync: async function(browser) {
    *     const destination = await browser.findElement('#upload');
    *     browser.dragAndDrop('#main', destination.getId());
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/dragAndDrop.html
    */
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
  def dragAndDrop(`using`: LocateStrategy, selector: Definition, destination: NightwatchElement): Awaitable[this.type, Null] = js.native
  def dragAndDrop(
    `using`: LocateStrategy,
    selector: Definition,
    destination: NightwatchElement,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def dragAndDrop(`using`: LocateStrategy, selector: Definition, destination: NightwatchPosition): Awaitable[this.type, Null] = js.native
  def dragAndDrop(
    `using`: LocateStrategy,
    selector: Definition,
    destination: NightwatchPosition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Search for an elements on the page, starting from the document root. The located element will be returned as web element JSON object (with an added .getId() convenience method).
    * First argument is the element selector, either specified as a string or as an object (with 'selector' and 'locateStrategy' properties).
    *
    * @example
    * module.exports = {
    *  'demo Test': function(browser) {
    *     const resultElement = await browser.findElement('.features-container li:first-child');
    *
    *     console.log('Element Id:', resultElement.getId());
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/findElement.html
    */
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
  
  /**
    * Search for multiple elements on the page, starting from the document root. The located elements will be returned as web element JSON objects (with an added .getId() convenience method).
    * First argument is the element selector, either specified as a string or as an object (with 'selector' and 'locateStrategy' properties).
    *
    *
    * @example
    * module.exports = {
    *  'demo Test': function(browser) {
    *     const resultElements = await browser.findElements('.features-container li');
    *
    *     resultElements.forEach(item => console.log('Element Id:', item.getId()));
    *   },
    *
    * @see https://nightwatchjs.org/api/findElements.html
    */
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
  
  /**
    * Returns the computed WAI-ARIA label of an element.
    *
    * @example
    * module.exports = {
    *   demoTest() {
    *     browser.getAccessibleName('*[name="search"]', function(result) {
    *       this.assert.equal(typeof result, 'object);
    *       this.assert.equal(result.value, 'search input');
    *     });
    *
    *     // with explicit locate strategy
    *     browser.getAccessibleName('css selector', '*[name="search"]', function(result) {
    *       console.log('getAccessibleName result', result.value);
    *     });
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.getAccessibleName({
    *       selector: '*[name="search"]',
    *       index: 1
    *     }, function(result) {
    *       console.log('getAccessibleName result', result.value);
    *     });
    *
    *     browser.getAccessibleName({
    *       selector: '*[name="search"]',
    *       timeout: 2000 // overwrite the default timeout (in ms) to check if the element is present
    *     }, function(result) {
    *       console.log('getAccessibleName result', result.value);
    *     });
    *   },
    *
    *   demoTestAsync: async function() {
    *     const result = await browser.getAccessibleName('*[name="search"]');
    *     console.log('getAccessibleName result', result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/getAccessibleName.html
    */
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
  
  /**
    * Returns the computed WAI-ARIA role of an element.
    *
    * @example
    * module.exports = {
    *   demoTest(browser) {
    *     browser.getAriaRole('*[name="search"]', function(result) {
    *       this.assert.equal(typeof result, 'object');
    *       this.assert.equal(result.value, 'combobox');
    *     });
    *
    *     // with explicit locate strategy
    *     browser.getAriaRole('css selector', '*[name="search"]', function(result) {
    *       console.log('getAriaRole result', result.value);
    *     });
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.getAriaRole({
    *       selector: '*[name="search"]',
    *       index: 1
    *     }, function(result) {
    *       console.log('getAriaRole result', result.value);
    *     });
    *
    *     browser.getAriaRole({
    *       selector: '*[name="search"]',
    *       timeout: 2000 // overwrite the default timeout (in ms) to check if the element is present
    *     }, function(result) {
    *       console.log('getAriaRole result', result.value);
    *     });
    *   },
    *
    *   demoTestAsync: async function(browser) {
    *     const result = await browser.getAriaRole('*[name="search"]');
    *     console.log('getAriaRole result', result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/getAriaRole.html
    */
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
  
  /**
    * Retrieve the value of an attribute for a given DOM element.
    *
    * @example
    * module.exports = {
    *   demoTest() {
    *     browser.getAttribute('#main ul li a.first', 'href', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.getAttribute('css selector', '#main ul li a.first', 'href', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.getAttribute({
    *       selector: '#main ul li a.first',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     }, 'href', function(result) {
    *       console.log('result', result);
    *     });
    *   },
    *
    *   demoTestAsync: async function(browser) {
    *     const result = await browser.getAttribute('#main ul li a.first', 'href');
    *     console.log('attribute', result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/getAttribute.html
    */
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
  
  /**
    * Retrieve the value of a css property for a given DOM element.
    *
    * @example
    * module.exports = {
    *   demoTest() {
    *     browser.getCssProperty('#main ul li a.first', 'display', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.getCssProperty('css selector', '#main ul li a.first', 'display', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.getCssProperty({
    *       selector: '#main ul li a.first',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     }, 'display', function(result) {
    *       console.log('result', result);
    *     });
    *   },
    *
    *   demoTestAsync: async function(browser) {
    *     const result = await browser.getCssProperty('#main ul li a.first', 'display');
    *     console.log('display', result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/getCssProperty.html
    */
  def getCssProperty(selector: Definition, cssProperty: String): Awaitable[this.type, String] = js.native
  def getCssProperty(
    selector: Definition,
    cssProperty: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  def getCssProperty(`using`: LocateStrategy, selector: Definition, cssProperty: String): Awaitable[this.type, String] = js.native
  def getCssProperty(
    `using`: LocateStrategy,
    selector: Definition,
    cssProperty: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  
  /**
    * Retrieve the value of a specified DOM property for the given element.
    * For all the available DOM element properties, consult the [Element doc at MDN](https://developer.mozilla.org/en-US/docs/Web/API/element).
    *
    * @example
    * module.exports = {
    *   demoTest(browser) {
    *     browser.getElementProperty('#login input[type=text]', 'classList', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.getElementProperty('css selector', '#login input[type=text]', 'classList', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.getElementProperty({
    *       selector: '#login input[type=text]',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     }, 'classList', function(result) {
    *       console.log('result', result);
    *     });
    *   },
    *
    *   demoTestAsync: async function(browser) {
    *     const result = await browser.getElementProperty('#login input[type=text]', 'classList');
    *     console.log('classList', result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/getElementProperty.html
    */
  def getElementProperty(selector: Definition, property: String): Awaitable[this.type, Any] = js.native
  def getElementProperty(
    selector: Definition,
    property: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
  ): Awaitable[this.type, Any] = js.native
  def getElementProperty(`using`: LocateStrategy, selector: Definition, property: String): Awaitable[this.type, Any] = js.native
  def getElementProperty(
    `using`: LocateStrategy,
    selector: Definition,
    property: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
  ): Awaitable[this.type, Any] = js.native
  
  /**
    * Determine an element's size in pixels. For W3C Webdriver compatible clients (such as GeckoDriver), this command is equivalent to `getLocation` and both return
    * the dimensions and coordinates of the given element:
    * - x: X axis position of the top-left corner of the element, in CSS pixels
    * - y: Y axis position of the top-left corner of the element, in CSS pixels
    * - height: Height of the element’s bounding rectangle in CSS pixels;
    * - width: Width of the web element’s bounding rectangle in CSS pixels.
    *
    * @example
    * module.exports = {
    *   demoTest() {
    *     browser.getElementSize('#login', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.getElementSize('css selector', '#login', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.getElementSize({
    *       selector: '#login',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     }, function(result) {
    *       console.log('result', result);
    *     });
    *   },
    *
    *   demoTestAsync: async function() {
    *     const result = await browser.getElementSize('#login');
    *     console.log('classList', result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/getElementRect.html
    */
  def getElementRect(selector: Definition): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def getElementRect(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def getElementRect(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def getElementRect(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  
  /**
    * Determine an element's size in pixels. For W3C Webdriver compatible clients (such as GeckoDriver), this command is equivalent to `getLocation` and both return
    * the dimensions and coordinates of the given element:
    * - x: X axis position of the top-left corner of the element, in CSS pixels
    * - y: Y axis position of the top-left corner of the element, in CSS pixels
    * - height: Height of the element’s bounding rectangle in CSS pixels;
    * - width: Width of the web element’s bounding rectangle in CSS pixels.
    *
    * @example
    * module.exports = {
    *   demoTest() {
    *     browser.getElementSize('#login', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.getElementSize('css selector', '#login', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.getElementSize({
    *       selector: '#login',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     }, function(result) {
    *       console.log('result', result);
    *     });
    *   },
    *
    *   demoTestAsync: async function(browser) {
    *     const result = await browser.getElementSize('#login');
    *     console.log('classList', result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/getElementSize.html
    */
  def getElementSize(selector: Definition): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def getElementSize(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def getElementSize(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def getElementSize(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  
  /**
    * Returns an element's first child. The child element will be returned as web
    * element JSON object (with an added .getId() convenience method).
    *
    *
    * @example
    * module.exports = {
    *  'demo Test': function(browser) {
    *     const resultElement = await browser.getFirstElementChild('.features-container');
    *
    *     console.log('last child element Id:', resultElement.getId());
    *   },
    *
    * @see https://nightwatchjs.org/api/getFirstElementChild.html
    */
  def getFirstElementChild(selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getFirstElementChild(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getFirstElementChild(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getFirstElementChild(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  
  /**
    * Returns an element's last child. The child element will be returned
    * as web element JSON object (with an added .getId() convenience method).
    *
    *
    * @example
    * module.exports = {
    *  'demo Test': function(browser) {
    *     const resultElement = await browser.getLastElementChild('.features-container');
    *
    *     console.log('last child element Id:', resultElement.getId());
    *   },
    *
    * @see https://nightwatchjs.org/api/getLastElementChild.html
    */
  def getLastElementChild(selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getLastElementChild(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getLastElementChild(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getLastElementChild(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  
  /**
    * Determine an element's location on the page. The point (0, 0) refers to the upper-left corner of the page. The element's coordinates are returned as a JSON object with x and y properties.
    *
    * For W3C Webdriver compatible clients (such as GeckoDriver), this command is equivalent to `getElementSize` and both return
    * the dimensions and coordinates of the given element:
    * - x: X axis position of the top-left corner of the element, in CSS pixels
    * - y: Y axis position of the top-left corner of the element, in CSS pixels
    * - height: Height of the element’s bounding rectangle in CSS pixels;
    * - width: Width of the web element’s bounding rectangle in CSS pixels.
    *
    * @example
    * module.exports = {
    *   demoTest() {
    *     browser.getLocation('#login', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.getLocation('css selector', '#login', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.getLocation({
    *       selector: '#login',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     }, function(result) {
    *       console.log('result', result);
    *     });
    *   },
    *
    *   demoTestAsync: async function(browser) {
    *     const result = await browser.getLocation('#login');
    *     console.log('location', result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/getLocation.html
    */
  def getLocation(selector: Definition): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def getLocation(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def getLocation(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def getLocation(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  
  /**
    * Determine an element's location on the screen once it has been scrolled into view. Uses `elementIdLocationInView` protocol command.
    *
    * @example
    * this.demoTest = function () {
    *   browser.getLocationInView("#main ul li a.first", function(result) {
    *     this.assert.equal(typeof result, "object");
    *     this.assert.equal(result.status, 0);
    *     this.assert.equal(result.value.x, 200);
    *     this.assert.equal(result.value.y, 200);
    *   });
    * };
    *
    * @see https://nightwatchjs.org/api/getLocationInView.html
    */
  def getLocationInView(selector: Definition): Awaitable[this.type, NightwatchPosition] = js.native
  def getLocationInView(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchPosition] = js.native
  def getLocationInView(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, NightwatchPosition] = js.native
  def getLocationInView(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchPosition] = js.native
  
  /**
    * Returns the element immediately following the specified one in their parent's childNodes.
    * The element will be returned as web element JSON object (with an added .getId() convenience method).
    *
    *
    * @example
    * module.exports = {
    *  'demo Test': function(browser) {
    *     const resultElement = await browser.getNextSibling('.features-container li:first-child');
    *
    *     console.log('next sibling element Id:', resultElement.getId());
    *   },
    *
    * @see https://nightwatchjs.org/api/getNextSibling.html
    */
  def getNextSibling(selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getNextSibling(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getNextSibling(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getNextSibling(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  
  /**
    *  Returns the element immediately preceding the specified one in its parent's child elements list.
    * The element will be returned as web element JSON object (with an added `.getId()` convenience method).
    *
    *
    * @example
    * module.exports = {
    *  'demo Test': function(browser) {
    *     const resultElement = await browser.getPreviousSibling('.features-container li:second-child');
    *
    *     console.log('previous sibling element Id:', resultElement.getId());
    *   },
    *
    * browser.getPreviousSibling('#web-button', function(result) {
    *
    *   console.log(result.value)
    * }})
    * await browser.getPreviousSibling('#web-button')
    * await browser.getPreviousSibling({selector: '#web-button', locateStrategy: 'css selector'})
    *
    * // with global element():
    * const formEl = element('form');
    * const result = await browser.getPreviousSibling(formEl)
    *
    * // with Selenium By() locators
    * // https://www.selenium.dev/selenium/docs/api/javascript/module/selenium-webdriver/index_exports_By.html
    * const locator = by.tagName('form');
    * const result = await browser.getPreviousSibling(locator)
    *
    * // with browser.findElement()
    * const formEl = await browser.findElement('form');
    * const result = await browser.getPreviousSibling(formEl)
    *
    * @see https://nightwatchjs.org/api/getPreviousSibling.html
    */
  def getPreviousSibling(selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getPreviousSibling(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getPreviousSibling(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def getPreviousSibling(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  
  /**
    * Returns the `shadowRoot` read-only property which represents the shadow root hosted by the element.
    *  This can further be used to retrieve elements part of the shadow root element.
    *
    * @example
    * describe('Shadow Root example test', function() {
    *   it('retrieve the shadowRoot', async function(browser) {
    *      await browser
    *        .navigateTo('https://mdn.github.io/web-components-examples/popup-info-box-web-component/')
    *        .waitForElementVisible('form');
    *
    *      const shadowRootEl = await browser.getShadowRoot('popup-info');
    *      const infoElement = await shadowRootEl.find('.info');
    *
    *      await expect(infoElement.property('innerHTML')).to.include('card validation code');
    *      const iconElement = await shadowRootEl.find('.icon');
    *      const firstElement = await browser.getFirstElementChild(iconElement);
    *
    *      await expect.element(firstElement).to.be.an('img');
    *    });
    * });
    *
    * @see https://nightwatchjs.org/api/getShadowRoot.html
    */
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
  def getShadowRoot(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, Element | Null] = js.native
  def getShadowRoot(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Element | Null], 
      Unit
    ]
  ): Awaitable[this.type, Element | Null] = js.native
  def getShadowRoot(`using`: LocateStrategy, selector: By): Awaitable[this.type, Element | Null] = js.native
  def getShadowRoot(
    `using`: LocateStrategy,
    selector: By,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Element | Null], 
      Unit
    ]
  ): Awaitable[this.type, Element | Null] = js.native
  def getShadowRoot(`using`: LocateStrategy, selector: WebElement): Awaitable[this.type, Element | Null] = js.native
  def getShadowRoot(
    `using`: LocateStrategy,
    selector: WebElement,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Element | Null], 
      Unit
    ]
  ): Awaitable[this.type, Element | Null] = js.native
  
  /**
    * Query for an element's tag name.
    *
    * @example
    * module.exports = {
    *   demoTest() {
    *     browser.getTagName('#login', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.getTagName('css selector', '#login', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.getTagName({
    *       selector: '#login',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     }, function(result) {
    *       console.log('result', result);
    *     });
    *   },
    *
    *   demoTestAsync: async function(browser) {
    *     const result = await browser.getTagName('#login');
    *     console.log('tagName', result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/getTagName.html
    */
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
  
  /**
    * Returns the visible text for the element.
    *
    * @example
    * module.exports = {
    *   demoTest() {
    *     browser.getText('#main ul li a.first', function(result) {
    *       this.assert.equal(typeof result, 'object);
    *       this.assert.strictEqual(result.status, 0); // only when using Selenium / JSONWire
    *       this.assert.equal(result.value, 'nightwatchjs.org');
    *     });
    *
    *     // with explicit locate strategy
    *     browser.getText('css selector', '#main ul li a.first', function(result) {
    *       console.log('getText result', result.value);
    *     });
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.getText({
    *       selector: '#main ul li a',
    *       index: 1
    *     }, function(result) {
    *       console.log('getText result', result.value);
    *     });
    *
    *     browser.getText({
    *       selector: '#main ul li a.first',
    *       timeout: 2000 // overwrite the default timeout (in ms) to check if the element is present
    *     }, function(result) {
    *       console.log('getText result', result.value);
    *     });
    *   },
    *
    *   demoTestAsync: async function() {
    *     const result = await browser.getText('#main ul li a.first');
    *     console.log('getText result', result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/getText.html
    */
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
  
  /**
    * Returns a form element current value.
    *
    * @example
    * module.exports = {
    *   demoTest() {
    *     browser.getValue('#login input[type=text]', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.getValue('css selector', '#login input[type=text]', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.getValue({
    *       selector: '#login input[type=text]',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     }, function(result) {
    *       console.log('result', result);
    *     });
    *   },
    *
    *   demoTestAsync: async function() {
    *     const result = await browser.getValue('#login input[type=text]');
    *     console.log('Value', result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/getValue.html
    */
  def getValue(selector: Definition): Awaitable[this.type, String] = js.native
  def getValue(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  def getValue(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, String] = js.native
  def getValue(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  
  /**
    * Returns true or false based on whether the DOM has any child nodes
    *
    * @example
    * module.exports = {
    *  'demo Test': function(browser) {
    *     const result = await browser.hasDescendants('.features-container');
    *
    *     console.log('true or false:', result);
    *   },
    *
    * @see https://nightwatchjs.org/api/hasDescendants.html
    */
  def hasDescendants(selector: Definition): Awaitable[this.type, Boolean] = js.native
  def hasDescendants(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def hasDescendants(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, Boolean] = js.native
  def hasDescendants(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  
  /**
    *
    * Determines if an element is enabled, as indicated by the 'disabled' attribute.
    *
    * @example
    * module.exports = {
    *   demoTest(browser) {
    *     browser.isEnabled('#main select option.first', function(result) {
    *       this.assert.equal(typeof result, "object");
    *       this.assert.equal(result.status, 0);
    *       this.assert.equal(result.value, true);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.isEnabled('css selector', '#main select option.first');
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.isEnabled({
    *       selector: '#main ul li a',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     });
    *
    *     browser.isEnabled({
    *       selector: '#main select option.first',
    *       timeout: 2000 // overwrite the default timeout (in ms) to check if the element is present
    *     });
    *   },
    *
    *   demoTestAsync: async function(browser) {
    *     const result = await browser.isEnabled('#main select option.first');
    *     console.log('isVisible result', result);
    *   }
    * }
    * @see https://nightwatchjs.org/api/isEnabled.html
    */
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
  
  /**
    * Determines if an element is present in the DOM.
    *
    * @example
    * module.exports = {
    *   demoTest(browser) {
    *     browser.isPresent('#main ul li a.first', function(result) {
    *       this.assert.equal(typeof result, "object");
    *       this.assert.equal(result.status, 0);
    *       this.assert.equal(result.value, true);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.isPresent('css selector', '#main ul li a.first');
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.isPresent({
    *       selector: '#main ul li a',
    *       index: 1,
    *     });
    *
    *     browser.isPresent({
    *       selector: '#main ul li a.first',
    *       timeout: 2000 // overwrite the default timeout (in ms) to check if the element is present
    *     });
    *   },
    *
    *   demoTestAsync: async function(browser) {
    *     const result = await browser.isPresent('#main ul li a.first');
    *     console.log('isPresent result', result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/isPresent.html
    */
  def isPresent(selector: Definition): Awaitable[this.type, Boolean] = js.native
  def isPresent(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def isPresent(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, Boolean] = js.native
  def isPresent(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  
  /**
    *
    * Determines if an element is selected.
    *
    * @example
    * module.exports = {
    *   demoTest(browser) {
    *     browser.isSelected('#main select option.first', function(result) {
    *       this.assert.equal(typeof result, "object");
    *       this.assert.equal(result.status, 0);
    *       this.assert.equal(result.value, true);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.isSelected('css selector', '#main select option.first');
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.isSelected({
    *       selector: '#main ul li a',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     });
    *
    *     browser.isSelected({
    *       selector: '#main select option.first',
    *       timeout: 2000 // overwrite the default timeout (in ms) to check if the element is present
    *     });
    *   },
    *
    *   demoTestAsync: async function(browser) {
    *     const result = await browser.isSelected('#main select option.first');
    *     console.log('isVisible result', result);
    *   }
    * }
    * @see https://nightwatchjs.org/api/isSelected.html
    */
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
  
  /**
    * Determine if an element is currently displayed.
    *
    * @example
    * module.exports = {
    *   demoTest() {
    *     browser.isVisible('#main ul li a.first', function(result) {
    *       this.assert.equal(typeof result, "object");
    *       this.assert.equal(result.status, 0);
    *       this.assert.equal(result.value, true);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.isVisible('css selector', '#main ul li a.first');
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.isVisible({
    *       selector: '#main ul li a',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     });
    *
    *     browser.isVisible({
    *       selector: '#main ul li a.first',
    *       timeout: 2000 // overwrite the default timeout (in ms) to check if the element is present
    *     });
    *   },
    *
    *   demoTestAsync: async function() {
    *     const result = await browser.isVisible('#main ul li a.first');
    *     console.log('isVisible result', result);
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/isVisible.html
    */
  def isVisible(selector: Definition): Awaitable[this.type, Boolean] = js.native
  def isVisible(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def isVisible(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, Boolean] = js.native
  def isVisible(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  
  /**
    * Move the mouse by an offset of the specified element. If an element is provided but no offset, the mouse will be moved to the center of the element.
    * If the element is not visible, it will be scrolled into view.
    *
    * @example
    * this.demoTest = function () {
    *   browser.moveToElement('#main', 10, 10);
    * };
    *
    * @see https://nightwatchjs.org/api/moveToElement.html
    */
  def moveToElement(selector: Definition, xoffset: Double, yoffset: Double): Awaitable[this.type, Null] = js.native
  def moveToElement(
    selector: Definition,
    xoffset: Double,
    yoffset: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def moveToElement(`using`: LocateStrategy, selector: Definition, xoffset: Double, yoffset: Double): Awaitable[this.type, Null] = js.native
  def moveToElement(
    `using`: LocateStrategy,
    selector: Definition,
    xoffset: Double,
    yoffset: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Types a key sequence on the DOM element. Can be used to send a sequence of key strokes to an element.
    * Any UTF-8 character may be specified.
    *
    * **sendKeys** does not clear the existing value of the element. To do so, use **setValue()** instead.
    *
    * An object map with available keys and their respective UTF-8 characters,
    * as defined on [W3C WebDriver draft spec](https://www.w3.org/TR/webdriver/#character-types),
    * is loaded onto the main Nightwatch instance as `browser.Keys`.
    *
    * @example
    * // send some simple text to an input
    * this.demoTest = function () {
    *   browser.sendKeys('input[type=text]', 'nightwatch');
    * };
    * //
    * // send some text to an input and hit enter.
    * this.demoTest = function () {
    *   browser.sendKeys('input[type=text]', ['nightwatch', browser.Keys.ENTER]);
    * };
    *
    * @see https://nightwatchjs.org/api/sendKeys.html
    */
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
  
  /**
    *
    * Set the value of a specified DOM attribute for the given element.
    * For all the available DOM attributes, consult the [Element doc at MDN](https://developer.mozilla.org/en-US/docs/Web/API/element).
    *
    * @example
    * module.exports = {
    *   demoTest(browser) {
    *     browser.setAttribute('#login input[type=text]', 'disabled', 'true', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with explicit locate strategy
    *     browser.setAttribute('css selector', '#login input[type=text]', 'disabled', 'true', function(result) {
    *       console.log('result', result);
    *     });
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.setAttribute({
    *       selector: '#login input[type=text]',
    *       index: 1,
    *       suppressNotFoundErrors: true
    *     }, 'disabled', 'true', function(result) {
    *       console.log('result', result);
    *     });
    *   },
    *
    *   demoTestAsync: async function(browser) {
    *     await browser.setAttribute('#login input[type=text]', 'disabled', 'true');
    *   }
    * }
    * @see https://nightwatchjs.org/api/setAttribute.html
    */
  def setAttribute(selector: Definition, attribute: String, value: String): Awaitable[this.type, Boolean] = js.native
  def setAttribute(
    selector: Definition,
    attribute: String,
    value: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def setAttribute(`using`: LocateStrategy, selector: Definition, attribute: String, value: String): Awaitable[this.type, Boolean] = js.native
  def setAttribute(
    `using`: LocateStrategy,
    selector: Definition,
    attribute: String,
    value: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  
  /**
    *
    * An alias of "setValue" command, but hides the content from the nightwatch logs.
    *
    * <div class="alert alert-warning"><strong>setValue/setPassword</strong> do not clear
    * the existing value of the element. To do so, use the <strong>clearValue()</strong> command.</div>
    *
    * An object map with available keys and their respective UTF-8 characters,
    *  as defined on [W3C WebDriver draft spec](https://www.w3.org/TR/webdriver/#character-types), is loaded onto the main Nightwatch instance as `browser.Keys`.
    *
    * @example
    * // send some simple text to an input
    * this.demoTest = function (browser) {
    *   browser.setPassword('input[type=text]', 'nightwatch');
    * };
    * //
    * // send some text to an input and hit enter.
    * this.demoTest = function (browser) {
    *   browser.setPassword('input[type=text]', ['nightwatch', browser.Keys.ENTER]);
    * };
    *
    */
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
  def setPassword(`using`: LocateStrategy, selector: Definition, inputValue: String): Awaitable[this.type, Null] = js.native
  def setPassword(
    `using`: LocateStrategy,
    selector: Definition,
    inputValue: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def setPassword(`using`: LocateStrategy, selector: Definition, inputValue: js.Array[String]): Awaitable[this.type, Null] = js.native
  def setPassword(
    `using`: LocateStrategy,
    selector: Definition,
    inputValue: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Sends some text to an element. Can be used to set the value of a form element or to send a sequence of key strokes to an element. Any UTF-8 character may be specified.
    *
    * From Nightwatch v2, **setValue** also clears the existing value of the element by calling the **clearValue()** beforehand.
    *
    * An object map with available keys and their respective UTF-8 characters, as defined on [W3C WebDriver draft spec](https://www.w3.org/TR/webdriver/#character-types),
    * is loaded onto the main Nightwatch instance as `browser.Keys`.
    *
    * @example
    * // send some simple text to an input
    * this.demoTest = function () {
    *   browser.setValue('input[type=text]', 'nightwatch');
    * };
    * //
    * // send some text to an input and hit enter.
    * this.demoTest = function () {
    *   browser.setValue('input[type=text]', ['nightwatch', browser.Keys.ENTER]);
    * };
    *
    * @see https://nightwatchjs.org/api/setValue.html
    */
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
  def setValue(`using`: LocateStrategy, selector: Definition, inputValue: String): Awaitable[this.type, Null] = js.native
  def setValue(
    `using`: LocateStrategy,
    selector: Definition,
    inputValue: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def setValue(`using`: LocateStrategy, selector: Definition, inputValue: js.Array[String]): Awaitable[this.type, Null] = js.native
  def setValue(
    `using`: LocateStrategy,
    selector: Definition,
    inputValue: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Submit a FORM element. The submit command may also be applied to any element that is a descendant of a FORM element. Uses `submit` protocol command.
    *
    * @example
    * this.demoTest = function () {
    *   browser.submitForm('form.login');
    * };
    *
    * @see https://nightwatchjs.org/api/submitForm.html
    */
  def submitForm(selector: Definition): Awaitable[this.type, Null] = js.native
  def submitForm(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def submitForm(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, Null] = js.native
  def submitForm(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    *
    * Take a screenshot of the visible region encompassed by this element's bounding rectangle.
    *
    * @example
    * module.exports = {
    *   demoTest(browser) {
    *     browser.takeElementScreenshot('#main', function (imageData, err) {
    *       require('fs').writeFile('out.png', imageData.value, 'base64', function (err) {
    *         console.log(err);
    *       });
    *     });
    *
    *     // with explicit locate strategy
    *     browser.takeElementScreenshot('css selector', '#main', function(imageData, err) {
    *       require('fs').writeFile('out.png', imageData.value, 'base64', function (err) {
    *         console.log(err);
    *       });
    *     });
    *
    *     // with selector object - see https://nightwatchjs.org/guide#element-properties
    *     browser.takeElementScreenshot({
    *       selector: '#main ul li a',
    *       index: 1
    *     }, function(imageData, err) {
    *       require('fs').writeFile('out.png', imageData.value, 'base64', function (err) {
    *         console.log(err);
    *       });
    *     });
    *   },
    *
    *   demoTestAsync: async function(browser) {
    *     const data = await browser.takeElementScreenshot('#main');
    *     require('fs').writeFile('out.png', data, 'base64');
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/takeElementScreenshot.html
    */
  def takeElementScreenshot(selector: Definition): Awaitable[this.type, String] = js.native
  def takeElementScreenshot(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  def takeElementScreenshot(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, String] = js.native
  def takeElementScreenshot(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  
  /**
    * Sends some text to an element. Can be used to set the value of a form element or
    *  to send a sequence of key strokes to an element. Any UTF-8 character may be specified.
    *
    * <div class="alert alert-warning"><strong>updateValue</strong> is equivalent
    * with <strong>setValue</strong> and <strong>sendKeys</strong> with the exception
    * that it clears the value beforehand.</div>
    *
    * An object map with available keys and their respective UTF-8 characters,
    * as defined on [W3C WebDriver draft spec](https://www.w3.org/TR/webdriver/#character-types),
    * is loaded onto the main Nightwatch instance as `browser.Keys`.
    *
    * @example
    * // send some simple text to an input
    * this.demoTest = function (browser) {
    *   browser.updateValue('input[type=text]', 'nightwatch');
    * };
    *
    * // send some text to an input and hit enter.
    * this.demoTest = function (browser) {
    *   browser.updateValue('input[type=text]', ['nightwatch', browser.Keys.ENTER]);
    * };
    *
    * @see https://nightwatchjs.org/api/updateValue.html
    */
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
  def updateValue(`using`: LocateStrategy, selector: Definition, inputValue: String): Awaitable[this.type, Null] = js.native
  def updateValue(
    `using`: LocateStrategy,
    selector: Definition,
    inputValue: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def updateValue(`using`: LocateStrategy, selector: Definition, inputValue: js.Array[String]): Awaitable[this.type, Null] = js.native
  def updateValue(
    `using`: LocateStrategy,
    selector: Definition,
    inputValue: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    *
    * Uploads file to an element using absolute file path.
    *
    *
    * @example
    * // send a file to for upload to a field.
    * this.demoTest = function (browser) {
    *   browser.uploadFile('#myFile', '/path/file.pdf');
    * };
    *
    *
    * @see https://nightwatchjs.org/api/uploadFile.html
    */
  def uploadFile(selector: Definition, filePath: String): Awaitable[this.type, Null] = js.native
  def uploadFile(
    selector: Definition,
    filePath: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def uploadFile(`using`: LocateStrategy, selector: Definition, filePath: String): Awaitable[this.type, Null] = js.native
  def uploadFile(
    `using`: LocateStrategy,
    selector: Definition,
    filePath: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Opposite of `waitForElementPresent`. Waits a given time in milliseconds (default 5000ms)
    * for an element to be not present (i.e. removed) in the page before performing
    * any other commands or assertions.
    * If the element is still present after the specified amount of time, the test fails.
    *
    * You can change the polling interval by defining a `waitForConditionPollInterval` property (in milliseconds) in as a global property in your `nightwatch.json` or in your external globals file.
    * Similarly, a default timeout can be specified as a global `waitForConditionTimeout` property (in milliseconds).
    *
    * @example
    * module.exports = {
    *  'demo Test': function() {
    *     // with default implicit timeout of 5000ms (can be overwritten in settings under 'globals.waitForConditionTimeout')
    *     browser.waitForElementNotPresent('#dialog');
    *
    *     // specify the locate strategy (css selector/xpath) as the first argument
    *     browser.waitForElementNotPresent('css selector', '#dialog');
    *
    *     // with explicit timeout (in milliseconds)
    *     browser.waitForElementNotPresent('#dialog', 1000);
    *
    *     // continue if failed
    *     browser.waitForElementNotPresent('#dialog', 1000, false);
    *
    *     // with callback
    *     browser.waitForElementNotPresent('#dialog', 1000, function() {
    *       // do something while we're here
    *     });
    *
    *     // with custom output message - the locate strategy is required
    *     browser.waitForElementNotPresent('css selector', '#dialog', 'The dialog container is removed.');
    *
    *     // with custom Spanish message
    *     browser.waitForElementNotPresent('#dialog', 1000, 'elemento %s no era presente en %d ms');
    *
    *     // many combinations possible - the message is always the last argument
    *     browser.waitForElementNotPresent('#dialog', 1000, false, function() {}, 'elemento %s no era presente en %d ms');
    *   },
    *
    *   'demo Test with selector objects': function() {
    *      browser.waitForElementNotPresent({
    *        selector: '#dialog',
    *        timeout: 1000
    *      });
    *
    *      browser.waitForElementNotPresent({
    *        selector: '#dialog',
    *        locateStrategy: 'css selector'
    *      }, 'Custom output message');
    *
    *      browser.waitForElementNotPresent({
    *        selector: '.container',
    *        index: 2,
    *        retryInterval: 100,
    *        abortOnFailure: true
    *      });
    *   }
    *
    *   'page object demo Test': function () {
    *      var nightwatch = browser.page.nightwatch();
    *      nightwatch
    *        .navigate()
    *        .assert.titleContains('Nightwatch.js');
    *
    *      nightwatch.api.waitForElementNotPresent('@dialogContainer', function(result) {
    *        console.log(result);
    *      });
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/waitForElementNotPresent.html
    * @since v0.4.0
    */
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
  def waitForElementNotPresent(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(`using`: LocateStrategy, selector: Definition, time: Double): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(`using`: LocateStrategy, selector: Definition, time: Double, poll: Double): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(`using`: LocateStrategy, selector: Definition, time: Double, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(`using`: LocateStrategy, selector: Definition, time: Double, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(`using`: LocateStrategy, selector: Definition, time: Unit, poll: Double): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(`using`: LocateStrategy, selector: Definition, time: Unit, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(`using`: LocateStrategy, selector: Definition, time: Unit, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementNotPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  
  /**
    * Opposite of `waitForElementVisible`. Waits a given time in milliseconds (default 5000ms)
    * for an element to be not visible (i.e. hidden but existing) in the page before
    * performing any other commands or assertions.
    * If the element fails to be hidden in the specified amount of time, the test fails.
    *
    * You can change the polling interval by defining a `waitForConditionPollInterval` property (in milliseconds) in as a global property in your `nightwatch.json` or in your external globals file.
    * Similarly, a default timeout can be specified as a global `waitForConditionTimeout` property (in milliseconds).
    *
    * @example
    * module.exports = {
    *  'demo Test': function() {
    *     // with default implicit timeout of 5000ms (can be overwritten in settings under 'globals.waitForConditionTimeout')
    *     browser.waitForElementNotVisible('#dialog');
    *
    *     // specify the locate strategy (css selector/xpath) as the first argument
    *     browser.waitForElementNotVisible('css selector', '#dialog');
    *
    *     // with explicit timeout (in milliseconds)
    *     browser.waitForElementNotVisible('#dialog', 1000);
    *
    *     // continue if failed
    *     browser.waitForElementNotVisible('#dialog', 1000, false);
    *
    *     // with callback
    *     browser.waitForElementNotVisible('#dialog', 1000, function() {
    *       // do something while we're here
    *     });
    *
    *     // with custom output message - the locate strategy is required
    *     browser.waitForElementNotVisible('css selector', '#dialog', 'The dialog container is not visible.');
    *
    *     // with custom Spanish message
    *     browser.waitForElementNotVisible('#dialog', 1000, 'elemento %s no era visible en %d ms');
    *
    *     // many combinations possible - the message is always the last argument
    *     browser.waitForElementNotVisible('#dialog', 1000, false, function() {}, 'elemento %s no era visible en %d ms');
    *   },
    *
    *   'demo Test with selector objects': function() {
    *      browser.waitForElementNotVisible({
    *        selector: '#dialog',
    *        timeout: 1000
    *      });
    *
    *      browser.waitForElementNotVisible({
    *        selector: '#dialog',
    *        locateStrategy: 'css selector'
    *      }, 'Custom output message');
    *
    *      browser.waitForElementNotVisible({
    *        selector: '.container',
    *        index: 2,
    *        retryInterval: 100,
    *        abortOnFailure: true
    *      });
    *   }
    *
    *   'page object demo Test': function () {
    *      var nightwatch = browser.page.nightwatch();
    *      nightwatch
    *        .navigate()
    *        .assert.titleContains('Nightwatch.js');
    *
    *      nightwatch.api.waitForElementNotVisible('@mainDialog', function(result) {
    *        console.log(result);
    *      });
    *   }
    * }
    *
    * @since v0.4.0
    * @see https://nightwatchjs.org/api/waitForElementNotVisible.html
    */
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
  def waitForElementNotVisible(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(`using`: LocateStrategy, selector: Definition, time: Double): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(`using`: LocateStrategy, selector: Definition, time: Double, poll: Double): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(`using`: LocateStrategy, selector: Definition, time: Double, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(`using`: LocateStrategy, selector: Definition, time: Double, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(`using`: LocateStrategy, selector: Definition, time: Unit, poll: Double): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(`using`: LocateStrategy, selector: Definition, time: Unit, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(`using`: LocateStrategy, selector: Definition, time: Unit, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementNotVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  
  /**
    * Waits a given time in milliseconds (default 5000ms) for an element to be present in the page before performing any other commands or assertions.
    * If the element fails to be present in the specified amount of time, the test fails. You can change this by setting `abortOnFailure` to `false`.
    *
    * You can change the polling interval by defining a `waitForConditionPollInterval` property (in milliseconds) in as a global property in your `nightwatch.json` or in your external globals file.
    * Similarly, the default timeout can be specified as a global `waitForConditionTimeout` property (in milliseconds).
    *
    * @example
    * module.exports = {
    *  'demo Test': function() {
    *     // with default implicit timeout of 5000ms (can be overwritten in settings under 'globals.waitForConditionTimeout')
    *     browser.waitForElementPresent('#index-container');
    *
    *     // specify the locate strategy (css selector/xpath) as the first argument
    *     browser.waitForElementPresent('css selector', '#index-container');
    *
    *     // with explicit timeout (in milliseconds)
    *     browser.waitForElementPresent('#index-container', 1000);
    *
    *     // continue if failed
    *     browser.waitForElementPresent('#index-container', 1000, false);
    *
    *     // with callback
    *     browser.waitForElementPresent('#index-container', 1000, function() {
    *       // do something while we're here
    *     });
    *
    *     // with custom output message - the locate strategy is required
    *     browser.waitForElementPresent('css selector', '#index-container', 'The index container is found.');
    *
    *     // with custom Spanish message
    *     browser.waitForElementPresent('#index-container', 1000, 'elemento %s no era presente en %d ms');
    *
    *     // many combinations possible - the message is always the last argument
    *     browser.waitForElementPresent('#index-container', 1000, false, function() {}, 'elemento %s no era presente en %d ms');
    *   },
    *
    *   'demo Test with selector objects': function() {
    *      browser.waitForElementPresent({
    *        selector: '#index-container',
    *        timeout: 1000
    *      });
    *
    *      browser.waitForElementPresent({
    *        selector: '#index-container',
    *        locateStrategy: 'css selector'
    *      }, 'Custom output message');
    *
    *      browser.waitForElementPresent({
    *        selector: '.container',
    *        index: 2,
    *        retryInterval: 100,
    *        abortOnFailure: true
    *      });
    *   }
    *
    *   'page object demo Test': function () {
    *      var nightwatch = browser.page.nightwatch();
    *      nightwatch
    *        .navigate()
    *        .assert.titleContains('Nightwatch.js');
    *
    *      nightwatch.api.waitForElementPresent('@featuresList', function(result) {
    *        console.log(result);
    *      });
    *   }
    * }
    *
    * @see https://nightwatchjs.org/api/waitForElementPresent.html
    */
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
  def waitForElementPresent(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(`using`: LocateStrategy, selector: Definition, time: Double): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(`using`: LocateStrategy, selector: Definition, time: Double, poll: Double): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(`using`: LocateStrategy, selector: Definition, time: Double, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(`using`: LocateStrategy, selector: Definition, time: Double, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(`using`: LocateStrategy, selector: Definition, time: Unit, poll: Double): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(`using`: LocateStrategy, selector: Definition, time: Unit, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(`using`: LocateStrategy, selector: Definition, time: Unit, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  def waitForElementPresent(
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
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
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, js.Array[ElementResult]] = js.native
  
  /**
    * Waits a given time in milliseconds for an element to be visible in the page before performing any other commands or assertions.
    *
    * If the element fails to be present and visible in the specified amount of time, the test fails. You can change this by setting `abortOnFailure` to `false`.
    *
    * You can change the polling interval by defining a `waitForConditionPollInterval` property (in milliseconds) in as a global property in your `nightwatch.json` or in your external globals file.
    *
    * Similarly, a default timeout can be specified as a global `waitForConditionTimeout` property (in milliseconds).
    *
    * @example
    * this.demoTest = function (browser) {
    *   browser.waitForElementVisible('body', 1000);
    *   // continue if failed
    *   browser.waitForElementVisible('body', 1000, false);
    *   // with callback
    *   browser.waitForElementVisible('body', 1000, function() {
    *     // do something while we're here
    *   });
    *   // custom Spanish message
    *   browser.waitForElementVisible('body', 1000, 'elemento %s no era visible en %d ms');
    *   // many combinations possible - the message is always the last argument
    *   browser.waitForElementVisible('body', 1000, false, function() {}, 'elemento %s no era visible en %d ms');
    * };
    *
    * @see https://nightwatchjs.org/api/waitForElementVisible.html
    */
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
  def waitForElementVisible(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(`using`: LocateStrategy, selector: Definition, time: Double): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(`using`: LocateStrategy, selector: Definition, time: Double, poll: Double): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(`using`: LocateStrategy, selector: Definition, time: Double, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(`using`: LocateStrategy, selector: Definition, time: Double, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Double,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(`using`: LocateStrategy, selector: Definition, time: Unit, poll: Double): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(`using`: LocateStrategy, selector: Definition, time: Unit, poll: Double, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Double,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(`using`: LocateStrategy, selector: Definition, time: Unit, poll: Unit, abortOnFailure: Boolean): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Boolean,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit],
    message: String
  ): Awaitable[this.type, Boolean] = js.native
  def waitForElementVisible(
    `using`: LocateStrategy,
    selector: Definition,
    time: Unit,
    poll: Unit,
    abortOnFailure: Unit,
    callback: Unit,
    message: String
  ): Awaitable[this.type, Boolean] = js.native
}
