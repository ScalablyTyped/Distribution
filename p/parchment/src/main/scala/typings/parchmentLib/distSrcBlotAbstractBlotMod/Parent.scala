package typings
package parchmentLib.distSrcBlotAbstractBlotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parent extends Blot {
  var children: parchmentLib.distSrcCollectionLinkedDashListMod.default[Blot] = js.native
  @JSName("domNode")
  var domNode_Parent: stdLib.HTMLElement = js.native
  def appendChild(child: Blot): scala.Unit = js.native
  def descendant[T](matcher: js.Function1[/* blot */ Blot, scala.Boolean], index: scala.Double): js.Tuple2[T, scala.Double] = js.native
  def descendant[T](`type`: parchmentLib.Anon_T[T], index: scala.Double): js.Tuple2[T, scala.Double] = js.native
  def descendants[T](matcher: js.Function1[/* blot */ Blot, scala.Boolean], index: scala.Double, length: scala.Double): js.Array[T] = js.native
  def descendants[T](`type`: parchmentLib.Anon_T[T], index: scala.Double, length: scala.Double): js.Array[T] = js.native
  def insertBefore(child: Blot): scala.Unit = js.native
  def insertBefore(child: Blot, refNode: Blot): scala.Unit = js.native
  def moveChildren(parent: Parent): scala.Unit = js.native
  def moveChildren(parent: Parent, refNode: Blot): scala.Unit = js.native
  def path(index: scala.Double): js.Array[js.Tuple2[Blot, scala.Double]] = js.native
  def path(index: scala.Double, inclusive: scala.Boolean): js.Array[js.Tuple2[Blot, scala.Double]] = js.native
  def removeChild(child: Blot): scala.Unit = js.native
  def unwrap(): scala.Unit = js.native
}

