package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.billion
import typings.atOracleOraclejet.atOracleOraclejetStrings.million
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.quadrillion
import typings.atOracleOraclejet.atOracleOraclejetStrings.thousand
import typings.atOracleOraclejet.atOracleOraclejetStrings.trillion
import typings.atOracleOraclejet.ojchartMod.ojChart.PieCenterContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var converter: js.Object
  var label: String
  var labelStyle: js.Object
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
  def renderer(context: PieCenterContext): Anon_Insert | Anon_PreventDefault
}

object Anon_Auto {
  @scala.inline
  def apply(
    converter: js.Object,
    label: String,
    labelStyle: js.Object,
    renderer: PieCenterContext => Anon_Insert | Anon_PreventDefault,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto
  ): Anon_Auto = {
    val __obj = js.Dynamic.literal(converter = converter, label = label, labelStyle = labelStyle, renderer = js.Any.fromFunction1(renderer), scaling = scaling.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Auto]
  }
}

