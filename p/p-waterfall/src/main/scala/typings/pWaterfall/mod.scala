package typings.pWaterfall

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-waterfall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(tasks: js.Iterable[Task[Any, Any]]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def default(tasks: js.Iterable[Task[Any, Any]], initialValue: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  type InitialTask[ReturnType] = js.Function0[ReturnType | PromiseLike[ReturnType]]
  
  type Task[ValueType, ReturnType] = js.Function1[/* previousValue */ ValueType, ReturnType | PromiseLike[ReturnType]]
}
