package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndIndex[K] extends ColumnSelectionEnd[K] {
  
  var endIndex: ColumnNumber = js.native
  
  var endKey: js.UndefOr[`22`[K]] = js.native
}
object EndIndex {
  
  @scala.inline
  def apply[K](endIndex: ColumnNumber): EndIndex[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndIndex[K]]
  }
  
  @scala.inline
  implicit class EndIndexMutableBuilder[Self <: EndIndex[_], K] (val x: Self with EndIndex[K]) extends AnyVal {
    
    @scala.inline
    def setEndIndex(value: ColumnNumber): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndKey(value: `22`[K]): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndKeyUndefined: Self = StObject.set(x, "endKey", js.undefined)
  }
}
