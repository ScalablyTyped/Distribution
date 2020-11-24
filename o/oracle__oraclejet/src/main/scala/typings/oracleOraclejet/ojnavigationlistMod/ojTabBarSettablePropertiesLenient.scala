package typings.oracleOraclejet.ojnavigationlistMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AccessibleReorderAfterItem
import typings.oracleOraclejet.anon.RendererSelectable
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.hidden
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.popup
import typings.oracleOraclejet.oracleOraclejetStrings.progressive
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBarSettableProperties<K, D>> */
@js.native
trait ojTabBarSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  
  var as: js.UndefOr[String] = js.native
  
  var currentItem: js.UndefOr[js.Any] = js.native
  
  var data: js.UndefOr[(DataProvider[K, D]) | Null] = js.native
  
  var display: js.UndefOr[all | icons] = js.native
  
  var edge: js.UndefOr[top | bottom | start | end] = js.native
  
  var item: js.UndefOr[RendererSelectable[K, D]] = js.native
  
  var overflow: js.UndefOr[popup | hidden] = js.native
  
  var reorderable: js.UndefOr[enabled | disabled] = js.native
  
  var selection: js.UndefOr[js.Any] = js.native
  
  var translations: js.UndefOr[AccessibleReorderAfterItem] = js.native
  
  var truncation: js.UndefOr[none | progressive] = js.native
}
object ojTabBarSettablePropertiesLenient {
  
  @scala.inline
  def apply[K, D](): ojTabBarSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojTabBarSettablePropertiesLenient[K, D]]
  }
  
  @scala.inline
  implicit class ojTabBarSettablePropertiesLenientOps[Self <: ojTabBarSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojTabBarSettablePropertiesLenient[K, D])) extends AnyVal {
    
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
    def setCurrentItem(value: js.Any): Self = this.set("currentItem", value.asInstanceOf[js.Any])
    
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
    def setEdge(value: top | bottom | start | end): Self = this.set("edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdge: Self = this.set("edge", js.undefined)
    
    @scala.inline
    def setItem(value: RendererSelectable[K, D]): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setOverflow(value: popup | hidden): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setReorderable(value: enabled | disabled): Self = this.set("reorderable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReorderable: Self = this.set("reorderable", js.undefined)
    
    @scala.inline
    def setSelection(value: js.Any): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setTranslations(value: AccessibleReorderAfterItem): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    
    @scala.inline
    def setTruncation(value: none | progressive): Self = this.set("truncation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncation: Self = this.set("truncation", js.undefined)
  }
}
