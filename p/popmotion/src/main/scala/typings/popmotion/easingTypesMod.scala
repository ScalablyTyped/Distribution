package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/easing/types", JSImport.Namespace)
@js.native
object easingTypesMod extends js.Object {
  
  type Easing = js.Function1[/* v */ Double, Double]
  
  type EasingModifier = js.Function1[/* easing */ Easing, Easing]
}
