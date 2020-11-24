package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
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
  implicit class StartKey25Ops[Self <: StartKey25[_], K] (val x: Self with StartKey25[K]) extends AnyVal {
    
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
    def setStartKey(value: `25`[K]): Self = this.set("startKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: `24`): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
  }
}
