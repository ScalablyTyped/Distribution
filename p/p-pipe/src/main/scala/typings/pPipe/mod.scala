package typings.pPipe

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-pipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(functions: (UnaryFunction[Any, Any])*): Pipeline[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(functions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Pipeline[Any, Any]]
  
  type Pipeline[ValueType, ReturnType] = js.Function1[/* value */ js.UndefOr[ValueType], js.Promise[ReturnType]]
  
  type UnaryFunction[ValueType, ReturnType] = js.Function1[/* value */ ValueType, ReturnType | PromiseLike[ReturnType]]
}
