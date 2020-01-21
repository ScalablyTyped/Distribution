package typings.mobx.internalMod

import typings.mobx.atomMod.IAtom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "createAtom")
@js.native
object createAtom extends js.Object {
  def apply(name: String): IAtom = js.native
  def apply(name: String, onBecomeObservedHandler: js.Function0[Unit]): IAtom = js.native
  def apply(
    name: String,
    onBecomeObservedHandler: js.Function0[Unit],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = js.native
}

