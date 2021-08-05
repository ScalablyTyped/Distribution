package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebouncedMUIDataTableSearch
  extends StObject
     with MUIDataTableSearch {
  
  var debounceWait: Double
}
object DebouncedMUIDataTableSearch {
  
  inline def apply(debounceWait: Double): DebouncedMUIDataTableSearch = {
    val __obj = js.Dynamic.literal(debounceWait = debounceWait.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebouncedMUIDataTableSearch]
  }
  
  extension [Self <: DebouncedMUIDataTableSearch](x: Self) {
    
    inline def setDebounceWait(value: Double): Self = StObject.set(x, "debounceWait", value.asInstanceOf[js.Any])
  }
}
