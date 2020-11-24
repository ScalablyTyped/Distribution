package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConstraintDefinition extends js.Object {
  
  /**
    * The first possible `Body` that this constraint is attached to.
    *
    * @property bodyA
    * @type body
    * @default null
    */
  var bodyA: js.UndefOr[IBodyDefinition] = js.native
  
  /**
    * The second possible `Body` that this constraint is attached to.
    *
    * @property bodyB
    * @type body
    * @default null
    */
  var bodyB: js.UndefOr[IBodyDefinition] = js.native
  
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
  var damping: js.UndefOr[Double] = js.native
  
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    * @property id
    * @type number
    */
  var id: js.UndefOr[Double] = js.native
  
  /**
    * An arbitrary `String` name to help the user identify and manage bodies.
    *
    * @property label
    * @type string
    * @default "Constraint"
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * A `Number` that specifies the target resting length of the constraint.
    * It is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    *
    * @property length
    * @type number
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    *
    * @property pointA
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var pointA: js.UndefOr[Vector] = js.native
  
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    *
    * @property pointB
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var pointB: js.UndefOr[Vector] = js.native
  
  /**
    * An `Object` that defines the rendering properties to be consumed by the module `Matter.Render`.
    *
    * @property render
    * @type object
    */
  var render: js.UndefOr[IConstraintRenderDefinition] = js.native
  
  /**
    * A `Number` that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`.
    * A value of `1` means the constraint should be very stiff.
    * A value of `0.2` means the constraint acts like a soft spring.
    *
    * @property stiffness
    * @type number
    * @default 1
    */
  var stiffness: js.UndefOr[Double] = js.native
  
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "constraint"
    */
  var `type`: js.UndefOr[String] = js.native
}
object IConstraintDefinition {
  
  @scala.inline
  def apply(): IConstraintDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConstraintDefinition]
  }
  
  @scala.inline
  implicit class IConstraintDefinitionOps[Self <: IConstraintDefinition] (val x: Self) extends AnyVal {
    
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
    def setBodyA(value: IBodyDefinition): Self = this.set("bodyA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyA: Self = this.set("bodyA", js.undefined)
    
    @scala.inline
    def setBodyB(value: IBodyDefinition): Self = this.set("bodyB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyB: Self = this.set("bodyB", js.undefined)
    
    @scala.inline
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDamping: Self = this.set("damping", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setPointA(value: Vector): Self = this.set("pointA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointA: Self = this.set("pointA", js.undefined)
    
    @scala.inline
    def setPointB(value: Vector): Self = this.set("pointB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointB: Self = this.set("pointB", js.undefined)
    
    @scala.inline
    def setRender(value: IConstraintRenderDefinition): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
