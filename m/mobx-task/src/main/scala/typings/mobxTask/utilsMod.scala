package typings.mobxTask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-task/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def promiseTry[R](fn: js.Function0[R]): js.Promise[_ | R] = js.native
  
  def proxyGetters[T, U](target: T, obj: U, keys: js.Array[/* keyof U */ String]): Unit = js.native
}
