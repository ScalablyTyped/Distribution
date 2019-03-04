package typings
package atOracleOraclejetLib.ojtagcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTagCloudSettableProperties[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var as: java.lang.String
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var hiddenCategories: js.Array[java.lang.String]
  var highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  var highlightedCategories: js.Array[java.lang.String]
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var layout: atOracleOraclejetLib.atOracleOraclejetLibStrings.cloud | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangular
  var selection: js.Array[K]
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var styleDefaults: atOracleOraclejetLib.Anon_AnimationDurationHoverBehaviorDelay
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K]
  var touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  @JSName("translations")
  var translations_ojTagCloudSettableProperties: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue
}

object ojTagCloudSettableProperties {
  @scala.inline
  def apply[K, D](
    animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    as: java.lang.String,
    hiddenCategories: js.Array[java.lang.String],
    highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all,
    highlightedCategories: js.Array[java.lang.String],
    hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    layout: atOracleOraclejetLib.atOracleOraclejetLibStrings.cloud | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangular,
    selection: js.Array[K],
    selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    styleDefaults: atOracleOraclejetLib.Anon_AnimationDurationHoverBehaviorDelay,
    tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K],
    touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue,
    data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null
  ): ojTagCloudSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as, hiddenCategories = hiddenCategories, highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories, hoverBehavior = hoverBehavior.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], selection = selection, selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults, tooltip = tooltip, touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ojTagCloudSettableProperties[K, D]]
  }
}

