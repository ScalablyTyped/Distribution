package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnsDisabled extends js.Object {
  var columns: enabled | disabled
}

object AnonColumnsDisabled {
  @scala.inline
  def apply(columns: enabled | disabled): AnonColumnsDisabled = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnsDisabled]
  }
}

