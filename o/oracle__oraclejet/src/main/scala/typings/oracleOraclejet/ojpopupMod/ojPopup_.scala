package typings.oracleOraclejet.ojpopupMod

import typings.oracleOraclejet.anon.AriaCloseSkipLink
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojpopupMod.ojPopup.Position
import typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateEnd
import typings.oracleOraclejet.ojpopupMod.ojPopup.ojAnimateStart
import typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeClose
import typings.oracleOraclejet.ojpopupMod.ojPopup.ojBeforeOpen
import typings.oracleOraclejet.ojpopupMod.ojPopup.ojClose
import typings.oracleOraclejet.ojpopupMod.ojPopup.ojFocus
import typings.oracleOraclejet.ojpopupMod.ojPopup.ojOpen
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.autoDismiss
import typings.oracleOraclejet.oracleOraclejetStrings.autoDismissChanged
import typings.oracleOraclejet.oracleOraclejetStrings.chrome
import typings.oracleOraclejet.oracleOraclejetStrings.chromeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.default
import typings.oracleOraclejet.oracleOraclejetStrings.firstFocusable
import typings.oracleOraclejet.oracleOraclejetStrings.focusLoss
import typings.oracleOraclejet.oracleOraclejetStrings.initialFocus
import typings.oracleOraclejet.oracleOraclejetStrings.initialFocusChanged
import typings.oracleOraclejet.oracleOraclejetStrings.modal
import typings.oracleOraclejet.oracleOraclejetStrings.modality
import typings.oracleOraclejet.oracleOraclejetStrings.modalityChanged
import typings.oracleOraclejet.oracleOraclejetStrings.modeless
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.popup
import typings.oracleOraclejet.oracleOraclejetStrings.position
import typings.oracleOraclejet.oracleOraclejetStrings.positionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.simple
import typings.oracleOraclejet.oracleOraclejetStrings.tail
import typings.oracleOraclejet.oracleOraclejetStrings.tailChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojPopup_ extends baseComponent[ojPopupSettableProperties] {
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
  var translations_ojPopup_ : AriaCloseSkipLink = js.native
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
  def addEventListener_ojBeforeClose(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeClose,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeClose, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeClose(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeClose,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeClose, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeOpen,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeOpen, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeOpen,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeOpen, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojClose,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojClose, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojClose,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojClose, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojFocus(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojFocus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojFocus, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojFocus(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojFocus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojFocus, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojOpen,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojOpen, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojOpen,
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
  def setProperty_translations(property: translations, value: AriaCloseSkipLink): Unit = js.native
}

