package typings.ngDashTable.srcBrowserPublicDashInterfacesMod

import typings.angular.angularMod.IAttributes
import typings.angular.angularMod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITableInputAttributes extends IAttributes {
  var disableFilter: js.UndefOr[String] = js.undefined
  var ngTable: js.UndefOr[String] = js.undefined
  var ngTableDynamic: js.UndefOr[String] = js.undefined
  var showFilter: js.UndefOr[String] = js.undefined
  var showGroup: js.UndefOr[String] = js.undefined
  var templateHeader: js.UndefOr[String] = js.undefined
  var templatePagination: js.UndefOr[String] = js.undefined
}

object ITableInputAttributes {
  @scala.inline
  def apply(
    $addClass: String => Unit,
    $attr: js.Object,
    $normalize: String => String,
    $observe: (String, js.Function1[/* value */ js.UndefOr[js.Any], _]) => Function,
    $removeClass: String => Unit,
    $set: (String, js.Any) => Unit,
    $updateClass: (String, String) => Unit,
    disableFilter: String = null,
    ngTable: String = null,
    ngTableDynamic: String = null,
    showFilter: String = null,
    showGroup: String = null,
    templateHeader: String = null,
    templatePagination: String = null
  ): ITableInputAttributes = {
    val __obj = js.Dynamic.literal($addClass = js.Any.fromFunction1($addClass), $attr = $attr, $normalize = js.Any.fromFunction1($normalize), $observe = js.Any.fromFunction2($observe), $removeClass = js.Any.fromFunction1($removeClass), $set = js.Any.fromFunction2($set), $updateClass = js.Any.fromFunction2($updateClass))
    if (disableFilter != null) __obj.updateDynamic("disableFilter")(disableFilter)
    if (ngTable != null) __obj.updateDynamic("ngTable")(ngTable)
    if (ngTableDynamic != null) __obj.updateDynamic("ngTableDynamic")(ngTableDynamic)
    if (showFilter != null) __obj.updateDynamic("showFilter")(showFilter)
    if (showGroup != null) __obj.updateDynamic("showGroup")(showGroup)
    if (templateHeader != null) __obj.updateDynamic("templateHeader")(templateHeader)
    if (templatePagination != null) __obj.updateDynamic("templatePagination")(templatePagination)
    __obj.asInstanceOf[ITableInputAttributes]
  }
}

