package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartKey25[K]
  extends StObject
     with RowSelectionStart[K] {
  
  var startIndex: js.UndefOr[`24`] = js.undefined
  
  var startKey: `25`[K]
}
object StartKey25 {
  
  inline def apply[K](startKey: `25`[K]): StartKey25[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartKey25[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartKey25[?], K] (val x: Self & StartKey25[K]) extends AnyVal {
    
    inline def setStartIndex(value: `24`): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setStartKey(value: `25`[K]): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
  }
}
