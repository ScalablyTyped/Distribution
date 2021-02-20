package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartKey25[K] extends RowSelectionStart[K] {
  
  var startIndex: js.UndefOr[`24`] = js.native
  
  var startKey: `25`[K] = js.native
}
object StartKey25 {
  
  @scala.inline
  def apply[K](startKey: `25`[K]): StartKey25[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartKey25[K]]
  }
  
  @scala.inline
  implicit class StartKey25MutableBuilder[Self <: StartKey25[_], K] (val x: Self with StartKey25[K]) extends AnyVal {
    
    @scala.inline
    def setStartIndex(value: `24`): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setStartKey(value: `25`[K]): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
  }
}
