package typings.mobx.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/atom", "createAtom")
@js.native
object createAtom extends js.Object {
  def apply(name: String): IAtom = js.native
  def apply(
    name: String,
    onBecomeObservedHandler: js.UndefOr[scala.Nothing],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = js.native
  def apply(name: String, onBecomeObservedHandler: js.Function0[Unit]): IAtom = js.native
  def apply(
    name: String,
    onBecomeObservedHandler: js.Function0[Unit],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = js.native
}

