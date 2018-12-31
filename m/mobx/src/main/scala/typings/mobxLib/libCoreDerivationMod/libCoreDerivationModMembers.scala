package typings
package mobxLib.libCoreDerivationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/derivation", JSImport.Namespace)
@js.native
object libCoreDerivationModMembers extends js.Object {
  def changeDependenciesStateTo0(derivation: IDerivation): scala.Unit = js.native
  def checkIfStateModificationsAreAllowed(atom: mobxLib.libCoreAtomMod.IAtom): scala.Unit = js.native
  def clearObserving(derivation: IDerivation): scala.Unit = js.native
  def isCaughtException(e: js.Any): /* is mobx.mobx/lib/core/derivation.CaughtException */ scala.Boolean = js.native
  def isComputingDerivation(): scala.Boolean = js.native
  def shouldCompute(derivation: IDerivation): scala.Boolean = js.native
  def trackDerivedFunction[T](derivation: IDerivation, f: js.Function0[T], context: js.Any): js.Any = js.native
  def untracked[T](action: js.Function0[T]): T = js.native
  def untrackedEnd(): scala.Unit = js.native
  def untrackedEnd(prev: IDerivation): scala.Unit = js.native
  def untrackedStart(): IDerivation | scala.Null = js.native
}

