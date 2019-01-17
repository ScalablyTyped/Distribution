package typings
package atOracleOraclejetLib.ojcolorspectrumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojColorSpectrum
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValue[
      atOracleOraclejetLib.ojcolorMod.namespaced, 
      ojColorSpectrumSettableProperties, 
      atOracleOraclejetLib.ojcolorMod.namespaced, 
      atOracleOraclejetLib.ojcolorMod.namespaced
    ] {
  var labelledBy: java.lang.String | scala.Null = js.native
  var onLabelledByChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['labelledBy'] */ js.Any
    ], 
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
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['transientValue'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  @JSName("onValueChanged")
  var onValueChanged_ojColorSpectrum: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['value'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  val transientValue: atOracleOraclejetLib.ojcolorMod.namespaced = js.native
  @JSName("translations")
  var translations_ojColorSpectrum: atOracleOraclejetLib.Anon_LabelHue = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledByChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['labelledBy'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledByChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['labelledBy'] */ js.Any
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
  @JSName("getProperty")
  def getProperty_labelledBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledBy): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValue): atOracleOraclejetLib.ojcolorMod.namespaced = js.native
  def setProperties(properties: ojColorSpectrumSettablePropertiesLenient): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledBy): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledBy, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.transientValue,
    value: atOracleOraclejetLib.ojcolorMod.namespaced
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_LabelHue
  ): scala.Unit = js.native
}

