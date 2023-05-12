package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.ConstraintType
import typings.phaser.MatterJS.IConstraintDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Constraint` module contains methods for creating and manipulating constraints.
  * Constraints are used for specifying that a fixed distance must be maintained between two bodies (or a body and a fixed world-space position).
  * The stiffness of constraints can be modified to create springs or elastic.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Constraint
  */
@JSGlobal("MatterJS.Constraint")
@js.native
open class Constraint ()
  extends StObject
     with typings.phaser.MatterJS.Constraint
object Constraint {
  
  @JSGlobal("MatterJS.Constraint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @return {constraint} constraint
    */
  /* static member */
  inline def create(options: IConstraintDefinition): ConstraintType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[ConstraintType]
  
  /**
    * Returns the current length of the constraint.
    * This is the distance between both of the constraint's end points.
    * See `constraint.length` for the target rest length.
    * @method currentLength
    * @param {constraint} ConstraintType
    * @return {number} the current length
    */
  /* static member */
  inline def currentLength(constraint: ConstraintType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("currentLength")(constraint.asInstanceOf[js.Any]).asInstanceOf[Double]
}
