package typings.atOracleOraclejet.ojinputtextMod

import typings.atOracleOraclejet.Anon_Action
import typings.atOracleOraclejet.Anon_ActionElement
import typings.atOracleOraclejet.Anon_Regexp
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.asyncValidators
import typings.atOracleOraclejet.atOracleOraclejetStrings.asyncValidatorsChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.autocomplete
import typings.atOracleOraclejet.atOracleOraclejetStrings.autocompleteChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.autofocus
import typings.atOracleOraclejet.atOracleOraclejetStrings.autofocusChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalid
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.placeholder
import typings.atOracleOraclejet.atOracleOraclejetStrings.placeholderChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.rawValueChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.readonlyChanged_
import typings.atOracleOraclejet.atOracleOraclejetStrings.readonly_
import typings.atOracleOraclejet.atOracleOraclejetStrings.required
import typings.atOracleOraclejet.atOracleOraclejetStrings.requiredChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.atOracleOraclejetStrings.validators
import typings.atOracleOraclejet.atOracleOraclejetStrings.validatorsChanged
import typings.atOracleOraclejet.ojeditablevalueMod.editableValue
import typings.atOracleOraclejet.ojinputtextMod.inputBase.ojAnimateEnd
import typings.atOracleOraclejet.ojinputtextMod.inputBase.ojAnimateStart
import typings.atOracleOraclejet.ojvalidationDashBaseMod.AsyncValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validation.RegisteredValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validator
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait inputBase[V, SP /* <: inputBaseSettableProperties[V, SV, V] */, SV, RV] extends editableValue[V, SP, SV, RV] {
  var asyncValidators: js.Array[AsyncValidator[V]] = js.native
  var autocomplete: on | off | String = js.native
  var autofocus: Boolean = js.native
  var onAsyncValidatorsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[AsyncValidator[V]]], _]) | Null = js.native
  var onAutocompleteChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off | String], _]) | Null = js.native
  var onAutofocusChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_inputBase: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_inputBase: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onPlaceholderChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onRawValueChanged: (js.Function1[/* event */ JetElementCustomEvent[RV], _]) | Null = js.native
  var onReadonlyChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onValidatorsChanged: (js.Function1[
    /* event */ JetElementCustomEvent[(js.Array[Validator[V] | RegisteredValidator]) | Null], 
    _
  ]) | Null = js.native
  var placeholder: String = js.native
  val rawValue: RV = js.native
  var readonly: Boolean = js.native
  var required: Boolean = js.native
  @JSName("translations")
  var translations_inputBase: Anon_Regexp = js.native
  var validators: (js.Array[Validator[V] | RegisteredValidator]) | Null = js.native
  def addEventListener(
    `type`: autocompleteChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | String], _]
  ): Unit = js.native
  def addEventListener(
    `type`: autocompleteChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Array[AsyncValidator[V]]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Array[AsyncValidator[V]]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_autofocusChanged(
    `type`: autofocusChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_autofocusChanged(
    `type`: autofocusChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: placeholderChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: placeholderChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[RV], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[RV], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
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
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(
    `type`: validatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Array[Validator[V] | RegisteredValidator]) | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(
    `type`: validatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Array[Validator[V] | RegisteredValidator]) | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_asyncValidators(property: asyncValidators): js.Array[AsyncValidator[V]] = js.native
  @JSName("getProperty")
  def getProperty_autocomplete(property: autocomplete): on | off | String = js.native
  @JSName("getProperty")
  def getProperty_autofocus(property: autofocus): Boolean = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: placeholder): String = js.native
  @JSName("getProperty")
  def getProperty_rawValue(property: typings.atOracleOraclejet.atOracleOraclejetStrings.rawValue): RV = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly_): Boolean = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  @JSName("getProperty")
  def getProperty_validators(property: validators): (js.Array[Validator[V] | RegisteredValidator]) | Null = js.native
  def setProperties(properties: inputBaseSettablePropertiesLenient[V, SV, RV]): Unit = js.native
  def setProperty(property: autocomplete, value: off): Unit = js.native
  def setProperty(property: autocomplete, value: on): Unit = js.native
  @JSName("setProperty")
  def setProperty_asyncValidators(property: asyncValidators, value: js.Array[AsyncValidator[V]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_autocomplete(property: autocomplete, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_autofocus(property: autofocus, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typings.atOracleOraclejet.atOracleOraclejetStrings.rawValue, value: RV): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_Regexp): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators, value: js.Array[Validator[V] | RegisteredValidator]): Unit = js.native
  def validate(): js.Promise[typings.atOracleOraclejet.atOracleOraclejetStrings.valid | invalid] = js.native
}

@JSImport("@oracle/oraclejet/ojinputtext", "inputBase")
@js.native
object inputBase extends js.Object {
  type ojAnimateEnd = CustomEvent[Anon_Action]
  type ojAnimateStart = CustomEvent[Anon_ActionElement]
}

