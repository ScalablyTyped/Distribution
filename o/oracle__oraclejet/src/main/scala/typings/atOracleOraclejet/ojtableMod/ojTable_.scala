package typings.atOracleOraclejet.ojtableMod

import typings.atOracleOraclejet.Anon_AutoClassName
import typings.atOracleOraclejet.Anon_AutoClassNameContext
import typings.atOracleOraclejet.Anon_ColumnIndexColumnKey
import typings.atOracleOraclejet.Anon_ColumnIndexKey
import typings.atOracleOraclejet.Anon_ColumnMultiple
import typings.atOracleOraclejet.Anon_DataIndex
import typings.atOracleOraclejet.Anon_DragDropReorderAnonColumns
import typings.atOracleOraclejet.Anon_FetchSizeMaxCount
import typings.atOracleOraclejet.Anon_IndexOjtablefooter
import typings.atOracleOraclejet.Anon_LabelAccSelectionAffordanceBottom
import typings.atOracleOraclejet.Anon_RowHeader
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.accessibility
import typings.atOracleOraclejet.atOracleOraclejetStrings.accessibilityChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.as
import typings.atOracleOraclejet.atOracleOraclejetStrings.asChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.columns
import typings.atOracleOraclejet.atOracleOraclejetStrings.columnsChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.columnsDefault
import typings.atOracleOraclejet.atOracleOraclejetStrings.columnsDefaultChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.currentRow
import typings.atOracleOraclejet.atOracleOraclejetStrings.currentRowChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.data
import typings.atOracleOraclejet.atOracleOraclejetStrings.dataChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.display
import typings.atOracleOraclejet.atOracleOraclejetStrings.displayChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.dnd
import typings.atOracleOraclejet.atOracleOraclejetStrings.dndChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.editMode
import typings.atOracleOraclejet.atOracleOraclejetStrings.editModeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.enabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.firstSelectedRowChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.grid
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontalGridVisible
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontalGridVisibleChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.list
import typings.atOracleOraclejet.atOracleOraclejetStrings.loadMoreOnScroll
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.rowEdit
import typings.atOracleOraclejet.atOracleOraclejetStrings.rowRenderer
import typings.atOracleOraclejet.atOracleOraclejetStrings.rowRendererChanged
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
import typings.atOracleOraclejet.atOracleOraclejetStrings.selectionRequired
import typings.atOracleOraclejet.atOracleOraclejetStrings.selectionRequiredChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.atOracleOraclejetStrings.verticalGridVisible
import typings.atOracleOraclejet.atOracleOraclejetStrings.verticalGridVisibleChanged
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import typings.atOracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import typings.atOracleOraclejet.ojtableMod.ojTable.CurrentRow
import typings.atOracleOraclejet.ojtableMod.ojTable.RowRendererContext
import typings.atOracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import typings.atOracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import typings.atOracleOraclejet.ojtableMod.ojTable.ojAnimateEnd
import typings.atOracleOraclejet.ojtableMod.ojTable.ojAnimateStart
import typings.atOracleOraclejet.ojtableMod.ojTable.ojBeforeCurrentRow
import typings.atOracleOraclejet.ojtableMod.ojTable.ojBeforeRowEdit
import typings.atOracleOraclejet.ojtableMod.ojTable.ojBeforeRowEditEnd
import typings.atOracleOraclejet.ojtableMod.ojTable.ojSort
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojTable")
@js.native
trait ojTable_[K, D] extends baseComponent[ojTableSettableProperties[K, D]] {
  var accessibility: Anon_RowHeader = js.native
  var as: String = js.native
  var columns: (js.Array[Anon_AutoClassName[K, D]]) | Null = js.native
  var columnsDefault: Anon_AutoClassNameContext[K, D] = js.native
  var currentRow: CurrentRow[K] | Null = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var display: list | grid = js.native
  var dnd: Anon_DragDropReorderAnonColumns[K, D] = js.native
  var editMode: none | rowEdit = js.native
  val firstSelectedRow: js.Object = js.native
  var horizontalGridVisible: auto | enabled | disabled = js.native
  var onAccessibilityChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_RowHeader], _]) | Null = js.native
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onColumnsChanged: (js.Function1[/* event */ JetElementCustomEvent[(js.Array[Anon_AutoClassName[K, D]]) | Null], _]) | Null = js.native
  var onColumnsDefaultChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_AutoClassNameContext[K, D]], _]) | Null = js.native
  var onCurrentRowChanged: (js.Function1[/* event */ JetElementCustomEvent[CurrentRow[K] | Null], _]) | Null = js.native
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], _]) | Null = js.native
  var onDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[list | grid], _]) | Null = js.native
  var onDndChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_DragDropReorderAnonColumns[K, D]], _]) | Null = js.native
  var onEditModeChanged: (js.Function1[/* event */ JetElementCustomEvent[none | rowEdit], _]) | Null = js.native
  var onFirstSelectedRowChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
    ], 
    _
  ]) | Null = js.native
  var onHorizontalGridVisibleChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | enabled | disabled], _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onOjBeforeCurrentRow: (js.Function1[/* event */ ojBeforeCurrentRow[K], _]) | Null = js.native
  var onOjBeforeRowEdit: (js.Function1[/* event */ ojBeforeRowEdit, _]) | Null = js.native
  var onOjBeforeRowEditEnd: (js.Function1[/* event */ ojBeforeRowEditEnd, _]) | Null = js.native
  var onOjSort: (js.Function1[/* event */ ojSort, _]) | Null = js.native
  var onRowRendererChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
    ], 
    _
  ]) | Null = js.native
  var onScrollPolicyChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | loadMoreOnScroll], _]) | Null = js.native
  var onScrollPolicyOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_FetchSizeMaxCount], _]) | Null = js.native
  var onScrollPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_ColumnIndexColumnKey], _]) | Null = js.native
  var onSelectionChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      js.Array[
        (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
      ]
    ], 
    _
  ]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_ColumnMultiple], _]) | Null = js.native
  var onSelectionRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onVerticalGridVisibleChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | enabled | disabled], _]) | Null = js.native
  var rowRenderer: (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null = js.native
  var scrollPolicy: auto | loadMoreOnScroll = js.native
  var scrollPolicyOptions: Anon_FetchSizeMaxCount = js.native
  var scrollPosition: Anon_ColumnIndexColumnKey = js.native
  var selection: js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ] = js.native
  var selectionMode: Anon_ColumnMultiple = js.native
  var selectionRequired: Boolean = js.native
  @JSName("translations")
  var translations_ojTable_ : Anon_LabelAccSelectionAffordanceBottom = js.native
  var verticalGridVisible: auto | enabled | disabled = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[list | grid], _]
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[list | grid], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | rowEdit], _]
  ): Unit = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | rowEdit], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: firstSelectedRowChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: firstSelectedRowChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: horizontalGridVisibleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | enabled | disabled], _]
  ): Unit = js.native
  def addEventListener(
    `type`: horizontalGridVisibleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | enabled | disabled], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll], _]
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: verticalGridVisibleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | enabled | disabled], _]
  ): Unit = js.native
  def addEventListener(
    `type`: verticalGridVisibleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | enabled | disabled], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accessibilityChanged(
    `type`: accessibilityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_RowHeader], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accessibilityChanged(
    `type`: accessibilityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_RowHeader], _],
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
  def addEventListener_columnsChanged(
    `type`: columnsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Array[Anon_AutoClassName[K, D]]) | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(
    `type`: columnsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Array[Anon_AutoClassName[K, D]]) | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsDefaultChanged(
    `type`: columnsDefaultChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_AutoClassNameContext[K, D]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsDefaultChanged(
    `type`: columnsDefaultChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_AutoClassNameContext[K, D]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentRowChanged(
    `type`: currentRowChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[CurrentRow[K] | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentRowChanged(
    `type`: currentRowChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[CurrentRow[K] | Null], _],
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
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_DragDropReorderAnonColumns[K, D]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_DragDropReorderAnonColumns[K, D]], 
      _
    ],
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
  def addEventListener_ojBeforeCurrentRow(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCurrentRow,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCurrentRow[K], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentRow(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCurrentRow,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCurrentRow[K], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEdit(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeRowEdit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeRowEdit, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEdit(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeRowEdit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeRowEdit, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEditEnd(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeRowEditEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeRowEditEnd, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEditEnd(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeRowEditEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeRowEditEnd, _],
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
  def addEventListener_rowRendererChanged(
    `type`: rowRendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
      ], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowRendererChanged(
    `type`: rowRendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_FetchSizeMaxCount], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_FetchSizeMaxCount], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_ColumnIndexColumnKey], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_ColumnIndexColumnKey], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        js.Array[
          (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
        ]
      ], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        js.Array[
          (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
        ]
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_ColumnMultiple], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_ColumnMultiple], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRequiredChanged(
    `type`: selectionRequiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRequiredChanged(
    `type`: selectionRequiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): Anon_ColumnIndexKey | Anon_IndexOjtablefooter = js.native
  def getDataForVisibleRow(rowIndex: Double): (Anon_DataIndex[D, K]) | Null = js.native
  @JSName("getProperty")
  def getProperty_accessibility(property: accessibility): Anon_RowHeader = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_columns(property: columns): (js.Array[Anon_AutoClassName[K, D]]) | Null = js.native
  @JSName("getProperty")
  def getProperty_columnsDefault(property: columnsDefault): Anon_AutoClassNameContext[K, D] = js.native
  @JSName("getProperty")
  def getProperty_currentRow(property: currentRow): CurrentRow[K] | Null = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): list | grid = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): Anon_DragDropReorderAnonColumns[K, D] = js.native
  @JSName("getProperty")
  def getProperty_editMode(property: editMode): none | rowEdit = js.native
  @JSName("getProperty")
  def getProperty_firstSelectedRow(property: typings.atOracleOraclejet.atOracleOraclejetStrings.firstSelectedRow): /* import warning: ImportType.apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_horizontalGridVisible(property: horizontalGridVisible): auto | enabled | disabled = js.native
  @JSName("getProperty")
  def getProperty_rowRenderer(property: rowRenderer): (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: scrollPolicy): auto | loadMoreOnScroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): Anon_FetchSizeMaxCount = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): Anon_ColumnIndexColumnKey = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): Anon_ColumnMultiple = js.native
  @JSName("getProperty")
  def getProperty_selectionRequired(property: selectionRequired): Boolean = js.native
  @JSName("getProperty")
  def getProperty_verticalGridVisible(property: verticalGridVisible): auto | enabled | disabled = js.native
  def refreshRow(rowIdx: Double): js.Promise[Boolean] = js.native
  def setProperties(properties: ojTableSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: display, value: grid): Unit = js.native
  def setProperty(property: display, value: list): Unit = js.native
  def setProperty(property: editMode, value: none): Unit = js.native
  def setProperty(property: editMode, value: rowEdit): Unit = js.native
  def setProperty(property: horizontalGridVisible, value: auto): Unit = js.native
  def setProperty(property: horizontalGridVisible, value: disabled): Unit = js.native
  def setProperty(property: horizontalGridVisible, value: enabled): Unit = js.native
  def setProperty(property: scrollPolicy, value: auto): Unit = js.native
  def setProperty(property: scrollPolicy, value: loadMoreOnScroll): Unit = js.native
  def setProperty(property: verticalGridVisible, value: auto): Unit = js.native
  def setProperty(property: verticalGridVisible, value: disabled): Unit = js.native
  def setProperty(property: verticalGridVisible, value: enabled): Unit = js.native
  @JSName("setProperty")
  def setProperty_accessibility(property: accessibility, value: Anon_RowHeader): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns, value: js.Array[Anon_AutoClassName[K, D]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_columnsDefault(property: columnsDefault, value: Anon_AutoClassNameContext[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentRow(property: currentRow): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentRow(property: currentRow, value: CurrentRow[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: Anon_DragDropReorderAnonColumns[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_firstSelectedRow(property: typings.atOracleOraclejet.atOracleOraclejetStrings.firstSelectedRow, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowRenderer(property: rowRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowRenderer(
    property: rowRenderer,
    value: js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: Anon_FetchSizeMaxCount): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: Anon_ColumnIndexColumnKey): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(
    property: selection,
    value: js.Array[
      (ColumnSelectionStart[K] | RowSelectionStart[K]) with (ColumnSelectionEnd[K] | RowSelectionEnd[K])
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionMode(property: selectionMode, value: Anon_ColumnMultiple): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRequired(property: selectionRequired, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_LabelAccSelectionAffordanceBottom): Unit = js.native
}

