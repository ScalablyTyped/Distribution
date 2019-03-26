package typings
package atOracleOraclejetLib.ojgaugeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojLedGauge extends dvtBaseGauge[ojLedGaugeSettableProperties] {
  var borderColor: java.lang.String = js.native
  var color: java.lang.String = js.native
  var label: atOracleOraclejetLib.Anon_Style = js.native
  var max: scala.Double = js.native
  var metricLabel: atOracleOraclejetLib.Anon_AutoBillionConverterMillionNone = js.native
  var min: scala.Double = js.native
  var onBorderColorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onColorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onLabelChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Style], 
    _
  ]) | scala.Null = js.native
  var onMaxChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  var onMetricLabelChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoBillionConverterMillionNone], 
    _
  ]) | scala.Null = js.native
  var onMinChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  var onRotationChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibNumbers.`90` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`180` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`270` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0`
    ], 
    _
  ]) | scala.Null = js.native
  var onSizeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  var onSvgClassNameChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onSvgStyleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing], 
    _
  ]) | scala.Null = js.native
  var onThresholdsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojgaugeMod.ojLedGaugeNs.Threshold]], 
    _
  ]) | scala.Null = js.native
  var onTooltipChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext
    ], 
    _
  ]) | scala.Null = js.native
  var onTypeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
    ], 
    _
  ]) | scala.Null = js.native
  var onValueChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onVisualEffectsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ], 
    _
  ]) | scala.Null = js.native
  var rotation: atOracleOraclejetLib.atOracleOraclejetLibNumbers.`90` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`180` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`270` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0` = js.native
  var size: scala.Double = js.native
  var svgClassName: java.lang.String = js.native
  var svgStyle: js.Object = js.native
  var thresholds: js.Array[atOracleOraclejetLib.ojgaugeMod.ojLedGaugeNs.Threshold] = js.native
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext = js.native
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle = js.native
  var value: scala.Double | scala.Null = js.native
  var visualEffects: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.typeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.typeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.visualEffectsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.visualEffectsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderColorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderColorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.colorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.colorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Style], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Style], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_metricLabelChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.metricLabelChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoBillionConverterMillionNone], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_metricLabelChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.metricLabelChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoBillionConverterMillionNone], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rotationChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rotationChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibNumbers.`90` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`180` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`270` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0`
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rotationChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rotationChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibNumbers.`90` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`180` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`270` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0`
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.sizeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.sizeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassNameChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassNameChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgStyleChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgStyleChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.thresholdsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojgaugeMod.ojLedGaugeNs.Threshold]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.thresholdsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojgaugeMod.ojLedGaugeNs.Threshold]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getMetricLabel(): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_borderColor(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderColor): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_color(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.color): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_label(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.label): atOracleOraclejetLib.Anon_Style = js.native
  @JSName("getProperty")
  def getProperty_max(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.max): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_metricLabel(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.metricLabel): atOracleOraclejetLib.Anon_AutoBillionConverterMillionNone = js.native
  @JSName("getProperty")
  def getProperty_min(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.min): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_rotation(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rotation): atOracleOraclejetLib.atOracleOraclejetLibNumbers.`90` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`180` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`270` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0` = js.native
  @JSName("getProperty")
  def getProperty_size(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.size): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassName): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyle): scala.Nothing = js.native
  @JSName("getProperty")
  def getProperty_thresholds(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.thresholds): js.Array[atOracleOraclejetLib.ojgaugeMod.ojLedGaugeNs.Threshold] = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltip): atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext = js.native
  @JSName("getProperty")
  def getProperty_type(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`): atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle = js.native
  @JSName("getProperty")
  def getProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value): scala.Double | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.visualEffects): atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  def setProperties(properties: ojLedGaugeSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.human
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.square
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.star
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.triangle
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.visualEffects,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.visualEffects,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_borderColor(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderColor, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.color, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_label(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.label,
    value: atOracleOraclejetLib.Anon_Style
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.max, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_metricLabel(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.metricLabel,
    value: atOracleOraclejetLib.Anon_AutoBillionConverterMillionNone
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.min, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rotation(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rotation,
    value: atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0`
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rotation(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rotation,
    value: atOracleOraclejetLib.atOracleOraclejetLibNumbers.`180`
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rotation(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rotation,
    value: atOracleOraclejetLib.atOracleOraclejetLibNumbers.`270`
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rotation(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rotation,
    value: atOracleOraclejetLib.atOracleOraclejetLibNumbers.`90`
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_size(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.size, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassName, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyle, value: js.Object): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_thresholds(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.thresholds,
    value: js.Array[atOracleOraclejetLib.ojgaugeMod.ojLedGaugeNs.Threshold]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltip,
    value: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value, value: scala.Double): scala.Unit = js.native
}

