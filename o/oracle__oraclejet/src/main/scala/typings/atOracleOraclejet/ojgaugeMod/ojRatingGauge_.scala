package typings.atOracleOraclejet.ojgaugeMod

import typings.atOracleOraclejet.Anon_BorderColorCircle
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_656598965
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetNumbers.`0DOT5`
import typings.atOracleOraclejet.atOracleOraclejetNumbers.`1`
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.changed
import typings.atOracleOraclejet.atOracleOraclejetStrings.changedChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.changedState
import typings.atOracleOraclejet.atOracleOraclejetStrings.changedStateChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.hoverState
import typings.atOracleOraclejet.atOracleOraclejetStrings.hoverStateChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.max
import typings.atOracleOraclejet.atOracleOraclejetStrings.maxChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.meet
import typings.atOracleOraclejet.atOracleOraclejetStrings.min
import typings.atOracleOraclejet.atOracleOraclejetStrings.minChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.orientation
import typings.atOracleOraclejet.atOracleOraclejetStrings.orientationChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.preserveAspectRatio
import typings.atOracleOraclejet.atOracleOraclejetStrings.preserveAspectRatioChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.readonlyChanged_
import typings.atOracleOraclejet.atOracleOraclejetStrings.readonly_
import typings.atOracleOraclejet.atOracleOraclejetStrings.selectedState
import typings.atOracleOraclejet.atOracleOraclejetStrings.selectedStateChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.step
import typings.atOracleOraclejet.atOracleOraclejetStrings.stepChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.thresholds
import typings.atOracleOraclejet.atOracleOraclejetStrings.thresholdsChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.tooltip
import typings.atOracleOraclejet.atOracleOraclejetStrings.tooltipChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.transientValueChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.unselectedState
import typings.atOracleOraclejet.atOracleOraclejetStrings.unselectedStateChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.value
import typings.atOracleOraclejet.atOracleOraclejetStrings.valueChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typings.atOracleOraclejet.atOracleOraclejetStrings.visualEffects
import typings.atOracleOraclejet.atOracleOraclejetStrings.visualEffectsChanged
import typings.atOracleOraclejet.ojgaugeMod.ojRatingGauge.Threshold
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojRatingGauge")
@js.native
trait ojRatingGauge_ extends dvtBaseGauge[ojRatingGaugeSettableProperties] {
  var changed: Boolean = js.native
  var changedState: Anon_BorderColorCircle = js.native
  var hoverState: Anon_BorderColorCircle = js.native
  var max: Double = js.native
  var min: Double = js.native
  var onChangedChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onChangedStateChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_BorderColorCircle], _]) | Null = js.native
  var onHoverStateChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_BorderColorCircle], _]) | Null = js.native
  var onMaxChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onMinChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onOrientationChanged: (js.Function1[/* event */ JetElementCustomEvent[vertical | horizontal], _]) | Null = js.native
  var onPreserveAspectRatioChanged: (js.Function1[/* event */ JetElementCustomEvent[none | meet], _]) | Null = js.native
  var onReadonlyChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onSelectedStateChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_BorderColorCircle], _]) | Null = js.native
  var onStepChanged: (js.Function1[/* event */ JetElementCustomEvent[`0DOT5` | `1`], _]) | Null = js.native
  var onThresholdsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Threshold]], _]) | Null = js.native
  var onTooltipChanged: (js.Function1[
    /* event */ JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_656598965], 
    _
  ]) | Null = js.native
  var onTransientValueChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onUnselectedStateChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_BorderColorCircle], _]) | Null = js.native
  var onValueChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onVisualEffectsChanged: (js.Function1[/* event */ JetElementCustomEvent[none | auto], _]) | Null = js.native
  var orientation: vertical | horizontal = js.native
  var preserveAspectRatio: none | meet = js.native
  var readonly: Boolean = js.native
  var selectedState: Anon_BorderColorCircle = js.native
  var step: `0DOT5` | `1` = js.native
  var thresholds: js.Array[Threshold] = js.native
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_656598965 = js.native
  val transientValue: Double | Null = js.native
  var unselectedState: Anon_BorderColorCircle = js.native
  var value: Double | Null = js.native
  var visualEffects: none | auto = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[vertical | horizontal], _]
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[vertical | horizontal], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: preserveAspectRatioChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | meet], _]
  ): Unit = js.native
  def addEventListener(
    `type`: preserveAspectRatioChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | meet], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: stepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`0DOT5` | `1`], _]
  ): Unit = js.native
  def addEventListener(
    `type`: stepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`0DOT5` | `1`], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedChanged(
    `type`: changedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedChanged(
    `type`: changedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedStateChanged(
    `type`: changedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_BorderColorCircle], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedStateChanged(
    `type`: changedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_BorderColorCircle], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverStateChanged(
    `type`: hoverStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_BorderColorCircle], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverStateChanged(
    `type`: hoverStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_BorderColorCircle], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedStateChanged(
    `type`: selectedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_BorderColorCircle], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedStateChanged(
    `type`: selectedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_BorderColorCircle], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(
    `type`: thresholdsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Threshold]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(
    `type`: thresholdsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Threshold]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_656598965], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_656598965], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unselectedStateChanged(
    `type`: unselectedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_BorderColorCircle], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unselectedStateChanged(
    `type`: unselectedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_BorderColorCircle], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_changed(property: changed): Boolean = js.native
  @JSName("getProperty")
  def getProperty_changedState(property: changedState): Anon_BorderColorCircle = js.native
  @JSName("getProperty")
  def getProperty_hoverState(property: hoverState): Anon_BorderColorCircle = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): Double = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): vertical | horizontal = js.native
  @JSName("getProperty")
  def getProperty_preserveAspectRatio(property: preserveAspectRatio): none | meet = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly_): Boolean = js.native
  @JSName("getProperty")
  def getProperty_selectedState(property: selectedState): Anon_BorderColorCircle = js.native
  @JSName("getProperty")
  def getProperty_step(property: step): `0DOT5` | `1` = js.native
  @JSName("getProperty")
  def getProperty_thresholds(property: thresholds): js.Array[Threshold] = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_656598965 = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: typings.atOracleOraclejet.atOracleOraclejetStrings.transientValue): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_unselectedState(property: unselectedState): Anon_BorderColorCircle = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
  def setProperties(properties: ojRatingGaugeSettablePropertiesLenient): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  def setProperty(property: preserveAspectRatio, value: meet): Unit = js.native
  def setProperty(property: preserveAspectRatio, value: none): Unit = js.native
  def setProperty(property: step, value: `0DOT5`): Unit = js.native
  def setProperty(property: step, value: `1`): Unit = js.native
  def setProperty(property: visualEffects, value: auto): Unit = js.native
  def setProperty(property: visualEffects, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_changed(property: changed, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_changedState(property: changedState, value: Anon_BorderColorCircle): Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverState(property: hoverState, value: Anon_BorderColorCircle): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectedState(property: selectedState, value: Anon_BorderColorCircle): Unit = js.native
  @JSName("setProperty")
  def setProperty_thresholds(property: thresholds, value: js.Array[Threshold]): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_656598965): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typings.atOracleOraclejet.atOracleOraclejetStrings.transientValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typings.atOracleOraclejet.atOracleOraclejetStrings.transientValue, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_unselectedState(property: unselectedState, value: Anon_BorderColorCircle): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
}

