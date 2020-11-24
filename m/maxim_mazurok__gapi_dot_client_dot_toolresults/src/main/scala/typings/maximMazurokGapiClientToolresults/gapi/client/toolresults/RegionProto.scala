package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionProto extends js.Object {
  
  /** The height, in pixels. Always set. */
  var heightPx: js.UndefOr[Double] = js.native
  
  /** The left side of the rectangle, in pixels. Always set. */
  var leftPx: js.UndefOr[Double] = js.native
  
  /** The top of the rectangle, in pixels. Always set. */
  var topPx: js.UndefOr[Double] = js.native
  
  /** The width, in pixels. Always set. */
  var widthPx: js.UndefOr[Double] = js.native
}
object RegionProto {
  
  @scala.inline
  def apply(): RegionProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionProto]
  }
  
  @scala.inline
  implicit class RegionProtoOps[Self <: RegionProto] (val x: Self) extends AnyVal {
    
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
    def setHeightPx(value: Double): Self = this.set("heightPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightPx: Self = this.set("heightPx", js.undefined)
    
    @scala.inline
    def setLeftPx(value: Double): Self = this.set("leftPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftPx: Self = this.set("leftPx", js.undefined)
    
    @scala.inline
    def setTopPx(value: Double): Self = this.set("topPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopPx: Self = this.set("topPx", js.undefined)
    
    @scala.inline
    def setWidthPx(value: Double): Self = this.set("widthPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthPx: Self = this.set("widthPx", js.undefined)
  }
}
