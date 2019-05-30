package typings
package atOracleOraclejetLib.ojlegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojLegendItem
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetElement[ojLegendItemSettableProperties] {
  var borderColor: js.UndefOr[java.lang.String] = js.native
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.native
  var categoryVisibility: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.visible
  ] = js.native
  var color: js.UndefOr[java.lang.String] = js.native
  var drilling: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
  ] = js.native
  var lineStyle: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
  ] = js.native
  var lineWidth: js.UndefOr[scala.Double] = js.native
  var markerColor: js.UndefOr[java.lang.String] = js.native
  var markerShape: atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.ellipse | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String = js.native
  var markerSvgClassName: js.UndefOr[java.lang.String] = js.native
  var markerSvgStyle: js.UndefOr[js.Object] = js.native
  var onBorderColorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onCategoriesChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Array[java.lang.String]]], 
    _
  ]) | scala.Null = js.native
  var onCategoryVisibilityChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.visible
      ]
    ], 
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
  var onLineStyleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onLineWidthChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var onMarkerColorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onMarkerShapeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.ellipse | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
    ], 
    _
  ]) | scala.Null = js.native
  var onMarkerSvgClassNameChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onMarkerSvgStyleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]], 
    _
  ]) | scala.Null = js.native
  var onPatternChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
      ]
    ], 
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
  var onSvgClassNameChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onSvgStyleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]], 
    _
  ]) | scala.Null = js.native
  var onSymbolTypeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.image | atOracleOraclejetLib.atOracleOraclejetLibStrings.marker
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onTextChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var pattern: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ] = js.native
  var shortDesc: js.UndefOr[java.lang.String] = js.native
  var source: js.UndefOr[java.lang.String] = js.native
  var svgClassName: js.UndefOr[java.lang.String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var symbolType: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.image | atOracleOraclejetLib.atOracleOraclejetLibStrings.marker
  ] = js.native
  var text: java.lang.String = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.categoryVisibilityChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.visible
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.categoryVisibilityChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.visible
        ]
      ], 
      _
    ],
    useCapture: scala.Boolean
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
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.lineStyleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.lineStyleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
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
        atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.ellipse | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerShapeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.ellipse | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
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
          atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
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
          atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
        ]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.symbolTypeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.image | atOracleOraclejetLib.atOracleOraclejetLibStrings.marker
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.symbolTypeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.image | atOracleOraclejetLib.atOracleOraclejetLibStrings.marker
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
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.MouseEvent, _],
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
  def addEventListener_lineWidthChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWidthChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lineWidthChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWidthChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
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
  def addEventListener_markerColorChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerColorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerColorChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerColorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSvgClassNameChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSvgClassNameChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSvgClassNameChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSvgClassNameChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSvgStyleChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSvgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSvgStyleChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSvgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]], 
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
  def addEventListener_textChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.textChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.textChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
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
  def getProperty(property: java.lang.String): js.Any = js.native
  @JSName("getProperty")
  def getProperty_borderColor(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderColor): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_categories(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.categories): js.UndefOr[js.Array[java.lang.String]] = js.native
  @JSName("getProperty")
  def getProperty_categoryVisibility(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.categoryVisibility): js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.visible
  ] = js.native
  @JSName("getProperty")
  def getProperty_color(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.color): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_drilling(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.drilling): js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
  ] = js.native
  @JSName("getProperty")
  def getProperty_lineStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.lineStyle): js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
  ] = js.native
  @JSName("getProperty")
  def getProperty_lineWidth(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWidth): js.UndefOr[scala.Double] = js.native
  @JSName("getProperty")
  def getProperty_markerColor(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerColor): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_markerShape(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerShape): atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.ellipse | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_markerSvgClassName(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSvgClassName): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_markerSvgStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSvgStyle): js.UndefOr[js.Object] = js.native
  @JSName("getProperty")
  def getProperty_pattern(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.pattern): js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ] = js.native
  @JSName("getProperty")
  def getProperty_shortDesc(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_source(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.source): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassName): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyle): js.UndefOr[js.Object] = js.native
  @JSName("getProperty")
  def getProperty_symbolType(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.symbolType): js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.image | atOracleOraclejetLib.atOracleOraclejetLibStrings.marker
  ] = js.native
  @JSName("getProperty")
  def getProperty_text(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.text): java.lang.String = js.native
  def setProperties(properties: ojLegendItemSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.categoryVisibility,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.categoryVisibility,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.visible
  ): scala.Unit = js.native
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
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.lineStyle,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.lineStyle,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.lineStyle,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerShape,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.ellipse | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.pattern,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.symbolType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.image
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.symbolType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.line
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.symbolType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithMarker
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.symbolType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.marker
  ): scala.Unit = js.native
  def setProperty[T /* <: java.lang.String */](
    property: T,
    value: atOracleOraclejetLib.atOracleOraclejetMod.JetSetPropertyType[T, ojLegendItemSettableProperties]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_borderColor(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderColor, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_categories(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.categories,
    value: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.color, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_lineWidth(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWidth, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_markerColor(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerColor, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_markerSvgClassName(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSvgClassName,
    value: java.lang.String
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_markerSvgStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSvgStyle, value: js.Object): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_shortDesc(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_source(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.source, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassName, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyle, value: js.Object): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_text(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.text, value: java.lang.String): scala.Unit = js.native
}

