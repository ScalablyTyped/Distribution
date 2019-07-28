package typings.parchment.distSrcBlotAbstractBlotMod

import typings.parchment.Anon_T
import typings.parchment.distSrcCollectionLinkedDashListMod.default
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parent extends Blot {
  var children: default[Blot] = js.native
  @JSName("domNode")
  var domNode_Parent: HTMLElement = js.native
  def appendChild(child: Blot): Unit = js.native
  def descendant[T](matcher: js.Function1[/* blot */ Blot, Boolean], index: Double): js.Tuple2[T, Double] = js.native
  def descendant[T](`type`: Anon_T[T], index: Double): js.Tuple2[T, Double] = js.native
  def descendants[T](matcher: js.Function1[/* blot */ Blot, Boolean], index: Double, length: Double): js.Array[T] = js.native
  def descendants[T](`type`: Anon_T[T], index: Double, length: Double): js.Array[T] = js.native
  def insertBefore(child: Blot): Unit = js.native
  def insertBefore(child: Blot, refNode: Blot): Unit = js.native
  def moveChildren(parent: Parent): Unit = js.native
  def moveChildren(parent: Parent, refNode: Blot): Unit = js.native
  def path(index: Double): js.Array[js.Tuple2[Blot, Double]] = js.native
  def path(index: Double, inclusive: Boolean): js.Array[js.Tuple2[Blot, Double]] = js.native
  def removeChild(child: Blot): Unit = js.native
  def unwrap(): Unit = js.native
}

