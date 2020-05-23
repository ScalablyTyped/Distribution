package typings.oracleOraclejet.ojdatagridMod

import typings.oracleOraclejet.anon.AccessibleActionableMode
import typings.oracleOraclejet.anon.Cell
import typings.oracleOraclejet.anon.ClassName
import typings.oracleOraclejet.anon.Column
import typings.oracleOraclejet.anon.ColumnEnd
import typings.oracleOraclejet.anon.ColumnIndex
import typings.oracleOraclejet.anon.Horizontal
import typings.oracleOraclejet.anon.MaxColumnCount
import typings.oracleOraclejet.anon.Reorder
import typings.oracleOraclejet.anon.SubId
import typings.oracleOraclejet.anon.`2`
import typings.oracleOraclejet.anon.`3`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.LabelContext
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.Selection
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojBeforeCurrentCell
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojBeforeEdit
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojBeforeEditEnd
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojResize
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojScroll
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.ojSort
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bandingInterval
import typings.oracleOraclejet.oracleOraclejetStrings.bandingIntervalChanged
import typings.oracleOraclejet.oracleOraclejetStrings.cell
import typings.oracleOraclejet.oracleOraclejetStrings.cellChanged
import typings.oracleOraclejet.oracleOraclejetStrings.cellEdit
import typings.oracleOraclejet.oracleOraclejetStrings.cellNavigation
import typings.oracleOraclejet.oracleOraclejetStrings.currentCell
import typings.oracleOraclejet.oracleOraclejetStrings.currentCellChanged
import typings.oracleOraclejet.oracleOraclejetStrings.data
import typings.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dnd
import typings.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typings.oracleOraclejet.oracleOraclejetStrings.editMode
import typings.oracleOraclejet.oracleOraclejetStrings.editModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.gridlines
import typings.oracleOraclejet.oracleOraclejetStrings.gridlinesChanged
import typings.oracleOraclejet.oracleOraclejetStrings.header
import typings.oracleOraclejet.oracleOraclejetStrings.headerChanged
import typings.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.scroll
import typings.oracleOraclejet.oracleOraclejetStrings.scrollPolicy
import typings.oracleOraclejet.oracleOraclejetStrings.scrollPolicyChanged
import typings.oracleOraclejet.oracleOraclejetStrings.scrollPolicyOptions
import typings.oracleOraclejet.oracleOraclejetStrings.scrollPolicyOptionsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.scrollPosition
import typings.oracleOraclejet.oracleOraclejetStrings.scrollPositionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selection
import typings.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typings.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDataGrid_[K, D] extends baseComponent[ojDataGridSettableProperties[K, D]] {
  var bandingInterval: Column = js.native
  var cell: ClassName[K, D] = js.native
  var currentCell: CurrentCell[K] | Null = js.native
  var data: DataProvider[K, D] = js.native
  var dnd: Reorder = js.native
  var editMode: none | cellNavigation | cellEdit = js.native
  var gridlines: Horizontal = js.native
  var header: ColumnEnd[K, D] = js.native
  var onBandingIntervalChanged: (js.Function1[/* event */ JetElementCustomEvent[Column], _]) | Null = js.native
  var onCellChanged: (js.Function1[/* event */ JetElementCustomEvent[ClassName[K, D]], _]) | Null = js.native
  var onCurrentCellChanged: (js.Function1[/* event */ JetElementCustomEvent[CurrentCell[K] | Null], _]) | Null = js.native
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[DataProvider[K, D]], _]) | Null = js.native
  var onDndChanged: (js.Function1[/* event */ JetElementCustomEvent[Reorder], _]) | Null = js.native
  var onEditModeChanged: (js.Function1[/* event */ JetElementCustomEvent[none | cellNavigation | cellEdit], _]) | Null = js.native
  var onGridlinesChanged: (js.Function1[/* event */ JetElementCustomEvent[Horizontal], _]) | Null = js.native
  var onHeaderChanged: (js.Function1[/* event */ JetElementCustomEvent[ColumnEnd[K, D]], _]) | Null = js.native
  var onOjBeforeCurrentCell: (js.Function1[/* event */ ojBeforeCurrentCell[K], _]) | Null = js.native
  var onOjBeforeEdit: (js.Function1[/* event */ ojBeforeEdit[K, D], _]) | Null = js.native
  var onOjBeforeEditEnd: (js.Function1[/* event */ ojBeforeEditEnd[K, D], _]) | Null = js.native
  var onOjResize: (js.Function1[/* event */ ojResize, _]) | Null = js.native
  var onOjScroll: (js.Function1[/* event */ ojScroll, _]) | Null = js.native
  var onOjSort: (js.Function1[/* event */ ojSort, _]) | Null = js.native
  var onScrollPolicyChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | loadMoreOnScroll | scroll], _]) | Null = js.native
  var onScrollPolicyOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[MaxColumnCount], _]) | Null = js.native
  var onScrollPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[ColumnIndex[K]], _]) | Null = js.native
  var onSelectionChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Selection[K]]], _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[/* event */ JetElementCustomEvent[Cell], _]) | Null = js.native
  var scrollPolicy: auto | loadMoreOnScroll | scroll = js.native
  var scrollPolicyOptions: MaxColumnCount = js.native
  var scrollPosition: ColumnIndex[K] = js.native
  var selection: js.Array[Selection[K]] = js.native
  var selectionMode: Cell = js.native
  @JSName("translations")
  var translations_ojDataGrid_ : AccessibleActionableMode = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[none | cellNavigation | cellEdit], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[none | cellNavigation | cellEdit], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll | scroll], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll | scroll], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bandingIntervalChanged(
    `type`: bandingIntervalChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Column], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bandingIntervalChanged(
    `type`: bandingIntervalChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Column], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellChanged(
    `type`: cellChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[ClassName[K, D]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellChanged(
    `type`: cellChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[ClassName[K, D]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentCellChanged(
    `type`: currentCellChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[CurrentCell[K] | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentCellChanged(
    `type`: currentCellChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[CurrentCell[K] | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[DataProvider[K, D]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[DataProvider[K, D]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Reorder], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Reorder], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: gridlinesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Horizontal], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: gridlinesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Horizontal], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_headerChanged(
    `type`: headerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[ColumnEnd[K, D]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_headerChanged(
    `type`: headerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[ColumnEnd[K, D]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentCell(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentCell,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCurrentCell[K], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentCell(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentCell,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCurrentCell[K], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEdit(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeEdit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeEdit[K, D], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEdit(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeEdit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeEdit[K, D], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEditEnd(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeEditEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeEditEnd[K, D], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEditEnd(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeEditEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeEditEnd[K, D], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojResize, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojResize, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojScroll(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojScroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojScroll, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojScroll(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojScroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojScroll, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojSort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojSort, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojSort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojSort, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[MaxColumnCount], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[MaxColumnCount], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[ColumnIndex[K]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[ColumnIndex[K]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Selection[K]]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Selection[K]]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Cell], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Cell], _],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): ((CellContext[K, D]) with SubId) | ((HeaderContext[K, D]) with `2`) | ((LabelContext[K, D]) with `3`) = js.native
  @JSName("getProperty")
  def getProperty_bandingInterval(property: bandingInterval): Column = js.native
  @JSName("getProperty")
  def getProperty_cell(property: cell): ClassName[K, D] = js.native
  @JSName("getProperty")
  def getProperty_currentCell(property: currentCell): CurrentCell[K] | Null = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): DataProvider[K, D] = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): Reorder = js.native
  @JSName("getProperty")
  def getProperty_editMode(property: editMode): none | cellNavigation | cellEdit = js.native
  @JSName("getProperty")
  def getProperty_gridlines(property: gridlines): Horizontal = js.native
  @JSName("getProperty")
  def getProperty_header(property: header): ColumnEnd[K, D] = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: scrollPolicy): auto | loadMoreOnScroll | scroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): MaxColumnCount = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): ColumnIndex[K] = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[Selection[K]] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): Cell = js.native
  def setProperties(properties: ojDataGridSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: editMode, value: cellEdit): Unit = js.native
  def setProperty(property: editMode, value: cellNavigation): Unit = js.native
  def setProperty(property: editMode, value: none): Unit = js.native
  def setProperty(property: scrollPolicy, value: auto): Unit = js.native
  def setProperty(property: scrollPolicy, value: loadMoreOnScroll): Unit = js.native
  def setProperty(property: scrollPolicy, value: scroll): Unit = js.native
  @JSName("setProperty")
  def setProperty_bandingInterval(property: bandingInterval, value: Column): Unit = js.native
  @JSName("setProperty")
  def setProperty_cell(property: cell, value: ClassName[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentCell(property: currentCell): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentCell(property: currentCell, value: CurrentCell[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: Reorder): Unit = js.native
  @JSName("setProperty")
  def setProperty_gridlines(property: gridlines, value: Horizontal): Unit = js.native
  @JSName("setProperty")
  def setProperty_header(property: header, value: ColumnEnd[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: MaxColumnCount): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: ColumnIndex[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[Selection[K]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionMode(property: selectionMode, value: Cell): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AccessibleActionableMode): Unit = js.native
}

