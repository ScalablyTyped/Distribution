package typings.oracleOraclejet.ojlabelvalueMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlabelvalue.ojLabelValueSettableProperties> */
trait ojLabelValueSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var labelEdge: js.UndefOr[start | top | inherit] = js.undefined
  var labelWidth: js.UndefOr[String] = js.undefined
}

object ojLabelValueSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    labelEdge: start | top | inherit = null,
    labelWidth: String = null
  ): ojLabelValueSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (labelEdge != null) __obj.updateDynamic("labelEdge")(labelEdge.asInstanceOf[js.Any])
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLabelValueSettablePropertiesLenient]
  }
}

