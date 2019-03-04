package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBillionConverterMillion extends js.Object {
  var converter: js.Object
  var rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  var rotation: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var scaling: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.thousand | atOracleOraclejetLib.atOracleOraclejetLibStrings.million | atOracleOraclejetLib.atOracleOraclejetLibStrings.billion | atOracleOraclejetLib.atOracleOraclejetLibStrings.trillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.quadrillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var style: js.Object
}

object Anon_AutoBillionConverterMillion {
  @scala.inline
  def apply(
    converter: js.Object,
    rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on,
    rotation: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    scaling: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.thousand | atOracleOraclejetLib.atOracleOraclejetLibStrings.million | atOracleOraclejetLib.atOracleOraclejetLibStrings.billion | atOracleOraclejetLib.atOracleOraclejetLibStrings.trillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.quadrillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    style: js.Object
  ): Anon_AutoBillionConverterMillion = {
    val __obj = js.Dynamic.literal(converter = converter, rendered = rendered.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any], style = style)
  
    __obj.asInstanceOf[Anon_AutoBillionConverterMillion]
  }
}

