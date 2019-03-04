package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var converter: js.Object
  var label: java.lang.String
  var labelStyle: js.Object
  var scaling: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.thousand | atOracleOraclejetLib.atOracleOraclejetLibStrings.million | atOracleOraclejetLib.atOracleOraclejetLibStrings.billion | atOracleOraclejetLib.atOracleOraclejetLibStrings.trillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.quadrillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  def renderer(context: atOracleOraclejetLib.ojchartMod.ojChartNs.PieCenterContext): Anon_Insert | Anon_PreventDefault
}

object Anon_Auto {
  @scala.inline
  def apply(
    converter: js.Object,
    label: java.lang.String,
    labelStyle: js.Object,
    renderer: js.Function1[
      atOracleOraclejetLib.ojchartMod.ojChartNs.PieCenterContext, 
      Anon_Insert | Anon_PreventDefault
    ],
    scaling: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.thousand | atOracleOraclejetLib.atOracleOraclejetLibStrings.million | atOracleOraclejetLib.atOracleOraclejetLibStrings.billion | atOracleOraclejetLib.atOracleOraclejetLibStrings.trillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.quadrillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): Anon_Auto = {
    val __obj = js.Dynamic.literal(converter = converter, label = label, labelStyle = labelStyle, renderer = renderer, scaling = scaling.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Auto]
  }
}

