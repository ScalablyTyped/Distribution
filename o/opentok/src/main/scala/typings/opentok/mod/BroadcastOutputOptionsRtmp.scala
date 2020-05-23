package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastOutputOptionsRtmp extends js.Object {
  var id: String
  var serverUrl: String
  var status: js.UndefOr[String] = js.undefined
  var streamName: String
}

object BroadcastOutputOptionsRtmp {
  @scala.inline
  def apply(id: String, serverUrl: String, streamName: String, status: String = null): BroadcastOutputOptionsRtmp = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], serverUrl = serverUrl.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastOutputOptionsRtmp]
  }
}

