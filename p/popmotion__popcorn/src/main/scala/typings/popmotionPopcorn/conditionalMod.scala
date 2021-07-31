package typings.popmotionPopcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionalMod {
  
  @JSImport("@popmotion/popcorn/lib/utils/conditional", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(check: Check, apply: Apply): js.Function1[/* v */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(check.asInstanceOf[js.Any], apply.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ js.Any, js.Any]]
  
  type Apply = js.Function1[/* v */ js.Any, js.Any]
  
  type Check = js.Function1[/* v */ js.Any, Boolean]
}
