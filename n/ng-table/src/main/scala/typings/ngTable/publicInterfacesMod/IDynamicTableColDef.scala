package typings.ngTable.publicInterfacesMod

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDynamicTableColDef extends js.Object {
  /**
    * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
    */
  var `class`: js.UndefOr[DynamicTableColField[String]] = js.native
  /**
    * The definition of 0 or more html filter templates that should be rendered for this column in
    * the table header
    */
  var filter: js.UndefOr[DynamicTableColField[IFilterTemplateDefMap]] = js.native
  /**
    * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
    * At the creation of the `NgTableParams` this field will be called and the result then assigned
    * to the `data` field of this column.
    */
  var filterData: js.UndefOr[DynamicTableColField[IPromise[SelectData] | SelectData]] = js.native
  /**
    * The name of the data row field that will be used to group on, or false when this column
    * does not support grouping
    */
  var groupable: js.UndefOr[DynamicTableColField[String | Boolean]] = js.native
  /**
    * The url of a custom html template that should be used to render a table header for this column
    */
  var headerTemplateURL: js.UndefOr[DynamicTableColField[String | Boolean]] = js.native
  /**
    * The text that should be used as a tooltip for this column in the table header
    */
  var headerTitle: js.UndefOr[DynamicTableColField[String]] = js.native
  /**
    * Determines whether this column should be displayed in the table
    */
  var show: js.UndefOr[DynamicTableColField[Boolean]] = js.native
  /**
    * The name of the data row field that will be used to sort on, or false when this column
    * does not support sorting
    */
  var sortable: js.UndefOr[DynamicTableColField[String | Boolean]] = js.native
  /**
    * The title of this column that should be displayed in the table header
    */
  var title: js.UndefOr[DynamicTableColField[String]] = js.native
  /**
    * An alternate column title. Typically this can be used for responsive table layouts
    * where the titleAlt should be used for small screen sizes
    */
  var titleAlt: js.UndefOr[DynamicTableColField[String]] = js.native
}

object IDynamicTableColDef {
  @scala.inline
  def apply(): IDynamicTableColDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDynamicTableColDef]
  }
  @scala.inline
  implicit class IDynamicTableColDefOps[Self <: IDynamicTableColDef] (val x: Self) extends AnyVal {
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
    def setClassFunction1(value: /* context */ ColumnFieldContext => String): Self = this.set("class", js.Any.fromFunction1(value))
    @scala.inline
    def setClass(value: DynamicTableColField[String]): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setFilterFunction1(value: /* context */ ColumnFieldContext => IFilterTemplateDefMap): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setFilter(value: DynamicTableColField[IFilterTemplateDefMap]): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterDataVarargs(value: ISelectOption*): Self = this.set("filterData", js.Array(value :_*))
    @scala.inline
    def setFilterDataFunction1(value: /* context */ ColumnFieldContext => IPromise[SelectData] | SelectData): Self = this.set("filterData", js.Any.fromFunction1(value))
    @scala.inline
    def setFilterDataFunction0(value: () => js.Array[ISelectOption] | IPromise[js.Array[ISelectOption]]): Self = this.set("filterData", js.Any.fromFunction0(value))
    @scala.inline
    def setFilterData(value: DynamicTableColField[IPromise[SelectData] | SelectData]): Self = this.set("filterData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterData: Self = this.set("filterData", js.undefined)
    @scala.inline
    def setGroupableFunction1(value: /* context */ ColumnFieldContext => String | Boolean): Self = this.set("groupable", js.Any.fromFunction1(value))
    @scala.inline
    def setGroupable(value: DynamicTableColField[String | Boolean]): Self = this.set("groupable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupable: Self = this.set("groupable", js.undefined)
    @scala.inline
    def setHeaderTemplateURLFunction1(value: /* context */ ColumnFieldContext => String | Boolean): Self = this.set("headerTemplateURL", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaderTemplateURL(value: DynamicTableColField[String | Boolean]): Self = this.set("headerTemplateURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTemplateURL: Self = this.set("headerTemplateURL", js.undefined)
    @scala.inline
    def setHeaderTitleFunction1(value: /* context */ ColumnFieldContext => String): Self = this.set("headerTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaderTitle(value: DynamicTableColField[String]): Self = this.set("headerTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTitle: Self = this.set("headerTitle", js.undefined)
    @scala.inline
    def setShowFunction1(value: /* context */ ColumnFieldContext => Boolean): Self = this.set("show", js.Any.fromFunction1(value))
    @scala.inline
    def setShow(value: DynamicTableColField[Boolean]): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSortableFunction1(value: /* context */ ColumnFieldContext => String | Boolean): Self = this.set("sortable", js.Any.fromFunction1(value))
    @scala.inline
    def setSortable(value: DynamicTableColField[String | Boolean]): Self = this.set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    @scala.inline
    def setTitleFunction1(value: /* context */ ColumnFieldContext => String): Self = this.set("title", js.Any.fromFunction1(value))
    @scala.inline
    def setTitle(value: DynamicTableColField[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleAltFunction1(value: /* context */ ColumnFieldContext => String): Self = this.set("titleAlt", js.Any.fromFunction1(value))
    @scala.inline
    def setTitleAlt(value: DynamicTableColField[String]): Self = this.set("titleAlt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleAlt: Self = this.set("titleAlt", js.undefined)
  }
  
}

