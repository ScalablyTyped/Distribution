package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.billion
import typings.atOracleOraclejet.atOracleOraclejetStrings.million
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.quadrillion
import typings.atOracleOraclejet.atOracleOraclejetStrings.thousand
import typings.atOracleOraclejet.atOracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBillionConverterMillion extends js.Object {
  var converter: js.Object
  var rendered: off | on
  var rotation: none | auto
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
  var style: js.Object
}

object Anon_AutoBillionConverterMillion {
  @scala.inline
  def apply(
    converter: js.Object,
    rendered: off | on,
    rotation: none | auto,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto,
    style: js.Object
  ): Anon_AutoBillionConverterMillion = {
    val __obj = js.Dynamic.literal(converter = converter, rendered = rendered.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any], style = style)
  
    __obj.asInstanceOf[Anon_AutoBillionConverterMillion]
  }
}

