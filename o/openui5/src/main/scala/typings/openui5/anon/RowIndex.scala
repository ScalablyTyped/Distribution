package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowIndex extends StObject {
  
  /**
    * Flag that indicates whether the row has been expanded or collapsed
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Binding context of the expanded/collapsed row
    */
  var rowContext: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Index of the expanded/collapsed row
    */
  var rowIndex: js.UndefOr[int] = js.undefined
}
object RowIndex {
  
  inline def apply(): RowIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowIndex] (val x: Self) extends AnyVal {
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setRowContext(value: js.Object): Self = StObject.set(x, "rowContext", value.asInstanceOf[js.Any])
    
    inline def setRowContextUndefined: Self = StObject.set(x, "rowContext", js.undefined)
    
    inline def setRowIndex(value: int): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
