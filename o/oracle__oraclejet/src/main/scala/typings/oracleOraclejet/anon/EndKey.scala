package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
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
  implicit class EndKeyOps[Self <: EndKey[_], K] (val x: Self with EndKey[K]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndKey(value: `22`[K]): Self = this.set("endKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndex(value: ColumnNumber): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
  }
}
