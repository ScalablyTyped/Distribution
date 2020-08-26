package typings.nodeZendesk.mod.Tickets.Comments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var flag_options: js.Any = js.native
  var flags: js.UndefOr[js.Array[Double]] = js.native
}

object Metadata {
  @scala.inline
  def apply(flag_options: js.Any): Metadata = {
    val __obj = js.Dynamic.literal(flag_options = flag_options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
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
    def setFlag_options(value: js.Any): Self = this.set("flag_options", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlagsVarargs(value: Double*): Self = this.set("flags", js.Array(value :_*))
    @scala.inline
    def setFlags(value: js.Array[Double]): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
  }
  
}

