package typings.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams.navigateCrossDomain")
@js.native
object navigateCrossDomain extends js.Object {
  /**
    * Navigates the frame to a new cross-domain URL. The domain of this URL must match at least one of the
    * valid domains specified in the validDomains block of the manifest; otherwise, an exception will be
    * thrown. This function needs to be used only when navigating the frame to a URL in a different domain
    * than the current one in a way that keeps the app informed of the change and allows the SDK to
    * continue working.
    * @param url The URL to navigate the frame to.
    */
  def apply(url: String): Unit = js.native
}

