package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartIndexStartKey[K]
  extends StObject
     with ColumnSelectionStart[K] {
  
  var startIndex: js.UndefOr[ColumnNumber] = js.undefined
  
  var startKey: `22`[K]
}
object StartIndexStartKey {
  
  inline def apply[K](startKey: `22`[K]): StartIndexStartKey[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartIndexStartKey[K]]
  }
  
  extension [Self <: StartIndexStartKey[?], K](x: Self & StartIndexStartKey[K]) {
    
    inline def setStartIndex(value: ColumnNumber): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setStartKey(value: `22`[K]): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
  }
}
