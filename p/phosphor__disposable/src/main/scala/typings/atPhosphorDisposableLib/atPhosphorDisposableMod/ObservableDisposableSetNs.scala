package typings
package atPhosphorDisposableLib.atPhosphorDisposableMod

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
  def from(
    items: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable]
  ): atPhosphorDisposableLib.atPhosphorDisposableMod.ObservableDisposableSet = js.native
}

