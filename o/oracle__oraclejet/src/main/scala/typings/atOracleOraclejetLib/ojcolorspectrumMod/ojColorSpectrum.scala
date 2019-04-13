package typings
package atOracleOraclejetLib.ojcolorspectrumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojColorSpectrum
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValue[
      atOracleOraclejetLib.ojcolorMod.^, 
      ojColorSpectrumSettableProperties, 
      atOracleOraclejetLib.ojcolorMod.^, 
      atOracleOraclejetLib.ojcolorMod.^
    ] {
  var labelledBy: java.lang.String | scala.Null = js.native
  var onLabelledByChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojColorSpectrum: (js.Function1[
    /* event */ atOracleOraclejetLib.ojcolorspectrumMod.ojColorSpectrumNs.ojAnimateEnd, 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojColorSpectrum: (js.Function1[
    /* event */ atOracleOraclejetLib.ojcolorspectrumMod.ojColorSpectrumNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  var onTransientValueChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojcolorMod.^], 
    _
  ]) | scala.Null = js.native
  val transientValue: atOracleOraclejetLib.ojcolorMod.^ = js.native
  @JSName("translations")
  var translations_ojColorSpectrum: atOracleOraclejetLib.Anon_LabelHue = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledByChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledByChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojcolorMod.^], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojcolorMod.^], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_labelledBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledBy): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValue): atOracleOraclejetLib.ojcolorMod.^ = js.native
  def setProperties(properties: ojColorSpectrumSettablePropertiesLenient): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledBy): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledBy, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValue,
    value: atOracleOraclejetLib.ojcolorMod.^
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_LabelHue
  ): scala.Unit = js.native
}

