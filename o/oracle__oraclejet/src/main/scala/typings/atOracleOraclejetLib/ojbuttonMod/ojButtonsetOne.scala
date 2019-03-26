package typings
package atOracleOraclejetLib.ojbuttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojButtonsetOne extends ojButtonset[ojButtonsetOneSettableProperties] {
  var chroming: atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.half | atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined = js.native
  var disabled: scala.Boolean = js.native
  var display: atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons = js.native
  var focusManagement: atOracleOraclejetLib.atOracleOraclejetLibStrings.oneTabstop | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
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
  var onFocusManagementChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.oneTabstop | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onValueChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing], 
    _
  ]) | scala.Null = js.native
  var value: js.Any = js.native
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
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusManagementChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.oneTabstop | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusManagementChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.oneTabstop | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
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
  def addEventListener_valueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing], 
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
  @JSName("getProperty")
  def getProperty_focusManagement(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusManagement): atOracleOraclejetLib.atOracleOraclejetLibStrings.oneTabstop | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value): scala.Nothing = js.native
  def setProperties(properties: ojButtonsetOneSettablePropertiesLenient): scala.Unit = js.native
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
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusManagement,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusManagement,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.oneTabstop
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value, value: js.Any): scala.Unit = js.native
}

