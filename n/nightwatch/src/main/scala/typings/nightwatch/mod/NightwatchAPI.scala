package typings.nightwatch.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  var launchUrl: String = js.native
  
  var launch_url: String = js.native
  
  var options: NightwatchTestOptions = js.native
  
  var page: StringDictionary[js.Function0[EnhancedPageObject[_, _, _]]] = js.native
  
  /**
    * SessionId of the session used by the Nightwatch api.
    */
  var sessionId: String = js.native
  
  /**
    * Override the sessionId used by Nightwatch client with another session id.
    */
  def setSessionId(sessionId: String): this.type = js.native
  
  var verify: NightwatchAssertions = js.native
}
