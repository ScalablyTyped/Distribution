package typings
package atOracleOraclejetLib.ojdialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDialog
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojDialogSettableProperties] {
  var cancelBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.icon | atOracleOraclejetLib.atOracleOraclejetLibStrings.escape | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var dialogTitle: java.lang.String | scala.Null = js.native
  var dragAffordance: atOracleOraclejetLib.atOracleOraclejetLibStrings.`title-bar` | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var initialVisibility: atOracleOraclejetLib.atOracleOraclejetLibStrings.hide | atOracleOraclejetLib.atOracleOraclejetLibStrings.show = js.native
  var modality: atOracleOraclejetLib.atOracleOraclejetLibStrings.modal | atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless = js.native
  var onCancelBehaviorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.icon | atOracleOraclejetLib.atOracleOraclejetLibStrings.escape | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onDialogTitleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onDragAffordanceChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.`title-bar` | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onInitialVisibilityChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.hide | atOracleOraclejetLib.atOracleOraclejetLibStrings.show
    ], 
    _
  ]) | scala.Null = js.native
  var onModalityChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.modal | atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless
    ], 
    _
  ]) | scala.Null = js.native
  var onOjAnimateEnd: (js.Function1[/* event */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojAnimateEnd, _]) | scala.Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojAnimateStart, _]) | scala.Null = js.native
  var onOjBeforeClose: (js.Function1[/* event */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojBeforeClose, _]) | scala.Null = js.native
  var onOjBeforeOpen: (js.Function1[/* event */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojBeforeOpen, _]) | scala.Null = js.native
  var onOjClose: (js.Function1[/* event */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojClose, _]) | scala.Null = js.native
  var onOjFocus: (js.Function1[/* event */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojFocus, _]) | scala.Null = js.native
  var onOjOpen: (js.Function1[/* event */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojOpen, _]) | scala.Null = js.native
  var onOjResize: (js.Function1[/* event */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResize, _]) | scala.Null = js.native
  var onOjResizeStart: (js.Function1[/* event */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResizeStart, _]) | scala.Null = js.native
  var onOjResizeStop: (js.Function1[/* event */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResizeStop, _]) | scala.Null = js.native
  var onPositionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdialogMod.ojDialogNs.Position], 
    _
  ]) | scala.Null = js.native
  var onResizeBehaviorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.resizable | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onRoleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var position: atOracleOraclejetLib.ojdialogMod.ojDialogNs.Position = js.native
  var resizeBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.resizable | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var role: java.lang.String = js.native
  @JSName("translations")
  var translations_ojDialog: atOracleOraclejetLib.Anon_LabelCloseIcon = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.cancelBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.icon | atOracleOraclejetLib.atOracleOraclejetLibStrings.escape | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.cancelBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.icon | atOracleOraclejetLib.atOracleOraclejetLibStrings.escape | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragAffordanceChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.`title-bar` | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragAffordanceChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.`title-bar` | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialVisibilityChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.hide | atOracleOraclejetLib.atOracleOraclejetLibStrings.show
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialVisibilityChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.hide | atOracleOraclejetLib.atOracleOraclejetLibStrings.show
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.modalityChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.modal | atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.modalityChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.modal | atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.resizeBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.resizable | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.resizeBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.resizable | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialogTitleChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dialogTitleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialogTitleChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dialogTitleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojAnimateEnd, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojAnimateEnd, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojAnimateStart, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojAnimateStart, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeClose(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeClose,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojBeforeClose, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeClose(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeClose,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojBeforeClose, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeOpen,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojBeforeOpen, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeOpen,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojBeforeOpen, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojClose,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojClose, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojClose,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojClose, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojFocus(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojFocus,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojFocus, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojFocus(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojFocus,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojFocus, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojOpen,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojOpen, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojOpen,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojOpen, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojResize,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResize, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojResize,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResize, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojResizeStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResizeStart, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojResizeStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResizeStart, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStop(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojResizeStop,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResizeStop, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStop(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojResizeStop,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdialogMod.ojDialogNs.ojResizeStop, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_positionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.positionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdialogMod.ojDialogNs.Position], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_positionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.positionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdialogMod.ojDialogNs.Position], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_roleChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.roleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_roleChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.roleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def close(): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_cancelBehavior(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.cancelBehavior): atOracleOraclejetLib.atOracleOraclejetLibStrings.icon | atOracleOraclejetLib.atOracleOraclejetLibStrings.escape | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_dialogTitle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dialogTitle): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_dragAffordance(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragAffordance): atOracleOraclejetLib.atOracleOraclejetLibStrings.`title-bar` | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_initialVisibility(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialVisibility): atOracleOraclejetLib.atOracleOraclejetLibStrings.hide | atOracleOraclejetLib.atOracleOraclejetLibStrings.show = js.native
  @JSName("getProperty")
  def getProperty_modality(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.modality): atOracleOraclejetLib.atOracleOraclejetLibStrings.modal | atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless = js.native
  @JSName("getProperty")
  def getProperty_position(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.position): atOracleOraclejetLib.ojdialogMod.ojDialogNs.Position = js.native
  @JSName("getProperty")
  def getProperty_resizeBehavior(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.resizeBehavior): atOracleOraclejetLib.atOracleOraclejetLibStrings.resizable | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_role(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.role): java.lang.String = js.native
  def isOpen(): scala.Boolean = js.native
  def open(): scala.Unit = js.native
  def setProperties(properties: ojDialogSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.cancelBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.escape
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.cancelBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.icon
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.cancelBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragAffordance,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.`title-bar`
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragAffordance,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialVisibility,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.hide
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialVisibility,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.show
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.modality,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.modal
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.modality,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.resizeBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.resizeBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.resizable
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_dialogTitle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dialogTitle): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_dialogTitle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dialogTitle, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_position(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.position,
    value: atOracleOraclejetLib.ojdialogMod.ojDialogNs.Position
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_role(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.role, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_LabelCloseIcon
  ): scala.Unit = js.native
}

