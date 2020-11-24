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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojNavigationListSettableProperties[K, D] extends baseComponentSettableProperties {
  
  var as: String = js.native
  
  var currentItem: K = js.native
  
  var data: (DataProvider[K, D]) | Null = js.native
  
  var display: all | icons = js.native
  
  var drillMode: none | collapsible | sliding = js.native
  
  var edge: top | start = js.native
  
  var expanded: KeySet[K] = js.native
  
  var hierarchyMenuThreshold: Double = js.native
  
  var item: Selectable[K, D] = js.native
  
  var overflow: popup | hidden = js.native
  
  var rootLabel: String | Null = js.native
  
  var selection: K = js.native
  
  @JSName("translations")
  var translations_ojNavigationListSettableProperties: DefaultRootLabel = js.native
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
    translations: DefaultRootLabel
  ): ojNavigationListSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], drillMode = drillMode.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], hierarchyMenuThreshold = hierarchyMenuThreshold.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNavigationListSettableProperties[K, D]]
  }
  
  @scala.inline
  implicit class ojNavigationListSettablePropertiesOps[Self <: ojNavigationListSettableProperties[_, _], K, D] (val x: Self with (ojNavigationListSettableProperties[K, D])) extends AnyVal {
    
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
    def setDisplay(value: all | icons): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillMode(value: none | collapsible | sliding): Self = this.set("drillMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdge(value: top | start): Self = this.set("edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: KeySet[K]): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyMenuThreshold(value: Double): Self = this.set("hierarchyMenuThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Selectable[K, D]): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflow(value: popup | hidden): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: K): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: DefaultRootLabel): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    
    @scala.inline
    def setRootLabel(value: String): Self = this.set("rootLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootLabelNull: Self = this.set("rootLabel", null)
  }
}
