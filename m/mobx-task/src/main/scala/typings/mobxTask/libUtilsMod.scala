package typings.mobxTask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("mobx-task/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def promiseTry[R](fn: js.Function0[R]): /* import warning: importer.ImportType#apply Failed type conversion: R extends std.Promise<infer P> ? std.Promise<P> : std.Promise<R> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseTry")(fn.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: R extends std.Promise<infer P> ? std.Promise<P> : std.Promise<R> */ js.Any]
  
  inline def proxyGetters[T, U](target: T, obj: U, keys: js.Array[/* keyof U */ String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyGetters")(target.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
