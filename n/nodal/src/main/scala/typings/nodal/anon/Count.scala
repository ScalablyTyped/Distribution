package typings.nodal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Count extends js.Object {
  var count: Double = js.native
  var error: js.Any = js.native
  var offset: Double = js.native
  var resource: js.Any = js.native
  var summary: js.UndefOr[String | Null] = js.native
  var total: Double = js.native
}

object Count {
  @scala.inline
  def apply(count: Double, error: js.Any, offset: Double, resource: js.Any, total: Double): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: js.Any): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setSummaryNull: Self = this.set("summary", null)
  }
  
}

