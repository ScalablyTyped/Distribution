package typings.mobx.libApiAutorunMod

import typings.mobx.libCoreReactionMod.IReactionDisposer
import typings.mobx.libCoreReactionMod.IReactionPublic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/autorun", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def autorun(view: js.Function1[/* r */ IReactionPublic, _]): IReactionDisposer = js.native
  def autorun(view: js.Function1[/* r */ IReactionPublic, _], opts: IAutorunOptions): IReactionDisposer = js.native
  def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit]
  ): IReactionDisposer = js.native
  def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit],
    opts: IReactionOptions
  ): IReactionDisposer = js.native
}

