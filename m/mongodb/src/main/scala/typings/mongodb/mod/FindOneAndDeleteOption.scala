package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindOneAndDeleteOption extends js.Object {
  var collation: js.UndefOr[CollationDocument] = js.native
  var maxTimeMS: js.UndefOr[scala.Double] = js.native
  var projection: js.UndefOr[js.Object] = js.native
  var session: js.UndefOr[ClientSession] = js.native
  var sort: js.UndefOr[js.Object] = js.native
}

object FindOneAndDeleteOption {
  @scala.inline
  def apply(): FindOneAndDeleteOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndDeleteOption]
  }
  @scala.inline
  implicit class FindOneAndDeleteOptionOps[Self <: FindOneAndDeleteOption] (val x: Self) extends AnyVal {
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
    def setCollation(value: CollationDocument): Self = this.set("collation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    @scala.inline
    def setMaxTimeMS(value: scala.Double): Self = this.set("maxTimeMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTimeMS: Self = this.set("maxTimeMS", js.undefined)
    @scala.inline
    def setProjection(value: js.Object): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setSort(value: js.Object): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

