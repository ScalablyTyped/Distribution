package typings.oracleOraclejet.ojselectcomboboxMod

import typings.oracleOraclejet.AnonAction
import typings.oracleOraclejet.AnonChildrenLabel
import typings.oracleOraclejet.AnonClass
import typings.oracleOraclejet.AnonElement
import typings.oracleOraclejet.AnonLabelValue
import typings.oracleOraclejet.AnonMoreMatchesFound
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.OptionContext
import typings.oracleOraclejet.ojselectcomboboxMod.ojSelectMany.ojAnimateEnd
import typings.oracleOraclejet.ojselectcomboboxMod.ojSelectMany.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.jet
import typings.oracleOraclejet.oracleOraclejetStrings.minimumResultsForSearch
import typings.oracleOraclejet.oracleOraclejetStrings.minimumResultsForSearchChanged
import typings.oracleOraclejet.oracleOraclejetStrings.native
import typings.oracleOraclejet.oracleOraclejetStrings.optionRenderer
import typings.oracleOraclejet.oracleOraclejetStrings.optionRendererChanged
import typings.oracleOraclejet.oracleOraclejetStrings.options
import typings.oracleOraclejet.oracleOraclejetStrings.optionsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.optionsKeys
import typings.oracleOraclejet.oracleOraclejetStrings.optionsKeysChanged
import typings.oracleOraclejet.oracleOraclejetStrings.pickerAttributes
import typings.oracleOraclejet.oracleOraclejetStrings.pickerAttributesChanged
import typings.oracleOraclejet.oracleOraclejetStrings.placeholder
import typings.oracleOraclejet.oracleOraclejetStrings.placeholderChanged
import typings.oracleOraclejet.oracleOraclejetStrings.readOnly
import typings.oracleOraclejet.oracleOraclejetStrings.readOnlyChanged
import typings.oracleOraclejet.oracleOraclejetStrings.renderMode
import typings.oracleOraclejet.oracleOraclejetStrings.renderModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.required
import typings.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.value
import typings.oracleOraclejet.oracleOraclejetStrings.valueOptions
import typings.oracleOraclejet.oracleOraclejetStrings.valueOptionsChanged
import typings.std.CustomEvent
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSelectMany[K, D]
  extends ojSelect[
      js.Array[js.Any] | Null, 
      ojSelectManySettableProperties[K, D], 
      js.Array[js.Any] | Null
    ] {
  var minimumResultsForSearch: Double = js.native
  var onMinimumResultsForSearchChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSelectMany: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSelectMany: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onOptionRendererChanged: (js.Function1[
    /* event */ JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null]], 
    _
  ]) | Null = js.native
  var onOptionsChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      (js.Array[
        typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
      ]) | (DataProvider[K, D]) | Null
    ], 
    _
  ]) | Null = js.native
  var onOptionsKeysChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonChildrenLabel], _]) | Null = js.native
  var onPickerAttributesChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonClass], _]) | Null = js.native
  var onPlaceholderChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onReadOnlyChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onRenderModeChanged: (js.Function1[/* event */ JetElementCustomEvent[jet | native], _]) | Null = js.native
  var onRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  @JSName("onValueChanged")
  var onValueChanged_ojSelectMany: (js.Function1[/* event */ JetElementCustomEvent[js.Array[_] | Null], _]) | Null = js.native
  var onValueOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[AnonLabelValue] | Null], _]) | Null = js.native
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  var options: (js.Array[
    typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  var optionsKeys: AnonChildrenLabel = js.native
  var pickerAttributes: AnonClass = js.native
  var placeholder: String | Null = js.native
  var readOnly: Boolean = js.native
  var renderMode: jet | native = js.native
  var required: Boolean = js.native
  @JSName("translations")
  var translations_ojSelectMany: AnonMoreMatchesFound = js.native
  var valueOptions: js.Array[AnonLabelValue] | Null = js.native
  @JSName("value")
  var value_ojSelectMany: js.Array[_] | Null = js.native
  def addEventListener(
    `type`: renderModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[jet | native], _]
  ): Unit = js.native
  def addEventListener(
    `type`: renderModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[jet | native], _],
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
          typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
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
          typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
        ]) | (DataProvider[K, D]) | Null
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonChildrenLabel], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonChildrenLabel], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: pickerAttributesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonClass], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: pickerAttributesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonClass], _],
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
  def addEventListener_valueOptionsChanged(
    `type`: valueOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Array[AnonLabelValue] | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionsChanged(
    `type`: valueOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Array[AnonLabelValue] | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_minimumResultsForSearch(property: minimumResultsForSearch): Double = js.native
  @JSName("getProperty")
  def getProperty_optionRenderer(property: optionRenderer): js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  @JSName("getProperty")
  def getProperty_options(property: options): (js.Array[
    typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_optionsKeys(property: optionsKeys): AnonChildrenLabel = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: pickerAttributes): AnonClass = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: placeholder): String | Null = js.native
  @JSName("getProperty")
  def getProperty_readOnly(property: readOnly): Boolean = js.native
  @JSName("getProperty")
  def getProperty_renderMode(property: renderMode): jet | native = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  @JSName("getProperty")
  def getProperty_valueOptions(property: valueOptions): js.Array[AnonLabelValue] | Null = js.native
  def setProperties(properties: ojSelectManySettablePropertiesLenient[K, D]): Unit = js.native
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
      typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionsKeys(property: optionsKeys, value: AnonChildrenLabel): Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(property: pickerAttributes, value: AnonClass): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonMoreMatchesFound): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: js.Array[_]): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueOptions(property: valueOptions): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueOptions(property: valueOptions, value: js.Array[AnonLabelValue]): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojselectcombobox", "ojSelectMany")
@js.native
object ojSelectMany extends js.Object {
  type ojAnimateEnd = CustomEvent[AnonAction]
  type ojAnimateStart = CustomEvent[AnonElement]
}

