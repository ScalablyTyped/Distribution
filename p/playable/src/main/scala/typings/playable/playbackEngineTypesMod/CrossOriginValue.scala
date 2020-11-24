package typings.playable.playbackEngineTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CrossOriginValue extends js.Object
@JSImport("playable/dist/src/modules/playback-engine/types", "CrossOriginValue")
@js.native
object CrossOriginValue extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CrossOriginValue with String] = js.native
  
  @js.native
  sealed trait ANONYMUS extends CrossOriginValue
  /* "anonymous" */ @js.native
  object ANONYMUS extends TopLevel[ANONYMUS with String]
  
  @js.native
  sealed trait CREDENTIALS extends CrossOriginValue
  /* "use-credentials" */ @js.native
  object CREDENTIALS extends TopLevel[CREDENTIALS with String]
}
