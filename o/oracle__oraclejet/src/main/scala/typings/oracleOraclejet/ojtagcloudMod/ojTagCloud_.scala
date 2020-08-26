package typings.oracleOraclejet.ojtagcloudMod

import typings.oracleOraclejet.anon.HoverBehaviorDelay
import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.anon.`26`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typings.oracleOraclejet.ojtagcloudMod.ojTagCloud.ItemContext
import typings.oracleOraclejet.ojtagcloudMod.ojTagCloud.NodeContext
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.as
import typings.oracleOraclejet.oracleOraclejetStrings.asChanged
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.cloud
import typings.oracleOraclejet.oracleOraclejetStrings.data
import typings.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.hiddenCategories
import typings.oracleOraclejet.oracleOraclejetStrings.hiddenCategoriesChanged
import typings.oracleOraclejet.oracleOraclejetStrings.highlightMatch
import typings.oracleOraclejet.oracleOraclejetStrings.highlightMatchChanged
import typings.oracleOraclejet.oracleOraclejetStrings.highlightedCategories
import typings.oracleOraclejet.oracleOraclejetStrings.highlightedCategoriesChanged
import typings.oracleOraclejet.oracleOraclejetStrings.hoverBehavior
import typings.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.layout
import typings.oracleOraclejet.oracleOraclejetStrings.layoutChanged
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.rectangular
import typings.oracleOraclejet.oracleOraclejetStrings.selection
import typings.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typings.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.styleDefaults
import typings.oracleOraclejet.oracleOraclejetStrings.styleDefaultsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.tooltip
import typings.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typings.oracleOraclejet.oracleOraclejetStrings.touchResponse
import typings.oracleOraclejet.oracleOraclejetStrings.touchResponseChanged
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTagCloud_[K, D] extends dvtBaseComponent[ojTagCloudSettableProperties[K, D]] {
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var as: String = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var hiddenCategories: js.Array[String] = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var layout: cloud | rectangular = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], _]) | Null = js.native
  var onHiddenCategoriesChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[String]], _]) | Null = js.native
  var onHighlightMatchChanged: (js.Function1[/* event */ JetElementCustomEvent[any | all], _]) | Null = js.native
  var onHighlightedCategoriesChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[String]], _]) | Null = js.native
  var onHoverBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[dim | none], _]) | Null = js.native
  var onLayoutChanged: (js.Function1[/* event */ JetElementCustomEvent[cloud | rectangular], _]) | Null = js.native
  var onSelectionChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[K]], _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[/* event */ JetElementCustomEvent[single | multiple | none], _]) | Null = js.native
  var onStyleDefaultsChanged: (js.Function1[/* event */ JetElementCustomEvent[HoverBehaviorDelay], _]) | Null = js.native
  var onTooltipChanged: (js.Function1[/* event */ JetElementCustomEvent[`26`[K]], _]) | Null = js.native
  var onTouchResponseChanged: (js.Function1[/* event */ JetElementCustomEvent[touchStart | auto], _]) | Null = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: single | multiple | none = js.native
  var styleDefaults: HoverBehaviorDelay = js.native
  var tooltip: `26`[K] = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojTagCloud_ : LabelAndValue = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _]
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: layoutChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[cloud | rectangular], _]
  ): Unit = js.native
  def addEventListener(
    `type`: layoutChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[cloud | rectangular], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[K]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[K]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[HoverBehaviorDelay], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[HoverBehaviorDelay], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`26`[K]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`26`[K]], _],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): NodeContext | Null = js.native
  def getItem(index: Double): ItemContext | Null = js.native
  def getItemCount(): Double = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_layout(property: layout): cloud | rectangular = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: styleDefaults): HoverBehaviorDelay = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `26`[K] = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  def setProperties(properties: ojTagCloudSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: highlightMatch, value: all): Unit = js.native
  def setProperty(property: highlightMatch, value: any): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: layout, value: cloud): Unit = js.native
  def setProperty(property: layout, value: rectangular): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  def setProperty(property: touchResponse, value: auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(property: hiddenCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(property: highlightedCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(property: styleDefaults, value: HoverBehaviorDelay): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `26`[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelAndValue): Unit = js.native
}

