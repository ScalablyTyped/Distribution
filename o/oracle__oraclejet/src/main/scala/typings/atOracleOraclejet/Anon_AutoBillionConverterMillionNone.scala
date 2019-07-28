package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.billion
import typings.atOracleOraclejet.atOracleOraclejetStrings.million
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.number
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.percent
import typings.atOracleOraclejet.atOracleOraclejetStrings.quadrillion
import typings.atOracleOraclejet.atOracleOraclejetStrings.thousand
import typings.atOracleOraclejet.atOracleOraclejetStrings.trillion
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBillionConverterMillionNone extends js.Object {
  var converter: js.UndefOr[Converter[String]] = js.undefined
  var rendered: js.UndefOr[on | off] = js.undefined
  var scaling: js.UndefOr[none | thousand | million | billion | trillion | quadrillion | auto] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var textType: js.UndefOr[percent | number] = js.undefined
}

object Anon_AutoBillionConverterMillionNone {
  @scala.inline
  def apply(
    converter: Converter[String] = null,
    rendered: on | off = null,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto = null,
    style: js.Object = null,
    text: String = null,
    textType: percent | number = null
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

