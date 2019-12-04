package typings.ono

import typings.ono.esmTypesMod.ErrorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/stack", JSImport.Namespace)
@js.native
object esmStackMod extends js.Object {
  val supportsLazyStack: Boolean = js.native
  def hasLazyStack(error: ErrorLike): Boolean = js.native
  def joinStacks(newError: ErrorLike): js.UndefOr[String] = js.native
  def joinStacks(newError: ErrorLike, originalError: ErrorLike): js.UndefOr[String] = js.native
  def lazyJoinStacks(newError: ErrorLike): Unit = js.native
  def lazyJoinStacks(newError: ErrorLike, originalError: ErrorLike): Unit = js.native
}

