package typings.playable

import typings.playable.anon.Get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/root-container/utils/interaction-type", JSImport.Namespace)
@js.native
object interactionTypeMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def disengage(): Unit = js.native
    @JSName("disengage")
    var disengage_Original: js.Function0[Unit] = js.native
    
    def engage(): Get = js.native
    @JSName("engage")
    var engage_Original: js.Function0[Get] = js.native
  }
}
