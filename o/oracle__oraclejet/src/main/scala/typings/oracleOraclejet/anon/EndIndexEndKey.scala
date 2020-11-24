package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
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
  implicit class EndIndexEndKeyOps[Self <: EndIndexEndKey[_], K] (val x: Self with EndIndexEndKey[K]) extends AnyVal {
    
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
    def setEndIndex(value: `24`): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndKey(value: `25`[K]): Self = this.set("endKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndKey: Self = this.set("endKey", js.undefined)
  }
}
