package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableFilter extends js.Object {
  var classes: js.UndefOr[js.Object] = js.native
  var filterData: js.Array[_] = js.native
  var filterList: js.UndefOr[js.Array[js.Array[String]]] = js.native
  var onFilterRest: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var onFilterUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var options: js.Object = js.native
}

object MUIDataTableFilter {
  @scala.inline
  def apply(filterData: js.Array[_], options: js.Object): MUIDataTableFilter = {
    val __obj = js.Dynamic.literal(filterData = filterData.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableFilter]
  }
  @scala.inline
  implicit class MUIDataTableFilterOps[Self <: MUIDataTableFilter] (val x: Self) extends AnyVal {
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
    def setFilterDataVarargs(value: js.Any*): Self = this.set("filterData", js.Array(value :_*))
    @scala.inline
    def setFilterData(value: js.Array[_]): Self = this.set("filterData", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setClasses(value: js.Object): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setFilterListVarargs(value: js.Array[String]*): Self = this.set("filterList", js.Array(value :_*))
    @scala.inline
    def setFilterList(value: js.Array[js.Array[String]]): Self = this.set("filterList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterList: Self = this.set("filterList", js.undefined)
    @scala.inline
    def setOnFilterRest(value: /* args */ js.Any => _): Self = this.set("onFilterRest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFilterRest: Self = this.set("onFilterRest", js.undefined)
    @scala.inline
    def setOnFilterUpdate(value: /* args */ js.Any => _): Self = this.set("onFilterUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFilterUpdate: Self = this.set("onFilterUpdate", js.undefined)
  }
  
}

