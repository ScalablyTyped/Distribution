package typings.mobx.coreObservableMod

import typings.mobx.derivationMod.IDerivation
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/core/observable", "getObservers")
@js.native
object getObservers extends js.Object {
  def apply(observable: IObservable): Set[IDerivation] = js.native
}

