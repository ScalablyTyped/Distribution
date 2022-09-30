package typings.nightwatch.mod

import typings.nightwatch.anon.AwaitableNightwatchAPINigAcceptAlert
import typings.nightwatch.anon.AwaitableNightwatchAPINigActions
import typings.nightwatch.anon.AwaitableNightwatchAPINigAssert
import typings.nightwatch.anon.AwaitableNightwatchAPINigAxeInject
import typings.nightwatch.anon.AwaitableNightwatchAPINigAxeRun
import typings.nightwatch.anon.AwaitableNightwatchAPINigBack
import typings.nightwatch.anon.AwaitableNightwatchAPINigBaseUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchCommonAssertions extends StObject {
  
  var NightwatchAssertionsError: typings.nightwatch.mod.NightwatchAssertionsError = js.native
  
  /**
    * Checks if the given attribute of an element contains the expected value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.attributeContains('#someElement', 'href', 'google.com');
    *    };
    * ```
    */
  def attributeContains(selector: Definition, attribute: String, expected: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def attributeContains(selector: Definition, attribute: String, expected: String, message: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the given attribute of an element has the expected value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.attributeEquals('body', 'data-attr', 'some value');
    *    };
    * ```
    */
  def attributeEquals(selector: Definition, attribute: String, expected: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def attributeEquals(selector: Definition, attribute: String, expected: String, message: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Check if an element's attribute value matches a regular expression.
    *
    * @example
    *
    * ```
    *    this.demoTest = function (browser) {
    *      browser.assert.attributeMatches('body', 'data-attr', '(value)');
    *    };
    * ```
    *
    */
  def attributeMatches(selector: Definition, attribute: String, regex: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def attributeMatches(selector: Definition, attribute: String, regex: String, msg: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def attributeMatches(selector: Definition, attribute: String, regex: js.RegExp): AwaitableNightwatchAPINigAcceptAlert = js.native
  def attributeMatches(selector: Definition, attribute: String, regex: js.RegExp, msg: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the given element contains the specified text.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.containsText('#main', 'The Night Watch');
    *    };
    * ```
    *
    * @deprecated In favour of `assert.textContains()`.
    */
  def containsText(selector: Definition, expectedText: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def containsText(selector: Definition, expectedText: String, message: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the given element does not have the specified CSS class.
    *
    * ```
    *    this.demoTest = function (browser) {
    *      browser.assert.cssClassNotPresent('#main', 'container');
    *    };
    * ```
    *
    * @deprecated In favour of `assert.not.hasClass()`.
    */
  def cssClassNotPresent(selector: Definition, className: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def cssClassNotPresent(selector: Definition, className: String, msg: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the given element has the specified CSS class.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.cssClassPresent('#main', 'container');
    *    };
    * ```
    *
    * @deprecated In favour of `assert.hasClass()`.
    */
  def cssClassPresent(selector: Definition, className: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def cssClassPresent(selector: Definition, className: String, message: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the specified css property of a given element has the expected value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.cssProperty('#main', 'display', 'block');
    *    };
    * ```
    */
  def cssProperty(selector: Definition, cssProperty: String, expected: String): AwaitableNightwatchAPINigActions = js.native
  def cssProperty(selector: Definition, cssProperty: String, expected: String, msg: String): AwaitableNightwatchAPINigActions = js.native
  def cssProperty(selector: Definition, cssProperty: String, expected: Double): AwaitableNightwatchAPINigActions = js.native
  def cssProperty(selector: Definition, cssProperty: String, expected: Double, msg: String): AwaitableNightwatchAPINigActions = js.native
  
  /**
    * Checks if the specified DOM property of a given element has the expected value.
    * For all the available DOM element properties, consult the [Element doc at MDN](https://developer.mozilla.org/en-US/docs/Web/API/element).
    * Several properties can be specified (either as an array or command-separated list). Nightwatch will check each one for presence.
    */
  def domPropertyContains(selector: Definition, domProperty: String, expected: String): AwaitableNightwatchAPINigAssert = js.native
  def domPropertyContains(selector: Definition, domProperty: String, expected: String, msg: String): AwaitableNightwatchAPINigAssert = js.native
  def domPropertyContains(selector: Definition, domProperty: String, expected: Double): AwaitableNightwatchAPINigAssert = js.native
  def domPropertyContains(selector: Definition, domProperty: String, expected: Double, msg: String): AwaitableNightwatchAPINigAssert = js.native
  
  /**
    * Checks if the specified DOM property of a given element has the expected value.
    * For all the available DOM element properties, consult the [Element doc at MDN](https://developer.mozilla.org/en-US/docs/Web/API/element).
    * If the result value is JSON object or array, a deep equality comparison will be performed.
    */
  def domPropertyEquals(selector: Definition, domProperty: String, expected: String): AwaitableNightwatchAPINigAssert = js.native
  def domPropertyEquals(selector: Definition, domProperty: String, expected: String, msg: String): AwaitableNightwatchAPINigAssert = js.native
  def domPropertyEquals(selector: Definition, domProperty: String, expected: Double): AwaitableNightwatchAPINigAssert = js.native
  def domPropertyEquals(selector: Definition, domProperty: String, expected: Double, msg: String): AwaitableNightwatchAPINigAssert = js.native
  
  /**
    * Check if specified DOM property value of a given element matches a regex.
    * For all the available DOM element properties, consult the [Element doc at MDN](https://developer.mozilla.org/en-US/docs/Web/API/element).
    */
  def domPropertyMatches(selector: Definition, domProperty: String, expected: String): AwaitableNightwatchAPINigAssert = js.native
  def domPropertyMatches(selector: Definition, domProperty: String, expected: String, msg: String): AwaitableNightwatchAPINigAssert = js.native
  def domPropertyMatches(selector: Definition, domProperty: String, expected: js.RegExp): AwaitableNightwatchAPINigAssert = js.native
  def domPropertyMatches(selector: Definition, domProperty: String, expected: js.RegExp, msg: String): AwaitableNightwatchAPINigAssert = js.native
  
  /**
    * Checks if the given element does not exists in the DOM.
    *
    * @example
    * ```
    *    this.demoTest = function (browser) {
    *      browser.assert.elementNotPresent(".should_not_exist");
    *    };
    * ```
    *
    * @deprecated In favour of `assert.not.elementPresent()`.
    */
  def elementNotPresent(selector: Definition): AwaitableNightwatchAPINigBaseUrl = js.native
  def elementNotPresent(selector: Definition, msg: String): AwaitableNightwatchAPINigBaseUrl = js.native
  
  /**
    * Checks if the given element exists in the DOM.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.elementPresent("#main");
    *    };
    * ```
    */
  def elementPresent(selector: Definition): AwaitableNightwatchAPINigBaseUrl = js.native
  def elementPresent(selector: Definition, msg: String): AwaitableNightwatchAPINigBaseUrl = js.native
  
  /**
    * Checks if the number of elements specified by a selector is equal to a given value.
    *
    * @example
    *
    * this.demoTest = function (browser) {
    *   browser.assert.elementsCount('div', 10);
    *   browser.assert.not.elementsCount('div', 10);
    * }
    *
    */
  def elementsCount(selector: Definition, count: Double): AwaitableNightwatchAPINigBack = js.native
  def elementsCount(selector: Definition, count: Double, msg: String): AwaitableNightwatchAPINigBack = js.native
  
  /**
    * Checks if the given element is enabled (as indicated by the 'disabled' attribute).
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.assert.enabled('.should_be_enabled');
    *    browser.assert.enabled({selector: '.should_be_enabled'});
    *    browser.assert.enabled({selector: '.should_be_enabled', suppressNotFoundErrors: true});
    *  };
    */
  def enabled(selector: Definition): AwaitableNightwatchAPINigAxeInject = js.native
  def enabled(selector: Definition, message: String): AwaitableNightwatchAPINigAxeInject = js.native
  
  /**
    * Checks if the given element contains the specified DOM attribute.
    *
    * Equivalent of: https://developer.mozilla.org/en-US/docs/Web/API/Element/hasAttribute
    *
    * @example
    *
    * ```
    *    this.demoTest = function (browser) {
    *      browser.assert.hasAttribute('#main', 'data-track');
    *    };
    * ```
    *
    */
  def hasAttribute(selector: Definition, expectedAttribute: String): AwaitableNightwatchAPINigAxeRun = js.native
  def hasAttribute(selector: Definition, expectedAttribute: String, msg: String): AwaitableNightwatchAPINigAxeRun = js.native
  
  /**
    * Checks if the given element has the specified CSS class.
    *
    * @example
    *
    *
    * ```
    *    this.demoTest = function (browser) {
    *      browser.assert.hasClass('#main', 'container');
    *      browser.assert.hasClass('#main', ['visible', 'container']);
    *      browser.assert.hasClass('#main', 'visible container');
    *    };
    * ```
    *
    */
  def hasClass(selector: Definition, className: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def hasClass(selector: Definition, className: String, msg: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def hasClass(selector: Definition, className: js.Array[String]): AwaitableNightwatchAPINigAcceptAlert = js.native
  def hasClass(selector: Definition, className: js.Array[String], msg: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the given element is not visible on the page.
    *
    * @example
    * ```
    *    this.demoTest = function (browser) {
    *      browser.assert.hidden('.should_not_be_visible');
    *    };
    * ```
    *
    * @deprecated In favour of `assert.not.visible()`.
    */
  def hidden(selector: Definition): AwaitableNightwatchAPINigAxeInject = js.native
  def hidden(selector: Definition, msg: String): AwaitableNightwatchAPINigAxeInject = js.native
  
  /**
    * Checks if the given element is selected.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.assert.selected('.should_be_selected');
    *    browser.assert.selected({selector: '.should_be_selected'});
    *    browser.assert.selected({selector: '.should_be_selected', suppressNotFoundErrors: true});
    *  };
    */
  def selected(selector: Definition): AwaitableNightwatchAPINigAxeInject = js.native
  def selected(selector: Definition, message: String): AwaitableNightwatchAPINigAxeInject = js.native
  
  /**
    * Checks if the given element contains the specified text.
    *
    * @example
    * ```
    *   this.demoTest = function (browser) {
    *     browser.assert.textContains('#main', 'The Night Watch');
    *   };
    * ```
    *
    */
  def textContains(selector: Definition, expectedText: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def textContains(selector: Definition, expectedText: String, msg: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Check if an element's inner text equals the expected text.
    *
    * @example
    *
    * ```
    *   this.demoTest = function (browser) {
    *     browser.assert.textEquals('#main', 'The Night Watch');
    *   };
    * ```
    *
    */
  def textEquals(selector: Definition, expectedText: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def textEquals(selector: Definition, expectedText: String, msg: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Check if an elements inner text matches a regular expression.
    *
    * @example
    *
    * ```
    *   this.demoTest = function (browser) {
    *     browser.assert.textMatches('#main', '^Nightwatch');
    *   };
    * ```
    *
    */
  def textMatches(selector: Definition, regex: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def textMatches(selector: Definition, regex: String, msg: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def textMatches(selector: Definition, regex: js.RegExp): AwaitableNightwatchAPINigAcceptAlert = js.native
  def textMatches(selector: Definition, regex: js.RegExp, msg: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the page title equals the given value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.title("Nightwatch.js");
    *    };
    * ```
    *
    * @deprecated In favour of `titleEquals()`.
    */
  def title(expected: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def title(expected: String, message: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the page title equals the given value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.title("Nightwatch.js");
    *    };
    * ```
    */
  def titleContains(expected: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def titleContains(expected: String, message: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the page title equals the given value.
    * @since 2.0
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.titleEquals("Nightwatch.js");
    *    };
    * ```
    */
  def titleEquals(expected: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def titleEquals(expected: String, message: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the current title matches a regular expression.
    *
    * @example
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.titleMatches('^Nightwatch');
    *    };
    * ```
    *
    */
  def titleMatches(regex: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def titleMatches(regex: String, msg: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def titleMatches(regex: js.RegExp): AwaitableNightwatchAPINigAcceptAlert = js.native
  def titleMatches(regex: js.RegExp, msg: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the current URL contains the given value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.urlContains('google');
    *    };
    * ```
    */
  def urlContains(expectedText: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def urlContains(expectedText: String, message: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the current url equals the given value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.urlEquals('https://www.google.com');
    *    };
    * ```
    */
  def urlEquals(expected: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def urlEquals(expected: String, message: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the current url matches a regular expression.
    *
    * @example
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.urlMatches('^https');
    *    };
    * ```
    *
    */
  def urlMatches(regex: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def urlMatches(regex: String, msg: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def urlMatches(regex: js.RegExp): AwaitableNightwatchAPINigAcceptAlert = js.native
  def urlMatches(regex: js.RegExp, msg: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the given form element's value equals the expected value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.value("form.login input[type=text]", "username");
    *    };
    * ```
    *
    * @deprecated In favour of `assert.valueEquals()`.
    */
  def value(selector: Definition, expectedText: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def value(selector: Definition, expectedText: String, message: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the given form element's value contains the expected value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.valueContains("form.login input[type=text]", "username");
    *    };
    * ```
    */
  def valueContains(selector: Definition, expectedText: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def valueContains(selector: Definition, expectedText: String, message: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the given form element's value equals the expected value.
    *
    * The existing .assert.value() command.
    *
    * @example
    * ```
    *    this.demoTest = function (browser) {
    *      browser.assert.valueEquals("form.login input[type=text]", "username");
    *    };
    * ```
    *
    */
  def valueEquals(selector: Definition, expected: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  def valueEquals(selector: Definition, expected: String, msg: String): AwaitableNightwatchAPINigAcceptAlert = js.native
  
  /**
    * Checks if the given element is visible on the page.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.visible(".should_be_visible");
    *    };
    * ```
    */
  def visible(selector: Definition): AwaitableNightwatchAPINigAxeInject = js.native
  def visible(selector: Definition, message: String): AwaitableNightwatchAPINigAxeInject = js.native
}
