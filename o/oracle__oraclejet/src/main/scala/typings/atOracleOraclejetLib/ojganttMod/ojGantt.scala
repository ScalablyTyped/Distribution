package typings
package atOracleOraclejetLib.ojganttMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojGantt[K1, K2, D1, D2]
  extends atOracleOraclejetLib.ojtimeDashBaseMod.dvtTimeComponent[ojGanttSettableProperties[K1, K2, D1, D2]] {
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var as: java.lang.String = js.native
  var axisPosition: atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top = js.native
  var dependencyData: js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]] = js.native
  var dnd: atOracleOraclejetLib.Anon_Move = js.native
  var end: java.lang.String = js.native
  var gridlines: atOracleOraclejetLib.Anon_AutoHidden = js.native
  var majorAxis: atOracleOraclejetLib.Anon_Converter = js.native
  var minorAxis: atOracleOraclejetLib.Anon_Converter = js.native
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
  var onAxisPositionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top
    ], 
    _
  ]) | scala.Null = js.native
  var onDependencyDataChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]]], 
    _
  ]) | scala.Null = js.native
  var onDndChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Move], 
    _
  ]) | scala.Null = js.native
  var onEndChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onGridlinesChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoHidden], 
    _
  ]) | scala.Null = js.native
  var onMajorAxisChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Converter], 
    _
  ]) | scala.Null = js.native
  var onMinorAxisChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Converter], 
    _
  ]) | scala.Null = js.native
  var onOjMove: (js.Function1[/* event */ atOracleOraclejetLib.ojganttMod.ojGanttNs.ojMove[K2, D2], _]) | scala.Null = js.native
  var onOjViewportChange: (js.Function1[/* event */ atOracleOraclejetLib.ojganttMod.ojGanttNs.ojViewportChange, _]) | scala.Null = js.native
  var onReferenceObjectsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojganttMod.ojGanttNs.ReferenceObject]], 
    _
  ]) | scala.Null = js.native
  var onRowAxisChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Label[K2, D2]], 
    _
  ]) | scala.Null = js.native
  var onRowDefaultsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_HeightNumber], 
    _
  ]) | scala.Null = js.native
  var onScrollPositionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_OffsetY], 
    _
  ]) | scala.Null = js.native
  var onSelectionChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K2]], 
    _
  ]) | scala.Null = js.native
  var onSelectionModeChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
      atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
    ], 
    _
  ]) | scala.Null = js.native
  var onStartChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onTaskDataChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]]], 
    _
  ]) | scala.Null = js.native
  var onTaskDefaultsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoBaseline], 
    _
  ]) | scala.Null = js.native
  var onTooltipChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2]], 
    _
  ]) | scala.Null = js.native
  var onValueFormatsChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BaselineDate], 
    _
  ]) | scala.Null = js.native
  var onViewportEndChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var onViewportStartChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
    _
  ]) | scala.Null = js.native
  var referenceObjects: js.Array[atOracleOraclejetLib.ojganttMod.ojGanttNs.ReferenceObject] = js.native
  var rowAxis: atOracleOraclejetLib.Anon_Label[K2, D2] = js.native
  var rowDefaults: atOracleOraclejetLib.Anon_HeightNumber = js.native
  var scrollPosition: atOracleOraclejetLib.Anon_OffsetY = js.native
  var selection: js.Array[K2] = js.native
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  var start: java.lang.String = js.native
  var taskData: js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]] = js.native
  var taskDefaults: atOracleOraclejetLib.Anon_AutoBaseline = js.native
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2] = js.native
  @JSName("translations")
  var translations_ojGantt: atOracleOraclejetLib.Anon_AccessibleDependencyInfo = js.native
  var valueFormats: atOracleOraclejetLib.Anon_BaselineDate = js.native
  var viewportEnd: java.lang.String = js.native
  var viewportStart: java.lang.String = js.native
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
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.axisPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top
      ], 
      _
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.axisPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
        atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top
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
  def addEventListener_dependencyDataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dependencyDataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dependencyDataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dependencyDataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dndChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Move], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dndChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Move], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.endChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.endChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.gridlinesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoHidden], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.gridlinesChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoHidden], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_majorAxisChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.majorAxisChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Converter], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_majorAxisChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.majorAxisChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Converter], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minorAxisChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minorAxisChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Converter], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minorAxisChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.minorAxisChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Converter], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojMove(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojMove,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojganttMod.ojGanttNs.ojMove[K2, D2], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojMove(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojMove,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojganttMod.ojGanttNs.ojMove[K2, D2], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojViewportChange,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojganttMod.ojGanttNs.ojViewportChange, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.ojViewportChange,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.ojganttMod.ojGanttNs.ojViewportChange, 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.referenceObjectsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojganttMod.ojGanttNs.ReferenceObject]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.referenceObjectsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojganttMod.ojGanttNs.ReferenceObject]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowAxisChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rowAxisChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Label[K2, D2]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowAxisChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rowAxisChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Label[K2, D2]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowDefaultsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rowDefaultsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_HeightNumber], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowDefaultsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.rowDefaultsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_HeightNumber], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_OffsetY], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPositionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_OffsetY], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K2]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[K2]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.startChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.startChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.taskDataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDataChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.taskDataChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDefaultsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.taskDefaultsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoBaseline], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDefaultsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.taskDefaultsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AutoBaseline], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2]], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2]], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueFormatsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BaselineDate], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueFormatsChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_BaselineDate], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportEndChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.viewportEndChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportEndChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.viewportEndChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportStartChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.viewportStartChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportStartChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.viewportStartChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getContextByNode(node: stdLib.Element): atOracleOraclejetLib.Anon_Index | atOracleOraclejetLib.Anon_IndexOjgantttaskbar | scala.Null = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDataChange): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.animationOnDisplay): atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_axisPosition(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.axisPosition): atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top = js.native
  @JSName("getProperty")
  def getProperty_dependencyData(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dependencyData): js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]] = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dnd): atOracleOraclejetLib.Anon_Move = js.native
  @JSName("getProperty")
  def getProperty_end(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.end): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_gridlines(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.gridlines): atOracleOraclejetLib.Anon_AutoHidden = js.native
  @JSName("getProperty")
  def getProperty_majorAxis(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.majorAxis): atOracleOraclejetLib.Anon_Converter = js.native
  @JSName("getProperty")
  def getProperty_minorAxis(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.minorAxis): atOracleOraclejetLib.Anon_Converter = js.native
  @JSName("getProperty")
  def getProperty_referenceObjects(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.referenceObjects): js.Array[atOracleOraclejetLib.ojganttMod.ojGanttNs.ReferenceObject] = js.native
  @JSName("getProperty")
  def getProperty_rowAxis(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rowAxis): atOracleOraclejetLib.Anon_Label[K2, D2] = js.native
  @JSName("getProperty")
  def getProperty_rowDefaults(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rowDefaults): atOracleOraclejetLib.Anon_HeightNumber = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPosition): atOracleOraclejetLib.Anon_OffsetY = js.native
  @JSName("getProperty")
  def getProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection): js.Array[K2] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selectionMode): atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = js.native
  @JSName("getProperty")
  def getProperty_start(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.start): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_taskData(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.taskData): js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]] = js.native
  @JSName("getProperty")
  def getProperty_taskDefaults(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.taskDefaults): atOracleOraclejetLib.Anon_AutoBaseline = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltip): atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2] = js.native
  @JSName("getProperty")
  def getProperty_valueFormats(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueFormats): atOracleOraclejetLib.Anon_BaselineDate = js.native
  @JSName("getProperty")
  def getProperty_viewportEnd(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.viewportEnd): java.lang.String = js.native
  @JSName("getProperty")
  def getProperty_viewportStart(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.viewportStart): java.lang.String = js.native
  def setProperties(properties: ojGanttSettablePropertiesLenient[K1, K2, D1, D2]): scala.Unit = js.native
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
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.axisPosition,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom
  ): scala.Unit = js.native
  def setProperty(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.axisPosition,
    value: atOracleOraclejetLib.atOracleOraclejetLibStrings.top
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
  @JSName("setProperty")
  def setProperty_as(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.as, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_dependencyData(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dependencyData,
    value: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.dnd,
    value: atOracleOraclejetLib.Anon_Move
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_end(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.end, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_gridlines(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.gridlines,
    value: atOracleOraclejetLib.Anon_AutoHidden
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_majorAxis(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.majorAxis,
    value: atOracleOraclejetLib.Anon_Converter
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_minorAxis(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.minorAxis,
    value: atOracleOraclejetLib.Anon_Converter
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_referenceObjects(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.referenceObjects,
    value: js.Array[atOracleOraclejetLib.ojganttMod.ojGanttNs.ReferenceObject]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rowAxis(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rowAxis,
    value: atOracleOraclejetLib.Anon_Label[K2, D2]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rowDefaults(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rowDefaults,
    value: atOracleOraclejetLib.Anon_HeightNumber
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.scrollPosition,
    value: atOracleOraclejetLib.Anon_OffsetY
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.selection, value: js.Array[K2]): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_start(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.start, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_taskData(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.taskData,
    value: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_taskDefaults(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.taskDefaults,
    value: atOracleOraclejetLib.Anon_AutoBaseline
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.tooltip,
    value: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2]
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_AccessibleDependencyInfo
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_valueFormats(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.valueFormats,
    value: atOracleOraclejetLib.Anon_BaselineDate
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_viewportEnd(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.viewportEnd, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_viewportStart(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.viewportStart, value: java.lang.String): scala.Unit = js.native
}

