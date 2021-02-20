package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.XNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollInfo extends StObject {
  
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
  implicit class ScrollInfoMutableBuilder[Self <: ScrollInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleLength(value: XNumber): Self = StObject.set(x, "handleLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleLengthRatio(value: XNumber): Self = StObject.set(x, "handleLengthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleOffset(value: XNumber): Self = StObject.set(x, "handleOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTLNormalized(value: Boolean): Self = StObject.set(x, "isRTLNormalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: XNumber): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: XNumber): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatio(value: XNumber): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnappedHandleOffset(value: XNumber): Self = StObject.set(x, "snappedHandleOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackLength(value: XNumber): Self = StObject.set(x, "trackLength", value.asInstanceOf[js.Any])
  }
}
