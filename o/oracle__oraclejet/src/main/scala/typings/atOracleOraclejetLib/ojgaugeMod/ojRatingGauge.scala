package typings
package atOracleOraclejetLib.ojgaugeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojRatingGauge extends dvtBaseGauge[ojRatingGaugeSettableProperties] {
  var changed: scala.Boolean = js.native
  var changedState: atOracleOraclejetLib.Anon_BorderColorCircle = js.native
  var hoverState: atOracleOraclejetLib.Anon_BorderColorCircle = js.native
  var max: scala.Double = js.native
  var min: scala.Double = js.native
  var onChangedChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['changed'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onChangedStateChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['changedState'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onHoverStateChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['hoverState'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onMaxChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['max'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onMinChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['min'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onOrientationChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['orientation'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onPreserveAspectRatioChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['preserveAspectRatio'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onReadonlyChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['readonly'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onSelectedStateChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['selectedState'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onStepChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['step'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onThresholdsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['thresholds'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onTooltipChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['tooltip'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onTransientValueChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['transientValue'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onUnselectedStateChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['unselectedState'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onValueChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['value'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onVisualEffectsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['visualEffects'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical | atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal = js.native
  var preserveAspectRatio: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.meet = js.native
  var readonly: scala.Boolean = js.native
  var selectedState: atOracleOraclejetLib.Anon_BorderColorCircle = js.native
  var step: atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0DOT5` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`1` = js.native
  var thresholds: js.Array[atOracleOraclejetLib.ojgaugeMod.ojRatingGaugeNs.Threshold] = js.native
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_718918166 = js.native
  val transientValue: scala.Double | scala.Null = js.native
  var unselectedState: atOracleOraclejetLib.Anon_BorderColorCircle = js.native
  var value: scala.Double | scala.Null = js.native
  var visualEffects: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.changedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['changed'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.changedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['changed'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.changedStateChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['changedState'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.changedStateChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['changedState'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverStateChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['hoverState'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverStateChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['hoverState'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['max'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['max'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['min'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['min'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientationChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['orientation'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientationChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['orientation'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.preserveAspectRatioChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['preserveAspectRatio'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.preserveAspectRatioChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['preserveAspectRatio'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonlyChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['readonly'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonlyChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['readonly'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectedStateChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['selectedState'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectedStateChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['selectedState'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.stepChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['step'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.stepChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['step'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.thresholdsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['thresholds'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.thresholdsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['thresholds'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['tooltip'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['tooltip'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['transientValue'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['transientValue'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.unselectedStateChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['unselectedState'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.unselectedStateChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['unselectedState'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['value'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['value'] */ js.Any
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
        /* import warning: ImportType.apply Failed type conversion: this['visualEffects'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.visualEffectsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['visualEffects'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_changed(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.changed): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_changedState(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.changedState): atOracleOraclejetLib.Anon_BorderColorCircle = js.native
  @JSName("getProperty")
  def getProperty_hoverState(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverState): atOracleOraclejetLib.Anon_BorderColorCircle = js.native
  @JSName("getProperty")
  def getProperty_max(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.max): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_min(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.min): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientation): atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical | atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal = js.native
  @JSName("getProperty")
  def getProperty_preserveAspectRatio(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.preserveAspectRatio): atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.meet = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonly): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_selectedState(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectedState): atOracleOraclejetLib.Anon_BorderColorCircle = js.native
  @JSName("getProperty")
  def getProperty_step(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.step): atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0DOT5` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`1` = js.native
  @JSName("getProperty")
  def getProperty_thresholds(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.thresholds): js.Array[atOracleOraclejetLib.ojgaugeMod.ojRatingGaugeNs.Threshold] = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltip): atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_718918166 = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValue): scala.Double | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_unselectedState(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.unselectedState): atOracleOraclejetLib.Anon_BorderColorCircle = js.native
  @JSName("getProperty")
  def getProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value): scala.Double | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.visualEffects): atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  def setProperties(properties: ojRatingGaugeSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientation,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientation,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.preserveAspectRatio,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.meet
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.preserveAspectRatio,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
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
  def setProperty_changed(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.changed, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_changedState(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.changedState,
    value: atOracleOraclejetLib.Anon_BorderColorCircle
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverState(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverState,
    value: atOracleOraclejetLib.Anon_BorderColorCircle
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.max, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.min, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonly, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selectedState(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectedState,
    value: atOracleOraclejetLib.Anon_BorderColorCircle
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_step(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.step,
    value: atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0DOT5`
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_step(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.step,
    value: atOracleOraclejetLib.atOracleOraclejetLibNumbers.`1`
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_thresholds(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.thresholds,
    value: js.Array[atOracleOraclejetLib.ojgaugeMod.ojRatingGaugeNs.Threshold]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltip,
    value: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_718918166
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValue): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValue, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_unselectedState(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.unselectedState,
    value: atOracleOraclejetLib.Anon_BorderColorCircle
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value, value: scala.Double): scala.Unit = js.native
}

