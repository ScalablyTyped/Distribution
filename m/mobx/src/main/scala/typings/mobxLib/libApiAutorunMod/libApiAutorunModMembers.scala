package typings
package mobxLib.libApiAutorunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/autorun", JSImport.Namespace)
@js.native
object libApiAutorunModMembers extends js.Object {
  def autorun(view: js.Function1[/* r */ mobxLib.libCoreReactionMod.IReactionPublic, _]): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def autorun(view: js.Function1[/* r */ mobxLib.libCoreReactionMod.IReactionPublic, _], opts: IAutorunOptions): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def reaction[T](
    expression: js.Function1[/* r */ mobxLib.libCoreReactionMod.IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ mobxLib.libCoreReactionMod.IReactionPublic, scala.Unit]
  ): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def reaction[T](
    expression: js.Function1[/* r */ mobxLib.libCoreReactionMod.IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ mobxLib.libCoreReactionMod.IReactionPublic, scala.Unit],
    opts: IReactionOptions
  ): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
}

