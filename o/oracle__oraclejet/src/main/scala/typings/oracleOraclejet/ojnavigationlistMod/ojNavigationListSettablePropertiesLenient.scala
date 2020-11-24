package typings.oracleOraclejet.ojnavigationlistMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.DefaultRootLabel
import typings.oracleOraclejet.anon.Selectable
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojNavigationListSettableProperties<K, D>> */
@js.native
trait ojNavigationListSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  
  var as: js.UndefOr[String] = js.native
  
  var currentItem: js.UndefOr[K] = js.native
  
  var data: js.UndefOr[(DataProvider[K, D]) | Null] = js.native
  
  var display: js.UndefOr[all | icons] = js.native
  
  var drillMode: js.UndefOr[none | collapsible | sliding] = js.native
  
  var edge: js.UndefOr[top | start] = js.native
  
  var expanded: js.UndefOr[KeySet[K]] = js.native
  
  var hierarchyMenuThreshold: js.UndefOr[Double] = js.native
  
  var item: js.UndefOr[Selectable[K, D]] = js.native
  
  var overflow: js.UndefOr[popup | hidden] = js.native
  
  var rootLabel: js.UndefOr[String | Null] = js.native
  
  var selection: js.UndefOr[K] = js.native
  
  var translations: js.UndefOr[DefaultRootLabel] = js.native
}
object ojNavigationListSettablePropertiesLenient {
  
  @scala.inline
  def apply[K, D](): ojNavigationListSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojNavigationListSettablePropertiesLenient[K, D]]
  }
  
  @scala.inline
  implicit class ojNavigationListSettablePropertiesLenientOps[Self <: ojNavigationListSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojNavigationListSettablePropertiesLenient[K, D])) extends AnyVal {
    
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
    def setDataNull: Self = this.set("data", null)
    
    @scala.inline
    def setDisplay(value: all | icons): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDrillMode(value: none | collapsible | sliding): Self = this.set("drillMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrillMode: Self = this.set("drillMode", js.undefined)
    
    @scala.inline
    def setEdge(value: top | start): Self = this.set("edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdge: Self = this.set("edge", js.undefined)
    
    @scala.inline
    def setExpanded(value: KeySet[K]): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setHierarchyMenuThreshold(value: Double): Self = this.set("hierarchyMenuThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierarchyMenuThreshold: Self = this.set("hierarchyMenuThreshold", js.undefined)
    
    @scala.inline
    def setItem(value: Selectable[K, D]): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setOverflow(value: popup | hidden): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setRootLabel(value: String): Self = this.set("rootLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootLabel: Self = this.set("rootLabel", js.undefined)
    
    @scala.inline
    def setRootLabelNull: Self = this.set("rootLabel", null)
    
    @scala.inline
    def setSelection(value: K): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setTranslations(value: DefaultRootLabel): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
}
