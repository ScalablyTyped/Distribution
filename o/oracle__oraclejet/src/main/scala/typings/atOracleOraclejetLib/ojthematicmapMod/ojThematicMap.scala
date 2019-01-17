package typings
package atOracleOraclejetLib.ojthematicmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojThematicMap[K1, K2, K3, D1, D2, D3]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponent[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]] {
  var animationDuration: scala.Double = js.native
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var areaData: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]) | scala.Null = js.native
  var as: java.lang.String = js.native
  var focusRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  var hiddenCategories: js.Array[java.lang.String] = js.native
  var highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all = js.native
  var highlightedCategories: js.Array[java.lang.String] = js.native
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var hoverRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  var initialZooming: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var isolatedItem: K1 = js.native
  var labelDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  var labelType: atOracleOraclejetLib.atOracleOraclejetLibStrings.long | atOracleOraclejetLib.atOracleOraclejetLibStrings.short = js.native
  var linkData: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]) | scala.Null = js.native
  var mapProvider: atOracleOraclejetLib.Anon_Geo = js.native
  var markerData: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K3, D3]) | scala.Null = js.native
  var markerZoomBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.fixed = js.native
  var maxZoom: scala.Double = js.native
  var onAnimationDurationChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onAreaDataChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]) | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onAsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onFocusRendererChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function1[
        /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
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
        /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
        atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
      ]) | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var onInitialZoomingChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onIsolatedItemChanged: (js.Function1[/* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K1], _]) | scala.Null = js.native
  var onLabelDisplayChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ], 
    _
  ]) | scala.Null = js.native
  var onLabelTypeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.long | atOracleOraclejetLib.atOracleOraclejetLibStrings.short
    ], 
    _
  ]) | scala.Null = js.native
  var onLinkDataChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]) | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onMapProviderChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Geo], 
    _
  ]) | scala.Null = js.native
  var onMarkerDataChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K3, D3]) | scala.Null], 
    _
  ]) | scala.Null = js.native
  var onMarkerZoomBehaviorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.fixed
    ], 
    _
  ]) | scala.Null = js.native
  var onMaxZoomChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
    _
  ]) | scala.Null = js.native
  var onPanningChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onRendererChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      (js.Function1[
        /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
        atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
      ]) | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var onSelectionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K1 | K2 | K3]], 
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
        /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
        atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
      ]) | scala.Null
    ], 
    _
  ]) | scala.Null = js.native
  var onStyleDefaultsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AreaSvgStyle], 
    _
  ]) | scala.Null = js.native
  var onTooltipChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultD1[K1, K3, D3, K2, D2, D1]
    ], 
    _
  ]) | scala.Null = js.native
  var onTooltipDisplayChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.labelAndShortDesc | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc
    ], 
    _
  ]) | scala.Null = js.native
  var onTouchResponseChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
    ], 
    _
  ]) | scala.Null = js.native
  var onZoomingChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var panning: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var renderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  var selection: js.Array[K1 | K2 | K3] = js.native
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var selectionRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  var styleDefaults: atOracleOraclejetLib.Anon_AreaSvgStyle = js.native
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultD1[K1, K3, D3, K2, D2, D1] = js.native
  var tooltipDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.labelAndShortDesc | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc = js.native
  var touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  @JSName("translations")
  var translations_ojThematicMap: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue = js.native
  var zooming: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
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
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialZoomingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialZoomingChanged,
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
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelTypeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.long | atOracleOraclejetLib.atOracleOraclejetLibStrings.short
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelTypeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.long | atOracleOraclejetLib.atOracleOraclejetLibStrings.short
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerZoomBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.fixed
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerZoomBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.fixed
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
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.labelAndShortDesc | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.labelAndShortDesc | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc
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
  def addEventListener_animationDurationChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationDurationChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationDurationChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaDataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.areaDataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]) | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaDataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.areaDataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]) | scala.Null], 
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
  def addEventListener_focusRendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusRendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function1[
          /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
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
          /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
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
          /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
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
          /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
          atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
        ]) | scala.Null
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolatedItemChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.isolatedItemChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K1], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolatedItemChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.isolatedItemChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[K1], 
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
  def addEventListener_mapProviderChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mapProviderChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Geo], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapProviderChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mapProviderChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Geo], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerDataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerDataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K3, D3]) | scala.Null], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerDataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerDataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K3, D3]) | scala.Null], 
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
  def addEventListener_rendererChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rendererChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        (js.Function1[
          /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
          atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
        ]) | scala.Null
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
        (js.Function1[
          /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
          atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
        ]) | scala.Null
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
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K1 | K2 | K3]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K1 | K2 | K3]], 
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
          /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
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
          /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
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
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AreaSvgStyle], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaultsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AreaSvgStyle], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultD1[K1, K3, D3, K2, D2, D1]
      ], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultD1[K1, K3, D3, K2, D2, D1]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getArea(index: scala.Double): atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.DataContext | scala.Null = js.native
  def getContextByNode(node: stdLib.Element): atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.NodeContext | scala.Null = js.native
  def getLink(index: scala.Double): atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.DataContext | scala.Null = js.native
  def getMarker(index: scala.Double): atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.DataContext | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_animationDuration(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationDuration): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplay): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_areaData(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.areaData): (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_focusRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusRenderer): (js.Function1[
    /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
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
    /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_initialZooming(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialZooming): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_isolatedItem(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.isolatedItem): K1 = js.native
  @JSName("getProperty")
  def getProperty_labelDisplay(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelDisplay): atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  @JSName("getProperty")
  def getProperty_labelType(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelType): atOracleOraclejetLib.atOracleOraclejetLibStrings.long | atOracleOraclejetLib.atOracleOraclejetLibStrings.short = js.native
  @JSName("getProperty")
  def getProperty_linkData(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkData): (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_mapProvider(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.mapProvider): atOracleOraclejetLib.Anon_Geo = js.native
  @JSName("getProperty")
  def getProperty_markerData(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerData): (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K3, D3]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_markerZoomBehavior(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerZoomBehavior): atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.fixed = js.native
  @JSName("getProperty")
  def getProperty_maxZoom(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxZoom): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_panning(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.panning): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_renderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.renderer): (js.Function1[
    /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection): js.Array[K1 | K2 | K3] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_selectionRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionRenderer): (js.Function1[
    /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaults): atOracleOraclejetLib.Anon_AreaSvgStyle = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltip): atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultD1[K1, K3, D3, K2, D2, D1] = js.native
  @JSName("getProperty")
  def getProperty_tooltipDisplay(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipDisplay): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.labelAndShortDesc | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchResponse): atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = js.native
  @JSName("getProperty")
  def getProperty_zooming(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.zooming): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  def setProperties(properties: ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3]): scala.Unit = js.native
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
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialZooming,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.initialZooming,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.long
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.short
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerZoomBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.fixed
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerZoomBehavior,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom
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
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelAndShortDesc
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipDisplay,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc
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
  def setProperty_animationDuration(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationDuration, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_areaData(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.areaData): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_areaData(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.areaData,
    value: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_focusRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusRenderer): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_focusRenderer(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.focusRenderer,
    value: js.Function1[
      /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
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
      /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_isolatedItem(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.isolatedItem, value: K1): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkData): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkData,
    value: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_mapProvider(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.mapProvider,
    value: atOracleOraclejetLib.Anon_Geo
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_markerData(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerData): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_markerData(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerData,
    value: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K3, D3]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_maxZoom(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.maxZoom, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_renderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.renderer): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_renderer(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.renderer,
    value: js.Function1[
      /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection,
    value: js.Array[K1 | K2 | K3]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionRenderer): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionRenderer,
    value: js.Function1[
      /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.styleDefaults,
    value: atOracleOraclejetLib.Anon_AreaSvgStyle
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltip,
    value: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultD1[K1, K3, D3, K2, D2, D1]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue
  ): scala.Unit = js.native
}

