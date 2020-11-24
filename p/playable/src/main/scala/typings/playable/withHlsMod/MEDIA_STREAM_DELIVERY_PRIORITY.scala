package typings.playable.withHlsMod

import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/with-hls", "MEDIA_STREAM_DELIVERY_PRIORITY")
@js.native
object MEDIA_STREAM_DELIVERY_PRIORITY extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaStreamDeliveryPriority with Double] = js.native
  
  /* 1 */ val ADAPTIVE_VIA_MSE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.ADAPTIVE_VIA_MSE with Double = js.native
  
  /* 3 */ val FORCED: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.FORCED with Double = js.native
  
  /* 2 */ val NATIVE_ADAPTIVE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_ADAPTIVE with Double = js.native
  
  /* 0 */ val NATIVE_PROGRESSIVE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_PROGRESSIVE with Double = js.native
}
