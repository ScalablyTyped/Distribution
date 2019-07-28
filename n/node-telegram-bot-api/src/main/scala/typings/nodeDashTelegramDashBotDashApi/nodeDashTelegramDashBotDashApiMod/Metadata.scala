package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var `type`: js.UndefOr[MessageType] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(`type`: MessageType = null): Metadata = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Metadata]
  }
}

