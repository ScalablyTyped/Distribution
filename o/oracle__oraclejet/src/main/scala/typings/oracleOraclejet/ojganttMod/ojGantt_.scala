package typings.oracleOraclejet.ojganttMod

import typings.oracleOraclejet.AnonAccessibleDependencyInfo
import typings.oracleOraclejet.AnonAutoBaseline
import typings.oracleOraclejet.AnonAutoHidden
import typings.oracleOraclejet.AnonBaselineDate
import typings.oracleOraclejet.AnonContextRendererAnonInsertAnonPreventDefault
import typings.oracleOraclejet.AnonConverter
import typings.oracleOraclejet.AnonHeightNumber
import typings.oracleOraclejet.AnonIndex
import typings.oracleOraclejet.AnonIndexOjgantttaskbar
import typings.oracleOraclejet.AnonLabel
import typings.oracleOraclejet.AnonMove
import typings.oracleOraclejet.AnonOffsetY
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojganttMod.ojGantt.ReferenceObject
import typings.oracleOraclejet.ojganttMod.ojGantt.ojMove
import typings.oracleOraclejet.ojganttMod.ojGantt.ojViewportChange
import typings.oracleOraclejet.ojtimeBaseMod.dvtTimeComponent
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typings.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.as
import typings.oracleOraclejet.oracleOraclejetStrings.asChanged
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.axisPosition
import typings.oracleOraclejet.oracleOraclejetStrings.axisPositionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.dependencyData
import typings.oracleOraclejet.oracleOraclejetStrings.dependencyDataChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dnd
import typings.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.endChanged
import typings.oracleOraclejet.oracleOraclejetStrings.gridlines
import typings.oracleOraclejet.oracleOraclejetStrings.gridlinesChanged
import typings.oracleOraclejet.oracleOraclejetStrings.majorAxis
import typings.oracleOraclejet.oracleOraclejetStrings.majorAxisChanged
import typings.oracleOraclejet.oracleOraclejetStrings.minorAxis
import typings.oracleOraclejet.oracleOraclejetStrings.minorAxisChanged
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.referenceObjects
import typings.oracleOraclejet.oracleOraclejetStrings.referenceObjectsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.rowAxis
import typings.oracleOraclejet.oracleOraclejetStrings.rowAxisChanged
import typings.oracleOraclejet.oracleOraclejetStrings.rowDefaults
import typings.oracleOraclejet.oracleOraclejetStrings.rowDefaultsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.scrollPosition
import typings.oracleOraclejet.oracleOraclejetStrings.scrollPositionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selection
import typings.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typings.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.startChanged
import typings.oracleOraclejet.oracleOraclejetStrings.taskData
import typings.oracleOraclejet.oracleOraclejetStrings.taskDataChanged
import typings.oracleOraclejet.oracleOraclejetStrings.taskDefaults
import typings.oracleOraclejet.oracleOraclejetStrings.taskDefaultsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.tooltip
import typings.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.valueFormats
import typings.oracleOraclejet.oracleOraclejetStrings.valueFormatsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.viewportEnd
import typings.oracleOraclejet.oracleOraclejetStrings.viewportEndChanged
import typings.oracleOraclejet.oracleOraclejetStrings.viewportStart
import typings.oracleOraclejet.oracleOraclejetStrings.viewportStartChanged
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojGantt_[K1, K2, D1, D2] extends dvtTimeComponent[ojGanttSettableProperties[K1, K2, D1, D2]] {
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var as: String = js.native
  var axisPosition: bottom | top = js.native
  var dependencyData: js.UndefOr[DataProvider[K1, D1]] = js.native
  var dnd: AnonMove = js.native
  var end: String = js.native
  var gridlines: AnonAutoHidden = js.native
  var majorAxis: AnonConverter = js.native
  var minorAxis: AnonConverter = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | none], _]) | Null = js.native
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onAxisPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[bottom | top], _]) | Null = js.native
  var onDependencyDataChanged: (js.Function1[/* event */ JetElementCustomEvent[js.UndefOr[DataProvider[K1, D1]]], _]) | Null = js.native
  var onDndChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonMove], _]) | Null = js.native
  var onEndChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onGridlinesChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonAutoHidden], _]) | Null = js.native
  var onMajorAxisChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonConverter], _]) | Null = js.native
  var onMinorAxisChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonConverter], _]) | Null = js.native
  var onOjMove: (js.Function1[/* event */ ojMove[K2, D2], _]) | Null = js.native
  var onOjViewportChange: (js.Function1[/* event */ ojViewportChange, _]) | Null = js.native
  var onReferenceObjectsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[ReferenceObject]], _]) | Null = js.native
  var onRowAxisChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonLabel[K2, D2]], _]) | Null = js.native
  var onRowDefaultsChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonHeightNumber], _]) | Null = js.native
  var onScrollPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonOffsetY], _]) | Null = js.native
  var onSelectionChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[K2]], _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[/* event */ JetElementCustomEvent[single | multiple | none], _]) | Null = js.native
  var onStartChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onTaskDataChanged: (js.Function1[/* event */ JetElementCustomEvent[js.UndefOr[DataProvider[K2, D2]]], _]) | Null = js.native
  var onTaskDefaultsChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonAutoBaseline], _]) | Null = js.native
  var onTooltipChanged: (js.Function1[
    /* event */ JetElementCustomEvent[AnonContextRendererAnonInsertAnonPreventDefault[K2, D2]], 
    _
  ]) | Null = js.native
  var onValueFormatsChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonBaselineDate], _]) | Null = js.native
  var onViewportEndChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var onViewportStartChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  var referenceObjects: js.Array[ReferenceObject] = js.native
  var rowAxis: AnonLabel[K2, D2] = js.native
  var rowDefaults: AnonHeightNumber = js.native
  var scrollPosition: AnonOffsetY = js.native
  var selection: js.Array[K2] = js.native
  var selectionMode: single | multiple | none = js.native
  var start: String = js.native
  var taskData: js.UndefOr[DataProvider[K2, D2]] = js.native
  var taskDefaults: AnonAutoBaseline = js.native
  var tooltip: AnonContextRendererAnonInsertAnonPreventDefault[K2, D2] = js.native
  @JSName("translations")
  var translations_ojGantt_ : AnonAccessibleDependencyInfo = js.native
  var valueFormats: AnonBaselineDate = js.native
  var viewportEnd: String = js.native
  var viewportStart: String = js.native
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
    `type`: axisPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[bottom | top], _]
  ): Unit = js.native
  def addEventListener(
    `type`: axisPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[bottom | top], _],
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
  def addEventListener_dependencyDataChanged(
    `type`: dependencyDataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[DataProvider[K1, D1]]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dependencyDataChanged(
    `type`: dependencyDataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[DataProvider[K1, D1]]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonMove], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonMove], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(
    `type`: endChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(
    `type`: endChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: gridlinesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAutoHidden], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: gridlinesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAutoHidden], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_majorAxisChanged(
    `type`: majorAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonConverter], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_majorAxisChanged(
    `type`: majorAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonConverter], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minorAxisChanged(
    `type`: minorAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonConverter], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minorAxisChanged(
    `type`: minorAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonConverter], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojMove(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojMove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojMove[K2, D2], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojMove(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojMove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojMove[K2, D2], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojViewportChange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojViewportChange, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: typings.oracleOraclejet.oracleOraclejetStrings.ojViewportChange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ojViewportChange, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: referenceObjectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[ReferenceObject]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: referenceObjectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[ReferenceObject]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowAxisChanged(
    `type`: rowAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonLabel[K2, D2]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowAxisChanged(
    `type`: rowAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonLabel[K2, D2]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowDefaultsChanged(
    `type`: rowDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonHeightNumber], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowDefaultsChanged(
    `type`: rowDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonHeightNumber], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonOffsetY], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonOffsetY], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[K2]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[K2]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(
    `type`: startChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(
    `type`: startChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDataChanged(
    `type`: taskDataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[DataProvider[K2, D2]]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDataChanged(
    `type`: taskDataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[DataProvider[K2, D2]]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDefaultsChanged(
    `type`: taskDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAutoBaseline], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDefaultsChanged(
    `type`: taskDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonAutoBaseline], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[AnonContextRendererAnonInsertAnonPreventDefault[K2, D2]], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[AnonContextRendererAnonInsertAnonPreventDefault[K2, D2]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonBaselineDate], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonBaselineDate], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportEndChanged(
    `type`: viewportEndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportEndChanged(
    `type`: viewportEndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportStartChanged(
    `type`: viewportStartChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportStartChanged(
    `type`: viewportStartChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): AnonIndex | AnonIndexOjgantttaskbar | Null = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_axisPosition(property: axisPosition): bottom | top = js.native
  @JSName("getProperty")
  def getProperty_dependencyData(property: dependencyData): js.UndefOr[DataProvider[K1, D1]] = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): AnonMove = js.native
  @JSName("getProperty")
  def getProperty_end(property: end): String = js.native
  @JSName("getProperty")
  def getProperty_gridlines(property: gridlines): AnonAutoHidden = js.native
  @JSName("getProperty")
  def getProperty_majorAxis(property: majorAxis): AnonConverter = js.native
  @JSName("getProperty")
  def getProperty_minorAxis(property: minorAxis): AnonConverter = js.native
  @JSName("getProperty")
  def getProperty_referenceObjects(property: referenceObjects): js.Array[ReferenceObject] = js.native
  @JSName("getProperty")
  def getProperty_rowAxis(property: rowAxis): AnonLabel[K2, D2] = js.native
  @JSName("getProperty")
  def getProperty_rowDefaults(property: rowDefaults): AnonHeightNumber = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): AnonOffsetY = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K2] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_start(property: start): String = js.native
  @JSName("getProperty")
  def getProperty_taskData(property: taskData): js.UndefOr[DataProvider[K2, D2]] = js.native
  @JSName("getProperty")
  def getProperty_taskDefaults(property: taskDefaults): AnonAutoBaseline = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): AnonContextRendererAnonInsertAnonPreventDefault[K2, D2] = js.native
  @JSName("getProperty")
  def getProperty_valueFormats(property: valueFormats): AnonBaselineDate = js.native
  @JSName("getProperty")
  def getProperty_viewportEnd(property: viewportEnd): String = js.native
  @JSName("getProperty")
  def getProperty_viewportStart(property: viewportStart): String = js.native
  def setProperties(properties: ojGanttSettablePropertiesLenient[K1, K2, D1, D2]): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: axisPosition, value: bottom): Unit = js.native
  def setProperty(property: axisPosition, value: top): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_dependencyData(property: dependencyData, value: DataProvider[K1, D1]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: AnonMove): Unit = js.native
  @JSName("setProperty")
  def setProperty_end(property: end, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_gridlines(property: gridlines, value: AnonAutoHidden): Unit = js.native
  @JSName("setProperty")
  def setProperty_majorAxis(property: majorAxis, value: AnonConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_minorAxis(property: minorAxis, value: AnonConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_referenceObjects(property: referenceObjects, value: js.Array[ReferenceObject]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowAxis(property: rowAxis, value: AnonLabel[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowDefaults(property: rowDefaults, value: AnonHeightNumber): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: AnonOffsetY): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_start(property: start, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_taskData(property: taskData, value: DataProvider[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_taskDefaults(property: taskDefaults, value: AnonAutoBaseline): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: AnonContextRendererAnonInsertAnonPreventDefault[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonAccessibleDependencyInfo): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueFormats(property: valueFormats, value: AnonBaselineDate): Unit = js.native
  @JSName("setProperty")
  def setProperty_viewportEnd(property: viewportEnd, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_viewportStart(property: viewportStart, value: String): Unit = js.native
}

