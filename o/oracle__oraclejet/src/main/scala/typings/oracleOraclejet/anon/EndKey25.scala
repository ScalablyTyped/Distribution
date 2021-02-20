package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndKey25[K] extends RowSelectionEnd[K] {
  
  var endIndex: js.UndefOr[`24`] = js.native
  
  var endKey: `25`[K] = js.native
}
object EndKey25 {
  
  @scala.inline
  def apply[K](endKey: `25`[K]): EndKey25[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndKey25[K]]
  }
  
  @scala.inline
  implicit class EndKey25MutableBuilder[Self <: EndKey25[_], K] (val x: Self with EndKey25[K]) extends AnyVal {
    
    @scala.inline
    def setEndIndex(value: `24`): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    @scala.inline
    def setEndKey(value: `25`[K]): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
  }
}
