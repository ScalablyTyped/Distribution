package typings.popmotionPopcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popmotion/popcorn/lib/utils/conditional", JSImport.Namespace)
@js.native
object conditionalMod extends js.Object {
  
  def default(check: Check, apply: Apply): js.Function1[/* v */ js.Any, _] = js.native
  
  type Apply = js.Function1[/* v */ js.Any, js.Any]
  
  type Check = js.Function1[/* v */ js.Any, Boolean]
}
