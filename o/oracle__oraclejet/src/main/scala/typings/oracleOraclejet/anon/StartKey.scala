package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartKey[K]
  extends StObject
     with ColumnSelectionStart[K] {
  
  var startIndex: ColumnNumber
  
  var startKey: js.UndefOr[`22`[K]] = js.undefined
}
object StartKey {
  
  inline def apply[K](startIndex: ColumnNumber): StartKey[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartKey[K]]
  }
  
  extension [Self <: StartKey[?], K](x: Self & StartKey[K]) {
    
    inline def setStartIndex(value: ColumnNumber): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartKey(value: `22`[K]): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
    
    inline def setStartKeyUndefined: Self = StObject.set(x, "startKey", js.undefined)
  }
}
