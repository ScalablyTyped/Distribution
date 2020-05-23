package typings.oracleOraclejet.ojlistviewMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AccessibleNavigateSkipItems
import typings.oracleOraclejet.anon.DragDrop
import typings.oracleOraclejet.anon.FetchSize
import typings.oracleOraclejet.anon.Focusable
import typings.oracleOraclejet.anon.Key
import typings.oracleOraclejet.anon.OffsetX
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlistview.ojListViewSettableProperties<K, D>> */
trait ojListViewSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var as: js.UndefOr[String] = js.undefined
  var currentItem: js.UndefOr[K] = js.undefined
  var data: js.UndefOr[DataProvider[K, D]] = js.undefined
  var dnd: js.UndefOr[DragDrop] = js.undefined
  var drillMode: js.UndefOr[collapsible | none] = js.undefined
  var expanded: js.UndefOr[KeySet[K]] = js.undefined
  var firstSelectedItem: js.UndefOr[Key[K, D]] = js.undefined
  var groupHeaderPosition: js.UndefOr[static | sticky] = js.undefined
  var item: js.UndefOr[Focusable[K, D]] = js.undefined
  var scrollPolicy: js.UndefOr[auto | loadMoreOnScroll] = js.undefined
  var scrollPolicyOptions: js.UndefOr[FetchSize] = js.undefined
  var scrollPosition: js.UndefOr[OffsetX[K]] = js.undefined
  var selection: js.UndefOr[js.Array[K]] = js.undefined
  var selectionMode: js.UndefOr[none | single | multiple] = js.undefined
  var selectionRequired: js.UndefOr[Boolean] = js.undefined
  var translations: js.UndefOr[AccessibleNavigateSkipItems] = js.undefined
}

object ojListViewSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    as: String = null,
    currentItem: K = null,
    data: DataProvider[K, D] = null,
    dnd: DragDrop = null,
    drillMode: collapsible | none = null,
    expanded: KeySet[K] = null,
    firstSelectedItem: Key[K, D] = null,
    groupHeaderPosition: static | sticky = null,
    item: Focusable[K, D] = null,
    scrollPolicy: auto | loadMoreOnScroll = null,
    scrollPolicyOptions: FetchSize = null,
    scrollPosition: OffsetX[K] = null,
    selection: js.Array[K] = null,
    selectionMode: none | single | multiple = null,
    selectionRequired: js.UndefOr[Boolean] = js.undefined,
    translations: AccessibleNavigateSkipItems = null
  ): ojListViewSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (currentItem != null) __obj.updateDynamic("currentItem")(currentItem.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dnd != null) __obj.updateDynamic("dnd")(dnd.asInstanceOf[js.Any])
    if (drillMode != null) __obj.updateDynamic("drillMode")(drillMode.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (firstSelectedItem != null) __obj.updateDynamic("firstSelectedItem")(firstSelectedItem.asInstanceOf[js.Any])
    if (groupHeaderPosition != null) __obj.updateDynamic("groupHeaderPosition")(groupHeaderPosition.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (scrollPolicy != null) __obj.updateDynamic("scrollPolicy")(scrollPolicy.asInstanceOf[js.Any])
    if (scrollPolicyOptions != null) __obj.updateDynamic("scrollPolicyOptions")(scrollPolicyOptions.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionRequired)) __obj.updateDynamic("selectionRequired")(selectionRequired.get.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojListViewSettablePropertiesLenient[K, D]]
  }
}

