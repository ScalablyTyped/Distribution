package typings
package olLib.structsRBushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RBush[T] extends js.Object {
  def clear(): scala.Unit = js.native
  def concat(rbush: RBush[T]): scala.Unit = js.native
  def forEach[S](callback: js.ThisFunction1[/* this */ S, /* p1 */ T, scala.Unit]): js.Any = js.native
  def forEach[S](callback: js.ThisFunction1[/* this */ S, /* p1 */ T, scala.Unit], opt_this: S): js.Any = js.native
  def forEachInExtent[S](extent: olLib.extentMod.Extent, callback: js.ThisFunction1[/* this */ S, /* p1 */ T, scala.Unit]): js.Any = js.native
  def forEachInExtent[S](
    extent: olLib.extentMod.Extent,
    callback: js.ThisFunction1[/* this */ S, /* p1 */ T, scala.Unit],
    opt_this: S
  ): js.Any = js.native
  def getAll(): js.Array[T] = js.native
  def getExtent(): olLib.extentMod.Extent = js.native
  def getExtent(opt_extent: olLib.extentMod.Extent): olLib.extentMod.Extent = js.native
  def getInExtent(extent: olLib.extentMod.Extent): js.Array[T] = js.native
  def insert(extent: olLib.extentMod.Extent, value: T): scala.Unit = js.native
  def isEmpty(): scala.Boolean = js.native
  def load(extents: js.Array[olLib.extentMod.Extent], values: js.Array[T]): scala.Unit = js.native
  def remove(value: T): scala.Boolean = js.native
  def update(extent: olLib.extentMod.Extent, value: T): scala.Unit = js.native
}

