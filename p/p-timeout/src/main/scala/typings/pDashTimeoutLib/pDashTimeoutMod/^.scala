package typings
package pDashTimeoutLib.pDashTimeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-timeout", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[ValueType](input: js.Thenable[ValueType], milliseconds: scala.Double): js.Promise[ValueType] = js.native
  def default[ValueType](input: js.Thenable[ValueType], milliseconds: scala.Double, message: java.lang.String): js.Promise[ValueType] = js.native
  def default[ValueType](input: js.Thenable[ValueType], milliseconds: scala.Double, message: stdLib.Error): js.Promise[ValueType] = js.native
  def default[ValueType, ReturnType](
    input: js.Thenable[ValueType],
    milliseconds: scala.Double,
    fallback: js.Function0[ReturnType | js.Promise[ReturnType]]
  ): js.Promise[ValueType | ReturnType] = js.native
}

