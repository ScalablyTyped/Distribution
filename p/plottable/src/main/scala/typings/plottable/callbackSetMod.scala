package typings.plottable

import typings.plottable.setMod.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbackSetMod {
  
  @JSImport("plottable/build/src/utils/callbackSet", "CallbackSet")
  @js.native
  class CallbackSet[CB /* <: js.Function */] () extends Set[CB] {
    
    def callCallbacks(args: js.Any*): this.type = js.native
  }
}
