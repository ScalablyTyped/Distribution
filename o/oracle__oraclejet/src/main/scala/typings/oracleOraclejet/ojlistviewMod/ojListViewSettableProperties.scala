package typings.oracleOraclejet.ojlistviewMod

import typings.oracleOraclejet.AnonAccessibleNavigateSkipItems
import typings.oracleOraclejet.AnonDragDrop
import typings.oracleOraclejet.AnonFetchSize
import typings.oracleOraclejet.AnonFocusable
import typings.oracleOraclejet.AnonKey
import typings.oracleOraclejet.AnonOffsetX
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojkeysetMod.KeySet
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.collapsible
import typings.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.static
import typings.oracleOraclejet.oracleOraclejetStrings.sticky
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojListViewSettableProperties[K, D] extends baseComponentSettableProperties {
  var as: String
  var currentItem: K
  var data: DataProvider[K, D]
  var dnd: AnonDragDrop
  var drillMode: collapsible | none
  var expanded: KeySet[K]
  val firstSelectedItem: AnonKey[K, D]
  var groupHeaderPosition: static | sticky
  var item: AnonFocusable[K, D]
  var scrollPolicy: auto | loadMoreOnScroll
  var scrollPolicyOptions: AnonFetchSize
  var scrollPosition: AnonOffsetX[K]
  var selection: js.Array[K]
  var selectionMode: none | single | multiple
  var selectionRequired: Boolean
  @JSName("translations")
  var translations_ojListViewSettableProperties: AnonAccessibleNavigateSkipItems
}

object ojListViewSettableProperties {
  @scala.inline
  def apply[K, D](
    as: String,
    currentItem: K,
    data: DataProvider[K, D],
    dnd: AnonDragDrop,
    drillMode: collapsible | none,
    expanded: KeySet[K],
    firstSelectedItem: AnonKey[K, D],
    groupHeaderPosition: static | sticky,
    item: AnonFocusable[K, D],
    scrollPolicy: auto | loadMoreOnScroll,
    scrollPolicyOptions: AnonFetchSize,
    scrollPosition: AnonOffsetX[K],
    selection: js.Array[K],
    selectionMode: none | single | multiple,
    selectionRequired: Boolean,
    translations: AnonAccessibleNavigateSkipItems
  ): ojListViewSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], drillMode = drillMode.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], firstSelectedItem = firstSelectedItem.asInstanceOf[js.Any], groupHeaderPosition = groupHeaderPosition.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], selectionRequired = selectionRequired.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojListViewSettableProperties[K, D]]
  }
}

