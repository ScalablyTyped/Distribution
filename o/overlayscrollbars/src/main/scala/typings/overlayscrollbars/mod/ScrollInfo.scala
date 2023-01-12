package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.XNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollInfo extends StObject {
  
  var handleLength: XNumber
  
  var handleLengthRatio: XNumber
  
  var handleOffset: XNumber
  
  var isRTL: Boolean
  
  var isRTLNormalized: Boolean
  
  var max: XNumber
  
  var position: XNumber
  
  var ratio: XNumber
  
  var snappedHandleOffset: XNumber
  
  var trackLength: XNumber
}
object ScrollInfo {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ScrollInfo] (val x: Self) extends AnyVal {
    
    inline def setHandleLength(value: XNumber): Self = StObject.set(x, "handleLength", value.asInstanceOf[js.Any])
    
    inline def setHandleLengthRatio(value: XNumber): Self = StObject.set(x, "handleLengthRatio", value.asInstanceOf[js.Any])
    
    inline def setHandleOffset(value: XNumber): Self = StObject.set(x, "handleOffset", value.asInstanceOf[js.Any])
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    inline def setIsRTLNormalized(value: Boolean): Self = StObject.set(x, "isRTLNormalized", value.asInstanceOf[js.Any])
    
    inline def setMax(value: XNumber): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: XNumber): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRatio(value: XNumber): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setSnappedHandleOffset(value: XNumber): Self = StObject.set(x, "snappedHandleOffset", value.asInstanceOf[js.Any])
    
    inline def setTrackLength(value: XNumber): Self = StObject.set(x, "trackLength", value.asInstanceOf[js.Any])
  }
}
