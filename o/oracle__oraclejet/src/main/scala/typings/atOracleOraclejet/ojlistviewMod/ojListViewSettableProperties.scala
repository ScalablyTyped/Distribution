package typings.atOracleOraclejet.ojlistviewMod

import typings.atOracleOraclejet.Anon_AccessibleNavigateSkipItems
import typings.atOracleOraclejet.Anon_DataKey
import typings.atOracleOraclejet.Anon_DragDropReorder
import typings.atOracleOraclejet.Anon_FetchSize
import typings.atOracleOraclejet.Anon_Focusable
import typings.atOracleOraclejet.Anon_IndexKey
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.collapsible
import typings.atOracleOraclejet.atOracleOraclejetStrings.loadMoreOnScroll
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.static
import typings.atOracleOraclejet.atOracleOraclejetStrings.sticky
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojkeysetMod.KeySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojListViewSettableProperties[K, D] extends baseComponentSettableProperties {
  var as: String
  var currentItem: K
  var data: DataProvider[K, D]
  var dnd: Anon_DragDropReorder
  var drillMode: collapsible | none
  var expanded: KeySet[K]
  val firstSelectedItem: Anon_DataKey[K, D]
  var groupHeaderPosition: static | sticky
  var item: Anon_Focusable[K, D]
  var scrollPolicy: auto | loadMoreOnScroll
  var scrollPolicyOptions: Anon_FetchSize
  var scrollPosition: Anon_IndexKey[K]
  var selection: js.Array[K]
  var selectionMode: none | single | multiple
  var selectionRequired: Boolean
  @JSName("translations")
  var translations_ojListViewSettableProperties: Anon_AccessibleNavigateSkipItems
}

object ojListViewSettableProperties {
  @scala.inline
  def apply[K, D](
    as: String,
    currentItem: K,
    data: DataProvider[K, D],
    dnd: Anon_DragDropReorder,
    drillMode: collapsible | none,
    expanded: KeySet[K],
    firstSelectedItem: Anon_DataKey[K, D],
    groupHeaderPosition: static | sticky,
    item: Anon_Focusable[K, D],
    scrollPolicy: auto | loadMoreOnScroll,
    scrollPolicyOptions: Anon_FetchSize,
    scrollPosition: Anon_IndexKey[K],
    selection: js.Array[K],
    selectionMode: none | single | multiple,
    selectionRequired: Boolean,
    translations: Anon_AccessibleNavigateSkipItems
  ): ojListViewSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], drillMode = drillMode.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], firstSelectedItem = firstSelectedItem.asInstanceOf[js.Any], groupHeaderPosition = groupHeaderPosition.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], selectionRequired = selectionRequired.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojListViewSettableProperties[K, D]]
  }
}

