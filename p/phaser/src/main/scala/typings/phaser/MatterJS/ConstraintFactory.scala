package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstraintFactory extends js.Object {
  /**
    * Creates a new constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @return {constraint} constraint
    */
  def create(options: IConstraintDefinition): ConstraintType = js.native
}

object ConstraintFactory {
  @scala.inline
  def apply(create: IConstraintDefinition => ConstraintType): ConstraintFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ConstraintFactory]
  }
  @scala.inline
  implicit class ConstraintFactoryOps[Self <: ConstraintFactory] (val x: Self) extends AnyVal {
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
    def setCreate(value: IConstraintDefinition => ConstraintType): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

