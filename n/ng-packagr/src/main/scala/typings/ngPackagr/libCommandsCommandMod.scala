package typings.ngPackagr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommandsCommandMod {
  
  @JSImport("ng-packagr/lib/commands/command", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def execute[A, R](command: Command[A, R]): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(command.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
  inline def execute[A, R](command: Command[A, R], args: A): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  type Command[Arguments, Result] = js.Function1[/* args */ js.UndefOr[Arguments], Result | js.Promise[Result]]
}
