package typings.oracleOraclejet.ojinputtextMod

import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.anon.Element
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojinputtextMod.ojTextArea.ojAnimateEnd
import typings.oracleOraclejet.ojinputtextMod.ojTextArea.ojAnimateStart
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.oracleOraclejetStrings.converter
import typings.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typings.oracleOraclejet.oracleOraclejetStrings.rawValueChanged
import typings.oracleOraclejet.oracleOraclejetStrings.rows
import typings.oracleOraclejet.oracleOraclejetStrings.rowsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojTextArea
  extends StObject
     with inputBase[Any, ojTextAreaSettableProperties, Any, Any] {
  
  def addEventListener(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojinputtext.inputBase<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojTextAreaSettableProperties, any, any>['rawValue'] */ js.Any
      ], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojinputtext.inputBase<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojTextAreaSettableProperties, any, any>['rawValue'] */ js.Any
      ], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojeditablevalue.editableValue<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojTextAreaSettableProperties, any, any>['value'] */ js.Any
      ], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojeditablevalue.editableValue<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojTextAreaSettableProperties, any, any>['value'] */ js.Any
      ], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Converter[Any] | RegisteredConverter | Null], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Converter[Any] | RegisteredConverter | Null], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsChanged(
    `type`: rowsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsChanged(
    `type`: rowsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], Any],
    useCapture: Boolean
  ): Unit = js.native
  
  var converter: Converter[Any] | RegisteredConverter | Null = js.native
  
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[Any] | RegisteredConverter | Null = js.native
  @JSName("getProperty")
  def getProperty_rows(property: rows): Double = js.native
  
  var onConverterChanged: (js.Function1[
    /* event */ JetElementCustomEvent[Converter[Any] | RegisteredConverter | Null], 
    Any
  ]) | Null = js.native
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojTextArea: (js.Function1[/* event */ ojAnimateEnd, Any]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojTextArea: (js.Function1[/* event */ ojAnimateStart, Any]) | Null = js.native
  
  var onRowsChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], Any]) | Null = js.native
  
  var rows: Double = js.native
  
  def setProperties(properties: ojTextAreaSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_converter(property: converter): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[Any]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_rows(property: rows, value: Double): Unit = js.native
}
object ojTextArea {
  
  type ojAnimateEnd = CustomEvent[Action]
  
  type ojAnimateStart = CustomEvent[Element]
}
