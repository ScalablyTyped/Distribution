package typings.oracleOraclejet.ojgaugeMod

import typings.oracleOraclejet.anon.Text
import typings.oracleOraclejet.anon.TextType
import typings.oracleOraclejet.anon.`8`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojgaugeMod.ojLedGauge.Threshold
import typings.oracleOraclejet.oracleOraclejetNumbers.`0`
import typings.oracleOraclejet.oracleOraclejetNumbers.`180`
import typings.oracleOraclejet.oracleOraclejetNumbers.`270`
import typings.oracleOraclejet.oracleOraclejetNumbers.`90`
import typings.oracleOraclejet.oracleOraclejetStrings.`type`
import typings.oracleOraclejet.oracleOraclejetStrings.arrow
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.borderColor
import typings.oracleOraclejet.oracleOraclejetStrings.borderColorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.color
import typings.oracleOraclejet.oracleOraclejetStrings.colorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.label
import typings.oracleOraclejet.oracleOraclejetStrings.labelChanged
import typings.oracleOraclejet.oracleOraclejetStrings.max
import typings.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typings.oracleOraclejet.oracleOraclejetStrings.metricLabel
import typings.oracleOraclejet.oracleOraclejetStrings.metricLabelChanged
import typings.oracleOraclejet.oracleOraclejetStrings.min
import typings.oracleOraclejet.oracleOraclejetStrings.minChanged
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.rectangle
import typings.oracleOraclejet.oracleOraclejetStrings.rotation
import typings.oracleOraclejet.oracleOraclejetStrings.rotationChanged
import typings.oracleOraclejet.oracleOraclejetStrings.size
import typings.oracleOraclejet.oracleOraclejetStrings.sizeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.svgClassName
import typings.oracleOraclejet.oracleOraclejetStrings.svgClassNameChanged
import typings.oracleOraclejet.oracleOraclejetStrings.svgStyle
import typings.oracleOraclejet.oracleOraclejetStrings.svgStyleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.thresholds
import typings.oracleOraclejet.oracleOraclejetStrings.thresholdsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.tooltip
import typings.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typings.oracleOraclejet.oracleOraclejetStrings.triangle
import typings.oracleOraclejet.oracleOraclejetStrings.typeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.value
import typings.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typings.oracleOraclejet.oracleOraclejetStrings.visualEffects
import typings.oracleOraclejet.oracleOraclejetStrings.visualEffectsChanged
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojLedGauge_ extends dvtBaseGauge[ojLedGaugeSettableProperties] {
  var borderColor: String = js.native
  var color: String = js.native
  var label: Text = js.native
  var max: Double = js.native
  var metricLabel: TextType = js.native
  var min: Double = js.native
  var onBorderColorChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onColorChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onLabelChanged: (js.Function1[/* event */ JetElementCustomEvent[Text], _]) | Null = js.native
  var onMaxChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onMetricLabelChanged: (js.Function1[/* event */ JetElementCustomEvent[TextType], _]) | Null = js.native
  var onMinChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onRotationChanged: (js.Function1[/* event */ JetElementCustomEvent[`90` | `180` | `270` | `0`], _]) | Null = js.native
  var onSizeChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onSvgClassNameChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onSvgStyleChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojLedGauge['svgStyle'] */ js.Any
    ], 
    _
  ]) | Null = js.native
  var onThresholdsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Threshold]], _]) | Null = js.native
  var onTooltipChanged: (js.Function1[/* event */ JetElementCustomEvent[`8`], _]) | Null = js.native
  var onTypeChanged: (js.Function1[
    /* event */ JetElementCustomEvent[arrow | diamond | square | rectangle | triangle | star | human | circle], 
    _
  ]) | Null = js.native
  var onValueChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onVisualEffectsChanged: (js.Function1[/* event */ JetElementCustomEvent[none | auto], _]) | Null = js.native
  var rotation: `90` | `180` | `270` | `0` = js.native
  var size: Double = js.native
  var svgClassName: String = js.native
  var svgStyle: js.Object = js.native
  var thresholds: js.Array[Threshold] = js.native
  var tooltip: `8` = js.native
  var `type`: arrow | diamond | square | rectangle | triangle | star | human | circle = js.native
  var value: Double | Null = js.native
  var visualEffects: none | auto = js.native
  def addEventListener(
    `type`: rotationChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[`90` | `180` | `270` | `0`], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: rotationChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[`90` | `180` | `270` | `0`], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojLedGauge['svgStyle'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojLedGauge['svgStyle'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[arrow | diamond | square | rectangle | triangle | star | human | circle], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[arrow | diamond | square | rectangle | triangle | star | human | circle], 
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
  def addEventListener_labelChanged(
    `type`: labelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Text], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: labelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Text], _],
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[TextType], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_metricLabelChanged(
    `type`: metricLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[TextType], _],
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
  def addEventListener_sizeChanged(
    `type`: sizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizeChanged(
    `type`: sizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`8`], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`8`], _],
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
  def getProperty_borderColor(property: borderColor): String = js.native
  @JSName("getProperty")
  def getProperty_color(property: color): String = js.native
  @JSName("getProperty")
  def getProperty_label(property: label): Text = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double = js.native
  @JSName("getProperty")
  def getProperty_metricLabel(property: metricLabel): TextType = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): Double = js.native
  @JSName("getProperty")
  def getProperty_rotation(property: rotation): `90` | `180` | `270` | `0` = js.native
  @JSName("getProperty")
  def getProperty_size(property: size): Double = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: svgClassName): String = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: svgStyle): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojLedGauge['svgStyle'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_thresholds(property: thresholds): js.Array[Threshold] = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `8` = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): arrow | diamond | square | rectangle | triangle | star | human | circle = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
  def setProperties(properties: ojLedGaugeSettablePropertiesLenient): Unit = js.native
  def setProperty(property: `type`, value: arrow): Unit = js.native
  def setProperty(property: `type`, value: circle): Unit = js.native
  def setProperty(property: `type`, value: diamond): Unit = js.native
  def setProperty(property: `type`, value: human): Unit = js.native
  def setProperty(property: `type`, value: rectangle): Unit = js.native
  def setProperty(property: `type`, value: square): Unit = js.native
  def setProperty(property: `type`, value: star): Unit = js.native
  def setProperty(property: `type`, value: triangle): Unit = js.native
  def setProperty(property: rotation, value: `0`): Unit = js.native
  def setProperty(property: rotation, value: `180`): Unit = js.native
  def setProperty(property: rotation, value: `270`): Unit = js.native
  def setProperty(property: rotation, value: `90`): Unit = js.native
  def setProperty(property: visualEffects, value: auto): Unit = js.native
  def setProperty(property: visualEffects, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderColor(property: borderColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: color, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_label(property: label, value: Text): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_metricLabel(property: metricLabel, value: TextType): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_size(property: size, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_thresholds(property: thresholds, value: js.Array[Threshold]): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `8`): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
}

