package typings.atPhosphorDisposable.atPhosphorDisposableMod

import typings.atPhosphorAlgorithm.libIterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/disposable", "DisposableSet")
@js.native
object DisposableSetNs extends js.Object {
  /**
    * Create a disposable set from an iterable of items.
    *
    * @param items - The iterable or array-like object of interest.
    *
    * @returns A new disposable initialized with the given items.
    */
  def from(items: IterableOrArrayLike[IDisposable]): DisposableSet = js.native
}

