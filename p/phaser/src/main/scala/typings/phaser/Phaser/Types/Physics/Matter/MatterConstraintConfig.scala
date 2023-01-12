package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatterConstraintConfig extends StObject {
  
  /**
    * The angleA of the constraint. If bodyA is set, the angle of bodyA is used instead.
    */
  var angleA: js.UndefOr[Double] = js.undefined
  
  /**
    * The angleB of the constraint. If bodyB is set, the angle of bodyB is used instead.
    */
  var angleB: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that specifies the angular stiffness of the constraint.
    */
  var angularStiffness: js.UndefOr[Double] = js.undefined
  
  /**
    * The first possible `Body` that this constraint is attached to.
    */
  var bodyA: js.UndefOr[BodyType] = js.undefined
  
  /**
    * The second possible `Body` that this constraint is attached to.
    */
  var bodyB: js.UndefOr[BodyType] = js.undefined
  
  /**
    * A `Number` that specifies the damping of the constraint, i.e. the amount of resistance applied to each body based on their velocities to limit the amount of oscillation. Damping will only be apparent when the constraint also has a very low `stiffness`. A value of `0.1` means the constraint will apply heavy damping, resulting in little to no oscillation. A value of `0` means the constraint will apply no damping.
    */
  var damping: js.UndefOr[Double] = js.undefined
  
  /**
    * An arbitrary string-based name to help identify this constraint.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * A `Number` that specifies the target resting length of the constraint. It is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * An object reserved for storing plugin-specific properties.
    */
  var plugin: js.UndefOr[Any] = js.undefined
  
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    */
  var pointA: js.UndefOr[Vector2Like] = js.undefined
  
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyB` if defined, otherwise a world-space position.
    */
  var pointB: js.UndefOr[Vector2Like] = js.undefined
  
  /**
    * The Debug Render configuration object for this constraint.
    */
  var render: js.UndefOr[MatterConstraintRenderConfig] = js.undefined
  
  /**
    * A `Number` that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`. A value of `1` means the constraint should be very stiff. A value of `0.2` means the constraint acts like a soft spring.
    */
  var stiffness: js.UndefOr[Double] = js.undefined
}
object MatterConstraintConfig {
  
  inline def apply(): MatterConstraintConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterConstraintConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatterConstraintConfig] (val x: Self) extends AnyVal {
    
    inline def setAngleA(value: Double): Self = StObject.set(x, "angleA", value.asInstanceOf[js.Any])
    
    inline def setAngleAUndefined: Self = StObject.set(x, "angleA", js.undefined)
    
    inline def setAngleB(value: Double): Self = StObject.set(x, "angleB", value.asInstanceOf[js.Any])
    
    inline def setAngleBUndefined: Self = StObject.set(x, "angleB", js.undefined)
    
    inline def setAngularStiffness(value: Double): Self = StObject.set(x, "angularStiffness", value.asInstanceOf[js.Any])
    
    inline def setAngularStiffnessUndefined: Self = StObject.set(x, "angularStiffness", js.undefined)
    
    inline def setBodyA(value: BodyType): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    inline def setBodyAUndefined: Self = StObject.set(x, "bodyA", js.undefined)
    
    inline def setBodyB(value: BodyType): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    inline def setBodyBUndefined: Self = StObject.set(x, "bodyB", js.undefined)
    
    inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setPlugin(value: Any): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    inline def setPointA(value: Vector2Like): Self = StObject.set(x, "pointA", value.asInstanceOf[js.Any])
    
    inline def setPointAUndefined: Self = StObject.set(x, "pointA", js.undefined)
    
    inline def setPointB(value: Vector2Like): Self = StObject.set(x, "pointB", value.asInstanceOf[js.Any])
    
    inline def setPointBUndefined: Self = StObject.set(x, "pointB", js.undefined)
    
    inline def setRender(value: MatterConstraintRenderConfig): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
  }
}
