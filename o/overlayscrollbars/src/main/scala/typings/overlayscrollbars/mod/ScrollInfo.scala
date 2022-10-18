package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollInfo extends StObject {
  
  var handleLength: X
  
  var handleLengthRatio: X
  
  var handleOffset: X
  
  var isRTL: Boolean
  
  var isRTLNormalized: Boolean
  
  var max: X
  
  var position: X
  
  var ratio: X
  
  var snappedHandleOffset: X
  
  var trackLength: X
}
object ScrollInfo {
  
  inline def apply(
    handleLength: X,
    handleLengthRatio: X,
    handleOffset: X,
    isRTL: Boolean,
    isRTLNormalized: Boolean,
    max: X,
    position: X,
    ratio: X,
    snappedHandleOffset: X,
    trackLength: X
  ): ScrollInfo = {
    val __obj = js.Dynamic.literal(handleLength = handleLength.asInstanceOf[js.Any], handleLengthRatio = handleLengthRatio.asInstanceOf[js.Any], handleOffset = handleOffset.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], isRTLNormalized = isRTLNormalized.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], snappedHandleOffset = snappedHandleOffset.asInstanceOf[js.Any], trackLength = trackLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollInfo]
  }
  
  extension [Self <: ScrollInfo](x: Self) {
    
    inline def setHandleLength(value: X): Self = StObject.set(x, "handleLength", value.asInstanceOf[js.Any])
    
    inline def setHandleLengthRatio(value: X): Self = StObject.set(x, "handleLengthRatio", value.asInstanceOf[js.Any])
    
    inline def setHandleOffset(value: X): Self = StObject.set(x, "handleOffset", value.asInstanceOf[js.Any])
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    inline def setIsRTLNormalized(value: Boolean): Self = StObject.set(x, "isRTLNormalized", value.asInstanceOf[js.Any])
    
    inline def setMax(value: X): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: X): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRatio(value: X): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setSnappedHandleOffset(value: X): Self = StObject.set(x, "snappedHandleOffset", value.asInstanceOf[js.Any])
    
    inline def setTrackLength(value: X): Self = StObject.set(x, "trackLength", value.asInstanceOf[js.Any])
  }
}
