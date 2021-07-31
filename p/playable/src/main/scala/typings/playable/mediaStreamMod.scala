package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaStreamMod {
  
  @js.native
  sealed trait MediaStreamDeliveryPriority extends StObject
  @JSImport("playable/dist/src/constants/media-stream", "MediaStreamDeliveryPriority")
  @js.native
  object MediaStreamDeliveryPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MediaStreamDeliveryPriority & Double] = js.native
    
    @js.native
    sealed trait ADAPTIVE_VIA_MSE
      extends StObject
         with MediaStreamDeliveryPriority
    /* 1 */ val ADAPTIVE_VIA_MSE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.ADAPTIVE_VIA_MSE & Double = js.native
    
    @js.native
    sealed trait FORCED
      extends StObject
         with MediaStreamDeliveryPriority
    /* 3 */ val FORCED: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.FORCED & Double = js.native
    
    @js.native
    sealed trait NATIVE_ADAPTIVE
      extends StObject
         with MediaStreamDeliveryPriority
    /* 2 */ val NATIVE_ADAPTIVE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_ADAPTIVE & Double = js.native
    
    @js.native
    sealed trait NATIVE_PROGRESSIVE
      extends StObject
         with MediaStreamDeliveryPriority
    /* 0 */ val NATIVE_PROGRESSIVE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_PROGRESSIVE & Double = js.native
  }
  
  @js.native
  sealed trait MediaStreamType extends StObject
  @JSImport("playable/dist/src/constants/media-stream", "MediaStreamType")
  @js.native
  object MediaStreamType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaStreamType & String] = js.native
    
    @js.native
    sealed trait DASH
      extends StObject
         with MediaStreamType
    /* "DASH" */ val DASH: typings.playable.mediaStreamMod.MediaStreamType.DASH & String = js.native
    
    @js.native
    sealed trait HLS
      extends StObject
         with MediaStreamType
    /* "HLS" */ val HLS: typings.playable.mediaStreamMod.MediaStreamType.HLS & String = js.native
    
    @js.native
    sealed trait MKV
      extends StObject
         with MediaStreamType
    /* "MKV" */ val MKV: typings.playable.mediaStreamMod.MediaStreamType.MKV & String = js.native
    
    @js.native
    sealed trait MOV
      extends StObject
         with MediaStreamType
    /* "MOV" */ val MOV: typings.playable.mediaStreamMod.MediaStreamType.MOV & String = js.native
    
    @js.native
    sealed trait MP4
      extends StObject
         with MediaStreamType
    /* "MP4" */ val MP4: typings.playable.mediaStreamMod.MediaStreamType.MP4 & String = js.native
    
    @js.native
    sealed trait OGG
      extends StObject
         with MediaStreamType
    /* "OGG" */ val OGG: typings.playable.mediaStreamMod.MediaStreamType.OGG & String = js.native
    
    @js.native
    sealed trait WEBM
      extends StObject
         with MediaStreamType
    /* "WEBM" */ val WEBM: typings.playable.mediaStreamMod.MediaStreamType.WEBM & String = js.native
  }
}
