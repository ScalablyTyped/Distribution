package typings.atOracleOraclejet.ojfilmstripMod

import typings.atOracleOraclejet.Anon_Id
import typings.atOracleOraclejet.Anon_LabelAccArrowNextPage
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.adjacent
import typings.atOracleOraclejet.atOracleOraclejetStrings.arrowPlacement
import typings.atOracleOraclejet.atOracleOraclejetStrings.arrowPlacementChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.arrowVisibility
import typings.atOracleOraclejet.atOracleOraclejetStrings.arrowVisibilityChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.currentItem
import typings.atOracleOraclejet.atOracleOraclejetStrings.currentItemChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.hidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.hover
import typings.atOracleOraclejet.atOracleOraclejetStrings.looping
import typings.atOracleOraclejet.atOracleOraclejetStrings.loopingChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.maxItemsPerPage
import typings.atOracleOraclejet.atOracleOraclejetStrings.maxItemsPerPageChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.orientation
import typings.atOracleOraclejet.atOracleOraclejetStrings.orientationChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.overlay
import typings.atOracleOraclejet.atOracleOraclejetStrings.page
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typings.atOracleOraclejet.atOracleOraclejetStrings.visible
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojFilmStrip extends baseComponent[ojFilmStripSettableProperties] {
  var arrowPlacement: adjacent | overlay = js.native
  var arrowVisibility: visible | hidden | hover | auto = js.native
  var currentItem: Anon_Id = js.native
  var looping: off | page = js.native
  var maxItemsPerPage: Double = js.native
  var onArrowPlacementChanged: (js.Function1[/* event */ JetElementCustomEvent[adjacent | overlay], _]) | Null = js.native
  var onArrowVisibilityChanged: (js.Function1[/* event */ JetElementCustomEvent[visible | hidden | hover | auto], _]) | Null = js.native
  var onCurrentItemChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_Id], _]) | Null = js.native
  var onLoopingChanged: (js.Function1[/* event */ JetElementCustomEvent[off | page], _]) | Null = js.native
  var onMaxItemsPerPageChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onOrientationChanged: (js.Function1[/* event */ JetElementCustomEvent[horizontal | vertical], _]) | Null = js.native
  var orientation: horizontal | vertical = js.native
  @JSName("translations")
  var translations_ojFilmStrip: Anon_LabelAccArrowNextPage = js.native
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Id], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentItemChanged(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Id], _],
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
  def getProperty_currentItem(property: currentItem): Anon_Id = js.native
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
  def setProperty_currentItem(property: currentItem, value: Anon_Id): Unit = js.native
  @JSName("setProperty")
  def setProperty_maxItemsPerPage(property: maxItemsPerPage, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_LabelAccArrowNextPage): Unit = js.native
}

