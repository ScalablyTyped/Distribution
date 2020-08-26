package typings.nivoLegends.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuantileLegendProps extends js.Object {
  var domain: js.UndefOr[js.Array[Double]] = js.native
  var scale: js.Any = js.native
}

object QuantileLegendProps {
  @scala.inline
  def apply(scale: js.Any): QuantileLegendProps = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantileLegendProps]
  }
  @scala.inline
  implicit class QuantileLegendPropsOps[Self <: QuantileLegendProps] (val x: Self) extends AnyVal {
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
    def setScale(value: js.Any): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainVarargs(value: Double*): Self = this.set("domain", js.Array(value :_*))
    @scala.inline
    def setDomain(value: js.Array[Double]): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
  }
  
}

