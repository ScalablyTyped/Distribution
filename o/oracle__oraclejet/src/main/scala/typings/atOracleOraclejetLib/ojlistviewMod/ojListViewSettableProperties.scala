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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("as")(as)
    __obj.updateDynamic("currentItem")(currentItem.asInstanceOf[js.Any])
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("dnd")(dnd)
    __obj.updateDynamic("drillMode")(drillMode.asInstanceOf[js.Any])
    __obj.updateDynamic("expanded")(expanded)
    __obj.updateDynamic("firstSelectedItem")(firstSelectedItem)
    __obj.updateDynamic("groupHeaderPosition")(groupHeaderPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("scrollPolicy")(scrollPolicy.asInstanceOf[js.Any])
    __obj.updateDynamic("scrollPolicyOptions")(scrollPolicyOptions)
    __obj.updateDynamic("scrollPosition")(scrollPosition)
    __obj.updateDynamic("selection")(selection)
    __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    __obj.updateDynamic("selectionRequired")(selectionRequired)
    __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojListViewSettableProperties[K, D]]
  }
}

