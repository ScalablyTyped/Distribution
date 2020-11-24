package typings.ngTable.publicInterfacesMod

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnDef extends js.Object {
  
  /**
    * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
    *
    * To set this on the `td` tag of a html table use the attribute `header-class` or `data-header-class`
    */
  def `class`(): String = js.native
  def `class`(context: ColumnFieldContext): String = js.native
  /**
    * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
    *
    * To set this on the `td` tag of a html table use the attribute `header-class` or `data-header-class`
    */
  def `class`(value: String): Unit = js.native
  /**
    * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
    *
    * To set this on the `td` tag of a html table use the attribute `header-class` or `data-header-class`
    */
  @JSName("class")
  var class_Original: IColumnField[String] = js.native
  
  /**
    * The `ISelectOption`s that can be used in a html filter template for this colums.
    */
  var data: js.UndefOr[SelectData] = js.native
  
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
  def filter(value: IFilterTemplateDefMap): Unit = js.native
  
  /**
    * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
    * At the creation of the `NgTableParams` this field will be called and the result then assigned
    * to the `data` field of this column.
    */
  def filterData(): IPromise[SelectData] | SelectData = js.native
  def filterData(context: ColumnFieldContext): IPromise[SelectData] | SelectData = js.native
  /**
    * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
    * At the creation of the `NgTableParams` this field will be called and the result then assigned
    * to the `data` field of this column.
    */
  def filterData(value: IPromise[SelectData]): Unit = js.native
  def filterData(value: SelectData): Unit = js.native
  /**
    * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
    * At the creation of the `NgTableParams` this field will be called and the result then assigned
    * to the `data` field of this column.
    */
  @JSName("filterData")
  var filterData_Original: IColumnField[IPromise[SelectData] | SelectData] = js.native
  
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
  def groupable(): String | Boolean = js.native
  def groupable(context: ColumnFieldContext): String | Boolean = js.native
  /**
    * The name of the data row field that will be used to group on, or false when this column
    * does not support grouping
    */
  def groupable(value: String): Unit = js.native
  def groupable(value: Boolean): Unit = js.native
  /**
    * The name of the data row field that will be used to group on, or false when this column
    * does not support grouping
    */
  @JSName("groupable")
  var groupable_Original: IColumnField[String | Boolean] = js.native
  
  /**
    * The url of a custom html template that should be used to render a table header for this column
    *
    * To set this on the `td` tag for a html table use the attribute `header` or `data-header`
    */
  def headerTemplateURL(): String | Boolean = js.native
  def headerTemplateURL(context: ColumnFieldContext): String | Boolean = js.native
  /**
    * The url of a custom html template that should be used to render a table header for this column
    *
    * To set this on the `td` tag for a html table use the attribute `header` or `data-header`
    */
  def headerTemplateURL(value: String): Unit = js.native
  def headerTemplateURL(value: Boolean): Unit = js.native
  /**
    * The url of a custom html template that should be used to render a table header for this column
    *
    * To set this on the `td` tag for a html table use the attribute `header` or `data-header`
    */
  @JSName("headerTemplateURL")
  var headerTemplateURL_Original: IColumnField[String | Boolean] = js.native
  
  /**
    * The text that should be used as a tooltip for this column in the table header
    */
  def headerTitle(): String = js.native
  def headerTitle(context: ColumnFieldContext): String = js.native
  /**
    * The text that should be used as a tooltip for this column in the table header
    */
  def headerTitle(value: String): Unit = js.native
  /**
    * The text that should be used as a tooltip for this column in the table header
    */
  @JSName("headerTitle")
  var headerTitle_Original: IColumnField[String] = js.native
  
  /**
    * The index position of this column within the `$columns` container array
    */
  var id: Double = js.native
  
  /**
    * Determines whether this column should be displayed in the table
    *
    * To set this on the `td` tag for a html table use the attribute `ng-if`
    */
  def show(): Boolean = js.native
  def show(context: ColumnFieldContext): Boolean = js.native
  /**
    * Determines whether this column should be displayed in the table
    *
    * To set this on the `td` tag for a html table use the attribute `ng-if`
    */
  def show(value: Boolean): Unit = js.native
  /**
    * Determines whether this column should be displayed in the table
    *
    * To set this on the `td` tag for a html table use the attribute `ng-if`
    */
  @JSName("show")
  var show_Original: IColumnField[Boolean] = js.native
  
  /**
    * The name of the data row field that will be used to sort on, or false when this column
    * does not support sorting
    */
  def sortable(): String | Boolean = js.native
  def sortable(context: ColumnFieldContext): String | Boolean = js.native
  /**
    * The name of the data row field that will be used to sort on, or false when this column
    * does not support sorting
    */
  def sortable(value: String): Unit = js.native
  def sortable(value: Boolean): Unit = js.native
  /**
    * The name of the data row field that will be used to sort on, or false when this column
    * does not support sorting
    */
  @JSName("sortable")
  var sortable_Original: IColumnField[String | Boolean] = js.native
  
  /**
    * The title of this column that should be displayed in the table header
    */
  def title(): String = js.native
  def title(context: ColumnFieldContext): String = js.native
  /**
    * The title of this column that should be displayed in the table header
    */
  def title(value: String): Unit = js.native
  
  /**
    * An alternate column title. Typically this can be used for responsive table layouts
    * where the titleAlt should be used for small screen sizes
    */
  def titleAlt(): String = js.native
  def titleAlt(context: ColumnFieldContext): String = js.native
  /**
    * An alternate column title. Typically this can be used for responsive table layouts
    * where the titleAlt should be used for small screen sizes
    */
  def titleAlt(value: String): Unit = js.native
  /**
    * An alternate column title. Typically this can be used for responsive table layouts
    * where the titleAlt should be used for small screen sizes
    */
  @JSName("titleAlt")
  var titleAlt_Original: IColumnField[String] = js.native
  
  /**
    * The title of this column that should be displayed in the table header
    */
  @JSName("title")
  var title_Original: IColumnField[String] = js.native
}
