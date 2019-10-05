package typings.mobx.libCoreObservableMod

import typings.mobx.libCoreDerivationMod.IDerivation
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/observable", "getObservers")
@js.native
object getObservers extends js.Object {
  def apply(observable: IObservable): Set[IDerivation] = js.native
}

