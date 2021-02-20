package typings.playable.anon

import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typings.playable.mediaStreamMod.MediaStreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BwEstimate extends StObject {
  
  var bitrates: js.Any = js.native
  
  var bwEstimate: Double = js.native
  
  var currentBitrate: js.Any = js.native
  
  var deliveryPriority: MediaStreamDeliveryPriority = js.native
  
  var nearestBufferSegInfo: End = js.native
  
  var overallBufferLength: Double = js.native
  
  var `type`: MediaStreamType = js.native
  
  var url: String = js.native
}
object BwEstimate {
  
  @scala.inline
  def apply(
    bitrates: js.Any,
    bwEstimate: Double,
    currentBitrate: js.Any,
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
  
  @scala.inline
  implicit class BwEstimateMutableBuilder[Self <: BwEstimate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrates(value: js.Any): Self = StObject.set(x, "bitrates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBwEstimate(value: Double): Self = StObject.set(x, "bwEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentBitrate(value: js.Any): Self = StObject.set(x, "currentBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryPriority(value: MediaStreamDeliveryPriority): Self = StObject.set(x, "deliveryPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestBufferSegInfo(value: End): Self = StObject.set(x, "nearestBufferSegInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverallBufferLength(value: Double): Self = StObject.set(x, "overallBufferLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MediaStreamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
