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
    afterValidate: ValidatorArgs => scala.Unit,
    beforeValidate: ValidatorArgs => scala.Unit,
    validate: ValidatorArgs => Pojo
  ): Validator = {
    val __obj = js.Dynamic.literal(afterValidate = js.Any.fromFunction1(afterValidate), beforeValidate = js.Any.fromFunction1(beforeValidate), validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[Validator]
  }
}

