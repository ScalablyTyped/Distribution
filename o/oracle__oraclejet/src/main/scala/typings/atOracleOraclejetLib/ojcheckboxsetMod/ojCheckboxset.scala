package typings
package atOracleOraclejetLib.ojcheckboxsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojCheckboxset[K, D]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValue[
      js.Array[js.Any], 
      ojCheckboxsetSettableProperties[K, D], 
      js.Array[js.Any], 
      js.Array[js.Any]
    ] {
  var labelledBy: java.lang.String | scala.Null = js.native
  var onLabelledByChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojCheckboxset: (js.Function1[/* event */ atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.ojAnimateEnd, _]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojCheckboxset: (js.Function1[
    /* event */ atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  var onOptionRendererChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        (js.Function1[
          /* param0 */ atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionContext[D], 
          stdLib.Element
        ]) | scala.Null
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onOptionsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onOptionsKeysChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionsKeys]], 
    _
  ]) | scala.Null = js.native
  var onRequiredChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
    _
  ]) | scala.Null = js.native
  @JSName("onValueChanged")
  var onValueChanged_ojCheckboxset: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[_]], 
    _
  ]) | scala.Null = js.native
  var optionRenderer: js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionContext[D], 
      stdLib.Element
    ]) | scala.Null
  ] = js.native
  var options: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null = js.native
  var optionsKeys: js.UndefOr[atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionsKeys] = js.native
  var required: scala.Boolean = js.native
  @JSName("translations")
  var translations_ojCheckboxset: atOracleOraclejetLib.Anon_Required = js.native
  @JSName("value")
  var value_ojCheckboxset: js.Array[_] = js.native
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
  def addEventListener_optionRendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionRendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          (js.Function1[
            /* param0 */ atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionContext[D], 
            stdLib.Element
          ]) | scala.Null
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionRendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionRendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          (js.Function1[
            /* param0 */ atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionContext[D], 
            stdLib.Element
          ]) | scala.Null
        ]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionsKeysChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionsKeys]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionsKeysChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionsKeys]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.requiredChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.requiredChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_labelledBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledBy): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_optionRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionRenderer): js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionContext[D], 
      stdLib.Element
    ]) | scala.Null
  ] = js.native
  @JSName("getProperty")
  def getProperty_options(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.options): (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_optionsKeys(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionsKeys): js.UndefOr[atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionsKeys] = js.native
  @JSName("getProperty")
  def getProperty_required(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.required): scala.Boolean = js.native
  def setProperties(properties: ojCheckboxsetSettablePropertiesLenient[K, D]): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledBy): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelledBy, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionRenderer): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionRenderer,
    value: js.Function1[
      /* param0 */ atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionContext[D], 
      stdLib.Element
    ]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.options): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_options(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.options,
    value: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_optionsKeys(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionsKeys,
    value: atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionsKeys
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.required, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_Required
  ): scala.Unit = js.native
  def validate(): js.Promise[java.lang.String] = js.native
}

