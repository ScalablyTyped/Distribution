package typings.oracleOraclejet.ojsunburstMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.Anon16
import typings.oracleOraclejet.Anon17
import typings.oracleOraclejet.AnonHoverColor
import typings.oracleOraclejet.AnonLabelColor
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojkeysetMod.KeySet
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojsunburst.ojSunburstSettableProperties<K, D>> */
trait ojSunburstSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationOnDataChange: js.UndefOr[auto | none] = js.undefined
  var animationOnDisplay: js.UndefOr[auto | none] = js.undefined
  var animationUpdateColor: js.UndefOr[String] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var colorLabel: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[DataProvider[K, D]] = js.undefined
  var displayLevels: js.UndefOr[Double] = js.undefined
  var drilling: js.UndefOr[on | off] = js.undefined
  var expanded: js.UndefOr[KeySet[K]] = js.undefined
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.undefined
  var highlightMatch: js.UndefOr[any | all] = js.undefined
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.undefined
  var hoverBehavior: js.UndefOr[dim | none] = js.undefined
  var hoverBehaviorDelay: js.UndefOr[Double] = js.undefined
  var nodeDefaults: js.UndefOr[AnonHoverColor] = js.undefined
  var rootNode: js.UndefOr[js.Any] = js.undefined
  var rootNodeContent: js.UndefOr[Anon16[K, D]] = js.undefined
  var rotation: js.UndefOr[off | on] = js.undefined
  var selection: js.UndefOr[js.Array[_]] = js.undefined
  var selectionMode: js.UndefOr[none | single | multiple] = js.undefined
  var sizeLabel: js.UndefOr[String] = js.undefined
  var sorting: js.UndefOr[on | off] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[Anon17[K, D]] = js.undefined
  var touchResponse: js.UndefOr[touchStart | auto] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[AnonLabelColor] = js.undefined
}

object ojSunburstSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animationDuration: Int | Double = null,
    animationOnDataChange: auto | none = null,
    animationOnDisplay: auto | none = null,
    animationUpdateColor: String = null,
    as: String = null,
    colorLabel: String = null,
    data: DataProvider[K, D] = null,
    displayLevels: Int | Double = null,
    drilling: on | off = null,
    expanded: KeySet[K] = null,
    hiddenCategories: js.Array[String] = null,
    highlightMatch: any | all = null,
    highlightedCategories: js.Array[String] = null,
    hoverBehavior: dim | none = null,
    hoverBehaviorDelay: Int | Double = null,
    nodeDefaults: AnonHoverColor = null,
    rootNode: js.Any = null,
    rootNodeContent: Anon16[K, D] = null,
    rotation: off | on = null,
    selection: js.Array[_] = null,
    selectionMode: none | single | multiple = null,
    sizeLabel: String = null,
    sorting: on | off = null,
    startAngle: Int | Double = null,
    tooltip: Anon17[K, D] = null,
    touchResponse: touchStart | auto = null,
    trackResize: on | off = null,
    translations: AnonLabelColor = null
  ): ojSunburstSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationOnDataChange != null) __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    if (animationOnDisplay != null) __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    if (animationUpdateColor != null) __obj.updateDynamic("animationUpdateColor")(animationUpdateColor.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (colorLabel != null) __obj.updateDynamic("colorLabel")(colorLabel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (displayLevels != null) __obj.updateDynamic("displayLevels")(displayLevels.asInstanceOf[js.Any])
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (hiddenCategories != null) __obj.updateDynamic("hiddenCategories")(hiddenCategories.asInstanceOf[js.Any])
    if (highlightMatch != null) __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    if (highlightedCategories != null) __obj.updateDynamic("highlightedCategories")(highlightedCategories.asInstanceOf[js.Any])
    if (hoverBehavior != null) __obj.updateDynamic("hoverBehavior")(hoverBehavior.asInstanceOf[js.Any])
    if (hoverBehaviorDelay != null) __obj.updateDynamic("hoverBehaviorDelay")(hoverBehaviorDelay.asInstanceOf[js.Any])
    if (nodeDefaults != null) __obj.updateDynamic("nodeDefaults")(nodeDefaults.asInstanceOf[js.Any])
    if (rootNode != null) __obj.updateDynamic("rootNode")(rootNode.asInstanceOf[js.Any])
    if (rootNodeContent != null) __obj.updateDynamic("rootNodeContent")(rootNodeContent.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (sizeLabel != null) __obj.updateDynamic("sizeLabel")(sizeLabel.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (touchResponse != null) __obj.updateDynamic("touchResponse")(touchResponse.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSunburstSettablePropertiesLenient[K, D]]
  }
}

