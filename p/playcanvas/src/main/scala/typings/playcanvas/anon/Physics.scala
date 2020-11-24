package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Physics extends js.Object {
  
  var physics: Gravity = js.native
  
  var render: Exposure = js.native
}
object Physics {
  
  @scala.inline
  def apply(physics: Gravity, render: Exposure): Physics = {
    val __obj = js.Dynamic.literal(physics = physics.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[Physics]
  }
  
  @scala.inline
  implicit class PhysicsOps[Self <: Physics] (val x: Self) extends AnyVal {
    
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
    def setPhysics(value: Gravity): Self = this.set("physics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: Exposure): Self = this.set("render", value.asInstanceOf[js.Any])
  }
}
