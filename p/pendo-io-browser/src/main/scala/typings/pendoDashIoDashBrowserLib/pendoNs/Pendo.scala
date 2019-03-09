package typings
package pendoDashIoDashBrowserLib.pendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pendo extends js.Object {
  var debugging: Debugging = js.native
  // Events
  var events: Events = js.native
  def disableDebugging(): scala.Unit = js.native
  def dom(input: js.Any): stdLib.HTMLElement = js.native
  // Debugging
  def enableDebugging(): scala.Unit = js.native
  def findGuideById(id: java.lang.String): Guide | scala.Unit = js.native
  // Guides and Guide Center
  def findGuideByName(name: java.lang.String): Guide | scala.Unit = js.native
  def flushNow(): js.Promise[_] = js.native
  def getAccountId(): java.lang.String = js.native
  def getCurrentUrl(): java.lang.String = js.native
  def getVersion(): java.lang.String = js.native
  def getVisitorId(): java.lang.String = js.native
  def identify(identity: Identity): scala.Unit = js.native
  def identify(visitorId: java.lang.String): scala.Unit = js.native
  def identify(visitorId: java.lang.String, accountId: java.lang.String): scala.Unit = js.native
  // Initialization and Identification
  def initialize(options: InitOptions): scala.Unit = js.native
  def isDebuggingEnabled(): pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.Yes | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.No = js.native
  def isDebuggingEnabled(coerce: pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibNumbers.`false`): pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.Yes | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.No = js.native
  def isDebuggingEnabled(coerce: pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibNumbers.`true`): scala.Boolean = js.native
  def isReady(): scala.Boolean = js.native
  // Troubleshooting
  def loadGuides(): scala.Unit = js.native
  // Guide Events
  def onGuideAdvanced(): scala.Unit = js.native
  def onGuideAdvanced(step: GuideStep): scala.Unit = js.native
  def onGuideAdvanced(steps: pendoDashIoDashBrowserLib.Anon_Steps): scala.Unit = js.native
  def onGuideDismissed(): scala.Unit = js.native
  def onGuideDismissed(step: GuideStep): scala.Unit = js.native
  def onGuideDismissed(until: pendoDashIoDashBrowserLib.Anon_Reload): scala.Unit = js.native
  def onGuidePrevious(): scala.Unit = js.native
  def onGuidePrevious(step: GuideStep): scala.Unit = js.native
  def removeLauncher(): scala.Unit = js.native
  def showGuideById(id: java.lang.String): scala.Unit = js.native
  def showGuideByName(name: java.lang.String): scala.Unit = js.native
  def startGuides(): scala.Unit = js.native
  def stopGuides(): scala.Unit = js.native
  def toggleLauncher(): scala.Unit = js.native
  def track(trackType: java.lang.String): scala.Unit = js.native
  def track(trackType: java.lang.String, metadata: Metadata): scala.Unit = js.native
  def updateOptions(visitorMetadata: Metadata): scala.Unit = js.native
  // Other
  def validateInstall(): scala.Unit = js.native
}

