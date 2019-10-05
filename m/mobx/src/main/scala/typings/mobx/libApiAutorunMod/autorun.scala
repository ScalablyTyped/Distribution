package typings.mobx.libApiAutorunMod

import typings.mobx.libCoreReactionMod.IReactionDisposer
import typings.mobx.libCoreReactionMod.IReactionPublic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/autorun", "autorun")
@js.native
object autorun extends js.Object {
  def apply(view: js.Function1[/* r */ IReactionPublic, _]): IReactionDisposer = js.native
  def apply(view: js.Function1[/* r */ IReactionPublic, _], opts: IAutorunOptions): IReactionDisposer = js.native
}

