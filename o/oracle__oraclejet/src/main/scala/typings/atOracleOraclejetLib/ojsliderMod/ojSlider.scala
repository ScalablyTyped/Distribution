package typings
package atOracleOraclejetLib.ojsliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSlider
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValue[
      scala.Double | scala.Null, 
      ojSliderSettableProperties, 
      scala.Double | scala.Null, 
      scala.Double | scala.Null
    ] {
  var max: scala.Double | scala.Null = js.native
  var min: scala.Double | scala.Null = js.native
  var onMaxChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onMinChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null], 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSlider: (js.Function1[/* event */ atOracleOraclejetLib.ojsliderMod.ojSliderNs.ojAnimateEnd, _]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSlider: (js.Function1[/* event */ atOracleOraclejetLib.ojsliderMod.ojSliderNs.ojAnimateStart, _]) | scala.Null = js.native
  var onOrientationChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
    ], 
    _
  ]) | scala.Null = js.native
  var onStepChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onTransientValueChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  var onTypeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMin | atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMax | atOracleOraclejetLib.atOracleOraclejetLibStrings.single
    ], 
    _
  ]) | scala.Null = js.native
  var orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical = js.native
  var step: scala.Double | scala.Null = js.native
  val transientValue: scala.Double = js.native
  @JSName("translations")
  var translations_ojSlider: atOracleOraclejetLib.Anon_InvalidStep = js.native
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMin | atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMax | atOracleOraclejetLib.atOracleOraclejetLibStrings.single = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientationChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientationChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.typeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMin | atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMax | atOracleOraclejetLib.atOracleOraclejetLibStrings.single
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.typeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMin | atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMax | atOracleOraclejetLib.atOracleOraclejetLibStrings.single
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.stepChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.stepChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_max(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.max): scala.Double | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_min(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.min): scala.Double | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientation): atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical = js.native
  @JSName("getProperty")
  def getProperty_step(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.step): scala.Double | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValue): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_type(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`): atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMin | atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMax | atOracleOraclejetLib.atOracleOraclejetLibStrings.single = js.native
  def setProperties(properties: ojSliderSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMax
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMin
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.`type`,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.single
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientation,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.orientation,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.max): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.max, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.min): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.min, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.step): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.step, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValue, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_InvalidStep
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value, value: scala.Double): scala.Unit = js.native
}

