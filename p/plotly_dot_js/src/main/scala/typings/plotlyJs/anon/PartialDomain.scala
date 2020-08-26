package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Domain> */
@js.native
trait PartialDomain extends js.Object {
  var column: js.UndefOr[Double] = js.native
  var row: js.UndefOr[Double] = js.native
  var x: js.UndefOr[js.Array[Double]] = js.native
  var y: js.UndefOr[js.Array[Double]] = js.native
}

object PartialDomain {
  @scala.inline
  def apply(): PartialDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDomain]
  }
  @scala.inline
  implicit class PartialDomainOps[Self <: PartialDomain] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setXVarargs(value: Double*): Self = this.set("x", js.Array(value :_*))
    @scala.inline
    def setX(value: js.Array[Double]): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setYVarargs(value: Double*): Self = this.set("y", js.Array(value :_*))
    @scala.inline
    def setY(value: js.Array[Double]): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

