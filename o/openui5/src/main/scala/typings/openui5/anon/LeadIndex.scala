package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeadIndex extends StObject {
  
  /**
    * Lead selection index
    */
  var leadIndex: int
  
  /**
    * Other selected indices (if available)
    */
  var rowIndices: js.UndefOr[js.Array[int]] = js.undefined
}
object LeadIndex {
  
  inline def apply(leadIndex: int): LeadIndex = {
    val __obj = js.Dynamic.literal(leadIndex = leadIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeadIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LeadIndex] (val x: Self) extends AnyVal {
    
    inline def setLeadIndex(value: int): Self = StObject.set(x, "leadIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndices(value: js.Array[int]): Self = StObject.set(x, "rowIndices", value.asInstanceOf[js.Any])
    
    inline def setRowIndicesUndefined: Self = StObject.set(x, "rowIndices", js.undefined)
    
    inline def setRowIndicesVarargs(value: int*): Self = StObject.set(x, "rowIndices", js.Array(value*))
  }
}
