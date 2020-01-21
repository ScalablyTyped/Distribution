package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.disable
import typings.oracleOraclejet.oracleOraclejetStrings.enable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisable extends js.Object {
  var row: enable | disable
}

object AnonDisable {
  @scala.inline
  def apply(row: enable | disable): AnonDisable = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisable]
  }
}

