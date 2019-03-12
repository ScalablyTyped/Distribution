package typings
package mobxLib.libCoreObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/observable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addObserver(observable: IObservable, node: mobxLib.libCoreDerivationMod.IDerivation): scala.Unit = js.native
  def endBatch(): scala.Unit = js.native
  def getObservers(observable: IObservable): stdLib.Set[mobxLib.libCoreDerivationMod.IDerivation] = js.native
  def hasObservers(observable: IObservable): scala.Boolean = js.native
  def propagateChangeConfirmed(observable: IObservable): scala.Unit = js.native
  def propagateChanged(observable: IObservable): scala.Unit = js.native
  def propagateMaybeChanged(observable: IObservable): scala.Unit = js.native
  def queueForUnobservation(observable: IObservable): scala.Unit = js.native
  def removeObserver(observable: IObservable, node: mobxLib.libCoreDerivationMod.IDerivation): scala.Unit = js.native
  def reportObserved(observable: IObservable): scala.Boolean = js.native
  def startBatch(): scala.Unit = js.native
}

