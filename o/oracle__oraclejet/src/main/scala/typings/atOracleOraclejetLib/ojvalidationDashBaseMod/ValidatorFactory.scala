package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorFactory[V] extends js.Object {
  def createValidator(): Validator[V] = js.native
  // static VALIDATOR_TYPE_DATERESTRICTION: string;
  // static VALIDATOR_TYPE_DATETIMERANGE: string;
  // static VALIDATOR_TYPE_LENGTH: string;
  // static VALIDATOR_TYPE_NUMBERRANGE: string;
  // static VALIDATOR_TYPE_REGEXP: string;
  // static VALIDATOR_TYPE_REQUIRED: string;
  def createValidator(options: js.Object): Validator[V] = js.native
}

