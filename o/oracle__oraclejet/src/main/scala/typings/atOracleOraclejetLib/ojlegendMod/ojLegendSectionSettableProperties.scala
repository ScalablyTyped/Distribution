package typings
package atOracleOraclejetLib.ojlegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLegendSectionSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var collapsible: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var textHalign: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
  ] = js.undefined
  var textStyle: js.UndefOr[js.Object] = js.undefined
}

object ojLegendSectionSettableProperties {
  @scala.inline
  def apply(
    collapsible: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = null,
    text: java.lang.String = null,
    textHalign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start = null,
    textStyle: js.Object = null
  ): ojLegendSectionSettableProperties = {
    val __obj = js.Dynamic.literal()
    if (collapsible != null) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (textHalign != null) __obj.updateDynamic("textHalign")(textHalign.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[ojLegendSectionSettableProperties]
  }
}

