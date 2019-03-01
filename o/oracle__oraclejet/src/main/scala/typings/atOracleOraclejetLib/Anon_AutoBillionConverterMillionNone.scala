package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBillionConverterMillionNone extends js.Object {
  var converter: js.UndefOr[atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]] = js.undefined
  var rendered: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ] = js.undefined
  var scaling: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.thousand | atOracleOraclejetLib.atOracleOraclejetLibStrings.million | atOracleOraclejetLib.atOracleOraclejetLibStrings.billion | atOracleOraclejetLib.atOracleOraclejetLibStrings.trillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.quadrillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var textType: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.percent | atOracleOraclejetLib.atOracleOraclejetLibStrings.number
  ] = js.undefined
}

object Anon_AutoBillionConverterMillionNone {
  @scala.inline
  def apply(
    converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] = null,
    rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = null,
    scaling: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.thousand | atOracleOraclejetLib.atOracleOraclejetLibStrings.million | atOracleOraclejetLib.atOracleOraclejetLibStrings.billion | atOracleOraclejetLib.atOracleOraclejetLibStrings.trillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.quadrillion | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = null,
    style: js.Object = null,
    text: java.lang.String = null,
    textType: atOracleOraclejetLib.atOracleOraclejetLibStrings.percent | atOracleOraclejetLib.atOracleOraclejetLibStrings.number = null
  ): Anon_AutoBillionConverterMillionNone = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter)
    if (rendered != null) __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textType != null) __obj.updateDynamic("textType")(textType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoBillionConverterMillionNone]
  }
}

