package typings.officeUiFabricReact.detailsRowTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDetailsRowStyles extends js.Object {
  
  var cell: IStyle = js.native
  
  var cellAnimation: IStyle = js.native
  
  var cellMeasurer: IStyle = js.native
  
  var cellPadded: IStyle = js.native
  
  var cellUnpadded: IStyle = js.native
  
  var check: IStyle = js.native
  
  var checkCell: IStyle = js.native
  
  var checkCover: IStyle = js.native
  
  var fields: IStyle = js.native
  
  var isMultiline: IStyle = js.native
  
  var isRowHeader: IStyle = js.native
  
  var root: IStyle = js.native
}
object IDetailsRowStyles {
  
  @scala.inline
  def apply(): IDetailsRowStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsRowStyles]
  }
  
  @scala.inline
  implicit class IDetailsRowStylesOps[Self <: IDetailsRowStyles] (val x: Self) extends AnyVal {
    
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
    def setCell(value: IStyle): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    
    @scala.inline
    def setCellNull: Self = this.set("cell", null)
    
    @scala.inline
    def setCellAnimation(value: IStyle): Self = this.set("cellAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellAnimation: Self = this.set("cellAnimation", js.undefined)
    
    @scala.inline
    def setCellAnimationNull: Self = this.set("cellAnimation", null)
    
    @scala.inline
    def setCellMeasurer(value: IStyle): Self = this.set("cellMeasurer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellMeasurer: Self = this.set("cellMeasurer", js.undefined)
    
    @scala.inline
    def setCellMeasurerNull: Self = this.set("cellMeasurer", null)
    
    @scala.inline
    def setCellPadded(value: IStyle): Self = this.set("cellPadded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellPadded: Self = this.set("cellPadded", js.undefined)
    
    @scala.inline
    def setCellPaddedNull: Self = this.set("cellPadded", null)
    
    @scala.inline
    def setCellUnpadded(value: IStyle): Self = this.set("cellUnpadded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellUnpadded: Self = this.set("cellUnpadded", js.undefined)
    
    @scala.inline
    def setCellUnpaddedNull: Self = this.set("cellUnpadded", null)
    
    @scala.inline
    def setCheck(value: IStyle): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setCheckNull: Self = this.set("check", null)
    
    @scala.inline
    def setCheckCell(value: IStyle): Self = this.set("checkCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckCell: Self = this.set("checkCell", js.undefined)
    
    @scala.inline
    def setCheckCellNull: Self = this.set("checkCell", null)
    
    @scala.inline
    def setCheckCover(value: IStyle): Self = this.set("checkCover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckCover: Self = this.set("checkCover", js.undefined)
    
    @scala.inline
    def setCheckCoverNull: Self = this.set("checkCover", null)
    
    @scala.inline
    def setFields(value: IStyle): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFieldsNull: Self = this.set("fields", null)
    
    @scala.inline
    def setIsMultiline(value: IStyle): Self = this.set("isMultiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMultiline: Self = this.set("isMultiline", js.undefined)
    
    @scala.inline
    def setIsMultilineNull: Self = this.set("isMultiline", null)
    
    @scala.inline
    def setIsRowHeader(value: IStyle): Self = this.set("isRowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRowHeader: Self = this.set("isRowHeader", js.undefined)
    
    @scala.inline
    def setIsRowHeaderNull: Self = this.set("isRowHeader", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
}
