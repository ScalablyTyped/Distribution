package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBordersRequest extends js.Object {
  
  /** The border to put at the bottom of the range. */
  var bottom: js.UndefOr[Border] = js.native
  
  /** The horizontal border to put within the range. */
  var innerHorizontal: js.UndefOr[Border] = js.native
  
  /** The vertical border to put within the range. */
  var innerVertical: js.UndefOr[Border] = js.native
  
  /** The border to put at the left of the range. */
  var left: js.UndefOr[Border] = js.native
  
  /** The range whose borders should be updated. */
  var range: js.UndefOr[GridRange] = js.native
  
  /** The border to put at the right of the range. */
  var right: js.UndefOr[Border] = js.native
  
  /** The border to put at the top of the range. */
  var top: js.UndefOr[Border] = js.native
}
object UpdateBordersRequest {
  
  @scala.inline
  def apply(): UpdateBordersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBordersRequest]
  }
  
  @scala.inline
  implicit class UpdateBordersRequestOps[Self <: UpdateBordersRequest] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: Border): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setInnerHorizontal(value: Border): Self = this.set("innerHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerHorizontal: Self = this.set("innerHorizontal", js.undefined)
    
    @scala.inline
    def setInnerVertical(value: Border): Self = this.set("innerVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerVertical: Self = this.set("innerVertical", js.undefined)
    
    @scala.inline
    def setLeft(value: Border): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRight(value: Border): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setTop(value: Border): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
