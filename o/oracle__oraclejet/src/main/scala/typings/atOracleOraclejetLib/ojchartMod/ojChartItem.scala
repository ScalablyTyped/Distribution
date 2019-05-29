package typings
package atOracleOraclejetLib.ojchartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojChartItem
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetElement[ojChartItemSettableProperties] {
  var borderColor: js.UndefOr[java.lang.String] = js.native
  var borderWidth: js.UndefOr[scala.Double] = js.native
  var boxPlot: js.UndefOr[atOracleOraclejetLib.Anon_MedianSvgClassNameMedianSvgStyle] = js.native
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.native
  var close: js.UndefOr[scala.Double] = js.native
  var color: js.UndefOr[java.lang.String] = js.native
  var drilling: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
  ] = js.native
  var groupId: js.Array[java.lang.String | scala.Double] = js.native
  var high: js.UndefOr[scala.Double] = js.native
  var items: js.UndefOr[js.Array[scala.Double | js.Object]] = js.native
  var label: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  var labelPosition: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideSlice | atOracleOraclejetLib.atOracleOraclejetLibStrings.aboveMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.belowMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.beforeMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.afterMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.insideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.native
  var labelStyle: js.UndefOr[js.Object | js.Array[js.Object]] = js.native
  var low: js.UndefOr[scala.Double] = js.native
  var markerDisplayed: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.native
  var markerShape: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | java.lang.String
  ] = js.native
  var markerSize: js.UndefOr[scala.Double] = js.native
  var onBorderColorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onBorderWidthChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onBoxPlotChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.Anon_MedianSvgClassNameMedianSvgStyle]], 
    _
  ]) | scala.Null = js.native
  var onCategoriesChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Array[java.lang.String]]], 
    _
  ]) | scala.Null = js.native
  var onCloseChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onColorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onDrillingChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onGroupIdChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String | scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onHighChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onItemsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Array[scala.Double | js.Object]]], 
    _
  ]) | scala.Null = js.native
  var onLabelChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String | js.Array[java.lang.String]]], 
    _
  ]) | scala.Null = js.native
  var onLabelPositionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideSlice | atOracleOraclejetLib.atOracleOraclejetLibStrings.aboveMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.belowMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.beforeMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.afterMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.insideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onLabelStyleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object | js.Array[js.Object]]], 
    _
  ]) | scala.Null = js.native
  var onLowChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onMarkerDisplayedChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onMarkerShapeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | java.lang.String
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onMarkerSizeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onOpenChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onPatternChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onQ1Changed: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onQ2Changed: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onQ3Changed: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onSeriesIdChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Double], 
    _
  ]) | scala.Null = js.native
  var onShortDescChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onSourceChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onSourceHoverChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onSourceHoverSelectedChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onSourceSelectedChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onSvgClassNameChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onSvgStyleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]], 
    _
  ]) | scala.Null = js.native
  var onTargetValueChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onValueChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onVolumeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onXChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double | java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onYChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onZChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var open: js.UndefOr[scala.Double] = js.native
  var pattern: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.native
  var q1: js.UndefOr[scala.Double] = js.native
  var q2: js.UndefOr[scala.Double] = js.native
  var q3: js.UndefOr[scala.Double] = js.native
  var seriesId: java.lang.String | scala.Double = js.native
  var shortDesc: js.UndefOr[java.lang.String] = js.native
  var source: js.UndefOr[java.lang.String] = js.native
  var sourceHover: js.UndefOr[java.lang.String] = js.native
  var sourceHoverSelected: js.UndefOr[java.lang.String] = js.native
  var sourceSelected: js.UndefOr[java.lang.String] = js.native
  var svgClassName: js.UndefOr[java.lang.String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var targetValue: js.UndefOr[scala.Double] = js.native
  var value: js.UndefOr[scala.Double] = js.native
  var volume: js.UndefOr[scala.Double] = js.native
  var x: js.UndefOr[scala.Double | java.lang.String] = js.native
  var y: js.UndefOr[scala.Double] = js.native
  var z: js.UndefOr[scala.Double] = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.drillingChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
        ]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideSlice | atOracleOraclejetLib.atOracleOraclejetLibStrings.aboveMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.belowMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.beforeMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.afterMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.insideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideSlice | atOracleOraclejetLib.atOracleOraclejetLibStrings.aboveMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.belowMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.beforeMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.afterMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.insideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
        ]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerDisplayedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerDisplayedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
        ]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerShapeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | java.lang.String
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerShapeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | java.lang.String
        ]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.patternChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.patternChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
        ]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.abort,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.abort,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.UIEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.blur,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.blur,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.FocusEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderColorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderColorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderWidthChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderWidthChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderWidthChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderWidthChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boxPlotChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.boxPlotChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.Anon_MedianSvgClassNameMedianSvgStyle]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boxPlotChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.boxPlotChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.Anon_MedianSvgClassNameMedianSvgStyle]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_categoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.categoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Array[java.lang.String]]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_categoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.categoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Array[java.lang.String]]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.change,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.change,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.click,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.click,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.close,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.close,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.closeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.closeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.colorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.colorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.copy,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.copy,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.cut,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.cut,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.drag,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.drag,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.DragEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.DragEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.DragEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.DragEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.DragEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.DragEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.drop,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.drop,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.DragEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ended,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ended,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.error,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.error,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.ErrorEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.focus,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.focus,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.FocusEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupIdChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupIdChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String | scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_groupIdChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupIdChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String | scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.input,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.input,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.itemsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Array[scala.Double | js.Object]]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.itemsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Array[scala.Double | js.Object]]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String | js.Array[java.lang.String]]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String | js.Array[java.lang.String]]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelStyleChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelStyleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object | js.Array[js.Object]]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelStyleChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelStyleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object | js.Array[js.Object]]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.load,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.load,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.ProgressEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lowChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.lowChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lowChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.lowChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSizeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSizeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_openChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.openChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_openChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.openChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.paste,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.paste,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pause,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pause,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.play,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.play,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.playing,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.playing,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.PointerEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.progress,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.progress,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.ProgressEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_q1Changed(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.q1Changed,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_q1Changed(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.q1Changed,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_q2Changed(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.q2Changed,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_q2Changed(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.q2Changed,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_q3Changed(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.q3Changed,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_q3Changed(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.q3Changed,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.reset,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.reset,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.resize,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.resize,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.UIEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.SecurityPolicyViolationEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.select,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.select,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionchange,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionchange,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectstart,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectstart,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesIdChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesIdChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seriesIdChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesIdChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Double], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shortDescChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDescChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shortDescChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDescChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.sourceChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.sourceChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceHoverChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.sourceHoverChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceHoverChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.sourceHoverChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceHoverSelectedChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.sourceHoverSelectedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceHoverSelectedChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.sourceHoverSelectedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceSelectedChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.sourceSelectedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceSelectedChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.sourceSelectedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.submit,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.submit,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassNameChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassNameChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgStyleChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgStyleChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetValueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.targetValueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetValueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.targetValueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TouchEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TouchEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TouchEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TouchEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.volumeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.volumeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.WheelEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.xChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double | java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_xChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.xChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double | java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.yChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_yChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.yChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.zChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.zChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getProperty(property: java.lang.String): js.Any = js.native
  @JSName("getProperty")
  def getProperty_borderColor(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderColor): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_borderWidth(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderWidth): js.UndefOr[scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_boxPlot(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.boxPlot): js.UndefOr[atOracleOraclejetLib.Anon_MedianSvgClassNameMedianSvgStyle] = js.native
  @JSName("getProperty")
  def getProperty_categories(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.categories): js.UndefOr[js.Array[java.lang.String]] = js.native
  @JSName("getProperty")
  def getProperty_close(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.close): js.UndefOr[scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_color(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.color): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_drilling(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drilling): js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
  ] = js.native
  @JSName("getProperty")
  def getProperty_groupId(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupId): js.Array[java.lang.String | scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_high(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.high): js.UndefOr[scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_items(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.items): js.UndefOr[js.Array[scala.Double | js.Object]] = js.native
  @JSName("getProperty")
  def getProperty_label(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.label): js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  @JSName("getProperty")
  def getProperty_labelPosition(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelPosition): js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideSlice | atOracleOraclejetLib.atOracleOraclejetLibStrings.aboveMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.belowMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.beforeMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.afterMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.insideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.native
  @JSName("getProperty")
  def getProperty_labelStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelStyle): js.UndefOr[js.Object | js.Array[js.Object]] = js.native
  @JSName("getProperty")
  def getProperty_low(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.low): js.UndefOr[scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_markerDisplayed(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerDisplayed): js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.native
  @JSName("getProperty")
  def getProperty_markerShape(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerShape): js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | java.lang.String
  ] = js.native
  @JSName("getProperty")
  def getProperty_markerSize(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSize): js.UndefOr[scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_open(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.open): js.UndefOr[scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_pattern(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.pattern): js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.native
  @JSName("getProperty")
  def getProperty_q1(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.q1): js.UndefOr[scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_q2(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.q2): js.UndefOr[scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_q3(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.q3): js.UndefOr[scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_seriesId(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesId): java.lang.String | scala.Double = js.native
  @JSName("getProperty")
  def getProperty_shortDesc(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_source(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.source): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_sourceHover(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.sourceHover): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_sourceHoverSelected(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.sourceHoverSelected): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_sourceSelected(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.sourceSelected): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassName): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyle): js.UndefOr[js.Object] = js.native
  @JSName("getProperty")
  def getProperty_targetValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.targetValue): js.UndefOr[scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value): js.UndefOr[scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_volume(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.volume): js.UndefOr[scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_x(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.x): js.UndefOr[scala.Double | java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_y(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.y): js.UndefOr[scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_z(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.z): js.UndefOr[scala.Double] = js.native
  def setProperties(properties: ojChartItemSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drilling,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drilling,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drilling,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelPosition,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideSlice | atOracleOraclejetLib.atOracleOraclejetLibStrings.aboveMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.belowMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.beforeMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.afterMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.insideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerDisplayed,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerDisplayed,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerDisplayed,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerShape,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | java.lang.String
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.pattern,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty[T /* <: java.lang.String */](
    property: T,
    value: atOracleOraclejetLib.atOracleOraclejetMod.JetSetPropertyType[T, ojChartItemSettableProperties]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_borderColor(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderColor, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_borderWidth(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderWidth, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_boxPlot(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.boxPlot,
    value: atOracleOraclejetLib.Anon_MedianSvgClassNameMedianSvgStyle
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_categories(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.categories,
    value: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_close(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.close, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.color, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_groupId(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.groupId,
    value: js.Array[java.lang.String | scala.Double]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_high(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.high, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_items(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.items,
    value: js.Array[scala.Double | js.Object]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_label(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.label, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_label(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.label,
    value: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelStyle, value: js.Array[js.Object]): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelStyle, value: js.Object): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_low(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.low, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_markerSize(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSize, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_open(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.open, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_q1(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.q1, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_q2(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.q2, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_q3(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.q3, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_seriesId(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesId, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_seriesId(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.seriesId, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_shortDesc(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_source(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.source, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_sourceHover(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.sourceHover, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_sourceHoverSelected(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.sourceHoverSelected,
    value: java.lang.String
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_sourceSelected(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.sourceSelected, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassName, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyle, value: js.Object): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_targetValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.targetValue, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_volume(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.volume, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_x(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.x, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_x(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.x, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_y(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.y, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_z(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.z, value: scala.Double): scala.Unit = js.native
}

