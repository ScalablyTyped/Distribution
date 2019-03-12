package typings
package mobxLib.libApiWhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/when", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def when(predicate: js.Function0[scala.Boolean]): js.Promise[scala.Unit] with mobxLib.Anon_Cancel = js.native
  def when(predicate: js.Function0[scala.Boolean], effect: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def when(
    predicate: js.Function0[scala.Boolean],
    effect: mobxLib.libUtilsUtilsMod.Lambda,
    opts: IWhenOptions
  ): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def when(predicate: js.Function0[scala.Boolean], opts: IWhenOptions): js.Promise[scala.Unit] with mobxLib.Anon_Cancel = js.native
}

