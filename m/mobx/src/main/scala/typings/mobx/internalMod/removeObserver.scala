package typings.mobx.internalMod

import typings.mobx.coreObservableMod.IObservable
import typings.mobx.derivationMod.IDerivation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "removeObserver")
@js.native
object removeObserver extends js.Object {
  def apply(observable: IObservable, node: IDerivation): Unit = js.native
}

