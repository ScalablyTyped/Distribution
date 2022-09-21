package typings.oracleOraclejet.ojtableMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.ColumnIndexKey
import typings.oracleOraclejet.anon.ColumnKey
import typings.oracleOraclejet.anon.ColumnNumber
import typings.oracleOraclejet.anon.DataIndex
import typings.oracleOraclejet.anon.Datasource
import typings.oracleOraclejet.anon.DictpropNameActionElement
import typings.oracleOraclejet.anon.DictpropNameCancelEdit
import typings.oracleOraclejet.anon.DirectionHeader
import typings.oracleOraclejet.anon.DropReorder
import typings.oracleOraclejet.anon.ElementEndCallback
import typings.oracleOraclejet.anon.Field
import typings.oracleOraclejet.anon.FooterClassName
import typings.oracleOraclejet.anon.IndexSubId
import typings.oracleOraclejet.anon.LabelAccSelectionAffordanceBottom
import typings.oracleOraclejet.anon.MaxCount
import typings.oracleOraclejet.anon.RowContext
import typings.oracleOraclejet.anon.RowHeader
import typings.oracleOraclejet.anon.`21`
import typings.oracleOraclejet.anon.`22`
import typings.oracleOraclejet.anon.`23`
import typings.oracleOraclejet.anon.`24`
import typings.oracleOraclejet.anon.`25`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import typings.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow
import typings.oracleOraclejet.ojtableMod.ojTable.RowRendererContext
import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import typings.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
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
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentRow
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeRowEdit
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeRowEditEnd
import typings.oracleOraclejet.oracleOraclejetStrings.ojSort
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
import typings.std.CustomEvent
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojTable[K, D]
  extends StObject
     with baseComponent[ojTableSettableProperties[K, D]] {
  
  var accessibility: RowHeader = js.native
  
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[list | grid], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[list | grid], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | rowEdit], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | rowEdit], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: firstSelectedRowChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
      ], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: firstSelectedRowChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
      ], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: horizontalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | enabled | disabled], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: horizontalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | enabled | disabled], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: verticalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | enabled | disabled], 
      Any
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: verticalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | enabled | disabled], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accessibilityChanged(
    `type`: accessibilityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[RowHeader], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accessibilityChanged(
    `type`: accessibilityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[RowHeader], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(
    `type`: columnsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Array[Field[K, D]]) | Null], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(
    `type`: columnsChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(js.Array[Field[K, D]]) | Null], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsDefaultChanged(
    `type`: columnsDefaultChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[FooterClassName[K, D]], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsDefaultChanged(
    `type`: columnsDefaultChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[FooterClassName[K, D]], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentRowChanged(
    `type`: currentRowChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[CurrentRow[K] | Null], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentRowChanged(
    `type`: currentRowChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[CurrentRow[K] | Null], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[DropReorder[K, D]], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[DropReorder[K, D]], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtableMod.ojTable.ojAnimateEnd, 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtableMod.ojTable.ojAnimateEnd, 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtableMod.ojTable.ojAnimateStart, 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtableMod.ojTable.ojAnimateStart, 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentRow(
    `type`: ojBeforeCurrentRow,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeCurrentRow[K], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentRow(
    `type`: ojBeforeCurrentRow,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeCurrentRow[K], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEdit(
    `type`: ojBeforeRowEdit,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeRowEdit, 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEdit(
    `type`: ojBeforeRowEdit,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeRowEdit, 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEditEnd(
    `type`: ojBeforeRowEditEnd,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeRowEditEnd, 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEditEnd(
    `type`: ojBeforeRowEditEnd,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeRowEditEnd, 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: ojSort,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtableMod.ojTable.ojSort, 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: ojSort,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojtableMod.ojTable.ojSort, 
      Any
    ],
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
      Any
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
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[MaxCount], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[MaxCount], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[ColumnKey], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[ColumnKey], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        js.Array[
          (RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K])
        ]
      ], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        js.Array[
          (RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K])
        ]
      ], 
      Any
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`21`], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`21`], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRequiredChanged(
    `type`: selectionRequiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRequiredChanged(
    `type`: selectionRequiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], Any],
    useCapture: Boolean
  ): Unit = js.native
  
  var as: String = js.native
  
  var columns: (js.Array[Field[K, D]]) | Null = js.native
  
  var columnsDefault: FooterClassName[K, D] = js.native
  
  var currentRow: CurrentRow[K] | Null = js.native
  
  var data: (DataProvider[K, D]) | Null = js.native
  
  var display: list | grid = js.native
  
  var dnd: DropReorder[K, D] = js.native
  
  var editMode: none | rowEdit = js.native
  
  val firstSelectedRow: js.Object = js.native
  
  def getContextByNode(node: Element): ColumnIndexKey | IndexSubId = js.native
  
  def getDataForVisibleRow(rowIndex: Double): (DataIndex[D, K]) | Null = js.native
  
  @JSName("getProperty")
  def getProperty_accessibility(property: accessibility): RowHeader = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_columns(property: columns): (js.Array[Field[K, D]]) | Null = js.native
  @JSName("getProperty")
  def getProperty_columnsDefault(property: columnsDefault): FooterClassName[K, D] = js.native
  @JSName("getProperty")
  def getProperty_currentRow(property: currentRow): CurrentRow[K] | Null = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): list | grid = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): DropReorder[K, D] = js.native
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
  def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): MaxCount = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): ColumnKey = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[
    (RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K])
  ] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): `21` = js.native
  @JSName("getProperty")
  def getProperty_selectionRequired(property: selectionRequired): Boolean = js.native
  @JSName("getProperty")
  def getProperty_verticalGridVisible(property: verticalGridVisible): auto | enabled | disabled = js.native
  
  var horizontalGridVisible: auto | enabled | disabled = js.native
  
  var onAccessibilityChanged: (js.Function1[/* event */ JetElementCustomEvent[RowHeader], Any]) | Null = js.native
  
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], Any]) | Null = js.native
  
  var onColumnsChanged: (js.Function1[/* event */ JetElementCustomEvent[(js.Array[Field[K, D]]) | Null], Any]) | Null = js.native
  
  var onColumnsDefaultChanged: (js.Function1[/* event */ JetElementCustomEvent[FooterClassName[K, D]], Any]) | Null = js.native
  
  var onCurrentRowChanged: (js.Function1[/* event */ JetElementCustomEvent[CurrentRow[K] | Null], Any]) | Null = js.native
  
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], Any]) | Null = js.native
  
  var onDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[list | grid], Any]) | Null = js.native
  
  var onDndChanged: (js.Function1[/* event */ JetElementCustomEvent[DropReorder[K, D]], Any]) | Null = js.native
  
  var onEditModeChanged: (js.Function1[/* event */ JetElementCustomEvent[none | rowEdit], Any]) | Null = js.native
  
  var onFirstSelectedRowChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
    ], 
    Any
  ]) | Null = js.native
  
  var onHorizontalGridVisibleChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | enabled | disabled], Any]) | Null = js.native
  
  var onOjAnimateEnd: (js.Function1[/* event */ typings.oracleOraclejet.ojtableMod.ojTable.ojAnimateEnd, Any]) | Null = js.native
  
  var onOjAnimateStart: (js.Function1[/* event */ typings.oracleOraclejet.ojtableMod.ojTable.ojAnimateStart, Any]) | Null = js.native
  
  var onOjBeforeCurrentRow: (js.Function1[/* event */ typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeCurrentRow[K], Any]) | Null = js.native
  
  var onOjBeforeRowEdit: (js.Function1[/* event */ typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeRowEdit, Any]) | Null = js.native
  
  var onOjBeforeRowEditEnd: (js.Function1[/* event */ typings.oracleOraclejet.ojtableMod.ojTable.ojBeforeRowEditEnd, Any]) | Null = js.native
  
  var onOjSort: (js.Function1[/* event */ typings.oracleOraclejet.ojtableMod.ojTable.ojSort, Any]) | Null = js.native
  
  var onRowRendererChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
    ], 
    Any
  ]) | Null = js.native
  
  var onScrollPolicyChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | loadMoreOnScroll], Any]) | Null = js.native
  
  var onScrollPolicyOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[MaxCount], Any]) | Null = js.native
  
  var onScrollPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[ColumnKey], Any]) | Null = js.native
  
  var onSelectionChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      js.Array[
        (RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K])
      ]
    ], 
    Any
  ]) | Null = js.native
  
  var onSelectionModeChanged: (js.Function1[/* event */ JetElementCustomEvent[`21`], Any]) | Null = js.native
  
  var onSelectionRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], Any]) | Null = js.native
  
  var onVerticalGridVisibleChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | enabled | disabled], Any]) | Null = js.native
  
  def refreshRow(rowIdx: Double): js.Promise[Boolean] = js.native
  
  var rowRenderer: (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null = js.native
  
  var scrollPolicy: auto | loadMoreOnScroll = js.native
  
  var scrollPolicyOptions: MaxCount = js.native
  
  var scrollPosition: ColumnKey = js.native
  
  var selection: js.Array[
    (RowSelectionStart[K] & RowSelectionEnd[K]) | (ColumnSelectionStart[K] & ColumnSelectionEnd[K])
  ] = js.native
  
  var selectionMode: `21` = js.native
  
  var selectionRequired: Boolean = js.native
  
  def setProperties(properties: ojTableSettablePropertiesLenient[K, D]): Unit = js.native
  
  def setProperty(property: display, value: list | grid): Unit = js.native
  def setProperty(property: editMode, value: none | rowEdit): Unit = js.native
  def setProperty(property: horizontalGridVisible, value: auto | enabled | disabled): Unit = js.native
  def setProperty(property: scrollPolicy, value: auto | loadMoreOnScroll): Unit = js.native
  def setProperty(property: verticalGridVisible, value: auto | enabled | disabled): Unit = js.native
  @JSName("setProperty")
  def setProperty_accessibility(property: accessibility, value: RowHeader): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns, value: js.Array[Field[K, D]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_columnsDefault(property: columnsDefault, value: FooterClassName[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentRow(property: currentRow): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentRow(property: currentRow, value: CurrentRow[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: DropReorder[K, D]): Unit = js.native
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
  def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: MaxCount): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: ColumnKey): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(
    property: selection,
    value: js.Array[
      RowSelectionStart[K] & RowSelectionEnd[K] & ColumnSelectionStart[K] & ColumnSelectionEnd[K]
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionMode(property: selectionMode, value: `21`): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRequired(property: selectionRequired, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelAccSelectionAffordanceBottom): Unit = js.native
  
  @JSName("translations")
  var translations_ojTable: LabelAccSelectionAffordanceBottom = js.native
  
  var verticalGridVisible: auto | enabled | disabled = js.native
}
object ojTable {
  
  /* Rewritten from type alias, can be one of: 
    - typings.oracleOraclejet.anon.EndIndex[K]
    - typings.oracleOraclejet.anon.EndKey[K]
  */
  trait ColumnSelectionEnd[K] extends StObject
  object ColumnSelectionEnd {
    
    inline def EndIndex[K](endIndex: ColumnNumber): typings.oracleOraclejet.anon.EndIndex[K] = {
      val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.oracleOraclejet.anon.EndIndex[K]]
    }
    
    inline def EndKey[K](endKey: `22`[K]): typings.oracleOraclejet.anon.EndKey[K] = {
      val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.oracleOraclejet.anon.EndKey[K]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oracleOraclejet.anon.StartKey[K]
    - typings.oracleOraclejet.anon.StartIndexStartKey[K]
  */
  trait ColumnSelectionStart[K] extends StObject
  object ColumnSelectionStart {
    
    inline def StartIndexStartKey[K](startKey: `22`[K]): typings.oracleOraclejet.anon.StartIndexStartKey[K] = {
      val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.oracleOraclejet.anon.StartIndexStartKey[K]]
    }
    
    inline def StartKey[K](startIndex: ColumnNumber): typings.oracleOraclejet.anon.StartKey[K] = {
      val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.oracleOraclejet.anon.StartKey[K]]
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait ColumnsRendererContext[K, D] extends StObject {
    
    var cellContext: Datasource[K, D]
    
    var columnIndex: Double
    
    var componentElement: Element
    
    var data: D
    
    var parentElement: Element
    
    var row: StringDictionary[Any]
  }
  object ColumnsRendererContext {
    
    inline def apply[K, D](
      cellContext: Datasource[K, D],
      columnIndex: Double,
      componentElement: Element,
      data: D,
      parentElement: Element,
      row: StringDictionary[Any]
    ): ColumnsRendererContext[K, D] = {
      val __obj = js.Dynamic.literal(cellContext = cellContext.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnsRendererContext[K, D]]
    }
    
    extension [Self <: ColumnsRendererContext[?, ?], K, D](x: Self & (ColumnsRendererContext[K, D])) {
      
      inline def setCellContext(value: Datasource[K, D]): Self = StObject.set(x, "cellContext", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setRow(value: StringDictionary[Any]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait ContextStatus[K] extends StObject {
    
    var currentRow: CurrentRow[K]
    
    var rowIndex: Double
    
    var rowKey: K
  }
  object ContextStatus {
    
    inline def apply[K](currentRow: CurrentRow[K], rowIndex: Double, rowKey: K): ContextStatus[K] = {
      val __obj = js.Dynamic.literal(currentRow = currentRow.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextStatus[K]]
    }
    
    extension [Self <: ContextStatus[?], K](x: Self & ContextStatus[K]) {
      
      inline def setCurrentRow(value: CurrentRow[K]): Self = StObject.set(x, "currentRow", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowKey(value: K): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oracleOraclejet.anon.RowKey[K]
    - typings.oracleOraclejet.anon.RowIndexRowKey[K]
  */
  trait CurrentRow[K] extends StObject
  object CurrentRow {
    
    inline def RowIndexRowKey[K](rowKey: K): typings.oracleOraclejet.anon.RowIndexRowKey[K] = {
      val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.oracleOraclejet.anon.RowIndexRowKey[K]]
    }
    
    inline def RowKey[K](rowIndex: Double): typings.oracleOraclejet.anon.RowKey[K] = {
      val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.oracleOraclejet.anon.RowKey[K]]
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait DragRowContext[K, D] extends StObject {
    
    var rows: js.Array[DataIndex[D, K]]
  }
  object DragRowContext {
    
    inline def apply[K, D](rows: js.Array[DataIndex[D, K]]): DragRowContext[K, D] = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragRowContext[K, D]]
    }
    
    extension [Self <: DragRowContext[?, ?], K, D](x: Self & (DragRowContext[K, D])) {
      
      inline def setRows(value: js.Array[DataIndex[D, K]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: (DataIndex[D, K])*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait DropColumnContext extends StObject {
    
    var columnIndex: Double
  }
  object DropColumnContext {
    
    inline def apply(columnIndex: Double): DropColumnContext = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropColumnContext]
    }
    
    extension [Self <: DropColumnContext](x: Self) {
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait DropRowContext extends StObject {
    
    var rowIndex: Double
  }
  object DropRowContext {
    
    inline def apply(rowIndex: Double): DropRowContext = {
      val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropRowContext]
    }
    
    extension [Self <: DropRowContext](x: Self) {
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait FooterRendererContext[K, D] extends StObject {
    
    var columnIndex: Double
    
    var componentElement: Element
    
    var footerContext: `23`[K, D]
    
    var parentElement: Element
  }
  object FooterRendererContext {
    
    inline def apply[K, D](columnIndex: Double, componentElement: Element, footerContext: `23`[K, D], parentElement: Element): FooterRendererContext[K, D] = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], footerContext = footerContext.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[FooterRendererContext[K, D]]
    }
    
    extension [Self <: FooterRendererContext[?, ?], K, D](x: Self & (FooterRendererContext[K, D])) {
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setFooterContext(value: `23`[K, D]): Self = StObject.set(x, "footerContext", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait HeaderRendererContext[K, D] extends StObject {
    
    var columnHeaderDefaultRenderer: js.UndefOr[
        js.Function2[
          /* param0 */ js.Object, 
          /* param1 */ js.Function1[/* param0 */ js.Object, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var columnHeaderSortableIconRenderer: js.UndefOr[
        js.Function2[
          /* param0 */ js.Object, 
          /* param1 */ js.Function1[/* param0 */ js.Object, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var columnIndex: Double
    
    var componentElement: Element
    
    var data: String
    
    var headerContext: `23`[K, D]
    
    var parentElement: Element
  }
  object HeaderRendererContext {
    
    inline def apply[K, D](
      columnIndex: Double,
      componentElement: Element,
      data: String,
      headerContext: `23`[K, D],
      parentElement: Element
    ): HeaderRendererContext[K, D] = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headerContext = headerContext.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderRendererContext[K, D]]
    }
    
    extension [Self <: HeaderRendererContext[?, ?], K, D](x: Self & (HeaderRendererContext[K, D])) {
      
      inline def setColumnHeaderDefaultRenderer(value: (/* param0 */ js.Object, /* param1 */ js.Function1[/* param0 */ js.Object, Unit]) => Unit): Self = StObject.set(x, "columnHeaderDefaultRenderer", js.Any.fromFunction2(value))
      
      inline def setColumnHeaderDefaultRendererUndefined: Self = StObject.set(x, "columnHeaderDefaultRenderer", js.undefined)
      
      inline def setColumnHeaderSortableIconRenderer(value: (/* param0 */ js.Object, /* param1 */ js.Function1[/* param0 */ js.Object, Unit]) => Unit): Self = StObject.set(x, "columnHeaderSortableIconRenderer", js.Any.fromFunction2(value))
      
      inline def setColumnHeaderSortableIconRendererUndefined: Self = StObject.set(x, "columnHeaderSortableIconRenderer", js.undefined)
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaderContext(value: `23`[K, D]): Self = StObject.set(x, "headerContext", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait RowRendererContext[K, D] extends StObject {
    
    var componentElement: Element
    
    var data: StringDictionary[Any]
    
    var parentElement: Element
    
    var rowContext: Datasource[K, D]
  }
  object RowRendererContext {
    
    inline def apply[K, D](
      componentElement: Element,
      data: StringDictionary[Any],
      parentElement: Element,
      rowContext: Datasource[K, D]
    ): RowRendererContext[K, D] = {
      val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], rowContext = rowContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowRendererContext[K, D]]
    }
    
    extension [Self <: RowRendererContext[?, ?], K, D](x: Self & (RowRendererContext[K, D])) {
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setRowContext(value: Datasource[K, D]): Self = StObject.set(x, "rowContext", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oracleOraclejet.anon.EndIndexEndKey[K]
    - typings.oracleOraclejet.anon.EndKey25[K]
  */
  trait RowSelectionEnd[K] extends StObject
  object RowSelectionEnd {
    
    inline def EndIndexEndKey[K](endIndex: `24`): typings.oracleOraclejet.anon.EndIndexEndKey[K] = {
      val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.oracleOraclejet.anon.EndIndexEndKey[K]]
    }
    
    inline def EndKey25[K](endKey: `25`[K]): typings.oracleOraclejet.anon.EndKey25[K] = {
      val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.oracleOraclejet.anon.EndKey25[K]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oracleOraclejet.anon.StartIndex24[K]
    - typings.oracleOraclejet.anon.StartKey25[K]
  */
  trait RowSelectionStart[K] extends StObject
  object RowSelectionStart {
    
    inline def StartIndex24[K](startIndex: `24`): typings.oracleOraclejet.anon.StartIndex24[K] = {
      val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.oracleOraclejet.anon.StartIndex24[K]]
    }
    
    inline def StartKey25[K](startKey: `25`[K]): typings.oracleOraclejet.anon.StartKey25[K] = {
      val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.oracleOraclejet.anon.StartKey25[K]]
    }
  }
  
  type ojAnimateEnd = CustomEvent[DictpropNameActionElement]
  
  type ojAnimateStart = CustomEvent[ElementEndCallback]
  
  type ojBeforeCurrentRow[K] = CustomEvent[typings.oracleOraclejet.anon.CurrentRow[K]]
  
  type ojBeforeRowEdit = CustomEvent[RowContext]
  
  type ojBeforeRowEditEnd = CustomEvent[DictpropNameCancelEdit]
  
  type ojSort = CustomEvent[DirectionHeader]
}
