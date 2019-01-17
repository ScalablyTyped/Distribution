package typings
package atOracleOraclejetLib.ojdatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDateTimePicker extends ojInputDateTime[ojDateTimePickerSettableProperties] {
  @JSName("keyboardEdit")
  var keyboardEdit_ojDateTimePicker: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled = js.native
  @JSName("onMaxChanged")
  var onMaxChanged_ojDateTimePicker: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['max'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  @JSName("onMinChanged")
  var onMinChanged_ojDateTimePicker: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['min'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojDateTimePicker: (js.Function1[
    /* event */ atOracleOraclejetLib.ojdatetimepickerMod.ojDateTimePickerNs.ojAnimateEnd, 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojDateTimePicker: (js.Function1[
    /* event */ atOracleOraclejetLib.ojdatetimepickerMod.ojDateTimePickerNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  @JSName("onValueChanged")
  var onValueChanged_ojDateTimePicker: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['value'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  @JSName("renderMode")
  var renderMode_ojDateTimePicker: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet = js.native
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
  def setProperties(properties: ojDateTimePickerSettablePropertiesLenient): scala.Unit = js.native
}

