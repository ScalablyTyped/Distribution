package typings.openui5.sap.ui.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contract for objects that can be pooled by ObjectPool
  * @resource sap/ui/base/ObjectPool.js
  */
@js.native
trait Poolable extends js.Object {
  
  /**
    * Called by the object pool when this instance will be actived for a caller.The same method will be
    * called after a new instance has been created by an otherwiseexhausted pool.If the caller provided
    * any arguments to {@link sap.ui.base.ObjectPool#borrowObject}all arguments will be propagated to this
    * method.
    */
  def init(): Unit = js.native
  
  /**
    * Called by the object pool when an instance is returned to the pool.While no specific implementation
    * is required, poolable objects in generalshould clean all caller specific state (set to null) in this
    * method toavoid memory leaks and to enforce garbage collection of the caller state.
    */
  def reset(): Unit = js.native
}
object Poolable {
  
  @scala.inline
  def apply(init: () => Unit, reset: () => Unit): Poolable = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Poolable]
  }
  
  @scala.inline
  implicit class PoolableOps[Self <: Poolable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
}
