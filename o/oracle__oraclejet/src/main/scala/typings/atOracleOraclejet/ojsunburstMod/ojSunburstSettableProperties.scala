package typings.atOracleOraclejet.ojsunburstMod

import typings.atOracleOraclejet.Anon_AutoBorderColorBorderWidth
import typings.atOracleOraclejet.Anon_ComponentNameLabelAndValueLabelClearSelectionLabelColor
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultD
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertD
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.any
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.dim
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
import typings.atOracleOraclejet.ojkeysetMod.KeySet
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
  var nodeDefaults: Anon_AutoBorderColorBorderWidth
  var rootNode: js.Any
  var rootNodeContent: Anon_ContextRendererAnonInsertD[K, D]
  var rotation: off | on
  var selection: js.Array[_]
  var selectionMode: none | single | multiple
  var sizeLabel: String
  var sorting: on | off
  var startAngle: Double
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultD[K, D]
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojSunburstSettableProperties: Anon_ComponentNameLabelAndValueLabelClearSelectionLabelColor
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
    nodeDefaults: Anon_AutoBorderColorBorderWidth,
    rootNode: js.Any,
    rootNodeContent: Anon_ContextRendererAnonInsertD[K, D],
    rotation: off | on,
    selection: js.Array[_],
    selectionMode: none | single | multiple,
    sizeLabel: String,
    sorting: on | off,
    startAngle: Double,
    tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultD[K, D],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: Anon_ComponentNameLabelAndValueLabelClearSelectionLabelColor,
    data: DataProvider[K, D] = null
  ): ojSunburstSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration, animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], animationUpdateColor = animationUpdateColor, as = as, colorLabel = colorLabel, displayLevels = displayLevels, drilling = drilling.asInstanceOf[js.Any], expanded = expanded, hiddenCategories = hiddenCategories, highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories, hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay, nodeDefaults = nodeDefaults, rootNode = rootNode, rootNodeContent = rootNodeContent, rotation = rotation.asInstanceOf[js.Any], selection = selection, selectionMode = selectionMode.asInstanceOf[js.Any], sizeLabel = sizeLabel, sorting = sorting.asInstanceOf[js.Any], startAngle = startAngle, tooltip = tooltip, touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ojSunburstSettableProperties[K, D]]
  }
}

