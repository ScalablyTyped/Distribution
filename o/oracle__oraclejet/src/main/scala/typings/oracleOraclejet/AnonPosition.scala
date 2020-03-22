package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.billion
import typings.oracleOraclejet.oracleOraclejetStrings.inside
import typings.oracleOraclejet.oracleOraclejetStrings.million
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.outside
import typings.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typings.oracleOraclejet.oracleOraclejetStrings.thousand
import typings.oracleOraclejet.oracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var converter: js.Object
  var position: inside | outside
  var rendered: off | on
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
  var style: js.Object
}

object AnonPosition {
  @scala.inline
  def apply(
    converter: js.Object,
    position: inside | outside,
    rendered: off | on,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto,
    style: js.Object
  ): AnonPosition = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPosition]
  }
}

