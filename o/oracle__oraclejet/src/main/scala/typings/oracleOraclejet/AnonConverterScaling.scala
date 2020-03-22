package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.billion
import typings.oracleOraclejet.oracleOraclejetStrings.million
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typings.oracleOraclejet.oracleOraclejetStrings.thousand
import typings.oracleOraclejet.oracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConverterScaling extends js.Object {
  var converter: js.Object
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
}

object AnonConverterScaling {
  @scala.inline
  def apply(converter: js.Object, scaling: none | thousand | million | billion | trillion | quadrillion | auto): AnonConverterScaling = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConverterScaling]
  }
}

