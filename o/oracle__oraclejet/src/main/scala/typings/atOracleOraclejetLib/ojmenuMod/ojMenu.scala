package typings
package atOracleOraclejetLib.ojmenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMenu
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojMenuSettableProperties] {
  var disabled: scala.Boolean = js.native
  var onDisabledChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
    _
  ]) | scala.Null = js.native
  var onOjAction: (js.Function1[/* event */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojAction, _]) | scala.Null = js.native
  var onOjAnimateEnd: (js.Function1[/* event */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojAnimateEnd, _]) | scala.Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojAnimateStart, _]) | scala.Null = js.native
  var onOjBeforeOpen: (js.Function1[/* event */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojBeforeOpen, _]) | scala.Null = js.native
  var onOjClose: (js.Function1[/* event */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojClose, _]) | scala.Null = js.native
  var onOjOpen: (js.Function1[/* event */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojOpen, _]) | scala.Null = js.native
  var onOpenOptionsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojmenuMod.ojMenuNs.OpenOptions], 
    _
  ]) | scala.Null = js.native
  var openOptions: atOracleOraclejetLib.ojmenuMod.ojMenuNs.OpenOptions = js.native
  @JSName("translations")
  var translations_ojMenu: atOracleOraclejetLib.Anon_AriaFocusSkipLink = js.native
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
      /* ev */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojAction, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAction,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojAction, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojAnimateEnd, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojAnimateEnd, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojAnimateStart, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojAnimateStart, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeOpen,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojBeforeOpen, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeOpen,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojBeforeOpen, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojClose,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojClose, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojClose,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojClose, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojOpen,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojOpen, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojOpen,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojmenuMod.ojMenuNs.ojOpen, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_openOptionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.openOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojmenuMod.ojMenuNs.OpenOptions], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_openOptionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.openOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojmenuMod.ojMenuNs.OpenOptions], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_openOptions(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.openOptions): atOracleOraclejetLib.ojmenuMod.ojMenuNs.OpenOptions = js.native
  def open(): scala.Unit = js.native
  def open(event: js.Object): scala.Unit = js.native
  def open(event: js.Object, openOptions: atOracleOraclejetLib.ojmenuMod.ojMenuNs.OpenOptions): scala.Unit = js.native
  def setProperties(properties: ojMenuSettablePropertiesLenient): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_openOptions(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.openOptions,
    value: atOracleOraclejetLib.ojmenuMod.ojMenuNs.OpenOptions
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_AriaFocusSkipLink
  ): scala.Unit = js.native
}

