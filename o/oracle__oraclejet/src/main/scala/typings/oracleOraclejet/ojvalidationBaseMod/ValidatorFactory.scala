package typings.oracleOraclejet.ojvalidationBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorFactory[V] extends js.Object {
  // static VALIDATOR_TYPE_DATERESTRICTION: string;
  // static VALIDATOR_TYPE_DATETIMERANGE: string;
  // static VALIDATOR_TYPE_LENGTH: string;
  // static VALIDATOR_TYPE_NUMBERRANGE: string;
  // static VALIDATOR_TYPE_REGEXP: string;
  // static VALIDATOR_TYPE_REQUIRED: string;
  def createValidator(): Validator[V] = js.native
  def createValidator(options: js.Object): Validator[V] = js.native
}

