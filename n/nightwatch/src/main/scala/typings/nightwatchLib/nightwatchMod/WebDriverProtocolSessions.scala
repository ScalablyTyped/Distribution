package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebDriverProtocolSessions extends js.Object {
  /**
    * Get info about, delete or create a new session. Defaults to the current session.
    *
    * @example
    * this.demoTest = function (browser) {
    *    browser.session(function(result) {
    *      console.log(result.value);
    *    });
    *    //
    *    browser.session('delete', function(result) {
    *      console.log(result.value);
    *    });
    *    //
    *    browser.session('delete', '12345-abc', function(result) {
    *      console.log(result.value);
    *    });
    * }
    */
  def session(): this.type = js.native
  def session(action: java.lang.String): this.type = js.native
  def session(action: java.lang.String, sessionId: java.lang.String): this.type = js.native
  def session(
    action: java.lang.String,
    sessionId: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[stdLib.Record[java.lang.String, _]], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Gets the text of the log type specified. To find out the available log types, use `.getLogTypes()`.
    *
    * Returns a [log entry JSON object](https://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol#log-entry-json-object).
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.sessionLog('client', function(result) {
    *      console.log(result.value);
    *    });
    * }
    */
  def sessionLog(typeString: java.lang.String): this.type = js.native
  def sessionLog(
    typeString: java.lang.String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* log */ js.Array[NightwatchLogEntry], scala.Unit]
  ): this.type = js.native
  /**
    * Gets an array of strings for which log types are available. This methods returns the entire WebDriver response, if you are only interested in the logs array, use `.getLogTypes()` instead.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.sessionLogTypes(function(result) {
    *      console.log(result.value);
    *    });
    * }
    */
  def sessionLogTypes(): this.type = js.native
  def sessionLogTypes(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[
        js.Array[
          nightwatchLib.nightwatchLibStrings.client | nightwatchLib.nightwatchLibStrings.driver | nightwatchLib.nightwatchLibStrings.browser | nightwatchLib.nightwatchLibStrings.server
        ]
      ], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Returns a list of the currently active sessions.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.sessions(function(result) {
    *      console.log(result.value);
    *    });
    * }
    */
  def sessions(): this.type = js.native
  def sessions(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[stdLib.Record[java.lang.String, _]]], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Query the server's current status.
    */
  def status(): this.type = js.native
  def status(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[nightwatchLib.Anon_Build], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Configure the amount of time that a particular type of operation can execute for before they are aborted and a |Timeout| error is returned to the client.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.timeouts('script', 10000, function(result) {
    *      console.log(result);
    *    });
    * }
    */
  def timeouts(typeOfOperation: java.lang.String, ms: scala.Double): this.type = js.native
  def timeouts(
    typeOfOperation: java.lang.String,
    ms: scala.Double,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Set the amount of time, in milliseconds, that asynchronous scripts executed by `.executeAsync` are permitted to run before they are aborted and a |Timeout| error is returned to the client.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.timeoutsAsyncScript(10000, function(result) {
    *      console.log(result);
    *    });
    * }
    */
  def timeoutsAsyncScript(ms: scala.Double): this.type = js.native
  def timeoutsAsyncScript(
    ms: scala.Double,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Set the amount of time the driver should wait when searching for elements. If this command is never sent, the driver will default to an implicit wait of 0ms.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.timeoutsImplicitWait(10000, function(result) {
    *      console.log(result);
    *    });
    * }
    */
  def timeoutsImplicitWait(ms: scala.Double): this.type = js.native
  def timeoutsImplicitWait(
    ms: scala.Double,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
}

