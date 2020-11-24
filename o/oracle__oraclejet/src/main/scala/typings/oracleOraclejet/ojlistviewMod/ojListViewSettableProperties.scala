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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojListViewSettableProperties[K, D] extends baseComponentSettableProperties {
  
  var as: String = js.native
  
  var currentItem: K = js.native
  
  var data: DataProvider[K, D] = js.native
  
  var dnd: DragDrop = js.native
  
  var drillMode: collapsible | none = js.native
  
  var expanded: KeySet[K] = js.native
  
  val firstSelectedItem: Key[K, D] = js.native
  
  var groupHeaderPosition: static | sticky = js.native
  
  var item: Focusable[K, D] = js.native
  
  var scrollPolicy: auto | loadMoreOnScroll = js.native
  
  var scrollPolicyOptions: FetchSize = js.native
  
  var scrollPosition: OffsetX[K] = js.native
  
  var selection: js.Array[K] = js.native
  
  var selectionMode: none | single | multiple = js.native
  
  var selectionRequired: Boolean = js.native
  
  @JSName("translations")
  var translations_ojListViewSettableProperties: AccessibleNavigateSkipItems = js.native
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
  
  @scala.inline
  implicit class ojListViewSettablePropertiesOps[Self <: ojListViewSettableProperties[_, _], K, D] (val x: Self with (ojListViewSettableProperties[K, D])) extends AnyVal {
    
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
    def setCurrentItem(value: K): Self = this.set("currentItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnd(value: DragDrop): Self = this.set("dnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillMode(value: collapsible | none): Self = this.set("drillMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: KeySet[K]): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSelectedItem(value: Key[K, D]): Self = this.set("firstSelectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupHeaderPosition(value: static | sticky): Self = this.set("groupHeaderPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Focusable[K, D]): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPolicy(value: auto | loadMoreOnScroll): Self = this.set("scrollPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPolicyOptions(value: FetchSize): Self = this.set("scrollPolicyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPosition(value: OffsetX[K]): Self = this.set("scrollPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionVarargs(value: K*): Self = this.set("selection", js.Array(value :_*))
    
    @scala.inline
    def setSelection(value: js.Array[K]): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: none | single | multiple): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRequired(value: Boolean): Self = this.set("selectionRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: AccessibleNavigateSkipItems): Self = this.set("translations", value.asInstanceOf[js.Any])
  }
}
