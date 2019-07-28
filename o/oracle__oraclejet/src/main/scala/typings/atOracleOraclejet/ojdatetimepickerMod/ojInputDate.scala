package typings.atOracleOraclejet.ojdatetimepickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.Anon_
import typings.atOracleOraclejet.Anon_Class
import typings.atOracleOraclejet.Anon_ClassNameDisabled
import typings.atOracleOraclejet.Anon_CurrentText
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.converter
import typings.atOracleOraclejet.atOracleOraclejetStrings.converterChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.datePicker
import typings.atOracleOraclejet.atOracleOraclejetStrings.datePickerChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.dayFormatterChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.dayMetaData
import typings.atOracleOraclejet.atOracleOraclejetStrings.dayMetaDataChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.enabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.jet
import typings.atOracleOraclejet.atOracleOraclejetStrings.keyboardEdit
import typings.atOracleOraclejet.atOracleOraclejetStrings.keyboardEditChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.max
import typings.atOracleOraclejet.atOracleOraclejetStrings.maxChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.min
import typings.atOracleOraclejet.atOracleOraclejetStrings.minChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.native
import typings.atOracleOraclejet.atOracleOraclejetStrings.pickerAttributes
import typings.atOracleOraclejet.atOracleOraclejetStrings.pickerAttributesChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.renderMode
import typings.atOracleOraclejet.atOracleOraclejetStrings.renderModeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.ojdatetimepickerMod.ojInputDateNs.DayFormatterInput
import typings.atOracleOraclejet.ojdatetimepickerMod.ojInputDateNs.DayFormatterOutput
import typings.atOracleOraclejet.ojdatetimepickerMod.ojInputDateNs.ojAnimateEnd
import typings.atOracleOraclejet.ojdatetimepickerMod.ojInputDateNs.ojAnimateStart
import typings.atOracleOraclejet.ojinputtextMod.inputBase
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import typings.atOracleOraclejet.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputDate[SP /* <: ojInputDateSettableProperties */] extends inputBase[String, SP, String, String] {
  var converter: Converter[String] | RegisteredConverter = js.native
  var datePicker: Anon_ = js.native
  var dayMetaData: StringDictionary[StringDictionary[StringDictionary[Anon_ClassNameDisabled]]] = js.native
  var keyboardEdit: enabled | disabled = js.native
  var max: String | Null = js.native
  var min: String | Null = js.native
  var onConverterChanged: (js.Function1[/* event */ JetElementCustomEvent[Converter[String] | RegisteredConverter], _]) | Null = js.native
  var onDatePickerChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_], _]) | Null = js.native
  var onDayFormatterChanged: (js.Function1[
    /* event */ JetElementCustomEvent[js.Function1[/* param */ DayFormatterInput, Null | all | DayFormatterOutput]], 
    _
  ]) | Null = js.native
  var onDayMetaDataChanged: (js.Function1[
    /* event */ JetElementCustomEvent[StringDictionary[StringDictionary[StringDictionary[Anon_ClassNameDisabled]]]], 
    _
  ]) | Null = js.native
  var onKeyboardEditChanged: (js.Function1[/* event */ JetElementCustomEvent[enabled | disabled], _]) | Null = js.native
  var onMaxChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onMinChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputDate: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputDate: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onPickerAttributesChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_Class], _]) | Null = js.native
  var onRenderModeChanged: (js.Function1[/* event */ JetElementCustomEvent[jet | native], _]) | Null = js.native
  var pickerAttributes: Anon_Class = js.native
  var renderMode: jet | native = js.native
  @JSName("translations")
  var translations_ojInputDate: Anon_CurrentText = js.native
  def addEventListener(
    `type`: dayFormatterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function1[/* param */ DayFormatterInput, Null | all | DayFormatterOutput]], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: dayFormatterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function1[/* param */ DayFormatterInput, Null | all | DayFormatterOutput]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: keyboardEditChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[enabled | disabled], _]
  ): Unit = js.native
  def addEventListener(
    `type`: keyboardEditChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[enabled | disabled], _],
    useCapture: Boolean
  ): Unit = js.native
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
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Converter[String] | RegisteredConverter], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Converter[String] | RegisteredConverter], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datePickerChanged(
    `type`: datePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datePickerChanged(
    `type`: datePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dayMetaDataChanged(
    `type`: dayMetaDataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[StringDictionary[StringDictionary[StringDictionary[Anon_ClassNameDisabled]]]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dayMetaDataChanged(
    `type`: dayMetaDataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[StringDictionary[StringDictionary[StringDictionary[Anon_ClassNameDisabled]]]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
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
  def dayFormatter(param: DayFormatterInput): Null | all | DayFormatterOutput = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[String] | RegisteredConverter = js.native
  @JSName("getProperty")
  def getProperty_datePicker(property: datePicker): Anon_ = js.native
  @JSName("getProperty")
  def getProperty_dayMetaData(property: dayMetaData): StringDictionary[StringDictionary[StringDictionary[Anon_ClassNameDisabled]]] = js.native
  @JSName("getProperty")
  def getProperty_keyboardEdit(property: keyboardEdit): enabled | disabled = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): String | Null = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): String | Null = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: pickerAttributes): Anon_Class = js.native
  @JSName("getProperty")
  def getProperty_renderMode(property: renderMode): jet | native = js.native
  def hide(): Unit = js.native
  def setProperties(properties: ojInputDateSettablePropertiesLenient): Unit = js.native
  def setProperty(property: keyboardEdit, value: disabled): Unit = js.native
  def setProperty(property: keyboardEdit, value: enabled): Unit = js.native
  def setProperty(property: renderMode, value: jet): Unit = js.native
  def setProperty(property: renderMode, value: native): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_datePicker(property: datePicker, value: Anon_): Unit = js.native
  @JSName("setProperty")
  def setProperty_dayMetaData(
    property: dayMetaData,
    value: StringDictionary[StringDictionary[StringDictionary[Anon_ClassNameDisabled]]]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(property: pickerAttributes, value: Anon_Class): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_CurrentText): Unit = js.native
  def show(): Unit = js.native
}

