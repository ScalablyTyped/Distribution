package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pageable extends js.Object {
  var page: js.UndefOr[Double] = js.native
  var page_size: js.UndefOr[Double] = js.native
}

object Pageable {
  @scala.inline
  def apply(): Pageable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pageable]
  }
  @scala.inline
  implicit class PageableOps[Self <: Pageable] (val x: Self) extends AnyVal {
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
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPage_size(value: Double): Self = this.set("page_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage_size: Self = this.set("page_size", js.undefined)
  }
  
}

