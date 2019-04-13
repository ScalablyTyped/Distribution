package typings
package ngDashTableLib.srcBrowserPublicDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnDef extends js.Object {
  /**
    * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
    *
    * To set this on the `td` tag of a html table use the attribute `header-class` or `data-header-class`
    */
  @JSName("class")
  var class_Original: IColumnField[java.lang.String] = js.native
  /**
    * The `ISelectOption`s that can be used in a html filter template for this colums.
    */
  var data: js.UndefOr[SelectData] = js.native
  /**
    * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
    * At the creation of the `NgTableParams` this field will be called and the result then assigned
    * to the `data` field of this column.
    */
  @JSName("filterData")
  var filterData_Original: IColumnField[angularLib.angularMod.IPromise[SelectData] | SelectData] = js.native
  /**
    * The definition of 0 or more html filter templates that should be rendered for this column in
    * the table header
    */
  @JSName("filter")
  var filter_Original: IColumnField[IFilterTemplateDefMap] = js.native
  /**
    * The name of the data row field that will be used to group on, or false when this column
    * does not support grouping
    */
  @JSName("groupable")
  var groupable_Original: IColumnField[java.lang.String | scala.Boolean] = js.native
  /**
    * The url of a custom html template that should be used to render a table header for this column
    *
    * To set this on the `td` tag for a html table use the attribute `header` or `data-header`
    */
  @JSName("headerTemplateURL")
  var headerTemplateURL_Original: IColumnField[java.lang.String | scala.Boolean] = js.native
  /**
    * The text that should be used as a tooltip for this column in the table header
    */
  @JSName("headerTitle")
  var headerTitle_Original: IColumnField[java.lang.String] = js.native
  /**
    * The index position of this column within the `$columns` container array
    */
  var id: scala.Double = js.native
  /**
    * Determines whether this column should be displayed in the table
    *
    * To set this on the `td` tag for a html table use the attribute `ng-if`
    */
  @JSName("show")
  var show_Original: IColumnField[scala.Boolean] = js.native
  /**
    * The name of the data row field that will be used to sort on, or false when this column
    * does not support sorting
    */
  @JSName("sortable")
  var sortable_Original: IColumnField[java.lang.String | scala.Boolean] = js.native
  /**
    * An alternate column title. Typically this can be used for responsive table layouts
    * where the titleAlt should be used for small screen sizes
    */
  @JSName("titleAlt")
  var titleAlt_Original: IColumnField[java.lang.String] = js.native
  /**
    * The title of this column that should be displayed in the table header
    */
  @JSName("title")
  var title_Original: IColumnField[java.lang.String] = js.native
  /**
    * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
    *
    * To set this on the `td` tag of a html table use the attribute `header-class` or `data-header-class`
    */
  def `class`(): java.lang.String = js.native
  def `class`(context: ColumnFieldContext): java.lang.String = js.native
  /**
    * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
    *
    * To set this on the `td` tag of a html table use the attribute `header-class` or `data-header-class`
    */
  def `class`(value: java.lang.String): scala.Unit = js.native
  /**
    * The definition of 0 or more html filter templates that should be rendered for this column in
    * the table header
    */
  def filter(): IFilterTemplateDefMap = js.native
  def filter(context: ColumnFieldContext): IFilterTemplateDefMap = js.native
  /**
    * The definition of 0 or more html filter templates that should be rendered for this column in
    * the table header
    */
  def filter(value: IFilterTemplateDefMap): scala.Unit = js.native
  /**
    * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
    * At the creation of the `NgTableParams` this field will be called and the result then assigned
    * to the `data` field of this column.
    */
  def filterData(): angularLib.angularMod.IPromise[SelectData] | SelectData = js.native
  def filterData(context: ColumnFieldContext): angularLib.angularMod.IPromise[SelectData] | SelectData = js.native
  /**
    * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
    * At the creation of the `NgTableParams` this field will be called and the result then assigned
    * to the `data` field of this column.
    */
  def filterData(value: angularLib.angularMod.IPromise[SelectData]): scala.Unit = js.native
  def filterData(value: SelectData): scala.Unit = js.native
  /**
    * The name of the data row field that will be used to group on, or false when this column
    * does not support grouping
    */
  def groupable(): java.lang.String | scala.Boolean = js.native
  def groupable(context: ColumnFieldContext): java.lang.String | scala.Boolean = js.native
  /**
    * The name of the data row field that will be used to group on, or false when this column
    * does not support grouping
    */
  def groupable(value: java.lang.String): scala.Unit = js.native
  def groupable(value: scala.Boolean): scala.Unit = js.native
  /**
    * The url of a custom html template that should be used to render a table header for this column
    *
    * To set this on the `td` tag for a html table use the attribute `header` or `data-header`
    */
  def headerTemplateURL(): java.lang.String | scala.Boolean = js.native
  def headerTemplateURL(context: ColumnFieldContext): java.lang.String | scala.Boolean = js.native
  /**
    * The url of a custom html template that should be used to render a table header for this column
    *
    * To set this on the `td` tag for a html table use the attribute `header` or `data-header`
    */
  def headerTemplateURL(value: java.lang.String): scala.Unit = js.native
  def headerTemplateURL(value: scala.Boolean): scala.Unit = js.native
  /**
    * The text that should be used as a tooltip for this column in the table header
    */
  def headerTitle(): java.lang.String = js.native
  def headerTitle(context: ColumnFieldContext): java.lang.String = js.native
  /**
    * The text that should be used as a tooltip for this column in the table header
    */
  def headerTitle(value: java.lang.String): scala.Unit = js.native
  /**
    * Determines whether this column should be displayed in the table
    *
    * To set this on the `td` tag for a html table use the attribute `ng-if`
    */
  def show(): scala.Boolean = js.native
  def show(context: ColumnFieldContext): scala.Boolean = js.native
  /**
    * Determines whether this column should be displayed in the table
    *
    * To set this on the `td` tag for a html table use the attribute `ng-if`
    */
  def show(value: scala.Boolean): scala.Unit = js.native
  /**
    * The name of the data row field that will be used to sort on, or false when this column
    * does not support sorting
    */
  def sortable(): java.lang.String | scala.Boolean = js.native
  def sortable(context: ColumnFieldContext): java.lang.String | scala.Boolean = js.native
  /**
    * The name of the data row field that will be used to sort on, or false when this column
    * does not support sorting
    */
  def sortable(value: java.lang.String): scala.Unit = js.native
  def sortable(value: scala.Boolean): scala.Unit = js.native
  /**
    * The title of this column that should be displayed in the table header
    */
  def title(): java.lang.String = js.native
  def title(context: ColumnFieldContext): java.lang.String = js.native
  /**
    * The title of this column that should be displayed in the table header
    */
  def title(value: java.lang.String): scala.Unit = js.native
  /**
    * An alternate column title. Typically this can be used for responsive table layouts
    * where the titleAlt should be used for small screen sizes
    */
  def titleAlt(): java.lang.String = js.native
  def titleAlt(context: ColumnFieldContext): java.lang.String = js.native
  /**
    * An alternate column title. Typically this can be used for responsive table layouts
    * where the titleAlt should be used for small screen sizes
    */
  def titleAlt(value: java.lang.String): scala.Unit = js.native
}

