package typings.ngTable

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IAttributes
import typings.angular.mod.IPromise
import typings.angular.mod.IRootScopeService
import typings.angular.mod.IScope
import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicInterfacesMod {
  
  @js.native
  trait ColumnFieldContext
    extends StObject
       with IRootScopeService {
    
    @JSName("$column")
    var $column: js.UndefOr[IColumnDef] = js.native
    
    @JSName("$columns")
    var $columns: js.Array[IColumnDef] = js.native
  }
  
  type DynamicTableColField[T] = IDynamicTableColFieldFunc[T] | T
  
  trait IColumnDef extends StObject {
    
    /**
      * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
      *
      * To set this on the `td` tag of a html table use the attribute `header-class` or `data-header-class`
      */
    def `class`(): String
    def `class`(context: ColumnFieldContext): String
    /**
      * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
      *
      * To set this on the `td` tag of a html table use the attribute `header-class` or `data-header-class`
      */
    def `class`(value: String): Unit
    /**
      * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
      *
      * To set this on the `td` tag of a html table use the attribute `header-class` or `data-header-class`
      */
    @JSName("class")
    var class_Original: IColumnField[String]
    
    /**
      * The `ISelectOption`s that can be used in a html filter template for this colums.
      */
    var data: js.UndefOr[SelectData] = js.undefined
    
    /**
      * The definition of 0 or more html filter templates that should be rendered for this column in
      * the table header
      */
    def filter(): IFilterTemplateDefMap
    def filter(context: ColumnFieldContext): IFilterTemplateDefMap
    /**
      * The definition of 0 or more html filter templates that should be rendered for this column in
      * the table header
      */
    def filter(value: IFilterTemplateDefMap): Unit
    
    /**
      * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
      * At the creation of the `NgTableParams` this field will be called and the result then assigned
      * to the `data` field of this column.
      */
    def filterData(): IPromise[SelectData] | SelectData
    def filterData(context: ColumnFieldContext): IPromise[SelectData] | SelectData
    /**
      * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
      * At the creation of the `NgTableParams` this field will be called and the result then assigned
      * to the `data` field of this column.
      */
    def filterData(value: IPromise[SelectData]): Unit
    def filterData(value: SelectData): Unit
    /**
      * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
      * At the creation of the `NgTableParams` this field will be called and the result then assigned
      * to the `data` field of this column.
      */
    @JSName("filterData")
    var filterData_Original: IColumnField[IPromise[SelectData] | SelectData]
    
    /**
      * The definition of 0 or more html filter templates that should be rendered for this column in
      * the table header
      */
    @JSName("filter")
    var filter_Original: IColumnField[IFilterTemplateDefMap]
    
    /**
      * The name of the data row field that will be used to group on, or false when this column
      * does not support grouping
      */
    def groupable(): String | Boolean
    def groupable(context: ColumnFieldContext): String | Boolean
    /**
      * The name of the data row field that will be used to group on, or false when this column
      * does not support grouping
      */
    def groupable(value: String): Unit
    def groupable(value: Boolean): Unit
    /**
      * The name of the data row field that will be used to group on, or false when this column
      * does not support grouping
      */
    @JSName("groupable")
    var groupable_Original: IColumnField[String | Boolean]
    
    /**
      * The url of a custom html template that should be used to render a table header for this column
      *
      * To set this on the `td` tag for a html table use the attribute `header` or `data-header`
      */
    def headerTemplateURL(): String | Boolean
    def headerTemplateURL(context: ColumnFieldContext): String | Boolean
    /**
      * The url of a custom html template that should be used to render a table header for this column
      *
      * To set this on the `td` tag for a html table use the attribute `header` or `data-header`
      */
    def headerTemplateURL(value: String): Unit
    def headerTemplateURL(value: Boolean): Unit
    /**
      * The url of a custom html template that should be used to render a table header for this column
      *
      * To set this on the `td` tag for a html table use the attribute `header` or `data-header`
      */
    @JSName("headerTemplateURL")
    var headerTemplateURL_Original: IColumnField[String | Boolean]
    
    /**
      * The text that should be used as a tooltip for this column in the table header
      */
    def headerTitle(): String
    def headerTitle(context: ColumnFieldContext): String
    /**
      * The text that should be used as a tooltip for this column in the table header
      */
    def headerTitle(value: String): Unit
    /**
      * The text that should be used as a tooltip for this column in the table header
      */
    @JSName("headerTitle")
    var headerTitle_Original: IColumnField[String]
    
    /**
      * The index position of this column within the `$columns` container array
      */
    var id: Double
    
    /**
      * Determines whether this column should be displayed in the table
      *
      * To set this on the `td` tag for a html table use the attribute `ng-if`
      */
    def show(): Boolean
    def show(context: ColumnFieldContext): Boolean
    /**
      * Determines whether this column should be displayed in the table
      *
      * To set this on the `td` tag for a html table use the attribute `ng-if`
      */
    def show(value: Boolean): Unit
    /**
      * Determines whether this column should be displayed in the table
      *
      * To set this on the `td` tag for a html table use the attribute `ng-if`
      */
    @JSName("show")
    var show_Original: IColumnField[Boolean]
    
    /**
      * The name of the data row field that will be used to sort on, or false when this column
      * does not support sorting
      */
    def sortable(): String | Boolean
    def sortable(context: ColumnFieldContext): String | Boolean
    /**
      * The name of the data row field that will be used to sort on, or false when this column
      * does not support sorting
      */
    def sortable(value: String): Unit
    def sortable(value: Boolean): Unit
    /**
      * The name of the data row field that will be used to sort on, or false when this column
      * does not support sorting
      */
    @JSName("sortable")
    var sortable_Original: IColumnField[String | Boolean]
    
    /**
      * The title of this column that should be displayed in the table header
      */
    def title(): String
    def title(context: ColumnFieldContext): String
    /**
      * The title of this column that should be displayed in the table header
      */
    def title(value: String): Unit
    
    /**
      * An alternate column title. Typically this can be used for responsive table layouts
      * where the titleAlt should be used for small screen sizes
      */
    def titleAlt(): String
    def titleAlt(context: ColumnFieldContext): String
    /**
      * An alternate column title. Typically this can be used for responsive table layouts
      * where the titleAlt should be used for small screen sizes
      */
    def titleAlt(value: String): Unit
    /**
      * An alternate column title. Typically this can be used for responsive table layouts
      * where the titleAlt should be used for small screen sizes
      */
    @JSName("titleAlt")
    var titleAlt_Original: IColumnField[String]
    
    /**
      * The title of this column that should be displayed in the table header
      */
    @JSName("title")
    var title_Original: IColumnField[String]
  }
  object IColumnDef {
    
    @scala.inline
    def apply(
      `class`: IColumnField[String],
      filter: IColumnField[IFilterTemplateDefMap],
      filterData: IColumnField[IPromise[SelectData] | SelectData],
      groupable: IColumnField[String | Boolean],
      headerTemplateURL: IColumnField[String | Boolean],
      headerTitle: IColumnField[String],
      id: Double,
      show: IColumnField[Boolean],
      sortable: IColumnField[String | Boolean],
      title: IColumnField[String],
      titleAlt: IColumnField[String]
    ): IColumnDef = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], filterData = filterData.asInstanceOf[js.Any], groupable = groupable.asInstanceOf[js.Any], headerTemplateURL = headerTemplateURL.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleAlt = titleAlt.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColumnDef]
    }
    
    @scala.inline
    implicit class IColumnDefMutableBuilder[Self <: IColumnDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: IColumnField[String]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: SelectData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFunction0(value: () => js.Array[ISelectOption] | IPromise[js.Array[ISelectOption]]): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: ISelectOption*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFilter(value: IColumnField[IFilterTemplateDefMap]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterData(value: IColumnField[IPromise[SelectData] | SelectData]): Self = StObject.set(x, "filterData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupable(value: IColumnField[String | Boolean]): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateURL(value: IColumnField[String | Boolean]): Self = StObject.set(x, "headerTemplateURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTitle(value: IColumnField[String]): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: IColumnField[Boolean]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortable(value: IColumnField[String | Boolean]): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: IColumnField[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlt(value: IColumnField[String]): Self = StObject.set(x, "titleAlt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IColumnField[T] extends StObject {
    
    def apply(): T = js.native
    def apply(context: ColumnFieldContext): T = js.native
    def apply(value: T): Unit = js.native
    
    def assign($scope: IScope, value: T): Unit = js.native
  }
  
  trait IDynamicTableColDef extends StObject {
    
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
    def apply(): IDynamicTableColDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDynamicTableColDef]
    }
    
    @scala.inline
    implicit class IDynamicTableColDefMutableBuilder[Self <: IDynamicTableColDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: DynamicTableColField[String]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassFunction1(value: /* context */ ColumnFieldContext => String): Self = StObject.set(x, "class", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setFilter(value: DynamicTableColField[IFilterTemplateDefMap]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterData(value: DynamicTableColField[IPromise[SelectData] | SelectData]): Self = StObject.set(x, "filterData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterDataFunction0(value: () => js.Array[ISelectOption] | IPromise[js.Array[ISelectOption]]): Self = StObject.set(x, "filterData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFilterDataFunction1(value: /* context */ ColumnFieldContext => IPromise[SelectData] | SelectData): Self = StObject.set(x, "filterData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterDataUndefined: Self = StObject.set(x, "filterData", js.undefined)
      
      @scala.inline
      def setFilterDataVarargs(value: ISelectOption*): Self = StObject.set(x, "filterData", js.Array(value :_*))
      
      @scala.inline
      def setFilterFunction1(value: /* context */ ColumnFieldContext => IFilterTemplateDefMap): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGroupable(value: DynamicTableColField[String | Boolean]): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupableFunction1(value: /* context */ ColumnFieldContext => String | Boolean): Self = StObject.set(x, "groupable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupableUndefined: Self = StObject.set(x, "groupable", js.undefined)
      
      @scala.inline
      def setHeaderTemplateURL(value: DynamicTableColField[String | Boolean]): Self = StObject.set(x, "headerTemplateURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateURLFunction1(value: /* context */ ColumnFieldContext => String | Boolean): Self = StObject.set(x, "headerTemplateURL", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderTemplateURLUndefined: Self = StObject.set(x, "headerTemplateURL", js.undefined)
      
      @scala.inline
      def setHeaderTitle(value: DynamicTableColField[String]): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTitleFunction1(value: /* context */ ColumnFieldContext => String): Self = StObject.set(x, "headerTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
      
      @scala.inline
      def setShow(value: DynamicTableColField[Boolean]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFunction1(value: /* context */ ColumnFieldContext => Boolean): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setSortable(value: DynamicTableColField[String | Boolean]): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortableFunction1(value: /* context */ ColumnFieldContext => String | Boolean): Self = StObject.set(x, "sortable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      @scala.inline
      def setTitle(value: DynamicTableColField[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlt(value: DynamicTableColField[String]): Self = StObject.set(x, "titleAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAltFunction1(value: /* context */ ColumnFieldContext => String): Self = StObject.set(x, "titleAlt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleAltUndefined: Self = StObject.set(x, "titleAlt", js.undefined)
      
      @scala.inline
      def setTitleFunction1(value: /* context */ ColumnFieldContext => String): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type IDynamicTableColFieldFunc[T] = js.Function1[/* context */ ColumnFieldContext, T]
  
  trait IFilterConfigValues extends StObject {
    
    /**
      * A map of alias names and their corrosponding urls. A lookup against this map will be used
      * to find the url matching an alias name.
      * If no match is found then a url will be derived using the following pattern `${defaultBaseUrl}${aliasName}.${defaultExt}`
      */
    var aliasUrls: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The default base url to use when deriving the url for a filter template given just an alias name
      * Defaults to 'ng-table/filters/'
      */
    var defaultBaseUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The extension to use when deriving the url of a filter template when given just an alias name
      */
    var defaultExt: js.UndefOr[String] = js.undefined
  }
  object IFilterConfigValues {
    
    @scala.inline
    def apply(): IFilterConfigValues = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFilterConfigValues]
    }
    
    @scala.inline
    implicit class IFilterConfigValuesMutableBuilder[Self <: IFilterConfigValues] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliasUrls(value: StringDictionary[String]): Self = StObject.set(x, "aliasUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUrlsUndefined: Self = StObject.set(x, "aliasUrls", js.undefined)
      
      @scala.inline
      def setDefaultBaseUrl(value: String): Self = StObject.set(x, "defaultBaseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultBaseUrlUndefined: Self = StObject.set(x, "defaultBaseUrl", js.undefined)
      
      @scala.inline
      def setDefaultExt(value: String): Self = StObject.set(x, "defaultExt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExtUndefined: Self = StObject.set(x, "defaultExt", js.undefined)
    }
  }
  
  trait IFilterTemplateDef extends StObject {
    
    /**
      * A url to a html template or an alias to a url registered using the {@link ngTableFilterConfigProvider}
      */
    var id: String
    
    /**
      * The text that should be rendered as a prompt to assist the user when entering a filter value
      */
    var placeholder: String
  }
  object IFilterTemplateDef {
    
    @scala.inline
    def apply(id: String, placeholder: String): IFilterTemplateDef = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFilterTemplateDef]
    }
    
    @scala.inline
    implicit class IFilterTemplateDefMutableBuilder[Self <: IFilterTemplateDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
  
  type IFilterTemplateDefMap = StringDictionary[String | IFilterTemplateDef]
  
  type ISelectDataFunc = js.Function0[js.Array[ISelectOption] | IPromise[js.Array[ISelectOption]]]
  
  trait ISelectOption extends StObject {
    
    var id: String | Double
    
    var title: String
  }
  object ISelectOption {
    
    @scala.inline
    def apply(id: String | Double, title: String): ISelectOption = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectOption]
    }
    
    @scala.inline
    implicit class ISelectOptionMutableBuilder[Self <: ISelectOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITableInputAttributes
    extends StObject
       with IAttributes {
    
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
      $observe: (String, js.Function1[/* value */ js.UndefOr[js.Any], js.Any]) => Function,
      $removeClass: String => Unit,
      $set: (String, js.Any) => Unit,
      $updateClass: (String, String) => Unit
    ): ITableInputAttributes = {
      val __obj = js.Dynamic.literal($addClass = js.Any.fromFunction1($addClass), $attr = $attr.asInstanceOf[js.Any], $normalize = js.Any.fromFunction1($normalize), $observe = js.Any.fromFunction2($observe), $removeClass = js.Any.fromFunction1($removeClass), $set = js.Any.fromFunction2($set), $updateClass = js.Any.fromFunction2($updateClass))
      __obj.asInstanceOf[ITableInputAttributes]
    }
    
    @scala.inline
    implicit class ITableInputAttributesMutableBuilder[Self <: ITableInputAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableFilter(value: String): Self = StObject.set(x, "disableFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFilterUndefined: Self = StObject.set(x, "disableFilter", js.undefined)
      
      @scala.inline
      def setNgTable(value: String): Self = StObject.set(x, "ngTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNgTableDynamic(value: String): Self = StObject.set(x, "ngTableDynamic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNgTableDynamicUndefined: Self = StObject.set(x, "ngTableDynamic", js.undefined)
      
      @scala.inline
      def setNgTableUndefined: Self = StObject.set(x, "ngTable", js.undefined)
      
      @scala.inline
      def setShowFilter(value: String): Self = StObject.set(x, "showFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFilterUndefined: Self = StObject.set(x, "showFilter", js.undefined)
      
      @scala.inline
      def setShowGroup(value: String): Self = StObject.set(x, "showGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGroupUndefined: Self = StObject.set(x, "showGroup", js.undefined)
      
      @scala.inline
      def setTemplateHeader(value: String): Self = StObject.set(x, "templateHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateHeaderUndefined: Self = StObject.set(x, "templateHeader", js.undefined)
      
      @scala.inline
      def setTemplatePagination(value: String): Self = StObject.set(x, "templatePagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplatePaginationUndefined: Self = StObject.set(x, "templatePagination", js.undefined)
    }
  }
  
  type SelectData = js.Array[ISelectOption] | ISelectDataFunc
}
