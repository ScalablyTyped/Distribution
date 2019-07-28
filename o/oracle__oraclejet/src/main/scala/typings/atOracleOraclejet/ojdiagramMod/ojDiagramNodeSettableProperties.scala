package typings.atOracleOraclejet.ojdiagramMod

import typings.atOracleOraclejet.Anon_BorderColorBorderRadiusBorderWidth
import typings.atOracleOraclejet.Anon_IconAnonCircle
import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.connected
import typings.atOracleOraclejet.atOracleOraclejetStrings.disjoint
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDiagramNodeSettableProperties extends JetSettableProperties {
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var descendantsConnectivity: js.UndefOr[connected | disjoint | unknown] = js.undefined
  var icon: js.UndefOr[Anon_BorderColorBorderRadiusBorderWidth] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[js.Object | Null] = js.undefined
  var overview: js.UndefOr[Anon_IconAnonCircle] = js.undefined
  var selectable: js.UndefOr[auto | off] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var showDisclosure: js.UndefOr[on | off] = js.undefined
}

object ojDiagramNodeSettableProperties {
  @scala.inline
  def apply(
    categories: js.Array[String] = null,
    descendantsConnectivity: connected | disjoint | unknown = null,
    icon: Anon_BorderColorBorderRadiusBorderWidth = null,
    label: String = null,
    labelStyle: js.Object = null,
    overview: Anon_IconAnonCircle = null,
    selectable: auto | off = null,
    shortDesc: String = null,
    showDisclosure: on | off = null
  ): ojDiagramNodeSettableProperties = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (descendantsConnectivity != null) __obj.updateDynamic("descendantsConnectivity")(descendantsConnectivity.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (overview != null) __obj.updateDynamic("overview")(overview)
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc)
    if (showDisclosure != null) __obj.updateDynamic("showDisclosure")(showDisclosure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDiagramNodeSettableProperties]
  }
}

