package typings.nodeDashValidator.ValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsObjectValidator extends Validatable {
  def withCustom(customValidator: ValidateFn): IsObjectValidator = js.native
  def withOptional(name: String, validator: Validatable): IsObjectValidator = js.native
  def withRequired(name: String, validator: Validatable): IsObjectValidator = js.native
}

