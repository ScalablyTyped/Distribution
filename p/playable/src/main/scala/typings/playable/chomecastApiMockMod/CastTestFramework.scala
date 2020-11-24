package typings.playable.chomecastApiMockMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.GetInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/testkit/chomecast-api-mock", "CastTestFramework")
@js.native
class CastTestFramework () extends js.Object {
  
  def CastContext: GetInstance = js.native
  
  def CastContextEventType: js.Any = js.native
  
  var RemotePlayer: Instantiable0[typings.playable.chomecastApiMockMod.RemotePlayer] = js.native
  
  var RemotePlayerController: Instantiable1[
    /* player */ RemotePlayer, 
    typings.playable.chomecastApiMockMod.RemotePlayerController
  ] = js.native
  
  def RemotePlayerEventType: js.Any = js.native
  
  def SessionState: js.Any = js.native
  
  var _context: js.Any = js.native
  
  def context: CastContext = js.native
  
  def trigger(`type`: eventType, event: js.Any): Unit = js.native
}
