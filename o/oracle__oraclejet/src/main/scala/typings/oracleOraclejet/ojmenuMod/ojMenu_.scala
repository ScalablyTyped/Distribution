package typings.oracleOraclejet.ojmenuMod

import typings.oracleOraclejet.anon.AriaFocusSkipLink
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
import typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction
import typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd
import typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart
import typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen
import typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose
import typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typings.oracleOraclejet.oracleOraclejetStrings.openOptions
import typings.oracleOraclejet.oracleOraclejetStrings.openOptionsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMenu_ extends baseComponent[ojMenuSettableProperties] {
  var disabled: Boolean = js.native
  var onDisabledChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onOjAction: (js.Function1[/* event */ ojAction, _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onOjBeforeOpen: (js.Function1[/* event */ ojBeforeOpen, _]) | Null = js.native
  var onOjClose: (js.Function1[/* event */ ojClose, _]) | Null = js.native
  var onOjOpen: (js.Function1[/* event */ ojOpen, _]) | Null = js.native
  var onOpenOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[OpenOptions], _]) | Null = js.native
  var openOptions: OpenOptions = js.native
  @JSName("translations")
  var translations_ojMenu_ : AriaFocusSkipLink = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojAction,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAction, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojAction,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojAction, _],
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
  def addEventListener_openOptionsChanged(
    `type`: openOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[OpenOptions], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_openOptionsChanged(
    `type`: openOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[OpenOptions], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: disabled): Boolean = js.native
  @JSName("getProperty")
  def getProperty_openOptions(property: openOptions): OpenOptions = js.native
  def open(): Unit = js.native
  def open(event: js.UndefOr[scala.Nothing], openOptions: OpenOptions): Unit = js.native
  def open(event: js.Object): Unit = js.native
  def open(event: js.Object, openOptions: OpenOptions): Unit = js.native
  def setProperties(properties: ojMenuSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_openOptions(property: openOptions, value: OpenOptions): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AriaFocusSkipLink): Unit = js.native
}

