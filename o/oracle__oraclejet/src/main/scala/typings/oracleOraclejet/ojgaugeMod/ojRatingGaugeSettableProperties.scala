package typings.oracleOraclejet.ojgaugeMod

import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.anon.Source
import typings.oracleOraclejet.anon.`9`
import typings.oracleOraclejet.ojgaugeMod.ojRatingGauge.Threshold
import typings.oracleOraclejet.oracleOraclejetNumbers.`0.5`
import typings.oracleOraclejet.oracleOraclejetNumbers.`1`
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.meet
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojRatingGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  var changed: Boolean
  var changedState: Source
  var hoverState: Source
  var max: Double
  var min: Double
  var orientation: vertical | horizontal
  var preserveAspectRatio: none | meet
  var readonly: Boolean
  var selectedState: Source
  var step: `0.5` | `1`
  var thresholds: js.Array[Threshold]
  var tooltip: `9`
  val transientValue: Double | Null
  var unselectedState: Source
  var value: Double | Null
  var visualEffects: none | auto
}

object ojRatingGaugeSettableProperties {
  @scala.inline
  def apply(
    changed: Boolean,
    changedState: Source,
    hoverState: Source,
    max: Double,
    min: Double,
    orientation: vertical | horizontal,
    preserveAspectRatio: none | meet,
    readonly: Boolean,
    selectedState: Source,
    step: `0.5` | `1`,
    thresholds: js.Array[Threshold],
    tooltip: `9`,
    trackResize: on | off,
    translations: LabelAndValue,
    unselectedState: Source,
    visualEffects: none | auto,
    transientValue: Double = null.asInstanceOf[Double],
    value: Double = null.asInstanceOf[Double]
  ): ojRatingGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], changedState = changedState.asInstanceOf[js.Any], hoverState = hoverState.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], selectedState = selectedState.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], unselectedState = unselectedState.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any], transientValue = transientValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRatingGaugeSettableProperties]
  }
}

