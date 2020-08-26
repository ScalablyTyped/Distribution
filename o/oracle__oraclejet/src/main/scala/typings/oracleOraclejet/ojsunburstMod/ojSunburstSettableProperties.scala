package typings.oracleOraclejet.ojsunburstMod

import typings.oracleOraclejet.anon.HoverColor
import typings.oracleOraclejet.anon.LabelColor
import typings.oracleOraclejet.anon.`18`
import typings.oracleOraclejet.anon.`19`
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
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

@js.native
trait ojSunburstSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationDuration: Double = js.native
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var animationUpdateColor: String = js.native
  var as: String = js.native
  var colorLabel: String = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var displayLevels: Double = js.native
  var drilling: on | off = js.native
  var expanded: KeySet[K] = js.native
  var hiddenCategories: js.Array[String] = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var hoverBehaviorDelay: Double = js.native
  var nodeDefaults: HoverColor = js.native
  var rootNode: js.Any = js.native
  var rootNodeContent: `18`[K, D] = js.native
  var rotation: off | on = js.native
  var selection: js.Array[_] = js.native
  var selectionMode: none | single | multiple = js.native
  var sizeLabel: String = js.native
  var sorting: on | off = js.native
  var startAngle: Double = js.native
  var tooltip: `19`[K, D] = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojSunburstSettableProperties: LabelColor = js.native
}

object ojSunburstSettableProperties {
  @scala.inline
  def apply[K, D](
    animationDuration: Double,
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    animationUpdateColor: String,
    as: String,
    colorLabel: String,
    displayLevels: Double,
    drilling: on | off,
    expanded: KeySet[K],
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    hoverBehaviorDelay: Double,
    nodeDefaults: HoverColor,
    rootNode: js.Any,
    rootNodeContent: `18`[K, D],
    rotation: off | on,
    selection: js.Array[_],
    selectionMode: none | single | multiple,
    sizeLabel: String,
    sorting: on | off,
    startAngle: Double,
    tooltip: `19`[K, D],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: LabelColor
  ): ojSunburstSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], animationUpdateColor = animationUpdateColor.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], colorLabel = colorLabel.asInstanceOf[js.Any], displayLevels = displayLevels.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], rootNode = rootNode.asInstanceOf[js.Any], rootNodeContent = rootNodeContent.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], sizeLabel = sizeLabel.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSunburstSettableProperties[K, D]]
  }
  @scala.inline
  implicit class ojSunburstSettablePropertiesOps[Self <: ojSunburstSettableProperties[_, _], K, D] (val x: Self with (ojSunburstSettableProperties[K, D])) extends AnyVal {
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOnDataChange(value: auto | none): Self = this.set("animationOnDataChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = this.set("animationOnDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationUpdateColor(value: String): Self = this.set("animationUpdateColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorLabel(value: String): Self = this.set("colorLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayLevels(value: Double): Self = this.set("displayLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrilling(value: on | off): Self = this.set("drilling", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpanded(value: KeySet[K]): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setHiddenCategoriesVarargs(value: String*): Self = this.set("hiddenCategories", js.Array(value :_*))
    @scala.inline
    def setHiddenCategories(value: js.Array[String]): Self = this.set("hiddenCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightMatch(value: any | all): Self = this.set("highlightMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedCategoriesVarargs(value: String*): Self = this.set("highlightedCategories", js.Array(value :_*))
    @scala.inline
    def setHighlightedCategories(value: js.Array[String]): Self = this.set("highlightedCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverBehavior(value: dim | none): Self = this.set("hoverBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverBehaviorDelay(value: Double): Self = this.set("hoverBehaviorDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeDefaults(value: HoverColor): Self = this.set("nodeDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootNode(value: js.Any): Self = this.set("rootNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootNodeContent(value: `18`[K, D]): Self = this.set("rootNodeContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: off | on): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionVarargs(value: js.Any*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[_]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionMode(value: none | single | multiple): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeLabel(value: String): Self = this.set("sizeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSorting(value: on | off): Self = this.set("sorting", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: `19`[K, D]): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchResponse(value: touchStart | auto): Self = this.set("touchResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: LabelColor): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataNull: Self = this.set("data", null)
  }
  
}

