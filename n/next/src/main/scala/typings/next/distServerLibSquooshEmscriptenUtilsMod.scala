package typings.next

import typings.next.EmscriptenWasm.Module
import typings.next.EmscriptenWasm.ModuleFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibSquooshEmscriptenUtilsMod {
  
  @JSImport("next/dist/server/lib/squoosh/emscripten-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def instantiateEmscriptenWasm[T /* <: Module */](factory: ModuleFactory[T], path: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateEmscriptenWasm")(factory.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def instantiateEmscriptenWasm[T /* <: Module */](factory: ModuleFactory[T], path: String, workerJS: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateEmscriptenWasm")(factory.asInstanceOf[js.Any], path.asInstanceOf[js.Any], workerJS.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def pathify(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathify")(path.asInstanceOf[js.Any]).asInstanceOf[String]
}
