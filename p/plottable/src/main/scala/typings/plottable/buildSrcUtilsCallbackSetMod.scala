package typings.plottable

import typings.plottable.buildSrcUtilsSetMod.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsCallbackSetMod {
  
  @JSImport("plottable/build/src/utils/callbackSet", "CallbackSet")
  @js.native
  open class CallbackSet[CB /* <: js.Function */] () extends Set[CB] {
    
    def callCallbacks(args: Any*): this.type = js.native
  }
}
