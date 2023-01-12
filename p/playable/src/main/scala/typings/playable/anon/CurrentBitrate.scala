package typings.playable.anon

import typings.playable.distSrcConstantsMediaStreamMod.MediaStreamType
import typings.playable.playableStrings.html5video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentBitrate extends StObject {
  
  var bitrates: js.Array[String]
  
  var bwEstimate: Double
  
  var currentBitrate: String
  
  var currentTime: Double
  
  var deliveryPriority: String
  
  var duration: Double
  
  var loadingStateTimestamps: js.Object
  
  var nearestBufferSegInfo: js.Object
  
  var output: html5video
  
  var overallBufferLength: Double
  
  var `type`: MediaStreamType
  
  var url: String
  
  var viewDimensions: js.Object
}
object CurrentBitrate {
  
  inline def apply(
    bitrates: js.Array[String],
    bwEstimate: Double,
    currentBitrate: String,
    currentTime: Double,
    deliveryPriority: String,
    duration: Double,
    loadingStateTimestamps: js.Object,
    nearestBufferSegInfo: js.Object,
    overallBufferLength: Double,
    `type`: MediaStreamType,
    url: String,
    viewDimensions: js.Object
  ): CurrentBitrate = {
    val __obj = js.Dynamic.literal(bitrates = bitrates.asInstanceOf[js.Any], bwEstimate = bwEstimate.asInstanceOf[js.Any], currentBitrate = currentBitrate.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], deliveryPriority = deliveryPriority.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], loadingStateTimestamps = loadingStateTimestamps.asInstanceOf[js.Any], nearestBufferSegInfo = nearestBufferSegInfo.asInstanceOf[js.Any], output = "html5video", overallBufferLength = overallBufferLength.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], viewDimensions = viewDimensions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentBitrate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrentBitrate] (val x: Self) extends AnyVal {
    
    inline def setBitrates(value: js.Array[String]): Self = StObject.set(x, "bitrates", value.asInstanceOf[js.Any])
    
    inline def setBitratesVarargs(value: String*): Self = StObject.set(x, "bitrates", js.Array(value*))
    
    inline def setBwEstimate(value: Double): Self = StObject.set(x, "bwEstimate", value.asInstanceOf[js.Any])
    
    inline def setCurrentBitrate(value: String): Self = StObject.set(x, "currentBitrate", value.asInstanceOf[js.Any])
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setDeliveryPriority(value: String): Self = StObject.set(x, "deliveryPriority", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLoadingStateTimestamps(value: js.Object): Self = StObject.set(x, "loadingStateTimestamps", value.asInstanceOf[js.Any])
    
    inline def setNearestBufferSegInfo(value: js.Object): Self = StObject.set(x, "nearestBufferSegInfo", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: html5video): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOverallBufferLength(value: Double): Self = StObject.set(x, "overallBufferLength", value.asInstanceOf[js.Any])
    
    inline def setType(value: MediaStreamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setViewDimensions(value: js.Object): Self = StObject.set(x, "viewDimensions", value.asInstanceOf[js.Any])
  }
}
