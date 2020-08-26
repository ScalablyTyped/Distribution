package typings.plottable.categoryAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDownsampleInfo extends js.Object {
  var domain: js.Array[String] = js.native
  var stepWidth: Double = js.native
}

object IDownsampleInfo {
  @scala.inline
  def apply(domain: js.Array[String], stepWidth: Double): IDownsampleInfo = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], stepWidth = stepWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDownsampleInfo]
  }
  @scala.inline
  implicit class IDownsampleInfoOps[Self <: IDownsampleInfo] (val x: Self) extends AnyVal {
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
    def setDomainVarargs(value: String*): Self = this.set("domain", js.Array(value :_*))
    @scala.inline
    def setDomain(value: js.Array[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepWidth(value: Double): Self = this.set("stepWidth", value.asInstanceOf[js.Any])
  }
  
}

