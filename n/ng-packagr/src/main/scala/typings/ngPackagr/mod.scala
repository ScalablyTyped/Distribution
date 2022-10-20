package typings.ngPackagr

import typings.injectionJs.providerMod.Provider
import typings.ngPackagr.libCommandsBuildDotcommandMod.CliArguments
import typings.ngPackagr.libCommandsCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ng-packagr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ng-packagr", "NgPackagr")
  @js.native
  open class NgPackagr_ protected ()
    extends typings.ngPackagr.libPackagrMod.NgPackagr_ {
    def this(providers: js.Array[Provider]) = this()
  }
  
  @JSImport("ng-packagr", "build")
  @js.native
  val build: Command[CliArguments, Unit] = js.native
  
  inline def execute[A, R](command: Command[A, R]): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(command.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
  inline def execute[A, R](command: Command[A, R], args: A): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  inline def ngPackagr(): typings.ngPackagr.libPackagrMod.NgPackagr_ = ^.asInstanceOf[js.Dynamic].applyDynamic("ngPackagr")().asInstanceOf[typings.ngPackagr.libPackagrMod.NgPackagr_]
  
  @JSImport("ng-packagr", "version")
  @js.native
  val version: Command[Any, js.Promise[Unit]] = js.native
}
