package typings.pDoWhilst

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-do-whilst", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType](
    action: js.Function0[ValueType | PromiseLike[ValueType]],
    condition: js.Function1[/* value */ ValueType, Boolean]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(action.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
