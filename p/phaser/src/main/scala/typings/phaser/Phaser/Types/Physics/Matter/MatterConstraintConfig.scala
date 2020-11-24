package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatterConstraintConfig extends js.Object {
  
  /**
    * The angleA of the constraint. If bodyA is set, the angle of bodyA is used instead.
    */
  var angleA: js.UndefOr[Double] = js.native
  
  /**
    * The angleB of the constraint. If bodyB is set, the angle of bodyB is used instead.
    */
  var angleB: js.UndefOr[Double] = js.native
  
  /**
    * A `Number` that specifies the angular stiffness of the constraint.
    */
  var angularStiffness: js.UndefOr[Double] = js.native
  
  /**
    * The first possible `Body` that this constraint is attached to.
    */
  var bodyA: js.UndefOr[BodyType] = js.native
  
  /**
    * The second possible `Body` that this constraint is attached to.
    */
  var bodyB: js.UndefOr[BodyType] = js.native
  
  /**
    * A `Number` that specifies the damping of the constraint, i.e. the amount of resistance applied to each body based on their velocities to limit the amount of oscillation. Damping will only be apparent when the constraint also has a very low `stiffness`. A value of `0.1` means the constraint will apply heavy damping, resulting in little to no oscillation. A value of `0` means the constraint will apply no damping.
    */
  var damping: js.UndefOr[Double] = js.native
  
  /**
    * An arbitrary string-based name to help identify this constraint.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * A `Number` that specifies the target resting length of the constraint. It is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * An object reserved for storing plugin-specific properties.
    */
  var plugin: js.UndefOr[js.Any] = js.native
  
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    */
  var pointA: js.UndefOr[Vector2Like] = js.native
  
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyB` if defined, otherwise a world-space position.
    */
  var pointB: js.UndefOr[Vector2Like] = js.native
  
  /**
    * The Debug Render configuration object for this constraint.
    */
  var render: js.UndefOr[MatterConstraintRenderConfig] = js.native
  
  /**
    * A `Number` that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`. A value of `1` means the constraint should be very stiff. A value of `0.2` means the constraint acts like a soft spring.
    */
  var stiffness: js.UndefOr[Double] = js.native
}
object MatterConstraintConfig {
  
  @scala.inline
  def apply(): MatterConstraintConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterConstraintConfig]
  }
  
  @scala.inline
  implicit class MatterConstraintConfigOps[Self <: MatterConstraintConfig] (val x: Self) extends AnyVal {
    
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
    def setAngleA(value: Double): Self = this.set("angleA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleA: Self = this.set("angleA", js.undefined)
    
    @scala.inline
    def setAngleB(value: Double): Self = this.set("angleB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleB: Self = this.set("angleB", js.undefined)
    
    @scala.inline
    def setAngularStiffness(value: Double): Self = this.set("angularStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngularStiffness: Self = this.set("angularStiffness", js.undefined)
    
    @scala.inline
    def setBodyA(value: BodyType): Self = this.set("bodyA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyA: Self = this.set("bodyA", js.undefined)
    
    @scala.inline
    def setBodyB(value: BodyType): Self = this.set("bodyB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyB: Self = this.set("bodyB", js.undefined)
    
    @scala.inline
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDamping: Self = this.set("damping", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setPlugin(value: js.Any): Self = this.set("plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    
    @scala.inline
    def setPointA(value: Vector2Like): Self = this.set("pointA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointA: Self = this.set("pointA", js.undefined)
    
    @scala.inline
    def setPointB(value: Vector2Like): Self = this.set("pointB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointB: Self = this.set("pointB", js.undefined)
    
    @scala.inline
    def setRender(value: MatterConstraintRenderConfig): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
  }
}
