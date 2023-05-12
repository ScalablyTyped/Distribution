package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolUserPrompts extends StObject {
  
  /**
    * Accepts the currently displayed alert dialog. Usually, this is equivalent to clicking on the 'OK' button in the dialog.
    *
    * @example
    * browser.acceptAlert()
    *
    * @see https://nightwatchjs.org/api/acceptAlert.html#apimethod-container
    */
  def acceptAlert(): Awaitable[this.type, Null] = js.native
  def acceptAlert(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Dismisses the currently displayed alert dialog. For confirm() and prompt() dialogs, this is equivalent to clicking the 'Cancel' button.
    *
    * For alert() dialogs, this is equivalent to clicking the 'OK' button.
    *
    * @example
    * browser.dismissAlert();
    *
    * @see https://nightwatchjs.org/api/dismissAlert.html#apimethod-container
    */
  def dismissAlert(): Awaitable[this.type, Null] = js.native
  def dismissAlert(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Gets the text of the currently displayed JavaScript alert(), confirm(), or prompt() dialog.
    *
    * @example
    * browser.getAlertText();
    *
    * @see https://nightwatchjs.org/api/getAlertText.html#apimethod-container
    */
  def getAlertText(): Awaitable[this.type, String] = js.native
  def getAlertText(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  
  /**
    * Automate the input of basic auth credentials whenever they arise.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser
    *      .registerBasicAuth('test-username', 'test-password')
    *      .navigateTo('http://browserspy.dk/password-ok.php');
    *  };
    *
    * @see https://nightwatchjs.org/api/registerBasicAuth.html#apimethod-container
    *
    */
  def registerBasicAuth(username: String, password: String): Awaitable[this.type, Null] = js.native
  def registerBasicAuth(
    username: String,
    password: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Sends keystrokes to a JavaScript prompt() dialog.
    *
    * @example
    * browser.setAlertText('randomalert');
    *
    * @see https://nightwatchjs.org/api/setAlertText.html#apimethod-container
    */
  def setAlertText(value: String): Awaitable[this.type, Null] = js.native
  def setAlertText(
    value: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
}
