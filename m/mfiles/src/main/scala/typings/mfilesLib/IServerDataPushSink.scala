package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerDataPushSink extends js.Object {
  def OnServerDataPush(RequestID: scala.Double, JsonDataContent: java.lang.String): scala.Unit
}

object IServerDataPushSink {
  @scala.inline
  def apply(OnServerDataPush: js.Function2[scala.Double, java.lang.String, scala.Unit]): IServerDataPushSink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("OnServerDataPush")(OnServerDataPush)
    __obj.asInstanceOf[IServerDataPushSink]
  }
}

