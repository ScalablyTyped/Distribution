package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSelectMany[K, D]
  extends ojSelect[
      js.Array[js.Any] | scala.Null, 
      ojSelectManySettableProperties[K, D], 
      js.Array[js.Any] | scala.Null
    ] {
  var minimumResultsForSearch: scala.Double = js.native
  var onMinimumResultsForSearchChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSelectMany: (js.Function1[
    /* event */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectManyNs.ojAnimateEnd, 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSelectMany: (js.Function1[
    /* event */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectManyNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  var onOptionRendererChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        (js.Function1[
          /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.OptionContext, 
          stdLib.Element
        ]) | scala.Null
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onOptionsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Array[
        atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Optgroup
      ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var onOptionsKeysChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ChildKeysChildrenLabelValue], 
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
  var onReadOnlyChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
    _
  ]) | scala.Null = js.native
  var onRenderModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native
    ], 
    _
  ]) | scala.Null = js.native
  var onRequiredChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
    _
  ]) | scala.Null = js.native
  @JSName("onValueChanged")
  var onValueChanged_ojSelectMany: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[_] | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onValueOptionsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null], 
    _
  ]) | scala.Null = js.native
  var optionRenderer: js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.OptionContext, 
      stdLib.Element
    ]) | scala.Null
  ] = js.native
  var options: (js.Array[
    atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Optgroup
  ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null = js.native
  var optionsKeys: atOracleOraclejetLib.Anon_ChildKeysChildrenLabelValue = js.native
  var pickerAttributes: atOracleOraclejetLib.Anon_Class = js.native
  var placeholder: java.lang.String | scala.Null = js.native
  var readOnly: scala.Boolean = js.native
  var renderMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native = js.native
  var required: scala.Boolean = js.native
  @JSName("translations")
  var translations_ojSelectMany: atOracleOraclejetLib.Anon_FilterFurtherMoreMatchesFound = js.native
  var valueOptions: js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null = js.native
  @JSName("value")
  var value_ojSelectMany: js.Array[_] | scala.Null = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.renderModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.renderModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minimumResultsForSearchChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minimumResultsForSearchChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minimumResultsForSearchChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minimumResultsForSearchChanged,
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
            /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.OptionContext, 
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
            /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.OptionContext, 
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
          atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Optgroup
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
          atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Optgroup
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
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ChildKeysChildrenLabelValue], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionsKeysChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ChildKeysChildrenLabelValue], 
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
  def getProperty_minimumResultsForSearch(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.minimumResultsForSearch): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_optionRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionRenderer): js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.OptionContext, 
      stdLib.Element
    ]) | scala.Null
  ] = js.native
  @JSName("getProperty")
  def getProperty_options(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.options): (js.Array[
    atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Optgroup
  ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_optionsKeys(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionsKeys): atOracleOraclejetLib.Anon_ChildKeysChildrenLabelValue = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.pickerAttributes): atOracleOraclejetLib.Anon_Class = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.placeholder): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_readOnly(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.readOnly): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_renderMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.renderMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native = js.native
  @JSName("getProperty")
  def getProperty_required(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.required): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_valueOptions(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueOptions): js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null = js.native
  def setProperties(properties: ojSelectManySettablePropertiesLenient[K, D]): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.renderMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.renderMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.native
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_minimumResultsForSearch(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.minimumResultsForSearch,
    value: scala.Double
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionRenderer): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionRenderer,
    value: js.Function1[
      /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.OptionContext, 
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
      atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Optgroup
    ]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_optionsKeys(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.optionsKeys,
    value: atOracleOraclejetLib.Anon_ChildKeysChildrenLabelValue
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
  def setProperty_readOnly(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.readOnly, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.required, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_FilterFurtherMoreMatchesFound
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

