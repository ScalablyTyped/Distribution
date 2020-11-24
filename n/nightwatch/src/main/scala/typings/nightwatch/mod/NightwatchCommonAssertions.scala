package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchCommonAssertions extends js.Object {
  
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
  def attributeContains(selector: String, attribute: String, expected: String): NightwatchAPI = js.native
  def attributeContains(selector: String, attribute: String, expected: String, message: String): NightwatchAPI = js.native
  
  /**
    * Checks if the given attribute of an element has the expected value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.attributeEquals('body', 'data-attr', 'some value');
    *    };
    * ```
    */
  def attributeEquals(selector: String, attribute: String, expected: String): NightwatchAPI = js.native
  def attributeEquals(selector: String, attribute: String, expected: String, message: String): NightwatchAPI = js.native
  
  /**
    * Checks if the given element contains the specified text.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.containsText('#main', 'The Night Watch');
    *    };
    * ```
    */
  def containsText(selector: String, expectedText: String): NightwatchAPI = js.native
  def containsText(selector: String, expectedText: String, message: String): NightwatchAPI = js.native
  
  /**
    * Checks if the given element exists in the DOM.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.elementNotPresent(".should_not_exist");
    *    };
    * ```
    */
  def cssClassNotPresent(selector: String, className: String): NightwatchAPI = js.native
  def cssClassNotPresent(selector: String, className: String, msg: String): NightwatchAPI = js.native
  
  /**
    * Checks if the given element has the specified CSS class.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.cssClassPresent('#main', 'container');
    *    };
    * ```
    */
  def cssClassPresent(selector: String, className: String): NightwatchAPI = js.native
  def cssClassPresent(selector: String, className: String, message: String): NightwatchAPI = js.native
  
  /**
    * Checks if the specified css property of a given element has the expected value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.cssProperty('#main', 'display', 'block');
    *    };
    * ```
    */
  def cssProperty(selector: String, cssProperty: String, expected: String): NightwatchAPI = js.native
  def cssProperty(selector: String, cssProperty: String, expected: String, msg: String): NightwatchAPI = js.native
  def cssProperty(selector: String, cssProperty: String, expected: Double): NightwatchAPI = js.native
  def cssProperty(selector: String, cssProperty: String, expected: Double, msg: String): NightwatchAPI = js.native
  
  def deepEqual(value: js.Any, expected: js.Any): NightwatchAPI = js.native
  def deepEqual(value: js.Any, expected: js.Any, message: String): NightwatchAPI = js.native
  
  def deepStrictEqual(value: js.Any, expected: js.Any): NightwatchAPI = js.native
  def deepStrictEqual(value: js.Any, expected: js.Any, message: String): NightwatchAPI = js.native
  
  def doesNotThrow(value: js.Any, expected: js.Any): NightwatchAPI = js.native
  def doesNotThrow(value: js.Any, expected: js.Any, message: String): NightwatchAPI = js.native
  
  /**
    * Checks if the given element exists in the DOM.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.elementNotPresent(".should_not_exist");
    *    };
    * ```
    */
  def elementNotPresent(selector: String): NightwatchAPI = js.native
  def elementNotPresent(selector: String, msg: String): NightwatchAPI = js.native
  
  /**
    * Checks if the given element exists in the DOM.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.elementPresent("#main");
    *    };
    * ```
    */
  def elementPresent(selector: String): NightwatchAPI = js.native
  def elementPresent(selector: String, msg: String): NightwatchAPI = js.native
  
  def equal(value: js.Any, expected: js.Any): NightwatchAPI = js.native
  def equal(value: js.Any, expected: js.Any, message: String): NightwatchAPI = js.native
  
  def fail(): NightwatchAPI = js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): NightwatchAPI = js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], message: String): NightwatchAPI = js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    message: String,
    operator: String
  ): NightwatchAPI = js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any): NightwatchAPI = js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): NightwatchAPI = js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String): NightwatchAPI = js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String, operator: String): NightwatchAPI = js.native
  def fail(actual: js.Any): NightwatchAPI = js.native
  def fail(
    actual: js.Any,
    expected: js.UndefOr[scala.Nothing],
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): NightwatchAPI = js.native
  def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String): NightwatchAPI = js.native
  def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String, operator: String): NightwatchAPI = js.native
  def fail(actual: js.Any, expected: js.Any): NightwatchAPI = js.native
  def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: String): NightwatchAPI = js.native
  def fail(actual: js.Any, expected: js.Any, message: String): NightwatchAPI = js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): NightwatchAPI = js.native
  
  /**
    * Checks if the given element is not visible on the page.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.hidden(".should_not_be_visible");
    *    };
    * ```
    */
  def hidden(selector: String): NightwatchAPI = js.native
  def hidden(selector: String, msg: String): NightwatchAPI = js.native
  
  def ifError(value: js.Any): NightwatchAPI = js.native
  def ifError(value: js.Any, message: String): NightwatchAPI = js.native
  
  def notDeepEqual(actual: js.Any, expected: js.Any): NightwatchAPI = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: String): NightwatchAPI = js.native
  
  def notDeepStrictEqual(value: js.Any): NightwatchAPI = js.native
  def notDeepStrictEqual(value: js.Any, message: String): NightwatchAPI = js.native
  
  def notEqual(actual: js.Any, expected: js.Any): NightwatchAPI = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String): NightwatchAPI = js.native
  
  def notStrictEqual(value: js.Any, expected: js.Any): NightwatchAPI = js.native
  def notStrictEqual(value: js.Any, expected: js.Any, message: String): NightwatchAPI = js.native
  
  def ok(actual: Boolean): NightwatchAPI = js.native
  def ok(actual: Boolean, message: String): NightwatchAPI = js.native
  
  def strictEqual(value: js.Any, expected: js.Any): NightwatchAPI = js.native
  def strictEqual(value: js.Any, expected: js.Any, message: String): NightwatchAPI = js.native
  
  def throws(fn: js.Function0[Unit]): NightwatchAPI = js.native
  def throws(fn: js.Function0[Unit], message: String): NightwatchAPI = js.native
  
  /**
    * Checks if the page title equals the given value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.title("Nightwatch.js");
    *    };
    * ```
    */
  def title(expected: String): NightwatchAPI = js.native
  def title(expected: String, message: String): NightwatchAPI = js.native
  
  /**
    * Checks if the page title equals the given value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.title("Nightwatch.js");
    *    };
    * ```
    */
  def titleContains(expected: String): NightwatchAPI = js.native
  def titleContains(expected: String, message: String): NightwatchAPI = js.native
  
  /**
    * Checks if the current URL contains the given value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.urlContains('google');
    *    };
    * ```
    */
  def urlContains(expectedText: String): NightwatchAPI = js.native
  def urlContains(expectedText: String, message: String): NightwatchAPI = js.native
  
  /**
    * Checks if the current url equals the given value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.urlEquals('https://www.google.com');
    *    };
    * ```
    */
  def urlEquals(expected: String): NightwatchAPI = js.native
  def urlEquals(expected: String, message: String): NightwatchAPI = js.native
  
  /**
    * Checks if the given form element's value equals the expected value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.value("form.login input[type=text]", "username");
    *    };
    * ```
    */
  def value(selector: String, expectedText: String): NightwatchAPI = js.native
  def value(selector: String, expectedText: String, message: String): NightwatchAPI = js.native
  
  /**
    * Checks if the given form element's value contains the expected value.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.valueContains("form.login input[type=text]", "username");
    *    };
    * ```
    */
  def valueContains(selector: String, expectedText: String): NightwatchAPI = js.native
  def valueContains(selector: String, expectedText: String, message: String): NightwatchAPI = js.native
  
  /**
    * Checks if the given element is visible on the page.
    *
    * ```
    *    this.demoTest = function (client) {
    *      browser.assert.visible(".should_be_visible");
    *    };
    * ```
    */
  def visible(selector: String): NightwatchAPI = js.native
  def visible(selector: String, message: String): NightwatchAPI = js.native
}
