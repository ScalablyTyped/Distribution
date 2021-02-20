package typings.playable

import typings.playable.adaptersTypesMod.IPlaybackAdapter
import typings.playable.playbackEngineTypesMod.IPlayableSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adaptersResolverMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/utils/adapters-resolver", "resolveAdapters")
  @js.native
  def resolveAdapters(mediaStreams: js.Array[IPlayableSource], availableAdapters: js.Array[IPlaybackAdapter]): js.Array[IPlaybackAdapter] = js.native
}
