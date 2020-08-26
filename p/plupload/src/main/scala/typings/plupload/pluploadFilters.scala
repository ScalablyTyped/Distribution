package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pluploadFilters extends js.Object {
  var max_file_size: js.UndefOr[Double | String] = js.native
  var mime_types: js.UndefOr[js.Array[pluploadFiltersMimeTypes]] = js.native
  var prevent_duplicates: js.UndefOr[Boolean] = js.native
}

object pluploadFilters {
  @scala.inline
  def apply(): pluploadFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluploadFilters]
  }
  @scala.inline
  implicit class pluploadFiltersOps[Self <: pluploadFilters] (val x: Self) extends AnyVal {
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
    def setMax_file_size(value: Double | String): Self = this.set("max_file_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_file_size: Self = this.set("max_file_size", js.undefined)
    @scala.inline
    def setMime_typesVarargs(value: pluploadFiltersMimeTypes*): Self = this.set("mime_types", js.Array(value :_*))
    @scala.inline
    def setMime_types(value: js.Array[pluploadFiltersMimeTypes]): Self = this.set("mime_types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMime_types: Self = this.set("mime_types", js.undefined)
    @scala.inline
    def setPrevent_duplicates(value: Boolean): Self = this.set("prevent_duplicates", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevent_duplicates: Self = this.set("prevent_duplicates", js.undefined)
  }
  
}

