package typings.atOracleOraclejet.ojselectcomboboxMod

import typings.atOracleOraclejet.Anon_Action
import typings.atOracleOraclejet.Anon_ActionElement
import typings.atOracleOraclejet.Anon_ChildKeysChildrenLabelValue
import typings.atOracleOraclejet.Anon_Class
import typings.atOracleOraclejet.Anon_FilterFurtherMoreMatchesFound
import typings.atOracleOraclejet.Anon_LabelValue
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.jet
import typings.atOracleOraclejet.atOracleOraclejetStrings.minimumResultsForSearch
import typings.atOracleOraclejet.atOracleOraclejetStrings.minimumResultsForSearchChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.native
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
import typings.atOracleOraclejet.atOracleOraclejetStrings.readOnly
import typings.atOracleOraclejet.atOracleOraclejetStrings.readOnlyChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.renderMode
import typings.atOracleOraclejet.atOracleOraclejetStrings.renderModeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.required
import typings.atOracleOraclejet.atOracleOraclejetStrings.requiredChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.atOracleOraclejetStrings.valueChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.valueOption
import typings.atOracleOraclejet.atOracleOraclejetStrings.valueOptionChanged
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.OptionContext
import typings.atOracleOraclejet.ojselectcomboboxMod.ojSelectOne.ojAnimateEnd
import typings.atOracleOraclejet.ojselectcomboboxMod.ojSelectOne.ojAnimateStart
import typings.std.CustomEvent
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSelectOne[K, D]
  extends ojSelect[js.Any, ojSelectOneSettableProperties[K, D], js.Any] {
  var minimumResultsForSearch: Double = js.native
  var onMinimumResultsForSearchChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSelectOne: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSelectOne: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onOptionRendererChanged: (js.Function1[
    /* event */ JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null]], 
    _
  ]) | Null = js.native
  var onOptionsChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      (js.Array[
        typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
      ]) | (DataProvider[K, D]) | Null
    ], 
    _
  ]) | Null = js.native
  var onOptionsKeysChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_ChildKeysChildrenLabelValue], _]) | Null = js.native
  var onPickerAttributesChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_Class], _]) | Null = js.native
  var onPlaceholderChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onReadOnlyChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onRenderModeChanged: (js.Function1[/* event */ JetElementCustomEvent[jet | native], _]) | Null = js.native
  var onRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onValueOptionChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_LabelValue], _]) | Null = js.native
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  var options: (js.Array[
    typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  var optionsKeys: Anon_ChildKeysChildrenLabelValue = js.native
  var pickerAttributes: Anon_Class = js.native
  var placeholder: String | Null = js.native
  var readOnly: Boolean = js.native
  var renderMode: jet | native = js.native
  var required: Boolean = js.native
  @JSName("translations")
  var translations_ojSelectOne: Anon_FilterFurtherMoreMatchesFound = js.native
  var valueOption: Anon_LabelValue = js.native
  def addEventListener(
    `type`: renderModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[jet | native], _]
  ): Unit = js.native
  def addEventListener(
    `type`: renderModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[jet | native], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojSelectOne<K, D>['value'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojSelectOne<K, D>['value'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minimumResultsForSearchChanged(
    `type`: minimumResultsForSearchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minimumResultsForSearchChanged(
    `type`: minimumResultsForSearchChanged,
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
          typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
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
          typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
        ]) | (DataProvider[K, D]) | Null
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_ChildKeysChildrenLabelValue], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_ChildKeysChildrenLabelValue], 
      _
    ],
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
  def addEventListener_valueOptionChanged(
    `type`: valueOptionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_LabelValue], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionChanged(
    `type`: valueOptionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_LabelValue], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_minimumResultsForSearch(property: minimumResultsForSearch): Double = js.native
  @JSName("getProperty")
  def getProperty_optionRenderer(property: optionRenderer): js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  @JSName("getProperty")
  def getProperty_options(property: options): (js.Array[
    typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_optionsKeys(property: optionsKeys): Anon_ChildKeysChildrenLabelValue = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: pickerAttributes): Anon_Class = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: placeholder): String | Null = js.native
  @JSName("getProperty")
  def getProperty_readOnly(property: readOnly): Boolean = js.native
  @JSName("getProperty")
  def getProperty_renderMode(property: renderMode): jet | native = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  @JSName("getProperty")
  def getProperty_valueOption(property: valueOption): Anon_LabelValue = js.native
  def setProperties(properties: ojSelectOneSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: renderMode, value: jet): Unit = js.native
  def setProperty(property: renderMode, value: native): Unit = js.native
  @JSName("setProperty")
  def setProperty_minimumResultsForSearch(property: minimumResultsForSearch, value: Double): Unit = js.native
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
      typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionsKeys(property: optionsKeys, value: Anon_ChildKeysChildrenLabelValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(property: pickerAttributes, value: Anon_Class): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_FilterFurtherMoreMatchesFound): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueOption(property: valueOption, value: Anon_LabelValue): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojselectcombobox", "ojSelectOne")
@js.native
object ojSelectOne extends js.Object {
  type ojAnimateEnd = CustomEvent[Anon_Action]
  type ojAnimateStart = CustomEvent[Anon_ActionElement]
}

