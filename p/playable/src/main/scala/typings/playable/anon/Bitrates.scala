package typings.playable.anon

import typings.playable.distSrcConstantsMediaStreamMod.MediaStreamDeliveryPriority
import typings.playable.distSrcConstantsMediaStreamMod.MediaStreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bitrates extends StObject {
  
  var bitrates: Any
  
  var bwEstimate: Double
  
  var currentBitrate: Any
  
  var currentTrack: Any
  
  var deliveryPriority: MediaStreamDeliveryPriority
  
  var nearestBufferSegInfo: End
  
  var overallBufferLength: Any
  
  var `type`: MediaStreamType
  
  var url: String
}
object Bitrates {
  
  inline def apply(
    bitrates: Any,
    bwEstimate: Double,
    currentBitrate: Any,
    currentTrack: Any,
    deliveryPriority: MediaStreamDeliveryPriority,
    nearestBufferSegInfo: End,
    overallBufferLength: Any,
    `type`: MediaStreamType,
    url: String
  ): Bitrates = {
    val __obj = js.Dynamic.literal(bitrates = bitrates.asInstanceOf[js.Any], bwEstimate = bwEstimate.asInstanceOf[js.Any], currentBitrate = currentBitrate.asInstanceOf[js.Any], currentTrack = currentTrack.asInstanceOf[js.Any], deliveryPriority = deliveryPriority.asInstanceOf[js.Any], nearestBufferSegInfo = nearestBufferSegInfo.asInstanceOf[js.Any], overallBufferLength = overallBufferLength.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bitrates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bitrates] (val x: Self) extends AnyVal {
    
    inline def setBitrates(value: Any): Self = StObject.set(x, "bitrates", value.asInstanceOf[js.Any])
    
    inline def setBwEstimate(value: Double): Self = StObject.set(x, "bwEstimate", value.asInstanceOf[js.Any])
    
    inline def setCurrentBitrate(value: Any): Self = StObject.set(x, "currentBitrate", value.asInstanceOf[js.Any])
    
    inline def setCurrentTrack(value: Any): Self = StObject.set(x, "currentTrack", value.asInstanceOf[js.Any])
    
    inline def setDeliveryPriority(value: MediaStreamDeliveryPriority): Self = StObject.set(x, "deliveryPriority", value.asInstanceOf[js.Any])
    
    inline def setNearestBufferSegInfo(value: End): Self = StObject.set(x, "nearestBufferSegInfo", value.asInstanceOf[js.Any])
    
    inline def setOverallBufferLength(value: Any): Self = StObject.set(x, "overallBufferLength", value.asInstanceOf[js.Any])
    
    inline def setType(value: MediaStreamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
