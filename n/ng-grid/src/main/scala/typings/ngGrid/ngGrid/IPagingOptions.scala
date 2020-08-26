package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPagingOptions extends js.Object {
  /** currentPage: the uhm... current page. */
  var currentPage: js.UndefOr[Double] = js.native
  /** pageSize: currently selected page size.  */
  var pageSize: js.UndefOr[Double] = js.native
  /**  pageSizes: list of available page sizes.  */
  var pageSizes: js.UndefOr[js.Array[Double]] = js.native
  /** totalServerItems: Total items are on the server.  */
  var totalServerItems: js.UndefOr[Double] = js.native
}

object IPagingOptions {
  @scala.inline
  def apply(): IPagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPagingOptions]
  }
  @scala.inline
  implicit class IPagingOptionsOps[Self <: IPagingOptions] (val x: Self) extends AnyVal {
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
    def setCurrentPage(value: Double): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPage: Self = this.set("currentPage", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageSizesVarargs(value: Double*): Self = this.set("pageSizes", js.Array(value :_*))
    @scala.inline
    def setPageSizes(value: js.Array[Double]): Self = this.set("pageSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizes: Self = this.set("pageSizes", js.undefined)
    @scala.inline
    def setTotalServerItems(value: Double): Self = this.set("totalServerItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalServerItems: Self = this.set("totalServerItems", js.undefined)
  }
  
}

