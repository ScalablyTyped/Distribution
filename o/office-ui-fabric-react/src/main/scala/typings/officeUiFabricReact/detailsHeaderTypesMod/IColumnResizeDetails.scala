package typings.officeUiFabricReact.detailsHeaderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnResizeDetails extends js.Object {
  
  var columnIndex: Double = js.native
  
  var columnMinWidth: Double = js.native
  
  var originX: js.UndefOr[Double] = js.native
}
object IColumnResizeDetails {
  
  @scala.inline
  def apply(columnIndex: Double, columnMinWidth: Double): IColumnResizeDetails = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], columnMinWidth = columnMinWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnResizeDetails]
  }
  
  @scala.inline
  implicit class IColumnResizeDetailsOps[Self <: IColumnResizeDetails] (val x: Self) extends AnyVal {
    
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMinWidth(value: Double): Self = this.set("columnMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginX(value: Double): Self = this.set("originX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginX: Self = this.set("originX", js.undefined)
  }
}
