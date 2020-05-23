package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstraintFactory extends js.Object {
  /**
    * Creates a new constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @return {constraint} constraint
    */
  def create(options: IConstraintDefinition): ConstraintType
}

object ConstraintFactory {
  @scala.inline
  def apply(create: IConstraintDefinition => ConstraintType): ConstraintFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ConstraintFactory]
  }
}

