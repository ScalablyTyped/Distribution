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
@js.native
trait ojListViewSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var as: js.UndefOr[String] = js.native
  var currentItem: js.UndefOr[K] = js.native
  var data: js.UndefOr[DataProvider[K, D]] = js.native
  var dnd: js.UndefOr[DragDrop] = js.native
  var drillMode: js.UndefOr[collapsible | none] = js.native
  var expanded: js.UndefOr[KeySet[K]] = js.native
  var firstSelectedItem: js.UndefOr[Key[K, D]] = js.native
  var groupHeaderPosition: js.UndefOr[static | sticky] = js.native
  var item: js.UndefOr[Focusable[K, D]] = js.native
  var scrollPolicy: js.UndefOr[auto | loadMoreOnScroll] = js.native
  var scrollPolicyOptions: js.UndefOr[FetchSize] = js.native
  var scrollPosition: js.UndefOr[OffsetX[K]] = js.native
  var selection: js.UndefOr[js.Array[K]] = js.native
  var selectionMode: js.UndefOr[none | single | multiple] = js.native
  var selectionRequired: js.UndefOr[Boolean] = js.native
  var translations: js.UndefOr[AccessibleNavigateSkipItems] = js.native
}

object ojListViewSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](): ojListViewSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojListViewSettablePropertiesLenient[K, D]]
  }
  @scala.inline
  implicit class ojListViewSettablePropertiesLenientOps[Self <: ojListViewSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojListViewSettablePropertiesLenient[K, D])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setCurrentItem(value: K): Self = this.set("currentItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentItem: Self = this.set("currentItem", js.undefined)
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDnd(value: DragDrop): Self = this.set("dnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnd: Self = this.set("dnd", js.undefined)
    @scala.inline
    def setDrillMode(value: collapsible | none): Self = this.set("drillMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillMode: Self = this.set("drillMode", js.undefined)
    @scala.inline
    def setExpanded(value: KeySet[K]): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setFirstSelectedItem(value: Key[K, D]): Self = this.set("firstSelectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstSelectedItem: Self = this.set("firstSelectedItem", js.undefined)
    @scala.inline
    def setGroupHeaderPosition(value: static | sticky): Self = this.set("groupHeaderPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupHeaderPosition: Self = this.set("groupHeaderPosition", js.undefined)
    @scala.inline
    def setItem(value: Focusable[K, D]): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setScrollPolicy(value: auto | loadMoreOnScroll): Self = this.set("scrollPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPolicy: Self = this.set("scrollPolicy", js.undefined)
    @scala.inline
    def setScrollPolicyOptions(value: FetchSize): Self = this.set("scrollPolicyOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPolicyOptions: Self = this.set("scrollPolicyOptions", js.undefined)
    @scala.inline
    def setScrollPosition(value: OffsetX[K]): Self = this.set("scrollPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPosition: Self = this.set("scrollPosition", js.undefined)
    @scala.inline
    def setSelectionVarargs(value: K*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[K]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSelectionMode(value: none | single | multiple): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setSelectionRequired(value: Boolean): Self = this.set("selectionRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionRequired: Self = this.set("selectionRequired", js.undefined)
    @scala.inline
    def setTranslations(value: AccessibleNavigateSkipItems): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

