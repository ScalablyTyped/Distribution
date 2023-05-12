package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolElementInteraction extends StObject {
  
  /**
    * Scrolls into view a submittable element excluding buttons or editable element, and then attempts to clear its value, reset the checked state, or text content.
    *
    * @example
    * browser.elementIdClear(elementId);
    *
    * @see https://nightwatchjs.org/api/elementIdClear.html#apimethod-container
    */
  def elementIdClear(id: String): Awaitable[this.type, Null] = js.native
  def elementIdClear(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Scrolls into view the element and clicks the in-view center point.
    * If the element is not pointer-interactable,
    * an <code>element not interactable</code> error is returned.
    *
    * @example
    * browser.elementIdClick(elementId);
    *
    * @see https://nightwatchjs.org/api/elementIdClick.html#apimethod-container
    */
  def elementIdClick(id: String): Awaitable[this.type, Null] = js.native
  def elementIdClick(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Scrolls into view the form control element and then sends the provided keys to the element, or returns the current value of the element.
    * In case the element is not keyboard interactable, an <code>element not interactable error</code> is returned.
    *
    * @see https://nightwatchjs.org/api/elementIdValue.html#apimethod-container
    *
    * @deprecated In favour of .getValue() and .setValue()
    */
  def elementIdValue(id: String): Awaitable[this.type, String] = js.native
  def elementIdValue(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  def elementIdValue(id: String, value: String): Awaitable[this.type, Null] = js.native
  def elementIdValue(
    id: String,
    value: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def elementIdValue(id: String, value: js.Array[String]): Awaitable[this.type, Null] = js.native
  def elementIdValue(
    id: String,
    value: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Send a sequence of key strokes to the active element. The sequence is defined in the same format as the `sendKeys` command.
    * An object map with available keys and their respective UTF-8 characters, as defined on [W3C WebDriver draft spec](https://www.w3.org/TR/webdriver/#character-types),
    * is loaded onto the main Nightwatch instance as `client.Keys`.
    *
    * Rather than the `setValue`, the modifiers are not released at the end of the call. The state of the modifier keys is kept between calls,
    * so mouse interactions can be performed while modifier keys are depressed.
    *
    * Since v2.0, this command is deprecated. It is only available on older JSONWire-based drivers.
    * Please use the new [User Actions API](https://nightwatchjs.org/api/useractions/#overview).
    *
    * @example
    * browser
    * .keys(browser.Keys.CONTROL) // hold down CONTROL key
    * .click('#element')
    * .keys(browser.Keys.NULL) // release all keys
    *
    * @see https://nightwatchjs.org/api/keys.html#apimethod-container
    *
    * @deprecated Please use the [User Actions API](https://nightwatchjs.org/api/useractions/#overview) API instead
    */
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
  
  /**
    * Submit a FORM element. The submit command may also be applied to any element that is a descendant of a FORM element.
    *
    * @example
    * browser.submit(elementID);
    */
  def submit(id: String): Awaitable[this.type, Null] = js.native
  def submit(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
}
