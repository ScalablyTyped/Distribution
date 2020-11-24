package typings.nodeRedEditorClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellHeight extends js.Object {
  
  var cellHeight: js.UndefOr[Double] = js.native
  
  var cellMargin: js.UndefOr[Double] = js.native
  
  var cellPerRow: js.UndefOr[Double] = js.native
  
  var cellWidth: js.UndefOr[Double] = js.native
  
  var id: String = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var palette: js.UndefOr[js.Array[js.Any]] = js.native
  
  var value: String = js.native
}
object CellHeight {
  
  @scala.inline
  def apply(id: String, value: String): CellHeight = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellHeight]
  }
  
  @scala.inline
  implicit class CellHeightOps[Self <: CellHeight] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellHeight(value: Double): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellHeight: Self = this.set("cellHeight", js.undefined)
    
    @scala.inline
    def setCellMargin(value: Double): Self = this.set("cellMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellMargin: Self = this.set("cellMargin", js.undefined)
    
    @scala.inline
    def setCellPerRow(value: Double): Self = this.set("cellPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellPerRow: Self = this.set("cellPerRow", js.undefined)
    
    @scala.inline
    def setCellWidth(value: Double): Self = this.set("cellWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellWidth: Self = this.set("cellWidth", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPaletteVarargs(value: js.Any*): Self = this.set("palette", js.Array(value :_*))
    
    @scala.inline
    def setPalette(value: js.Array[js.Any]): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
  }
}
