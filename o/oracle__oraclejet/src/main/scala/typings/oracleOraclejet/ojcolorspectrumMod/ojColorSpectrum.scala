package typings.oracleOraclejet.ojcolorspectrumMod

import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.anon.Element
import typings.oracleOraclejet.anon.LabelHue
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojcolorMod.^
import typings.oracleOraclejet.ojcolorspectrumMod.ojColorSpectrum.ojAnimateEnd
import typings.oracleOraclejet.ojcolorspectrumMod.ojColorSpectrum.ojAnimateStart
import typings.oracleOraclejet.ojeditablevalueMod.editableValue
import typings.oracleOraclejet.oracleOraclejetStrings.labelledBy
import typings.oracleOraclejet.oracleOraclejetStrings.labelledByChanged
import typings.oracleOraclejet.oracleOraclejetStrings.transientValueChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojColorSpectrum extends editableValue[^, ojColorSpectrumSettableProperties, ^, ^] {
  var labelledBy: String | Null = js.native
  var onLabelledByChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojColorSpectrum: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojColorSpectrum: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onTransientValueChanged: (js.Function1[/* event */ JetElementCustomEvent[^], _]) | Null = js.native
  val transientValue: ^ = js.native
  @JSName("translations")
  var translations_ojColorSpectrum: LabelHue = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(
    `type`: labelledByChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(
    `type`: labelledByChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[^], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[^], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_labelledBy(property: labelledBy): String | Null = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: typings.oracleOraclejet.oracleOraclejetStrings.transientValue): ^ = js.native
  def setProperties(properties: ojColorSpectrumSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typings.oracleOraclejet.oracleOraclejetStrings.transientValue, value: ^): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelHue): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojcolorspectrum", "ojColorSpectrum")
@js.native
object ojColorSpectrum extends js.Object {
  type ojAnimateEnd = CustomEvent[Action]
  type ojAnimateStart = CustomEvent[Element]
}

