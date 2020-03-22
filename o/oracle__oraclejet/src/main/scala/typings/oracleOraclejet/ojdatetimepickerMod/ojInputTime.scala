package typings.oracleOraclejet.ojdatetimepickerMod

import typings.oracleOraclejet.AnonAction
import typings.oracleOraclejet.AnonAmpmWheelLabel
import typings.oracleOraclejet.AnonClass
import typings.oracleOraclejet.AnonElement
import typings.oracleOraclejet.AnonFooterLayout
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdatetimepickerMod.ojInputTime.ojAnimateEnd
import typings.oracleOraclejet.ojdatetimepickerMod.ojInputTime.ojAnimateStart
import typings.oracleOraclejet.ojinputtextMod.inputBase
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.oracleOraclejetStrings.converter
import typings.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import typings.oracleOraclejet.oracleOraclejetStrings.jet
import typings.oracleOraclejet.oracleOraclejetStrings.keyboardEdit
import typings.oracleOraclejet.oracleOraclejetStrings.keyboardEditChanged
import typings.oracleOraclejet.oracleOraclejetStrings.max
import typings.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typings.oracleOraclejet.oracleOraclejetStrings.min
import typings.oracleOraclejet.oracleOraclejetStrings.minChanged
import typings.oracleOraclejet.oracleOraclejetStrings.native
import typings.oracleOraclejet.oracleOraclejetStrings.pickerAttributes
import typings.oracleOraclejet.oracleOraclejetStrings.pickerAttributesChanged
import typings.oracleOraclejet.oracleOraclejetStrings.renderMode
import typings.oracleOraclejet.oracleOraclejetStrings.renderModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.timePicker
import typings.oracleOraclejet.oracleOraclejetStrings.timePickerChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputTime extends inputBase[String, ojInputTimeSettableProperties, String, String] {
  var converter: Converter[String] | RegisteredConverter = js.native
  var keyboardEdit: enabled | disabled = js.native
  var max: String | Null = js.native
  var min: String | Null = js.native
  var onConverterChanged: (js.Function1[/* event */ JetElementCustomEvent[Converter[String] | RegisteredConverter], _]) | Null = js.native
  var onKeyboardEditChanged: (js.Function1[/* event */ JetElementCustomEvent[enabled | disabled], _]) | Null = js.native
  var onMaxChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onMinChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputTime: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputTime: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onPickerAttributesChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonClass], _]) | Null = js.native
  var onRenderModeChanged: (js.Function1[/* event */ JetElementCustomEvent[jet | native], _]) | Null = js.native
  var onTimePickerChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonFooterLayout], _]) | Null = js.native
  var pickerAttributes: AnonClass = js.native
  var renderMode: jet | native = js.native
  var timePicker: AnonFooterLayout = js.native
  @JSName("translations")
  var translations_ojInputTime: AnonAmpmWheelLabel = js.native
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonClass], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: pickerAttributesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonClass], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(
    `type`: timePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonFooterLayout], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(
    `type`: timePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonFooterLayout], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[String] | RegisteredConverter = js.native
  @JSName("getProperty")
  def getProperty_keyboardEdit(property: keyboardEdit): enabled | disabled = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): String | Null = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): String | Null = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: pickerAttributes): AnonClass = js.native
  @JSName("getProperty")
  def getProperty_renderMode(property: renderMode): jet | native = js.native
  @JSName("getProperty")
  def getProperty_timePicker(property: timePicker): AnonFooterLayout = js.native
  def hide(): Unit = js.native
  def setProperties(properties: ojInputTimeSettablePropertiesLenient): Unit = js.native
  def setProperty(property: keyboardEdit, value: disabled): Unit = js.native
  def setProperty(property: keyboardEdit, value: enabled): Unit = js.native
  def setProperty(property: renderMode, value: jet): Unit = js.native
  def setProperty(property: renderMode, value: native): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(property: pickerAttributes, value: AnonClass): Unit = js.native
  @JSName("setProperty")
  def setProperty_timePicker(property: timePicker, value: AnonFooterLayout): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonAmpmWheelLabel): Unit = js.native
  def show(): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojdatetimepicker", "ojInputTime")
@js.native
object ojInputTime extends js.Object {
  type ojAnimateEnd = CustomEvent[AnonAction]
  type ojAnimateStart = CustomEvent[AnonElement]
}

