package typings.pAll

import org.scalablytyped.runtime.TopLevel
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
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Task ]: Task[P] extends (): unknown? p-all.p-all.Awaited<std.ReturnType<Task[P]>> : Task[P]}
    */ typings.pAll.pAllStrings.default & TopLevel[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Task ]: Task[P] extends (): unknown? p-all.p-all.Awaited<std.ReturnType<Task[P]>> : Task[P]}
    */ typings.pAll.pAllStrings.default & TopLevel[Any]
  ]]
  inline def default[Task /* <: js.Array[PromiseFactory[Any]] */](
    tasks: /* import warning: importer.ImportType#apply c repeated non-array type: Task */ js.Array[Task],
    options: Options
  ): js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Task ]: Task[P] extends (): unknown? p-all.p-all.Awaited<std.ReturnType<Task[P]>> : Task[P]}
    */ typings.pAll.pAllStrings.default & TopLevel[Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Task ]: Task[P] extends (): unknown? p-all.p-all.Awaited<std.ReturnType<Task[P]>> : Task[P]}
    */ typings.pAll.pAllStrings.default & TopLevel[Any]
  ]]
  
  // From: https://github.com/microsoft/TypeScript/blob/4f5b3299fee9a54b692aba9df7a9e894bd86e81d/src/lib/es2015.promise.d.ts#L1
  type Awaited[T] = T
  
  type PromiseFactory[T] = js.Function0[PromiseLike[T]]
}
