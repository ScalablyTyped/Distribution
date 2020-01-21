package typings.peerjs.webrtcAdapterMod

import typings.peerjs.peerjsStrings.`Not a browserDot`
import typings.peerjs.peerjsStrings.`Not a supported browserDot`
import typings.peerjs.peerjsStrings.chrome
import typings.peerjs.peerjsStrings.edge
import typings.peerjs.peerjsStrings.firefox
import typings.peerjs.peerjsStrings.safari
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserDetails extends js.Object {
  var browser: (`Not a browserDot`) | (`Not a supported browserDot`) | firefox | chrome | safari | edge
  var supportsUnifiedPlan: js.UndefOr[Boolean] = js.undefined
  var version: Double | Null
}

object BrowserDetails {
  @scala.inline
  def apply(
    browser: (`Not a browserDot`) | (`Not a supported browserDot`) | firefox | chrome | safari | edge,
    supportsUnifiedPlan: js.UndefOr[Boolean] = js.undefined,
    version: Int | Double = null
  ): BrowserDetails = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsUnifiedPlan)) __obj.updateDynamic("supportsUnifiedPlan")(supportsUnifiedPlan.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserDetails]
  }
}

