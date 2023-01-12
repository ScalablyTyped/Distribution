package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndKey25[K]
  extends StObject
     with RowSelectionEnd[K] {
  
  var endIndex: js.UndefOr[`24`] = js.undefined
  
  var endKey: `25`[K]
}
object EndKey25 {
  
  inline def apply[K](endKey: `25`[K]): EndKey25[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndKey25[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndKey25[?], K] (val x: Self & EndKey25[K]) extends AnyVal {
    
    inline def setEndIndex(value: `24`): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setEndKey(value: `25`[K]): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
  }
}
