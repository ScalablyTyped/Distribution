package typings.mobx.libCoreAtomMod

import typings.mobx.libCoreDerivationMod.IDerivation
import typings.mobx.libCoreDerivationMod.IDerivationState
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/atom", "Atom")
@js.native
/**
  * Create a new atom. For debugging purposes it is recommended to give it a name.
  * The onBecomeObserved and onBecomeUnobserved callbacks can be used for resource management.
  */
class Atom () extends IAtom {
  def this(name: String) = this()
  /* CompleteClass */
  override var diffValue: Double = js.native
  /* CompleteClass */
  override var isBeingObserved: Boolean = js.native
  /* CompleteClass */
  override var isPendingUnobservation: Boolean = js.native
  /**
    * Id of the derivation *run* that last accessed this observable.
    * If this id equals the *run* id of the current derivation,
    * the dependency is already established
    */
  /* CompleteClass */
  override var lastAccessedBy: Double = js.native
  /* CompleteClass */
  override var lowestObserverState: IDerivationState = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var observers: Set[IDerivation] = js.native
  /* CompleteClass */
  override def onBecomeObserved(): Unit = js.native
  /* CompleteClass */
  override def onBecomeUnobserved(): Unit = js.native
  /* CompleteClass */
  override def reportChanged(): js.Any = js.native
  /* CompleteClass */
  override def reportObserved(): js.Any = js.native
}

