package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartIndex24[K]
  extends StObject
     with RowSelectionStart[K] {
  
  var startIndex: `24`
  
  var startKey: js.UndefOr[`25`[K]] = js.undefined
}
object StartIndex24 {
  
  inline def apply[K](startIndex: `24`): StartIndex24[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartIndex24[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartIndex24[?], K] (val x: Self & StartIndex24[K]) extends AnyVal {
    
    inline def setStartIndex(value: `24`): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartKey(value: `25`[K]): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
    
    inline def setStartKeyUndefined: Self = StObject.set(x, "startKey", js.undefined)
  }
}
