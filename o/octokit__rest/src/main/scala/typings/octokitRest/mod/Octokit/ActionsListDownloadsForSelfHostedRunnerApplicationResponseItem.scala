package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListDownloadsForSelfHostedRunnerApplicationResponseItem extends js.Object {
  var architecture: String
  var download_url: String
  var filename: String
  var os: String
}

object ActionsListDownloadsForSelfHostedRunnerApplicationResponseItem {
  @scala.inline
  def apply(architecture: String, download_url: String, filename: String, os: String): ActionsListDownloadsForSelfHostedRunnerApplicationResponseItem = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], download_url = download_url.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListDownloadsForSelfHostedRunnerApplicationResponseItem]
  }
}

