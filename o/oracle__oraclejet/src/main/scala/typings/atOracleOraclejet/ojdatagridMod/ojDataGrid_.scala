package typings.atOracleOraclejet.ojdatagridMod

import typings.atOracleOraclejet.Anon_AccessibleActionableMode
import typings.atOracleOraclejet.Anon_Cell
import typings.atOracleOraclejet.Anon_ClassName
import typings.atOracleOraclejet.Anon_Column
import typings.atOracleOraclejet.Anon_ColumnColumnEnd
import typings.atOracleOraclejet.Anon_ColumnIndex
import typings.atOracleOraclejet.Anon_Hidden
import typings.atOracleOraclejet.Anon_MaxColumnCount
import typings.atOracleOraclejet.Anon_Ojdatagridcell
import typings.atOracleOraclejet.Anon_Ojdatagridheader
import typings.atOracleOraclejet.Anon_Ojdatagridheaderlabel
import typings.atOracleOraclejet.Anon_Reorder
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bandingInterval
import typings.atOracleOraclejet.atOracleOraclejetStrings.bandingIntervalChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.cell
import typings.atOracleOraclejet.atOracleOraclejetStrings.cellChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.cellEdit
import typings.atOracleOraclejet.atOracleOraclejetStrings.cellNavigation
import typings.atOracleOraclejet.atOracleOraclejetStrings.currentCell
import typings.atOracleOraclejet.atOracleOraclejetStrings.currentCellChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.data
import typings.atOracleOraclejet.atOracleOraclejetStrings.dataChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.dnd
import typings.atOracleOraclejet.atOracleOraclejetStrings.dndChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.editMode
import typings.atOracleOraclejet.atOracleOraclejetStrings.editModeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.gridlines
import typings.atOracleOraclejet.atOracleOraclejetStrings.gridlinesChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.header
import typings.atOracleOraclejet.atOracleOraclejetStrings.headerChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.loadMoreOnScroll
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.scroll
import typings.atOracleOraclejet.atOracleOraclejetStrings.scrollPolicy
import typings.atOracleOraclejet.atOracleOraclejetStrings.scrollPolicyChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.scrollPolicyOptions
import typings.atOracleOraclejet.atOracleOraclejetStrings.scrollPolicyOptionsChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.scrollPosition
import typings.atOracleOraclejet.atOracleOraclejetStrings.scrollPositionChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.selection
import typings.atOracleOraclejet.atOracleOraclejetStrings.selectionChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.selectionMode
import typings.atOracleOraclejet.atOracleOraclejetStrings.selectionModeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.CellContext
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.LabelContext
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.Selection
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.ojBeforeCurrentCell
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.ojBeforeEdit
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.ojBeforeEditEnd
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.ojResize
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.ojScroll
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.ojSort
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojDataGrid")
@js.native
trait ojDataGrid_[K, D] extends baseComponent[ojDataGridSettableProperties[K, D]] {
  var bandingInterval: Anon_Column = js.native
  var cell: Anon_ClassName[K, D] = js.native
  var currentCell: CurrentCell[K] | Null = js.native
  var data: DataProvider[K, D] = js.native
  var dnd: Anon_Reorder = js.native
  var editMode: none | cellNavigation | cellEdit = js.native
  var gridlines: Anon_Hidden = js.native
  var header: Anon_ColumnColumnEnd[K, D] = js.native
  var onBandingIntervalChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_Column], _]) | Null = js.native
  var onCellChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_ClassName[K, D]], _]) | Null = js.native
  var onCurrentCellChanged: (js.Function1[/* event */ JetElementCustomEvent[CurrentCell[K] | Null], _]) | Null = js.native
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[DataProvider[K, D]], _]) | Null = js.native
  var onDndChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_Reorder], _]) | Null = js.native
  var onEditModeChanged: (js.Function1[/* event */ JetElementCustomEvent[none | cellNavigation | cellEdit], _]) | Null = js.native
  var onGridlinesChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_Hidden], _]) | Null = js.native
  var onHeaderChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_ColumnColumnEnd[K, D]], _]) | Null = js.native
  var onOjBeforeCurrentCell: (js.Function1[/* event */ ojBeforeCurrentCell[K], _]) | Null = js.native
  var onOjBeforeEdit: (js.Function1[/* event */ ojBeforeEdit[K, D], _]) | Null = js.native
  var onOjBeforeEditEnd: (js.Function1[/* event */ ojBeforeEditEnd[K, D], _]) | Null = js.native
  var onOjResize: (js.Function1[/* event */ ojResize, _]) | Null = js.native
  var onOjScroll: (js.Function1[/* event */ ojScroll, _]) | Null = js.native
  var onOjSort: (js.Function1[/* event */ ojSort, _]) | Null = js.native
  var onScrollPolicyChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | loadMoreOnScroll | scroll], _]) | Null = js.native
  var onScrollPolicyOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_MaxColumnCount], _]) | Null = js.native
  var onScrollPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_ColumnIndex[K]], _]) | Null = js.native
  var onSelectionChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Selection[K]]], _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_Cell], _]) | Null = js.native
  var scrollPolicy: auto | loadMoreOnScroll | scroll = js.native
  var scrollPolicyOptions: Anon_MaxColumnCount = js.native
  var scrollPosition: Anon_ColumnIndex[K] = js.native
  var selection: js.Array[Selection[K]] = js.native
  var selectionMode: Anon_Cell = js.native
  @JSName("translations")
  var translations_ojDataGrid_ : Anon_AccessibleActionableMode = js.native
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Column], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bandingIntervalChanged(
    `type`: bandingIntervalChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Column], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellChanged(
    `type`: cellChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_ClassName[K, D]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellChanged(
    `type`: cellChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_ClassName[K, D]], _],
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Reorder], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Reorder], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: gridlinesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Hidden], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: gridlinesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Hidden], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_headerChanged(
    `type`: headerChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_ColumnColumnEnd[K, D]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_headerChanged(
    `type`: headerChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_ColumnColumnEnd[K, D]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentCell(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCurrentCell,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCurrentCell[K], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentCell(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCurrentCell,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCurrentCell[K], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEdit(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeEdit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeEdit[K, D], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEdit(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeEdit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeEdit[K, D], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEditEnd(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeEditEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeEditEnd[K, D], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEditEnd(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeEditEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeEditEnd[K, D], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojResize, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojResize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojResize, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojScroll(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojScroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojScroll, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojScroll(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojScroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojScroll, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojSort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojSort, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojSort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojSort, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_MaxColumnCount], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_MaxColumnCount], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_ColumnIndex[K]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_ColumnIndex[K]], _],
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Cell], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Cell], _],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): ((CellContext[K, D]) with Anon_Ojdatagridcell) | ((HeaderContext[K, D]) with Anon_Ojdatagridheader) | ((LabelContext[K, D]) with Anon_Ojdatagridheaderlabel) = js.native
  @JSName("getProperty")
  def getProperty_bandingInterval(property: bandingInterval): Anon_Column = js.native
  @JSName("getProperty")
  def getProperty_cell(property: cell): Anon_ClassName[K, D] = js.native
  @JSName("getProperty")
  def getProperty_currentCell(property: currentCell): CurrentCell[K] | Null = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): DataProvider[K, D] = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): Anon_Reorder = js.native
  @JSName("getProperty")
  def getProperty_editMode(property: editMode): none | cellNavigation | cellEdit = js.native
  @JSName("getProperty")
  def getProperty_gridlines(property: gridlines): Anon_Hidden = js.native
  @JSName("getProperty")
  def getProperty_header(property: header): Anon_ColumnColumnEnd[K, D] = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: scrollPolicy): auto | loadMoreOnScroll | scroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): Anon_MaxColumnCount = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): Anon_ColumnIndex[K] = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[Selection[K]] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): Anon_Cell = js.native
  def setProperties(properties: ojDataGridSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: editMode, value: cellEdit): Unit = js.native
  def setProperty(property: editMode, value: cellNavigation): Unit = js.native
  def setProperty(property: editMode, value: none): Unit = js.native
  def setProperty(property: scrollPolicy, value: auto): Unit = js.native
  def setProperty(property: scrollPolicy, value: loadMoreOnScroll): Unit = js.native
  def setProperty(property: scrollPolicy, value: scroll): Unit = js.native
  @JSName("setProperty")
  def setProperty_bandingInterval(property: bandingInterval, value: Anon_Column): Unit = js.native
  @JSName("setProperty")
  def setProperty_cell(property: cell, value: Anon_ClassName[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentCell(property: currentCell): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentCell(property: currentCell, value: CurrentCell[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: Anon_Reorder): Unit = js.native
  @JSName("setProperty")
  def setProperty_gridlines(property: gridlines, value: Anon_Hidden): Unit = js.native
  @JSName("setProperty")
  def setProperty_header(property: header, value: Anon_ColumnColumnEnd[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: Anon_MaxColumnCount): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: Anon_ColumnIndex[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[Selection[K]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionMode(property: selectionMode, value: Anon_Cell): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_AccessibleActionableMode): Unit = js.native
}

