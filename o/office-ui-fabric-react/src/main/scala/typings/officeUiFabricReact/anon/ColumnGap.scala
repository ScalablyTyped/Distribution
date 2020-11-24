package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnGap extends js.Object {
  
  var columnGap: Unit = js.native
  
  var rowGap: Unit = js.native
}
object ColumnGap {
  
  @scala.inline
  def apply(columnGap: Unit, rowGap: Unit): ColumnGap = {
    val __obj = js.Dynamic.literal(columnGap = columnGap.asInstanceOf[js.Any], rowGap = rowGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGap]
  }
  
  @scala.inline
  implicit class ColumnGapOps[Self <: ColumnGap] (val x: Self) extends AnyVal {
    
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
    def setColumnGap(value: Unit): Self = this.set("columnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowGap(value: Unit): Self = this.set("rowGap", value.asInstanceOf[js.Any])
  }
}
