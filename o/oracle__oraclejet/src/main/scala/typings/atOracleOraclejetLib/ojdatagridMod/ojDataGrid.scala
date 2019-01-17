package typings
package atOracleOraclejetLib.ojdatagridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDataGrid[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojDataGridSettableProperties[K, D]] {
  var bandingInterval: atOracleOraclejetLib.Anon_Column = js.native
  var cell: atOracleOraclejetLib.Anon_ClassName[K, D] = js.native
  var currentCell: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CurrentCell[K] | scala.Null = js.native
  var data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = js.native
  var dnd: atOracleOraclejetLib.Anon_Reorder = js.native
  var editMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellNavigation | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellEdit = js.native
  var gridlines: atOracleOraclejetLib.Anon_Hidden = js.native
  var header: atOracleOraclejetLib.Anon_ColumnColumnEnd[K, D] = js.native
  var onBandingIntervalChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Column], 
    _
  ]) | scala.Null = js.native
  var onCellChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ClassName[K, D]], 
    _
  ]) | scala.Null = js.native
  var onCurrentCellChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CurrentCell[K] | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onDataChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]], 
    _
  ]) | scala.Null = js.native
  var onDndChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Reorder], 
    _
  ]) | scala.Null = js.native
  var onEditModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellNavigation | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellEdit
    ], 
    _
  ]) | scala.Null = js.native
  var onGridlinesChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Hidden], 
    _
  ]) | scala.Null = js.native
  var onHeaderChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnColumnEnd[K, D]], 
    _
  ]) | scala.Null = js.native
  var onOjBeforeCurrentCell: (js.Function1[
    /* event */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojBeforeCurrentCell[K], 
    _
  ]) | scala.Null = js.native
  var onOjBeforeEdit: (js.Function1[/* event */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojBeforeEdit[K, D], _]) | scala.Null = js.native
  var onOjBeforeEditEnd: (js.Function1[
    /* event */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojBeforeEditEnd[K, D], 
    _
  ]) | scala.Null = js.native
  var onOjResize: (js.Function1[/* event */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojResize, _]) | scala.Null = js.native
  var onOjScroll: (js.Function1[/* event */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojScroll, _]) | scala.Null = js.native
  var onOjSort: (js.Function1[/* event */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojSort, _]) | scala.Null = js.native
  var onScrollPolicyChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll | atOracleOraclejetLib.atOracleOraclejetLibStrings.scroll
    ], 
    _
  ]) | scala.Null = js.native
  var onScrollPolicyOptionsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_MaxColumnCount], 
    _
  ]) | scala.Null = js.native
  var onScrollPositionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnIndex[K]], 
    _
  ]) | scala.Null = js.native
  var onSelectionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.Selection[K]]], 
    _
  ]) | scala.Null = js.native
  var onSelectionModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Cell], 
    _
  ]) | scala.Null = js.native
  var scrollPolicy: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll | atOracleOraclejetLib.atOracleOraclejetLibStrings.scroll = js.native
  var scrollPolicyOptions: atOracleOraclejetLib.Anon_MaxColumnCount = js.native
  var scrollPosition: atOracleOraclejetLib.Anon_ColumnIndex[K] = js.native
  var selection: js.Array[atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.Selection[K]] = js.native
  var selectionMode: atOracleOraclejetLib.Anon_Cell = js.native
  @JSName("translations")
  var translations_ojDataGrid: atOracleOraclejetLib.Anon_AccessibleActionableMode = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.editModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellNavigation | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellEdit
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.editModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellNavigation | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellEdit
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
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll | atOracleOraclejetLib.atOracleOraclejetLibStrings.scroll
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll | atOracleOraclejetLib.atOracleOraclejetLibStrings.scroll
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bandingIntervalChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.bandingIntervalChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Column], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bandingIntervalChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.bandingIntervalChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Column], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.cellChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ClassName[K, D]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.cellChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ClassName[K, D]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentCellChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentCellChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CurrentCell[K] | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentCellChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentCellChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CurrentCell[K] | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dndChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Reorder], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dndChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Reorder], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.gridlinesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Hidden], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.gridlinesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Hidden], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_headerChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.headerChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnColumnEnd[K, D]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_headerChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.headerChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnColumnEnd[K, D]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentCell(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCurrentCell,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojBeforeCurrentCell[K], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentCell(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCurrentCell,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojBeforeCurrentCell[K], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEdit(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeEdit,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojBeforeEdit[K, D], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEdit(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeEdit,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojBeforeEdit[K, D], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEditEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeEditEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojBeforeEditEnd[K, D], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEditEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeEditEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojBeforeEditEnd[K, D], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojResize,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojResize, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojResize,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojResize, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojScroll(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojScroll,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojScroll, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojScroll(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojScroll,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojScroll, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojSort,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojSort, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojSort,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.ojSort, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_MaxColumnCount], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_MaxColumnCount], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnIndex[K]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ColumnIndex[K]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.Selection[K]]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.Selection[K]]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Cell], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Cell], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getContextByNode(node: stdLib.Element): (atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CellContext[K, D]) with (atOracleOraclejetLib.Anon_Ojdatagridcell | (atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D])) with (atOracleOraclejetLib.Anon_Ojdatagridheader | (atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.LabelContext[K, D])) with atOracleOraclejetLib.Anon_Ojdatagridheaderlabel = js.native
  @JSName("getProperty")
  def getProperty_bandingInterval(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.bandingInterval): atOracleOraclejetLib.Anon_Column = js.native
  @JSName("getProperty")
  def getProperty_cell(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.cell): atOracleOraclejetLib.Anon_ClassName[K, D] = js.native
  @JSName("getProperty")
  def getProperty_currentCell(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentCell): atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CurrentCell[K] | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_data(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data): atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dnd): atOracleOraclejetLib.Anon_Reorder = js.native
  @JSName("getProperty")
  def getProperty_editMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.editMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellNavigation | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellEdit = js.native
  @JSName("getProperty")
  def getProperty_gridlines(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.gridlines): atOracleOraclejetLib.Anon_Hidden = js.native
  @JSName("getProperty")
  def getProperty_header(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.header): atOracleOraclejetLib.Anon_ColumnColumnEnd[K, D] = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicy): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll | atOracleOraclejetLib.atOracleOraclejetLibStrings.scroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyOptions): atOracleOraclejetLib.Anon_MaxColumnCount = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPosition): atOracleOraclejetLib.Anon_ColumnIndex[K] = js.native
  @JSName("getProperty")
  def getProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection): js.Array[atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.Selection[K]] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode): atOracleOraclejetLib.Anon_Cell = js.native
  def setProperties(properties: ojDataGridSettablePropertiesLenient[K, D]): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.editMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.cellEdit
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.editMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.cellNavigation
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.editMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
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
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicy,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.scroll
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_bandingInterval(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.bandingInterval,
    value: atOracleOraclejetLib.Anon_Column
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_cell(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.cell,
    value: atOracleOraclejetLib.Anon_ClassName[K, D]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_currentCell(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentCell): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_currentCell(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentCell,
    value: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CurrentCell[K]
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
    value: atOracleOraclejetLib.Anon_Reorder
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_gridlines(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.gridlines,
    value: atOracleOraclejetLib.Anon_Hidden
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_header(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.header,
    value: atOracleOraclejetLib.Anon_ColumnColumnEnd[K, D]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyOptions,
    value: atOracleOraclejetLib.Anon_MaxColumnCount
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPosition,
    value: atOracleOraclejetLib.Anon_ColumnIndex[K]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection,
    value: js.Array[atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.Selection[K]]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionMode(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode,
    value: atOracleOraclejetLib.Anon_Cell
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_AccessibleActionableMode
  ): scala.Unit = js.native
}

