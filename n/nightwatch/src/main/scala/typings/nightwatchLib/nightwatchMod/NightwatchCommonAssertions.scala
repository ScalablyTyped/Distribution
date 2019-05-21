package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchCommonAssertions extends js.Object {
  var NightwatchAssertionsError: nightwatchLib.nightwatchMod.NightwatchAssertionsError = js.native
  /**
    * Checks if the given attribute of an element contains the expected value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.attributeContains('#someElement', 'href', 'google.com');
    *    };
    * ```
    */
  def attributeContains(selector: java.lang.String, attribute: java.lang.String, expected: java.lang.String): NightwatchAPI = js.native
  def attributeContains(
    selector: java.lang.String,
    attribute: java.lang.String,
    expected: java.lang.String,
    message: java.lang.String
  ): NightwatchAPI = js.native
  /**
    * Checks if the given attribute of an element has the expected value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.attributeEquals('body', 'data-attr', 'some value');
    *    };
    * ```
    */
  def attributeEquals(selector: java.lang.String, attribute: java.lang.String, expected: java.lang.String): NightwatchAPI = js.native
  def attributeEquals(
    selector: java.lang.String,
    attribute: java.lang.String,
    expected: java.lang.String,
    message: java.lang.String
  ): NightwatchAPI = js.native
  /**
    * Checks if the given element contains the specified text.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.containsText('#main', 'The Night Watch');
    *    };
    * ```
    */
  def containsText(selector: java.lang.String, expectedText: java.lang.String): NightwatchAPI = js.native
  def containsText(selector: java.lang.String, expectedText: java.lang.String, message: java.lang.String): NightwatchAPI = js.native
  /**
    * Checks if the given element exists in the DOM.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.elementNotPresent(".should_not_exist");
    *    };
    * ```
    */
  def cssClassNotPresent(selector: java.lang.String, className: java.lang.String): NightwatchAPI = js.native
  def cssClassNotPresent(selector: java.lang.String, className: java.lang.String, msg: java.lang.String): NightwatchAPI = js.native
  /**
    * Checks if the given element has the specified CSS class.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.cssClassPresent('#main', 'container');
    *    };
    * ```
    */
  def cssClassPresent(selector: java.lang.String, className: java.lang.String): NightwatchAPI = js.native
  def cssClassPresent(selector: java.lang.String, className: java.lang.String, message: java.lang.String): NightwatchAPI = js.native
  /**
    * Checks if the specified css property of a given element has the expected value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.cssProperty('#main', 'display', 'block');
    *    };
    * ```
    */
  def cssProperty(selector: java.lang.String, cssProperty: java.lang.String, expected: java.lang.String): NightwatchAPI = js.native
  def cssProperty(
    selector: java.lang.String,
    cssProperty: java.lang.String,
    expected: java.lang.String,
    msg: java.lang.String
  ): NightwatchAPI = js.native
  def cssProperty(selector: java.lang.String, cssProperty: java.lang.String, expected: scala.Double): NightwatchAPI = js.native
  def cssProperty(
    selector: java.lang.String,
    cssProperty: java.lang.String,
    expected: scala.Double,
    msg: java.lang.String
  ): NightwatchAPI = js.native
  def deepEqual(value: js.Any, expected: js.Any): NightwatchAPI = js.native
  def deepEqual(value: js.Any, expected: js.Any, message: java.lang.String): NightwatchAPI = js.native
  def deepStrictEqual(value: js.Any, expected: js.Any): NightwatchAPI = js.native
  def deepStrictEqual(value: js.Any, expected: js.Any, message: java.lang.String): NightwatchAPI = js.native
  def doesNotThrow(value: js.Any, expected: js.Any): NightwatchAPI = js.native
  def doesNotThrow(value: js.Any, expected: js.Any, message: java.lang.String): NightwatchAPI = js.native
  /**
    * Checks if the given element exists in the DOM.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.elementNotPresent(".should_not_exist");
    *    };
    * ```
    */
  def elementNotPresent(selector: java.lang.String): NightwatchAPI = js.native
  def elementNotPresent(selector: java.lang.String, msg: java.lang.String): NightwatchAPI = js.native
  /**
    * Checks if the given element exists in the DOM.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.elementPresent("#main");
    *    };
    * ```
    */
  def elementPresent(selector: java.lang.String): NightwatchAPI = js.native
  def elementPresent(selector: java.lang.String, msg: java.lang.String): NightwatchAPI = js.native
  def equal(value: js.Any, expected: js.Any): NightwatchAPI = js.native
  def equal(value: js.Any, expected: js.Any, message: java.lang.String): NightwatchAPI = js.native
  def fail(): NightwatchAPI = js.native
  def fail(actual: js.Any): NightwatchAPI = js.native
  def fail(actual: js.Any, expected: js.Any): NightwatchAPI = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): NightwatchAPI = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: java.lang.String): NightwatchAPI = js.native
  /**
    * Checks if the given element is not visible on the page.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.hidden(".should_not_be_visible");
    *    };
    * ```
    */
  def hidden(selector: java.lang.String): NightwatchAPI = js.native
  def hidden(selector: java.lang.String, msg: java.lang.String): NightwatchAPI = js.native
  def ifError(value: js.Any): NightwatchAPI = js.native
  def ifError(value: js.Any, message: java.lang.String): NightwatchAPI = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any): NightwatchAPI = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): NightwatchAPI = js.native
  def notDeepStrictEqual(value: js.Any): NightwatchAPI = js.native
  def notDeepStrictEqual(value: js.Any, message: java.lang.String): NightwatchAPI = js.native
  def notEqual(actual: js.Any, expected: js.Any): NightwatchAPI = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: java.lang.String): NightwatchAPI = js.native
  def notStrictEqual(value: js.Any, expected: js.Any): NightwatchAPI = js.native
  def notStrictEqual(value: js.Any, expected: js.Any, message: java.lang.String): NightwatchAPI = js.native
  def ok(actual: scala.Boolean): NightwatchAPI = js.native
  def ok(actual: scala.Boolean, message: java.lang.String): NightwatchAPI = js.native
  def strictEqual(value: js.Any, expected: js.Any): NightwatchAPI = js.native
  def strictEqual(value: js.Any, expected: js.Any, message: java.lang.String): NightwatchAPI = js.native
  def throws(fn: js.Function0[scala.Unit]): NightwatchAPI = js.native
  def throws(fn: js.Function0[scala.Unit], message: java.lang.String): NightwatchAPI = js.native
  /**
    * Checks if the page title equals the given value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.title("Nightwatch.js");
    *    };
    * ```
    */
  def title(expected: java.lang.String): NightwatchAPI = js.native
  def title(expected: java.lang.String, message: java.lang.String): NightwatchAPI = js.native
  /**
    * Checks if the page title equals the given value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.title("Nightwatch.js");
    *    };
    * ```
    */
  def titleContains(expected: java.lang.String): NightwatchAPI = js.native
  def titleContains(expected: java.lang.String, message: java.lang.String): NightwatchAPI = js.native
  /**
    * Checks if the current URL contains the given value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.urlContains('google');
    *    };
    * ```
    */
  def urlContains(expectedText: java.lang.String): NightwatchAPI = js.native
  def urlContains(expectedText: java.lang.String, message: java.lang.String): NightwatchAPI = js.native
  /**
    * Checks if the current url equals the given value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.urlEquals('https://www.google.com');
    *    };
    * ```
    */
  def urlEquals(expected: java.lang.String): NightwatchAPI = js.native
  def urlEquals(expected: java.lang.String, message: java.lang.String): NightwatchAPI = js.native
  /**
    * Checks if the given form element's value equals the expected value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.value("form.login input[type=text]", "username");
    *    };
    * ```
    */
  def value(selector: java.lang.String, expectedText: java.lang.String): NightwatchAPI = js.native
  def value(selector: java.lang.String, expectedText: java.lang.String, message: java.lang.String): NightwatchAPI = js.native
  /**
    * Checks if the given form element's value contains the expected value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.valueContains("form.login input[type=text]", "username");
    *    };
    * ```
    */
  def valueContains(selector: java.lang.String, expectedText: java.lang.String): NightwatchAPI = js.native
  def valueContains(selector: java.lang.String, expectedText: java.lang.String, message: java.lang.String): NightwatchAPI = js.native
  /**
    * Checks if the given element is visible on the page.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.visible(".should_be_visible");
    *    };
    * ```
    */
  def visible(selector: java.lang.String): NightwatchAPI = js.native
  def visible(selector: java.lang.String, message: java.lang.String): NightwatchAPI = js.native
}

