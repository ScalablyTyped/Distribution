package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.XNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollInfo extends js.Object {
  
  var handleLength: XNumber = js.native
  
  var handleLengthRatio: XNumber = js.native
  
  var handleOffset: XNumber = js.native
  
  var isRTL: Boolean = js.native
  
  var isRTLNormalized: Boolean = js.native
  
  var max: XNumber = js.native
  
  var position: XNumber = js.native
  
  var ratio: XNumber = js.native
  
  var snappedHandleOffset: XNumber = js.native
  
  var trackLength: XNumber = js.native
}
object ScrollInfo {
  
  @scala.inline
  def apply(
    handleLength: XNumber,
    handleLengthRatio: XNumber,
    handleOffset: XNumber,
    isRTL: Boolean,
    isRTLNormalized: Boolean,
    max: XNumber,
    position: XNumber,
    ratio: XNumber,
    snappedHandleOffset: XNumber,
    trackLength: XNumber
  ): ScrollInfo = {
    val __obj = js.Dynamic.literal(handleLength = handleLength.asInstanceOf[js.Any], handleLengthRatio = handleLengthRatio.asInstanceOf[js.Any], handleOffset = handleOffset.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], isRTLNormalized = isRTLNormalized.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], snappedHandleOffset = snappedHandleOffset.asInstanceOf[js.Any], trackLength = trackLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollInfo]
  }
  
  @scala.inline
  implicit class ScrollInfoOps[Self <: ScrollInfo] (val x: Self) extends AnyVal {
    
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
    def setHandleLength(value: XNumber): Self = this.set("handleLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleLengthRatio(value: XNumber): Self = this.set("handleLengthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleOffset(value: XNumber): Self = this.set("handleOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTLNormalized(value: Boolean): Self = this.set("isRTLNormalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: XNumber): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: XNumber): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatio(value: XNumber): Self = this.set("ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnappedHandleOffset(value: XNumber): Self = this.set("snappedHandleOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackLength(value: XNumber): Self = this.set("trackLength", value.asInstanceOf[js.Any])
  }
}
