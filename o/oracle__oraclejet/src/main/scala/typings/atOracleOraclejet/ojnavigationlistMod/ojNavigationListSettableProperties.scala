package typings.atOracleOraclejet.ojnavigationlistMod

import typings.atOracleOraclejet.Anon_ContextRendererSelectable
import typings.atOracleOraclejet.Anon_DefaultRootLabel
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.collapsible
import typings.atOracleOraclejet.atOracleOraclejetStrings.hidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.icons
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.popup
import typings.atOracleOraclejet.atOracleOraclejetStrings.sliding
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojkeysetMod.KeySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojNavigationListSettableProperties[K, D] extends baseComponentSettableProperties {
  var as: String
  var currentItem: K
  var data: (DataProvider[K, D]) | Null
  var display: all | icons
  var drillMode: none | collapsible | sliding
  var edge: top | start
  var expanded: KeySet[K]
  var hierarchyMenuThreshold: Double
  var item: Anon_ContextRendererSelectable[K, D]
  var overflow: popup | hidden
  var rootLabel: String | Null
  var selection: K
  @JSName("translations")
  var translations_ojNavigationListSettableProperties: Anon_DefaultRootLabel
}

object ojNavigationListSettableProperties {
  @scala.inline
  def apply[K, D](
    as: String,
    currentItem: K,
    display: all | icons,
    drillMode: none | collapsible | sliding,
    edge: top | start,
    expanded: KeySet[K],
    hierarchyMenuThreshold: Double,
    item: Anon_ContextRendererSelectable[K, D],
    overflow: popup | hidden,
    selection: K,
    translations: Anon_DefaultRootLabel,
    data: DataProvider[K, D] = null,
    rootLabel: String = null
  ): ojNavigationListSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], drillMode = drillMode.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], hierarchyMenuThreshold = hierarchyMenuThreshold.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (rootLabel != null) __obj.updateDynamic("rootLabel")(rootLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNavigationListSettableProperties[K, D]]
  }
}

