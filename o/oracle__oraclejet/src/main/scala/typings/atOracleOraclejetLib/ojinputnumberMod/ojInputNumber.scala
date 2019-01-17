package typings
package atOracleOraclejetLib.ojinputnumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputNumber
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValue[
      scala.Double | scala.Null, 
      ojInputNumberSettableProperties, 
      scala.Double | scala.Null, 
      java.lang.String
    ] {
  var asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[scala.Double]] = js.native
  var autocomplete: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String = js.native
  var autofocus: scala.Boolean = js.native
  var converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[scala.Double] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter = js.native
  var max: scala.Double | scala.Null = js.native
  var min: scala.Double | scala.Null = js.native
  var onAsyncValidatorsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['asyncValidators'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onAutocompleteChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['autocomplete'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onAutofocusChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['autofocus'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onConverterChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['converter'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onMaxChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['max'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onMinChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['min'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputNumber: (js.Function1[/* event */ atOracleOraclejetLib.ojinputnumberMod.ojInputNumberNs.ojAnimateEnd, _]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputNumber: (js.Function1[
    /* event */ atOracleOraclejetLib.ojinputnumberMod.ojInputNumberNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  var onPlaceholderChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['placeholder'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onRawValueChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['rawValue'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onReadonlyChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['readonly'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onRequiredChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['required'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onStepChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['step'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onValidatorsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['validators'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  @JSName("onValueChanged")
  var onValueChanged_ojInputNumber: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['value'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onVirtualKeyboardChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['virtualKeyboard'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var placeholder: java.lang.String | scala.Null = js.native
  val rawValue: java.lang.String = js.native
  var readonly: scala.Boolean | scala.Null = js.native
  var required: scala.Boolean = js.native
  var step: scala.Double | scala.Null = js.native
  @JSName("translations")
  var translations_ojInputNumber: atOracleOraclejetLib.Anon_NumberRange = js.native
  var validators: js.Array[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[scala.Double] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
  ] = js.native
  var virtualKeyboard: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.text = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.asyncValidatorsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['asyncValidators'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.asyncValidatorsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['asyncValidators'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.autocompleteChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['autocomplete'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.autocompleteChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['autocomplete'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.autofocusChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['autofocus'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.autofocusChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['autofocus'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.converterChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['converter'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.converterChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['converter'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['max'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['max'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['min'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['min'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholderChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['placeholder'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholderChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['placeholder'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['rawValue'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['rawValue'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonlyChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['readonly'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonlyChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['readonly'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.requiredChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['required'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.requiredChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['required'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.stepChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['step'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.stepChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['step'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.validatorsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['validators'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.validatorsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['validators'] */ js.Any
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
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboardChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['virtualKeyboard'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboardChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['virtualKeyboard'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_asyncValidators(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.asyncValidators): js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[scala.Double]] = js.native
  @JSName("getProperty")
  def getProperty_autocomplete(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autocomplete): atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_autofocus(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autofocus): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_converter(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.converter): atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[scala.Double] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter = js.native
  @JSName("getProperty")
  def getProperty_max(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.max): scala.Double | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_min(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.min): scala.Double | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholder): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_rawValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonly): scala.Boolean | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_required(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.required): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_step(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.step): scala.Double | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_validators(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.validators): js.Array[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[scala.Double] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
  ] = js.native
  @JSName("getProperty")
  def getProperty_virtualKeyboard(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboard): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.text = js.native
  def setProperties(properties: ojInputNumberSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autocomplete,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autocomplete,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboard,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboard,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.number
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboard,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.text
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_asyncValidators(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.asyncValidators,
    value: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[scala.Double]]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_autocomplete(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autocomplete, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_autofocus(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autofocus, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.converter,
    value: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[scala.Double]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.converter,
    value: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.max): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.max, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.min): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.min, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholder): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholder, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonly): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonly, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.required, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.step): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.step, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_NumberRange
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.validators,
    value: js.Array[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[scala.Double] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value, value: scala.Double): scala.Unit = js.native
  def stepDown(): scala.Unit = js.native
  def stepDown(steps: scala.Double): scala.Unit = js.native
  def stepUp(): scala.Unit = js.native
  def stepUp(steps: scala.Double): scala.Unit = js.native
  def validate(): js.Promise[java.lang.String] = js.native
}

