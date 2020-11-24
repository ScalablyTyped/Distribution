package typings.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This component allows you to control an entity's current position in the world. Once applied the entity will be teleported to the new position specified.
  */
@js.native
trait IPositionComponent extends js.Object {
  
  /**
    * Position along the X-Axis (east-west) of the entity
    * @default 0.0
    */
  var x: Double = js.native
  
  /**
    * Position along the Y-Axis (height) of the entity
    * @default 0.0
    */
  var y: Double = js.native
  
  /**
    * Position along the Z-Axis (north-south) of the entity
    * @default 0.0
    */
  var z: Double = js.native
}
object IPositionComponent {
  
  @scala.inline
  def apply(x: Double, y: Double, z: Double): IPositionComponent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionComponent]
  }
  
  @scala.inline
  implicit class IPositionComponentOps[Self <: IPositionComponent] (val x: Self) extends AnyVal {
    
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}
