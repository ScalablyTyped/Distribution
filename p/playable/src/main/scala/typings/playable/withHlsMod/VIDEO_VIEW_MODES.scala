package typings.playable.withHlsMod

import typings.playable.screenTypesMod.VideoViewMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/with-hls", "VIDEO_VIEW_MODES")
@js.native
object VIDEO_VIEW_MODES extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VideoViewMode with String] = js.native
  
  /* "BLUR" */ val BLUR: typings.playable.screenTypesMod.VideoViewMode.BLUR with String = js.native
  
  /* "FILL" */ val FILL: typings.playable.screenTypesMod.VideoViewMode.FILL with String = js.native
  
  /* "REGULAR" */ val REGULAR: typings.playable.screenTypesMod.VideoViewMode.REGULAR with String = js.native
}
