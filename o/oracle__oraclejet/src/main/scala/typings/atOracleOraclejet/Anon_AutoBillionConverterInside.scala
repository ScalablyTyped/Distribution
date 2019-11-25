package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.billion
import typings.atOracleOraclejet.atOracleOraclejetStrings.inside
import typings.atOracleOraclejet.atOracleOraclejetStrings.million
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.outside
import typings.atOracleOraclejet.atOracleOraclejetStrings.quadrillion
import typings.atOracleOraclejet.atOracleOraclejetStrings.thousand
import typings.atOracleOraclejet.atOracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBillionConverterInside extends js.Object {
  var converter: js.Object
  var position: inside | outside
  var rendered: off | on
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
  var style: js.Object
}

object Anon_AutoBillionConverterInside {
  @scala.inline
  def apply(
    converter: js.Object,
    position: inside | outside,
    rendered: off | on,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto,
    style: js.Object
  ): Anon_AutoBillionConverterInside = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoBillionConverterInside]
  }
}

