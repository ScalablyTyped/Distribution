package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetWebHookOptions extends js.Object {
  var allowed_updates: js.UndefOr[js.Array[String]] = js.undefined
  var certificate: js.UndefOr[String | Stream] = js.undefined
  var max_connections: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object SetWebHookOptions {
  @scala.inline
  def apply(
    allowed_updates: js.Array[String] = null,
    certificate: String | Stream = null,
    max_connections: Int | Double = null,
    url: String = null
  ): SetWebHookOptions = {
    val __obj = js.Dynamic.literal()
    if (allowed_updates != null) __obj.updateDynamic("allowed_updates")(allowed_updates.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (max_connections != null) __obj.updateDynamic("max_connections")(max_connections.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWebHookOptions]
  }
}

