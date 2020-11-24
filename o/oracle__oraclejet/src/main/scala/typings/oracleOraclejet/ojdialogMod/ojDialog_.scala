package typings.oracleOraclejet.ojdialogMod

import typings.oracleOraclejet.anon.LabelCloseIcon
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojdialogMod.ojDialog.Position
import typings.oracleOraclejet.oracleOraclejetStrings.`title-bar`
import typings.oracleOraclejet.oracleOraclejetStrings.cancelBehavior
import typings.oracleOraclejet.oracleOraclejetStrings.cancelBehaviorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dialogTitle
import typings.oracleOraclejet.oracleOraclejetStrings.dialogTitleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dragAffordance
import typings.oracleOraclejet.oracleOraclejetStrings.dragAffordanceChanged
import typings.oracleOraclejet.oracleOraclejetStrings.escape
import typings.oracleOraclejet.oracleOraclejetStrings.hide
import typings.oracleOraclejet.oracleOraclejetStrings.icon
import typings.oracleOraclejet.oracleOraclejetStrings.initialVisibility
import typings.oracleOraclejet.oracleOraclejetStrings.initialVisibilityChanged
import typings.oracleOraclejet.oracleOraclejetStrings.modal
import typings.oracleOraclejet.oracleOraclejetStrings.modality
import typings.oracleOraclejet.oracleOraclejetStrings.modalityChanged
import typings.oracleOraclejet.oracleOraclejetStrings.modeless
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeClose
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeOpen
import typings.oracleOraclejet.oracleOraclejetStrings.ojClose
import typings.oracleOraclejet.oracleOraclejetStrings.ojFocus
import typings.oracleOraclejet.oracleOraclejetStrings.ojOpen
import typings.oracleOraclejet.oracleOraclejetStrings.ojResize
import typings.oracleOraclejet.oracleOraclejetStrings.ojResizeStart
import typings.oracleOraclejet.oracleOraclejetStrings.ojResizeStop
import typings.oracleOraclejet.oracleOraclejetStrings.position
import typings.oracleOraclejet.oracleOraclejetStrings.positionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.resizable
import typings.oracleOraclejet.oracleOraclejetStrings.resizeBehavior
import typings.oracleOraclejet.oracleOraclejetStrings.resizeBehaviorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.role
import typings.oracleOraclejet.oracleOraclejetStrings.roleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.show
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojDialog_ extends baseComponent[ojDialogSettableProperties] {
  
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
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeClose(
    `type`: ojBeforeClose,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeClose(
    `type`: ojBeforeClose,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: ojBeforeOpen,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: ojBeforeOpen,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: ojClose,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: ojClose,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojFocus(
    `type`: ojFocus,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojFocus(
    `type`: ojFocus,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: ojOpen,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: ojOpen,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: ojResize,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: ojResize,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStart(
    `type`: ojResizeStart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStart(
    `type`: ojResizeStart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStop(
    `type`: ojResizeStop,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStop(
    `type`: ojResizeStop,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop, 
      _
    ],
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
  
  var cancelBehavior: icon | escape | none = js.native
  
  def close(): Unit = js.native
  
  var dialogTitle: String | Null = js.native
  
  var dragAffordance: `title-bar` | none = js.native
  
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
  
  var initialVisibility: hide | show = js.native
  
  def isOpen(): Boolean = js.native
  
  var modality: modal | modeless = js.native
  
  var onCancelBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[icon | escape | none], _]) | Null = js.native
  
  var onDialogTitleChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  
  var onDragAffordanceChanged: (js.Function1[/* event */ JetElementCustomEvent[`title-bar` | none], _]) | Null = js.native
  
  var onInitialVisibilityChanged: (js.Function1[/* event */ JetElementCustomEvent[hide | show], _]) | Null = js.native
  
  var onModalityChanged: (js.Function1[/* event */ JetElementCustomEvent[modal | modeless], _]) | Null = js.native
  
  var onOjAnimateEnd: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd, _]) | Null = js.native
  
  var onOjAnimateStart: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart, _]) | Null = js.native
  
  var onOjBeforeClose: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose, _]) | Null = js.native
  
  var onOjBeforeOpen: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen, _]) | Null = js.native
  
  var onOjClose: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose, _]) | Null = js.native
  
  var onOjFocus: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus, _]) | Null = js.native
  
  var onOjOpen: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen, _]) | Null = js.native
  
  var onOjResize: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize, _]) | Null = js.native
  
  var onOjResizeStart: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart, _]) | Null = js.native
  
  var onOjResizeStop: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop, _]) | Null = js.native
  
  var onPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[Position], _]) | Null = js.native
  
  var onResizeBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[resizable | none], _]) | Null = js.native
  
  var onRoleChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  
  def open(): Unit = js.native
  
  var position: Position = js.native
  
  var resizeBehavior: resizable | none = js.native
  
  var role: String = js.native
  
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
  def setProperty_translations(property: translations, value: LabelCloseIcon): Unit = js.native
  
  @JSName("translations")
  var translations_ojDialog_ : LabelCloseIcon = js.native
}
