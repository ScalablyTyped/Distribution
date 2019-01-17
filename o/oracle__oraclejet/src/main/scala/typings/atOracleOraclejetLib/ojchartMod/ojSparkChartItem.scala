package typings
package atOracleOraclejetLib.ojchartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSparkChartItem
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetElement[ojSparkChartItemSettableProperties] {
  var borderColor: java.lang.String = js.native
  var color: java.lang.String = js.native
  var date: java.lang.String = js.native
  var high: scala.Double | scala.Null = js.native
  var low: scala.Double | scala.Null = js.native
  var markerDisplayed: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on = js.native
  var markerShape: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
  ] = js.native
  var markerSize: scala.Double = js.native
  var onBorderColorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['borderColor'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onColorChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['color'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onDateChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['date'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onHighChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['high'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onLowChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['low'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onMarkerDisplayedChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['markerDisplayed'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onMarkerShapeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['markerShape'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onMarkerSizeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['markerSize'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onSvgClassNameChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['svgClassName'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onSvgStyleChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['svgStyle'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var onValueChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      /* import warning: ImportType.apply Failed type conversion: this['value'] */ js.Any
    ], 
    _
  ]) | scala.Null = js.native
  var svgClassName: java.lang.String = js.native
  var svgStyle: js.Object = js.native
  var value: scala.Double | scala.Null = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderColorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['borderColor'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderColorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['borderColor'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.colorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['color'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.colorChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['color'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dateChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['date'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dateChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['date'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['high'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.highChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['high'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.lowChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['low'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.lowChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['low'] */ js.Any
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
        /* import warning: ImportType.apply Failed type conversion: this['markerDisplayed'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerDisplayedChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['markerDisplayed'] */ js.Any
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
        /* import warning: ImportType.apply Failed type conversion: this['markerShape'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerShapeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['markerShape'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSizeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['markerSize'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSizeChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['markerSize'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassNameChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['svgClassName'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassNameChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['svgClassName'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['svgStyle'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['svgStyle'] */ js.Any
      ], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['value'] */ js.Any
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        /* import warning: ImportType.apply Failed type conversion: this['value'] */ js.Any
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
  def getProperty_borderColor(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderColor): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_color(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.color): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_date(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.date): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_high(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.high): scala.Double | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_low(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.low): scala.Double | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_markerDisplayed(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerDisplayed): atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on = js.native
  @JSName("getProperty")
  def getProperty_markerShape(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerShape): js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
  ] = js.native
  @JSName("getProperty")
  def getProperty_markerSize(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSize): scala.Double = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassName): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyle): js.Any = js.native
  @JSName("getProperty")
  def getProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value): scala.Double | scala.Null = js.native
  def setProperties(properties: ojSparkChartItemSettablePropertiesLenient): scala.Unit = js.native
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
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
  ): scala.Unit = js.native
  def setProperty[T /* <: java.lang.String */](
    property: T,
    value: atOracleOraclejetLib.atOracleOraclejetMod.JetSetPropertyType[T, ojSparkChartItemSettableProperties]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_borderColor(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.borderColor, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.color, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_date(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.date, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_high(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.high): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_high(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.high, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_low(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.low): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_low(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.low, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_markerSize(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.markerSize, value: scala.Double): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgClassName, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.svgStyle, value: js.Object): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value, value: scala.Double): scala.Unit = js.native
}

