package typings.popmotion

import typings.popmotion.typesMod.Animation
import typings.popmotion.typesMod.SpringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/animations/generators/spring", JSImport.Namespace)
@js.native
object springMod extends js.Object {
  
  @js.native
  object spring extends js.Object {
    
    def apply(hasFromToRestSpeedRestDeltaOptions: SpringOptions): Animation[Double] = js.native
    
    var needsInterpolation: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
  }
}
