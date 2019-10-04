package typings.preact.compatSrcMod

import typings.preact.srcMod.ComponentChild
import typings.preact.srcMod.ComponentChildren
import typings.preact.srcMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact/compat/src", "Children")
@js.native
object Children extends js.Object {
  def count(children: ComponentChildren): Double = js.native
  def forEach[T /* <: ComponentChild */](children: T, fn: js.Function3[/* child */ T, /* i */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
  def forEach[T /* <: ComponentChild */](
    children: js.Array[T],
    fn: js.Function3[/* child */ T, /* i */ Double, /* array */ js.Array[T], Unit]
  ): Unit = js.native
  def map[T /* <: ComponentChild */, R](children: T, fn: js.Function3[/* child */ T, /* i */ Double, /* array */ js.Array[T], R]): js.Array[R] = js.native
  def map[T /* <: ComponentChild */, R](children: js.Array[T], fn: js.Function3[/* child */ T, /* i */ Double, /* array */ js.Array[T], R]): js.Array[R] = js.native
  def only(children: ComponentChildren): ComponentChild = js.native
  def toArray(children: ComponentChildren): js.Array[VNode[js.Object]] = js.native
}

