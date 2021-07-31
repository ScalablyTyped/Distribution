package typings.playable

import typings.playable.adaptersTypesMod.IPlaybackAdapterClass
import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typings.playable.mediaStreamMod.MediaStreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/adapters/native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(streamType: MediaStreamType, deliveryPriority: MediaStreamDeliveryPriority): IPlaybackAdapterClass = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(streamType.asInstanceOf[js.Any], deliveryPriority.asInstanceOf[js.Any])).asInstanceOf[IPlaybackAdapterClass]
}
