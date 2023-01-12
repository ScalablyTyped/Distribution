package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  filename :string,   separator :string,   filterOptions :std.Partial<{  useDisplayedColumnsOnly :boolean,   useDisplayedRowsOnly :boolean}>}> */
trait Partialfilenamestringsepa extends StObject {
  
  var filename: js.UndefOr[String] = js.undefined
  
  var filterOptions: js.UndefOr[PartialuseDisplayedColumn] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
}
object Partialfilenamestringsepa {
  
  inline def apply(): Partialfilenamestringsepa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialfilenamestringsepa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialfilenamestringsepa] (val x: Self) extends AnyVal {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setFilterOptions(value: PartialuseDisplayedColumn): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
    
    inline def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
