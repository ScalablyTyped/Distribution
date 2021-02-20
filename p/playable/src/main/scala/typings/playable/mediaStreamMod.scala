package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaStreamMod {
  
  @js.native
  sealed trait MediaStreamDeliveryPriority extends StObject
  @JSImport("playable/dist/src/constants/media-stream", "MediaStreamDeliveryPriority")
  @js.native
  object MediaStreamDeliveryPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MediaStreamDeliveryPriority with Double] = js.native
    
    @js.native
    sealed trait ADAPTIVE_VIA_MSE extends MediaStreamDeliveryPriority
    /* 1 */ val ADAPTIVE_VIA_MSE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.ADAPTIVE_VIA_MSE with Double = js.native
    
    @js.native
    sealed trait FORCED extends MediaStreamDeliveryPriority
    /* 3 */ val FORCED: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.FORCED with Double = js.native
    
    @js.native
    sealed trait NATIVE_ADAPTIVE extends MediaStreamDeliveryPriority
    /* 2 */ val NATIVE_ADAPTIVE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_ADAPTIVE with Double = js.native
    
    @js.native
    sealed trait NATIVE_PROGRESSIVE extends MediaStreamDeliveryPriority
    /* 0 */ val NATIVE_PROGRESSIVE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_PROGRESSIVE with Double = js.native
  }
  
  @js.native
  sealed trait MediaStreamType extends StObject
  @JSImport("playable/dist/src/constants/media-stream", "MediaStreamType")
  @js.native
  object MediaStreamType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaStreamType with String] = js.native
    
    @js.native
    sealed trait DASH extends MediaStreamType
    /* "DASH" */ val DASH: typings.playable.mediaStreamMod.MediaStreamType.DASH with String = js.native
    
    @js.native
    sealed trait HLS extends MediaStreamType
    /* "HLS" */ val HLS: typings.playable.mediaStreamMod.MediaStreamType.HLS with String = js.native
    
    @js.native
    sealed trait MKV extends MediaStreamType
    /* "MKV" */ val MKV: typings.playable.mediaStreamMod.MediaStreamType.MKV with String = js.native
    
    @js.native
    sealed trait MOV extends MediaStreamType
    /* "MOV" */ val MOV: typings.playable.mediaStreamMod.MediaStreamType.MOV with String = js.native
    
    @js.native
    sealed trait MP4 extends MediaStreamType
    /* "MP4" */ val MP4: typings.playable.mediaStreamMod.MediaStreamType.MP4 with String = js.native
    
    @js.native
    sealed trait OGG extends MediaStreamType
    /* "OGG" */ val OGG: typings.playable.mediaStreamMod.MediaStreamType.OGG with String = js.native
    
    @js.native
    sealed trait WEBM extends MediaStreamType
    /* "WEBM" */ val WEBM: typings.playable.mediaStreamMod.MediaStreamType.WEBM with String = js.native
  }
}
