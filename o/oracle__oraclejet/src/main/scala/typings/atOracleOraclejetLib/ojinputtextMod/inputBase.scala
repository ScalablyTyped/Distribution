package typings
package atOracleOraclejetLib.ojinputtextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait inputBase[V, SP /* <: inputBaseSettableProperties[V, SV, V] */, SV, RV]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValue[V, SP, SV, RV] {
  var asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[V]] = js.native
  var autocomplete: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String = js.native
  var autofocus: scala.Boolean = js.native
  var onAsyncValidatorsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[V]]], 
    _
  ]) | scala.Null = js.native
  var onAutocompleteChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String
    ], 
    _
  ]) | scala.Null = js.native
  var onAutofocusChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_inputBase: (js.Function1[/* event */ atOracleOraclejetLib.ojinputtextMod.inputBaseNs.ojAnimateEnd, _]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_inputBase: (js.Function1[/* event */ atOracleOraclejetLib.ojinputtextMod.inputBaseNs.ojAnimateStart, _]) | scala.Null = js.native
  var onPlaceholderChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onRawValueChanged: (js.Function1[/* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[RV], _]) | scala.Null = js.native
  var onReadonlyChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
    _
  ]) | scala.Null = js.native
  var onRequiredChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
    _
  ]) | scala.Null = js.native
  var onValidatorsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Array[
        atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[V] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
      ]) | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var placeholder: java.lang.String = js.native
  val rawValue: RV = js.native
  var readonly: scala.Boolean = js.native
  var required: scala.Boolean = js.native
  @JSName("translations")
  var translations_inputBase: atOracleOraclejetLib.Anon_Regexp = js.native
  var validators: (js.Array[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[V] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
  ]) | scala.Null = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.autocompleteChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.autocompleteChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.asyncValidatorsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[V]]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.asyncValidatorsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[V]]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_autofocusChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.autofocusChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_autofocusChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.autofocusChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholderChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholderChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[RV], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[RV], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonlyChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonlyChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
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
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.validatorsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Array[
          atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[V] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
        ]) | scala.Null
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.validatorsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Array[
          atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[V] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
        ]) | scala.Null
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_asyncValidators(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.asyncValidators): js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[V]] = js.native
  @JSName("getProperty")
  def getProperty_autocomplete(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autocomplete): atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_autofocus(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autofocus): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholder): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_rawValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue): RV = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonly): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_required(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.required): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_validators(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.validators): (js.Array[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[V] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
  ]) | scala.Null = js.native
  def setProperties(properties: inputBaseSettablePropertiesLenient[V, SV, RV]): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autocomplete,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autocomplete,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_asyncValidators(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.asyncValidators,
    value: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[V]]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_autocomplete(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autocomplete, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_autofocus(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autofocus, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholder, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue, value: RV): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonly, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.required, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_Regexp
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.validators): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.validators,
    value: js.Array[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[V] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ]
  ): scala.Unit = js.native
  def validate(): js.Promise[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalid
  ] = js.native
}

