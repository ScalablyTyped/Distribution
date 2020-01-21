package typings.mobx.internalMod

import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "spy")
@js.native
object spy extends js.Object {
  def apply(listener: js.Function1[/* change */ js.Any, Unit]): Lambda = js.native
}

