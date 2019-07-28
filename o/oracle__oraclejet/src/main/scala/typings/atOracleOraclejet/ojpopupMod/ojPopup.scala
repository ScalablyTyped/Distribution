package typings.atOracleOraclejet.ojpopupMod

import typings.atOracleOraclejet.Anon_AriaCloseSkipLink
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.autoDismiss
import typings.atOracleOraclejet.atOracleOraclejetStrings.autoDismissChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.chrome
import typings.atOracleOraclejet.atOracleOraclejetStrings.chromeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.default
import typings.atOracleOraclejet.atOracleOraclejetStrings.firstFocusable
import typings.atOracleOraclejet.atOracleOraclejetStrings.focusLoss
import typings.atOracleOraclejet.atOracleOraclejetStrings.initialFocus
import typings.atOracleOraclejet.atOracleOraclejetStrings.initialFocusChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.modal
import typings.atOracleOraclejet.atOracleOraclejetStrings.modality
import typings.atOracleOraclejet.atOracleOraclejetStrings.modalityChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.modeless
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.popup
import typings.atOracleOraclejet.atOracleOraclejetStrings.position
import typings.atOracleOraclejet.atOracleOraclejetStrings.positionChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.simple
import typings.atOracleOraclejet.atOracleOraclejetStrings.tail
import typings.atOracleOraclejet.atOracleOraclejetStrings.tailChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.Position
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojAnimateEnd
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojAnimateStart
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojBeforeClose
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojBeforeOpen
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojClose
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojFocus
import typings.atOracleOraclejet.ojpopupMod.ojPopupNs.ojOpen
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojPopup extends baseComponent[ojPopupSettableProperties] {
  var autoDismiss: none | focusLoss = js.native
  var chrome: default | none = js.native
  var initialFocus: auto | none | firstFocusable | popup = js.native
  var modality: modeless | modal = js.native
  var onAutoDismissChanged: (js.Function1[/* event */ JetElementCustomEvent[none | focusLoss], _]) | Null = js.native
  var onChromeChanged: (js.Function1[/* event */ JetElementCustomEvent[default | none], _]) | Null = js.native
  var onInitialFocusChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none | firstFocusable | popup], _]) | Null = js.native
  var onModalityChanged: (js.Function1[/* event */ JetElementCustomEvent[modeless | modal], _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onOjBeforeClose: (js.Function1[/* event */ ojBeforeClose, _]) | Null = js.native
  var onOjBeforeOpen: (js.Function1[/* event */ ojBeforeOpen, _]) | Null = js.native
  var onOjClose: (js.Function1[/* event */ ojClose, _]) | Null = js.native
  var onOjFocus: (js.Function1[/* event */ ojFocus, _]) | Null = js.native
  var onOjOpen: (js.Function1[/* event */ ojOpen, _]) | Null = js.native
  var onPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[Position], _]) | Null = js.native
  var onTailChanged: (js.Function1[/* event */ JetElementCustomEvent[none | simple], _]) | Null = js.native
  var position: Position = js.native
  var tail: none | simple = js.native
  @JSName("translations")
  var translations_ojPopup: Anon_AriaCloseSkipLink = js.native
  def addEventListener(
    `type`: autoDismissChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | focusLoss], _]
  ): Unit = js.native
  def addEventListener(
    `type`: autoDismissChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | focusLoss], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: chromeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[default | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: chromeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[default | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: initialFocusChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | none | firstFocusable | popup], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: initialFocusChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | none | firstFocusable | popup], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: modalityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modeless | modal], _]
  ): Unit = js.native
  def addEventListener(
    `type`: modalityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modeless | modal], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: tailChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | simple], _]
  ): Unit = js.native
  def addEventListener(
    `type`: tailChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | simple], _],
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
  def close(): Unit = js.native
  @JSName("getProperty")
  def getProperty_autoDismiss(property: autoDismiss): none | focusLoss = js.native
  @JSName("getProperty")
  def getProperty_chrome(property: chrome): default | none = js.native
  @JSName("getProperty")
  def getProperty_initialFocus(property: initialFocus): auto | none | firstFocusable | popup = js.native
  @JSName("getProperty")
  def getProperty_modality(property: modality): modeless | modal = js.native
  @JSName("getProperty")
  def getProperty_position(property: position): Position = js.native
  @JSName("getProperty")
  def getProperty_tail(property: tail): none | simple = js.native
  def isOpen(): Boolean = js.native
  def open(launcher: String): Unit = js.native
  def open(launcher: String, position: Position): Unit = js.native
  def open(launcher: Element): Unit = js.native
  def open(launcher: Element, position: Position): Unit = js.native
  def setProperties(properties: ojPopupSettablePropertiesLenient): Unit = js.native
  def setProperty(property: autoDismiss, value: focusLoss): Unit = js.native
  def setProperty(property: autoDismiss, value: none): Unit = js.native
  def setProperty(property: chrome, value: default): Unit = js.native
  def setProperty(property: chrome, value: none): Unit = js.native
  def setProperty(property: initialFocus, value: auto): Unit = js.native
  def setProperty(property: initialFocus, value: firstFocusable): Unit = js.native
  def setProperty(property: initialFocus, value: none): Unit = js.native
  def setProperty(property: initialFocus, value: popup): Unit = js.native
  def setProperty(property: modality, value: modal): Unit = js.native
  def setProperty(property: modality, value: modeless): Unit = js.native
  def setProperty(property: tail, value: none): Unit = js.native
  def setProperty(property: tail, value: simple): Unit = js.native
  @JSName("setProperty")
  def setProperty_position(property: position, value: Position): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_AriaCloseSkipLink): Unit = js.native
}

