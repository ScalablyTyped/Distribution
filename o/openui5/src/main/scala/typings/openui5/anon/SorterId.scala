package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SorterId extends StObject {
  
  /**
    * The ID of the sorter that has just been applied.
    */
  var sorterId: js.UndefOr[String] = js.undefined
}
object SorterId {
  
  inline def apply(): SorterId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SorterId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SorterId] (val x: Self) extends AnyVal {
    
    inline def setSorterId(value: String): Self = StObject.set(x, "sorterId", value.asInstanceOf[js.Any])
    
    inline def setSorterIdUndefined: Self = StObject.set(x, "sorterId", js.undefined)
  }
}
