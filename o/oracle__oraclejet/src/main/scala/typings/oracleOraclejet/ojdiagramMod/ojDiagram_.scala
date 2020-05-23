package typings.oracleOraclejet.ojdiagramMod

import typings.oracleOraclejet.anon.AnimationDuration
import typings.oracleOraclejet.anon.Drop
import typings.oracleOraclejet.anon.Halign
import typings.oracleOraclejet.anon.InsertSVGElement
import typings.oracleOraclejet.anon.LabelClearSelection
import typings.oracleOraclejet.anon.`5`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext
import typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojBeforeCollapse
import typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojBeforeExpand
import typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojCollapse
import typings.oracleOraclejet.ojdiagramMod.ojDiagram.ojExpand
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typings.oracleOraclejet.ojkeysetMod.KeySet
import typings.oracleOraclejet.oracleOraclejetStrings.`lazy`
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.as
import typings.oracleOraclejet.oracleOraclejetStrings.asChanged
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.dnd
import typings.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typings.oracleOraclejet.oracleOraclejetStrings.expanded
import typings.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typings.oracleOraclejet.oracleOraclejetStrings.focusRenderer
import typings.oracleOraclejet.oracleOraclejetStrings.focusRendererChanged
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.hiddenCategories
import typings.oracleOraclejet.oracleOraclejetStrings.hiddenCategoriesChanged
import typings.oracleOraclejet.oracleOraclejetStrings.highlightMatch
import typings.oracleOraclejet.oracleOraclejetStrings.highlightMatchChanged
import typings.oracleOraclejet.oracleOraclejetStrings.highlightedCategories
import typings.oracleOraclejet.oracleOraclejetStrings.highlightedCategoriesChanged
import typings.oracleOraclejet.oracleOraclejetStrings.hoverBehavior
import typings.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.hoverRenderer
import typings.oracleOraclejet.oracleOraclejetStrings.hoverRendererChanged
import typings.oracleOraclejet.oracleOraclejetStrings.layoutChanged
import typings.oracleOraclejet.oracleOraclejetStrings.link
import typings.oracleOraclejet.oracleOraclejetStrings.linkAndNodes
import typings.oracleOraclejet.oracleOraclejetStrings.linkData
import typings.oracleOraclejet.oracleOraclejetStrings.linkDataChanged
import typings.oracleOraclejet.oracleOraclejetStrings.linkHighlightMode
import typings.oracleOraclejet.oracleOraclejetStrings.linkHighlightModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.maxZoom
import typings.oracleOraclejet.oracleOraclejetStrings.maxZoomChanged
import typings.oracleOraclejet.oracleOraclejetStrings.minZoom
import typings.oracleOraclejet.oracleOraclejetStrings.minZoomChanged
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.node
import typings.oracleOraclejet.oracleOraclejetStrings.nodeAndIncomingLinks
import typings.oracleOraclejet.oracleOraclejetStrings.nodeAndLinks
import typings.oracleOraclejet.oracleOraclejetStrings.nodeAndOutgoingLinks
import typings.oracleOraclejet.oracleOraclejetStrings.nodeData
import typings.oracleOraclejet.oracleOraclejetStrings.nodeDataChanged
import typings.oracleOraclejet.oracleOraclejetStrings.nodeHighlightMode
import typings.oracleOraclejet.oracleOraclejetStrings.nodeHighlightModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.overview
import typings.oracleOraclejet.oracleOraclejetStrings.overviewChanged
import typings.oracleOraclejet.oracleOraclejetStrings.panDirection
import typings.oracleOraclejet.oracleOraclejetStrings.panDirectionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.panning
import typings.oracleOraclejet.oracleOraclejetStrings.panningChanged
import typings.oracleOraclejet.oracleOraclejetStrings.promotedLinkBehavior
import typings.oracleOraclejet.oracleOraclejetStrings.promotedLinkBehaviorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.rendererChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selection
import typings.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typings.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selectionRenderer
import typings.oracleOraclejet.oracleOraclejetStrings.selectionRendererChanged
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.styleDefaults
import typings.oracleOraclejet.oracleOraclejetStrings.styleDefaultsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.tooltip
import typings.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typings.oracleOraclejet.oracleOraclejetStrings.touchResponse
import typings.oracleOraclejet.oracleOraclejetStrings.touchResponseChanged
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.x
import typings.oracleOraclejet.oracleOraclejetStrings.y
import typings.oracleOraclejet.oracleOraclejetStrings.zoomRenderer
import typings.oracleOraclejet.oracleOraclejetStrings.zoomRendererChanged
import typings.oracleOraclejet.oracleOraclejetStrings.zooming
import typings.oracleOraclejet.oracleOraclejetStrings.zoomingChanged
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDiagram_[K1, K2, D1, D2] extends dvtBaseComponent[ojDiagramSettableProperties[K1, K2, D1, D2]] {
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var as: String = js.native
  var dnd: Drop = js.native
  var expanded: KeySet[K1] = js.native
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  var hiddenCategories: js.Array[String] = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  var linkData: (DataProvider[K2, D2]) | Null = js.native
  var linkHighlightMode: linkAndNodes | link = js.native
  var maxZoom: Double = js.native
  var minZoom: Double = js.native
  var nodeData: (DataProvider[K1, D1]) | Null = js.native
  var nodeHighlightMode: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onDndChanged: (js.Function1[/* event */ JetElementCustomEvent[Drop], _]) | Null = js.native
  var onExpandedChanged: (js.Function1[/* event */ JetElementCustomEvent[KeySet[K1]], _]) | Null = js.native
  var onFocusRendererChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
    ], 
    _
  ]) | Null = js.native
  var onHiddenCategoriesChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[String]], _]) | Null = js.native
  var onHighlightMatchChanged: (js.Function1[/* event */ JetElementCustomEvent[any | all], _]) | Null = js.native
  var onHighlightedCategoriesChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[String]], _]) | Null = js.native
  var onHoverBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[dim | none], _]) | Null = js.native
  var onHoverRendererChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
    ], 
    _
  ]) | Null = js.native
  var onLayoutChanged: (js.Function1[
    /* event */ JetElementCustomEvent[js.Function1[/* param0 */ DvtDiagramLayoutContext, Unit]], 
    _
  ]) | Null = js.native
  var onLinkDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K2, D2]) | Null], _]) | Null = js.native
  var onLinkHighlightModeChanged: (js.Function1[/* event */ JetElementCustomEvent[linkAndNodes | link], _]) | Null = js.native
  var onMaxZoomChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onMinZoomChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var onNodeDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K1, D1]) | Null], _]) | Null = js.native
  var onNodeHighlightModeChanged: (js.Function1[
    /* event */ JetElementCustomEvent[nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node], 
    _
  ]) | Null = js.native
  var onOjBeforeCollapse: (js.Function1[/* event */ ojBeforeCollapse, _]) | Null = js.native
  var onOjBeforeExpand: (js.Function1[/* event */ ojBeforeExpand, _]) | Null = js.native
  var onOjCollapse: (js.Function1[/* event */ ojCollapse, _]) | Null = js.native
  var onOjExpand: (js.Function1[/* event */ ojExpand, _]) | Null = js.native
  var onOverviewChanged: (js.Function1[/* event */ JetElementCustomEvent[Halign], _]) | Null = js.native
  var onPanDirectionChanged: (js.Function1[/* event */ JetElementCustomEvent[x | y | auto], _]) | Null = js.native
  var onPanningChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var onPromotedLinkBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[none | full | `lazy`], _]) | Null = js.native
  var onRendererChanged: (js.Function1[
    /* event */ JetElementCustomEvent[js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement]], 
    _
  ]) | Null = js.native
  var onSelectionChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[K1 | K2]], _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[/* event */ JetElementCustomEvent[single | multiple | none], _]) | Null = js.native
  var onSelectionRendererChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
    ], 
    _
  ]) | Null = js.native
  var onStyleDefaultsChanged: (js.Function1[/* event */ JetElementCustomEvent[AnimationDuration], _]) | Null = js.native
  var onTooltipChanged: (js.Function1[/* event */ JetElementCustomEvent[`5`[K1, K2, D1, D2]], _]) | Null = js.native
  var onTouchResponseChanged: (js.Function1[/* event */ JetElementCustomEvent[touchStart | auto], _]) | Null = js.native
  var onZoomRendererChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
    ], 
    _
  ]) | Null = js.native
  var onZoomingChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var overview: Halign = js.native
  var panDirection: x | y | auto = js.native
  var panning: auto | none = js.native
  var promotedLinkBehavior: none | full | `lazy` = js.native
  var selection: js.Array[K1 | K2] = js.native
  var selectionMode: single | multiple | none = js.native
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  var styleDefaults: AnimationDuration = js.native
  var tooltip: `5`[K1, K2, D1, D2] = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojDiagram_ : LabelClearSelection = js.native
  var zoomRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  var zooming: auto | none = js.native
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
    `type`: linkHighlightModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[linkAndNodes | link], _]
  ): Unit = js.native
  def addEventListener(
    `type`: linkHighlightModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[linkAndNodes | link], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: nodeHighlightModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: nodeHighlightModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: panDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[x | y | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: panDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[x | y | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: panningChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: panningChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: promotedLinkBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | full | `lazy`], _]
  ): Unit = js.native
  def addEventListener(
    `type`: promotedLinkBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | full | `lazy`], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _],
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
  def addEventListener(
    `type`: zoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: zoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
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
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Drop], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Drop], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[KeySet[K1]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[KeySet[K1]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusRendererChanged(
    `type`: focusRendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
      ], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusRendererChanged(
    `type`: focusRendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
      ], 
      _
    ],
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
  def addEventListener_hoverRendererChanged(
    `type`: hoverRendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
      ], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverRendererChanged(
    `type`: hoverRendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_layoutChanged(
    `type`: layoutChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function1[/* param0 */ DvtDiagramLayoutContext, Unit]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_layoutChanged(
    `type`: layoutChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function1[/* param0 */ DvtDiagramLayoutContext, Unit]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_linkDataChanged(
    `type`: linkDataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K2, D2]) | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_linkDataChanged(
    `type`: linkDataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K2, D2]) | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxZoomChanged(
    `type`: maxZoomChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxZoomChanged(
    `type`: maxZoomChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minZoomChanged(
    `type`: minZoomChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minZoomChanged(
    `type`: minZoomChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nodeDataChanged(
    `type`: nodeDataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K1, D1]) | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nodeDataChanged(
    `type`: nodeDataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K1, D1]) | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCollapse, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeCollapse, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeExpand, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojBeforeExpand, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojCollapse, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojCollapse, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojExpand, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojExpand, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Halign], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Halign], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rendererChanged(
    `type`: rendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rendererChanged(
    `type`: rendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[K1 | K2]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[K1 | K2]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRendererChanged(
    `type`: selectionRendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
      ], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRendererChanged(
    `type`: selectionRendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnimationDuration], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnimationDuration], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`5`[K1, K2, D1, D2]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`5`[K1, K2, D1, D2]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomRendererChanged(
    `type`: zoomRendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
      ], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomRendererChanged(
    `type`: zoomRendererChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): js.Object | Null = js.native
  def getLink(linkIndex: Double): js.Object | Null = js.native
  def getLinkCount(): Double = js.native
  def getNode(nodeIndex: Double): js.Object | Null = js.native
  def getNodeCount(): Double = js.native
  def getPromotedLink(startNodeIndex: Double, endNodeIndex: Double): js.Object | Null = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): Drop = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: expanded): KeySet[K1] = js.native
  @JSName("getProperty")
  def getProperty_focusRenderer(property: focusRenderer): (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_hoverRenderer(property: hoverRenderer): (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_linkData(property: linkData): (DataProvider[K2, D2]) | Null = js.native
  @JSName("getProperty")
  def getProperty_linkHighlightMode(property: linkHighlightMode): linkAndNodes | link = js.native
  @JSName("getProperty")
  def getProperty_maxZoom(property: maxZoom): Double = js.native
  @JSName("getProperty")
  def getProperty_minZoom(property: minZoom): Double = js.native
  @JSName("getProperty")
  def getProperty_nodeData(property: nodeData): (DataProvider[K1, D1]) | Null = js.native
  @JSName("getProperty")
  def getProperty_nodeHighlightMode(property: nodeHighlightMode): nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node = js.native
  @JSName("getProperty")
  def getProperty_overview(property: overview): Halign = js.native
  @JSName("getProperty")
  def getProperty_panDirection(property: panDirection): x | y | auto = js.native
  @JSName("getProperty")
  def getProperty_panning(property: panning): auto | none = js.native
  @JSName("getProperty")
  def getProperty_promotedLinkBehavior(property: promotedLinkBehavior): none | full | `lazy` = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K1 | K2] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_selectionRenderer(property: selectionRenderer): (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: styleDefaults): AnimationDuration = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `5`[K1, K2, D1, D2] = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  @JSName("getProperty")
  def getProperty_zoomRenderer(property: zoomRenderer): (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_zooming(property: zooming): auto | none = js.native
  def layout(param0: DvtDiagramLayoutContext): Unit = js.native
  def renderer(context: RendererContext[K1, D1]): InsertSVGElement = js.native
  def setProperties(properties: ojDiagramSettablePropertiesLenient[K1, K2, D1, D2]): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: highlightMatch, value: all): Unit = js.native
  def setProperty(property: highlightMatch, value: any): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: linkHighlightMode, value: link): Unit = js.native
  def setProperty(property: linkHighlightMode, value: linkAndNodes): Unit = js.native
  def setProperty(property: nodeHighlightMode, value: node): Unit = js.native
  def setProperty(property: nodeHighlightMode, value: nodeAndIncomingLinks): Unit = js.native
  def setProperty(property: nodeHighlightMode, value: nodeAndLinks): Unit = js.native
  def setProperty(property: nodeHighlightMode, value: nodeAndOutgoingLinks): Unit = js.native
  def setProperty(property: panDirection, value: auto): Unit = js.native
  def setProperty(property: panDirection, value: x): Unit = js.native
  def setProperty(property: panDirection, value: y): Unit = js.native
  def setProperty(property: panning, value: auto): Unit = js.native
  def setProperty(property: panning, value: none): Unit = js.native
  def setProperty(property: promotedLinkBehavior, value: `lazy`): Unit = js.native
  def setProperty(property: promotedLinkBehavior, value: full): Unit = js.native
  def setProperty(property: promotedLinkBehavior, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  def setProperty(property: touchResponse, value: auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart): Unit = js.native
  def setProperty(property: zooming, value: auto): Unit = js.native
  def setProperty(property: zooming, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: Drop): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: KeySet[K1]): Unit = js.native
  @JSName("setProperty")
  def setProperty_focusRenderer(property: focusRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_focusRenderer(
    property: focusRenderer,
    value: js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(property: hiddenCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(property: highlightedCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverRenderer(property: hoverRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverRenderer(
    property: hoverRenderer,
    value: js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: linkData): Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: linkData, value: DataProvider[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_maxZoom(property: maxZoom, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_minZoom(property: minZoom, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_nodeData(property: nodeData): Unit = js.native
  @JSName("setProperty")
  def setProperty_nodeData(property: nodeData, value: DataProvider[K1, D1]): Unit = js.native
  @JSName("setProperty")
  def setProperty_overview(property: overview, value: Halign): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K1 | K2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(property: selectionRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(
    property: selectionRenderer,
    value: js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(property: styleDefaults, value: AnimationDuration): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `5`[K1, K2, D1, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelClearSelection): Unit = js.native
  @JSName("setProperty")
  def setProperty_zoomRenderer(property: zoomRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_zoomRenderer(
    property: zoomRenderer,
    value: js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]
  ): Unit = js.native
}

