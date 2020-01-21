package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabledEnabled extends js.Object {
  var items: enabled | disabled
}

object AnonDisabledEnabled {
  @scala.inline
  def apply(items: enabled | disabled): AnonDisabledEnabled = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisabledEnabled]
  }
}

