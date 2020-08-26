package typings.oracleOraclejet.ojnavigationlistMod

import typings.oracleOraclejet.anon.AccessibleReorderAfterItem
import typings.oracleOraclejet.anon.RendererSelectable
import typings.oracleOraclejet.mod.baseComponentSettableProperties
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
import scala.scalajs.js.annotation._

@js.native
trait ojTabBarSettableProperties[K, D] extends baseComponentSettableProperties {
  var as: String = js.native
  var currentItem: js.Any = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var display: all | icons = js.native
  var edge: top | bottom | start | end = js.native
  var item: RendererSelectable[K, D] = js.native
  var overflow: popup | hidden = js.native
  var reorderable: enabled | disabled = js.native
  var selection: js.Any = js.native
  @JSName("translations")
  var translations_ojTabBarSettableProperties: AccessibleReorderAfterItem = js.native
  var truncation: none | progressive = js.native
}

object ojTabBarSettableProperties {
  @scala.inline
  def apply[K, D](
    as: String,
    currentItem: js.Any,
    display: all | icons,
    edge: top | bottom | start | end,
    item: RendererSelectable[K, D],
    overflow: popup | hidden,
    reorderable: enabled | disabled,
    selection: js.Any,
    translations: AccessibleReorderAfterItem,
    truncation: none | progressive
  ): ojTabBarSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], reorderable = reorderable.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], truncation = truncation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTabBarSettableProperties[K, D]]
  }
  @scala.inline
  implicit class ojTabBarSettablePropertiesOps[Self <: ojTabBarSettableProperties[_, _], K, D] (val x: Self with (ojTabBarSettableProperties[K, D])) extends AnyVal {
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
    def setCurrentItem(value: js.Any): Self = this.set("currentItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay(value: all | icons): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdge(value: top | bottom | start | end): Self = this.set("edge", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: RendererSelectable[K, D]): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverflow(value: popup | hidden): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setReorderable(value: enabled | disabled): Self = this.set("reorderable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelection(value: js.Any): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: AccessibleReorderAfterItem): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def setTruncation(value: none | progressive): Self = this.set("truncation", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataNull: Self = this.set("data", null)
  }
  
}

