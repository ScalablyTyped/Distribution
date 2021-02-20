package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebouncedMUIDataTableSearch extends MUIDataTableSearch {
  
  var debounceWait: Double = js.native
}
object DebouncedMUIDataTableSearch {
  
  @scala.inline
  def apply(debounceWait: Double): DebouncedMUIDataTableSearch = {
    val __obj = js.Dynamic.literal(debounceWait = debounceWait.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebouncedMUIDataTableSearch]
  }
  
  @scala.inline
  implicit class DebouncedMUIDataTableSearchMutableBuilder[Self <: DebouncedMUIDataTableSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebounceWait(value: Double): Self = StObject.set(x, "debounceWait", value.asInstanceOf[js.Any])
  }
}
