package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.billion
import typings.atOracleOraclejet.atOracleOraclejetStrings.million
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.quadrillion
import typings.atOracleOraclejet.atOracleOraclejetStrings.thousand
import typings.atOracleOraclejet.atOracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBillionConverter extends js.Object {
  var converter: js.Object
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
}

object Anon_AutoBillionConverter {
  @scala.inline
  def apply(converter: js.Object, scaling: none | thousand | million | billion | trillion | quadrillion | auto): Anon_AutoBillionConverter = {
    val __obj = js.Dynamic.literal(converter = converter, scaling = scaling.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoBillionConverter]
  }
}

