package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColor extends js.Object {
  var backgroundColor: String
  var borderColor: String
  var borderWidth: Double
  var rendered: off | on
}

object Anon_BackgroundColor {
  @scala.inline
  def apply(backgroundColor: String, borderColor: String, borderWidth: Double, rendered: off | on): Anon_BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, borderColor = borderColor, borderWidth = borderWidth, rendered = rendered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BackgroundColor]
  }
}

