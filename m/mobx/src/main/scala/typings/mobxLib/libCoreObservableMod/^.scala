package typings
package mobxLib.libCoreObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/observable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addObserver(
    observable: mobxLib.libCoreObservableMod.IObservable,
    node: mobxLib.libCoreDerivationMod.IDerivation
  ): scala.Unit = js.native
  def endBatch(): scala.Unit = js.native
  def getObservers(observable: mobxLib.libCoreObservableMod.IObservable): stdLib.Set[mobxLib.libCoreDerivationMod.IDerivation] = js.native
  def hasObservers(observable: mobxLib.libCoreObservableMod.IObservable): scala.Boolean = js.native
  def propagateChangeConfirmed(observable: mobxLib.libCoreObservableMod.IObservable): scala.Unit = js.native
  def propagateChanged(observable: mobxLib.libCoreObservableMod.IObservable): scala.Unit = js.native
  def propagateMaybeChanged(observable: mobxLib.libCoreObservableMod.IObservable): scala.Unit = js.native
  def queueForUnobservation(observable: mobxLib.libCoreObservableMod.IObservable): scala.Unit = js.native
  def removeObserver(
    observable: mobxLib.libCoreObservableMod.IObservable,
    node: mobxLib.libCoreDerivationMod.IDerivation
  ): scala.Unit = js.native
  def reportObserved(observable: mobxLib.libCoreObservableMod.IObservable): scala.Boolean = js.native
  def startBatch(): scala.Unit = js.native
}

