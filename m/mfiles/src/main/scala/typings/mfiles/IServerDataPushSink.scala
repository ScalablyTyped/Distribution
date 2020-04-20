package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerDataPushSink extends js.Object {
  def OnServerDataPush(RequestID: Double, JsonDataContent: String): Unit
}

object IServerDataPushSink {
  @scala.inline
  def apply(OnServerDataPush: (Double, String) => Unit): IServerDataPushSink = {
    val __obj = js.Dynamic.literal(OnServerDataPush = js.Any.fromFunction2(OnServerDataPush))
    __obj.asInstanceOf[IServerDataPushSink]
  }
}

