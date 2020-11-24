package typings.playable.withDashMod

import typings.playable.playbackEngineTypesMod.PreloadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/with-dash", "PRELOAD_TYPES")
@js.native
object PRELOAD_TYPES extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PreloadType with String] = js.native
  
  /* "auto" */ val AUTO: typings.playable.playbackEngineTypesMod.PreloadType.AUTO with String = js.native
  
  /* "metadata" */ val METADATA: typings.playable.playbackEngineTypesMod.PreloadType.METADATA with String = js.native
  
  /* "none" */ val NONE: typings.playable.playbackEngineTypesMod.PreloadType.NONE with String = js.native
}
