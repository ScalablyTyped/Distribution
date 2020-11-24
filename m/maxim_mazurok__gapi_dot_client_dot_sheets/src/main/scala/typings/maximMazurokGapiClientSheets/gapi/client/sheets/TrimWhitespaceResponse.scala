package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrimWhitespaceResponse extends js.Object {
  
  /** The number of cells that were trimmed of whitespace. */
  var cellsChangedCount: js.UndefOr[Double] = js.native
}
object TrimWhitespaceResponse {
  
  @scala.inline
  def apply(): TrimWhitespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimWhitespaceResponse]
  }
  
  @scala.inline
  implicit class TrimWhitespaceResponseOps[Self <: TrimWhitespaceResponse] (val x: Self) extends AnyVal {
    
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
    def setCellsChangedCount(value: Double): Self = this.set("cellsChangedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellsChangedCount: Self = this.set("cellsChangedCount", js.undefined)
  }
}
