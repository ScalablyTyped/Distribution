package typings.nightwatch.mod

import typings.nightwatch.anon.Async
import typings.nightwatch.expectMod.Expect
import typings.seleniumWebdriver.mod.Actions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchAPI
  extends StObject
     with SharedCommands
     with WebDriverProtocol
     with NightwatchCustomCommands
     with NightwatchApiCommands {
  
  var Keys: NightwatchKeys = js.native
  
  def actions(): Actions = js.native
  def actions(options: Async): Actions = js.native
  
  var assert: Assert = js.native
  
  var baseUrl: String = js.native
  
  var currentTest: NightwatchTestSuite = js.native
  
  var ensure: Ensure = js.native
  
  var expect: Expect = js.native
  
  var globals: NightwatchGlobals = js.native
  
  var launchUrl: String = js.native
  
  var launch_url: String = js.native
  
  var options: NightwatchTestOptions = js.native
  
  var page: NightwatchPage & NightwatchCustomPageObjects = js.native
  
  /**
    * SessionId of the session used by the Nightwatch api.
    */
  var sessionId: String = js.native
  
  /**
    * Override the sessionId used by Nightwatch client with another session id.
    */
  def setSessionId(sessionId: String): this.type = js.native
  
  var verify: Assert = js.native
}
