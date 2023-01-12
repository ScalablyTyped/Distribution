package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  useDisplayedColumnsOnly :boolean,   useDisplayedRowsOnly :boolean}> */
trait PartialuseDisplayedColumn extends StObject {
  
  var useDisplayedColumnsOnly: js.UndefOr[Boolean] = js.undefined
  
  var useDisplayedRowsOnly: js.UndefOr[Boolean] = js.undefined
}
object PartialuseDisplayedColumn {
  
  inline def apply(): PartialuseDisplayedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialuseDisplayedColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialuseDisplayedColumn] (val x: Self) extends AnyVal {
    
    inline def setUseDisplayedColumnsOnly(value: Boolean): Self = StObject.set(x, "useDisplayedColumnsOnly", value.asInstanceOf[js.Any])
    
    inline def setUseDisplayedColumnsOnlyUndefined: Self = StObject.set(x, "useDisplayedColumnsOnly", js.undefined)
    
    inline def setUseDisplayedRowsOnly(value: Boolean): Self = StObject.set(x, "useDisplayedRowsOnly", value.asInstanceOf[js.Any])
    
    inline def setUseDisplayedRowsOnlyUndefined: Self = StObject.set(x, "useDisplayedRowsOnly", js.undefined)
  }
}
