package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndIndexEndKey[K]
  extends StObject
     with RowSelectionEnd[K] {
  
  var endIndex: `24`
  
  var endKey: js.UndefOr[`25`[K]] = js.undefined
}
object EndIndexEndKey {
  
  inline def apply[K](endIndex: `24`): EndIndexEndKey[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndIndexEndKey[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndIndexEndKey[?], K] (val x: Self & EndIndexEndKey[K]) extends AnyVal {
    
    inline def setEndIndex(value: `24`): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndKey(value: `25`[K]): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
    
    inline def setEndKeyUndefined: Self = StObject.set(x, "endKey", js.undefined)
  }
}
