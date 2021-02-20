package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndKey[K] extends ColumnSelectionEnd[K] {
  
  var endIndex: js.UndefOr[ColumnNumber] = js.native
  
  var endKey: `22`[K] = js.native
}
object EndKey {
  
  @scala.inline
  def apply[K](endKey: `22`[K]): EndKey[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndKey[K]]
  }
  
  @scala.inline
  implicit class EndKeyMutableBuilder[Self <: EndKey[_], K] (val x: Self with EndKey[K]) extends AnyVal {
    
    @scala.inline
    def setEndIndex(value: ColumnNumber): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    @scala.inline
    def setEndKey(value: `22`[K]): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
  }
}
