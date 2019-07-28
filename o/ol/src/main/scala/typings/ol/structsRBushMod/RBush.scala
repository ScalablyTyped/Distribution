package typings.ol.structsRBushMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RBush[T] extends js.Object {
  def clear(): Unit = js.native
  def concat(rbush: RBush[T]): Unit = js.native
  def forEach[S](callback: js.ThisFunction1[/* this */ S, /* p0 */ T, Unit]): js.Any = js.native
  def forEach[S](callback: js.ThisFunction1[/* this */ S, /* p0 */ T, Unit], opt_this: S): js.Any = js.native
  def forEachInExtent[S](extent: Extent, callback: js.ThisFunction1[/* this */ S, /* p0 */ T, Unit]): js.Any = js.native
  def forEachInExtent[S](extent: Extent, callback: js.ThisFunction1[/* this */ S, /* p0 */ T, Unit], opt_this: S): js.Any = js.native
  def getAll(): js.Array[T] = js.native
  def getExtent(): Extent = js.native
  def getExtent(opt_extent: Extent): Extent = js.native
  def getInExtent(extent: Extent): js.Array[T] = js.native
  def insert(extent: Extent, value: T): Unit = js.native
  def isEmpty(): Boolean = js.native
  def load(extents: js.Array[Extent], values: js.Array[T]): Unit = js.native
  def remove(value: T): Boolean = js.native
  def update(extent: Extent, value: T): Unit = js.native
}

