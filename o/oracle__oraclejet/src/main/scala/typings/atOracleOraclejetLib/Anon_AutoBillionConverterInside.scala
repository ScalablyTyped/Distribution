package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBillionConverterInside extends js.Object {
  var converter: js.Object
  var position: atOracleOraclejetLib.atOracleOraclejetLibStrings.inside | atOracleOraclejetLib.atOracleOraclejetLibStrings.outside
  var rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  var scaling: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.thousand | atOracleOraclejetLib.atOracleOraclejetLibStrings.million | atOracleOraclejetLib.atOracleOraclejetLibStrings.billion | atOracleOraclejetLib.atOracleOraclejetLibStrings.trillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.quadrillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var style: js.Object
}

object Anon_AutoBillionConverterInside {
  @scala.inline
  def apply(
    converter: js.Object,
    position: atOracleOraclejetLib.atOracleOraclejetLibStrings.inside | atOracleOraclejetLib.atOracleOraclejetLibStrings.outside,
    rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on,
    scaling: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.thousand | atOracleOraclejetLib.atOracleOraclejetLibStrings.million | atOracleOraclejetLib.atOracleOraclejetLibStrings.billion | atOracleOraclejetLib.atOracleOraclejetLibStrings.trillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.quadrillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    style: js.Object
  ): Anon_AutoBillionConverterInside = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("converter")(converter)
    __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_AutoBillionConverterInside]
  }
}

