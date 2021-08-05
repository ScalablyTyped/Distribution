package typings.playable

import typings.playable.adaptersTypesMod.IPlaybackAdapter
import typings.playable.playbackEngineTypesMod.IPlayableSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adaptersResolverMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/utils/adapters-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveAdapters(mediaStreams: js.Array[IPlayableSource], availableAdapters: js.Array[IPlaybackAdapter]): js.Array[IPlaybackAdapter] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAdapters")(mediaStreams.asInstanceOf[js.Any], availableAdapters.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPlaybackAdapter]]
}
