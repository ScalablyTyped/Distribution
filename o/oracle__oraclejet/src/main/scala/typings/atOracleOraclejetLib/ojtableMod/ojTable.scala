package typings
package atOracleOraclejetLib.ojtableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTable[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojTableSettableProperties[K, D]] {
  var accessibility: atOracleOraclejetLib.Anon_RowHeader = js.native
  var as: java.lang.String = js.native
  var columns: (js.Array[atOracleOraclejetLib.Anon_AutoClassName[K, D]]) | scala.Null = js.native
  var columnsDefault: atOracleOraclejetLib.Anon_AutoClassNameContext[K, D] = js.native
  var currentRow: atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K] | scala.Null = js.native
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null = js.native
  var display: atOracleOraclejetLib.atOracleOraclejetLibStrings.list | atOracleOraclejetLib.atOracleOraclejetLibStrings.grid = js.native
  var dnd: atOracleOraclejetLib.Anon_DragDropReorderAnonColumns[K, D] = js.native
  var editMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEdit = js.native
  val firstSelectedRow: js.Object = js.native
  var horizontalGridVisible: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled = js.native
  var onAccessibilityChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_RowHeader], 
    _
  ]) | scala.Null = js.native
  var onAsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onColumnsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(js.Array[atOracleOraclejetLib.Anon_AutoClassName[K, D]]) | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onColumnsDefaultChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoClassNameContext[K, D]], 
    _
  ]) | scala.Null = js.native
  var onCurrentRowChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K] | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onDataChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onDisplayChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.list | atOracleOraclejetLib.atOracleOraclejetLibStrings.grid
    ], 
    _
  ]) | scala.Null = js.native
  var onDndChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DragDropReorderAnonColumns[K, D]], 
    _
  ]) | scala.Null = js.native
  var onEditModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEdit
    ], 
    _
  ]) | scala.Null = js.native
  var onFirstSelectedRowChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing], 
    _
  ]) | scala.Null = js.native
  var onHorizontalGridVisibleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
    ], 
    _
  ]) | scala.Null = js.native
  var onOjAnimateEnd: (js.Function1[/* event */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojAnimateEnd, _]) | scala.Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojAnimateStart, _]) | scala.Null = js.native
  var onOjBeforeCurrentRow: (js.Function1[/* event */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojBeforeCurrentRow[K], _]) | scala.Null = js.native
  var onOjBeforeRowEdit: (js.Function1[/* event */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojBeforeRowEdit, _]) | scala.Null = js.native
  var onOjBeforeRowEditEnd: (js.Function1[/* event */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojBeforeRowEditEnd, _]) | scala.Null = js.native
  var onOjSort: (js.Function1[/* event */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojSort, _]) | scala.Null = js.native
  var onRowRendererChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function1[
        /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.RowRendererContext[K, D], 
        java.lang.String | stdLib.HTMLElement | scala.Unit
      ]) | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var onScrollPolicyChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll
    ], 
    _
  ]) | scala.Null = js.native
  var onScrollPolicyOptionsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_FetchSizeMaxCount], 
    _
  ]) | scala.Null = js.native
  var onScrollPositionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnIndexColumnKey], 
    _
  ]) | scala.Null = js.native
  var onSelectionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Array[
        atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionEnd[K]
      ]) | (js.Array[
        atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionEnd[K]
      ])
    ], 
    _
  ]) | scala.Null = js.native
  var onSelectionModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnMultiple], 
    _
  ]) | scala.Null = js.native
  var onSelectionRequiredChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
    _
  ]) | scala.Null = js.native
  var onVerticalGridVisibleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
    ], 
    _
  ]) | scala.Null = js.native
  var rowRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.RowRendererContext[K, D], 
    java.lang.String | stdLib.HTMLElement | scala.Unit
  ]) | scala.Null = js.native
  var scrollPolicy: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll = js.native
  var scrollPolicyOptions: atOracleOraclejetLib.Anon_FetchSizeMaxCount = js.native
  var scrollPosition: atOracleOraclejetLib.Anon_ColumnIndexColumnKey = js.native
  var selection: (js.Array[
    atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionEnd[K]
  ]) | (js.Array[
    atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionEnd[K]
  ]) = js.native
  var selectionMode: atOracleOraclejetLib.Anon_ColumnMultiple = js.native
  var selectionRequired: scala.Boolean = js.native
  @JSName("translations")
  var translations_ojTable: atOracleOraclejetLib.Anon_LabelAccSelectionAffordanceBottom = js.native
  var verticalGridVisible: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.displayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.list | atOracleOraclejetLib.atOracleOraclejetLibStrings.grid
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.displayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.list | atOracleOraclejetLib.atOracleOraclejetLibStrings.grid
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.editModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEdit
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.editModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEdit
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.verticalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.verticalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accessibilityChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.accessibilityChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_RowHeader], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accessibilityChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.accessibilityChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_RowHeader], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.asChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.asChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.columnsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(js.Array[atOracleOraclejetLib.Anon_AutoClassName[K, D]]) | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.columnsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(js.Array[atOracleOraclejetLib.Anon_AutoClassName[K, D]]) | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsDefaultChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.columnsDefaultChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoClassNameContext[K, D]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsDefaultChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.columnsDefaultChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoClassNameContext[K, D]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentRowChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentRowChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K] | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentRowChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentRowChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K] | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dndChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DragDropReorderAnonColumns[K, D]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dndChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DragDropReorderAnonColumns[K, D]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstSelectedRowChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.firstSelectedRowChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstSelectedRowChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.firstSelectedRowChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Nothing], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojAnimateEnd, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojAnimateEnd, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojAnimateStart, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojAnimateStart, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentRow(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCurrentRow,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojBeforeCurrentRow[K], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentRow(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCurrentRow,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojBeforeCurrentRow[K], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEdit(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeRowEdit,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojBeforeRowEdit, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEdit(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeRowEdit,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojBeforeRowEdit, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEditEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeRowEditEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojBeforeRowEditEnd, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEditEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeRowEditEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojBeforeRowEditEnd, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojSort,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojSort, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojSort,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojtableMod.ojTableNs.ojSort, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowRendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rowRendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function1[
          /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.RowRendererContext[K, D], 
          java.lang.String | stdLib.HTMLElement | scala.Unit
        ]) | scala.Null
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowRendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rowRendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function1[
          /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.RowRendererContext[K, D], 
          java.lang.String | stdLib.HTMLElement | scala.Unit
        ]) | scala.Null
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_FetchSizeMaxCount], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_FetchSizeMaxCount], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnIndexColumnKey], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnIndexColumnKey], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Array[
          atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionEnd[K]
        ]) | (js.Array[
          atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionEnd[K]
        ])
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Array[
          atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionEnd[K]
        ]) | (js.Array[
          atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionEnd[K]
        ])
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnMultiple], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnMultiple], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRequiredChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionRequiredChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRequiredChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionRequiredChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getContextByNode(node: stdLib.Element): atOracleOraclejetLib.Anon_ColumnIndexKey | atOracleOraclejetLib.Anon_IndexOjtablefooter = js.native
  def getDataForVisibleRow(rowIndex: scala.Double): (atOracleOraclejetLib.Anon_DataIndex[D, K]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_accessibility(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.accessibility): atOracleOraclejetLib.Anon_RowHeader = js.native
  @JSName("getProperty")
  def getProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_columns(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.columns): (js.Array[atOracleOraclejetLib.Anon_AutoClassName[K, D]]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_columnsDefault(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.columnsDefault): atOracleOraclejetLib.Anon_AutoClassNameContext[K, D] = js.native
  @JSName("getProperty")
  def getProperty_currentRow(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentRow): atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K] | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_data(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data): (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_display(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.display): atOracleOraclejetLib.atOracleOraclejetLibStrings.list | atOracleOraclejetLib.atOracleOraclejetLibStrings.grid = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dnd): atOracleOraclejetLib.Anon_DragDropReorderAnonColumns[K, D] = js.native
  @JSName("getProperty")
  def getProperty_editMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.editMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEdit = js.native
  @JSName("getProperty")
  def getProperty_firstSelectedRow(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.firstSelectedRow): scala.Nothing = js.native
  @JSName("getProperty")
  def getProperty_horizontalGridVisible(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontalGridVisible): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled = js.native
  @JSName("getProperty")
  def getProperty_rowRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rowRenderer): (js.Function1[
    /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.RowRendererContext[K, D], 
    java.lang.String | stdLib.HTMLElement | scala.Unit
  ]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicy): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyOptions): atOracleOraclejetLib.Anon_FetchSizeMaxCount = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPosition): atOracleOraclejetLib.Anon_ColumnIndexColumnKey = js.native
  @JSName("getProperty")
  def getProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection): (js.Array[
    atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionEnd[K]
  ]) | (js.Array[
    atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionStart[K] with atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionEnd[K]
  ]) = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode): atOracleOraclejetLib.Anon_ColumnMultiple = js.native
  @JSName("getProperty")
  def getProperty_selectionRequired(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionRequired): scala.Boolean = js.native
  @JSName("getProperty")
  def getProperty_verticalGridVisible(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.verticalGridVisible): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled = js.native
  def refreshRow(rowIdx: scala.Double): js.Promise[scala.Boolean] = js.native
  def setProperties(properties: ojTableSettablePropertiesLenient[K, D]): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.display,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.grid
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.display,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.list
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.editMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.editMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEdit
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontalGridVisible,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontalGridVisible,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontalGridVisible,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicy,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicy,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.verticalGridVisible,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.verticalGridVisible,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.verticalGridVisible,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_accessibility(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.accessibility,
    value: atOracleOraclejetLib.Anon_RowHeader
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.columns): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.columns,
    value: js.Array[atOracleOraclejetLib.Anon_AutoClassName[K, D]]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_columnsDefault(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.columnsDefault,
    value: atOracleOraclejetLib.Anon_AutoClassNameContext[K, D]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_currentRow(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentRow): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_currentRow(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentRow,
    value: atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_data(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data,
    value: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dnd,
    value: atOracleOraclejetLib.Anon_DragDropReorderAnonColumns[K, D]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_firstSelectedRow(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.firstSelectedRow, value: js.Object): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rowRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rowRenderer): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rowRenderer(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rowRenderer,
    value: js.Function1[
      /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.RowRendererContext[K, D], 
      java.lang.String | stdLib.HTMLElement | scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyOptions,
    value: atOracleOraclejetLib.Anon_FetchSizeMaxCount
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPosition,
    value: atOracleOraclejetLib.Anon_ColumnIndexColumnKey
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection,
    value: js.Array[
      (atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionStart[K] | atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionStart[K]) with (atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnSelectionEnd[K] | atOracleOraclejetLib.ojtableMod.ojTableNs.RowSelectionEnd[K])
    ]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionMode(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode,
    value: atOracleOraclejetLib.Anon_ColumnMultiple
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRequired(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionRequired, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_LabelAccSelectionAffordanceBottom
  ): scala.Unit = js.native
}

