package typings.oracleOraclejet.ojlistviewMod

import typings.oracleOraclejet.anon.AccessibleNavigateSkipItems
import typings.oracleOraclejet.anon.DragDrop
import typings.oracleOraclejet.anon.FetchSize
import typings.oracleOraclejet.anon.Focusable
import typings.oracleOraclejet.anon.Key
import typings.oracleOraclejet.anon.OffsetX
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
  var dnd: DragDrop
  var drillMode: collapsible | none
  var expanded: KeySet[K]
  val firstSelectedItem: Key[K, D]
  var groupHeaderPosition: static | sticky
  var item: Focusable[K, D]
  var scrollPolicy: auto | loadMoreOnScroll
  var scrollPolicyOptions: FetchSize
  var scrollPosition: OffsetX[K]
  var selection: js.Array[K]
  var selectionMode: none | single | multiple
  var selectionRequired: Boolean
  @JSName("translations")
  var translations_ojListViewSettableProperties: AccessibleNavigateSkipItems
}

object ojListViewSettableProperties {
  @scala.inline
  def apply[K, D](
    as: String,
    currentItem: K,
    data: DataProvider[K, D],
    dnd: DragDrop,
    drillMode: collapsible | none,
    expanded: KeySet[K],
    firstSelectedItem: Key[K, D],
    groupHeaderPosition: static | sticky,
    item: Focusable[K, D],
    scrollPolicy: auto | loadMoreOnScroll,
    scrollPolicyOptions: FetchSize,
    scrollPosition: OffsetX[K],
    selection: js.Array[K],
    selectionMode: none | single | multiple,
    selectionRequired: Boolean,
    translations: AccessibleNavigateSkipItems
  ): ojListViewSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], drillMode = drillMode.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], firstSelectedItem = firstSelectedItem.asInstanceOf[js.Any], groupHeaderPosition = groupHeaderPosition.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], selectionRequired = selectionRequired.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojListViewSettableProperties[K, D]]
  }
}

