package typings.oracleOraclejet.ojinputnumberMod

import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.anon.Element
import typings.oracleOraclejet.anon.NumberRange
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojeditablevalueMod.editableValue
import typings.oracleOraclejet.ojinputnumberMod.ojInputNumber.ojAnimateEnd
import typings.oracleOraclejet.ojinputnumberMod.ojInputNumber.ojAnimateStart
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.oracleOraclejetStrings.asyncValidators
import typings.oracleOraclejet.oracleOraclejetStrings.asyncValidatorsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.autocomplete
import typings.oracleOraclejet.oracleOraclejetStrings.autocompleteChanged
import typings.oracleOraclejet.oracleOraclejetStrings.autofocus
import typings.oracleOraclejet.oracleOraclejetStrings.autofocusChanged
import typings.oracleOraclejet.oracleOraclejetStrings.converter
import typings.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typings.oracleOraclejet.oracleOraclejetStrings.max
import typings.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typings.oracleOraclejet.oracleOraclejetStrings.min
import typings.oracleOraclejet.oracleOraclejetStrings.minChanged
import typings.oracleOraclejet.oracleOraclejetStrings.number
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.placeholder
import typings.oracleOraclejet.oracleOraclejetStrings.placeholderChanged
import typings.oracleOraclejet.oracleOraclejetStrings.rawValueChanged
import typings.oracleOraclejet.oracleOraclejetStrings.readonlyChanged_
import typings.oracleOraclejet.oracleOraclejetStrings.readonly_
import typings.oracleOraclejet.oracleOraclejetStrings.required
import typings.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typings.oracleOraclejet.oracleOraclejetStrings.step
import typings.oracleOraclejet.oracleOraclejetStrings.stepChanged
import typings.oracleOraclejet.oracleOraclejetStrings.text
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.validators
import typings.oracleOraclejet.oracleOraclejetStrings.validatorsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.value
import typings.oracleOraclejet.oracleOraclejetStrings.virtualKeyboard
import typings.oracleOraclejet.oracleOraclejetStrings.virtualKeyboardChanged
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputNumber extends editableValue[Double | Null, ojInputNumberSettableProperties, Double | Null, String] {
  var asyncValidators: js.Array[AsyncValidator[Double]] = js.native
  var autocomplete: on | off | String = js.native
  var converter: Converter[Double] | RegisteredConverter = js.native
  var max: Double | Null = js.native
  var min: Double | Null = js.native
  var onAsyncValidatorsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[AsyncValidator[Double]]], _]) | Null = js.native
  var onAutocompleteChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off | String], _]) | Null = js.native
  var onAutofocusChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onConverterChanged: (js.Function1[/* event */ JetElementCustomEvent[Converter[Double] | RegisteredConverter], _]) | Null = js.native
  var onMaxChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onMinChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputNumber: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputNumber: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onPlaceholderChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onRawValueChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onReadonlyChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean | Null], _]) | Null = js.native
  var onRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onStepChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onValidatorsChanged: (js.Function1[
    /* event */ JetElementCustomEvent[js.Array[Validator[Double] | RegisteredValidator]], 
    _
  ]) | Null = js.native
  var onVirtualKeyboardChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | number | text], _]) | Null = js.native
  var placeholder: String | Null = js.native
  val rawValue: String = js.native
  var readonly: Boolean | Null = js.native
  var required: Boolean = js.native
  var step: Double | Null = js.native
  @JSName("translations")
  var translations_ojInputNumber: NumberRange = js.native
  var validators: js.Array[Validator[Double] | RegisteredValidator] = js.native
  var virtualKeyboard: auto | number | text = js.native
  def addEventListener(
    `type`: autocompleteChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | String], _]
  ): Unit = js.native
  def addEventListener(
    `type`: autocompleteChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | String], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: virtualKeyboardChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | number | text], _]
  ): Unit = js.native
  def addEventListener(
    `type`: virtualKeyboardChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | number | text], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Array[AsyncValidator[Double]]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Array[AsyncValidator[Double]]], 
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
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Converter[Double] | RegisteredConverter], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Converter[Double] | RegisteredConverter], 
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
  def addEventListener_placeholderChanged(
    `type`: placeholderChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: placeholderChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean | Null], _],
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
  def addEventListener_validatorsChanged(
    `type`: validatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Array[Validator[Double] | RegisteredValidator]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(
    `type`: validatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Array[Validator[Double] | RegisteredValidator]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_asyncValidators(property: asyncValidators): js.Array[AsyncValidator[Double]] = js.native
  @JSName("getProperty")
  def getProperty_autocomplete(property: autocomplete): on | off | String = js.native
  @JSName("getProperty")
  def getProperty_autofocus(property: autofocus): Boolean = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[Double] | RegisteredConverter = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: placeholder): String | Null = js.native
  @JSName("getProperty")
  def getProperty_rawValue(property: typings.oracleOraclejet.oracleOraclejetStrings.rawValue): String = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly_): Boolean | Null = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  @JSName("getProperty")
  def getProperty_step(property: step): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_validators(property: validators): js.Array[Validator[Double] | RegisteredValidator] = js.native
  @JSName("getProperty")
  def getProperty_virtualKeyboard(property: virtualKeyboard): auto | number | text = js.native
  def setProperties(properties: ojInputNumberSettablePropertiesLenient): Unit = js.native
  def setProperty(property: autocomplete, value: off): Unit = js.native
  def setProperty(property: autocomplete, value: on): Unit = js.native
  def setProperty(property: virtualKeyboard, value: auto): Unit = js.native
  def setProperty(property: virtualKeyboard, value: number): Unit = js.native
  def setProperty(property: virtualKeyboard, value: text): Unit = js.native
  @JSName("setProperty")
  def setProperty_asyncValidators(property: asyncValidators, value: js.Array[AsyncValidator[Double]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_autocomplete(property: autocomplete, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_autofocus(property: autofocus, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[Double]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typings.oracleOraclejet.oracleOraclejetStrings.rawValue, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: step): Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: step, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: NumberRange): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators, value: js.Array[Validator[Double] | RegisteredValidator]): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
  def stepDown(): Unit = js.native
  def stepDown(steps: Double): Unit = js.native
  def stepUp(): Unit = js.native
  def stepUp(steps: Double): Unit = js.native
  def validate(): js.Promise[String] = js.native
}

@JSImport("@oracle/oraclejet/ojinputnumber", "ojInputNumber")
@js.native
object ojInputNumber extends js.Object {
  type ojAnimateEnd = CustomEvent[Action]
  type ojAnimateStart = CustomEvent[Element]
}

