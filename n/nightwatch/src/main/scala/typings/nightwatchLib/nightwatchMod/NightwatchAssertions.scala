package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchAssertions extends NightwatchBrowser {
  var NightwatchAssertionsError: NightwatchAssertionsError = js.native
  /**
       * Checks if the given attribute of an element contains the expected value.
       * @param selector: The selector (CSS / Xpath) used to locate the element.
       * @param attribute: The attribute name
       * @param expected: The expected contained value of the attribute to check.
       * @param message: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def attributeContains(selector: java.lang.String, attribute: java.lang.String, expected: java.lang.String): this.type = js.native
  /**
       * Checks if the given attribute of an element contains the expected value.
       * @param selector: The selector (CSS / Xpath) used to locate the element.
       * @param attribute: The attribute name
       * @param expected: The expected contained value of the attribute to check.
       * @param message: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def attributeContains(
    selector: java.lang.String,
    attribute: java.lang.String,
    expected: java.lang.String,
    message: java.lang.String
  ): this.type = js.native
  /**
       * Checks if the given attribute of an element has the expected value.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param attribute: The attribute name
       * @param expected: The expected value of the attribute to check.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def attributeEquals(cssSelector: java.lang.String, attribute: java.lang.String, expected: java.lang.String): this.type = js.native
  /**
       * Checks if the given attribute of an element has the expected value.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param attribute: The attribute name
       * @param expected: The expected value of the attribute to check.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def attributeEquals(
    cssSelector: java.lang.String,
    attribute: java.lang.String,
    expected: java.lang.String,
    msg: java.lang.String
  ): this.type = js.native
  /**
       * Checks if the given element contains the specified text.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param expectedText: The text to look for.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def containsText(cssSelector: java.lang.String, expectedText: java.lang.String): this.type = js.native
  /**
       * Checks if the given element contains the specified text.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param expectedText: The text to look for.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def containsText(cssSelector: java.lang.String, expectedText: java.lang.String, msg: java.lang.String): this.type = js.native
  /**
       * Checks if the given element does not have the specified CSS class.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param className: The CSS class to look for.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def cssClassNotPresent(cssSelector: java.lang.String, className: java.lang.String): this.type = js.native
  /**
       * Checks if the given element does not have the specified CSS class.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param className: The CSS class to look for.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def cssClassNotPresent(cssSelector: java.lang.String, className: java.lang.String, msg: java.lang.String): this.type = js.native
  /**
       * Checks if the given element has the specified CSS class.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param className: The CSS class to look for.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def cssClassPresent(cssSelector: java.lang.String, className: java.lang.String): this.type = js.native
  /**
       * Checks if the given element has the specified CSS class.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param className: The CSS class to look for.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def cssClassPresent(cssSelector: java.lang.String, className: java.lang.String, msg: java.lang.String): this.type = js.native
  /**
       * Checks if the specified css property of a given element has the expected value.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param cssProperty: The CSS property.
       * @param expected: The expected value of the css property to check.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def cssProperty(cssSelector: java.lang.String, cssProperty: java.lang.String, expected: java.lang.String): this.type = js.native
  /**
       * Checks if the specified css property of a given element has the expected value.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param cssProperty: The CSS property.
       * @param expected: The expected value of the css property to check.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def cssProperty(
    cssSelector: java.lang.String,
    cssProperty: java.lang.String,
    expected: java.lang.String,
    msg: java.lang.String
  ): this.type = js.native
  /**
       * Checks if the specified css property of a given element has the expected value.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param cssProperty: The CSS property.
       * @param expected: The expected value of the css property to check.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def cssProperty(cssSelector: java.lang.String, cssProperty: java.lang.String, expected: scala.Double): this.type = js.native
  /**
       * Checks if the specified css property of a given element has the expected value.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param cssProperty: The CSS property.
       * @param expected: The expected value of the css property to check.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def cssProperty(
    cssSelector: java.lang.String,
    cssProperty: java.lang.String,
    expected: scala.Double,
    msg: java.lang.String
  ): this.type = js.native
  def deepEqual(value: js.Any, expected: js.Any): this.type = js.native
  def deepEqual(value: js.Any, expected: js.Any, message: java.lang.String): this.type = js.native
  def deepStrictEqual(value: js.Any, expected: js.Any): this.type = js.native
  def deepStrictEqual(value: js.Any, expected: js.Any, message: java.lang.String): this.type = js.native
  def doesNotThrow(value: js.Any, expected: js.Any): this.type = js.native
  def doesNotThrow(value: js.Any, expected: js.Any, message: java.lang.String): this.type = js.native
  /**
       * Checks if the given element does not exist in the DOM.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def elementNotPresent(cssSelector: java.lang.String): this.type = js.native
  /**
       * Checks if the given element does not exist in the DOM.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def elementNotPresent(cssSelector: java.lang.String, msg: java.lang.String): this.type = js.native
  /**
       * Checks if the given element exists in the DOM.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def elementPresent(cssSelector: java.lang.String): this.type = js.native
  /**
       * Checks if the given element exists in the DOM.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def elementPresent(cssSelector: java.lang.String, msg: java.lang.String): this.type = js.native
  def equal(value: js.Any, expected: js.Any): this.type = js.native
  def equal(value: js.Any, expected: js.Any, message: java.lang.String): this.type = js.native
  def fail(): this.type = js.native
  def fail(actual: js.Any): this.type = js.native
  def fail(actual: js.Any, expected: js.Any): this.type = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): this.type = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: java.lang.String): this.type = js.native
  /**
       * Checks if the given element is not visible on the page.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def hidden(cssSelector: java.lang.String): this.type = js.native
  /**
       * Checks if the given element is not visible on the page.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def hidden(cssSelector: java.lang.String, msg: java.lang.String): this.type = js.native
  def ifError(value: js.Any): this.type = js.native
  def ifError(value: js.Any, message: java.lang.String): this.type = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any): this.type = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): this.type = js.native
  def notDeepStrictEqual(value: js.Any): this.type = js.native
  def notDeepStrictEqual(value: js.Any, message: java.lang.String): this.type = js.native
  def notEqual(actual: js.Any, expected: js.Any): this.type = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: java.lang.String): this.type = js.native
  def notStrictEqual(value: js.Any, expected: js.Any): this.type = js.native
  def notStrictEqual(value: js.Any, expected: js.Any, message: java.lang.String): this.type = js.native
  def ok(actual: scala.Boolean): this.type = js.native
  def ok(actual: scala.Boolean, message: java.lang.String): this.type = js.native
  def strictEqual(value: js.Any, expected: js.Any): this.type = js.native
  def strictEqual(value: js.Any, expected: js.Any, message: java.lang.String): this.type = js.native
  def throws(fn: js.Function0[scala.Unit]): this.type = js.native
  def throws(fn: js.Function0[scala.Unit], msg: java.lang.String): this.type = js.native
  /**
       * Checks if the current URL contains the given value.
       * @param expectedText: The value expected to exist within the current URL.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def urlContains(expectedText: java.lang.String): this.type = js.native
  /**
       * Checks if the current URL contains the given value.
       * @param expectedText: The value expected to exist within the current URL.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def urlContains(expectedText: java.lang.String, msg: java.lang.String): this.type = js.native
  /**
       * Checks if the current url equals the given value.
       * @param expected: The expected url.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def urlEquals(expected: java.lang.String): this.type = js.native
  /**
       * Checks if the current url equals the given value.
       * @param expected: The expected url.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def urlEquals(expected: java.lang.String, msg: java.lang.String): this.type = js.native
  /**
       * Checks if the given form element's value equals the expected value.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param expectedText: The expected text.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def value(cssSelector: java.lang.String, expectedText: java.lang.String): this.type = js.native
  /**
       * Checks if the given form element's value equals the expected value.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param expectedText: The expected text.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def value(cssSelector: java.lang.String, expectedText: java.lang.String, msg: java.lang.String): this.type = js.native
  /**
       * Checks if the given form element's value contains the expected value.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param expectedText: The expected text.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def valueContains(cssSelector: java.lang.String, expectedText: java.lang.String): this.type = js.native
  /**
       * Checks if the given form element's value contains the expected value.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param expectedText: The expected text.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def valueContains(cssSelector: java.lang.String, expectedText: java.lang.String, msg: java.lang.String): this.type = js.native
  /**
       * Checks if the given element is visible on the page.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def visible(cssSelector: java.lang.String): this.type = js.native
  /**
       * Checks if the given element is visible on the page.
       * @param cssSelector: The CSS selector used to locate the element.
       * @param msg: Optional log message to display in the output. If missing, one is displayed by default.
       */
  def visible(cssSelector: java.lang.String, msg: java.lang.String): this.type = js.native
}

