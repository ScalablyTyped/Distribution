package typings.mpromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResolveFunction[F, R] extends js.Object {
  def apply(err: R, arg: F): Unit = js.native
  def apply(err: R, args: F*): Unit = js.native
}

