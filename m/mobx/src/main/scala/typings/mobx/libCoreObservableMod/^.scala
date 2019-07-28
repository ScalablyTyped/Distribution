package typings.mobx.libCoreObservableMod

import typings.mobx.libCoreDerivationMod.IDerivation
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/observable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addObserver(observable: IObservable, node: IDerivation): Unit = js.native
  def endBatch(): Unit = js.native
  def getObservers(observable: IObservable): Set[IDerivation] = js.native
  def hasObservers(observable: IObservable): Boolean = js.native
  def propagateChangeConfirmed(observable: IObservable): Unit = js.native
  def propagateChanged(observable: IObservable): Unit = js.native
  def propagateMaybeChanged(observable: IObservable): Unit = js.native
  def queueForUnobservation(observable: IObservable): Unit = js.native
  def removeObserver(observable: IObservable, node: IDerivation): Unit = js.native
  def reportObserved(observable: IObservable): Boolean = js.native
  def startBatch(): Unit = js.native
}

