package typings.playable.anon

import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typings.playable.mediaStreamMod.MediaStreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BwEstimate extends StObject {
  
  var bitrates: Any
  
  var bwEstimate: Double
  
  var currentBitrate: Any
  
  var deliveryPriority: MediaStreamDeliveryPriority
  
  var nearestBufferSegInfo: End
  
  var overallBufferLength: Double
  
  var `type`: MediaStreamType
  
  var url: String
}
object BwEstimate {
  
  inline def apply(
    bitrates: Any,
    bwEstimate: Double,
    currentBitrate: Any,
    deliveryPriority: MediaStreamDeliveryPriority,
    nearestBufferSegInfo: End,
    overallBufferLength: Double,
    `type`: MediaStreamType,
    url: String
  ): BwEstimate = {
    val __obj = js.Dynamic.literal(bitrates = bitrates.asInstanceOf[js.Any], bwEstimate = bwEstimate.asInstanceOf[js.Any], currentBitrate = currentBitrate.asInstanceOf[js.Any], deliveryPriority = deliveryPriority.asInstanceOf[js.Any], nearestBufferSegInfo = nearestBufferSegInfo.asInstanceOf[js.Any], overallBufferLength = overallBufferLength.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BwEstimate]
  }
  
  extension [Self <: BwEstimate](x: Self) {
    
    inline def setBitrates(value: Any): Self = StObject.set(x, "bitrates", value.asInstanceOf[js.Any])
    
    inline def setBwEstimate(value: Double): Self = StObject.set(x, "bwEstimate", value.asInstanceOf[js.Any])
    
    inline def setCurrentBitrate(value: Any): Self = StObject.set(x, "currentBitrate", value.asInstanceOf[js.Any])
    
    inline def setDeliveryPriority(value: MediaStreamDeliveryPriority): Self = StObject.set(x, "deliveryPriority", value.asInstanceOf[js.Any])
    
    inline def setNearestBufferSegInfo(value: End): Self = StObject.set(x, "nearestBufferSegInfo", value.asInstanceOf[js.Any])
    
    inline def setOverallBufferLength(value: Double): Self = StObject.set(x, "overallBufferLength", value.asInstanceOf[js.Any])
    
    inline def setType(value: MediaStreamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
