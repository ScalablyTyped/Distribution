package typings.playable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/constants/media-stream", JSImport.Namespace)
@js.native
object mediaStreamMod extends js.Object {
  
  @js.native
  sealed trait MediaStreamDeliveryPriority extends js.Object
  @js.native
  object MediaStreamDeliveryPriority extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MediaStreamDeliveryPriority with Double] = js.native
    
    @js.native
    sealed trait ADAPTIVE_VIA_MSE extends MediaStreamDeliveryPriority
    /* 1 */ @js.native
    object ADAPTIVE_VIA_MSE extends TopLevel[ADAPTIVE_VIA_MSE with Double]
    
    @js.native
    sealed trait FORCED extends MediaStreamDeliveryPriority
    /* 3 */ @js.native
    object FORCED extends TopLevel[FORCED with Double]
    
    @js.native
    sealed trait NATIVE_ADAPTIVE extends MediaStreamDeliveryPriority
    /* 2 */ @js.native
    object NATIVE_ADAPTIVE extends TopLevel[NATIVE_ADAPTIVE with Double]
    
    @js.native
    sealed trait NATIVE_PROGRESSIVE extends MediaStreamDeliveryPriority
    /* 0 */ @js.native
    object NATIVE_PROGRESSIVE extends TopLevel[NATIVE_PROGRESSIVE with Double]
  }
  
  @js.native
  sealed trait MediaStreamType extends js.Object
  @js.native
  object MediaStreamType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaStreamType with String] = js.native
    
    @js.native
    sealed trait DASH extends MediaStreamType
    /* "DASH" */ @js.native
    object DASH extends TopLevel[DASH with String]
    
    @js.native
    sealed trait HLS extends MediaStreamType
    /* "HLS" */ @js.native
    object HLS extends TopLevel[HLS with String]
    
    @js.native
    sealed trait MKV extends MediaStreamType
    /* "MKV" */ @js.native
    object MKV extends TopLevel[MKV with String]
    
    @js.native
    sealed trait MOV extends MediaStreamType
    /* "MOV" */ @js.native
    object MOV extends TopLevel[MOV with String]
    
    @js.native
    sealed trait MP4 extends MediaStreamType
    /* "MP4" */ @js.native
    object MP4 extends TopLevel[MP4 with String]
    
    @js.native
    sealed trait OGG extends MediaStreamType
    /* "OGG" */ @js.native
    object OGG extends TopLevel[OGG with String]
    
    @js.native
    sealed trait WEBM extends MediaStreamType
    /* "WEBM" */ @js.native
    object WEBM extends TopLevel[WEBM with String]
  }
  
  @js.native
  object MimeToStreamTypeMap extends /* mimeType */ StringDictionary[MediaStreamType]
}
