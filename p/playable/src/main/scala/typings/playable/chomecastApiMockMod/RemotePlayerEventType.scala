package typings.playable.chomecastApiMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RemotePlayerEventType extends js.Object
@JSImport("playable/dist/src/testkit/chomecast-api-mock", "RemotePlayerEventType")
@js.native
object RemotePlayerEventType extends js.Object {
  
  @js.native
  sealed trait ANY_CHANGE extends RemotePlayerEventType
  
  @js.native
  sealed trait IS_PAUSED_CHANGED extends RemotePlayerEventType
}
