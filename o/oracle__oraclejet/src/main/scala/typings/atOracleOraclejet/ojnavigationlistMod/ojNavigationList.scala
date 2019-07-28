package typings.atOracleOraclejet.ojnavigationlistMod

import typings.atOracleOraclejet.Anon_ContextRendererSelectable
import typings.atOracleOraclejet.Anon_DefaultRootLabel
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.as
import typings.atOracleOraclejet.atOracleOraclejetStrings.asChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.collapsible
import typings.atOracleOraclejet.atOracleOraclejetStrings.currentItem
import typings.atOracleOraclejet.atOracleOraclejetStrings.currentItemChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.data
import typings.atOracleOraclejet.atOracleOraclejetStrings.dataChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.display
import typings.atOracleOraclejet.atOracleOraclejetStrings.displayChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.drillMode
import typings.atOracleOraclejet.atOracleOraclejetStrings.drillModeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.edge
import typings.atOracleOraclejet.atOracleOraclejetStrings.edgeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.expanded
import typings.atOracleOraclejet.atOracleOraclejetStrings.expandedChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.hidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.hierarchyMenuThreshold
import typings.atOracleOraclejet.atOracleOraclejetStrings.hierarchyMenuThresholdChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.icons
import typings.atOracleOraclejet.atOracleOraclejetStrings.item
import typings.atOracleOraclejet.atOracleOraclejetStrings.itemChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.overflow
import typings.atOracleOraclejet.atOracleOraclejetStrings.overflowChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.popup
import typings.atOracleOraclejet.atOracleOraclejetStrings.rootLabel
import typings.atOracleOraclejet.atOracleOraclejetStrings.rootLabelChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.selection
import typings.atOracleOraclejet.atOracleOraclejetStrings.selectionChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.sliding
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojkeysetMod.KeySet
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.NodeContext
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojAnimateEnd
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojAnimateStart
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojBeforeCollapse
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojBeforeCurrentItem
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojBeforeExpand
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojBeforeSelect
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojCollapse
import typings.atOracleOraclejet.ojnavigationlistMod.ojNavigationListNs.ojExpand
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojNavigationList[K, D] extends baseComponent[ojNavigationListSettableProperties[K, D]] {
  var as: String = js.native
  var currentItem: K = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var display: all | icons = js.native
  var drillMode: none | collapsible | sliding = js.native
  var edge: top | start = js.native
  var expanded: KeySet[K] = js.native
  var hierarchyMenuThreshold: Double = js.native
  var item: Anon_ContextRendererSelectable[K, D] = js.native
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onCurrentItemChanged: (js.Function1[/* event */ JetElementCustomEvent[K], _]) | Null = js.native
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], _]) | Null = js.native
  var onDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[all | icons], _]) | Null = js.native
  var onDrillModeChanged: (js.Function1[/* event */ JetElementCustomEvent[none | collapsible | sliding], _]) | Null = js.native
  var onEdgeChanged: (js.Function1[/* event */ JetElementCustomEvent[top | start], _]) | Null = js.native
  var onExpandedChanged: (js.Function1[/* event */ JetElementCustomEvent[KeySet[K]], _]) | Null = js.native
  var onHierarchyMenuThresholdChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onItemChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_ContextRendererSelectable[K, D]], _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onOjBeforeCollapse: (js.Function1[/* event */ ojBeforeCollapse, _]) | Null = js.native
  var onOjBeforeCurrentItem: (js.Function1[/* event */ ojBeforeCurrentItem, _]) | Null = js.native
  var onOjBeforeExpand: (js.Function1[/* event */ ojBeforeExpand, _]) | Null = js.native
  var onOjBeforeSelect: (js.Function1[/* event */ ojBeforeSelect, _]) | Null = js.native
  var onOjCollapse: (js.Function1[/* event */ ojCollapse, _]) | Null = js.native
  var onOjExpand: (js.Function1[/* event */ ojExpand, _]) | Null = js.native
  var onOverflowChanged: (js.Function1[/* event */ JetElementCustomEvent[popup | hidden], _]) | Null = js.native
  var onRootLabelChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  var onSelectionChanged: (js.Function1[/* event */ JetElementCustomEvent[K], _]) | Null = js.native
  var overflow: popup | hidden = js.native
  var rootLabel: String | Null = js.native
  var selection: K = js.native
  @JSName("translations")
  var translations_ojNavigationList: Anon_DefaultRootLabel = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | icons], _]
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | icons], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: drillModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[none | collapsible | sliding], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: drillModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[none | collapsible | sliding], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: edgeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[top | start], _]
  ): Unit = js.native
  def addEventListener(
    `type`: edgeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[top | start], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: overflowChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[popup | hidden], _]
  ): Unit = js.native
  def addEventListener(
    `type`: overflowChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[popup | hidden], _],
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
  def addEventListener_currentItemChanged(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[K], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentItemChanged(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[K], _],
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
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[KeySet[K]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[KeySet[K]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hierarchyMenuThresholdChanged(
    `type`: hierarchyMenuThresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hierarchyMenuThresholdChanged(
    `type`: hierarchyMenuThresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_ContextRendererSelectable[K, D]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_ContextRendererSelectable[K, D]], 
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
  def addEventListener_ojBeforeCollapse(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCollapse, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCollapse, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCurrentItem,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCurrentItem, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCurrentItem,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCurrentItem, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeExpand, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeExpand, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeSelect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeSelect, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeSelect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeSelect, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojCollapse, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojCollapse, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojExpand, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojExpand, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rootLabelChanged(
    `type`: rootLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rootLabelChanged(
    `type`: rootLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[K], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[K], _],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): NodeContext[K] | Null = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: currentItem): K = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): all | icons = js.native
  @JSName("getProperty")
  def getProperty_drillMode(property: drillMode): none | collapsible | sliding = js.native
  @JSName("getProperty")
  def getProperty_edge(property: edge): top | start = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: expanded): KeySet[K] = js.native
  @JSName("getProperty")
  def getProperty_hierarchyMenuThreshold(property: hierarchyMenuThreshold): Double = js.native
  @JSName("getProperty")
  def getProperty_item(property: item): Anon_ContextRendererSelectable[K, D] = js.native
  @JSName("getProperty")
  def getProperty_overflow(property: overflow): popup | hidden = js.native
  @JSName("getProperty")
  def getProperty_rootLabel(property: rootLabel): String | Null = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): K = js.native
  def setProperties(properties: ojNavigationListSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: display, value: all): Unit = js.native
  def setProperty(property: display, value: icons): Unit = js.native
  def setProperty(property: drillMode, value: collapsible): Unit = js.native
  def setProperty(property: drillMode, value: none): Unit = js.native
  def setProperty(property: drillMode, value: sliding): Unit = js.native
  def setProperty(property: edge, value: start): Unit = js.native
  def setProperty(property: edge, value: top): Unit = js.native
  def setProperty(property: overflow, value: hidden): Unit = js.native
  def setProperty(property: overflow, value: popup): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(property: currentItem, value: K): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: KeySet[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hierarchyMenuThreshold(property: hierarchyMenuThreshold, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_item(property: item, value: Anon_ContextRendererSelectable[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rootLabel(property: rootLabel): Unit = js.native
  @JSName("setProperty")
  def setProperty_rootLabel(property: rootLabel, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: K): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_DefaultRootLabel): Unit = js.native
}

