package typings.meteor.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayFilters extends js.Object {
  var arrayFilters: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var upsert: js.UndefOr[Boolean] = js.native
}

object ArrayFilters {
  @scala.inline
  def apply(): ArrayFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayFilters]
  }
  @scala.inline
  implicit class ArrayFiltersOps[Self <: ArrayFilters] (val x: Self) extends AnyVal {
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
    def setArrayFiltersVarargs(value: StringDictionary[js.Any]*): Self = this.set("arrayFilters", js.Array(value :_*))
    @scala.inline
    def setArrayFilters(value: js.Array[StringDictionary[_]]): Self = this.set("arrayFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayFilters: Self = this.set("arrayFilters", js.undefined)
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
  }
  
}

