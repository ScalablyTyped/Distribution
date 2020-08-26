package typings.nodePgMigrate.tablesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LikeOptions extends js.Object {
  var excluding: js.UndefOr[Like | js.Array[Like]] = js.native
  var including: js.UndefOr[Like | js.Array[Like]] = js.native
}

object LikeOptions {
  @scala.inline
  def apply(): LikeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LikeOptions]
  }
  @scala.inline
  implicit class LikeOptionsOps[Self <: LikeOptions] (val x: Self) extends AnyVal {
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
    def setExcludingVarargs(value: Like*): Self = this.set("excluding", js.Array(value :_*))
    @scala.inline
    def setExcluding(value: Like | js.Array[Like]): Self = this.set("excluding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcluding: Self = this.set("excluding", js.undefined)
    @scala.inline
    def setIncludingVarargs(value: Like*): Self = this.set("including", js.Array(value :_*))
    @scala.inline
    def setIncluding(value: Like | js.Array[Like]): Self = this.set("including", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncluding: Self = this.set("including", js.undefined)
  }
  
}

