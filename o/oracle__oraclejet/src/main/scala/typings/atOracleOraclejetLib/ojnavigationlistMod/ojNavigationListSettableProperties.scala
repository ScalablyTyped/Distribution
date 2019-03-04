package typings
package atOracleOraclejetLib.ojnavigationlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojNavigationListSettableProperties[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var as: java.lang.String
  var currentItem: K
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var display: atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
  var drillMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.sliding
  var edge: atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
  var expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K]
  var hierarchyMenuThreshold: scala.Double
  var item: atOracleOraclejetLib.Anon_ContextRendererSelectable[K, D]
  var overflow: atOracleOraclejetLib.atOracleOraclejetLibStrings.popup | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
  var rootLabel: java.lang.String | scala.Null
  var selection: K
  @JSName("translations")
  var translations_ojNavigationListSettableProperties: atOracleOraclejetLib.Anon_DefaultRootLabel
}

object ojNavigationListSettableProperties {
  @scala.inline
  def apply[K, D](
    as: java.lang.String,
    currentItem: K,
    display: atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons,
    drillMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.sliding,
    edge: atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.start,
    expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K],
    hierarchyMenuThreshold: scala.Double,
    item: atOracleOraclejetLib.Anon_ContextRendererSelectable[K, D],
    overflow: atOracleOraclejetLib.atOracleOraclejetLibStrings.popup | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden,
    selection: K,
    translations: atOracleOraclejetLib.Anon_DefaultRootLabel,
    data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null,
    rootLabel: java.lang.String = null
  ): ojNavigationListSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as, currentItem = currentItem.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], drillMode = drillMode.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], expanded = expanded, hierarchyMenuThreshold = hierarchyMenuThreshold, item = item, overflow = overflow.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], translations = translations)
    if (data != null) __obj.updateDynamic("data")(data)
    if (rootLabel != null) __obj.updateDynamic("rootLabel")(rootLabel)
    __obj.asInstanceOf[ojNavigationListSettableProperties[K, D]]
  }
}

