package typings
package atOracleOraclejetLib.ojbuttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojButton[SP /* <: ojButtonSettableProperties */]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[SP] {
  var chroming: atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.half | atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined = js.native
  var disabled: scala.Boolean = js.native
  var display: atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons = js.native
  var onChromingChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.half | atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined
    ], 
    _
  ]) | scala.Null = js.native
  var onDisabledChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
    _
  ]) | scala.Null = js.native
  var onDisplayChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
    ], 
    _
  ]) | scala.Null = js.native
  var onOjAction: (js.Function1[/* event */ atOracleOraclejetLib.ojbuttonMod.ojButtonNs.ojAction, _]) | scala.Null = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.chromingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.half | atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.chromingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.half | atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.displayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.displayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
      ], 
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
  def addEventListener_ojAction(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAction,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojbuttonMod.ojButtonNs.ojAction, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAction,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojbuttonMod.ojButtonNs.ojAction, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_chroming(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.chroming): atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.half | atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_display(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.display): atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons = js.native
  def setProperties(properties: ojButtonSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.chroming,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.full
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.chroming,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.half
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.chroming,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.display,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.display,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled, value: scala.Boolean): scala.Unit = js.native
}

