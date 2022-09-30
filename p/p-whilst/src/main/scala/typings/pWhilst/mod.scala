package typings.pWhilst

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-whilst", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType](
    condition: js.Function1[/* value */ js.UndefOr[ValueType], Boolean],
    action: js.Function0[ValueType | PromiseLike[ValueType]]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(condition.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
