package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayData extends js.Object {
  
  var displayData: typings.muiDatatables.mod.DisplayData = js.native
}
object DisplayData {
  
  @scala.inline
  def apply(displayData: typings.muiDatatables.mod.DisplayData): DisplayData = {
    val __obj = js.Dynamic.literal(displayData = displayData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayData]
  }
  
  @scala.inline
  implicit class DisplayDataOps[Self <: DisplayData] (val x: Self) extends AnyVal {
    
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
    def setDisplayDataVarargs(value: Data*): Self = this.set("displayData", js.Array(value :_*))
    
    @scala.inline
    def setDisplayData(value: typings.muiDatatables.mod.DisplayData): Self = this.set("displayData", value.asInstanceOf[js.Any])
  }
}
