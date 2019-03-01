package typings
package atOracleOraclejetLib.ojpopupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojPopup
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojPopupSettableProperties] {
  var autoDismiss: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.focusLoss = js.native
  var chrome: atOracleOraclejetLib.atOracleOraclejetLibStrings.default | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var initialFocus: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.firstFocusable | atOracleOraclejetLib.atOracleOraclejetLibStrings.popup = js.native
  var modality: atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless | atOracleOraclejetLib.atOracleOraclejetLibStrings.modal = js.native
  var onAutoDismissChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.focusLoss
    ], 
    _
  ]) | scala.Null = js.native
  var onChromeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.default | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onInitialFocusChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.firstFocusable | atOracleOraclejetLib.atOracleOraclejetLibStrings.popup
    ], 
    _
  ]) | scala.Null = js.native
  var onModalityChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless | atOracleOraclejetLib.atOracleOraclejetLibStrings.modal
    ], 
    _
  ]) | scala.Null = js.native
  var onOjAnimateEnd: (js.Function1[/* event */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojAnimateEnd, _]) | scala.Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojAnimateStart, _]) | scala.Null = js.native
  var onOjBeforeClose: (js.Function1[/* event */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojBeforeClose, _]) | scala.Null = js.native
  var onOjBeforeOpen: (js.Function1[/* event */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojBeforeOpen, _]) | scala.Null = js.native
  var onOjClose: (js.Function1[/* event */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojClose, _]) | scala.Null = js.native
  var onOjFocus: (js.Function1[/* event */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojFocus, _]) | scala.Null = js.native
  var onOjOpen: (js.Function1[/* event */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojOpen, _]) | scala.Null = js.native
  var onPositionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojpopupMod.ojPopupNs.Position], 
    _
  ]) | scala.Null = js.native
  var onTailChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.simple
    ], 
    _
  ]) | scala.Null = js.native
  var position: atOracleOraclejetLib.ojpopupMod.ojPopupNs.Position = js.native
  var tail: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.simple = js.native
  @JSName("translations")
  var translations_ojPopup: atOracleOraclejetLib.Anon_AriaCloseSkipLink = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.autoDismissChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.focusLoss
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.autoDismissChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.focusLoss
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.chromeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.default | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.chromeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.default | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialFocusChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.firstFocusable | atOracleOraclejetLib.atOracleOraclejetLibStrings.popup
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialFocusChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.firstFocusable | atOracleOraclejetLib.atOracleOraclejetLibStrings.popup
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
        atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless | atOracleOraclejetLib.atOracleOraclejetLibStrings.modal
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.modalityChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless | atOracleOraclejetLib.atOracleOraclejetLibStrings.modal
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tailChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.simple
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tailChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.simple
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojAnimateEnd, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojAnimateEnd, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojAnimateStart, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojAnimateStart, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeClose(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeClose,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojBeforeClose, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeClose(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeClose,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojBeforeClose, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeOpen,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojBeforeOpen, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeOpen,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojBeforeOpen, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojClose,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojClose, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojClose,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojClose, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojFocus(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojFocus,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojFocus, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojFocus(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojFocus,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojFocus, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojOpen,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojOpen, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojOpen,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojpopupMod.ojPopupNs.ojOpen, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_positionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.positionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojpopupMod.ojPopupNs.Position], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_positionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.positionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojpopupMod.ojPopupNs.Position], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def close(): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_autoDismiss(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autoDismiss): atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.focusLoss = js.native
  @JSName("getProperty")
  def getProperty_chrome(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.chrome): atOracleOraclejetLib.atOracleOraclejetLibStrings.default | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_initialFocus(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialFocus): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.firstFocusable | atOracleOraclejetLib.atOracleOraclejetLibStrings.popup = js.native
  @JSName("getProperty")
  def getProperty_modality(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.modality): atOracleOraclejetLib.atOracleOraclejetLibStrings.modeless | atOracleOraclejetLib.atOracleOraclejetLibStrings.modal = js.native
  @JSName("getProperty")
  def getProperty_position(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.position): atOracleOraclejetLib.ojpopupMod.ojPopupNs.Position = js.native
  @JSName("getProperty")
  def getProperty_tail(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tail): atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.simple = js.native
  def isOpen(): scala.Boolean = js.native
  def open(launcher: java.lang.String): scala.Unit = js.native
  def open(launcher: java.lang.String, position: atOracleOraclejetLib.ojpopupMod.ojPopupNs.Position): scala.Unit = js.native
  def open(launcher: stdLib.Element): scala.Unit = js.native
  def open(launcher: stdLib.Element, position: atOracleOraclejetLib.ojpopupMod.ojPopupNs.Position): scala.Unit = js.native
  def setProperties(properties: ojPopupSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autoDismiss,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusLoss
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.autoDismiss,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.chrome,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.default
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.chrome,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialFocus,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialFocus,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.firstFocusable
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialFocus,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialFocus,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.popup
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
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tail,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tail,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.simple
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_position(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.position,
    value: atOracleOraclejetLib.ojpopupMod.ojPopupNs.Position
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_AriaCloseSkipLink
  ): scala.Unit = js.native
}

