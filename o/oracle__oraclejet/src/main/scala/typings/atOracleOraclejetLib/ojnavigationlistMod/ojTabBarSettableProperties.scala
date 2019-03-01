package typings
package atOracleOraclejetLib.ojnavigationlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTabBarSettableProperties[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var as: java.lang.String
  var currentItem: js.Any
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var display: atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
  var edge: atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end
  var item: atOracleOraclejetLib.Anon_ContextRendererSelectableBoolean[K, D]
  var overflow: atOracleOraclejetLib.atOracleOraclejetLibStrings.popup | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
  var reorderable: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  var selection: js.Any
  @JSName("translations")
  var translations_ojTabBarSettableProperties: atOracleOraclejetLib.Anon_AccessibleReorderAfterItem
  var truncation: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.progressive
}

object ojTabBarSettableProperties {
  @scala.inline
  def apply[K, D](
    as: java.lang.String,
    currentItem: js.Any,
    display: atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons,
    edge: atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end,
    item: atOracleOraclejetLib.Anon_ContextRendererSelectableBoolean[K, D],
    overflow: atOracleOraclejetLib.atOracleOraclejetLibStrings.popup | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden,
    reorderable: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled,
    selection: js.Any,
    translations: atOracleOraclejetLib.Anon_AccessibleReorderAfterItem,
    truncation: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.progressive,
    data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null
  ): ojTabBarSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("as")(as)
    __obj.updateDynamic("currentItem")(currentItem)
    __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    __obj.updateDynamic("reorderable")(reorderable.asInstanceOf[js.Any])
    __obj.updateDynamic("selection")(selection)
    __obj.updateDynamic("translations")(translations)
    __obj.updateDynamic("truncation")(truncation.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ojTabBarSettableProperties[K, D]]
  }
}

