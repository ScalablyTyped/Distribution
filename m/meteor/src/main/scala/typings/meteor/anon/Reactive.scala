package typings.meteor.anon

import typings.meteor.mongoMod.Mongo.FieldSpecifier
import typings.meteor.mongoMod.Mongo.SortSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reactive extends js.Object {
  var fields: js.UndefOr[FieldSpecifier] = js.native
  var reactive: js.UndefOr[Boolean] = js.native
  var skip: js.UndefOr[Double] = js.native
  var sort: js.UndefOr[SortSpecifier] = js.native
  var transform: js.UndefOr[js.Function | Null] = js.native
}

object Reactive {
  @scala.inline
  def apply(): Reactive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reactive]
  }
  @scala.inline
  implicit class ReactiveOps[Self <: Reactive] (val x: Self) extends AnyVal {
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
    def setFields(value: FieldSpecifier): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setReactive(value: Boolean): Self = this.set("reactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReactive: Self = this.set("reactive", js.undefined)
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setSort(value: SortSpecifier): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setTransform(value: js.Function): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setTransformNull: Self = this.set("transform", null)
  }
  
}

