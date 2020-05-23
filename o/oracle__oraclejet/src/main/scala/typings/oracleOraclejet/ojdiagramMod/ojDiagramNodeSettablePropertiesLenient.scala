package typings.oracleOraclejet.ojdiagramMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.IconShape
import typings.oracleOraclejet.anon.Opacity
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.connected
import typings.oracleOraclejet.oracleOraclejetStrings.disjoint
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramNodeSettableProperties> */
trait ojDiagramNodeSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var descendantsConnectivity: js.UndefOr[connected | disjoint | unknown] = js.undefined
  var icon: js.UndefOr[Opacity] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var overview: js.UndefOr[IconShape] = js.undefined
  var selectable: js.UndefOr[auto | off] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var showDisclosure: js.UndefOr[on | off] = js.undefined
}

object ojDiagramNodeSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    categories: js.Array[String] = null,
    descendantsConnectivity: connected | disjoint | unknown = null,
    icon: Opacity = null,
    label: String = null,
    labelStyle: js.Object = null,
    overview: IconShape = null,
    selectable: auto | off = null,
    shortDesc: String = null,
    showDisclosure: on | off = null
  ): ojDiagramNodeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (descendantsConnectivity != null) __obj.updateDynamic("descendantsConnectivity")(descendantsConnectivity.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (showDisclosure != null) __obj.updateDynamic("showDisclosure")(showDisclosure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDiagramNodeSettablePropertiesLenient]
  }
}

