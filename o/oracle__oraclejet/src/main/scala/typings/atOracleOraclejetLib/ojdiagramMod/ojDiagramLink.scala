package typings
package atOracleOraclejetLib.ojdiagramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDiagramLink
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetElement[ojDiagramLinkSettableProperties] {
  var categories: js.Array[java.lang.String] = js.native
  var color: js.UndefOr[java.lang.String] = js.native
  var endConnectorType: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded
  ] = js.native
  var endNode: js.Any = js.native
  var label: js.UndefOr[java.lang.String] = js.native
  var labelStyle: js.UndefOr[js.Object | scala.Null] = js.native
  var onCategoriesChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onColorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onEndConnectorTypeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onEndNodeChanged: (js.Function1[/* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_], _]) | scala.Null = js.native
  var onLabelChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onLabelStyleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object | scala.Null]], 
    _
  ]) | scala.Null = js.native
  var onSelectableChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onShortDescChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onStartConnectorTypeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      js.UndefOr[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded
      ]
    ], 
    _
  ]) | scala.Null = js.native
  var onStartNodeChanged: (js.Function1[/* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_], _]) | scala.Null = js.native
  var onSvgClassNameChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
    _
  ]) | scala.Null = js.native
  var onSvgStyleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object]], 
    _
  ]) | scala.Null = js.native
  var onWidthChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
    _
  ]) | scala.Null = js.native
  var selectable: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ] = js.native
  var shortDesc: js.UndefOr[java.lang.String] = js.native
  var startConnectorType: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded
  ] = js.native
  var startNode: js.Any = js.native
  var svgClassName: js.UndefOr[java.lang.String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var width: js.UndefOr[scala.Double] = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.endConnectorTypeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.endConnectorTypeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded
        ]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectableChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectableChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
        ]
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.startConnectorTypeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded
        ]
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.startConnectorTypeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        js.UndefOr[
          atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded
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
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_categoriesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.categoriesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[java.lang.String]], 
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
  def addEventListener_endNodeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.endNodeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endNodeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.endNodeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_], 
      _
    ],
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
  def addEventListener_labelChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[java.lang.String]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelStyleChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelStyleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object | scala.Null]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelStyleChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelStyleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[js.Object | scala.Null]], 
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
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.UIEvent, _],
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
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.select,
    listener: js.ThisFunction1[/* this */ stdLib.HTMLElement, /* ev */ stdLib.UIEvent, _],
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
  def addEventListener_startNodeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.startNodeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startNodeChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.startNodeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_], 
      _
    ],
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
  @JSName("addEventListener")
  def addEventListener_widthChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.widthChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_widthChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.widthChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[scala.Double]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getProperty(property: java.lang.String): js.Any = js.native
  @JSName("getProperty")
  def getProperty_categories(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.categories): js.Array[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_color(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.color): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_endConnectorType(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.endConnectorType): js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded
  ] = js.native
  @JSName("getProperty")
  def getProperty_endNode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.endNode): js.Any = js.native
  @JSName("getProperty")
  def getProperty_label(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.label): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_labelStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelStyle): js.UndefOr[js.Object | scala.Null] = js.native
  @JSName("getProperty")
  def getProperty_selectable(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectable): js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ] = js.native
  @JSName("getProperty")
  def getProperty_shortDesc(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_startConnectorType(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.startConnectorType): js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded
  ] = js.native
  @JSName("getProperty")
  def getProperty_startNode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.startNode): js.Any = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassName): js.UndefOr[java.lang.String] = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyle): js.UndefOr[js.Object] = js.native
  @JSName("getProperty")
  def getProperty_width(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.width): js.UndefOr[scala.Double] = js.native
  def setProperties(properties: ojDiagramLinkSettablePropertiesLenient): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.endConnectorType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.endConnectorType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.endConnectorType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.endConnectorType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.endConnectorType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.endConnectorType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.endConnectorType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectable,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectable,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.startConnectorType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.startConnectorType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.startConnectorType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.startConnectorType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.startConnectorType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.startConnectorType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.startConnectorType,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded
  ): scala.Unit = js.native
  def setProperty[T /* <: java.lang.String */](
    property: T,
    value: atOracleOraclejetLib.atOracleOraclejetMod.JetSetPropertyType[T, ojDiagramLinkSettableProperties]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_categories(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.categories,
    value: js.Array[java.lang.String]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.color, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_endNode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.endNode, value: js.Any): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_label(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.label, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelStyle): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_labelStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.labelStyle, value: js.Object): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_shortDesc(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_startNode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.startNode, value: js.Any): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassName, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyle, value: js.Object): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_width(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.width, value: scala.Double): scala.Unit = js.native
}

