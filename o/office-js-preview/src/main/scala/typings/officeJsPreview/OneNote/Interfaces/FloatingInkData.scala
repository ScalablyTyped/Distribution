package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "floatingInk.toJSON()". */
@js.native
trait FloatingInkData extends js.Object {
  
  /**
    *
    * Gets the ID of the FloatingInk object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the strokes of the FloatingInk object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokes: js.UndefOr[js.Array[InkStrokeData]] = js.native
}
object FloatingInkData {
  
  @scala.inline
  def apply(): FloatingInkData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingInkData]
  }
  
  @scala.inline
  implicit class FloatingInkDataOps[Self <: FloatingInkData] (val x: Self) extends AnyVal {
    
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
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInkStrokesVarargs(value: InkStrokeData*): Self = this.set("inkStrokes", js.Array(value :_*))
    
    @scala.inline
    def setInkStrokes(value: js.Array[InkStrokeData]): Self = this.set("inkStrokes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInkStrokes: Self = this.set("inkStrokes", js.undefined)
  }
}
