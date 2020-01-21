package typings.ngTable.publicInterfacesMod

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDynamicTableColDef extends js.Object {
  /**
    * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
    */
  var `class`: js.UndefOr[DynamicTableColField[String]] = js.undefined
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
  var filterData: js.UndefOr[DynamicTableColField[IPromise[SelectData] | SelectData]] = js.undefined
  /**
    * The name of the data row field that will be used to group on, or false when this column
    * does not support grouping
    */
  var groupable: js.UndefOr[DynamicTableColField[String | Boolean]] = js.undefined
  /**
    * The url of a custom html template that should be used to render a table header for this column
    */
  var headerTemplateURL: js.UndefOr[DynamicTableColField[String | Boolean]] = js.undefined
  /**
    * The text that should be used as a tooltip for this column in the table header
    */
  var headerTitle: js.UndefOr[DynamicTableColField[String]] = js.undefined
  /**
    * Determines whether this column should be displayed in the table
    */
  var show: js.UndefOr[DynamicTableColField[Boolean]] = js.undefined
  /**
    * The name of the data row field that will be used to sort on, or false when this column
    * does not support sorting
    */
  var sortable: js.UndefOr[DynamicTableColField[String | Boolean]] = js.undefined
  /**
    * The title of this column that should be displayed in the table header
    */
  var title: js.UndefOr[DynamicTableColField[String]] = js.undefined
  /**
    * An alternate column title. Typically this can be used for responsive table layouts
    * where the titleAlt should be used for small screen sizes
    */
  var titleAlt: js.UndefOr[DynamicTableColField[String]] = js.undefined
}

object IDynamicTableColDef {
  @scala.inline
  def apply(
    `class`: DynamicTableColField[String] = null,
    filter: DynamicTableColField[IFilterTemplateDefMap] = null,
    filterData: DynamicTableColField[IPromise[SelectData] | SelectData] = null,
    groupable: DynamicTableColField[String | Boolean] = null,
    headerTemplateURL: DynamicTableColField[String | Boolean] = null,
    headerTitle: DynamicTableColField[String] = null,
    show: DynamicTableColField[Boolean] = null,
    sortable: DynamicTableColField[String | Boolean] = null,
    title: DynamicTableColField[String] = null,
    titleAlt: DynamicTableColField[String] = null
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

