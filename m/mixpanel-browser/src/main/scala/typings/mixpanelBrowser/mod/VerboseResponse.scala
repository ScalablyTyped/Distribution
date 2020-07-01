package typings.mixpanelBrowser.mod

import typings.mixpanelBrowser.mixpanelBrowserNumbers.`0`
import typings.mixpanelBrowser.mixpanelBrowserNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mixpanelBrowser.anon.Error
  - typings.mixpanelBrowser.anon.Status
*/
trait VerboseResponse extends Response

object VerboseResponse {
  @scala.inline
  def Error(error: Null, status: `1`): VerboseResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerboseResponse]
  }
  @scala.inline
  def Status(error: String, status: `0`): VerboseResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerboseResponse]
  }
}

