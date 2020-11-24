package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Updatable extends js.Object {
  
  def isActive(): Boolean = js.native
  
  def update(): Unit = js.native
}
object Updatable {
  
  @scala.inline
  def apply(isActive: () => Boolean, update: () => Unit): Updatable = {
    val __obj = js.Dynamic.literal(isActive = js.Any.fromFunction0(isActive), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Updatable]
  }
  
  @scala.inline
  implicit class UpdatableOps[Self <: Updatable] (val x: Self) extends AnyVal {
    
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
    def setIsActive(value: () => Boolean): Self = this.set("isActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
