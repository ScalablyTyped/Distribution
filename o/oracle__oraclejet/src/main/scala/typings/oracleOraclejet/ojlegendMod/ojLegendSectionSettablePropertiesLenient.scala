package typings.oracleOraclejet.ojlegendMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlegend.ojLegendSectionSettableProperties> */
trait ojLegendSectionSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var collapsible: js.UndefOr[on | off] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var textHalign: js.UndefOr[center | end | start] = js.undefined
  var textStyle: js.UndefOr[js.Object] = js.undefined
}

object ojLegendSectionSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    collapsible: on | off = null,
    text: String = null,
    textHalign: center | end | start = null,
    textStyle: js.Object = null
  ): ojLegendSectionSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collapsible != null) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textHalign != null) __obj.updateDynamic("textHalign")(textHalign.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLegendSectionSettablePropertiesLenient]
  }
}

