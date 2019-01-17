package typings
package atOracleOraclejetLib.ojeditablevalueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait editableValue[V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[SP] {
  var describedBy: java.lang.String | scala.Null = js.native
  var disabled: scala.Boolean = js.native
  var displayOptions: atOracleOraclejetLib.Anon_ConverterHint = js.native
  var help: atOracleOraclejetLib.Anon_Instruction = js.native
  var helpHints: atOracleOraclejetLib.Anon_Definition = js.native
  var labelHint: java.lang.String = js.native
  var messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced] = js.native
  var onDescribedByChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onDisabledChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
    _
  ]) | scala.Null = js.native
  var onDisplayOptionsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ConverterHint], 
    _
  ]) | scala.Null = js.native
  var onHelpChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Instruction], 
    _
  ]) | scala.Null = js.native
  var onHelpHintsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Definition], 
    _
  ]) | scala.Null = js.native
  var onLabelHintChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onMessagesCustomChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced]], 
    _
  ]) | scala.Null = js.native
  var onOjAnimateEnd: (js.Function1[
    /* event */ atOracleOraclejetLib.ojeditablevalueMod.editableValueNs.ojAnimateEnd, 
    _
  ]) | scala.Null = js.native
  var onOjAnimateStart: (js.Function1[
    /* event */ atOracleOraclejetLib.ojeditablevalueMod.editableValueNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  var onValidChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown
    ], 
    _
  ]) | scala.Null = js.native
  var onValueChanged: (js.Function1[/* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[V], _]) | scala.Null = js.native
  val valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown = js.native
  var value: V = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.validChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.validChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_describedByChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.describedByChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_describedByChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.describedByChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabledChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabledChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_displayOptionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.displayOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ConverterHint], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_displayOptionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.displayOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ConverterHint], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.helpChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Instruction], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.helpChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Instruction], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpHintsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.helpHintsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Definition], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpHintsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.helpHintsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Definition], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelHintChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelHintChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelHintChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelHintChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagesCustomChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.messagesCustomChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagesCustomChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.messagesCustomChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojeditablevalueMod.editableValueNs.ojAnimateEnd, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojeditablevalueMod.editableValueNs.ojAnimateEnd, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojeditablevalueMod.editableValueNs.ojAnimateStart, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojeditablevalueMod.editableValueNs.ojAnimateStart, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[V], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[V], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_describedBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.describedBy): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_displayOptions(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.displayOptions): atOracleOraclejetLib.Anon_ConverterHint = js.native
  @JSName("getProperty")
  def getProperty_help(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.help): atOracleOraclejetLib.Anon_Instruction = js.native
  @JSName("getProperty")
  def getProperty_helpHints(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.helpHints): atOracleOraclejetLib.Anon_Definition = js.native
  @JSName("getProperty")
  def getProperty_labelHint(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelHint): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_messagesCustom(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.messagesCustom): js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced] = js.native
  @JSName("getProperty")
  def getProperty_valid(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid): atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown = js.native
  @JSName("getProperty")
  def getProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value): V = js.native
  def reset(): scala.Unit = js.native
  def setProperties(properties: editableValueSettablePropertiesLenient[V, SV, RV]): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.pending
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_describedBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.describedBy): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_describedBy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.describedBy, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_displayOptions(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.displayOptions,
    value: atOracleOraclejetLib.Anon_ConverterHint
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_help(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.help,
    value: atOracleOraclejetLib.Anon_Instruction
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_helpHints(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.helpHints,
    value: atOracleOraclejetLib.Anon_Definition
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelHint(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelHint, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_messagesCustom(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.messagesCustom,
    value: js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_valid(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value, value: SV): scala.Unit = js.native
  def showMessages(): scala.Unit = js.native
}

