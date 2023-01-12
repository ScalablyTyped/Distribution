package typings.muiDatatables.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  SearchIcon :react.react.ReactNode,   DownloadIcon :react.react.ReactNode,   PrintIcon :react.react.ReactNode,   ViewColumnIcon :react.react.ReactNode,   FilterIcon :react.react.ReactNode}> */
trait PartialSearchIconReactNod extends StObject {
  
  var DownloadIcon: js.UndefOr[ReactNode] = js.undefined
  
  var FilterIcon: js.UndefOr[ReactNode] = js.undefined
  
  var PrintIcon: js.UndefOr[ReactNode] = js.undefined
  
  var SearchIcon: js.UndefOr[ReactNode] = js.undefined
  
  var ViewColumnIcon: js.UndefOr[ReactNode] = js.undefined
}
object PartialSearchIconReactNod {
  
  inline def apply(): PartialSearchIconReactNod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSearchIconReactNod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSearchIconReactNod] (val x: Self) extends AnyVal {
    
    inline def setDownloadIcon(value: ReactNode): Self = StObject.set(x, "DownloadIcon", value.asInstanceOf[js.Any])
    
    inline def setDownloadIconUndefined: Self = StObject.set(x, "DownloadIcon", js.undefined)
    
    inline def setFilterIcon(value: ReactNode): Self = StObject.set(x, "FilterIcon", value.asInstanceOf[js.Any])
    
    inline def setFilterIconUndefined: Self = StObject.set(x, "FilterIcon", js.undefined)
    
    inline def setPrintIcon(value: ReactNode): Self = StObject.set(x, "PrintIcon", value.asInstanceOf[js.Any])
    
    inline def setPrintIconUndefined: Self = StObject.set(x, "PrintIcon", js.undefined)
    
    inline def setSearchIcon(value: ReactNode): Self = StObject.set(x, "SearchIcon", value.asInstanceOf[js.Any])
    
    inline def setSearchIconUndefined: Self = StObject.set(x, "SearchIcon", js.undefined)
    
    inline def setViewColumnIcon(value: ReactNode): Self = StObject.set(x, "ViewColumnIcon", value.asInstanceOf[js.Any])
    
    inline def setViewColumnIconUndefined: Self = StObject.set(x, "ViewColumnIcon", js.undefined)
  }
}
