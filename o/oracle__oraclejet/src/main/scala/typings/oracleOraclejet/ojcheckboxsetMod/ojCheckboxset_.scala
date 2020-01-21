package typings.oracleOraclejet.ojcheckboxsetMod

import typings.oracleOraclejet.AnonRequired
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionContext
import typings.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionsKeys
import typings.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.ojAnimateEnd
import typings.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.ojAnimateStart
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojeditablevalueMod.editableValue
import typings.oracleOraclejet.oracleOraclejetStrings.labelledBy
import typings.oracleOraclejet.oracleOraclejetStrings.labelledByChanged
import typings.oracleOraclejet.oracleOraclejetStrings.optionRenderer
import typings.oracleOraclejet.oracleOraclejetStrings.optionRendererChanged
import typings.oracleOraclejet.oracleOraclejetStrings.options
import typings.oracleOraclejet.oracleOraclejetStrings.optionsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.optionsKeys
import typings.oracleOraclejet.oracleOraclejetStrings.optionsKeysChanged
import typings.oracleOraclejet.oracleOraclejetStrings.required
import typings.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojCheckboxset_[K, D]
  extends editableValue[
      js.Array[js.Any], 
      ojCheckboxsetSettableProperties[K, D], 
      js.Array[js.Any], 
      js.Array[js.Any]
    ] {
  var labelledBy: String | Null = js.native
  var onLabelledByChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojCheckboxset_ : (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojCheckboxset_ : (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onOptionRendererChanged: (js.Function1[
    /* event */ JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null]], 
    _
  ]) | Null = js.native
  var onOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], _]) | Null = js.native
  var onOptionsKeysChanged: (js.Function1[/* event */ JetElementCustomEvent[js.UndefOr[OptionsKeys]], _]) | Null = js.native
  var onRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  @JSName("onValueChanged")
  var onValueChanged_ojCheckboxset_ : (js.Function1[/* event */ JetElementCustomEvent[js.Array[_]], _]) | Null = js.native
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.native
  var options: (DataProvider[K, D]) | Null = js.native
  var optionsKeys: js.UndefOr[OptionsKeys] = js.native
  var required: Boolean = js.native
  @JSName("translations")
  var translations_ojCheckboxset_ : AnonRequired = js.native
  @JSName("value")
  var value_ojCheckboxset_ : js.Array[_] = js.native
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
  def addEventListener_optionRendererChanged(
    `type`: optionRendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionRendererChanged(
    `type`: optionRendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(
    `type`: optionsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(
    `type`: optionsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.UndefOr[OptionsKeys]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.UndefOr[OptionsKeys]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(
    `type`: requiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(
    `type`: requiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_labelledBy(property: labelledBy): String | Null = js.native
  @JSName("getProperty")
  def getProperty_optionRenderer(property: optionRenderer): js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.native
  @JSName("getProperty")
  def getProperty_options(property: options): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_optionsKeys(property: optionsKeys): js.UndefOr[OptionsKeys] = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  def setProperties(properties: ojCheckboxsetSettablePropertiesLenient[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(property: optionRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(property: optionRenderer, value: js.Function1[/* param0 */ OptionContext[D], Element]): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionsKeys(property: optionsKeys, value: OptionsKeys): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonRequired): Unit = js.native
  def validate(): js.Promise[String] = js.native
}

