package typings
package atPhosphorDisposableLib.atPhosphorDisposableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisposable extends js.Object {
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  val isDisposed: scala.Boolean
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
  def dispose(): scala.Unit
}

object IDisposable {
  @scala.inline
  def apply(dispose: () => scala.Unit, isDisposed: scala.Boolean): IDisposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed)
  
    __obj.asInstanceOf[IDisposable]
  }
}

