package typings.plotlyJs.anon

import typings.plotlyJs.mod.DTickValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.TickFormatStop> */
@js.native
trait PartialTickFormatStop extends js.Object {
  var dtickrange: js.UndefOr[js.Tuple2[DTickValue | Null, DTickValue | Null]] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var templateitemname: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object PartialTickFormatStop {
  @scala.inline
  def apply(): PartialTickFormatStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTickFormatStop]
  }
  @scala.inline
  implicit class PartialTickFormatStopOps[Self <: PartialTickFormatStop] (val x: Self) extends AnyVal {
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
    def setDtickrange(value: js.Tuple2[DTickValue | Null, DTickValue | Null]): Self = this.set("dtickrange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtickrange: Self = this.set("dtickrange", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTemplateitemname(value: String): Self = this.set("templateitemname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateitemname: Self = this.set("templateitemname", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

