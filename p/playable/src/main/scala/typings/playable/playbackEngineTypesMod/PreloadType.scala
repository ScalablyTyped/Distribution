package typings.playable.playbackEngineTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PreloadType extends js.Object
@JSImport("playable/dist/src/modules/playback-engine/types", "PreloadType")
@js.native
object PreloadType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PreloadType with String] = js.native
  
  @js.native
  sealed trait AUTO extends PreloadType
  /* "auto" */ @js.native
  object AUTO extends TopLevel[AUTO with String]
  
  @js.native
  sealed trait METADATA extends PreloadType
  /* "metadata" */ @js.native
  object METADATA extends TopLevel[METADATA with String]
  
  @js.native
  sealed trait NONE extends PreloadType
  /* "none" */ @js.native
  object NONE extends TopLevel[NONE with String]
}
