package typings.oracleOraclejet.ojmenuMod

import typings.oracleOraclejet.anon.AriaFocusSkipLink
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typings.oracleOraclejet.oracleOraclejetStrings.ojAction
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeOpen
import typings.oracleOraclejet.oracleOraclejetStrings.ojClose
import typings.oracleOraclejet.oracleOraclejetStrings.ojOpen
import typings.oracleOraclejet.oracleOraclejetStrings.openOptions
import typings.oracleOraclejet.oracleOraclejetStrings.openOptionsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojMenu_ extends baseComponent[ojMenuSettableProperties] {
  
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
    `type`: ojAction,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: ojAction,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: ojBeforeOpen,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: ojBeforeOpen,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: ojClose,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: ojClose,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: ojOpen,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: ojOpen,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen, _],
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
  
  var disabled: Boolean = js.native
  
  @JSName("getProperty")
  def getProperty_disabled(property: disabled): Boolean = js.native
  @JSName("getProperty")
  def getProperty_openOptions(property: openOptions): OpenOptions = js.native
  
  var onDisabledChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  
  var onOjAction: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAction, _]) | Null = js.native
  
  var onOjAnimateEnd: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateEnd, _]) | Null = js.native
  
  var onOjAnimateStart: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojAnimateStart, _]) | Null = js.native
  
  var onOjBeforeOpen: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojBeforeOpen, _]) | Null = js.native
  
  var onOjClose: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojClose, _]) | Null = js.native
  
  var onOjOpen: (js.Function1[/* event */ typings.oracleOraclejet.ojmenuMod.ojMenu.ojOpen, _]) | Null = js.native
  
  var onOpenOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[OpenOptions], _]) | Null = js.native
  
  def open(): Unit = js.native
  def open(event: js.UndefOr[scala.Nothing], openOptions: OpenOptions): Unit = js.native
  def open(event: js.Object): Unit = js.native
  def open(event: js.Object, openOptions: OpenOptions): Unit = js.native
  
  var openOptions: OpenOptions = js.native
  
  def setProperties(properties: ojMenuSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_openOptions(property: openOptions, value: OpenOptions): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AriaFocusSkipLink): Unit = js.native
  
  @JSName("translations")
  var translations_ojMenu_ : AriaFocusSkipLink = js.native
}
