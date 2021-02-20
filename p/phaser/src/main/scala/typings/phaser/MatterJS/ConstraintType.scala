package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstraintType extends StObject {
  
  /**
    * Either the angle of BodyA, or a config value.
    *
    * @property angleA
    * @type number
    * @default 0
    */
  var angleA: Double = js.native
  
  /**
    * Either the angle of BodyB, or a config value.
    *
    * @property angleB
    * @type number
    * @default 0
    */
  var angleB: Double = js.native
  
  /**
    * A `Number` that specifies the angular stiffness of the constraint.
    *
    * @property angularStiffness
    * @type number
    * @default 0
    */
  var angularStiffness: Double = js.native
  
  /**
    * The first possible `Body` that this constraint is attached to.
    *
    * @property bodyA
    * @type body
    * @default null
    */
  var bodyA: js.UndefOr[BodyType] = js.native
  
  /**
    * The second possible `Body` that this constraint is attached to.
    *
    * @property bodyB
    * @type body
    * @default null
    */
  var bodyB: js.UndefOr[BodyType] = js.native
  
  /**
    * A `Number` that specifies the damping of the constraint, 
    * i.e. the amount of resistance applied to each body based on their velocities to limit the amount of oscillation.
    * Damping will only be apparent when the constraint also has a very low `stiffness`.
    * A value of `0.1` means the constraint will apply heavy damping, resulting in little to no oscillation.
    * A value of `0` means the constraint will apply no damping.
    *
    * @property damping
    * @type number
    * @default 0
    */
  var damping: Double = js.native
  
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    * @property id
    * @type number
    */
  var id: Double = js.native
  
  /**
    * An arbitrary `String` name to help the user identify and manage bodies.
    *
    * @property label
    * @type string
    * @default "Constraint"
    */
  var label: String = js.native
  
  /**
    * A `Number` that specifies the target resting length of the constraint. 
    * It is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    *
    * @property length
    * @type number
    */
  var length: Double = js.native
  
  /**
    * An object reserved for storing plugin-specific properties.
    *
    * @property plugin
    * @type {}
    */
  var plugin: js.Any = js.native
  
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    *
    * @property pointA
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var pointA: Vector = js.native
  
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyB` if defined, otherwise a world-space position.
    *
    * @property pointB
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var pointB: Vector = js.native
  
  /**
    * An `Object` that defines the rendering properties to be consumed by the module `Matter.Render`.
    *
    * @property render
    * @type object
    */
  var render: IConstraintRenderDefinition = js.native
  
  /**
    * A `Number` that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`.
    * A value of `1` means the constraint should be very stiff.
    * A value of `0.2` means the constraint acts like a soft spring.
    *
    * @property stiffness
    * @type number
    * @default 1
    */
  var stiffness: Double = js.native
  
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "constraint"
    * @readOnly
    */
  var `type`: String = js.native
}
object ConstraintType {
  
  @scala.inline
  def apply(
    angleA: Double,
    angleB: Double,
    angularStiffness: Double,
    damping: Double,
    id: Double,
    label: String,
    length: Double,
    plugin: js.Any,
    pointA: Vector,
    pointB: Vector,
    render: IConstraintRenderDefinition,
    stiffness: Double,
    `type`: String
  ): ConstraintType = {
    val __obj = js.Dynamic.literal(angleA = angleA.asInstanceOf[js.Any], angleB = angleB.asInstanceOf[js.Any], angularStiffness = angularStiffness.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], pointA = pointA.asInstanceOf[js.Any], pointB = pointB.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstraintType]
  }
  
  @scala.inline
  implicit class ConstraintTypeMutableBuilder[Self <: ConstraintType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngleA(value: Double): Self = StObject.set(x, "angleA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleB(value: Double): Self = StObject.set(x, "angleB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularStiffness(value: Double): Self = StObject.set(x, "angularStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyA(value: BodyType): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyAUndefined: Self = StObject.set(x, "bodyA", js.undefined)
    
    @scala.inline
    def setBodyB(value: BodyType): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyBUndefined: Self = StObject.set(x, "bodyB", js.undefined)
    
    @scala.inline
    def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugin(value: js.Any): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointA(value: Vector): Self = StObject.set(x, "pointA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointB(value: Vector): Self = StObject.set(x, "pointB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: IConstraintRenderDefinition): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
