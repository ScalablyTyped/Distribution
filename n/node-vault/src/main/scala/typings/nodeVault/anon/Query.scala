package typings.nodeVault.anon

import typings.nodeVault.mod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  var query: js.UndefOr[Option] = js.native
  var req: js.UndefOr[Option] = js.native
  var res: js.UndefOr[Option] = js.native
}

object Query {
  @scala.inline
  def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
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
    def setQuery(value: Option): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setReq(value: Option): Self = this.set("req", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReq: Self = this.set("req", js.undefined)
    @scala.inline
    def setRes(value: Option): Self = this.set("res", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRes: Self = this.set("res", js.undefined)
  }
  
}

