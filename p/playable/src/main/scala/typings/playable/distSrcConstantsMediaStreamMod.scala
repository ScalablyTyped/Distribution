package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConstantsMediaStreamMod {
  
  @js.native
  sealed trait MediaStreamDeliveryPriority extends StObject
  @JSImport("playable/dist/src/constants/media-stream", "MediaStreamDeliveryPriority")
  @js.native
  object MediaStreamDeliveryPriority extends StObject {
    
    @js.native
    sealed trait ADAPTIVE_VIA_MSE
      extends StObject
         with MediaStreamDeliveryPriority
    
    @js.native
    sealed trait FORCED
      extends StObject
         with MediaStreamDeliveryPriority
    
    @js.native
    sealed trait NATIVE_ADAPTIVE
      extends StObject
         with MediaStreamDeliveryPriority
    
    @js.native
    sealed trait NATIVE_PROGRESSIVE
      extends StObject
         with MediaStreamDeliveryPriority
  }
  
  @js.native
  sealed trait MediaStreamType extends StObject
  @JSImport("playable/dist/src/constants/media-stream", "MediaStreamType")
  @js.native
  object MediaStreamType extends StObject {
    
    @js.native
    sealed trait DASH
      extends StObject
         with MediaStreamType
    
    @js.native
    sealed trait HLS
      extends StObject
         with MediaStreamType
    
    @js.native
    sealed trait MKV
      extends StObject
         with MediaStreamType
    
    @js.native
    sealed trait MOV
      extends StObject
         with MediaStreamType
    
    @js.native
    sealed trait MP4
      extends StObject
         with MediaStreamType
    
    @js.native
    sealed trait OGG
      extends StObject
         with MediaStreamType
    
    @js.native
    sealed trait WEBM
      extends StObject
         with MediaStreamType
  }
}
