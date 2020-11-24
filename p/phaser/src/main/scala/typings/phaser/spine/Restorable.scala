package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Restorable extends js.Object {
  
  def restore(): Unit = js.native
}
object Restorable {
  
  @scala.inline
  def apply(restore: () => Unit): Restorable = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction0(restore))
    __obj.asInstanceOf[Restorable]
  }
  
  @scala.inline
  implicit class RestorableOps[Self <: Restorable] (val x: Self) extends AnyVal {
    
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
    def setRestore(value: () => Unit): Self = this.set("restore", js.Any.fromFunction0(value))
  }
}
