package typings.atPhosphorDisposable.atPhosphorDisposableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/disposable", "DisposableSet")
@js.native
/**
  * Construct a new disposable set.
  */
class DisposableSet () extends IDisposable {
  var _isDisposed: js.Any = js.native
  var _items: js.Any = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * Add a disposable item to the set.
    *
    * @param item - The item to add to the set.
    *
    * #### Notes
    * If the item is already contained in the set, this is a no-op.
    */
  def add(item: IDisposable): Unit = js.native
  /**
    * Remove all items from the set.
    */
  def clear(): Unit = js.native
  /**
    * Test whether the set contains a specific item.
    *
    * @param item - The item of interest.
    *
    * @returns `true` if the set contains the item, `false` otherwise.
    */
  def contains(item: IDisposable): Boolean = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Remove a disposable item from the set.
    *
    * @param item - The item to remove from the set.
    *
    * #### Notes
    * If the item is not contained in the set, this is a no-op.
    */
  def remove(item: IDisposable): Unit = js.native
}

