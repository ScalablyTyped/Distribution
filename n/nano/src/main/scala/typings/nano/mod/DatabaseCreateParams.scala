package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseCreateParams extends js.Object {
  var n: js.UndefOr[Double] = js.native
  var partitioned: js.UndefOr[Boolean] = js.native
  var q: js.UndefOr[Double] = js.native
}

object DatabaseCreateParams {
  @scala.inline
  def apply(): DatabaseCreateParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseCreateParams]
  }
  @scala.inline
  implicit class DatabaseCreateParamsOps[Self <: DatabaseCreateParams] (val x: Self) extends AnyVal {
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
    def setN(value: Double): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    @scala.inline
    def setPartitioned(value: Boolean): Self = this.set("partitioned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitioned: Self = this.set("partitioned", js.undefined)
    @scala.inline
    def setQ(value: Double): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
  }
  
}

