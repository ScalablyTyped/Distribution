package typings.playable.anon

import typings.playable.mediaStreamMod.MediaStreamType
import typings.playable.playableStrings.html5video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentBitrate extends js.Object {
  
  var bitrates: js.Array[String] = js.native
  
  var bwEstimate: Double = js.native
  
  var currentBitrate: String = js.native
  
  var currentTime: Double = js.native
  
  var deliveryPriority: String = js.native
  
  var duration: Double = js.native
  
  var loadingStateTimestamps: js.Object = js.native
  
  var nearestBufferSegInfo: js.Object = js.native
  
  var output: html5video = js.native
  
  var overallBufferLength: Double = js.native
  
  var `type`: MediaStreamType = js.native
  
  var url: String = js.native
  
  var viewDimensions: js.Object = js.native
}
object CurrentBitrate {
  
  @scala.inline
  def apply(
    bitrates: js.Array[String],
    bwEstimate: Double,
    currentBitrate: String,
    currentTime: Double,
    deliveryPriority: String,
    duration: Double,
    loadingStateTimestamps: js.Object,
    nearestBufferSegInfo: js.Object,
    output: html5video,
    overallBufferLength: Double,
    `type`: MediaStreamType,
    url: String,
    viewDimensions: js.Object
  ): CurrentBitrate = {
    val __obj = js.Dynamic.literal(bitrates = bitrates.asInstanceOf[js.Any], bwEstimate = bwEstimate.asInstanceOf[js.Any], currentBitrate = currentBitrate.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], deliveryPriority = deliveryPriority.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], loadingStateTimestamps = loadingStateTimestamps.asInstanceOf[js.Any], nearestBufferSegInfo = nearestBufferSegInfo.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], overallBufferLength = overallBufferLength.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], viewDimensions = viewDimensions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentBitrate]
  }
  
  @scala.inline
  implicit class CurrentBitrateOps[Self <: CurrentBitrate] (val x: Self) extends AnyVal {
    
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
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryPriority(value: String): Self = this.set("deliveryPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingStateTimestamps(value: js.Object): Self = this.set("loadingStateTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestBufferSegInfo(value: js.Object): Self = this.set("nearestBufferSegInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: html5video): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverallBufferLength(value: Double): Self = this.set("overallBufferLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MediaStreamType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewDimensions(value: js.Object): Self = this.set("viewDimensions", value.asInstanceOf[js.Any])
  }
}
