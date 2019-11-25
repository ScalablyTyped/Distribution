package typings.atOracleOraclejet.ojnavigationlistMod

import typings.atOracleOraclejet.Anon_AccessibleReorderAfterItem
import typings.atOracleOraclejet.Anon_ContextRendererSelectableBoolean
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.as
import typings.atOracleOraclejet.atOracleOraclejetStrings.asChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typings.atOracleOraclejet.atOracleOraclejetStrings.currentItem
import typings.atOracleOraclejet.atOracleOraclejetStrings.currentItemChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.data
import typings.atOracleOraclejet.atOracleOraclejetStrings.dataChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.display
import typings.atOracleOraclejet.atOracleOraclejetStrings.displayChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.edge
import typings.atOracleOraclejet.atOracleOraclejetStrings.edgeChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.enabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.hidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.icons
import typings.atOracleOraclejet.atOracleOraclejetStrings.item
import typings.atOracleOraclejet.atOracleOraclejetStrings.itemChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.overflow
import typings.atOracleOraclejet.atOracleOraclejetStrings.overflowChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.popup
import typings.atOracleOraclejet.atOracleOraclejetStrings.progressive
import typings.atOracleOraclejet.atOracleOraclejetStrings.reorderable
import typings.atOracleOraclejet.atOracleOraclejetStrings.reorderableChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.selection
import typings.atOracleOraclejet.atOracleOraclejetStrings.selectionChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.atOracleOraclejetStrings.truncation
import typings.atOracleOraclejet.atOracleOraclejetStrings.truncationChanged
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBar.NodeContext
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBar.ojAnimateEnd
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBar.ojAnimateStart
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeCurrentItem
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeDeselect
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeRemove
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeSelect
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBar.ojDeselect
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBar.ojRemove
import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBar.ojReorder
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojTabBar")
@js.native
trait ojTabBar_[K, D] extends baseComponent[ojTabBarSettableProperties[K, D]] {
  var as: String = js.native
  var currentItem: js.Any = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var display: all | icons = js.native
  var edge: top | bottom | start | end = js.native
  var item: Anon_ContextRendererSelectableBoolean[K, D] = js.native
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onCurrentItemChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any
    ], 
    _
  ]) | Null = js.native
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], _]) | Null = js.native
  var onDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[all | icons], _]) | Null = js.native
  var onEdgeChanged: (js.Function1[/* event */ JetElementCustomEvent[top | bottom | start | end], _]) | Null = js.native
  var onItemChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_ContextRendererSelectableBoolean[K, D]], _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onOjBeforeCurrentItem: (js.Function1[/* event */ ojBeforeCurrentItem, _]) | Null = js.native
  var onOjBeforeDeselect: (js.Function1[/* event */ ojBeforeDeselect, _]) | Null = js.native
  var onOjBeforeRemove: (js.Function1[/* event */ ojBeforeRemove, _]) | Null = js.native
  var onOjBeforeSelect: (js.Function1[/* event */ ojBeforeSelect, _]) | Null = js.native
  var onOjDeselect: (js.Function1[/* event */ ojDeselect, _]) | Null = js.native
  var onOjRemove: (js.Function1[/* event */ ojRemove, _]) | Null = js.native
  var onOjReorder: (js.Function1[/* event */ ojReorder, _]) | Null = js.native
  var onOverflowChanged: (js.Function1[/* event */ JetElementCustomEvent[popup | hidden], _]) | Null = js.native
  var onReorderableChanged: (js.Function1[/* event */ JetElementCustomEvent[enabled | disabled], _]) | Null = js.native
  var onSelectionChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any
    ], 
    _
  ]) | Null = js.native
  var onTruncationChanged: (js.Function1[/* event */ JetElementCustomEvent[none | progressive], _]) | Null = js.native
  var overflow: popup | hidden = js.native
  var reorderable: enabled | disabled = js.native
  var selection: js.Any = js.native
  @JSName("translations")
  var translations_ojTabBar_ : Anon_AccessibleReorderAfterItem = js.native
  var truncation: none | progressive = js.native
  def addEventListener(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
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
    `type`: edgeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[top | bottom | start | end], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: edgeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[top | bottom | start | end], 
      _
    ],
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
  def addEventListener(
    `type`: reorderableChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[enabled | disabled], _]
  ): Unit = js.native
  def addEventListener(
    `type`: reorderableChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[enabled | disabled], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectionChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: truncationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | progressive], _]
  ): Unit = js.native
  def addEventListener(
    `type`: truncationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | progressive], _],
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
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_ContextRendererSelectableBoolean[K, D]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Anon_ContextRendererSelectableBoolean[K, D]], 
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
  def addEventListener_ojBeforeDeselect(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeDeselect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeDeselect, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeDeselect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeDeselect, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRemove(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeRemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeRemove, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRemove(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeRemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeRemove, _],
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
  def addEventListener_ojDeselect(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojDeselect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojDeselect, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojDeselect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojDeselect, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRemove(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojRemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojRemove, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRemove(
    `type`: typings.atOracleOraclejet.atOracleOraclejetStrings.ojRemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojRemove, _],
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
  def getContextByNode(node: Element): NodeContext[K] | Null = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: currentItem): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): all | icons = js.native
  @JSName("getProperty")
  def getProperty_edge(property: edge): top | bottom | start | end = js.native
  @JSName("getProperty")
  def getProperty_item(property: item): Anon_ContextRendererSelectableBoolean[K, D] = js.native
  @JSName("getProperty")
  def getProperty_overflow(property: overflow): popup | hidden = js.native
  @JSName("getProperty")
  def getProperty_reorderable(property: reorderable): enabled | disabled = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_truncation(property: truncation): none | progressive = js.native
  def setProperties(properties: ojTabBarSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: display, value: all): Unit = js.native
  def setProperty(property: display, value: icons): Unit = js.native
  def setProperty(property: edge, value: bottom): Unit = js.native
  def setProperty(property: edge, value: end): Unit = js.native
  def setProperty(property: edge, value: start): Unit = js.native
  def setProperty(property: edge, value: top): Unit = js.native
  def setProperty(property: overflow, value: hidden): Unit = js.native
  def setProperty(property: overflow, value: popup): Unit = js.native
  def setProperty(property: reorderable, value: disabled): Unit = js.native
  def setProperty(property: reorderable, value: enabled): Unit = js.native
  def setProperty(property: truncation, value: none): Unit = js.native
  def setProperty(property: truncation, value: progressive): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(property: currentItem, value: js.Any): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_item(property: item, value: Anon_ContextRendererSelectableBoolean[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Any): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_AccessibleReorderAfterItem): Unit = js.native
}

