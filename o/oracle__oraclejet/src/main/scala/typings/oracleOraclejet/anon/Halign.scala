package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.middle
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Halign extends js.Object {
  var halign: start | end | center
  var height: Double
  var rendered: on | off
  var valign: top | bottom | middle
  var width: Double
}

object Halign {
  @scala.inline
  def apply(
    halign: start | end | center,
    height: Double,
    rendered: on | off,
    valign: top | bottom | middle,
    width: Double
  ): Halign = {
    val __obj = js.Dynamic.literal(halign = halign.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Halign]
  }
}

