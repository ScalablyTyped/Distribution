package typings
package atPhosphorDisposableLib.atPhosphorDisposableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableDisposable extends IDisposable {
  /**
    * A signal emitted when the object is disposed.
    */
  val disposed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit]
}

object IObservableDisposable {
  @scala.inline
  def apply(
    dispose: () => scala.Unit,
    disposed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IObservableDisposable, scala.Unit],
    isDisposed: scala.Boolean
  ): IObservableDisposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposed = disposed, isDisposed = isDisposed)
  
    __obj.asInstanceOf[IObservableDisposable]
  }
}

