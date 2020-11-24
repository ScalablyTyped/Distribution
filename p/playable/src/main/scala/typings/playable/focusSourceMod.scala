package typings.playable

import typings.playable.anon.Current
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/root-container/utils/focus-source", JSImport.Namespace)
@js.native
object focusSourceMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def disengage(): Unit = js.native
    @JSName("disengage")
    var disengage_Original: js.Function0[Unit] = js.native
    
    def engage(): Current = js.native
    @JSName("engage")
    var engage_Original: js.Function0[Current] = js.native
  }
}
