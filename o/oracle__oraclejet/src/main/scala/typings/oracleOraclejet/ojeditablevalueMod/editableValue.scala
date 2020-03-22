package typings.oracleOraclejet.ojeditablevalueMod

import typings.oracleOraclejet.AnonAction
import typings.oracleOraclejet.AnonConverterHint
import typings.oracleOraclejet.AnonDefinition
import typings.oracleOraclejet.AnonElement
import typings.oracleOraclejet.AnonInstruction
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateEnd
import typings.oracleOraclejet.ojeditablevalueMod.editableValue.ojAnimateStart
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.oracleOraclejetStrings.describedBy
import typings.oracleOraclejet.oracleOraclejetStrings.describedByChanged
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typings.oracleOraclejet.oracleOraclejetStrings.displayOptions
import typings.oracleOraclejet.oracleOraclejetStrings.displayOptionsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.help
import typings.oracleOraclejet.oracleOraclejetStrings.helpChanged
import typings.oracleOraclejet.oracleOraclejetStrings.helpHints
import typings.oracleOraclejet.oracleOraclejetStrings.helpHintsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.labelHint
import typings.oracleOraclejet.oracleOraclejetStrings.labelHintChanged
import typings.oracleOraclejet.oracleOraclejetStrings.messagesCustom
import typings.oracleOraclejet.oracleOraclejetStrings.messagesCustomChanged
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.validChanged
import typings.oracleOraclejet.oracleOraclejetStrings.value
import typings.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait editableValue[V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV] extends baseComponent[SP] {
  var describedBy: String | Null = js.native
  var disabled: Boolean = js.native
  var displayOptions: AnonConverterHint = js.native
  var help: AnonInstruction = js.native
  var helpHints: AnonDefinition = js.native
  var labelHint: String = js.native
  var messagesCustom: js.Array[^] = js.native
  var onDescribedByChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onDisabledChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onDisplayOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonConverterHint], _]) | Null = js.native
  var onHelpChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonInstruction], _]) | Null = js.native
  var onHelpHintsChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonDefinition], _]) | Null = js.native
  var onLabelHintChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onMessagesCustomChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[^]], _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onValidChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
    ], 
    _
  ]) | Null = js.native
  var onValueChanged: (js.Function1[/* event */ JetElementCustomEvent[V], _]) | Null = js.native
  val valid: typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
  var value: V = js.native
  def addEventListener(
    `type`: validChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: validChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonConverterHint], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_displayOptionsChanged(
    `type`: displayOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonConverterHint], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(
    `type`: helpChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonInstruction], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(
    `type`: helpChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonInstruction], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpHintsChanged(
    `type`: helpHintsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonDefinition], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpHintsChanged(
    `type`: helpHintsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonDefinition], _],
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
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateEnd, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateEnd, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAnimateStart, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart,
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
  def getProperty_displayOptions(property: displayOptions): AnonConverterHint = js.native
  @JSName("getProperty")
  def getProperty_help(property: help): AnonInstruction = js.native
  @JSName("getProperty")
  def getProperty_helpHints(property: helpHints): AnonDefinition = js.native
  @JSName("getProperty")
  def getProperty_labelHint(property: labelHint): String = js.native
  @JSName("getProperty")
  def getProperty_messagesCustom(property: messagesCustom): js.Array[^] = js.native
  @JSName("getProperty")
  def getProperty_valid(property: typings.oracleOraclejet.oracleOraclejetStrings.valid): typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): V = js.native
  def reset(): Unit = js.native
  def setProperties(properties: editableValueSettablePropertiesLenient[V, SV, RV]): Unit = js.native
  def setProperty(property: typings.oracleOraclejet.oracleOraclejetStrings.valid, value: invalidHidden): Unit = js.native
  def setProperty(property: typings.oracleOraclejet.oracleOraclejetStrings.valid, value: invalidShown): Unit = js.native
  def setProperty(property: typings.oracleOraclejet.oracleOraclejetStrings.valid, value: pending): Unit = js.native
  @JSName("setProperty")
  def setProperty_describedBy(property: describedBy): Unit = js.native
  @JSName("setProperty")
  def setProperty_describedBy(property: describedBy, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_displayOptions(property: displayOptions, value: AnonConverterHint): Unit = js.native
  @JSName("setProperty")
  def setProperty_help(property: help, value: AnonInstruction): Unit = js.native
  @JSName("setProperty")
  def setProperty_helpHints(property: helpHints, value: AnonDefinition): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelHint(property: labelHint, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_messagesCustom(property: messagesCustom, value: js.Array[^]): Unit = js.native
  @JSName("setProperty")
  def setProperty_valid(
    property: typings.oracleOraclejet.oracleOraclejetStrings.valid,
    value: typings.oracleOraclejet.oracleOraclejetStrings.valid
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: SV): Unit = js.native
  def showMessages(): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojeditablevalue", "editableValue")
@js.native
object editableValue extends js.Object {
  type ojAnimateEnd = CustomEvent[AnonAction]
  type ojAnimateStart = CustomEvent[AnonElement]
}

