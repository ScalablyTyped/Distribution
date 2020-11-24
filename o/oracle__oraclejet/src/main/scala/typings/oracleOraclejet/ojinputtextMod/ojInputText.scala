package typings.oracleOraclejet.ojinputtextMod

import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.anon.Element
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojinputtextMod.ojInputText.ojAnimateEnd
import typings.oracleOraclejet.ojinputtextMod.ojInputText.ojAnimateStart
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.oracleOraclejetStrings.always
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.clearIcon
import typings.oracleOraclejet.oracleOraclejetStrings.clearIconChanged
import typings.oracleOraclejet.oracleOraclejetStrings.conditional
import typings.oracleOraclejet.oracleOraclejetStrings.converter
import typings.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typings.oracleOraclejet.oracleOraclejetStrings.email
import typings.oracleOraclejet.oracleOraclejetStrings.list
import typings.oracleOraclejet.oracleOraclejetStrings.listChanged
import typings.oracleOraclejet.oracleOraclejetStrings.never
import typings.oracleOraclejet.oracleOraclejetStrings.number
import typings.oracleOraclejet.oracleOraclejetStrings.rawValueChanged
import typings.oracleOraclejet.oracleOraclejetStrings.search
import typings.oracleOraclejet.oracleOraclejetStrings.tel
import typings.oracleOraclejet.oracleOraclejetStrings.text
import typings.oracleOraclejet.oracleOraclejetStrings.url
import typings.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typings.oracleOraclejet.oracleOraclejetStrings.virtualKeyboard
import typings.oracleOraclejet.oracleOraclejetStrings.virtualKeyboardChanged
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojInputText
  extends inputBase[js.Any, ojInputTextSettableProperties, js.Any, js.Any] {
  
  def addEventListener(
    `type`: clearIconChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[never | always | conditional], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: clearIconChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[never | always | conditional], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojinputtext.inputBase<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojInputTextSettableProperties, any, any>['rawValue'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojinputtext.inputBase<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojInputTextSettableProperties, any, any>['rawValue'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojeditablevalue.editableValue<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojInputTextSettableProperties, any, any>['value'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojeditablevalue.editableValue<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojInputTextSettableProperties, any, any>['value'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: virtualKeyboardChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | email | number | search | tel | text | url], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: virtualKeyboardChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | email | number | search | tel | text | url], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Converter[_] | RegisteredConverter | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Converter[_] | RegisteredConverter | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_listChanged(
    `type`: listChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_listChanged(
    `type`: listChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  
  var clearIcon: never | always | conditional = js.native
  
  var converter: Converter[_] | RegisteredConverter | Null = js.native
  
  @JSName("getProperty")
  def getProperty_clearIcon(property: clearIcon): never | always | conditional = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[_] | RegisteredConverter | Null = js.native
  @JSName("getProperty")
  def getProperty_list(property: list): String = js.native
  @JSName("getProperty")
  def getProperty_virtualKeyboard(property: virtualKeyboard): auto | email | number | search | tel | text | url = js.native
  
  var list: String = js.native
  
  var onClearIconChanged: (js.Function1[/* event */ JetElementCustomEvent[never | always | conditional], _]) | Null = js.native
  
  var onConverterChanged: (js.Function1[/* event */ JetElementCustomEvent[Converter[_] | RegisteredConverter | Null], _]) | Null = js.native
  
  var onListChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputText: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputText: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  
  var onVirtualKeyboardChanged: (js.Function1[
    /* event */ JetElementCustomEvent[auto | email | number | search | tel | text | url], 
    _
  ]) | Null = js.native
  
  def setProperties(properties: ojInputTextSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: clearIcon, value: always): Unit = js.native
  def setProperty(property: clearIcon, value: conditional): Unit = js.native
  def setProperty(property: clearIcon, value: never): Unit = js.native
  def setProperty(property: virtualKeyboard, value: auto): Unit = js.native
  def setProperty(property: virtualKeyboard, value: email): Unit = js.native
  def setProperty(property: virtualKeyboard, value: number): Unit = js.native
  def setProperty(property: virtualKeyboard, value: search): Unit = js.native
  def setProperty(property: virtualKeyboard, value: tel): Unit = js.native
  def setProperty(property: virtualKeyboard, value: text): Unit = js.native
  def setProperty(property: virtualKeyboard, value: url): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[_]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_list(property: list, value: String): Unit = js.native
  
  var virtualKeyboard: auto | email | number | search | tel | text | url = js.native
}
@JSImport("@oracle/oraclejet/ojinputtext", "ojInputText")
@js.native
object ojInputText extends js.Object {
  
  type ojAnimateEnd = CustomEvent[Action]
  
  type ojAnimateStart = CustomEvent[Element]
}
