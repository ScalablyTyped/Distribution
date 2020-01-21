package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.ojmessagingMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorError extends js.Object {
  // constructor(summary: string, detail: string);
  def getMessage(): ^
}

object ValidatorError {
  @scala.inline
  def apply(getMessage: () => ^): ValidatorError = {
    val __obj = js.Dynamic.literal(getMessage = js.Any.fromFunction0(getMessage))
  
    __obj.asInstanceOf[ValidatorError]
  }
}

