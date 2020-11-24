package typings.mockingoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends js.Object {
  
  var __mocks: js.Any = js.native
  
  /**
    * Resets all mocks.
    */
  def resetAll(): Unit = js.native
  
  /**
    * Returns an object of mocks for all models. Only serializable if all mock results are primitives, not functions.
    */
  def toJSON(): js.Any = js.native
}
object Target {
  
  @scala.inline
  def apply(__mocks: js.Any, resetAll: () => Unit, toJSON: () => js.Any): Target = {
    val __obj = js.Dynamic.literal(__mocks = __mocks.asInstanceOf[js.Any], resetAll = js.Any.fromFunction0(resetAll), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    
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
    def set__mocks(value: js.Any): Self = this.set("__mocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetAll(value: () => Unit): Self = this.set("resetAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
