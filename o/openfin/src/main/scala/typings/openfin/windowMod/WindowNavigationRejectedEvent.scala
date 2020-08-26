package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowNavigationRejectedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var sourceName: js.UndefOr[String] = js.native
  var url: String = js.native
}

object WindowNavigationRejectedEvent {
  @scala.inline
  def apply[Topic, Type](name: String, topic: Topic, `type`: Type, url: String, uuid: String): WindowNavigationRejectedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowNavigationRejectedEvent[Topic, Type]]
  }
  @scala.inline
  implicit class WindowNavigationRejectedEventOps[Self <: WindowNavigationRejectedEvent[_, _], Topic, Type] (val x: Self with (WindowNavigationRejectedEvent[Topic, Type])) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceName(value: String): Self = this.set("sourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceName: Self = this.set("sourceName", js.undefined)
  }
  
}

