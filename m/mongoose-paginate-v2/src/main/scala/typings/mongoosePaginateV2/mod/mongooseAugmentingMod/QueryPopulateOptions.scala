package typings.mongoosePaginateV2.mod.mongooseAugmentingMod

import typings.mongoose.mod.Model_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryPopulateOptions extends js.Object {
  /** optional query conditions to match */
  var `match`: js.UndefOr[js.Any] = js.native
  /** optional model to use for population */
  var model: js.UndefOr[String | (Model_[_, js.Object])] = js.native
  /** optional query options like sort, limit, etc */
  var options: js.UndefOr[js.Any] = js.native
  /** space delimited path(s) to populate */
  var path: String = js.native
  /** deep populate */
  var populate: js.UndefOr[QueryPopulateOptions | js.Array[QueryPopulateOptions]] = js.native
  /** optional fields to select */
  var select: js.UndefOr[js.Any] = js.native
}

object QueryPopulateOptions {
  @scala.inline
  def apply(path: String): QueryPopulateOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPopulateOptions]
  }
  @scala.inline
  implicit class QueryPopulateOptionsOps[Self <: QueryPopulateOptions] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch(value: js.Any): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setModel(value: String | (Model_[_, js.Object])): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPopulateVarargs(value: QueryPopulateOptions*): Self = this.set("populate", js.Array(value :_*))
    @scala.inline
    def setPopulate(value: QueryPopulateOptions | js.Array[QueryPopulateOptions]): Self = this.set("populate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulate: Self = this.set("populate", js.undefined)
    @scala.inline
    def setSelect(value: js.Any): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
  
}

