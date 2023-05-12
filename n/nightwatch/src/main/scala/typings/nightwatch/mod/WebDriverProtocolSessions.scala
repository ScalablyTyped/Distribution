package typings.nightwatch.mod

import typings.nightwatch.anon.Downloadthroughput
import typings.nightwatch.anon.Implicit
import typings.nightwatch.nightwatchStrings.DELETE
import typings.nightwatch.nightwatchStrings.GET
import typings.nightwatch.nightwatchStrings.POST
import typings.nightwatch.nightwatchStrings.`implicit`
import typings.nightwatch.nightwatchStrings.delete_
import typings.nightwatch.nightwatchStrings.get_
import typings.nightwatch.nightwatchStrings.pageLoad
import typings.nightwatch.nightwatchStrings.post_
import typings.nightwatch.nightwatchStrings.script
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolSessions extends StObject {
  
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
    *
    * @see https://nightwatchjs.org/api/session.html#apimethod-container
    */
  def session(): Awaitable[this.type, Record[String, Any]] = js.native
  def session(actionOrSessionId: get_ | post_ | delete_ | GET | POST | DELETE): Awaitable[this.type, Record[String, Any]] = js.native
  def session(
    actionOrSessionId: get_ | post_ | delete_ | GET | POST | DELETE,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Record[String, Any]], 
      Unit
    ]
  ): Awaitable[this.type, Record[String, Any]] = js.native
  def session(actionOrSessionId: String): Awaitable[this.type, Record[String, Any]] = js.native
  def session(
    actionOrSessionId: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Record[String, Any]], 
      Unit
    ]
  ): Awaitable[this.type, Record[String, Any]] = js.native
  def session(action: get_ | post_ | delete_ | GET | POST | DELETE, sessionId: String): Awaitable[this.type, Record[String, Any]] = js.native
  def session(
    action: get_ | post_ | delete_ | GET | POST | DELETE,
    sessionId: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Record[String, Any]], 
      Unit
    ]
  ): Awaitable[this.type, Record[String, Any]] = js.native
  def session(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[Record[String, Any]], 
      Unit
    ]
  ): Awaitable[this.type, Record[String, Any]] = js.native
  
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
    *  }
    *
    * @see https://nightwatchjs.org/api/sessionLog.html
    */
  def sessionLog(typeString: String): Awaitable[this.type, js.Array[NightwatchLogEntry]] = js.native
  def sessionLog(
    typeString: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[NightwatchLogEntry]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[NightwatchLogEntry]] = js.native
  
  /**
    * Gets an array of strings for which log types are available. This methods returns the entire WebDriver response, if you are only interested in the logs array, use `.getLogTypes()` instead.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.sessionLogTypes(function(result) {
    *      console.log(result.value);
    *    });
    *  }
    *
    * @see https://nightwatchjs.org/api/sessionLogTypes.html
    */
  def sessionLogTypes(): Awaitable[this.type, js.Array[NightwatchLogTypes]] = js.native
  def sessionLogTypes(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[NightwatchLogTypes]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[NightwatchLogTypes]] = js.native
  
  /**
    * Returns a list of the currently active sessions.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.sessions(function(result) {
    *      console.log(result.value);
    *    });
    *  }
    *
    * @see https://nightwatchjs.org/api/sessions.html
    */
  def sessions(): Awaitable[this.type, js.Array[Record[String, Any]]] = js.native
  def sessions(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[Record[String, Any]]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[Record[String, Any]]] = js.native
  
  /**
    * Command to set Chrome network emulation settings.
    *
    * @example
    *  this.demoTest = function() {
    *    browser.setNetworkConditions({
    *      offline: false,
    *      latency: 50000,
    *      download_throughput: 450 * 1024,
    *      upload_throughput: 150 * 1024
    *    });
    *  };
    *
    * @see https://nightwatchjs.org/api/setNetworkConditions.html
    */
  def setNetworkConditions(spec: Downloadthroughput): Awaitable[this.type, Null] = js.native
  def setNetworkConditions(
    spec: Downloadthroughput,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Query the server's current status.
    *
    * @see https://nightwatchjs.org/api/status.html
    */
  def status(): Awaitable[this.type, NightwatchServerStatusResult] = js.native
  def status(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchServerStatusResult], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchServerStatusResult] = js.native
  
  def timeouts(): Awaitable[this.type, Implicit] = js.native
  def timeouts(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Implicit], Unit]
  ): Awaitable[this.type, Implicit] = js.native
  /**
    * Configure the amount of time that a particular type of operation can execute for before they are aborted and a |Timeout| error is returned to the client.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.timeouts('script', 10000, function(result) {
    *      console.log(result);
    *    });
    *  }
    *
    * @see https://nightwatchjs.org/api/timeouts.html
    */
  def timeouts(typeOfOperation: script | `implicit` | pageLoad, ms: Double): Awaitable[this.type, Null] = js.native
  def timeouts(
    typeOfOperation: script | `implicit` | pageLoad,
    ms: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Set the amount of time, in milliseconds, that asynchronous scripts executed by `.executeAsync` are permitted to run before they are aborted and a |Timeout| error is returned to the client.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.timeoutsAsyncScript(10000, function(result) {
    *      console.log(result);
    *    });
    *  }
    *
    * @see https://nightwatchjs.org/api/timeoutsAsyncScript.html
    */
  def timeoutsAsyncScript(ms: Double): Awaitable[this.type, Null] = js.native
  def timeoutsAsyncScript(
    ms: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Set the amount of time the driver should wait when searching for elements. If this command is never sent, the driver will default to an implicit wait of 0ms.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.timeoutsImplicitWait(10000, function(result) {
    *      console.log(result);
    *    });
    *  }
    *
    * @see https://nightwatchjs.org/api/timeoutsImplicitWait.html
    */
  def timeoutsImplicitWait(ms: Double): Awaitable[this.type, Null] = js.native
  def timeoutsImplicitWait(
    ms: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
}
