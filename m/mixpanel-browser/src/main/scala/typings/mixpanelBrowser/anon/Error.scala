package typings.mixpanelBrowser.anon

import typings.mixpanelBrowser.mixpanelBrowserNumbers.`1`
import typings.mixpanelBrowser.mod.VerboseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends VerboseResponse {
  var error: Null
  var status: `1`
}

object Error {
  @scala.inline
  def apply(error: Null, status: `1`): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

