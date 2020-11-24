package typings.playable.screenTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VideoViewMode extends js.Object
@JSImport("playable/dist/src/modules/ui/screen/types", "VideoViewMode")
@js.native
object VideoViewMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VideoViewMode with String] = js.native
  
  @js.native
  sealed trait BLUR extends VideoViewMode
  /* "BLUR" */ @js.native
  object BLUR extends TopLevel[BLUR with String]
  
  @js.native
  sealed trait FILL extends VideoViewMode
  /* "FILL" */ @js.native
  object FILL extends TopLevel[FILL with String]
  
  @js.native
  sealed trait REGULAR extends VideoViewMode
  /* "REGULAR" */ @js.native
  object REGULAR extends TopLevel[REGULAR with String]
}
