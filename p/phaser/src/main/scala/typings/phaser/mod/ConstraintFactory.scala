package typings.phaser.mod

import typings.phaser.MatterJS.ConstraintType
import typings.phaser.MatterJS.IConstraintDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter", "ConstraintFactory")
@js.native
class ConstraintFactory ()
  extends StObject
     with typings.phaser.MatterJS.ConstraintFactory {
  
  /**
    * Creates a new constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @return {constraint} constraint
    */
  /* CompleteClass */
  override def create(options: IConstraintDefinition): ConstraintType = js.native
}
