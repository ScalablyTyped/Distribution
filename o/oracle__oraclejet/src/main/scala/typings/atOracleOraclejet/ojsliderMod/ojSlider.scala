package typings.atOracleOraclejet.ojsliderMod

import typings.atOracleOraclejet.Anon_InvalidStep
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.`type`
import typings.atOracleOraclejet.atOracleOraclejetStrings.fromMax
import typings.atOracleOraclejet.atOracleOraclejetStrings.fromMin
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.max
import typings.atOracleOraclejet.atOracleOraclejetStrings.maxChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.min
import typings.atOracleOraclejet.atOracleOraclejetStrings.minChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.orientation
import typings.atOracleOraclejet.atOracleOraclejetStrings.orientationChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.step
import typings.atOracleOraclejet.atOracleOraclejetStrings.stepChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.transientValueChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.atOracleOraclejetStrings.typeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.value
import typings.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typings.atOracleOraclejet.ojeditablevalueMod.editableValue
import typings.atOracleOraclejet.ojsliderMod.ojSliderNs.ojAnimateEnd
import typings.atOracleOraclejet.ojsliderMod.ojSliderNs.ojAnimateStart
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSlider extends editableValue[Double | Null, ojSliderSettableProperties, Double | Null, Double | Null] {
  var max: Double | Null = js.native
  var min: Double | Null = js.native
  var onMaxChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onMinChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSlider: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSlider: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onOrientationChanged: (js.Function1[/* event */ JetElementCustomEvent[horizontal | vertical], _]) | Null = js.native
  var onStepChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onTransientValueChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onTypeChanged: (js.Function1[/* event */ JetElementCustomEvent[fromMin | fromMax | single], _]) | Null = js.native
  var orientation: horizontal | vertical = js.native
  var step: Double | Null = js.native
  val transientValue: Double = js.native
  @JSName("translations")
  var translations_ojSlider: Anon_InvalidStep = js.native
  var `type`: fromMin | fromMax | single = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], _]
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[fromMin | fromMax | single], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[fromMin | fromMax | single], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _],
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
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): horizontal | vertical = js.native
  @JSName("getProperty")
  def getProperty_step(property: step): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: typings.atOracleOraclejet.atOracleOraclejetStrings.transientValue): Double = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): fromMin | fromMax | single = js.native
  def setProperties(properties: ojSliderSettablePropertiesLenient): Unit = js.native
  def setProperty(property: `type`, value: fromMax): Unit = js.native
  def setProperty(property: `type`, value: fromMin): Unit = js.native
  def setProperty(property: `type`, value: single): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: step): Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: step, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typings.atOracleOraclejet.atOracleOraclejetStrings.transientValue, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_InvalidStep): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
}

