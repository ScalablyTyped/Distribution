package typings.peerjs.PeerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerConnectOption extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var reliable: js.UndefOr[Boolean] = js.undefined
  var serialization: js.UndefOr[String] = js.undefined
}

object PeerConnectOption {
  @scala.inline
  def apply(
    label: String = null,
    metadata: js.Any = null,
    reliable: js.UndefOr[Boolean] = js.undefined,
    serialization: String = null
  ): PeerConnectOption = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(reliable)) __obj.updateDynamic("reliable")(reliable)
    if (serialization != null) __obj.updateDynamic("serialization")(serialization)
    __obj.asInstanceOf[PeerConnectOption]
  }
}

