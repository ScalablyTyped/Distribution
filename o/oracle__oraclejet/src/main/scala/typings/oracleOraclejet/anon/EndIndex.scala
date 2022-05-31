package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndIndex[K]
  extends StObject
     with ColumnSelectionEnd[K] {
  
  var endIndex: ColumnNumber
  
  var endKey: js.UndefOr[`22`[K]] = js.undefined
}
object EndIndex {
  
  inline def apply[K](endIndex: ColumnNumber): EndIndex[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndIndex[K]]
  }
  
  extension [Self <: EndIndex[?], K](x: Self & EndIndex[K]) {
    
    inline def setEndIndex(value: ColumnNumber): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndKey(value: `22`[K]): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
    
    inline def setEndKeyUndefined: Self = StObject.set(x, "endKey", js.undefined)
  }
}
