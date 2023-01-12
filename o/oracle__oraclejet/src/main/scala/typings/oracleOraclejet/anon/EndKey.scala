package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndKey[K]
  extends StObject
     with ColumnSelectionEnd[K] {
  
  var endIndex: js.UndefOr[ColumnNumber] = js.undefined
  
  var endKey: `22`[K]
}
object EndKey {
  
  inline def apply[K](endKey: `22`[K]): EndKey[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndKey[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndKey[?], K] (val x: Self & EndKey[K]) extends AnyVal {
    
    inline def setEndIndex(value: ColumnNumber): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setEndKey(value: `22`[K]): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
  }
}
