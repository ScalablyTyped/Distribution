package typings.oracleOraclejet.ojtreemapMod

import typings.oracleOraclejet.anon.GroupLabelDisplay
import typings.oracleOraclejet.anon.LabelDataVisualization
import typings.oracleOraclejet.anon.`26`
import typings.oracleOraclejet.anon.`27`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typings.oracleOraclejet.ojtreemapMod.ojTreemap.DataContext
import typings.oracleOraclejet.ojtreemapMod.ojTreemap.NodeContext
import typings.oracleOraclejet.ojtreemapMod.ojTreemap.ojBeforeDrill
import typings.oracleOraclejet.ojtreemapMod.ojTreemap.ojDrill
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.animationDuration
import typings.oracleOraclejet.oracleOraclejetStrings.animationDurationChanged
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.animationUpdateColor
import typings.oracleOraclejet.oracleOraclejetStrings.animationUpdateColorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.as
import typings.oracleOraclejet.oracleOraclejetStrings.asChanged
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bevels
import typings.oracleOraclejet.oracleOraclejetStrings.colorLabel
import typings.oracleOraclejet.oracleOraclejetStrings.colorLabelChanged
import typings.oracleOraclejet.oracleOraclejetStrings.data
import typings.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.displayLevels
import typings.oracleOraclejet.oracleOraclejetStrings.displayLevelsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.drilling
import typings.oracleOraclejet.oracleOraclejetStrings.drillingChanged
import typings.oracleOraclejet.oracleOraclejetStrings.gaps
import typings.oracleOraclejet.oracleOraclejetStrings.groupGaps
import typings.oracleOraclejet.oracleOraclejetStrings.groupGapsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.hiddenCategories
import typings.oracleOraclejet.oracleOraclejetStrings.hiddenCategoriesChanged
import typings.oracleOraclejet.oracleOraclejetStrings.highlightMatch
import typings.oracleOraclejet.oracleOraclejetStrings.highlightMatchChanged
import typings.oracleOraclejet.oracleOraclejetStrings.highlightedCategories
import typings.oracleOraclejet.oracleOraclejetStrings.highlightedCategoriesChanged
import typings.oracleOraclejet.oracleOraclejetStrings.hoverBehavior
import typings.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorDelay
import typings.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorDelayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.isolatedNode
import typings.oracleOraclejet.oracleOraclejetStrings.isolatedNodeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.layout
import typings.oracleOraclejet.oracleOraclejetStrings.layoutChanged
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.nodeContent
import typings.oracleOraclejet.oracleOraclejetStrings.nodeContentChanged
import typings.oracleOraclejet.oracleOraclejetStrings.nodeDefaults
import typings.oracleOraclejet.oracleOraclejetStrings.nodeDefaultsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.nodeSeparators
import typings.oracleOraclejet.oracleOraclejetStrings.nodeSeparatorsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.outer
import typings.oracleOraclejet.oracleOraclejetStrings.rootNode
import typings.oracleOraclejet.oracleOraclejetStrings.rootNodeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selection
import typings.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typings.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.sizeLabel
import typings.oracleOraclejet.oracleOraclejetStrings.sizeLabelChanged
import typings.oracleOraclejet.oracleOraclejetStrings.sliceAndDiceHorizontal
import typings.oracleOraclejet.oracleOraclejetStrings.sliceAndDiceVertical
import typings.oracleOraclejet.oracleOraclejetStrings.sorting
import typings.oracleOraclejet.oracleOraclejetStrings.sortingChanged
import typings.oracleOraclejet.oracleOraclejetStrings.squarified
import typings.oracleOraclejet.oracleOraclejetStrings.tooltip
import typings.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typings.oracleOraclejet.oracleOraclejetStrings.touchResponse
import typings.oracleOraclejet.oracleOraclejetStrings.touchResponseChanged
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTreemap_[K, D] extends dvtBaseComponent[ojTreemapSettableProperties[K, D]] {
  var animationDuration: Double = js.native
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var animationUpdateColor: String = js.native
  var as: String = js.native
  var colorLabel: String = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var displayLevels: Double = js.native
  var drilling: on | off = js.native
  var groupGaps: all | none | outer = js.native
  var hiddenCategories: js.Array[String] = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var hoverBehaviorDelay: Double = js.native
  var isolatedNode: js.Any = js.native
  var layout: sliceAndDiceHorizontal | sliceAndDiceVertical | squarified = js.native
  var nodeContent: `26`[K, D] = js.native
  var nodeDefaults: GroupLabelDisplay = js.native
  var nodeSeparators: bevels | gaps = js.native
  var onAnimationDurationChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var onAnimationUpdateColorChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onColorLabelChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], _]) | Null = js.native
  var onDisplayLevelsChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onDrillingChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off], _]) | Null = js.native
  var onGroupGapsChanged: (js.Function1[/* event */ JetElementCustomEvent[all | none | outer], _]) | Null = js.native
  var onHiddenCategoriesChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[String]], _]) | Null = js.native
  var onHighlightMatchChanged: (js.Function1[/* event */ JetElementCustomEvent[any | all], _]) | Null = js.native
  var onHighlightedCategoriesChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[String]], _]) | Null = js.native
  var onHoverBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[dim | none], _]) | Null = js.native
  var onHoverBehaviorDelayChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onIsolatedNodeChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['isolatedNode'] */ js.Any
    ], 
    _
  ]) | Null = js.native
  var onLayoutChanged: (js.Function1[
    /* event */ JetElementCustomEvent[sliceAndDiceHorizontal | sliceAndDiceVertical | squarified], 
    _
  ]) | Null = js.native
  var onNodeContentChanged: (js.Function1[/* event */ JetElementCustomEvent[`26`[K, D]], _]) | Null = js.native
  var onNodeDefaultsChanged: (js.Function1[/* event */ JetElementCustomEvent[GroupLabelDisplay], _]) | Null = js.native
  var onNodeSeparatorsChanged: (js.Function1[/* event */ JetElementCustomEvent[bevels | gaps], _]) | Null = js.native
  var onOjBeforeDrill: (js.Function1[/* event */ ojBeforeDrill, _]) | Null = js.native
  var onOjDrill: (js.Function1[/* event */ ojDrill, _]) | Null = js.native
  var onRootNodeChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['rootNode'] */ js.Any
    ], 
    _
  ]) | Null = js.native
  var onSelectionChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[_]], _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[/* event */ JetElementCustomEvent[none | single | multiple], _]) | Null = js.native
  var onSizeLabelChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onSortingChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off], _]) | Null = js.native
  var onTooltipChanged: (js.Function1[/* event */ JetElementCustomEvent[`27`[K, D]], _]) | Null = js.native
  var onTouchResponseChanged: (js.Function1[/* event */ JetElementCustomEvent[touchStart | auto], _]) | Null = js.native
  var rootNode: js.Any = js.native
  var selection: js.Array[_] = js.native
  var selectionMode: none | single | multiple = js.native
  var sizeLabel: String = js.native
  var sorting: on | off = js.native
  var tooltip: `27`[K, D] = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojTreemap_ : LabelDataVisualization = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _]
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: groupGapsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | none | outer], _]
  ): Unit = js.native
  def addEventListener(
    `type`: groupGapsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | none | outer], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _]
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: isolatedNodeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['isolatedNode'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: isolatedNodeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['isolatedNode'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: layoutChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[sliceAndDiceHorizontal | sliceAndDiceVertical | squarified], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: layoutChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[sliceAndDiceHorizontal | sliceAndDiceVertical | squarified], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: nodeSeparatorsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[bevels | gaps], _]
  ): Unit = js.native
  def addEventListener(
    `type`: nodeSeparatorsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[bevels | gaps], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: rootNodeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['rootNode'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: rootNodeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['rootNode'] */ js.Any
      ], 
      _
    ],
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
  def addEventListener(
    `type`: sortingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _]
  ): Unit = js.native
  def addEventListener(
    `type`: sortingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationUpdateColorChanged(
    `type`: animationUpdateColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationUpdateColorChanged(
    `type`: animationUpdateColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
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
  def addEventListener_colorLabelChanged(
    `type`: colorLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorLabelChanged(
    `type`: colorLabelChanged,
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
  def addEventListener_displayLevelsChanged(
    `type`: displayLevelsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_displayLevelsChanged(
    `type`: displayLevelsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[String]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverBehaviorDelayChanged(
    `type`: hoverBehaviorDelayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverBehaviorDelayChanged(
    `type`: hoverBehaviorDelayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nodeContentChanged(
    `type`: nodeContentChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`26`[K, D]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nodeContentChanged(
    `type`: nodeContentChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`26`[K, D]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nodeDefaultsChanged(
    `type`: nodeDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[GroupLabelDisplay], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nodeDefaultsChanged(
    `type`: nodeDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[GroupLabelDisplay], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDrill(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeDrill,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeDrill, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDrill(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeDrill,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeDrill, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojDrill,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojDrill, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDrill(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojDrill,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojDrill, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[_]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[_]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizeLabelChanged(
    `type`: sizeLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizeLabelChanged(
    `type`: sizeLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`27`[K, D]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`27`[K, D]], _],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): NodeContext | Null = js.native
  def getNode(subIdPath: js.Array[_]): DataContext | Null = js.native
  @JSName("getProperty")
  def getProperty_animationDuration(property: animationDuration): Double = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationUpdateColor(property: animationUpdateColor): String = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_colorLabel(property: colorLabel): String = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_displayLevels(property: displayLevels): Double = js.native
  @JSName("getProperty")
  def getProperty_drilling(property: drilling): on | off = js.native
  @JSName("getProperty")
  def getProperty_groupGaps(property: groupGaps): all | none | outer = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_hoverBehaviorDelay(property: hoverBehaviorDelay): Double = js.native
  @JSName("getProperty")
  def getProperty_isolatedNode(property: isolatedNode): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['isolatedNode'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_layout(property: layout): sliceAndDiceHorizontal | sliceAndDiceVertical | squarified = js.native
  @JSName("getProperty")
  def getProperty_nodeContent(property: nodeContent): `26`[K, D] = js.native
  @JSName("getProperty")
  def getProperty_nodeDefaults(property: nodeDefaults): GroupLabelDisplay = js.native
  @JSName("getProperty")
  def getProperty_nodeSeparators(property: nodeSeparators): bevels | gaps = js.native
  @JSName("getProperty")
  def getProperty_rootNode(property: rootNode): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['rootNode'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[_] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): none | single | multiple = js.native
  @JSName("getProperty")
  def getProperty_sizeLabel(property: sizeLabel): String = js.native
  @JSName("getProperty")
  def getProperty_sorting(property: sorting): on | off = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `27`[K, D] = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  def setProperties(properties: ojTreemapSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: drilling, value: off): Unit = js.native
  def setProperty(property: drilling, value: on): Unit = js.native
  def setProperty(property: groupGaps, value: all): Unit = js.native
  def setProperty(property: groupGaps, value: none): Unit = js.native
  def setProperty(property: groupGaps, value: outer): Unit = js.native
  def setProperty(property: highlightMatch, value: all): Unit = js.native
  def setProperty(property: highlightMatch, value: any): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: layout, value: sliceAndDiceHorizontal): Unit = js.native
  def setProperty(property: layout, value: sliceAndDiceVertical): Unit = js.native
  def setProperty(property: layout, value: squarified): Unit = js.native
  def setProperty(property: nodeSeparators, value: bevels): Unit = js.native
  def setProperty(property: nodeSeparators, value: gaps): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  def setProperty(property: sorting, value: off): Unit = js.native
  def setProperty(property: sorting, value: on): Unit = js.native
  def setProperty(property: touchResponse, value: auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationUpdateColor(property: animationUpdateColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_colorLabel(property: colorLabel, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_displayLevels(property: displayLevels, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(property: hiddenCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(property: highlightedCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverBehaviorDelay(property: hoverBehaviorDelay, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_isolatedNode(property: isolatedNode, value: js.Any): Unit = js.native
  @JSName("setProperty")
  def setProperty_nodeContent(property: nodeContent, value: `26`[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_nodeDefaults(property: nodeDefaults, value: GroupLabelDisplay): Unit = js.native
  @JSName("setProperty")
  def setProperty_rootNode(property: rootNode, value: js.Any): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[_]): Unit = js.native
  @JSName("setProperty")
  def setProperty_sizeLabel(property: sizeLabel, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `27`[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelDataVisualization): Unit = js.native
}

