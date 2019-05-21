package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchAPI
  extends WebDriverProtocol
     with SharedCommands
     with NightwatchCustomCommands {
  var Keys: NightwatchKeys = js.native
  var assert: NightwatchAssertions = js.native
  var currentTest: NightwatchTestSuite = js.native
  var expect: Expect = js.native
  var globals: NightwatchGlobals = js.native
  var launchUrl: java.lang.String = js.native
  var launch_url: java.lang.String = js.native
  var options: NightwatchTestOptions = js.native
  var page: (org.scalablytyped.runtime.StringDictionary[js.Function0[EnhancedPageObject[_, _, _]]]) with NightwatchCustomPageObjects = js.native
  /**
    * SessionId of the session used by the Nightwatch api.
    */
  var sessionId: java.lang.String = js.native
  var verify: NightwatchAssertions = js.native
  /**
    * Override the sessionId used by Nightwatch client with another session id.
    */
  def setSessionId(sessionId: java.lang.String): this.type = js.native
}

