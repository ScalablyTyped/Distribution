package typings
package atOracleOraclejetLib.ojdiagramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDiagram[K1, K2, D1, D2]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponent[ojDiagramSettableProperties[K1, K2, D1, D2]] {
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var as: java.lang.String = js.native
  var dnd: atOracleOraclejetLib.Anon_DragDrop = js.native
  var expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K1] = js.native
  var focusRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  var hiddenCategories: js.Array[java.lang.String] = js.native
  var highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all = js.native
  var highlightedCategories: js.Array[java.lang.String] = js.native
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var hoverRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  var linkData: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]) | scala.Null = js.native
  var linkHighlightMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkAndNodes | atOracleOraclejetLib.atOracleOraclejetLibStrings.link = js.native
  var maxZoom: scala.Double = js.native
  var minZoom: scala.Double = js.native
  var nodeData: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]) | scala.Null = js.native
  var nodeHighlightMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndIncomingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndOutgoingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.node = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onAsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onDndChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DragDrop], 
    _
  ]) | scala.Null = js.native
  var onExpandedChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojkeysetMod.KeySet[K1]], 
    _
  ]) | scala.Null = js.native
  var onFocusRendererChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function1[
        /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
        atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
      ]) | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var onHiddenCategoriesChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onHighlightMatchChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
    ], 
    _
  ]) | scala.Null = js.native
  var onHighlightedCategoriesChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onHoverBehaviorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onHoverRendererChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function1[
        /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
        atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
      ]) | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var onLayoutChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Function1[/* param0 */ DvtDiagramLayoutContext, scala.Unit]], 
    _
  ]) | scala.Null = js.native
  var onLinkDataChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]) | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onLinkHighlightModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.linkAndNodes | atOracleOraclejetLib.atOracleOraclejetLibStrings.link
    ], 
    _
  ]) | scala.Null = js.native
  var onMaxZoomChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  var onMinZoomChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  var onNodeDataChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]) | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onNodeHighlightModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndIncomingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndOutgoingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.node
    ], 
    _
  ]) | scala.Null = js.native
  var onOjBeforeCollapse: (js.Function1[/* event */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.ojBeforeCollapse, _]) | scala.Null = js.native
  var onOjBeforeExpand: (js.Function1[/* event */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.ojBeforeExpand, _]) | scala.Null = js.native
  var onOjCollapse: (js.Function1[/* event */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.ojCollapse, _]) | scala.Null = js.native
  var onOjExpand: (js.Function1[/* event */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.ojExpand, _]) | scala.Null = js.native
  var onOverviewChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Bottom], 
    _
  ]) | scala.Null = js.native
  var onPanDirectionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ], 
    _
  ]) | scala.Null = js.native
  var onPanningChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onPromotedLinkBehaviorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.`lazy`
    ], 
    _
  ]) | scala.Null = js.native
  var onRendererChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.Function1[
        /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
        atOracleOraclejetLib.Anon_InsertSVGElement
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onSelectionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K1 | K2]], 
    _
  ]) | scala.Null = js.native
  var onSelectionModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onSelectionRendererChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function1[
        /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
        atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
      ]) | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var onStyleDefaultsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AnimationDuration], 
    _
  ]) | scala.Null = js.native
  var onTooltipChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererAnonInsert[K1, K2, D1, D2]], 
    _
  ]) | scala.Null = js.native
  var onTouchResponseChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ], 
    _
  ]) | scala.Null = js.native
  var onZoomRendererChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function1[
        /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
        atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
      ]) | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var onZoomingChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var overview: atOracleOraclejetLib.Anon_Bottom = js.native
  var panDirection: atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  var panning: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var promotedLinkBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.`lazy` = js.native
  var selection: js.Array[K1 | K2] = js.native
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var selectionRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  var styleDefaults: atOracleOraclejetLib.Anon_AnimationDuration = js.native
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsert[K1, K2, D1, D2] = js.native
  var touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  @JSName("translations")
  var translations_ojDiagram: atOracleOraclejetLib.Anon_ComponentNameLabelAndValueLabelClearSelection = js.native
  var zoomRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  var zooming: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChangeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChangeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatchChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatchChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkHighlightModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.linkAndNodes | atOracleOraclejetLib.atOracleOraclejetLibStrings.link
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkHighlightModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.linkAndNodes | atOracleOraclejetLib.atOracleOraclejetLibStrings.link
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeHighlightModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndIncomingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndOutgoingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.node
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeHighlightModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndIncomingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndOutgoingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.node
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.panDirectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.panDirectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.panningChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.panningChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.promotedLinkBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.`lazy`
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.promotedLinkBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.`lazy`
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
        atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionModeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponseChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponseChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
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
  def addEventListener_dndChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dndChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DragDrop], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dndChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_DragDrop], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.expandedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojkeysetMod.KeySet[K1]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.expandedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojkeysetMod.KeySet[K1]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusRendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusRendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function1[
          /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
          atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
        ]) | scala.Null
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusRendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusRendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function1[
          /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
          atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
        ]) | scala.Null
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hiddenCategoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hiddenCategoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightedCategoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightedCategoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverRendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverRendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function1[
          /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
          atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
        ]) | scala.Null
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverRendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverRendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function1[
          /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
          atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
        ]) | scala.Null
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_layoutChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.layoutChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Function1[/* param0 */ DvtDiagramLayoutContext, scala.Unit]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_layoutChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.layoutChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Function1[/* param0 */ DvtDiagramLayoutContext, scala.Unit]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_linkDataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkDataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]) | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_linkDataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkDataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]) | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxZoomChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxZoomChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxZoomChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxZoomChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minZoomChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minZoomChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minZoomChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minZoomChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nodeDataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeDataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]) | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nodeDataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeDataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]) | scala.Null], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.ojBeforeCollapse, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.ojBeforeCollapse, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.ojBeforeExpand, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojBeforeExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.ojBeforeExpand, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.ojCollapse, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojCollapse,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.ojCollapse, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.ojExpand, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojExpand,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.ojExpand, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.overviewChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Bottom], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.overviewChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Bottom], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.Function1[
          /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
          atOracleOraclejetLib.Anon_InsertSVGElement
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.Function1[
          /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
          atOracleOraclejetLib.Anon_InsertSVGElement
        ]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K1 | K2]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K1 | K2]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionRendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function1[
          /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
          atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
        ]) | scala.Null
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionRendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function1[
          /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
          atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
        ]) | scala.Null
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaultsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AnimationDuration], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaultsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AnimationDuration], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererAnonInsert[K1, K2, D1, D2]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererAnonInsert[K1, K2, D1, D2]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomRendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomRendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function1[
          /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
          atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
        ]) | scala.Null
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomRendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomRendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function1[
          /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
          atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
        ]) | scala.Null
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getContextByNode(node: stdLib.Element): js.Object | scala.Null = js.native
  def getLink(linkIndex: scala.Double): js.Object | scala.Null = js.native
  def getLinkCount(): scala.Double = js.native
  def getNode(nodeIndex: scala.Double): js.Object | scala.Null = js.native
  def getNodeCount(): scala.Double = js.native
  def getPromotedLink(startNodeIndex: scala.Double, endNodeIndex: scala.Double): js.Object | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChange): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplay): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dnd): atOracleOraclejetLib.Anon_DragDrop = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.expanded): atOracleOraclejetLib.ojkeysetMod.KeySet[K1] = js.native
  @JSName("getProperty")
  def getProperty_focusRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusRenderer): (js.Function1[
    /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hiddenCategories): js.Array[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatch): atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightedCategories): js.Array[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehavior): atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_hoverRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverRenderer): (js.Function1[
    /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_linkData(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkData): (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_linkHighlightMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkHighlightMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.linkAndNodes | atOracleOraclejetLib.atOracleOraclejetLibStrings.link = js.native
  @JSName("getProperty")
  def getProperty_maxZoom(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxZoom): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_minZoom(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.minZoom): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_nodeData(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeData): (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_nodeHighlightMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeHighlightMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndIncomingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndOutgoingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.node = js.native
  @JSName("getProperty")
  def getProperty_overview(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.overview): atOracleOraclejetLib.Anon_Bottom = js.native
  @JSName("getProperty")
  def getProperty_panDirection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.panDirection): atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  @JSName("getProperty")
  def getProperty_panning(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.panning): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_promotedLinkBehavior(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.promotedLinkBehavior): atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.`lazy` = js.native
  @JSName("getProperty")
  def getProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection): js.Array[K1 | K2] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_selectionRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionRenderer): (js.Function1[
    /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaults): atOracleOraclejetLib.Anon_AnimationDuration = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltip): atOracleOraclejetLib.Anon_ContextRendererAnonInsert[K1, K2, D1, D2] = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponse): atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  @JSName("getProperty")
  def getProperty_zoomRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomRenderer): (js.Function1[
    /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_zooming(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zooming): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  def layout(param0: DvtDiagramLayoutContext): scala.Unit = js.native
  def renderer(context: atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1]): atOracleOraclejetLib.Anon_InsertSVGElement = js.native
  def setProperties(properties: ojDiagramSettablePropertiesLenient[K1, K2, D1, D2]): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChange,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChange,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatch,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightMatch,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.any
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkHighlightMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.link
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkHighlightMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkAndNodes
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeHighlightMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.node
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeHighlightMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndIncomingLinks
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeHighlightMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndLinks
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeHighlightMode,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndOutgoingLinks
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.panDirection,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.panDirection,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.x
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.panDirection,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.y
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.panning,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.panning,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.promotedLinkBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.`lazy`
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.promotedLinkBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.full
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.promotedLinkBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
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
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponse,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponse,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zooming,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zooming,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dnd,
    value: atOracleOraclejetLib.Anon_DragDrop
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.expanded,
    value: atOracleOraclejetLib.ojkeysetMod.KeySet[K1]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_focusRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusRenderer): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_focusRenderer(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusRenderer,
    value: js.Function1[
      /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hiddenCategories,
    value: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.highlightedCategories,
    value: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverRenderer): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverRenderer(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.hoverRenderer,
    value: js.Function1[
      /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkData): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkData,
    value: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_maxZoom(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxZoom, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_minZoom(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.minZoom, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_nodeData(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeData): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_nodeData(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeData,
    value: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_overview(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.overview,
    value: atOracleOraclejetLib.Anon_Bottom
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection, value: js.Array[K1 | K2]): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionRenderer): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionRenderer,
    value: js.Function1[
      /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaults,
    value: atOracleOraclejetLib.Anon_AnimationDuration
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltip,
    value: atOracleOraclejetLib.Anon_ContextRendererAnonInsert[K1, K2, D1, D2]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_ComponentNameLabelAndValueLabelClearSelection
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_zoomRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomRenderer): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_zoomRenderer(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoomRenderer,
    value: js.Function1[
      /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ]
  ): scala.Unit = js.native
}

