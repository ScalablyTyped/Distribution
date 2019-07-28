package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typings.atOracleOraclejet.atOracleOraclejetStrings.center
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.middle
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var halign: start | end | center
  var height: Double
  var rendered: on | off
  var valign: top | bottom | middle
  var width: Double
}

object Anon_Bottom {
  @scala.inline
  def apply(
    halign: start | end | center,
    height: Double,
    rendered: on | off,
    valign: top | bottom | middle,
    width: Double
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal(halign = halign.asInstanceOf[js.Any], height = height, rendered = rendered.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any], width = width)
  
    __obj.asInstanceOf[Anon_Bottom]
  }
}

