package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartKey[K] extends ColumnSelectionStart[K] {
  
  var startIndex: ColumnNumber = js.native
  
  var startKey: js.UndefOr[`22`[K]] = js.native
}
object StartKey {
  
  @scala.inline
  def apply[K](startIndex: ColumnNumber): StartKey[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartKey[K]]
  }
  
  @scala.inline
  implicit class StartKeyMutableBuilder[Self <: StartKey[_], K] (val x: Self with StartKey[K]) extends AnyVal {
    
    @scala.inline
    def setStartIndex(value: ColumnNumber): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartKey(value: `22`[K]): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartKeyUndefined: Self = StObject.set(x, "startKey", js.undefined)
  }
}
