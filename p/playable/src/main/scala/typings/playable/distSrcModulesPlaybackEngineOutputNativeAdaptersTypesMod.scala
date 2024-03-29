package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.distSrcConstantsMediaStreamMod.MediaStreamDeliveryPriority
import typings.playable.distSrcConstantsMediaStreamMod.MediaStreamType
import typings.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typings.playable.distSrcModulesPlaybackEngineTypesMod.IPlayableSource
import typings.playable.distSrcModulesPlaybackEngineTypesMod.PlayableMediaSource
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesPlaybackEngineOutputNativeAdaptersTypesMod {
  
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
  trait IAdapterDebugInfo extends StObject {
    
    var bitrates: js.Array[String]
    
    var bwEstimate: Double
    
    var currentBitrate: String
    
    var deliveryPriority: MediaStreamDeliveryPriority
    
    var nearestBufferSegInfo: js.Object
    
    var overallBufferLength: Double
    
    var `type`: MediaStreamType
    
    var url: String
  }
  object IAdapterDebugInfo {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IAdapterDebugInfo] (val x: Self) extends AnyVal {
      
      inline def setBitrates(value: js.Array[String]): Self = StObject.set(x, "bitrates", value.asInstanceOf[js.Any])
      
      inline def setBitratesVarargs(value: String*): Self = StObject.set(x, "bitrates", js.Array(value*))
      
      inline def setBwEstimate(value: Double): Self = StObject.set(x, "bwEstimate", value.asInstanceOf[js.Any])
      
      inline def setCurrentBitrate(value: String): Self = StObject.set(x, "currentBitrate", value.asInstanceOf[js.Any])
      
      inline def setDeliveryPriority(value: MediaStreamDeliveryPriority): Self = StObject.set(x, "deliveryPriority", value.asInstanceOf[js.Any])
      
      inline def setNearestBufferSegInfo(value: js.Object): Self = StObject.set(x, "nearestBufferSegInfo", value.asInstanceOf[js.Any])
      
      inline def setOverallBufferLength(value: Double): Self = StObject.set(x, "overallBufferLength", value.asInstanceOf[js.Any])
      
      inline def setType(value: MediaStreamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPlaybackAdapter extends StObject {
    
    def attach(videoElement: HTMLVideoElement): Unit
    
    def canPlay(mediaType: MediaStreamType): Boolean
    
    var currentUrl: PlayableMediaSource
    
    var debugInfo: IAdapterDebugInfo
    
    def detach(): Unit
    
    var isDynamicContent: Boolean
    
    var isDynamicContentEnded: Boolean
    
    var isSeekAvailable: Boolean
    
    var isSyncWithLive: Boolean
    
    var mediaStreamDeliveryPriority: MediaStreamDeliveryPriority
    
    def setMediaStreams(mediaStreams: Any): Unit
    
    var syncWithLiveTime: Double
  }
  object IPlaybackAdapter {
    
    inline def apply(
      attach: HTMLVideoElement => Unit,
      canPlay: MediaStreamType => Boolean,
      currentUrl: PlayableMediaSource,
      debugInfo: IAdapterDebugInfo,
      detach: () => Unit,
      isDynamicContent: Boolean,
      isDynamicContentEnded: Boolean,
      isSeekAvailable: Boolean,
      isSyncWithLive: Boolean,
      mediaStreamDeliveryPriority: MediaStreamDeliveryPriority,
      setMediaStreams: Any => Unit,
      syncWithLiveTime: Double
    ): IPlaybackAdapter = {
      val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), canPlay = js.Any.fromFunction1(canPlay), currentUrl = currentUrl.asInstanceOf[js.Any], debugInfo = debugInfo.asInstanceOf[js.Any], detach = js.Any.fromFunction0(detach), isDynamicContent = isDynamicContent.asInstanceOf[js.Any], isDynamicContentEnded = isDynamicContentEnded.asInstanceOf[js.Any], isSeekAvailable = isSeekAvailable.asInstanceOf[js.Any], isSyncWithLive = isSyncWithLive.asInstanceOf[js.Any], mediaStreamDeliveryPriority = mediaStreamDeliveryPriority.asInstanceOf[js.Any], setMediaStreams = js.Any.fromFunction1(setMediaStreams), syncWithLiveTime = syncWithLiveTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlaybackAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPlaybackAdapter] (val x: Self) extends AnyVal {
      
      inline def setAttach(value: HTMLVideoElement => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
      
      inline def setCanPlay(value: MediaStreamType => Boolean): Self = StObject.set(x, "canPlay", js.Any.fromFunction1(value))
      
      inline def setCurrentUrl(value: PlayableMediaSource): Self = StObject.set(x, "currentUrl", value.asInstanceOf[js.Any])
      
      inline def setCurrentUrlVarargs(value: (String | IPlayableSource)*): Self = StObject.set(x, "currentUrl", js.Array(value*))
      
      inline def setDebugInfo(value: IAdapterDebugInfo): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
      
      inline def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
      
      inline def setIsDynamicContent(value: Boolean): Self = StObject.set(x, "isDynamicContent", value.asInstanceOf[js.Any])
      
      inline def setIsDynamicContentEnded(value: Boolean): Self = StObject.set(x, "isDynamicContentEnded", value.asInstanceOf[js.Any])
      
      inline def setIsSeekAvailable(value: Boolean): Self = StObject.set(x, "isSeekAvailable", value.asInstanceOf[js.Any])
      
      inline def setIsSyncWithLive(value: Boolean): Self = StObject.set(x, "isSyncWithLive", value.asInstanceOf[js.Any])
      
      inline def setMediaStreamDeliveryPriority(value: MediaStreamDeliveryPriority): Self = StObject.set(x, "mediaStreamDeliveryPriority", value.asInstanceOf[js.Any])
      
      inline def setSetMediaStreams(value: Any => Unit): Self = StObject.set(x, "setMediaStreams", js.Any.fromFunction1(value))
      
      inline def setSyncWithLiveTime(value: Double): Self = StObject.set(x, "syncWithLiveTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPlaybackAdapterClass
    extends StObject
       with Instantiable1[/* eventEmitter */ IEventEmitter, IPlaybackAdapter] {
    
    def isSupported(): Boolean = js.native
  }
}
