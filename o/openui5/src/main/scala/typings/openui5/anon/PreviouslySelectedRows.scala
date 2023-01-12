package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviouslySelectedRows extends StObject {
  
  /**
    * An array of the previously selected rows.
    */
  var previouslySelectedRows: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * An array of the selected rows.
    */
  var selectedRows: js.UndefOr[js.Array[Any]] = js.undefined
}
object PreviouslySelectedRows {
  
  inline def apply(): PreviouslySelectedRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviouslySelectedRows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreviouslySelectedRows] (val x: Self) extends AnyVal {
    
    inline def setPreviouslySelectedRows(value: js.Array[Any]): Self = StObject.set(x, "previouslySelectedRows", value.asInstanceOf[js.Any])
    
    inline def setPreviouslySelectedRowsUndefined: Self = StObject.set(x, "previouslySelectedRows", js.undefined)
    
    inline def setPreviouslySelectedRowsVarargs(value: Any*): Self = StObject.set(x, "previouslySelectedRows", js.Array(value*))
    
    inline def setSelectedRows(value: js.Array[Any]): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowsUndefined: Self = StObject.set(x, "selectedRows", js.undefined)
    
    inline def setSelectedRowsVarargs(value: Any*): Self = StObject.set(x, "selectedRows", js.Array(value*))
  }
}
