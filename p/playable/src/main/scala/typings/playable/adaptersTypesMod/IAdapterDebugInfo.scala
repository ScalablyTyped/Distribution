package typings.playable.adaptersTypesMod

import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typings.playable.mediaStreamMod.MediaStreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @property type - Name of current attached stream.
  * @property url - Url of current source
  * @property bitrates - List of all available bitrates. Internal structure different for different type of streams
  * @property currentBitrate - Current bitrate. Internal structure different for different type of streams
  * @property bwEstimate - Estimation of bandwidth
  * @property overallBufferLength - Overall length of buffer
  * @property nearestBufferSegInfo - Object with start and end for current buffer segment
  * @property deliveryPriority - Priority of current adapter
  */
@js.native
trait IAdapterDebugInfo extends js.Object {
  
  var bitrates: js.Array[String] = js.native
  
  var bwEstimate: Double = js.native
  
  var currentBitrate: String = js.native
  
  var deliveryPriority: MediaStreamDeliveryPriority = js.native
  
  var nearestBufferSegInfo: js.Object = js.native
  
  var overallBufferLength: Double = js.native
  
  var `type`: MediaStreamType = js.native
  
  var url: String = js.native
}
object IAdapterDebugInfo {
  
  @scala.inline
  def apply(
    bitrates: js.Array[String],
    bwEstimate: Double,
    currentBitrate: String,
    deliveryPriority: MediaStreamDeliveryPriority,
    nearestBufferSegInfo: js.Object,
    overallBufferLength: Double,
    `type`: MediaStreamType,
    url: String
  ): IAdapterDebugInfo = {
    val __obj = js.Dynamic.literal(bitrates = bitrates.asInstanceOf[js.Any], bwEstimate = bwEstimate.asInstanceOf[js.Any], currentBitrate = currentBitrate.asInstanceOf[js.Any], deliveryPriority = deliveryPriority.asInstanceOf[js.Any], nearestBufferSegInfo = nearestBufferSegInfo.asInstanceOf[js.Any], overallBufferLength = overallBufferLength.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAdapterDebugInfo]
  }
  
  @scala.inline
  implicit class IAdapterDebugInfoOps[Self <: IAdapterDebugInfo] (val x: Self) extends AnyVal {
    
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
    def setBitratesVarargs(value: String*): Self = this.set("bitrates", js.Array(value :_*))
    
    @scala.inline
    def setBitrates(value: js.Array[String]): Self = this.set("bitrates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBwEstimate(value: Double): Self = this.set("bwEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentBitrate(value: String): Self = this.set("currentBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryPriority(value: MediaStreamDeliveryPriority): Self = this.set("deliveryPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestBufferSegInfo(value: js.Object): Self = this.set("nearestBufferSegInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverallBufferLength(value: Double): Self = this.set("overallBufferLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MediaStreamType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
