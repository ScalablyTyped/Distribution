package typings
package mobxLib.libCoreDerivationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/derivation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def changeDependenciesStateTo0(derivation: mobxLib.libCoreDerivationMod.IDerivation): scala.Unit = js.native
  def checkIfStateModificationsAreAllowed(atom: mobxLib.libCoreAtomMod.IAtom): scala.Unit = js.native
  def clearObserving(derivation: mobxLib.libCoreDerivationMod.IDerivation): scala.Unit = js.native
  def isCaughtException(e: js.Any): /* is mobx.mobx/lib/core/derivation.CaughtException */ scala.Boolean = js.native
  def isComputingDerivation(): scala.Boolean = js.native
  def shouldCompute(derivation: mobxLib.libCoreDerivationMod.IDerivation): scala.Boolean = js.native
  def trackDerivedFunction[T](derivation: mobxLib.libCoreDerivationMod.IDerivation, f: js.Function0[T], context: js.Any): js.Any = js.native
  def untracked[T](action: js.Function0[T]): T = js.native
  def untrackedEnd(): scala.Unit = js.native
  def untrackedEnd(prev: mobxLib.libCoreDerivationMod.IDerivation): scala.Unit = js.native
  def untrackedStart(): mobxLib.libCoreDerivationMod.IDerivation | scala.Null = js.native
}

