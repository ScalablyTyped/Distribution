package typings.mobxTask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("mobx-task/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def promiseTry[R](fn: js.Function0[R]): js.Promise[Any | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseTry")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any | R]]
  
  inline def proxyGetters[T, U](target: T, obj: U, keys: js.Array[/* keyof U */ String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyGetters")(target.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
