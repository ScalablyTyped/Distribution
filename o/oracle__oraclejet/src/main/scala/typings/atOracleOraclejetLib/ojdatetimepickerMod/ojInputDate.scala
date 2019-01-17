package typings
package atOracleOraclejetLib.ojdatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputDate[SP /* <: ojInputDateSettableProperties */]
  extends atOracleOraclejetLib.ojinputtextMod.inputBase[java.lang.String, SP, java.lang.String, java.lang.String] {
  var converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter = js.native
  var datePicker: atOracleOraclejetLib.`Anon_` = js.native
  var dayMetaData: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[atOracleOraclejetLib.Anon_ClassNameDisabled]
    ]
  ] = js.native
  var keyboardEdit: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled = js.native
  var max: java.lang.String | scala.Null = js.native
  var min: java.lang.String | scala.Null = js.native
  var onConverterChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
    ], 
    _
  ]) | scala.Null = js.native
  var onDatePickerChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.`Anon_`], 
    _
  ]) | scala.Null = js.native
  var onDayFormatterChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.Function1[
        /* param */ atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterInput, 
        scala.Null | atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterOutput
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onDayMetaDataChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      org.scalablytyped.runtime.StringDictionary[
        org.scalablytyped.runtime.StringDictionary[
          org.scalablytyped.runtime.StringDictionary[atOracleOraclejetLib.Anon_ClassNameDisabled]
        ]
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onKeyboardEditChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
    ], 
    _
  ]) | scala.Null = js.native
  var onMaxChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onMinChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputDate: (js.Function1[/* event */ atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.ojAnimateEnd, _]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputDate: (js.Function1[
    /* event */ atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  var onPickerAttributesChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Class], 
    _
  ]) | scala.Null = js.native
  var onRenderModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native
    ], 
    _
  ]) | scala.Null = js.native
  var pickerAttributes: atOracleOraclejetLib.Anon_Class = js.native
  var renderMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native = js.native
  @JSName("translations")
  var translations_ojInputDate: atOracleOraclejetLib.Anon_CurrentText = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dayFormatterChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.Function1[
          /* param */ atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterInput, 
          scala.Null | atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterOutput
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dayFormatterChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.Function1[
          /* param */ atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterInput, 
          scala.Null | atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterOutput
        ]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.keyboardEditChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.keyboardEditChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
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
  def addEventListener_converterChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.converterChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
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
        atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datePickerChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.datePickerChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.`Anon_`], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datePickerChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.datePickerChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.`Anon_`], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dayMetaDataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dayMetaDataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        org.scalablytyped.runtime.StringDictionary[
          org.scalablytyped.runtime.StringDictionary[
            org.scalablytyped.runtime.StringDictionary[atOracleOraclejetLib.Anon_ClassNameDisabled]
          ]
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dayMetaDataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dayMetaDataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        org.scalablytyped.runtime.StringDictionary[
          org.scalablytyped.runtime.StringDictionary[
            org.scalablytyped.runtime.StringDictionary[atOracleOraclejetLib.Anon_ClassNameDisabled]
          ]
        ]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
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
  def dayFormatter(param: atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterInput): scala.Null | atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterOutput = js.native
  @JSName("getProperty")
  def getProperty_converter(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.converter): atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter = js.native
  @JSName("getProperty")
  def getProperty_datePicker(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.datePicker): atOracleOraclejetLib.`Anon_` = js.native
  @JSName("getProperty")
  def getProperty_dayMetaData(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dayMetaData): org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[atOracleOraclejetLib.Anon_ClassNameDisabled]
    ]
  ] = js.native
  @JSName("getProperty")
  def getProperty_keyboardEdit(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.keyboardEdit): atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled = js.native
  @JSName("getProperty")
  def getProperty_max(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.max): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_min(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.min): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.pickerAttributes): atOracleOraclejetLib.Anon_Class = js.native
  @JSName("getProperty")
  def getProperty_renderMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.renderMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native = js.native
  def hide(): scala.Unit = js.native
  def setProperties(properties: ojInputDateSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.keyboardEdit,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.keyboardEdit,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.renderMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.renderMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.native
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.converter,
    value: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.converter,
    value: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_datePicker(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.datePicker,
    value: atOracleOraclejetLib.`Anon_`
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_dayMetaData(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dayMetaData,
    value: org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[
        org.scalablytyped.runtime.StringDictionary[atOracleOraclejetLib.Anon_ClassNameDisabled]
      ]
    ]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.max): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.max, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.min): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.min, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.pickerAttributes,
    value: atOracleOraclejetLib.Anon_Class
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_CurrentText
  ): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

