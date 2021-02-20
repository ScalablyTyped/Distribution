package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.ConstraintType
import typings.phaser.MatterJS.IConstraintDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
class Constraint ()
  extends typings.phaser.MatterJS.Constraint
object Constraint {
  
  /**
    * Creates a new constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @return {constraint} constraint
    */
  /* static member */
  @JSGlobal("MatterJS.Constraint.create")
  @js.native
  def create(options: IConstraintDefinition): ConstraintType = js.native
}
