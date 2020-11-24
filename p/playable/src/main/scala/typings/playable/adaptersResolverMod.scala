package typings.playable

import typings.playable.adaptersTypesMod.IPlaybackAdapter
import typings.playable.playbackEngineTypesMod.IPlayableSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/playback-engine/utils/adapters-resolver", JSImport.Namespace)
@js.native
object adaptersResolverMod extends js.Object {
  
  def resolveAdapters(mediaStreams: js.Array[IPlayableSource], availableAdapters: js.Array[IPlaybackAdapter]): js.Array[IPlaybackAdapter] = js.native
}
