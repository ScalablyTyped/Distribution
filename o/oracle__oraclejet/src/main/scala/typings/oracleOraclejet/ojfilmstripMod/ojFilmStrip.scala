package typings.oracleOraclejet.ojfilmstripMod

import typings.oracleOraclejet.AnonId
import typings.oracleOraclejet.AnonLabelAccArrowNextPage
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.oracleOraclejetStrings.adjacent
import typings.oracleOraclejet.oracleOraclejetStrings.arrowPlacement
import typings.oracleOraclejet.oracleOraclejetStrings.arrowPlacementChanged
import typings.oracleOraclejet.oracleOraclejetStrings.arrowVisibility
import typings.oracleOraclejet.oracleOraclejetStrings.arrowVisibilityChanged
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.currentItem
import typings.oracleOraclejet.oracleOraclejetStrings.currentItemChanged
import typings.oracleOraclejet.oracleOraclejetStrings.hidden
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.hover
import typings.oracleOraclejet.oracleOraclejetStrings.looping
import typings.oracleOraclejet.oracleOraclejetStrings.loopingChanged
import typings.oracleOraclejet.oracleOraclejetStrings.maxItemsPerPage
import typings.oracleOraclejet.oracleOraclejetStrings.maxItemsPerPageChanged
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.orientation
import typings.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typings.oracleOraclejet.oracleOraclejetStrings.overlay
import typings.oracleOraclejet.oracleOraclejetStrings.page
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import typings.oracleOraclejet.oracleOraclejetStrings.visible
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojFilmStrip extends baseComponent[ojFilmStripSettableProperties] {
  var arrowPlacement: adjacent | overlay = js.native
  var arrowVisibility: visible | hidden | hover | auto = js.native
  var currentItem: AnonId = js.native
  var looping: off | page = js.native
  var maxItemsPerPage: Double = js.native
  var onArrowPlacementChanged: (js.Function1[/* event */ JetElementCustomEvent[adjacent | overlay], _]) | Null = js.native
  var onArrowVisibilityChanged: (js.Function1[/* event */ JetElementCustomEvent[visible | hidden | hover | auto], _]) | Null = js.native
  var onCurrentItemChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonId], _]) | Null = js.native
  var onLoopingChanged: (js.Function1[/* event */ JetElementCustomEvent[off | page], _]) | Null = js.native
  var onMaxItemsPerPageChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onOrientationChanged: (js.Function1[/* event */ JetElementCustomEvent[horizontal | vertical], _]) | Null = js.native
  var orientation: horizontal | vertical = js.native
  @JSName("translations")
  var translations_ojFilmStrip: AnonLabelAccArrowNextPage = js.native
  def addEventListener(
    `type`: arrowPlacementChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[adjacent | overlay], _]
  ): Unit = js.native
  def addEventListener(
    `type`: arrowPlacementChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[adjacent | overlay], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: arrowVisibilityChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[visible | hidden | hover | auto], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: arrowVisibilityChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[visible | hidden | hover | auto], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: loopingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | page], _]
  ): Unit = js.native
  def addEventListener(
    `type`: loopingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | page], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], _]
  ): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[horizontal | vertical], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentItemChanged(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonId], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentItemChanged(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonId], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxItemsPerPageChanged(
    `type`: maxItemsPerPageChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxItemsPerPageChanged(
    `type`: maxItemsPerPageChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  def getItemsPerPage(): Double = js.native
  @JSName("getProperty")
  def getProperty_arrowPlacement(property: arrowPlacement): adjacent | overlay = js.native
  @JSName("getProperty")
  def getProperty_arrowVisibility(property: arrowVisibility): visible | hidden | hover | auto = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: currentItem): AnonId = js.native
  @JSName("getProperty")
  def getProperty_looping(property: looping): off | page = js.native
  @JSName("getProperty")
  def getProperty_maxItemsPerPage(property: maxItemsPerPage): Double = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): horizontal | vertical = js.native
  def setProperties(properties: ojFilmStripSettablePropertiesLenient): Unit = js.native
  def setProperty(property: arrowPlacement, value: adjacent): Unit = js.native
  def setProperty(property: arrowPlacement, value: overlay): Unit = js.native
  def setProperty(property: arrowVisibility, value: auto): Unit = js.native
  def setProperty(property: arrowVisibility, value: hidden): Unit = js.native
  def setProperty(property: arrowVisibility, value: hover): Unit = js.native
  def setProperty(property: arrowVisibility, value: visible): Unit = js.native
  def setProperty(property: looping, value: off): Unit = js.native
  def setProperty(property: looping, value: page): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(property: currentItem, value: AnonId): Unit = js.native
  @JSName("setProperty")
  def setProperty_maxItemsPerPage(property: maxItemsPerPage, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonLabelAccArrowNextPage): Unit = js.native
}

