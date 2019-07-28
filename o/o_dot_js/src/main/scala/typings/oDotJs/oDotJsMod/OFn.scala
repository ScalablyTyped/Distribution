package typings.oDotJs.oDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OFn[T] extends OHandler[T] {
  def apply(): OHandler[T] = js.native
  def apply(options: String): OHandler[T] = js.native
  def apply(options: Options): OHandler[T] = js.native
}

