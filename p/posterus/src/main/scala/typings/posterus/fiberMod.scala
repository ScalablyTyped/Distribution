package typings.posterus

import typings.posterus.mod.Future
import typings.std.Error
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("posterus/fiber", JSImport.Namespace)
@js.native
object fiberMod extends js.Object {
  def fiber(iterator: IterableIterator[_]): Future[_, Error] = js.native
}

