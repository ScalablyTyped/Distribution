package typings.atPhosphorDisposable.atPhosphorDisposableMod

import typings.atPhosphorAlgorithm.libIterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/disposable", "ObservableDisposableSet")
@js.native
object ObservableDisposableSetNs extends js.Object {
  /**
    * Create an observable disposable set from an iterable of items.
    *
    * @param items - The iterable or array-like object of interest.
    *
    * @returns A new disposable initialized with the given items.
    */
  def from(items: IterableOrArrayLike[IDisposable]): ObservableDisposableSet = js.native
}

