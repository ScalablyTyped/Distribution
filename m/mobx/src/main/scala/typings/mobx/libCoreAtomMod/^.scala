package typings.mobx.libCoreAtomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/atom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$mobx")
  val $mobx: js.Symbol = js.native
  def createAtom(name: String): IAtom = js.native
  def createAtom(name: String, onBecomeObservedHandler: js.Function0[Unit]): IAtom = js.native
  def createAtom(
    name: String,
    onBecomeObservedHandler: js.Function0[Unit],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = js.native
  def isAtom(x: js.Any): /* is mobx.mobx/lib/core/atom.Atom */ Boolean = js.native
}

