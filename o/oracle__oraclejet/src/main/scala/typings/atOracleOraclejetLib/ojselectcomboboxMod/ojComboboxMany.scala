package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojComboboxMany[K, D]
  extends ojCombobox[
      js.Array[js.Any] | scala.Null, 
      ojComboboxManySettableProperties[K, D], 
      js.Array[js.Any] | scala.Null, 
      java.lang.String
    ] {
  var asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[js.Array[_]]] = js.native
  var converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null = js.native
  var minLength: scala.Double = js.native
  var onAsyncValidatorsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[js.Array[_]]]
    ], 
    _
  ]) | scala.Null = js.native
  var onConverterChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var onMinLengthChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojComboboxMany: (js.Function1[
    /* event */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxManyNs.ojAnimateEnd, 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojComboboxMany: (js.Function1[
    /* event */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxManyNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  var onOptionRendererChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        (js.Function1[
          /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.OptionContext, 
          stdLib.Element
        ]) | scala.Null
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onOptionsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Array[
        atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Optgroup
      ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var onOptionsKeysChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ChildKeysChildren], 
    _
  ]) | scala.Null = js.native
  var onPickerAttributesChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Class], 
    _
  ]) | scala.Null = js.native
  var onPlaceholderChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onRawValueChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onReadOnlyChanged: (js.Function1[
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
        atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[js.Array[_]] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
      ]) | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  @JSName("onValueChanged")
  var onValueChanged_ojComboboxMany: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[_] | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onValueOptionsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null], 
    _
  ]) | scala.Null = js.native
  var optionRenderer: js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.OptionContext, 
      stdLib.Element
    ]) | scala.Null
  ] = js.native
  var options: (js.Array[
    atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Optgroup
  ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null = js.native
  var optionsKeys: atOracleOraclejetLib.Anon_ChildKeysChildren = js.native
  var pickerAttributes: atOracleOraclejetLib.Anon_Class = js.native
  var placeholder: java.lang.String | scala.Null = js.native
  val rawValue: java.lang.String | scala.Null = js.native
  var readOnly: scala.Boolean = js.native
  var required: scala.Boolean = js.native
  @JSName("translations")
  var translations_ojComboboxMany: atOracleOraclejetLib.Anon_FilterFurther = js.native
  var validators: (js.Array[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[js.Array[_]] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
  ]) | scala.Null = js.native
  var valueOptions: js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null = js.native
  @JSName("value")
  var value_ojComboboxMany: js.Array[_] | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.asyncValidatorsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[js.Array[_]]]
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.asyncValidatorsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[js.Array[_]]]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.converterChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.converterChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minLengthChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minLengthChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minLengthChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minLengthChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
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
            /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.OptionContext, 
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
            /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.OptionContext, 
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
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Array[
          atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Optgroup
        ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Array[
          atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Optgroup
        ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionsKeysChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ChildKeysChildren], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionsKeysChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ChildKeysChildren], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pickerAttributesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Class], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pickerAttributesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Class], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholderChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholderChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readOnlyChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.readOnlyChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readOnlyChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.readOnlyChanged,
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
          atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[js.Array[_]] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
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
          atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[js.Array[_]] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
        ]) | scala.Null
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_asyncValidators(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.asyncValidators): js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[js.Array[_]]] = js.native
  @JSName("getProperty")
  def getProperty_converter(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.converter): atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_minLength(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.minLength): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_optionRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionRenderer): js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.OptionContext, 
      stdLib.Element
    ]) | scala.Null
  ] = js.native
  @JSName("getProperty")
  def getProperty_options(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.options): (js.Array[
    atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Optgroup
  ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_optionsKeys(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionsKeys): atOracleOraclejetLib.Anon_ChildKeysChildren = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.pickerAttributes): atOracleOraclejetLib.Anon_Class = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholder): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_rawValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_readOnly(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.readOnly): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_required(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.required): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_validators(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.validators): (js.Array[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[js.Array[_]] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
  ]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_valueOptions(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueOptions): js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null = js.native
  def setProperties(properties: ojComboboxManySettablePropertiesLenient[K, D]): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_asyncValidators(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.asyncValidators,
    value: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[js.Array[_]]]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.converter): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.converter,
    value: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.converter,
    value: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_minLength(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.minLength, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionRenderer): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionRenderer,
    value: js.Function1[
      /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.OptionContext, 
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
  def setProperty_options(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.options,
    value: js.Array[
      atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Optgroup
    ]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_optionsKeys(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionsKeys,
    value: atOracleOraclejetLib.Anon_ChildKeysChildren
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.pickerAttributes,
    value: atOracleOraclejetLib.Anon_Class
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholder): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholder, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_readOnly(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.readOnly, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.required, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_FilterFurther
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.validators): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.validators,
    value: js.Array[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[js.Array[_]] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value, value: js.Array[_]): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_valueOptions(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueOptions): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_valueOptions(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueOptions,
    value: js.Array[atOracleOraclejetLib.Anon_LabelValue]
  ): scala.Unit = js.native
}

