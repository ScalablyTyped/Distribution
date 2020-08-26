package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialConfig
import typings.plotlyJs.anon.PartialLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforePlotEvent extends js.Object {
  var config: PartialConfig = js.native
  var data: js.Array[Data] = js.native
  var layout: PartialLayout = js.native
}

object BeforePlotEvent {
  @scala.inline
  def apply(config: PartialConfig, data: js.Array[Data], layout: PartialLayout): BeforePlotEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforePlotEvent]
  }
  @scala.inline
  implicit class BeforePlotEventOps[Self <: BeforePlotEvent] (val x: Self) extends AnyVal {
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
    def setConfig(value: PartialConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: Data*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Data]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: PartialLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
  }
  
}

