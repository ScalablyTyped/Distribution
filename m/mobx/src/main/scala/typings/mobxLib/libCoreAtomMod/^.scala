package typings
package mobxLib.libCoreAtomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/atom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$mobx")
  val $mobx: js.Symbol = js.native
  def createAtom(name: java.lang.String): mobxLib.libCoreAtomMod.IAtom = js.native
  def createAtom(name: java.lang.String, onBecomeObservedHandler: js.Function0[scala.Unit]): mobxLib.libCoreAtomMod.IAtom = js.native
  def createAtom(
    name: java.lang.String,
    onBecomeObservedHandler: js.Function0[scala.Unit],
    onBecomeUnobservedHandler: js.Function0[scala.Unit]
  ): mobxLib.libCoreAtomMod.IAtom = js.native
  def isAtom(x: js.Any): /* is mobx.mobx/lib/core/atom.Atom */ scala.Boolean = js.native
}

