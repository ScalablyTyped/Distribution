package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebDriverProtocolElementInteraction extends js.Object {
  /**
    * Scrolls into view a submittable element excluding buttons or editable element, and then attempts to clear its value, reset the checked state, or text content.
    */
  def elementIdClear(id: String): this.type = js.native
  def elementIdClear(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Scrolls into view the element and clicks the in-view center point. If the element is not pointer-interactable, an <code>element not interactable</code> error is returned.
    */
  def elementIdClick(id: String): this.type = js.native
  def elementIdClick(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Scrolls into view the form control element and then sends the provided keys to the element, or returns the current value of the element.
    * In case the element is not keyboard interactable, an <code>element not interactable error</code> is returned.
    */
  def elementIdValue(id: String): this.type = js.native
  def elementIdValue(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): this.type = js.native
  /**
    * Scrolls into view the form control element and then sends the provided keys to the element, or returns the current value of the element.
    * In case the element is not keyboard interactable, an <code>element not interactable error</code> is returned.
    */
  def elementIdValue(id: String, value: String): this.type = js.native
  def elementIdValue(
    id: String,
    value: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Send a sequence of key strokes to the active element. The sequence is defined in the same format as the `sendKeys` command.
    * An object map with available keys and their respective UTF-8 characters, as defined on [W3C WebDriver draft spec](https://www.w3.org/TR/webdriver/#character-types),
    * is loaded onto the main Nightwatch instance as `client.Keys`.
    *
    * Rather than the `setValue`, the modifiers are not released at the end of the call. The state of the modifier keys is kept between calls,
    * so mouse interactions can be performed while modifier keys are depressed.
    */
  def keys(keysToSend: js.Array[String]): this.type = js.native
  def keys(
    keysToSend: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Submit a FORM element. The submit command may also be applied to any element that is a descendant of a FORM element.
    */
  def submit(id: String): this.type = js.native
  def submit(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
}

