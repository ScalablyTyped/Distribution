package typings.atOracleOraclejet.ojcolorspectrumMod

import typings.atOracleOraclejet.Anon_Action
import typings.atOracleOraclejet.Anon_ActionElement
import typings.atOracleOraclejet.Anon_LabelHue
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.labelledBy
import typings.atOracleOraclejet.atOracleOraclejetStrings.labelledByChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.transientValueChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.ojcolorMod.^
import typings.atOracleOraclejet.ojcolorspectrumMod.ojColorSpectrum.ojAnimateEnd
import typings.atOracleOraclejet.ojcolorspectrumMod.ojColorSpectrum.ojAnimateStart
import typings.atOracleOraclejet.ojeditablevalueMod.editableValue
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
  var translations_ojColorSpectrum: Anon_LabelHue = js.native
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
  def getProperty_transientValue(property: typings.atOracleOraclejet.atOracleOraclejetStrings.transientValue): ^ = js.native
  def setProperties(properties: ojColorSpectrumSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typings.atOracleOraclejet.atOracleOraclejetStrings.transientValue, value: ^): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_LabelHue): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojcolorspectrum", "ojColorSpectrum")
@js.native
object ojColorSpectrum extends js.Object {
  type ojAnimateEnd = CustomEvent[Anon_Action]
  type ojAnimateStart = CustomEvent[Anon_ActionElement]
}

