package typings
package openui5Lib.sapNs.uiNs.baseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract for objects that can be pooled by ObjectPool
  * @resource sap/ui/base/ObjectPool.js
  */
trait Poolable extends js.Object {
  /**
    * Called by the object pool when this instance will be actived for a caller.The same method will be
    * called after a new instance has been created by an otherwiseexhausted pool.If the caller provided
    * any arguments to {@link sap.ui.base.ObjectPool#borrowObject}all arguments will be propagated to this
    * method.
    */
  def init(): scala.Unit
  /**
    * Called by the object pool when an instance is returned to the pool.While no specific implementation
    * is required, poolable objects in generalshould clean all caller specific state (set to null) in this
    * method toavoid memory leaks and to enforce garbage collection of the caller state.
    */
  def reset(): scala.Unit
}

object Poolable {
  @scala.inline
  def apply(init: () => scala.Unit, reset: () => scala.Unit): Poolable = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[Poolable]
  }
}

