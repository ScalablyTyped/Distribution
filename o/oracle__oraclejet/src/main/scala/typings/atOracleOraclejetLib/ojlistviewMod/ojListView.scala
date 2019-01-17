package typings
package atOracleOraclejetLib.ojlistviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojListView[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojListViewSettableProperties[K, D]] {
  var as: java.lang.String = js.native
  var currentItem: K = js.native
  var data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = js.native
  var dnd: atOracleOraclejetLib.Anon_DragDropReorder = js.native
  var drillMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K] = js.native
  val firstSelectedItem: atOracleOraclejetLib.Anon_DataKey[K, D] = js.native
  var groupHeaderPosition: atOracleOraclejetLib.atOracleOraclejetLibStrings.static | atOracleOraclejetLib.atOracleOraclejetLibStrings.sticky = js.native
  var item: atOracleOraclejetLib.Anon_Focusable[K, D] = js.native
  var onAsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onCurrentItemChanged: (js.Function1[/* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K], _]) | scala.Null = js.native
  var onDataChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]], 
    _
  ]) | scala.Null = js.native
  var onDndChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DragDropReorder], 
    _
  ]) | scala.Null = js.native
  var onDrillModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onExpandedChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojkeysetMod.KeySet[K]], 
    _
  ]) | scala.Null = js.native
  var onFirstSelectedItemChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DataKey[K, D]], 
    _
  ]) | scala.Null = js.native
  var onGroupHeaderPositionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.static | atOracleOraclejetLib.atOracleOraclejetLibStrings.sticky
    ], 
    _
  ]) | scala.Null = js.native
  var onItemChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Focusable[K, D]], 
    _
  ]) | scala.Null = js.native
  var onOjAnimateEnd: (js.Function1[/* event */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojAnimateEnd, _]) | scala.Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojAnimateStart, _]) | scala.Null = js.native
  var onOjBeforeCollapse: (js.Function1[/* event */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeCollapse[K], _]) | scala.Null = js.native
  var onOjBeforeCurrentItem: (js.Function1[
    /* event */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeCurrentItem[K], 
    _
  ]) | scala.Null = js.native
  var onOjBeforeExpand: (js.Function1[/* event */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeExpand[K], _]) | scala.Null = js.native
  var onOjCollapse: (js.Function1[/* event */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCollapse[K], _]) | scala.Null = js.native
  var onOjCopy: (js.Function1[/* event */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCopy, _]) | scala.Null = js.native
  var onOjCut: (js.Function1[/* event */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCut, _]) | scala.Null = js.native
  var onOjExpand: (js.Function1[/* event */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojExpand[K], _]) | scala.Null = js.native
  var onOjPaste: (js.Function1[/* event */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojPaste, _]) | scala.Null = js.native
  var onOjReorder: (js.Function1[/* event */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojReorder, _]) | scala.Null = js.native
  var onScrollPolicyChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll
    ], 
    _
  ]) | scala.Null = js.native
  var onScrollPolicyOptionsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_FetchSize], 
    _
  ]) | scala.Null = js.native
  var onScrollPositionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_IndexKey[K]], 
    _
  ]) | scala.Null = js.native
  var onSelectionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]], 
    _
  ]) | scala.Null = js.native
  var onSelectionModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
    ], 
    _
  ]) | scala.Null = js.native
  var onSelectionRequiredChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
    _
  ]) | scala.Null = js.native
  var scrollPolicy: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll = js.native
  var scrollPolicyOptions: atOracleOraclejetLib.Anon_FetchSize = js.native
  var scrollPosition: atOracleOraclejetLib.Anon_IndexKey[K] = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple = js.native
  var selectionRequired: scala.Boolean = js.native
  @JSName("translations")
  var translations_ojListView: atOracleOraclejetLib.Anon_AccessibleNavigateSkipItems = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupHeaderPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.static | atOracleOraclejetLib.atOracleOraclejetLibStrings.sticky
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupHeaderPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.static | atOracleOraclejetLib.atOracleOraclejetLibStrings.sticky
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
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
      ], 
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
  def addEventListener_currentItemChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentItemChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentItemChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentItemChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K], 
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
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DragDropReorder], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dndChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DragDropReorder], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.expandedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojkeysetMod.KeySet[K]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.expandedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojkeysetMod.KeySet[K]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstSelectedItemChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.firstSelectedItemChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DataKey[K, D]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstSelectedItemChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.firstSelectedItemChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DataKey[K, D]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.itemChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Focusable[K, D]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.itemChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Focusable[K, D]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojAnimateEnd, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojAnimateEnd, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojAnimateStart, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojAnimateStart, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeCollapse[K], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeCollapse[K], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCurrentItem,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeCurrentItem[K], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCurrentItem,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeCurrentItem[K], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeExpand[K], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojBeforeExpand[K], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCollapse[K], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCollapse[K], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCopy(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojCopy,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCopy, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCopy(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojCopy,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCopy, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCut(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojCut,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCut, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCut(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojCut,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojCut, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojExpand[K], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojExpand[K], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojPaste(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojPaste,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojPaste, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojPaste(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojPaste,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojPaste, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojReorder,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojReorder, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojReorder,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ojReorder, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_FetchSize], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_FetchSize], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_IndexKey[K]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_IndexKey[K]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K]], 
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
  def getContextByNode(node: stdLib.Element): atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ContextByNode[K] | scala.Null = js.native
  def getDataForVisibleItem(context: atOracleOraclejetLib.Anon_IndexKeyParent[K]): D = js.native
  @JSName("getProperty")
  def getProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentItem): K = js.native
  @JSName("getProperty")
  def getProperty_data(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data): atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dnd): atOracleOraclejetLib.Anon_DragDropReorder = js.native
  @JSName("getProperty")
  def getProperty_drillMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.expanded): atOracleOraclejetLib.ojkeysetMod.KeySet[K] = js.native
  @JSName("getProperty")
  def getProperty_firstSelectedItem(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.firstSelectedItem): atOracleOraclejetLib.Anon_DataKey[K, D] = js.native
  @JSName("getProperty")
  def getProperty_groupHeaderPosition(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupHeaderPosition): atOracleOraclejetLib.atOracleOraclejetLibStrings.static | atOracleOraclejetLib.atOracleOraclejetLibStrings.sticky = js.native
  @JSName("getProperty")
  def getProperty_item(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.item): atOracleOraclejetLib.Anon_Focusable[K, D] = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicy): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyOptions): atOracleOraclejetLib.Anon_FetchSize = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPosition): atOracleOraclejetLib.Anon_IndexKey[K] = js.native
  @JSName("getProperty")
  def getProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection): js.Array[K] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple = js.native
  @JSName("getProperty")
  def getProperty_selectionRequired(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionRequired): scala.Boolean = js.native
  def scrollToItem(item: atOracleOraclejetLib.Anon_KeyK[K]): scala.Unit = js.native
  def setProperties(properties: ojListViewSettablePropertiesLenient[K, D]): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupHeaderPosition,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.static
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupHeaderPosition,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.sticky
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
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.single
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentItem, value: K): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_data(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data,
    value: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dnd,
    value: atOracleOraclejetLib.Anon_DragDropReorder
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.expanded,
    value: atOracleOraclejetLib.ojkeysetMod.KeySet[K]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_firstSelectedItem(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.firstSelectedItem,
    value: atOracleOraclejetLib.Anon_DataKey[K, D]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_item(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.item,
    value: atOracleOraclejetLib.Anon_Focusable[K, D]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPolicyOptions,
    value: atOracleOraclejetLib.Anon_FetchSize
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPosition,
    value: atOracleOraclejetLib.Anon_IndexKey[K]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection, value: js.Array[K]): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRequired(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionRequired, value: scala.Boolean): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_AccessibleNavigateSkipItems
  ): scala.Unit = js.native
}

