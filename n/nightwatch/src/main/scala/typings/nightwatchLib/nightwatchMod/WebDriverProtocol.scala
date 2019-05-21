package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebDriverProtocol
  extends WebDriverProtocolSessions
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

