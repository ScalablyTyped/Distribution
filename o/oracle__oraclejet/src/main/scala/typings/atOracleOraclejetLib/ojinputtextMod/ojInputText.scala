package typings
package atOracleOraclejetLib.ojinputtextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputText
  extends inputBase[js.Any, ojInputTextSettableProperties, js.Any, js.Any] {
  var clearIcon: atOracleOraclejetLib.atOracleOraclejetLibStrings.never | atOracleOraclejetLib.atOracleOraclejetLibStrings.always | atOracleOraclejetLib.atOracleOraclejetLibStrings.conditional = js.native
  var converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null = js.native
  var list: java.lang.String = js.native
  var onClearIconChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.never | atOracleOraclejetLib.atOracleOraclejetLibStrings.always | atOracleOraclejetLib.atOracleOraclejetLibStrings.conditional
    ], 
    _
  ]) | scala.Null = js.native
  var onConverterChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var onListChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputText: (js.Function1[/* event */ atOracleOraclejetLib.ojinputtextMod.ojInputTextNs.ojAnimateEnd, _]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputText: (js.Function1[/* event */ atOracleOraclejetLib.ojinputtextMod.ojInputTextNs.ojAnimateStart, _]) | scala.Null = js.native
  var onVirtualKeyboardChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.email | atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.search | atOracleOraclejetLib.atOracleOraclejetLibStrings.tel | atOracleOraclejetLib.atOracleOraclejetLibStrings.text | atOracleOraclejetLib.atOracleOraclejetLibStrings.url
    ], 
    _
  ]) | scala.Null = js.native
  var virtualKeyboard: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.email | atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.search | atOracleOraclejetLib.atOracleOraclejetLibStrings.tel | atOracleOraclejetLib.atOracleOraclejetLibStrings.text | atOracleOraclejetLib.atOracleOraclejetLibStrings.url = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.clearIconChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.never | atOracleOraclejetLib.atOracleOraclejetLibStrings.always | atOracleOraclejetLib.atOracleOraclejetLibStrings.conditional
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.clearIconChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.never | atOracleOraclejetLib.atOracleOraclejetLibStrings.always | atOracleOraclejetLib.atOracleOraclejetLibStrings.conditional
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
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.email | atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.search | atOracleOraclejetLib.atOracleOraclejetLibStrings.tel | atOracleOraclejetLib.atOracleOraclejetLibStrings.text | atOracleOraclejetLib.atOracleOraclejetLibStrings.url
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboardChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.email | atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.search | atOracleOraclejetLib.atOracleOraclejetLibStrings.tel | atOracleOraclejetLib.atOracleOraclejetLibStrings.text | atOracleOraclejetLib.atOracleOraclejetLibStrings.url
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
  def addEventListener_listChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.listChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_listChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.listChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_clearIcon(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.clearIcon): atOracleOraclejetLib.atOracleOraclejetLibStrings.never | atOracleOraclejetLib.atOracleOraclejetLibStrings.always | atOracleOraclejetLib.atOracleOraclejetLibStrings.conditional = js.native
  @JSName("getProperty")
  def getProperty_converter(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.converter): atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_list(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.list): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_virtualKeyboard(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboard): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.email | atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.search | atOracleOraclejetLib.atOracleOraclejetLibStrings.tel | atOracleOraclejetLib.atOracleOraclejetLibStrings.text | atOracleOraclejetLib.atOracleOraclejetLibStrings.url = js.native
  def setProperties(properties: ojInputTextSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.clearIcon,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.always
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.clearIcon,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.conditional
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.clearIcon,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.never
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboard,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboard,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.email
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboard,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.number
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboard,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.search
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboard,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.tel
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboard,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.text
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.virtualKeyboard,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.url
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
  def setProperty_list(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.list, value: java.lang.String): scala.Unit = js.native
}

