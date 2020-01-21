package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebDriverProtocolNavigation extends js.Object {
  /**
    * Navigate backwards in the browser history, if possible.
    */
  def back(): this.type = js.native
  def back(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Navigate forwards in the browser history, if possible.
    */
  def forward(): this.type = js.native
  def forward(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Refresh the current page.
    */
  def refresh(): this.type = js.native
  def refresh(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  /**
    * Get the current page title.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.title(function(result) {
    *      console.log(result.value);
    *    });
    * }
    */
  def title(): this.type = js.native
  def title(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): this.type = js.native
  /**
    * Retrieve the URL of the current page or navigate to a new URL.
    *
    * @example
    * module.exports = {
    *  'demo Test' : function(browser) {
    *     browser.url(function(result) {
    *       // return the current url
    *       console.log(result);
    *     });
    *     //
    *     // navigate to new url:
    *     browser.url('{URL}');
    *     //
    *     //
    *     // navigate to new url:
    *     browser.url('{URL}', function(result) {
    *       console.log(result);
    *     });
    *   }
    * }
    */
  def url(): this.type = js.native
  def url(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): this.type = js.native
  /**
    * Retrieve the URL of the current page or navigate to a new URL.
    *
    * @example
    * module.exports = {
    *  'demo Test' : function(browser) {
    *     browser.url(function(result) {
    *       // return the current url
    *       console.log(result);
    *     });
    *     //
    *     // navigate to new url:
    *     browser.url('{URL}');
    *     //
    *     //
    *     // navigate to new url:
    *     browser.url('{URL}', function(result) {
    *       console.log(result);
    *     });
    *   }
    * }
    */
  def url(url: String): this.type = js.native
  def url(
    url: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): this.type = js.native
}

