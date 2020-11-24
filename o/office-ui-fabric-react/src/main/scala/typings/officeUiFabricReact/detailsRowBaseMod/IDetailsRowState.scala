package typings.officeUiFabricReact.detailsRowBaseMod

import typings.officeUiFabricReact.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDetailsRowState extends js.Object {
  
  var columnMeasureInfo: js.UndefOr[Column] = js.native
  
  var isDropping: js.UndefOr[Boolean] = js.native
  
  var selectionState: IDetailsRowSelectionState = js.native
}
object IDetailsRowState {
  
  @scala.inline
  def apply(selectionState: IDetailsRowSelectionState): IDetailsRowState = {
    val __obj = js.Dynamic.literal(selectionState = selectionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowState]
  }
  
  @scala.inline
  implicit class IDetailsRowStateOps[Self <: IDetailsRowState] (val x: Self) extends AnyVal {
    
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
    def setSelectionState(value: IDetailsRowSelectionState): Self = this.set("selectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMeasureInfo(value: Column): Self = this.set("columnMeasureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnMeasureInfo: Self = this.set("columnMeasureInfo", js.undefined)
    
    @scala.inline
    def setIsDropping(value: Boolean): Self = this.set("isDropping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDropping: Self = this.set("isDropping", js.undefined)
  }
}
