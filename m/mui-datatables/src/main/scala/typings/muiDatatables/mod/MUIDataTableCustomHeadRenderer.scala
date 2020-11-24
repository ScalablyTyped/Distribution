package typings.muiDatatables.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<mui-datatables.mui-datatables.MUIDataTableColumn, 'name' | 'label'> & std.Pick<mui-datatables.mui-datatables.MUIDataTableColumnOptions, 'customHeadRender' | 'display' | 'filter' | 'sort' | 'download' | 'empty' | 'print' | 'searchable' | 'viewColumns'> & {  index :number} */
@js.native
trait MUIDataTableCustomHeadRenderer extends js.Object {
  
  var customHeadRender: js.UndefOr[
    js.Function3[
      /* columnMeta */ this.type, 
      /* handleToggleColumn */ js.Function1[/* columnIndex */ Double, Unit], 
      /* sortOrder */ MUISortOptions, 
      String | ReactNode
    ]
  ] = js.native
  
  var display: js.UndefOr[Display] = js.native
  
  var download: js.UndefOr[Boolean] = js.native
  
  var empty: js.UndefOr[Boolean] = js.native
  
  var filter: js.UndefOr[Boolean] = js.native
  
  var index: Double = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var print: js.UndefOr[Boolean] = js.native
  
  var searchable: js.UndefOr[Boolean] = js.native
  
  var sort: js.UndefOr[Boolean] = js.native
  
  var viewColumns: js.UndefOr[Boolean] = js.native
}
object MUIDataTableCustomHeadRenderer {
  
  @scala.inline
  def apply(index: Double, name: String): MUIDataTableCustomHeadRenderer = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableCustomHeadRenderer]
  }
  
  @scala.inline
  implicit class MUIDataTableCustomHeadRendererOps[Self <: MUIDataTableCustomHeadRenderer] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomHeadRender(
      value: (MUIDataTableCustomHeadRenderer, /* handleToggleColumn */ js.Function1[/* columnIndex */ Double, Unit], /* sortOrder */ MUISortOptions) => String | ReactNode
    ): Self = this.set("customHeadRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCustomHeadRender: Self = this.set("customHeadRender", js.undefined)
    
    @scala.inline
    def setDisplay(value: Display): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDownload(value: Boolean): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setFilter(value: Boolean): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setPrint(value: Boolean): Self = this.set("print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchable: Self = this.set("searchable", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setViewColumns(value: Boolean): Self = this.set("viewColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewColumns: Self = this.set("viewColumns", js.undefined)
  }
}
