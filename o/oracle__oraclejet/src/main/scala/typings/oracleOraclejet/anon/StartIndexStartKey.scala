package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartIndexStartKey[K] extends ColumnSelectionStart[K] {
  
  var startIndex: js.UndefOr[ColumnNumber] = js.native
  
  var startKey: `22`[K] = js.native
}
object StartIndexStartKey {
  
  @scala.inline
  def apply[K](startKey: `22`[K]): StartIndexStartKey[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartIndexStartKey[K]]
  }
  
  @scala.inline
  implicit class StartIndexStartKeyMutableBuilder[Self <: StartIndexStartKey[_], K] (val x: Self with StartIndexStartKey[K]) extends AnyVal {
    
    @scala.inline
    def setStartIndex(value: ColumnNumber): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setStartKey(value: `22`[K]): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
  }
}
