package typings.p2.anon

import typings.p2.mod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeA extends js.Object {
  
  var bodyA: typings.p2.mod.Body = js.native
  
  var bodyB: typings.p2.mod.Body = js.native
  
  var shapeA: Shape = js.native
  
  var shapeB: Shape = js.native
  
  var `type`: String = js.native
}
object ShapeA {
  
  @scala.inline
  def apply(
    bodyA: typings.p2.mod.Body,
    bodyB: typings.p2.mod.Body,
    shapeA: Shape,
    shapeB: Shape,
    `type`: String
  ): ShapeA = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], shapeA = shapeA.asInstanceOf[js.Any], shapeB = shapeB.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeA]
  }
  
  @scala.inline
  implicit class ShapeAOps[Self <: ShapeA] (val x: Self) extends AnyVal {
    
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
    def setBodyA(value: typings.p2.mod.Body): Self = this.set("bodyA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyB(value: typings.p2.mod.Body): Self = this.set("bodyB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeA(value: Shape): Self = this.set("shapeA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeB(value: Shape): Self = this.set("shapeB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
