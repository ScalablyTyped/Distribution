package typings
package ngDashTableLib.srcBrowserPublicDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITableInputAttributes
  extends angularLib.angularMod.angularNs.IAttributes {
  var disableFilter: js.UndefOr[java.lang.String] = js.undefined
  var ngTable: js.UndefOr[java.lang.String] = js.undefined
  var ngTableDynamic: js.UndefOr[java.lang.String] = js.undefined
  var showFilter: js.UndefOr[java.lang.String] = js.undefined
  var showGroup: js.UndefOr[java.lang.String] = js.undefined
  var templateHeader: js.UndefOr[java.lang.String] = js.undefined
  var templatePagination: js.UndefOr[java.lang.String] = js.undefined
}

object ITableInputAttributes {
  @scala.inline
  def apply(
    $addClass: js.Function1[java.lang.String, scala.Unit],
    $attr: js.Object,
    $normalize: js.Function1[java.lang.String, java.lang.String],
    $observe: js.Function2[
      java.lang.String, 
      js.Function1[/* value */ js.UndefOr[js.Any], _], 
      angularLib.angularMod.Global.Function
    ],
    $removeClass: js.Function1[java.lang.String, scala.Unit],
    $set: js.Function2[java.lang.String, js.Any, scala.Unit],
    $updateClass: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    disableFilter: java.lang.String = null,
    ngTable: java.lang.String = null,
    ngTableDynamic: java.lang.String = null,
    showFilter: java.lang.String = null,
    showGroup: java.lang.String = null,
    templateHeader: java.lang.String = null,
    templatePagination: java.lang.String = null
  ): ITableInputAttributes = {
    val __obj = js.Dynamic.literal($addClass = $addClass, $attr = $attr, $normalize = $normalize, $observe = $observe, $removeClass = $removeClass, $set = $set, $updateClass = $updateClass)
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

