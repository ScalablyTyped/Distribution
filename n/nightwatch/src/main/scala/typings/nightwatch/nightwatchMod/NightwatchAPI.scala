package typings.nightwatch.nightwatchMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchAPI
  extends ClientCommands
     with ElementCommands
     with WebDriverProtocolSessions
     with WebDriverProtocolNavigation
     with WebDriverProtocolCommandContexts
     with WebDriverProtocolElements
     with WebDriverProtocolElementState
     with WebDriverProtocolElementInteraction
     with WebDriverProtocolElementLocation
     with WebDriverProtocolDocumentHandling
     with WebDriverProtocolCookies
     with WebDriverProtocolUserActions
     with WebDriverProtocolUserPrompts
     with WebDriverProtocolScreenCapture
     with WebDriverProtocolMobileRelated
     with NightwatchCustomCommands {
  var Keys: NightwatchKeys = js.native
  var assert: NightwatchAssertions = js.native
  var currentTest: NightwatchTestSuite = js.native
  var expect: Expect = js.native
  var globals: NightwatchGlobals = js.native
  var launchUrl: String = js.native
  var launch_url: String = js.native
  var options: NightwatchTestOptions = js.native
  var page: (StringDictionary[js.Function0[EnhancedPageObject[_, _, _]]]) with NightwatchCustomPageObjects = js.native
  /**
    * SessionId of the session used by the Nightwatch api.
    */
  var sessionId: String = js.native
  var verify: NightwatchAssertions = js.native
  /**
    * Override the sessionId used by Nightwatch client with another session id.
    */
  def setSessionId(sessionId: String): this.type = js.native
}

