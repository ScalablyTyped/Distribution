package typings.mobx.whenMod

import typings.mobx.AnonCancel
import typings.mobx.reactionMod.IReactionDisposer
import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/when", "when")
@js.native
object when extends js.Object {
  def apply(predicate: js.Function0[Boolean]): js.Promise[Unit] with AnonCancel = js.native
  def apply(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = js.native
  def apply(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = js.native
  def apply(predicate: js.Function0[Boolean], opts: IWhenOptions): js.Promise[Unit] with AnonCancel = js.native
}

