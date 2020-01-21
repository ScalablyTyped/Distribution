package typings.oracleOraclejet.ojtableMod

import typings.oracleOraclejet.AnonAutoClassName
import typings.oracleOraclejet.AnonAutoClassNameContext
import typings.oracleOraclejet.AnonColumnIndexColumnKey
import typings.oracleOraclejet.AnonColumnIndexKey
import typings.oracleOraclejet.AnonColumnMultiple
import typings.oracleOraclejet.AnonDataIndex
import typings.oracleOraclejet.AnonDragDropReorderAnonColumns
import typings.oracleOraclejet.AnonFetchSizeMaxCount
import typings.oracleOraclejet.AnonIndexOjtablefooter
import typings.oracleOraclejet.AnonLabelAccSelectionAffordanceBottom
import typings.oracleOraclejet.AnonRowHeader
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow
import typings.oracleOraclejet.ojtableMod.ojTable.RowRendererContext
import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import typings.oracleOraclejet.ojtableMod.ojTable.ojAnimateEnd
import typings.oracleOraclejet.ojtableMod.ojTable.ojAnimateStart
import typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeCurrentRow
import typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeRowEdit
import typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeRowEditEnd
import typings.oracleOraclejet.ojtableMod.ojTable.ojSort
import typings.oracleOraclejet.oracleOraclejetStrings.accessibility
import typings.oracleOraclejet.oracleOraclejetStrings.accessibilityChanged
import typings.oracleOraclejet.oracleOraclejetStrings.as
import typings.oracleOraclejet.oracleOraclejetStrings.asChanged
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.columns
import typings.oracleOraclejet.oracleOraclejetStrings.columnsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.columnsDefault
import typings.oracleOraclejet.oracleOraclejetStrings.columnsDefaultChanged
import typings.oracleOraclejet.oracleOraclejetStrings.currentRow
import typings.oracleOraclejet.oracleOraclejetStrings.currentRowChanged
import typings.oracleOraclejet.oracleOraclejetStrings.data
import typings.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.display
import typings.oracleOraclejet.oracleOraclejetStrings.displayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dnd
import typings.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typings.oracleOraclejet.oracleOraclejetStrings.editMode
import typings.oracleOraclejet.oracleOraclejetStrings.editModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import typings.oracleOraclejet.oracleOraclejetStrings.firstSelectedRowChanged
import typings.oracleOraclejet.oracleOraclejetStrings.grid
import typings.oracleOraclejet.oracleOraclejetStrings.horizontalGridVisible
import typings.oracleOraclejet.oracleOraclejetStrings.horizontalGridVisibleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.list
import typings.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.rowEdit
import typings.oracleOraclejet.oracleOraclejetStrings.rowRenderer
import typings.oracleOraclejet.oracleOraclejetStrings.rowRendererChanged
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
import typings.oracleOraclejet.oracleOraclejetStrings.selectionRequired
import typings.oracleOraclejet.oracleOraclejetStrings.selectionRequiredChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.verticalGridVisible
import typings.oracleOraclejet.oracleOraclejetStrings.verticalGridVisibleChanged
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTable_[K, D] extends baseComponent[ojTableSettableProperties[K, D]] {
  var accessibility: AnonRowHeader = js.native
  var as: String = js.native
  var columns: (js.Array[AnonAutoClassName[K, D]]) | Null = js.native
  var columnsDefault: AnonAutoClassNameContext[K, D] = js.native
  var currentRow: CurrentRow[K] | Null = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var display: list | grid = js.native
  var dnd: AnonDragDropReorderAnonColumns[K, D] = js.native
  var editMode: none | rowEdit = js.native
  val firstSelectedRow: js.Object = js.native
  var horizontalGridVisible: auto | enabled | disabled = js.native
  var onAccessibilityChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonRowHeader], _]) | Null = js.native
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onColumnsChanged: (js.Function1[/* event */ JetElementCustomEvent[(js.Array[AnonAutoClassName[K, D]]) | Null], _]) | Null = js.native
  var onColumnsDefaultChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonAutoClassNameContext[K, D]], _]) | Null = js.native
  var onCurrentRowChanged: (js.Function1[/* event */ JetElementCustomEvent[CurrentRow[K] | Null], _]) | Null = js.native
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], _]) | Null = js.native
  var onDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[list | grid], _]) | Null = js.native
  var onDndChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonDragDropReorderAnonColumns[K, D]], _]) | Null = js.native
  var onEditModeChanged: (js.Function1[/* event */ JetElementCustomEvent[none | rowEdit], _]) | Null = js.native
  var onFirstSelectedRowChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
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
  var onScrollPolicyOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonFetchSizeMaxCount], _]) | Null = js.native
  var onScrollPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonColumnIndexColumnKey], _]) | Null = js.native
  var onSelectionChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      js.Array[
        (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
      ]
    ], 
    _
  ]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonColumnMultiple], _]) | Null = js.native
  var onSelectionRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onVerticalGridVisibleChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | enabled | disabled], _]) | Null = js.native
  var rowRenderer: (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null = js.native
  var scrollPolicy: auto | loadMoreOnScroll = js.native
  var scrollPolicyOptions: AnonFetchSizeMaxCount = js.native
  var scrollPosition: AnonColumnIndexColumnKey = js.native
  var selection: js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ] = js.native
  var selectionMode: AnonColumnMultiple = js.native
  var selectionRequired: Boolean = js.native
  @JSName("translations")
  var translations_ojTable_ : AnonLabelAccSelectionAffordanceBottom = js.native
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
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: firstSelectedRowChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonRowHeader], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accessibilityChanged(
    `type`: accessibilityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonRowHeader], _],
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
      /* ev */ JetElementCustomEvent[(js.Array[AnonAutoClassName[K, D]]) | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(
    `type`: columnsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Array[AnonAutoClassName[K, D]]) | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsDefaultChanged(
    `type`: columnsDefaultChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[AnonAutoClassNameContext[K, D]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsDefaultChanged(
    `type`: columnsDefaultChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[AnonAutoClassNameContext[K, D]], 
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
      /* ev */ JetElementCustomEvent[AnonDragDropReorderAnonColumns[K, D]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[AnonDragDropReorderAnonColumns[K, D]], 
      _
    ],
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
  def addEventListener_ojBeforeCurrentRow(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentRow,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCurrentRow[K], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentRow(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentRow,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCurrentRow[K], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEdit(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeRowEdit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeRowEdit, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEdit(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeRowEdit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeRowEdit, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEditEnd(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeRowEditEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeRowEditEnd, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEditEnd(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeRowEditEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeRowEditEnd, _],
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonFetchSizeMaxCount], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonFetchSizeMaxCount], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonColumnIndexColumnKey], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonColumnIndexColumnKey], _],
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonColumnMultiple], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonColumnMultiple], _],
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
  def getContextByNode(node: Element): AnonColumnIndexKey | AnonIndexOjtablefooter = js.native
  def getDataForVisibleRow(rowIndex: Double): (AnonDataIndex[D, K]) | Null = js.native
  @JSName("getProperty")
  def getProperty_accessibility(property: accessibility): AnonRowHeader = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_columns(property: columns): (js.Array[AnonAutoClassName[K, D]]) | Null = js.native
  @JSName("getProperty")
  def getProperty_columnsDefault(property: columnsDefault): AnonAutoClassNameContext[K, D] = js.native
  @JSName("getProperty")
  def getProperty_currentRow(property: currentRow): CurrentRow[K] | Null = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): list | grid = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): AnonDragDropReorderAnonColumns[K, D] = js.native
  @JSName("getProperty")
  def getProperty_editMode(property: editMode): none | rowEdit = js.native
  @JSName("getProperty")
  def getProperty_firstSelectedRow(property: typings.oracleOraclejet.oracleOraclejetStrings.firstSelectedRow): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_horizontalGridVisible(property: horizontalGridVisible): auto | enabled | disabled = js.native
  @JSName("getProperty")
  def getProperty_rowRenderer(property: rowRenderer): (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: scrollPolicy): auto | loadMoreOnScroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): AnonFetchSizeMaxCount = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): AnonColumnIndexColumnKey = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): AnonColumnMultiple = js.native
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
  def setProperty_accessibility(property: accessibility, value: AnonRowHeader): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns, value: js.Array[AnonAutoClassName[K, D]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_columnsDefault(property: columnsDefault, value: AnonAutoClassNameContext[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentRow(property: currentRow): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentRow(property: currentRow, value: CurrentRow[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: AnonDragDropReorderAnonColumns[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_firstSelectedRow(property: typings.oracleOraclejet.oracleOraclejetStrings.firstSelectedRow, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowRenderer(property: rowRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowRenderer(
    property: rowRenderer,
    value: js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: AnonFetchSizeMaxCount): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: AnonColumnIndexColumnKey): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(
    property: selection,
    value: js.Array[
      RowSelectionStart[K] with RowSelectionEnd[K] with ColumnSelectionStart[K] with ColumnSelectionEnd[K]
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionMode(property: selectionMode, value: AnonColumnMultiple): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRequired(property: selectionRequired, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonLabelAccSelectionAffordanceBottom): Unit = js.native
}

