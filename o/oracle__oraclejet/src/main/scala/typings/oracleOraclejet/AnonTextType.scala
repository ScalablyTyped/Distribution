package typings.oracleOraclejet

import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.billion
import typings.oracleOraclejet.oracleOraclejetStrings.million
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.number
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.percent
import typings.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typings.oracleOraclejet.oracleOraclejetStrings.thousand
import typings.oracleOraclejet.oracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTextType extends js.Object {
  var converter: js.UndefOr[Converter[String]] = js.undefined
  var rendered: js.UndefOr[on | off] = js.undefined
  var scaling: js.UndefOr[none | thousand | million | billion | trillion | quadrillion | auto] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var textType: js.UndefOr[percent | number] = js.undefined
}

object AnonTextType {
  @scala.inline
  def apply(
    converter: Converter[String] = null,
    rendered: on | off = null,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto = null,
    style: js.Object = null,
    text: String = null,
    textType: percent | number = null
  ): AnonTextType = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textType != null) __obj.updateDynamic("textType")(textType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTextType]
  }
}

