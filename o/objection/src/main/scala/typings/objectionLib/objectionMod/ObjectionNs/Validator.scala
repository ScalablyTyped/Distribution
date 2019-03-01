package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validator extends js.Object {
  def afterValidate(args: ValidatorArgs): scala.Unit
  def beforeValidate(args: ValidatorArgs): scala.Unit
  def validate(args: ValidatorArgs): Pojo
}

object Validator {
  @scala.inline
  def apply(
    afterValidate: js.Function1[ValidatorArgs, scala.Unit],
    beforeValidate: js.Function1[ValidatorArgs, scala.Unit],
    validate: js.Function1[ValidatorArgs, Pojo]
  ): Validator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterValidate")(afterValidate)
    __obj.updateDynamic("beforeValidate")(beforeValidate)
    __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[Validator]
  }
}

