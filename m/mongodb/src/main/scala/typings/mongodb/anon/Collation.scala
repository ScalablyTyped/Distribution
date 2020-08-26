package typings.mongodb.anon

import typings.mongodb.mod.FilterQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collation[TSchema] extends js.Object {
  var collation: js.UndefOr[js.Object] = js.native
  var filter: FilterQuery[TSchema] = js.native
  var hint: js.UndefOr[String | js.Object] = js.native
  var replacement: TSchema = js.native
  var upsert: js.UndefOr[Boolean] = js.native
}

object Collation {
  @scala.inline
  def apply[TSchema](filter: FilterQuery[TSchema], replacement: TSchema): Collation[TSchema] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collation[TSchema]]
  }
  @scala.inline
  implicit class CollationOps[Self <: Collation[_], TSchema] (val x: Self with Collation[TSchema]) extends AnyVal {
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
    def setFilter(value: FilterQuery[TSchema]): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacement(value: TSchema): Self = this.set("replacement", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollation(value: js.Object): Self = this.set("collation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    @scala.inline
    def setHint(value: String | js.Object): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
  }
  
}

