package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedObjectPosition extends js.Object {
  
  /** If true, the embedded object is put on a new sheet whose ID is chosen for you. Used only when writing. */
  var newSheet: js.UndefOr[Boolean] = js.native
  
  /** The position at which the object is overlaid on top of a grid. */
  var overlayPosition: js.UndefOr[OverlayPosition] = js.native
  
  /** The sheet this is on. Set only if the embedded object is on its own sheet. Must be non-negative. */
  var sheetId: js.UndefOr[Double] = js.native
}
object EmbeddedObjectPosition {
  
  @scala.inline
  def apply(): EmbeddedObjectPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObjectPosition]
  }
  
  @scala.inline
  implicit class EmbeddedObjectPositionOps[Self <: EmbeddedObjectPosition] (val x: Self) extends AnyVal {
    
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
    def setNewSheet(value: Boolean): Self = this.set("newSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewSheet: Self = this.set("newSheet", js.undefined)
    
    @scala.inline
    def setOverlayPosition(value: OverlayPosition): Self = this.set("overlayPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayPosition: Self = this.set("overlayPosition", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
  }
}
