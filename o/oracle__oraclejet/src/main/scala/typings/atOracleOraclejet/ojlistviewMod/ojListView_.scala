package typings.atOracleOraclejet.ojlistviewMod

import typings.atOracleOraclejet.Anon_AccessibleNavigateSkipItems
import typings.atOracleOraclejet.Anon_DataKey
import typings.atOracleOraclejet.Anon_DragDropReorder
import typings.atOracleOraclejet.Anon_FetchSize
import typings.atOracleOraclejet.Anon_Focusable
import typings.atOracleOraclejet.Anon_IndexKey
import typings.atOracleOraclejet.Anon_IndexKeyParent
import typings.atOracleOraclejet.Anon_KeyK
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.as
import typings.atOracleOraclejet.atOracleOraclejetStrings.asChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.collapsible
import typings.atOracleOraclejet.atOracleOraclejetStrings.currentItem
import typings.atOracleOraclejet.atOracleOraclejetStrings.currentItemChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.data
import typings.atOracleOraclejet.atOracleOraclejetStrings.dataChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.dnd
import typings.atOracleOraclejet.atOracleOraclejetStrings.dndChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.drillMode
import typings.atOracleOraclejet.atOracleOraclejetStrings.drillModeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.expanded
import typings.atOracleOraclejet.atOracleOraclejetStrings.expandedChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.firstSelectedItemChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.groupHeaderPosition
import typings.atOracleOraclejet.atOracleOraclejetStrings.groupHeaderPositionChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.item
import typings.atOracleOraclejet.atOracleOraclejetStrings.itemChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.loadMoreOnScroll
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
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
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.static
import typings.atOracleOraclejet.atOracleOraclejetStrings.sticky
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojkeysetMod.KeySet
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ContextByNode
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojAnimateEnd
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojAnimateStart
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojBeforeCollapse
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojBeforeCurrentItem
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojBeforeExpand
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojCollapse
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojCopy
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojCut
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojExpand
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojPaste
import typings.atOracleOraclejet.ojlistviewMod.ojListView.ojReorder
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojListView")
@js.native
trait ojListView_[K, D] extends baseComponent[ojListViewSettableProperties[K, D]] {
  var as: String = js.native
  var currentItem: K = js.native
  var data: DataProvider[K, D] = js.native
  var dnd: Anon_DragDropReorder = js.native
  var drillMode: collapsible | none = js.native
  var expanded: KeySet[K] = js.native
  val firstSelectedItem: Anon_DataKey[K, D] = js.native
  var groupHeaderPosition: static | sticky = js.native
  var item: Anon_Focusable[K, D] = js.native
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onCurrentItemChanged: (js.Function1[/* event */ JetElementCustomEvent[K], _]) | Null = js.native
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[DataProvider[K, D]], _]) | Null = js.native
  var onDndChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_DragDropReorder], _]) | Null = js.native
  var onDrillModeChanged: (js.Function1[/* event */ JetElementCustomEvent[collapsible | none], _]) | Null = js.native
  var onExpandedChanged: (js.Function1[/* event */ JetElementCustomEvent[KeySet[K]], _]) | Null = js.native
  var onFirstSelectedItemChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_DataKey[K, D]], _]) | Null = js.native
  var onGroupHeaderPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[static | sticky], _]) | Null = js.native
  var onItemChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_Focusable[K, D]], _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onOjBeforeCollapse: (js.Function1[/* event */ ojBeforeCollapse[K], _]) | Null = js.native
  var onOjBeforeCurrentItem: (js.Function1[/* event */ ojBeforeCurrentItem[K], _]) | Null = js.native
  var onOjBeforeExpand: (js.Function1[/* event */ ojBeforeExpand[K], _]) | Null = js.native
  var onOjCollapse: (js.Function1[/* event */ ojCollapse[K], _]) | Null = js.native
  var onOjCopy: (js.Function1[/* event */ ojCopy, _]) | Null = js.native
  var onOjCut: (js.Function1[/* event */ ojCut, _]) | Null = js.native
  var onOjExpand: (js.Function1[/* event */ ojExpand[K], _]) | Null = js.native
  var onOjPaste: (js.Function1[/* event */ ojPaste, _]) | Null = js.native
  var onOjReorder: (js.Function1[/* event */ ojReorder, _]) | Null = js.native
  var onScrollPolicyChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | loadMoreOnScroll], _]) | Null = js.native
  var onScrollPolicyOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_FetchSize], _]) | Null = js.native
  var onScrollPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_IndexKey[K]], _]) | Null = js.native
  var onSelectionChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[K]], _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[/* event */ JetElementCustomEvent[none | single | multiple], _]) | Null = js.native
  var onSelectionRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var scrollPolicy: auto | loadMoreOnScroll = js.native
  var scrollPolicyOptions: Anon_FetchSize = js.native
  var scrollPosition: Anon_IndexKey[K] = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: none | single | multiple = js.native
  var selectionRequired: Boolean = js.native
  @JSName("translations")
  var translations_ojListView_ : Anon_AccessibleNavigateSkipItems = js.native
  def addEventListener(
    `type`: drillModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[collapsible | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: drillModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[collapsible | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: groupHeaderPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[static | sticky], _]
  ): Unit = js.native
  def addEventListener(
    `type`: groupHeaderPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[static | sticky], _],
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
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | single | multiple], _]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | single | multiple], _],
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_DragDropReorder], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_DragDropReorder], _],
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
  def addEventListener_firstSelectedItemChanged(
    `type`: firstSelectedItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_DataKey[K, D]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstSelectedItemChanged(
    `type`: firstSelectedItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_DataKey[K, D]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Focusable[K, D]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Focusable[K, D]], _],
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
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCollapse[K], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCollapse[K], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCurrentItem,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCurrentItem[K], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCurrentItem,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCurrentItem[K], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeExpand[K], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeExpand[K], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojCollapse[K], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojCollapse[K], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCopy(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojCopy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojCopy, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCopy(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojCopy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojCopy, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCut(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojCut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojCut, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCut(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojCut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojCut, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojExpand[K], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojExpand[K], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojPaste(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojPaste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojPaste, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojPaste(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojPaste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojPaste, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojReorder,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojReorder, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojReorder,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojReorder, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_FetchSize], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_FetchSize], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_IndexKey[K]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_IndexKey[K]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[K]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[K]], _],
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
  def getContextByNode(node: Element): ContextByNode[K] | Null = js.native
  def getDataForVisibleItem(context: Anon_IndexKeyParent[K]): D = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: currentItem): K = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): DataProvider[K, D] = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): Anon_DragDropReorder = js.native
  @JSName("getProperty")
  def getProperty_drillMode(property: drillMode): collapsible | none = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: expanded): KeySet[K] = js.native
  @JSName("getProperty")
  def getProperty_firstSelectedItem(property: typings.atOracleOraclejet.atOracleOraclejetStrings.firstSelectedItem): Anon_DataKey[K, D] = js.native
  @JSName("getProperty")
  def getProperty_groupHeaderPosition(property: groupHeaderPosition): static | sticky = js.native
  @JSName("getProperty")
  def getProperty_item(property: item): Anon_Focusable[K, D] = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: scrollPolicy): auto | loadMoreOnScroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): Anon_FetchSize = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): Anon_IndexKey[K] = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): none | single | multiple = js.native
  @JSName("getProperty")
  def getProperty_selectionRequired(property: selectionRequired): Boolean = js.native
  def scrollToItem(item: Anon_KeyK[K]): Unit = js.native
  def setProperties(properties: ojListViewSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: drillMode, value: collapsible): Unit = js.native
  def setProperty(property: drillMode, value: none): Unit = js.native
  def setProperty(property: groupHeaderPosition, value: static): Unit = js.native
  def setProperty(property: groupHeaderPosition, value: sticky): Unit = js.native
  def setProperty(property: scrollPolicy, value: auto): Unit = js.native
  def setProperty(property: scrollPolicy, value: loadMoreOnScroll): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(property: currentItem, value: K): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: Anon_DragDropReorder): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: KeySet[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_firstSelectedItem(
    property: typings.atOracleOraclejet.atOracleOraclejetStrings.firstSelectedItem,
    value: Anon_DataKey[K, D]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_item(property: item, value: Anon_Focusable[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: Anon_FetchSize): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: Anon_IndexKey[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRequired(property: selectionRequired, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_AccessibleNavigateSkipItems): Unit = js.native
}

