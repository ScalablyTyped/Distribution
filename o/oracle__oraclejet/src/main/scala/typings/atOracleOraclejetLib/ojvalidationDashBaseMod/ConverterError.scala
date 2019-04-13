package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterError extends js.Object {
  // constructor(summary: string, detail: string);
  def getMessage(): atOracleOraclejetLib.ojmessagingMod.^
}

object ConverterError {
  @scala.inline
  def apply(getMessage: () => atOracleOraclejetLib.ojmessagingMod.^): ConverterError = {
    val __obj = js.Dynamic.literal(getMessage = js.Any.fromFunction0(getMessage))
  
    __obj.asInstanceOf[ConverterError]
  }
}

