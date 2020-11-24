package typings.playable.playbackEngineTypesMod

import typings.playable.adaptersTypesMod.IAdapterDebugInfo
import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typings.playable.mediaStreamMod.MediaStreamType
import typings.playable.playableStrings.html5video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @property viewDimensions - Current size of view port provided by engine (right now - actual size of video tag)
  * @property currentTime - Current time of playback
  * @property duration - Duration of current video
  * @property loadingStateTimestamps - Object with time spend for different initial phases
  * @property output - Type of the output (html5video, chromecast etc.);
  */
@js.native
trait INativeDebugInfo extends IAdapterDebugInfo {
  
  var currentTime: Double = js.native
  
  var duration: Double = js.native
  
  var loadingStateTimestamps: js.Object = js.native
  
  var output: html5video = js.native
  
  var viewDimensions: js.Object = js.native
}
object INativeDebugInfo {
  
  @scala.inline
  def apply(
    bitrates: js.Array[String],
    bwEstimate: Double,
    currentBitrate: String,
    currentTime: Double,
    deliveryPriority: MediaStreamDeliveryPriority,
    duration: Double,
    loadingStateTimestamps: js.Object,
    nearestBufferSegInfo: js.Object,
    output: html5video,
    overallBufferLength: Double,
    `type`: MediaStreamType,
    url: String,
    viewDimensions: js.Object
  ): INativeDebugInfo = {
    val __obj = js.Dynamic.literal(bitrates = bitrates.asInstanceOf[js.Any], bwEstimate = bwEstimate.asInstanceOf[js.Any], currentBitrate = currentBitrate.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], deliveryPriority = deliveryPriority.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], loadingStateTimestamps = loadingStateTimestamps.asInstanceOf[js.Any], nearestBufferSegInfo = nearestBufferSegInfo.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], overallBufferLength = overallBufferLength.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], viewDimensions = viewDimensions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[INativeDebugInfo]
  }
  
  @scala.inline
  implicit class INativeDebugInfoOps[Self <: INativeDebugInfo] (val x: Self) extends AnyVal {
    
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
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingStateTimestamps(value: js.Object): Self = this.set("loadingStateTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: html5video): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewDimensions(value: js.Object): Self = this.set("viewDimensions", value.asInstanceOf[js.Any])
  }
}
