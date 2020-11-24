package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyPasteRequest extends js.Object {
  
  /**
    * The location to paste to. If the range covers a span that's a multiple of the source's height or width, then the data will be repeated to fill in the destination range. If the range
    * is smaller than the source range, the entire source data will still be copied (beyond the end of the destination range).
    */
  var destination: js.UndefOr[GridRange] = js.native
  
  /** How that data should be oriented when pasting. */
  var pasteOrientation: js.UndefOr[String] = js.native
  
  /** What kind of data to paste. */
  var pasteType: js.UndefOr[String] = js.native
  
  /** The source range to copy. */
  var source: js.UndefOr[GridRange] = js.native
}
object CopyPasteRequest {
  
  @scala.inline
  def apply(): CopyPasteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyPasteRequest]
  }
  
  @scala.inline
  implicit class CopyPasteRequestOps[Self <: CopyPasteRequest] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: GridRange): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setPasteOrientation(value: String): Self = this.set("pasteOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasteOrientation: Self = this.set("pasteOrientation", js.undefined)
    
    @scala.inline
    def setPasteType(value: String): Self = this.set("pasteType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasteType: Self = this.set("pasteType", js.undefined)
    
    @scala.inline
    def setSource(value: GridRange): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
