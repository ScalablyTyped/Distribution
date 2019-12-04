package typings.atOracleOraclejet.ojeditablevalueMod

import typings.atOracleOraclejet.Anon_Action
import typings.atOracleOraclejet.Anon_ActionElement
import typings.atOracleOraclejet.Anon_ConverterHint
import typings.atOracleOraclejet.Anon_Definition
import typings.atOracleOraclejet.Anon_Instruction
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.describedBy
import typings.atOracleOraclejet.atOracleOraclejetStrings.describedByChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabledChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.displayOptions
import typings.atOracleOraclejet.atOracleOraclejetStrings.displayOptionsChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.help
import typings.atOracleOraclejet.atOracleOraclejetStrings.helpChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.helpHints
import typings.atOracleOraclejet.atOracleOraclejetStrings.helpHintsChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typings.atOracleOraclejet.atOracleOraclejetStrings.labelHint
import typings.atOracleOraclejet.atOracleOraclejetStrings.labelHintChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.messagesCustom
import typings.atOracleOraclejet.atOracleOraclejetStrings.messagesCustomChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.pending
import typings.atOracleOraclejet.atOracleOraclejetStrings.validChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.value
import typings.atOracleOraclejet.atOracleOraclejetStrings.valueChanged
import typings.atOracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateEnd
import typings.atOracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateStart
import typings.atOracleOraclejet.ojmessagingMod.^
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait editableValue[V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV] extends baseComponent[SP] {
  var describedBy: String | Null = js.native
  var disabled: Boolean = js.native
  var displayOptions: Anon_ConverterHint = js.native
  var help: Anon_Instruction = js.native
  var helpHints: Anon_Definition = js.native
  var labelHint: String = js.native
  var messagesCustom: js.Array[^] = js.native
  var onDescribedByChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onDisabledChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onDisplayOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_ConverterHint], _]) | Null = js.native
  var onHelpChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_Instruction], _]) | Null = js.native
  var onHelpHintsChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_Definition], _]) | Null = js.native
  var onLabelHintChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onMessagesCustomChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[^]], _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onValidChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      typings.atOracleOraclejet.atOracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
    ], 
    _
  ]) | Null = js.native
  var onValueChanged: (js.Function1[/* event */ JetElementCustomEvent[V], _]) | Null = js.native
  val valid: typings.atOracleOraclejet.atOracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
  var value: V = js.native
  def addEventListener(
    `type`: validChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        typings.atOracleOraclejet.atOracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: validChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        typings.atOracleOraclejet.atOracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_describedByChanged(
    `type`: describedByChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_describedByChanged(
    `type`: describedByChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_displayOptionsChanged(
    `type`: displayOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_ConverterHint], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_displayOptionsChanged(
    `type`: displayOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_ConverterHint], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(
    `type`: helpChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Instruction], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(
    `type`: helpChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Instruction], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpHintsChanged(
    `type`: helpHintsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Definition], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpHintsChanged(
    `type`: helpHintsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Definition], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelHintChanged(
    `type`: labelHintChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelHintChanged(
    `type`: labelHintChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagesCustomChanged(
    `type`: messagesCustomChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[^]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagesCustomChanged(
    `type`: messagesCustomChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[^]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateEnd, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateEnd, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojAnimateStart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateStart, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojAnimateStart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateStart, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[V], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[V], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_describedBy(property: describedBy): String | Null = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: disabled): Boolean = js.native
  @JSName("getProperty")
  def getProperty_displayOptions(property: displayOptions): Anon_ConverterHint = js.native
  @JSName("getProperty")
  def getProperty_help(property: help): Anon_Instruction = js.native
  @JSName("getProperty")
  def getProperty_helpHints(property: helpHints): Anon_Definition = js.native
  @JSName("getProperty")
  def getProperty_labelHint(property: labelHint): String = js.native
  @JSName("getProperty")
  def getProperty_messagesCustom(property: messagesCustom): js.Array[^] = js.native
  @JSName("getProperty")
  def getProperty_valid(property: typings.atOracleOraclejet.atOracleOraclejetStrings.valid): typings.atOracleOraclejet.atOracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): V = js.native
  def reset(): Unit = js.native
  def setProperties(properties: editableValueSettablePropertiesLenient[V, SV, RV]): Unit = js.native
  def setProperty(property: typings.atOracleOraclejet.atOracleOraclejetStrings.valid, value: invalidHidden): Unit = js.native
  def setProperty(property: typings.atOracleOraclejet.atOracleOraclejetStrings.valid, value: invalidShown): Unit = js.native
  def setProperty(property: typings.atOracleOraclejet.atOracleOraclejetStrings.valid, value: pending): Unit = js.native
  @JSName("setProperty")
  def setProperty_describedBy(property: describedBy): Unit = js.native
  @JSName("setProperty")
  def setProperty_describedBy(property: describedBy, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_displayOptions(property: displayOptions, value: Anon_ConverterHint): Unit = js.native
  @JSName("setProperty")
  def setProperty_help(property: help, value: Anon_Instruction): Unit = js.native
  @JSName("setProperty")
  def setProperty_helpHints(property: helpHints, value: Anon_Definition): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelHint(property: labelHint, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_messagesCustom(property: messagesCustom, value: js.Array[^]): Unit = js.native
  @JSName("setProperty")
  def setProperty_valid(
    property: typings.atOracleOraclejet.atOracleOraclejetStrings.valid,
    value: typings.atOracleOraclejet.atOracleOraclejetStrings.valid
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: SV): Unit = js.native
  def showMessages(): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojeditablevalue", "editableValue")
@js.native
object editableValue extends js.Object {
  type ojAnimateEnd = CustomEvent[Anon_Action]
  type ojAnimateStart = CustomEvent[Anon_ActionElement]
}

