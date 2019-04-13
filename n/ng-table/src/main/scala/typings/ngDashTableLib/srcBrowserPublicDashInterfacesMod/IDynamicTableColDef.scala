package typings
package ngDashTableLib.srcBrowserPublicDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDynamicTableColDef extends js.Object {
  /**
    * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
    */
  var `class`: js.UndefOr[DynamicTableColField[java.lang.String]] = js.undefined
  /**
    * The definition of 0 or more html filter templates that should be rendered for this column in
    * the table header
    */
  var filter: js.UndefOr[DynamicTableColField[IFilterTemplateDefMap]] = js.undefined
  /**
    * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
    * At the creation of the `NgTableParams` this field will be called and the result then assigned
    * to the `data` field of this column.
    */
  var filterData: js.UndefOr[DynamicTableColField[angularLib.angularMod.IPromise[SelectData] | SelectData]] = js.undefined
  /**
    * The name of the data row field that will be used to group on, or false when this column
    * does not support grouping
    */
  var groupable: js.UndefOr[DynamicTableColField[java.lang.String | scala.Boolean]] = js.undefined
  /**
    * The url of a custom html template that should be used to render a table header for this column
    */
  var headerTemplateURL: js.UndefOr[DynamicTableColField[java.lang.String | scala.Boolean]] = js.undefined
  /**
    * The text that should be used as a tooltip for this column in the table header
    */
  var headerTitle: js.UndefOr[DynamicTableColField[java.lang.String]] = js.undefined
  /**
    * Determines whether this column should be displayed in the table
    */
  var show: js.UndefOr[DynamicTableColField[scala.Boolean]] = js.undefined
  /**
    * The name of the data row field that will be used to sort on, or false when this column
    * does not support sorting
    */
  var sortable: js.UndefOr[DynamicTableColField[java.lang.String | scala.Boolean]] = js.undefined
  /**
    * The title of this column that should be displayed in the table header
    */
  var title: js.UndefOr[DynamicTableColField[java.lang.String]] = js.undefined
  /**
    * An alternate column title. Typically this can be used for responsive table layouts
    * where the titleAlt should be used for small screen sizes
    */
  var titleAlt: js.UndefOr[DynamicTableColField[java.lang.String]] = js.undefined
}

object IDynamicTableColDef {
  @scala.inline
  def apply(
    `class`: DynamicTableColField[java.lang.String] = null,
    filter: DynamicTableColField[IFilterTemplateDefMap] = null,
    filterData: DynamicTableColField[angularLib.angularMod.IPromise[SelectData] | SelectData] = null,
    groupable: DynamicTableColField[java.lang.String | scala.Boolean] = null,
    headerTemplateURL: DynamicTableColField[java.lang.String | scala.Boolean] = null,
    headerTitle: DynamicTableColField[java.lang.String] = null,
    show: DynamicTableColField[scala.Boolean] = null,
    sortable: DynamicTableColField[java.lang.String | scala.Boolean] = null,
    title: DynamicTableColField[java.lang.String] = null,
    titleAlt: DynamicTableColField[java.lang.String] = null
  ): IDynamicTableColDef = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterData != null) __obj.updateDynamic("filterData")(filterData.asInstanceOf[js.Any])
    if (groupable != null) __obj.updateDynamic("groupable")(groupable.asInstanceOf[js.Any])
    if (headerTemplateURL != null) __obj.updateDynamic("headerTemplateURL")(headerTemplateURL.asInstanceOf[js.Any])
    if (headerTitle != null) __obj.updateDynamic("headerTitle")(headerTitle.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleAlt != null) __obj.updateDynamic("titleAlt")(titleAlt.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDynamicTableColDef]
  }
}

