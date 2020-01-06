package typings.ono.esmStackMod

import typings.ono.esmTypesMod.ErrorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/stack", "lazyJoinStacks")
@js.native
object lazyJoinStacks extends js.Object {
  def apply(lazyStack: LazyStack, newError: ErrorLike): Unit = js.native
  def apply(lazyStack: LazyStack, newError: ErrorLike, originalError: ErrorLike): Unit = js.native
}

