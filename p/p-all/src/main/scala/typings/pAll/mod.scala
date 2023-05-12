package typings.pAll

import typings.pMap.mod.Options
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-all", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Task /* <: js.Array[PromiseFactory[Any]] */](
    tasks: /* import warning: importer.ImportType#apply c repeated non-array type: Task */ js.Array[Task]
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof Task ]: Task[P] extends (): unknown? std.Awaited<std.ReturnType<Task[P]>> : Task[P]} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof Task ]: Task[P] extends (): unknown? std.Awaited<std.ReturnType<Task[P]>> : Task[P]} */ js.Any
  ]]
  inline def default[Task /* <: js.Array[PromiseFactory[Any]] */](
    tasks: /* import warning: importer.ImportType#apply c repeated non-array type: Task */ js.Array[Task],
    options: Options
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof Task ]: Task[P] extends (): unknown? std.Awaited<std.ReturnType<Task[P]>> : Task[P]} */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof Task ]: Task[P] extends (): unknown? std.Awaited<std.ReturnType<Task[P]>> : Task[P]} */ js.Any
  ]]
  
  type PromiseFactory[T] = js.Function0[PromiseLike[T]]
}
