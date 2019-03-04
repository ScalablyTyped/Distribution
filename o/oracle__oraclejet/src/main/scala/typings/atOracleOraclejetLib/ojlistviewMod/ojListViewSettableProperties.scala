package typings
package atOracleOraclejetLib.ojlistviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojListViewSettableProperties[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var as: java.lang.String
  var currentItem: K
  var data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]
  var dnd: atOracleOraclejetLib.Anon_DragDropReorder
  var drillMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K]
  val firstSelectedItem: atOracleOraclejetLib.Anon_DataKey[K, D]
  var groupHeaderPosition: atOracleOraclejetLib.atOracleOraclejetLibStrings.static | atOracleOraclejetLib.atOracleOraclejetLibStrings.sticky
  var item: atOracleOraclejetLib.Anon_Focusable[K, D]
  var scrollPolicy: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll
  var scrollPolicyOptions: atOracleOraclejetLib.Anon_FetchSize
  var scrollPosition: atOracleOraclejetLib.Anon_IndexKey[K]
  var selection: js.Array[K]
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
  var selectionRequired: scala.Boolean
  @JSName("translations")
  var translations_ojListViewSettableProperties: atOracleOraclejetLib.Anon_AccessibleNavigateSkipItems
}

object ojListViewSettableProperties {
  @scala.inline
  def apply[K, D](
    as: java.lang.String,
    currentItem: K,
    data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D],
    dnd: atOracleOraclejetLib.Anon_DragDropReorder,
    drillMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K],
    firstSelectedItem: atOracleOraclejetLib.Anon_DataKey[K, D],
    groupHeaderPosition: atOracleOraclejetLib.atOracleOraclejetLibStrings.static | atOracleOraclejetLib.atOracleOraclejetLibStrings.sticky,
    item: atOracleOraclejetLib.Anon_Focusable[K, D],
    scrollPolicy: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll,
    scrollPolicyOptions: atOracleOraclejetLib.Anon_FetchSize,
    scrollPosition: atOracleOraclejetLib.Anon_IndexKey[K],
    selection: js.Array[K],
    selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple,
    selectionRequired: scala.Boolean,
    translations: atOracleOraclejetLib.Anon_AccessibleNavigateSkipItems
  ): ojListViewSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as, currentItem = currentItem.asInstanceOf[js.Any], data = data, dnd = dnd, drillMode = drillMode.asInstanceOf[js.Any], expanded = expanded, firstSelectedItem = firstSelectedItem, groupHeaderPosition = groupHeaderPosition.asInstanceOf[js.Any], item = item, scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions, scrollPosition = scrollPosition, selection = selection, selectionMode = selectionMode.asInstanceOf[js.Any], selectionRequired = selectionRequired, translations = translations)
  
    __obj.asInstanceOf[ojListViewSettableProperties[K, D]]
  }
}

