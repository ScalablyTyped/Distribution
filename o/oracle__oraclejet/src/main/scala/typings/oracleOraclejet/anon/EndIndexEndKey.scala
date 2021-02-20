package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndIndexEndKey[K] extends RowSelectionEnd[K] {
  
  var endIndex: `24` = js.native
  
  var endKey: js.UndefOr[`25`[K]] = js.native
}
object EndIndexEndKey {
  
  @scala.inline
  def apply[K](endIndex: `24`): EndIndexEndKey[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndIndexEndKey[K]]
  }
  
  @scala.inline
  implicit class EndIndexEndKeyMutableBuilder[Self <: EndIndexEndKey[_], K] (val x: Self with EndIndexEndKey[K]) extends AnyVal {
    
    @scala.inline
    def setEndIndex(value: `24`): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndKey(value: `25`[K]): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndKeyUndefined: Self = StObject.set(x, "endKey", js.undefined)
  }
}
