package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropLocation extends js.Object {
  
  var dropLocation: js.UndefOr[ColumnDragEndLocation] = js.native
}
object DropLocation {
  
  @scala.inline
  def apply(): DropLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropLocation]
  }
  
  @scala.inline
  implicit class DropLocationOps[Self <: DropLocation] (val x: Self) extends AnyVal {
    
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
    def setDropLocation(value: ColumnDragEndLocation): Self = this.set("dropLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropLocation: Self = this.set("dropLocation", js.undefined)
  }
}
