package typings.plottable

import typings.plottable.setMod.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/utils/callbackSet", JSImport.Namespace)
@js.native
object callbackSetMod extends js.Object {
  
  @js.native
  class CallbackSet[CB /* <: js.Function */] () extends Set[CB] {
    
    def callCallbacks(args: js.Any*): this.type = js.native
  }
}
