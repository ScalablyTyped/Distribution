package typings.phaser.mod

import typings.phaser.MatterJS.IMouseConstraintDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.MouseConstraint` module contains methods for creating mouse constraints.
  * Mouse constraints are used for allowing user interaction, providing the ability to move bodies via the mouse or touch.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class MouseConstraint
  */
@JSImport("matter", "MouseConstraint")
@js.native
class MouseConstraint ()
  extends typings.phaser.MatterJS.MouseConstraint
object MouseConstraint {
  
  /**
    * Creates a new mouse constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {engine} engine
    * @param {} options
    * @return {MouseConstraint} A new MouseConstraint
    */
  /* static member */
  @JSImport("matter", "MouseConstraint.create")
  @js.native
  def create(engine: typings.phaser.MatterJS.Engine): typings.phaser.MatterJS.MouseConstraint = js.native
  @JSImport("matter", "MouseConstraint.create")
  @js.native
  def create(engine: typings.phaser.MatterJS.Engine, options: IMouseConstraintDefinition): typings.phaser.MatterJS.MouseConstraint = js.native
}
