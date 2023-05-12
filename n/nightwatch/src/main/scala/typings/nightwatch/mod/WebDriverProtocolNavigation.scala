package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolNavigation extends StObject {
  
  /**
    * Navigate backwards in the browser history, if possible.
    *
    * @see https://nightwatchjs.org/api/back.html
    */
  def back(): Awaitable[this.type, Null] = js.native
  def back(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Navigate forwards in the browser history, if possible.
    *
    * @see https://nightwatchjs.org/api/forward.html
    */
  def forward(): Awaitable[this.type, Null] = js.native
  def forward(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Refresh the current page.
    *
    * @see https://nightwatchjs.org/api/refresh.html
    */
  def refresh(): Awaitable[this.type, Null] = js.native
  def refresh(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Get the current page title.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.title(function(result) {
    *      console.log(result.value);
    *    });
    *  }
    *
    * @see https://nightwatchjs.org/api/title.html
    */
  def title(): Awaitable[this.type, String] = js.native
  def title(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  
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
    *
    * @see https://nightwatchjs.org/api/url.html
    */
  def url(): Awaitable[this.type, String] = js.native
  def url(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  def url(url: String): Awaitable[this.type, Null] = js.native
  def url(
    url: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
}
