package typings
package atOracleOraclejetLib.ojdiagramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDiagramNodeSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var descendantsConnectivity: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.connected | atOracleOraclejetLib.atOracleOraclejetLibStrings.disjoint | atOracleOraclejetLib.atOracleOraclejetLibStrings.unknown
  ] = js.undefined
  var icon: js.UndefOr[atOracleOraclejetLib.Anon_BorderColorBorderRadiusBorderWidth] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var labelStyle: js.UndefOr[js.Object | scala.Null] = js.undefined
  var overview: js.UndefOr[atOracleOraclejetLib.Anon_IconAnonCircle] = js.undefined
  var selectable: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ] = js.undefined
  var shortDesc: js.UndefOr[java.lang.String] = js.undefined
  var showDisclosure: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ] = js.undefined
}

object ojDiagramNodeSettableProperties {
  @scala.inline
  def apply(
    categories: js.Array[java.lang.String] = null,
    descendantsConnectivity: atOracleOraclejetLib.atOracleOraclejetLibStrings.connected | atOracleOraclejetLib.atOracleOraclejetLibStrings.disjoint | atOracleOraclejetLib.atOracleOraclejetLibStrings.unknown = null,
    icon: atOracleOraclejetLib.Anon_BorderColorBorderRadiusBorderWidth = null,
    label: java.lang.String = null,
    labelStyle: js.Object = null,
    overview: atOracleOraclejetLib.Anon_IconAnonCircle = null,
    selectable: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = null,
    shortDesc: java.lang.String = null,
    showDisclosure: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = null
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

