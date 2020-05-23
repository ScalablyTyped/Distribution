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

trait ojTabBarSettableProperties[K, D] extends baseComponentSettableProperties {
  var as: String
  var currentItem: js.Any
  var data: (DataProvider[K, D]) | Null
  var display: all | icons
  var edge: top | bottom | start | end
  var item: RendererSelectable[K, D]
  var overflow: popup | hidden
  var reorderable: enabled | disabled
  var selection: js.Any
  @JSName("translations")
  var translations_ojTabBarSettableProperties: AccessibleReorderAfterItem
  var truncation: none | progressive
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
    truncation: none | progressive,
    data: DataProvider[K, D] = null
  ): ojTabBarSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], reorderable = reorderable.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], truncation = truncation.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTabBarSettableProperties[K, D]]
  }
}

