package typings.oracleOraclejet.ojgaugeMod

import typings.oracleOraclejet.AnonAutoBillionCenter
import typings.oracleOraclejet.AnonAutoBorderColor
import typings.oracleOraclejet.AnonAutoCenter
import typings.oracleOraclejet.AnonContextRendererAnonInsertAnonPreventDefaultCenterContext
import typings.oracleOraclejet.AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext848864392
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.ReferenceLine
import typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.Threshold
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.angleExtent
import typings.oracleOraclejet.oracleOraclejetStrings.angleExtentChanged
import typings.oracleOraclejet.oracleOraclejetStrings.animationDuration
import typings.oracleOraclejet.oracleOraclejetStrings.animationDurationChanged
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.borderColor
import typings.oracleOraclejet.oracleOraclejetStrings.borderColorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.borderRadius
import typings.oracleOraclejet.oracleOraclejetStrings.borderRadiusChanged
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.centerChanged
import typings.oracleOraclejet.oracleOraclejetStrings.circular
import typings.oracleOraclejet.oracleOraclejetStrings.color
import typings.oracleOraclejet.oracleOraclejetStrings.colorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.currentOnly
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.indicatorSize
import typings.oracleOraclejet.oracleOraclejetStrings.indicatorSizeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.innerRadius
import typings.oracleOraclejet.oracleOraclejetStrings.innerRadiusChanged
import typings.oracleOraclejet.oracleOraclejetStrings.label
import typings.oracleOraclejet.oracleOraclejetStrings.labelChanged
import typings.oracleOraclejet.oracleOraclejetStrings.max
import typings.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typings.oracleOraclejet.oracleOraclejetStrings.metricLabel
import typings.oracleOraclejet.oracleOraclejetStrings.metricLabelChanged
import typings.oracleOraclejet.oracleOraclejetStrings.min
import typings.oracleOraclejet.oracleOraclejetStrings.minChanged
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.onIndicator
import typings.oracleOraclejet.oracleOraclejetStrings.orientation
import typings.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typings.oracleOraclejet.oracleOraclejetStrings.plotArea
import typings.oracleOraclejet.oracleOraclejetStrings.plotAreaChanged
import typings.oracleOraclejet.oracleOraclejetStrings.readonlyChanged_
import typings.oracleOraclejet.oracleOraclejetStrings.readonly_
import typings.oracleOraclejet.oracleOraclejetStrings.referenceLines
import typings.oracleOraclejet.oracleOraclejetStrings.referenceLinesChanged
import typings.oracleOraclejet.oracleOraclejetStrings.startAngle
import typings.oracleOraclejet.oracleOraclejetStrings.startAngleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.step
import typings.oracleOraclejet.oracleOraclejetStrings.stepChanged
import typings.oracleOraclejet.oracleOraclejetStrings.svgClassName
import typings.oracleOraclejet.oracleOraclejetStrings.svgClassNameChanged
import typings.oracleOraclejet.oracleOraclejetStrings.svgStyle
import typings.oracleOraclejet.oracleOraclejetStrings.svgStyleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.thresholdDisplay
import typings.oracleOraclejet.oracleOraclejetStrings.thresholdDisplayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.thresholds
import typings.oracleOraclejet.oracleOraclejetStrings.thresholdsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.tooltip
import typings.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typings.oracleOraclejet.oracleOraclejetStrings.transientValueChanged
import typings.oracleOraclejet.oracleOraclejetStrings.value
import typings.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import typings.oracleOraclejet.oracleOraclejetStrings.visualEffects
import typings.oracleOraclejet.oracleOraclejetStrings.visualEffectsChanged
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojStatusMeterGauge_ extends dvtBaseGauge[ojStatusMeterGaugeSettableProperties] {
  var angleExtent: Double = js.native
  var animationDuration: js.UndefOr[Double] = js.native
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var borderColor: String = js.native
  var borderRadius: String = js.native
  var center: AnonContextRendererAnonInsertAnonPreventDefaultCenterContext = js.native
  var color: String = js.native
  var indicatorSize: Double = js.native
  var innerRadius: Double = js.native
  var label: AnonAutoCenter = js.native
  var max: Double = js.native
  var metricLabel: AnonAutoBillionCenter = js.native
  var min: Double = js.native
  var onAngleExtentChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onAnimationDurationChanged: (js.Function1[/* event */ JetElementCustomEvent[js.UndefOr[Double]], _]) | Null = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var onBorderColorChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onBorderRadiusChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onCenterChanged: (js.Function1[
    /* event */ JetElementCustomEvent[AnonContextRendererAnonInsertAnonPreventDefaultCenterContext], 
    _
  ]) | Null = js.native
  var onColorChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onIndicatorSizeChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onInnerRadiusChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onLabelChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonAutoCenter], _]) | Null = js.native
  var onMaxChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onMetricLabelChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonAutoBillionCenter], _]) | Null = js.native
  var onMinChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onOrientationChanged: (js.Function1[/* event */ JetElementCustomEvent[circular | vertical | horizontal], _]) | Null = js.native
  var onPlotAreaChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonAutoBorderColor], _]) | Null = js.native
  var onReadonlyChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onReferenceLinesChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[ReferenceLine]], _]) | Null = js.native
  var onStartAngleChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onStepChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onSvgClassNameChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onSvgStyleChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGauge['svgStyle'] */ js.Any
    ], 
    _
  ]) | Null = js.native
  var onThresholdDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[currentOnly | all | onIndicator], _]) | Null = js.native
  var onThresholdsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Threshold]], _]) | Null = js.native
  var onTooltipChanged: (js.Function1[
    /* event */ JetElementCustomEvent[AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext848864392], 
    _
  ]) | Null = js.native
  var onTransientValueChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onValueChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onVisualEffectsChanged: (js.Function1[/* event */ JetElementCustomEvent[none | auto], _]) | Null = js.native
  var orientation: circular | vertical | horizontal = js.native
  var plotArea: AnonAutoBorderColor = js.native
  var readonly: Boolean = js.native
  var referenceLines: js.Array[ReferenceLine] = js.native
  var startAngle: Double = js.native
  var step: Double | Null = js.native
  var svgClassName: String = js.native
  var svgStyle: js.Object = js.native
  var thresholdDisplay: currentOnly | all | onIndicator = js.native
  var thresholds: js.Array[Threshold] = js.native
  var tooltip: AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext848864392 = js.native
  val transientValue: Double | Null = js.native
  var value: Double | Null = js.native
  var visualEffects: none | auto = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[circular | vertical | horizontal], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[circular | vertical | horizontal], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGauge['svgStyle'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGauge['svgStyle'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: thresholdDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[currentOnly | all | onIndicator], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: thresholdDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[currentOnly | all | onIndicator], 
      _
    ],
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
  def addEventListener_angleExtentChanged(
    `type`: angleExtentChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_angleExtentChanged(
    `type`: angleExtentChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.UndefOr[Double]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.UndefOr[Double]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(
    `type`: borderColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(
    `type`: borderColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderRadiusChanged(
    `type`: borderRadiusChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderRadiusChanged(
    `type`: borderRadiusChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_centerChanged(
    `type`: centerChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[AnonContextRendererAnonInsertAnonPreventDefaultCenterContext], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_centerChanged(
    `type`: centerChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[AnonContextRendererAnonInsertAnonPreventDefaultCenterContext], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_indicatorSizeChanged(
    `type`: indicatorSizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_indicatorSizeChanged(
    `type`: indicatorSizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_innerRadiusChanged(
    `type`: innerRadiusChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_innerRadiusChanged(
    `type`: innerRadiusChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: labelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAutoCenter], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: labelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAutoCenter], _],
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
  def addEventListener_metricLabelChanged(
    `type`: metricLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAutoBillionCenter], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_metricLabelChanged(
    `type`: metricLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAutoBillionCenter], _],
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
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAutoBorderColor], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_plotAreaChanged(
    `type`: plotAreaChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAutoBorderColor], _],
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
  def addEventListener_referenceLinesChanged(
    `type`: referenceLinesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[ReferenceLine]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceLinesChanged(
    `type`: referenceLinesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[ReferenceLine]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startAngleChanged(
    `type`: startAngleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startAngleChanged(
    `type`: startAngleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepChanged(
    `type`: stepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepChanged(
    `type`: stepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
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
      /* ev */ JetElementCustomEvent[AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext848864392], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext848864392], 
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
  def getMetricLabel(): String = js.native
  @JSName("getProperty")
  def getProperty_angleExtent(property: angleExtent): Double = js.native
  @JSName("getProperty")
  def getProperty_animationDuration(property: animationDuration): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_borderColor(property: borderColor): String = js.native
  @JSName("getProperty")
  def getProperty_borderRadius(property: borderRadius): String = js.native
  @JSName("getProperty")
  def getProperty_center(property: center): AnonContextRendererAnonInsertAnonPreventDefaultCenterContext = js.native
  @JSName("getProperty")
  def getProperty_color(property: color): String = js.native
  @JSName("getProperty")
  def getProperty_indicatorSize(property: indicatorSize): Double = js.native
  @JSName("getProperty")
  def getProperty_innerRadius(property: innerRadius): Double = js.native
  @JSName("getProperty")
  def getProperty_label(property: label): AnonAutoCenter = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double = js.native
  @JSName("getProperty")
  def getProperty_metricLabel(property: metricLabel): AnonAutoBillionCenter = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): Double = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): circular | vertical | horizontal = js.native
  @JSName("getProperty")
  def getProperty_plotArea(property: plotArea): AnonAutoBorderColor = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly_): Boolean = js.native
  @JSName("getProperty")
  def getProperty_referenceLines(property: referenceLines): js.Array[ReferenceLine] = js.native
  @JSName("getProperty")
  def getProperty_startAngle(property: startAngle): Double = js.native
  @JSName("getProperty")
  def getProperty_step(property: step): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: svgClassName): String = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: svgStyle): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGauge['svgStyle'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_thresholdDisplay(property: thresholdDisplay): currentOnly | all | onIndicator = js.native
  @JSName("getProperty")
  def getProperty_thresholds(property: thresholds): js.Array[Threshold] = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext848864392 = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: typings.oracleOraclejet.oracleOraclejetStrings.transientValue): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
  def setProperties(properties: ojStatusMeterGaugeSettablePropertiesLenient): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: orientation, value: circular): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  def setProperty(property: thresholdDisplay, value: all): Unit = js.native
  def setProperty(property: thresholdDisplay, value: currentOnly): Unit = js.native
  def setProperty(property: thresholdDisplay, value: onIndicator): Unit = js.native
  def setProperty(property: visualEffects, value: auto): Unit = js.native
  def setProperty(property: visualEffects, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_angleExtent(property: angleExtent, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderColor(property: borderColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderRadius(property: borderRadius, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_center(property: center, value: AnonContextRendererAnonInsertAnonPreventDefaultCenterContext): Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: color, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_indicatorSize(property: indicatorSize, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_innerRadius(property: innerRadius, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_label(property: label, value: AnonAutoCenter): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_metricLabel(property: metricLabel, value: AnonAutoBillionCenter): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_plotArea(property: plotArea, value: AnonAutoBorderColor): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_referenceLines(property: referenceLines, value: js.Array[ReferenceLine]): Unit = js.native
  @JSName("setProperty")
  def setProperty_startAngle(property: startAngle, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: step): Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: step, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_thresholds(property: thresholds, value: js.Array[Threshold]): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext848864392): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typings.oracleOraclejet.oracleOraclejetStrings.transientValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typings.oracleOraclejet.oracleOraclejetStrings.transientValue, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
}

