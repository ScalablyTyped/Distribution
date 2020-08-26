package typings.nyaapi.mod.pantsu

import typings.nyaapi.nyaapiStrings.b
import typings.nyaapi.nyaapiStrings.g
import typings.nyaapi.nyaapiStrings.k
import typings.nyaapi.nyaapiStrings.m
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchOptions extends js.Object {
  var c: js.UndefOr[Category] = js.native
  var dateType: js.UndefOr[String] = js.native
  var fromDate: js.UndefOr[String] = js.native
  var fromID: js.UndefOr[String] = js.native
  var lang: js.UndefOr[js.Array[String]] = js.native
  var maxSize: js.UndefOr[String] = js.native
  var maxage: js.UndefOr[String] = js.native
  var minSize: js.UndefOr[String] = js.native
  var n: js.UndefOr[Double] = js.native
  var order: js.UndefOr[Boolean] = js.native
  var page: js.UndefOr[Double] = js.native
  var s: js.UndefOr[String] = js.native
  var sizeType: js.UndefOr[b | k | m | g] = js.native
  var sort: js.UndefOr[SortType] = js.native
  var term: js.UndefOr[String] = js.native
  var toDate: js.UndefOr[String] = js.native
  var userID: js.UndefOr[String] = js.native
}

object SearchOptions {
  @scala.inline
  def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  @scala.inline
  implicit class SearchOptionsOps[Self <: SearchOptions] (val x: Self) extends AnyVal {
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
    def setC(value: Category): Self = this.set("c", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
    @scala.inline
    def setDateType(value: String): Self = this.set("dateType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateType: Self = this.set("dateType", js.undefined)
    @scala.inline
    def setFromDate(value: String): Self = this.set("fromDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromDate: Self = this.set("fromDate", js.undefined)
    @scala.inline
    def setFromID(value: String): Self = this.set("fromID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromID: Self = this.set("fromID", js.undefined)
    @scala.inline
    def setLangVarargs(value: String*): Self = this.set("lang", js.Array(value :_*))
    @scala.inline
    def setLang(value: js.Array[String]): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setMaxSize(value: String): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setMaxage(value: String): Self = this.set("maxage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxage: Self = this.set("maxage", js.undefined)
    @scala.inline
    def setMinSize(value: String): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    @scala.inline
    def setN(value: Double): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    @scala.inline
    def setOrder(value: Boolean): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    @scala.inline
    def setSizeType(value: b | k | m | g): Self = this.set("sizeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeType: Self = this.set("sizeType", js.undefined)
    @scala.inline
    def setSort(value: SortType): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerm: Self = this.set("term", js.undefined)
    @scala.inline
    def setToDate(value: String): Self = this.set("toDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToDate: Self = this.set("toDate", js.undefined)
    @scala.inline
    def setUserID(value: String): Self = this.set("userID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserID: Self = this.set("userID", js.undefined)
  }
  
}

