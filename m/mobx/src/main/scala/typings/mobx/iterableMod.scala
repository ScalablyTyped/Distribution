package typings.mobx

import typings.std.IterableIterator
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/utils/iterable", JSImport.Namespace)
@js.native
object iterableMod extends js.Object {
  def makeIterable[T](iterator: Iterator[T, _, js.UndefOr[scala.Nothing]]): IterableIterator[T] = js.native
}

