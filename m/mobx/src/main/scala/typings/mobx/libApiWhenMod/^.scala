package typings.mobx.libApiWhenMod

import typings.mobx.Anon_Cancel
import typings.mobx.libCoreReactionMod.IReactionDisposer
import typings.mobx.libUtilsUtilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/when", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def when(predicate: js.Function0[Boolean]): js.Promise[Unit] with Anon_Cancel = js.native
  def when(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = js.native
  def when(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = js.native
  def when(predicate: js.Function0[Boolean], opts: IWhenOptions): js.Promise[Unit] with Anon_Cancel = js.native
}

