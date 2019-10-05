package typings.atOracleOraclejet.ojpictochartMod

import typings.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultKNull
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.alphaFade
import typings.atOracleOraclejet.atOracleOraclejetStrings.animationDuration
import typings.atOracleOraclejet.atOracleOraclejetStrings.animationDurationChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.animationOnDataChange
import typings.atOracleOraclejet.atOracleOraclejetStrings.animationOnDataChangeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.animationOnDisplay
import typings.atOracleOraclejet.atOracleOraclejetStrings.animationOnDisplayChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.any
import typings.atOracleOraclejet.atOracleOraclejetStrings.as
import typings.atOracleOraclejet.atOracleOraclejetStrings.asChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bottomEnd
import typings.atOracleOraclejet.atOracleOraclejetStrings.bottomStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.columnCount
import typings.atOracleOraclejet.atOracleOraclejetStrings.columnCountChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.columnWidth
import typings.atOracleOraclejet.atOracleOraclejetStrings.columnWidthChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.data
import typings.atOracleOraclejet.atOracleOraclejetStrings.dataChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.dim
import typings.atOracleOraclejet.atOracleOraclejetStrings.drilling
import typings.atOracleOraclejet.atOracleOraclejetStrings.drillingChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.hiddenCategories
import typings.atOracleOraclejet.atOracleOraclejetStrings.hiddenCategoriesChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.highlightMatch
import typings.atOracleOraclejet.atOracleOraclejetStrings.highlightMatchChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.highlightedCategories
import typings.atOracleOraclejet.atOracleOraclejetStrings.highlightedCategoriesChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.hoverBehavior
import typings.atOracleOraclejet.atOracleOraclejetStrings.hoverBehaviorChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.hoverBehaviorDelay
import typings.atOracleOraclejet.atOracleOraclejetStrings.hoverBehaviorDelayChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.layout
import typings.atOracleOraclejet.atOracleOraclejetStrings.layoutChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.layoutOrigin
import typings.atOracleOraclejet.atOracleOraclejetStrings.layoutOriginChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.popIn
import typings.atOracleOraclejet.atOracleOraclejetStrings.rowCount
import typings.atOracleOraclejet.atOracleOraclejetStrings.rowCountChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.rowHeight
import typings.atOracleOraclejet.atOracleOraclejetStrings.rowHeightChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.selection
import typings.atOracleOraclejet.atOracleOraclejetStrings.selectionChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.selectionMode
import typings.atOracleOraclejet.atOracleOraclejetStrings.selectionModeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.tooltip
import typings.atOracleOraclejet.atOracleOraclejetStrings.tooltipChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.topEnd
import typings.atOracleOraclejet.atOracleOraclejetStrings.topStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typings.atOracleOraclejet.atOracleOraclejetStrings.zoom
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponent
import typings.atOracleOraclejet.ojpictochartMod.ojPictoChart.ItemContext
import typings.atOracleOraclejet.ojpictochartMod.ojPictoChart.NodeContext
import typings.atOracleOraclejet.ojpictochartMod.ojPictoChart.ojDrill
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojPictoChart")
@js.native
trait ojPictoChart_[K, D] extends dvtBaseComponent[ojPictoChartSettableProperties[K, D]] {
  var animationDuration: js.UndefOr[Double] = js.native
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | popIn | alphaFade | zoom | none = js.native
  var as: String = js.native
  var columnCount: Double | Null = js.native
  var columnWidth: Double | Null = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var drilling: on | off = js.native
  var hiddenCategories: js.Array[String] = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var hoverBehaviorDelay: Double = js.native
  var layout: vertical | horizontal = js.native
  var layoutOrigin: topEnd | bottomStart | bottomEnd | topStart = js.native
  var onAnimationDurationChanged: (js.Function1[/* event */ JetElementCustomEvent[js.UndefOr[Double]], _]) | Null = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | popIn | alphaFade | zoom | none], _]) | Null = js.native
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onColumnCountChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onColumnWidthChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], _]) | Null = js.native
  var onDrillingChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off], _]) | Null = js.native
  var onHiddenCategoriesChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[String]], _]) | Null = js.native
  var onHighlightMatchChanged: (js.Function1[/* event */ JetElementCustomEvent[any | all], _]) | Null = js.native
  var onHighlightedCategoriesChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[String]], _]) | Null = js.native
  var onHoverBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[dim | none], _]) | Null = js.native
  var onHoverBehaviorDelayChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onLayoutChanged: (js.Function1[/* event */ JetElementCustomEvent[vertical | horizontal], _]) | Null = js.native
  var onLayoutOriginChanged: (js.Function1[/* event */ JetElementCustomEvent[topEnd | bottomStart | bottomEnd | topStart], _]) | Null = js.native
  var onOjDrill: (js.Function1[/* event */ ojDrill, _]) | Null = js.native
  var onRowCountChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onRowHeightChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
  var onSelectionChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[K]], _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[/* event */ JetElementCustomEvent[single | multiple | none], _]) | Null = js.native
  var onTooltipChanged: (js.Function1[
    /* event */ JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K]], 
    _
  ]) | Null = js.native
  var rowCount: Double | Null = js.native
  var rowHeight: Double | Null = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: single | multiple | none = js.native
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K] = js.native
  @JSName("translations")
  var translations_ojPictoChart_ : Anon_ComponentNameLabelAndValue = js.native
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
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | popIn | alphaFade | zoom | none], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | popIn | alphaFade | zoom | none], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _]
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _],
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[vertical | horizontal], _]
  ): Unit = js.native
  def addEventListener(
    `type`: layoutChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[vertical | horizontal], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: layoutOriginChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[topEnd | bottomStart | bottomEnd | topStart], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: layoutOriginChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[topEnd | bottomStart | bottomEnd | topStart], 
      _
    ],
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
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.UndefOr[Double]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.UndefOr[Double]], _],
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
  def addEventListener_columnCountChanged(
    `type`: columnCountChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnCountChanged(
    `type`: columnCountChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnWidthChanged(
    `type`: columnWidthChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnWidthChanged(
    `type`: columnWidthChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _],
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
  def addEventListener_hoverBehaviorDelayChanged(
    `type`: hoverBehaviorDelayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverBehaviorDelayChanged(
    `type`: hoverBehaviorDelayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojDrill,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojDrill, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojDrill,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojDrill, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowCountChanged(
    `type`: rowCountChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowCountChanged(
    `type`: rowCountChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowHeightChanged(
    `type`: rowHeightChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowHeightChanged(
    `type`: rowHeightChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _],
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
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): NodeContext | Null = js.native
  def getItem(index: Double): ItemContext[K] | Null = js.native
  def getItemCount(): Double = js.native
  @JSName("getProperty")
  def getProperty_animationDuration(property: animationDuration): js.UndefOr[Double] = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | popIn | alphaFade | zoom | none = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_columnCount(property: columnCount): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_columnWidth(property: columnWidth): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_drilling(property: drilling): on | off = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_hoverBehaviorDelay(property: hoverBehaviorDelay): Double = js.native
  @JSName("getProperty")
  def getProperty_layout(property: layout): vertical | horizontal = js.native
  @JSName("getProperty")
  def getProperty_layoutOrigin(property: layoutOrigin): topEnd | bottomStart | bottomEnd | topStart = js.native
  @JSName("getProperty")
  def getProperty_rowCount(property: rowCount): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_rowHeight(property: rowHeight): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K] = js.native
  def setProperties(properties: ojPictoChartSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: alphaFade): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: popIn): Unit = js.native
  def setProperty(property: animationOnDisplay, value: zoom): Unit = js.native
  def setProperty(property: drilling, value: off): Unit = js.native
  def setProperty(property: drilling, value: on): Unit = js.native
  def setProperty(property: highlightMatch, value: all): Unit = js.native
  def setProperty(property: highlightMatch, value: any): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: layoutOrigin, value: bottomEnd): Unit = js.native
  def setProperty(property: layoutOrigin, value: bottomStart): Unit = js.native
  def setProperty(property: layoutOrigin, value: topEnd): Unit = js.native
  def setProperty(property: layoutOrigin, value: topStart): Unit = js.native
  def setProperty(property: layout, value: horizontal): Unit = js.native
  def setProperty(property: layout, value: vertical): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_columnCount(property: columnCount): Unit = js.native
  @JSName("setProperty")
  def setProperty_columnCount(property: columnCount, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_columnWidth(property: columnWidth): Unit = js.native
  @JSName("setProperty")
  def setProperty_columnWidth(property: columnWidth, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(property: hiddenCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(property: highlightedCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverBehaviorDelay(property: hoverBehaviorDelay, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowCount(property: rowCount): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowCount(property: rowCount, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowHeight(property: rowHeight): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowHeight(property: rowHeight, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_ComponentNameLabelAndValue): Unit = js.native
}

