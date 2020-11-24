package typings.muiDatatables.mod

import typings.muiDatatables.anon.DataIndex
import typings.muiDatatables.anon.DataIndexNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableIsRowCheck extends js.Object {
  
  var data: js.Array[DataIndex] = js.native
  
  var lookup: DataIndexNumber = js.native
}
object MUIDataTableIsRowCheck {
  
  @scala.inline
  def apply(data: js.Array[DataIndex], lookup: DataIndexNumber): MUIDataTableIsRowCheck = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableIsRowCheck]
  }
  
  @scala.inline
  implicit class MUIDataTableIsRowCheckOps[Self <: MUIDataTableIsRowCheck] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: DataIndex*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[DataIndex]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookup(value: DataIndexNumber): Self = this.set("lookup", value.asInstanceOf[js.Any])
  }
}
