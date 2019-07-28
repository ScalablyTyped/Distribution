package typings.atOracleOraclejet.ojnavigationlistMod

import typings.atOracleOraclejet.Anon_AccessibleReorderAfterItem
import typings.atOracleOraclejet.Anon_ContextRendererSelectableBoolean
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.enabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.hidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.icons
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.popup
import typings.atOracleOraclejet.atOracleOraclejetStrings.progressive
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTabBarSettableProperties[K, D] extends baseComponentSettableProperties {
  var as: String
  var currentItem: js.Any
  var data: (DataProvider[K, D]) | Null
  var display: all | icons
  var edge: top | bottom | start | end
  var item: Anon_ContextRendererSelectableBoolean[K, D]
  var overflow: popup | hidden
  var reorderable: enabled | disabled
  var selection: js.Any
  @JSName("translations")
  var translations_ojTabBarSettableProperties: Anon_AccessibleReorderAfterItem
  var truncation: none | progressive
}

object ojTabBarSettableProperties {
  @scala.inline
  def apply[K, D](
    as: String,
    currentItem: js.Any,
    display: all | icons,
    edge: top | bottom | start | end,
    item: Anon_ContextRendererSelectableBoolean[K, D],
    overflow: popup | hidden,
    reorderable: enabled | disabled,
    selection: js.Any,
    translations: Anon_AccessibleReorderAfterItem,
    truncation: none | progressive,
    data: DataProvider[K, D] = null
  ): ojTabBarSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as, currentItem = currentItem, display = display.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], item = item, overflow = overflow.asInstanceOf[js.Any], reorderable = reorderable.asInstanceOf[js.Any], selection = selection, translations = translations, truncation = truncation.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ojTabBarSettableProperties[K, D]]
  }
}

