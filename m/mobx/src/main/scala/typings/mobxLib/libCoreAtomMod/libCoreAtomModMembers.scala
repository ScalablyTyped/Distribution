package typings
package mobxLib.libCoreAtomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/atom", JSImport.Namespace)
@js.native
object libCoreAtomModMembers extends js.Object {
  @JSName("$mobx")
  val $mobx: js.Symbol = js.native
  def createAtom(name: java.lang.String): IAtom = js.native
  def createAtom(name: java.lang.String, onBecomeObservedHandler: js.Function0[scala.Unit]): IAtom = js.native
  def createAtom(
    name: java.lang.String,
    onBecomeObservedHandler: js.Function0[scala.Unit],
    onBecomeUnobservedHandler: js.Function0[scala.Unit]
  ): IAtom = js.native
  def isAtom(x: js.Any): /* is Atom */scala.Boolean = js.native
}

