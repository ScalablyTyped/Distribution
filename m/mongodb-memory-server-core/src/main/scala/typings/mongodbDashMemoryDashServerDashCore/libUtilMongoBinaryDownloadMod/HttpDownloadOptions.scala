package typings.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryDownloadMod

import typings.httpsDashProxyDashAgent.httpsDashProxyDashAgentMod.^
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.GET
import typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpDownloadOptions extends js.Object {
  var agent: js.UndefOr[^] = js.undefined
  var hostname: String
  var method: GET | POST
  var path: String
  var port: String
}

object HttpDownloadOptions {
  @scala.inline
  def apply(hostname: String, method: GET | POST, path: String, port: String, agent: ^ = null): HttpDownloadOptions = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDownloadOptions]
  }
}

