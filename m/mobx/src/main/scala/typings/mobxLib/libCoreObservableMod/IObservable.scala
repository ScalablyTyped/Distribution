package typings
package mobxLib.libCoreObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IObservable extends IDepTreeNode {
  var diffValue: scala.Double
  var isBeingObserved: scala.Boolean
  var isPendingUnobservation: scala.Boolean
  /**
       * Id of the derivation *run* that last accessed this observable.
       * If this id equals the *run* id of the current derivation,
       * the dependency is already established
       */
  var lastAccessedBy: scala.Double
  var lowestObserverState: mobxLib.libCoreDerivationMod.IDerivationState
  var observers: stdLib.Set[mobxLib.libCoreDerivationMod.IDerivation]
  def onBecomeObserved(): scala.Unit
  def onBecomeUnobserved(): scala.Unit
}

