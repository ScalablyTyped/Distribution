package typings.ono.esmStackMod

import typings.ono.esmTypesMod.ErrorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/stack", "joinStacks")
@js.native
object joinStacks extends js.Object {
  def apply(newError: ErrorLike): js.UndefOr[String] = js.native
  def apply(newError: ErrorLike, originalError: ErrorLike): js.UndefOr[String] = js.native
}

