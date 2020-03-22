package typings.mongodbMemoryServerCore.mongoBinaryDownloadMod

import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.GET
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpDownloadOptions extends js.Object {
  var agent: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpsProxyAgent */ js.Any
  ] = js.undefined
  var hostname: String
  var method: GET | POST
  var path: String
  var port: String
}

object HttpDownloadOptions {
  @scala.inline
  def apply(
    hostname: String,
    method: GET | POST,
    path: String,
    port: String,
    agent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpsProxyAgent */ js.Any = null
  ): HttpDownloadOptions = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDownloadOptions]
  }
}

