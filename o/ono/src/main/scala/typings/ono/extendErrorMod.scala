package typings.ono

import typings.ono.typesMod.ErrorPOJO
import typings.ono.typesMod.OnoError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/extend-error", JSImport.Namespace)
@js.native
object extendErrorMod extends js.Object {
  def extendError[T](newError: OnoError[T]): Unit = js.native
  def extendError[T](newError: OnoError[T], originalError: ErrorPOJO): Unit = js.native
  def extendError[T](newError: OnoError[T], originalError: ErrorPOJO, props: js.Object): Unit = js.native
}

