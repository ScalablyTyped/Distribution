package typings.ol.rbushMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RBush[T] extends js.Object {
  
  /**
    * Remove all values from the RBush.
    */
  def clear(): Unit = js.native
  
  def concat(rbush: RBush[T]): Unit = js.native
  
  /**
    * Calls a callback function with each value in the tree.
    * If the callback returns a truthy value, this value is returned without
    * checking the rest of the tree.
    */
  def forEach(callback: js.Function1[/* p0 */ T, _]): js.Any = js.native
  
  /**
    * Calls a callback function with each value in the provided extent.
    */
  def forEachInExtent(extent: Extent, callback: js.Function1[/* p0 */ T, _]): js.Any = js.native
  
  /**
    * Return all values in the RBush.
    */
  def getAll(): js.Array[T] = js.native
  
  def getExtent(): Extent = js.native
  def getExtent(opt_extent: Extent): Extent = js.native
  
  /**
    * Return all values in the given extent.
    */
  def getInExtent(extent: Extent): js.Array[T] = js.native
  
  /**
    * Insert a value into the RBush.
    */
  def insert(extent: Extent, value: T): Unit = js.native
  
  def isEmpty(): Boolean = js.native
  
  /**
    * Bulk-insert values into the RBush.
    */
  def load(extents: js.Array[Extent], values: js.Array[T]): Unit = js.native
  
  /**
    * Remove a value from the RBush.
    */
  def remove(value: T): Boolean = js.native
  
  /**
    * Update the extent of a value in the RBush.
    */
  def update(extent: Extent, value: T): Unit = js.native
}
