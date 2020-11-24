package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
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
  implicit class StartIndexStartKeyOps[Self <: StartIndexStartKey[_], K] (val x: Self with StartIndexStartKey[K]) extends AnyVal {
    
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
    def setStartKey(value: `22`[K]): Self = this.set("startKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: ColumnNumber): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
  }
}
