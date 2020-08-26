package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerDataPushSink extends js.Object {
  def OnServerDataPush(RequestID: Double, JsonDataContent: String): Unit = js.native
}

object IServerDataPushSink {
  @scala.inline
  def apply(OnServerDataPush: (Double, String) => Unit): IServerDataPushSink = {
    val __obj = js.Dynamic.literal(OnServerDataPush = js.Any.fromFunction2(OnServerDataPush))
    __obj.asInstanceOf[IServerDataPushSink]
  }
  @scala.inline
  implicit class IServerDataPushSinkOps[Self <: IServerDataPushSink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnServerDataPush(value: (Double, String) => Unit): Self = this.set("OnServerDataPush", js.Any.fromFunction2(value))
  }
  
}

