package typings.mixpanelBrowser.anon

import typings.mixpanelBrowser.mixpanelBrowserNumbers.`0`
import typings.mixpanelBrowser.mod.VerboseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends VerboseResponse {
  var error: String
  var status: `0`
}

object Status {
  @scala.inline
  def apply(error: String, status: `0`): Status = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
}

