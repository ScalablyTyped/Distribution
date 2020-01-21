package typings.ol.rbushMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RBush[T] extends js.Object {
  def clear(): Unit = js.native
  def concat(rbush: RBush[T]): Unit = js.native
  def forEach(callback: js.Function1[/* p0 */ T, _]): js.Any = js.native
  def forEachInExtent(extent: Extent, callback: js.Function1[/* p0 */ T, _]): js.Any = js.native
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

