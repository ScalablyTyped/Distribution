package typings.atPhosphorDisposable.atPhosphorDisposableMod

import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableDisposable extends IDisposable {
  /**
    * A signal emitted when the object is disposed.
    */
  val disposed: ISignal[this.type, Unit]
}

object IObservableDisposable {
  @scala.inline
  def apply(dispose: () => Unit, disposed: ISignal[IObservableDisposable, Unit], isDisposed: Boolean): IObservableDisposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposed = disposed, isDisposed = isDisposed)
  
    __obj.asInstanceOf[IObservableDisposable]
  }
}

