package typings.atOracleOraclejet.ojdialogMod

import typings.atOracleOraclejet.Anon_LabelCloseIcon
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.`title-bar`
import typings.atOracleOraclejet.atOracleOraclejetStrings.cancelBehavior
import typings.atOracleOraclejet.atOracleOraclejetStrings.cancelBehaviorChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.dialogTitle
import typings.atOracleOraclejet.atOracleOraclejetStrings.dialogTitleChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.dragAffordance
import typings.atOracleOraclejet.atOracleOraclejetStrings.dragAffordanceChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.escape
import typings.atOracleOraclejet.atOracleOraclejetStrings.hide
import typings.atOracleOraclejet.atOracleOraclejetStrings.icon
import typings.atOracleOraclejet.atOracleOraclejetStrings.initialVisibility
import typings.atOracleOraclejet.atOracleOraclejetStrings.initialVisibilityChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.modal
import typings.atOracleOraclejet.atOracleOraclejetStrings.modality
import typings.atOracleOraclejet.atOracleOraclejetStrings.modalityChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.modeless
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.position
import typings.atOracleOraclejet.atOracleOraclejetStrings.positionChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.resizable
import typings.atOracleOraclejet.atOracleOraclejetStrings.resizeBehavior
import typings.atOracleOraclejet.atOracleOraclejetStrings.resizeBehaviorChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.role
import typings.atOracleOraclejet.atOracleOraclejetStrings.roleChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.show
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.ojdialogMod.ojDialog.Position
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojClose
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojFocus
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojOpen
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojResize
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojResizeStart
import typings.atOracleOraclejet.ojdialogMod.ojDialog.ojResizeStop
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojDialog")
@js.native
trait ojDialog_ extends baseComponent[ojDialogSettableProperties] {
  var cancelBehavior: icon | escape | none = js.native
  var dialogTitle: String | Null = js.native
  var dragAffordance: `title-bar` | none = js.native
  var initialVisibility: hide | show = js.native
  var modality: modal | modeless = js.native
  var onCancelBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[icon | escape | none], _]) | Null = js.native
  var onDialogTitleChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onDragAffordanceChanged: (js.Function1[/* event */ JetElementCustomEvent[`title-bar` | none], _]) | Null = js.native
  var onInitialVisibilityChanged: (js.Function1[/* event */ JetElementCustomEvent[hide | show], _]) | Null = js.native
  var onModalityChanged: (js.Function1[/* event */ JetElementCustomEvent[modal | modeless], _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onOjBeforeClose: (js.Function1[/* event */ ojBeforeClose, _]) | Null = js.native
  var onOjBeforeOpen: (js.Function1[/* event */ ojBeforeOpen, _]) | Null = js.native
  var onOjClose: (js.Function1[/* event */ ojClose, _]) | Null = js.native
  var onOjFocus: (js.Function1[/* event */ ojFocus, _]) | Null = js.native
  var onOjOpen: (js.Function1[/* event */ ojOpen, _]) | Null = js.native
  var onOjResize: (js.Function1[/* event */ ojResize, _]) | Null = js.native
  var onOjResizeStart: (js.Function1[/* event */ ojResizeStart, _]) | Null = js.native
  var onOjResizeStop: (js.Function1[/* event */ ojResizeStop, _]) | Null = js.native
  var onPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[Position], _]) | Null = js.native
  var onResizeBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[resizable | none], _]) | Null = js.native
  var onRoleChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var position: Position = js.native
  var resizeBehavior: resizable | none = js.native
  var role: String = js.native
  @JSName("translations")
  var translations_ojDialog_ : Anon_LabelCloseIcon = js.native
  def addEventListener(
    `type`: cancelBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[icon | escape | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: cancelBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[icon | escape | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dragAffordanceChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`title-bar` | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: dragAffordanceChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`title-bar` | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: initialVisibilityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[hide | show], _]
  ): Unit = js.native
  def addEventListener(
    `type`: initialVisibilityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[hide | show], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: modalityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modal | modeless], _]
  ): Unit = js.native
  def addEventListener(
    `type`: modalityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modal | modeless], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: resizeBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[resizable | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: resizeBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[resizable | none], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialogTitleChanged(
    `type`: dialogTitleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialogTitleChanged(
    `type`: dialogTitleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
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
  def addEventListener_ojBeforeClose(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeClose,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeClose, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeClose(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeClose,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeClose, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeOpen,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeOpen, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeOpen,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeOpen, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojClose,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojClose, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojClose,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojClose, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojFocus(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojFocus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojFocus, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojFocus(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojFocus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojFocus, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojOpen,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojOpen, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojOpen,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojOpen, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojResize, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojResize, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStart(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojResizeStart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojResizeStart, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStart(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojResizeStart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojResizeStart, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStop(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojResizeStop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojResizeStop, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStop(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojResizeStop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojResizeStop, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_positionChanged(
    `type`: positionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Position], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_positionChanged(
    `type`: positionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Position], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_roleChanged(
    `type`: roleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_roleChanged(
    `type`: roleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  def close(): Unit = js.native
  @JSName("getProperty")
  def getProperty_cancelBehavior(property: cancelBehavior): icon | escape | none = js.native
  @JSName("getProperty")
  def getProperty_dialogTitle(property: dialogTitle): String | Null = js.native
  @JSName("getProperty")
  def getProperty_dragAffordance(property: dragAffordance): `title-bar` | none = js.native
  @JSName("getProperty")
  def getProperty_initialVisibility(property: initialVisibility): hide | show = js.native
  @JSName("getProperty")
  def getProperty_modality(property: modality): modal | modeless = js.native
  @JSName("getProperty")
  def getProperty_position(property: position): Position = js.native
  @JSName("getProperty")
  def getProperty_resizeBehavior(property: resizeBehavior): resizable | none = js.native
  @JSName("getProperty")
  def getProperty_role(property: role): String = js.native
  def isOpen(): Boolean = js.native
  def open(): Unit = js.native
  def setProperties(properties: ojDialogSettablePropertiesLenient): Unit = js.native
  def setProperty(property: cancelBehavior, value: escape): Unit = js.native
  def setProperty(property: cancelBehavior, value: icon): Unit = js.native
  def setProperty(property: cancelBehavior, value: none): Unit = js.native
  def setProperty(property: dragAffordance, value: `title-bar`): Unit = js.native
  def setProperty(property: dragAffordance, value: none): Unit = js.native
  def setProperty(property: initialVisibility, value: hide): Unit = js.native
  def setProperty(property: initialVisibility, value: show): Unit = js.native
  def setProperty(property: modality, value: modal): Unit = js.native
  def setProperty(property: modality, value: modeless): Unit = js.native
  def setProperty(property: resizeBehavior, value: none): Unit = js.native
  def setProperty(property: resizeBehavior, value: resizable): Unit = js.native
  @JSName("setProperty")
  def setProperty_dialogTitle(property: dialogTitle): Unit = js.native
  @JSName("setProperty")
  def setProperty_dialogTitle(property: dialogTitle, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_position(property: position, value: Position): Unit = js.native
  @JSName("setProperty")
  def setProperty_role(property: role, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_LabelCloseIcon): Unit = js.native
}

