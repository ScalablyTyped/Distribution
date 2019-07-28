package typings.atOracleOraclejet.ojprogressMod

import typings.atOracleOraclejet.Anon_AriaIndeterminateProgressText
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.`type`
import typings.atOracleOraclejet.atOracleOraclejetStrings.bar
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.max
import typings.atOracleOraclejet.atOracleOraclejetStrings.maxChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.atOracleOraclejetStrings.typeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.value
import typings.atOracleOraclejet.atOracleOraclejetStrings.valueChanged
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojProgress extends baseComponent[ojProgressSettableProperties] {
  var max: Double = js.native
  var onMaxChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onTypeChanged: (js.Function1[/* event */ JetElementCustomEvent[bar | circle], _]) | Null = js.native
  var onValueChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  @JSName("translations")
  var translations_ojProgress: Anon_AriaIndeterminateProgressText = js.native
  var `type`: bar | circle = js.native
  var value: Double = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[bar | circle], _]
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[bar | circle], _],
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
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): bar | circle = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): Double = js.native
  def setProperties(properties: ojProgressSettablePropertiesLenient): Unit = js.native
  def setProperty(property: `type`, value: bar): Unit = js.native
  def setProperty(property: `type`, value: circle): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_AriaIndeterminateProgressText): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
}

