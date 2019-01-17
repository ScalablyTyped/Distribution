package typings
package atOracleOraclejetLib.ojnavigationlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojNavigationList[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponent[ojNavigationListSettableProperties[K, D]] {
  var as: java.lang.String = js.native
  var currentItem: K = js.native
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null = js.native
  var display: atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons = js.native
  var drillMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.sliding = js.native
  var edge: atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.start = js.native
  var expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K] = js.native
  var hierarchyMenuThreshold: scala.Double = js.native
  var item: atOracleOraclejetLib.Anon_ContextRendererSelectable[K, D] = js.native
  var onAsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onCurrentItemChanged: (js.Function1[/* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K], _]) | scala.Null = js.native
  var onDataChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onDisplayChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
    ], 
    _
  ]) | scala.Null = js.native
  var onDrillModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.sliding
    ], 
    _
  ]) | scala.Null = js.native
  var onEdgeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
    ], 
    _
  ]) | scala.Null = js.native
  var onExpandedChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojkeysetMod.KeySet[K]], 
    _
  ]) | scala.Null = js.native
  var onHierarchyMenuThresholdChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  var onItemChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererSelectable[K, D]], 
    _
  ]) | scala.Null = js.native
  var onOjAnimateEnd: (js.Function1[
    /* event */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojAnimateEnd, 
    _
  ]) | scala.Null = js.native
  var onOjAnimateStart: (js.Function1[
    /* event */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  var onOjBeforeCollapse: (js.Function1[
    /* event */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeCollapse, 
    _
  ]) | scala.Null = js.native
  var onOjBeforeCurrentItem: (js.Function1[
    /* event */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeCurrentItem, 
    _
  ]) | scala.Null = js.native
  var onOjBeforeExpand: (js.Function1[
    /* event */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeExpand, 
    _
  ]) | scala.Null = js.native
  var onOjBeforeSelect: (js.Function1[
    /* event */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeSelect, 
    _
  ]) | scala.Null = js.native
  var onOjCollapse: (js.Function1[
    /* event */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojCollapse, 
    _
  ]) | scala.Null = js.native
  var onOjExpand: (js.Function1[
    /* event */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojExpand, 
    _
  ]) | scala.Null = js.native
  var onOverflowChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.popup | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
    ], 
    _
  ]) | scala.Null = js.native
  var onRootLabelChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onSelectionChanged: (js.Function1[/* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K], _]) | scala.Null = js.native
  var overflow: atOracleOraclejetLib.atOracleOraclejetLibStrings.popup | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden = js.native
  var rootLabel: java.lang.String | scala.Null = js.native
  var selection: K = js.native
  @JSName("translations")
  var translations_ojNavigationList: atOracleOraclejetLib.Anon_DefaultRootLabel = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.displayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.displayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.sliding
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.sliding
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.edgeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.edgeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.overflowChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.popup | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.overflowChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.popup | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
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
  def addEventListener_hierarchyMenuThresholdChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hierarchyMenuThresholdChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hierarchyMenuThresholdChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hierarchyMenuThresholdChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.itemChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererSelectable[K, D]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.itemChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererSelectable[K, D]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojAnimateEnd, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojAnimateEnd, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojAnimateStart, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojAnimateStart, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeCollapse, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeCollapse, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCurrentItem,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeCurrentItem, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCurrentItem,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeCurrentItem, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeExpand, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeExpand, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeSelect,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeSelect, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeSelect,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojBeforeSelect, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojCollapse, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojCollapse, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojExpand, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ojExpand, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rootLabelChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rootLabelChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rootLabelChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rootLabelChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getContextByNode(node: stdLib.Element): atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.NodeContext[K] | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentItem): K = js.native
  @JSName("getProperty")
  def getProperty_data(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data): (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_display(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.display): atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons = js.native
  @JSName("getProperty")
  def getProperty_drillMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.sliding = js.native
  @JSName("getProperty")
  def getProperty_edge(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.edge): atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.start = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.expanded): atOracleOraclejetLib.ojkeysetMod.KeySet[K] = js.native
  @JSName("getProperty")
  def getProperty_hierarchyMenuThreshold(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hierarchyMenuThreshold): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_item(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.item): atOracleOraclejetLib.Anon_ContextRendererSelectable[K, D] = js.native
  @JSName("getProperty")
  def getProperty_overflow(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.overflow): atOracleOraclejetLib.atOracleOraclejetLibStrings.popup | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden = js.native
  @JSName("getProperty")
  def getProperty_rootLabel(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rootLabel): java.lang.String | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection): K = js.native
  def setProperties(properties: ojNavigationListSettablePropertiesLenient[K, D]): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.display,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.display,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.sliding
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.edge,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.start
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.edge,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.top
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.overflow,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.overflow,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.popup
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentItem, value: K): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_data(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.data,
    value: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.expanded,
    value: atOracleOraclejetLib.ojkeysetMod.KeySet[K]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_hierarchyMenuThreshold(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hierarchyMenuThreshold,
    value: scala.Double
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_item(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.item,
    value: atOracleOraclejetLib.Anon_ContextRendererSelectable[K, D]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rootLabel(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rootLabel): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rootLabel(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rootLabel, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection, value: K): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_DefaultRootLabel
  ): scala.Unit = js.native
}

