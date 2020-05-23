package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderWidth extends js.Object {
  var backgroundColor: String
  var borderColor: String
  var borderWidth: Double
  var rendered: off | on
}

object BorderWidth {
  @scala.inline
  def apply(backgroundColor: String, borderColor: String, borderWidth: Double, rendered: off | on): BorderWidth = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWidth]
  }
}

