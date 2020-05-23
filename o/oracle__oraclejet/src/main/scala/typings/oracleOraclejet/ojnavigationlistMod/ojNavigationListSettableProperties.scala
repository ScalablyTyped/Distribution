package typings.oracleOraclejet.ojnavigationlistMod

import typings.oracleOraclejet.anon.DefaultRootLabel
import typings.oracleOraclejet.anon.Selectable
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojkeysetMod.KeySet
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.collapsible
import typings.oracleOraclejet.oracleOraclejetStrings.hidden
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.popup
import typings.oracleOraclejet.oracleOraclejetStrings.sliding
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
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
  var item: Selectable[K, D]
  var overflow: popup | hidden
  var rootLabel: String | Null
  var selection: K
  @JSName("translations")
  var translations_ojNavigationListSettableProperties: DefaultRootLabel
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
    item: Selectable[K, D],
    overflow: popup | hidden,
    selection: K,
    translations: DefaultRootLabel,
    data: DataProvider[K, D] = null,
    rootLabel: String = null
  ): ojNavigationListSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], drillMode = drillMode.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], hierarchyMenuThreshold = hierarchyMenuThreshold.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rootLabel = rootLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNavigationListSettableProperties[K, D]]
  }
}

