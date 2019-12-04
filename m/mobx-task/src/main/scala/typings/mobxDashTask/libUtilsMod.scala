package typings.mobxDashTask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-task/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  def promiseTry[R](fn: js.Function0[R]): js.Promise[_ | R] = js.native
  def proxyGetters[T, U](target: T, obj: U, keys: js.Array[String]): Unit = js.native
}

