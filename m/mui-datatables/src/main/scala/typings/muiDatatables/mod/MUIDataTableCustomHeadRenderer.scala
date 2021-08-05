package typings.muiDatatables.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<mui-datatables.mui-datatables.MUIDataTableColumn, 'name' | 'label'> & std.Pick<mui-datatables.mui-datatables.MUIDataTableColumnOptions, 'customHeadRender' | 'display' | 'filter' | 'sort' | 'download' | 'empty' | 'print' | 'searchable' | 'viewColumns'> & {  index :number} */
trait MUIDataTableCustomHeadRenderer extends StObject {
  
  var customHeadRender: js.UndefOr[
    js.Function3[
      /* columnMeta */ this.type, 
      /* handleToggleColumn */ js.Function1[/* columnIndex */ Double, Unit], 
      /* sortOrder */ MUISortOptions, 
      String | ReactNode
    ]
  ] = js.undefined
  
  var display: js.UndefOr[Display] = js.undefined
  
  var download: js.UndefOr[Boolean] = js.undefined
  
  var empty: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[Boolean] = js.undefined
  
  var index: Double
  
  var label: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var print: js.UndefOr[Boolean] = js.undefined
  
  var searchable: js.UndefOr[Boolean] = js.undefined
  
  var sort: js.UndefOr[Boolean] = js.undefined
  
  var viewColumns: js.UndefOr[Boolean] = js.undefined
}
object MUIDataTableCustomHeadRenderer {
  
  inline def apply(index: Double, name: String): MUIDataTableCustomHeadRenderer = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableCustomHeadRenderer]
  }
  
  extension [Self <: MUIDataTableCustomHeadRenderer](x: Self) {
    
    inline def setCustomHeadRender(
      value: (MUIDataTableCustomHeadRenderer, /* handleToggleColumn */ js.Function1[/* columnIndex */ Double, Unit], /* sortOrder */ MUISortOptions) => String | ReactNode
    ): Self = StObject.set(x, "customHeadRender", js.Any.fromFunction3(value))
    
    inline def setCustomHeadRenderUndefined: Self = StObject.set(x, "customHeadRender", js.undefined)
    
    inline def setDisplay(value: Display): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrint(value: Boolean): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
    
    inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
    
    inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setViewColumns(value: Boolean): Self = StObject.set(x, "viewColumns", value.asInstanceOf[js.Any])
    
    inline def setViewColumnsUndefined: Self = StObject.set(x, "viewColumns", js.undefined)
  }
}
