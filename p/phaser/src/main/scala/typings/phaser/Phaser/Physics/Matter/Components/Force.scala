package typings.phaser.Phaser.Physics.Matter.Components

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Math.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A component to apply force to Matter.js bodies.
  */
@js.native
trait Force extends js.Object {
  
  /**
    * Applies a force to a body.
    * @param force A Vector that specifies the force to apply.
    */
  def applyForce(force: Vector2): GameObject = js.native
  
  /**
    * Applies a force to a body from a given position.
    * @param position The position in which the force comes from.
    * @param force A Vector that specifies the force to apply.
    */
  def applyForceFrom(position: Vector2, force: Vector2): GameObject = js.native
  
  /**
    * Apply thrust to the forward position of the body.
    * 
    * Use very small values, such as 0.1, depending on the mass and required speed.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrust(speed: Double): GameObject = js.native
  
  /**
    * Apply thrust to the back position of the body.
    * 
    * Use very small values, such as 0.1, depending on the mass and required speed.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrustBack(speed: Double): GameObject = js.native
  
  /**
    * Apply thrust to the left position of the body.
    * 
    * Use very small values, such as 0.1, depending on the mass and required speed.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrustLeft(speed: Double): GameObject = js.native
  
  /**
    * Apply thrust to the right position of the body.
    * 
    * Use very small values, such as 0.1, depending on the mass and required speed.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrustRight(speed: Double): GameObject = js.native
}
object Force {
  
  @scala.inline
  def apply(
    applyForce: Vector2 => GameObject,
    applyForceFrom: (Vector2, Vector2) => GameObject,
    thrust: Double => GameObject,
    thrustBack: Double => GameObject,
    thrustLeft: Double => GameObject,
    thrustRight: Double => GameObject
  ): Force = {
    val __obj = js.Dynamic.literal(applyForce = js.Any.fromFunction1(applyForce), applyForceFrom = js.Any.fromFunction2(applyForceFrom), thrust = js.Any.fromFunction1(thrust), thrustBack = js.Any.fromFunction1(thrustBack), thrustLeft = js.Any.fromFunction1(thrustLeft), thrustRight = js.Any.fromFunction1(thrustRight))
    __obj.asInstanceOf[Force]
  }
  
  @scala.inline
  implicit class ForceOps[Self <: Force] (val x: Self) extends AnyVal {
    
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
    def setApplyForce(value: Vector2 => GameObject): Self = this.set("applyForce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplyForceFrom(value: (Vector2, Vector2) => GameObject): Self = this.set("applyForceFrom", js.Any.fromFunction2(value))
    
    @scala.inline
    def setThrust(value: Double => GameObject): Self = this.set("thrust", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThrustBack(value: Double => GameObject): Self = this.set("thrustBack", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThrustLeft(value: Double => GameObject): Self = this.set("thrustLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThrustRight(value: Double => GameObject): Self = this.set("thrustRight", js.Any.fromFunction1(value))
  }
}
