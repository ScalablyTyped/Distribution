package typings.mobx.libCoreDerivationMod

import typings.mobx.libCoreAtomMod.IAtom
import typings.mobx.libCoreObservableMod.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/derivation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def allowStateReadsEnd(prev: Boolean): Unit = js.native
  def allowStateReadsStart(allowStateReads: Boolean): Boolean = js.native
  def changeDependenciesStateTo0(derivation: IDerivation): Unit = js.native
  def checkIfStateModificationsAreAllowed(atom: IAtom): Unit = js.native
  def checkIfStateReadsAreAllowed(observable: IObservable): Unit = js.native
  def clearObserving(derivation: IDerivation): Unit = js.native
  def isCaughtException(e: js.Any): /* is mobx.mobx/lib/core/derivation.CaughtException */ Boolean = js.native
  def isComputingDerivation(): Boolean = js.native
  def shouldCompute(derivation: IDerivation): Boolean = js.native
  def trackDerivedFunction[T](derivation: IDerivation, f: js.Function0[T], context: js.Any): js.Any = js.native
  def untracked[T](action: js.Function0[T]): T = js.native
  def untrackedEnd(): Unit = js.native
  def untrackedEnd(prev: IDerivation): Unit = js.native
  def untrackedStart(): IDerivation | Null = js.native
}

