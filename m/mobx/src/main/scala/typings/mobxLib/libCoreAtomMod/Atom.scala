package typings
package mobxLib.libCoreAtomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/atom", "Atom")
@js.native
class Atom () extends IAtom {
  /**
       * Create a new atom. For debugging purposes it is recommended to give it a name.
       * The onBecomeObserved and onBecomeUnobserved callbacks can be used for resource management.
       */
  def this(name: java.lang.String) = this()
  /* CompleteClass */
  override var diffValue: scala.Double = js.native
  /* CompleteClass */
  override var isBeingObserved: scala.Boolean = js.native
  /* CompleteClass */
  override var isPendingUnobservation: scala.Boolean = js.native
  /**
       * Id of the derivation *run* that last accessed this observable.
       * If this id equals the *run* id of the current derivation,
       * the dependency is already established
       */
  /* CompleteClass */
  override var lastAccessedBy: scala.Double = js.native
  /* CompleteClass */
  override var lowestObserverState: mobxLib.libCoreDerivationMod.IDerivationState = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var observers: stdLib.Set[mobxLib.libCoreDerivationMod.IDerivation] = js.native
  @JSName("observers")
  var observers_Atom: stdLib.Set[_] = js.native
  /* CompleteClass */
  override var onBecomeObservedListeners: js.UndefOr[stdLib.Set[mobxLib.libUtilsUtilsMod.Lambda]] = js.native
  /* CompleteClass */
  override var onBecomeUnobservedListeners: js.UndefOr[stdLib.Set[mobxLib.libUtilsUtilsMod.Lambda]] = js.native
  /* CompleteClass */
  override def onBecomeObserved(): scala.Unit = js.native
  /* CompleteClass */
  override def onBecomeUnobserved(): scala.Unit = js.native
  /* CompleteClass */
  override def reportChanged(): js.Any = js.native
  /* CompleteClass */
  override def reportObserved(): js.Any = js.native
}

