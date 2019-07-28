package typings.atOracleOraclejet.ojselectcomboboxMod

import typings.atOracleOraclejet.Anon_ChildKeysChildren
import typings.atOracleOraclejet.Anon_Class
import typings.atOracleOraclejet.Anon_FilterFurther
import typings.atOracleOraclejet.Anon_LabelValue
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.asyncValidators
import typings.atOracleOraclejet.atOracleOraclejetStrings.asyncValidatorsChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.converter
import typings.atOracleOraclejet.atOracleOraclejetStrings.converterChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.minLength
import typings.atOracleOraclejet.atOracleOraclejetStrings.minLengthChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.optionRenderer
import typings.atOracleOraclejet.atOracleOraclejetStrings.optionRendererChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.options
import typings.atOracleOraclejet.atOracleOraclejetStrings.optionsChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.optionsKeys
import typings.atOracleOraclejet.atOracleOraclejetStrings.optionsKeysChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.pickerAttributes
import typings.atOracleOraclejet.atOracleOraclejetStrings.pickerAttributesChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.placeholder
import typings.atOracleOraclejet.atOracleOraclejetStrings.placeholderChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.rawValueChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.readOnly
import typings.atOracleOraclejet.atOracleOraclejetStrings.readOnlyChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.required
import typings.atOracleOraclejet.atOracleOraclejetStrings.requiredChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.atOracleOraclejetStrings.validators
import typings.atOracleOraclejet.atOracleOraclejetStrings.validatorsChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.value
import typings.atOracleOraclejet.atOracleOraclejetStrings.valueOptions
import typings.atOracleOraclejet.atOracleOraclejetStrings.valueOptionsChanged
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxManyNs.ojAnimateEnd
import typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxManyNs.ojAnimateStart
import typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.OptionContext
import typings.atOracleOraclejet.ojvalidationDashBaseMod.AsyncValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import typings.atOracleOraclejet.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
import typings.atOracleOraclejet.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validator
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojComboboxMany[K, D]
  extends ojCombobox[
      js.Array[js.Any] | Null, 
      ojComboboxManySettableProperties[K, D], 
      js.Array[js.Any] | Null, 
      String
    ] {
  var asyncValidators: js.Array[AsyncValidator[js.Array[_]]] = js.native
  var converter: Converter[_] | RegisteredConverter | Null = js.native
  var minLength: Double = js.native
  var onAsyncValidatorsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[AsyncValidator[js.Array[_]]]], _]) | Null = js.native
  var onConverterChanged: (js.Function1[/* event */ JetElementCustomEvent[Converter[_] | RegisteredConverter | Null], _]) | Null = js.native
  var onMinLengthChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojComboboxMany: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojComboboxMany: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onOptionRendererChanged: (js.Function1[
    /* event */ JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null]], 
    _
  ]) | Null = js.native
  var onOptionsChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      (js.Array[
        typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Optgroup
      ]) | (DataProvider[K, D]) | Null
    ], 
    _
  ]) | Null = js.native
  var onOptionsKeysChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_ChildKeysChildren], _]) | Null = js.native
  var onPickerAttributesChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_Class], _]) | Null = js.native
  var onPlaceholderChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onRawValueChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onReadOnlyChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onValidatorsChanged: (js.Function1[
    /* event */ JetElementCustomEvent[(js.Array[Validator[js.Array[_]] | RegisteredValidator]) | Null], 
    _
  ]) | Null = js.native
  @JSName("onValueChanged")
  var onValueChanged_ojComboboxMany: (js.Function1[/* event */ JetElementCustomEvent[js.Array[_] | Null], _]) | Null = js.native
  var onValueOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Anon_LabelValue] | Null], _]) | Null = js.native
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  var options: (js.Array[
    typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  var optionsKeys: Anon_ChildKeysChildren = js.native
  var pickerAttributes: Anon_Class = js.native
  var placeholder: String | Null = js.native
  val rawValue: String | Null = js.native
  var readOnly: Boolean = js.native
  var required: Boolean = js.native
  @JSName("translations")
  var translations_ojComboboxMany: Anon_FilterFurther = js.native
  var validators: (js.Array[Validator[js.Array[_]] | RegisteredValidator]) | Null = js.native
  var valueOptions: js.Array[Anon_LabelValue] | Null = js.native
  @JSName("value")
  var value_ojComboboxMany: js.Array[_] | Null = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Array[AsyncValidator[js.Array[_]]]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Array[AsyncValidator[js.Array[_]]]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Converter[_] | RegisteredConverter | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Converter[_] | RegisteredConverter | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minLengthChanged(
    `type`: minLengthChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minLengthChanged(
    `type`: minLengthChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionRendererChanged(
    `type`: optionRendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionRendererChanged(
    `type`: optionRendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(
    `type`: optionsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        (js.Array[
          typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Optgroup
        ]) | (DataProvider[K, D]) | Null
      ], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(
    `type`: optionsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        (js.Array[
          typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Optgroup
        ]) | (DataProvider[K, D]) | Null
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_ChildKeysChildren], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_ChildKeysChildren], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: pickerAttributesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Class], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: pickerAttributesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Class], _],
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readOnlyChanged(
    `type`: readOnlyChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readOnlyChanged(
    `type`: readOnlyChanged,
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
      /* ev */ JetElementCustomEvent[(js.Array[Validator[js.Array[_]] | RegisteredValidator]) | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(
    `type`: validatorsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Array[Validator[js.Array[_]] | RegisteredValidator]) | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionsChanged(
    `type`: valueOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Array[Anon_LabelValue] | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionsChanged(
    `type`: valueOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Array[Anon_LabelValue] | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_asyncValidators(property: asyncValidators): js.Array[AsyncValidator[js.Array[_]]] = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[_] | RegisteredConverter | Null = js.native
  @JSName("getProperty")
  def getProperty_minLength(property: minLength): Double = js.native
  @JSName("getProperty")
  def getProperty_optionRenderer(property: optionRenderer): js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  @JSName("getProperty")
  def getProperty_options(property: options): (js.Array[
    typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_optionsKeys(property: optionsKeys): Anon_ChildKeysChildren = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: pickerAttributes): Anon_Class = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: placeholder): String | Null = js.native
  @JSName("getProperty")
  def getProperty_rawValue(property: typings.atOracleOraclejet.atOracleOraclejetStrings.rawValue): String | Null = js.native
  @JSName("getProperty")
  def getProperty_readOnly(property: readOnly): Boolean = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  @JSName("getProperty")
  def getProperty_validators(property: validators): (js.Array[Validator[js.Array[_]] | RegisteredValidator]) | Null = js.native
  @JSName("getProperty")
  def getProperty_valueOptions(property: valueOptions): js.Array[Anon_LabelValue] | Null = js.native
  def setProperties(properties: ojComboboxManySettablePropertiesLenient[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_asyncValidators(property: asyncValidators, value: js.Array[AsyncValidator[js.Array[_]]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[_]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_minLength(property: minLength, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(property: optionRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(property: optionRenderer, value: js.Function1[/* param0 */ OptionContext, Element]): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(
    property: options,
    value: js.Array[
      typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Optgroup
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionsKeys(property: optionsKeys, value: Anon_ChildKeysChildren): Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(property: pickerAttributes, value: Anon_Class): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typings.atOracleOraclejet.atOracleOraclejetStrings.rawValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typings.atOracleOraclejet.atOracleOraclejetStrings.rawValue, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_FilterFurther): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators, value: js.Array[Validator[js.Array[_]] | RegisteredValidator]): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: js.Array[_]): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueOptions(property: valueOptions): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueOptions(property: valueOptions, value: js.Array[Anon_LabelValue]): Unit = js.native
}

