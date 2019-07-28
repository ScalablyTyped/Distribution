package typings.nodeDashStatic.nodeDashStaticMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cache: js.UndefOr[Double | Boolean] = js.undefined
  var `cache-control`: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  var indexFile: js.UndefOr[String] = js.undefined
  var server: js.UndefOr[String] = js.undefined
  var serverInfo: js.UndefOr[Buffer] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cache: Double | Boolean = null,
    `cache-control`: String = null,
    headers: Headers = null,
    indexFile: String = null,
    server: String = null,
    serverInfo: Buffer = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (`cache-control` != null) __obj.updateDynamic("cache-control")(`cache-control`)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (indexFile != null) __obj.updateDynamic("indexFile")(indexFile)
    if (server != null) __obj.updateDynamic("server")(server)
    if (serverInfo != null) __obj.updateDynamic("serverInfo")(serverInfo)
    __obj.asInstanceOf[Options]
  }
}

