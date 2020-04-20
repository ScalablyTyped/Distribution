package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.hidden
import typings.oracleOraclejet.oracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHorizontal extends js.Object {
  var horizontal: visible | hidden
  var vertical: visible | hidden
}

object AnonHorizontal {
  @scala.inline
  def apply(horizontal: visible | hidden, vertical: visible | hidden): AnonHorizontal = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHorizontal]
  }
}

