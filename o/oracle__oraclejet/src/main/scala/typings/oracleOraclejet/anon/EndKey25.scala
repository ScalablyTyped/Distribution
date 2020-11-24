package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
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
  implicit class EndKey25Ops[Self <: EndKey25[_], K] (val x: Self with EndKey25[K]) extends AnyVal {
    
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
    def setEndKey(value: `25`[K]): Self = this.set("endKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndex(value: `24`): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
  }
}
