package typings.oracleOraclejet.ojsunburstMod

import typings.oracleOraclejet.anon.HoverColor
import typings.oracleOraclejet.anon.LabelColor
import typings.oracleOraclejet.anon.`16`
import typings.oracleOraclejet.anon.`17`
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

trait ojSunburstSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationDuration: Double
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var animationUpdateColor: String
  var as: String
  var colorLabel: String
  var data: (DataProvider[K, D]) | Null
  var displayLevels: Double
  var drilling: on | off
  var expanded: KeySet[K]
  var hiddenCategories: js.Array[String]
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var hoverBehaviorDelay: Double
  var nodeDefaults: HoverColor
  var rootNode: js.Any
  var rootNodeContent: `16`[K, D]
  var rotation: off | on
  var selection: js.Array[_]
  var selectionMode: none | single | multiple
  var sizeLabel: String
  var sorting: on | off
  var startAngle: Double
  var tooltip: `17`[K, D]
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojSunburstSettableProperties: LabelColor
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
    rootNodeContent: `16`[K, D],
    rotation: off | on,
    selection: js.Array[_],
    selectionMode: none | single | multiple,
    sizeLabel: String,
    sorting: on | off,
    startAngle: Double,
    tooltip: `17`[K, D],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: LabelColor,
    data: DataProvider[K, D] = null
  ): ojSunburstSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], animationUpdateColor = animationUpdateColor.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], colorLabel = colorLabel.asInstanceOf[js.Any], displayLevels = displayLevels.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], rootNode = rootNode.asInstanceOf[js.Any], rootNodeContent = rootNodeContent.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], sizeLabel = sizeLabel.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSunburstSettableProperties[K, D]]
  }
}

