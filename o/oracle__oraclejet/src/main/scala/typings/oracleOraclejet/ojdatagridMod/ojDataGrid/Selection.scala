package typings.oracleOraclejet.ojdatagridMod.ojDataGrid

import typings.oracleOraclejet.anon.RowK
import typings.oracleOraclejet.anon.RowNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait Selection[K] extends js.Object {
  
  var endIndex: js.UndefOr[RowNumber] = js.native
  
  var endKey: js.UndefOr[RowK[K]] = js.native
  
  var startIndex: js.UndefOr[RowNumber] = js.native
  
  var startKey: js.UndefOr[RowK[K]] = js.native
}
object Selection {
  
  @scala.inline
  def apply[K](): Selection[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Selection[K]]
  }
  
  @scala.inline
  implicit class SelectionOps[Self <: Selection[_], K] (val x: Self with Selection[K]) extends AnyVal {
    
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
    def setEndIndex(value: RowNumber): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    
    @scala.inline
    def setEndKey(value: RowK[K]): Self = this.set("endKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndKey: Self = this.set("endKey", js.undefined)
    
    @scala.inline
    def setStartIndex(value: RowNumber): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setStartKey(value: RowK[K]): Self = this.set("startKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartKey: Self = this.set("startKey", js.undefined)
  }
}
