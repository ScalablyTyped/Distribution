package typings.oracleOraclejet.ojganttMod

import typings.oracleOraclejet.anon.Baseline
import typings.oracleOraclejet.anon.BaselineDate
import typings.oracleOraclejet.anon.MaxWidth
import typings.oracleOraclejet.anon.Move
import typings.oracleOraclejet.anon.OffsetY
import typings.oracleOraclejet.anon.Scale
import typings.oracleOraclejet.anon.Vertical
import typings.oracleOraclejet.anon.`8`
import typings.oracleOraclejet.anon.`9`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typings.oracleOraclejet.ojganttMod.ojGantt.ReferenceObject
import typings.oracleOraclejet.ojganttMod.ojGantt.ojMove
import typings.oracleOraclejet.ojganttMod.ojGantt.ojViewportChange
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojGanttEventMap[K1, K2, D1, D2]
  extends StObject
     with dvtBaseComponentEventMap[ojGanttSettableProperties[K1, K2, D1, D2]] {
  
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none]
  
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none]
  
  var asChanged: JetElementCustomEvent[String]
  
  var axisPositionChanged: JetElementCustomEvent[bottom | top]
  
  var dependencyDataChanged: JetElementCustomEvent[js.UndefOr[DataProvider[K1, D1]]]
  
  var dndChanged: JetElementCustomEvent[Move]
  
  var endChanged: JetElementCustomEvent[String]
  
  var gridlinesChanged: JetElementCustomEvent[Vertical]
  
  var majorAxisChanged: JetElementCustomEvent[Scale]
  
  var minorAxisChanged: JetElementCustomEvent[Scale]
  
  var ojMove: typings.oracleOraclejet.ojganttMod.ojGantt.ojMove[K2, D2]
  
  var ojViewportChange: typings.oracleOraclejet.ojganttMod.ojGantt.ojViewportChange
  
  var referenceObjectsChanged: JetElementCustomEvent[js.Array[ReferenceObject]]
  
  var rowAxisChanged: JetElementCustomEvent[MaxWidth[K2, D2]]
  
  var rowDefaultsChanged: JetElementCustomEvent[`8`]
  
  var scrollPositionChanged: JetElementCustomEvent[OffsetY]
  
  var selectionChanged: JetElementCustomEvent[js.Array[K2]]
  
  var selectionModeChanged: JetElementCustomEvent[single | multiple | none]
  
  var startChanged: JetElementCustomEvent[String]
  
  var taskDataChanged: JetElementCustomEvent[js.UndefOr[DataProvider[K2, D2]]]
  
  var taskDefaultsChanged: JetElementCustomEvent[Baseline]
  
  var tooltipChanged: JetElementCustomEvent[`9`[K2, D2]]
  
  var valueFormatsChanged: JetElementCustomEvent[BaselineDate]
  
  var viewportEndChanged: JetElementCustomEvent[String]
  
  var viewportStartChanged: JetElementCustomEvent[String]
}
object ojGanttEventMap {
  
  inline def apply[K1, K2, D1, D2](
    abort: UIEvent,
    animationOnDataChangeChanged: JetElementCustomEvent[auto | none],
    animationOnDisplayChanged: JetElementCustomEvent[auto | none],
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asChanged: JetElementCustomEvent[String],
    auxclick: MouseEvent,
    axisPositionChanged: JetElementCustomEvent[bottom | top],
    beforeinput: InputEvent,
    blur: FocusEvent,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    compositionend: CompositionEvent,
    compositionstart: CompositionEvent,
    compositionupdate: CompositionEvent,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    dependencyDataChanged: JetElementCustomEvent[js.UndefOr[DataProvider[K1, D1]]],
    dndChanged: JetElementCustomEvent[Move],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    endChanged: JetElementCustomEvent[String],
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    formdata: FormDataEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    gridlinesChanged: JetElementCustomEvent[Vertical],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    majorAxisChanged: JetElementCustomEvent[Scale],
    minorAxisChanged: JetElementCustomEvent[Scale],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojMove: ojMove[K2, D2],
    ojViewportChange: ojViewportChange,
    paste: ClipboardEvent,
    pause: Event,
    play: Event,
    playing: Event,
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    progress: ProgressEvent[EventTarget],
    ratechange: Event,
    referenceObjectsChanged: JetElementCustomEvent[js.Array[ReferenceObject]],
    reset: Event,
    resize: UIEvent,
    rowAxisChanged: JetElementCustomEvent[MaxWidth[K2, D2]],
    rowDefaultsChanged: JetElementCustomEvent[`8`],
    scroll: Event,
    scrollPositionChanged: JetElementCustomEvent[OffsetY],
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[js.Array[K2]],
    selectionModeChanged: JetElementCustomEvent[single | multiple | none],
    selectionchange: Event,
    selectstart: Event,
    slotchange: Event,
    stalled: Event,
    startChanged: JetElementCustomEvent[String],
    submit: SubmitEvent,
    suspend: Event,
    taskDataChanged: JetElementCustomEvent[js.UndefOr[DataProvider[K2, D2]]],
    taskDefaultsChanged: JetElementCustomEvent[Baseline],
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[`9`[K2, D2]],
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    trackResizeChanged: JetElementCustomEvent[on | off],
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    translationsChanged: JetElementCustomEvent[js.Object | Null],
    valueFormatsChanged: JetElementCustomEvent[BaselineDate],
    viewportEndChanged: JetElementCustomEvent[String],
    viewportStartChanged: JetElementCustomEvent[String],
    volumechange: Event,
    waiting: Event,
    webkitanimationend: Event,
    webkitanimationiteration: Event,
    webkitanimationstart: Event,
    webkittransitionend: Event,
    wheel: WheelEvent
  ): ojGanttEventMap[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], axisPositionChanged = axisPositionChanged.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dependencyDataChanged = dependencyDataChanged.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], endChanged = endChanged.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], gridlinesChanged = gridlinesChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], majorAxisChanged = majorAxisChanged.asInstanceOf[js.Any], minorAxisChanged = minorAxisChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojMove = ojMove.asInstanceOf[js.Any], ojViewportChange = ojViewportChange.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], referenceObjectsChanged = referenceObjectsChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowAxisChanged = rowAxisChanged.asInstanceOf[js.Any], rowDefaultsChanged = rowDefaultsChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollPositionChanged = scrollPositionChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], startChanged = startChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], taskDataChanged = taskDataChanged.asInstanceOf[js.Any], taskDefaultsChanged = taskDefaultsChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], valueFormatsChanged = valueFormatsChanged.asInstanceOf[js.Any], viewportEndChanged = viewportEndChanged.asInstanceOf[js.Any], viewportStartChanged = viewportStartChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttEventMap[K1, K2, D1, D2]]
  }
  
  extension [Self <: ojGanttEventMap[?, ?, ?, ?], K1, K2, D1, D2](x: Self & (ojGanttEventMap[K1, K2, D1, D2])) {
    
    inline def setAnimationOnDataChangeChanged(value: JetElementCustomEvent[auto | none]): Self = StObject.set(x, "animationOnDataChangeChanged", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplayChanged(value: JetElementCustomEvent[auto | none]): Self = StObject.set(x, "animationOnDisplayChanged", value.asInstanceOf[js.Any])
    
    inline def setAsChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "asChanged", value.asInstanceOf[js.Any])
    
    inline def setAxisPositionChanged(value: JetElementCustomEvent[bottom | top]): Self = StObject.set(x, "axisPositionChanged", value.asInstanceOf[js.Any])
    
    inline def setDependencyDataChanged(value: JetElementCustomEvent[js.UndefOr[DataProvider[K1, D1]]]): Self = StObject.set(x, "dependencyDataChanged", value.asInstanceOf[js.Any])
    
    inline def setDndChanged(value: JetElementCustomEvent[Move]): Self = StObject.set(x, "dndChanged", value.asInstanceOf[js.Any])
    
    inline def setEndChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "endChanged", value.asInstanceOf[js.Any])
    
    inline def setGridlinesChanged(value: JetElementCustomEvent[Vertical]): Self = StObject.set(x, "gridlinesChanged", value.asInstanceOf[js.Any])
    
    inline def setMajorAxisChanged(value: JetElementCustomEvent[Scale]): Self = StObject.set(x, "majorAxisChanged", value.asInstanceOf[js.Any])
    
    inline def setMinorAxisChanged(value: JetElementCustomEvent[Scale]): Self = StObject.set(x, "minorAxisChanged", value.asInstanceOf[js.Any])
    
    inline def setOjMove(value: ojMove[K2, D2]): Self = StObject.set(x, "ojMove", value.asInstanceOf[js.Any])
    
    inline def setOjViewportChange(value: ojViewportChange): Self = StObject.set(x, "ojViewportChange", value.asInstanceOf[js.Any])
    
    inline def setReferenceObjectsChanged(value: JetElementCustomEvent[js.Array[ReferenceObject]]): Self = StObject.set(x, "referenceObjectsChanged", value.asInstanceOf[js.Any])
    
    inline def setRowAxisChanged(value: JetElementCustomEvent[MaxWidth[K2, D2]]): Self = StObject.set(x, "rowAxisChanged", value.asInstanceOf[js.Any])
    
    inline def setRowDefaultsChanged(value: JetElementCustomEvent[`8`]): Self = StObject.set(x, "rowDefaultsChanged", value.asInstanceOf[js.Any])
    
    inline def setScrollPositionChanged(value: JetElementCustomEvent[OffsetY]): Self = StObject.set(x, "scrollPositionChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionChanged(value: JetElementCustomEvent[js.Array[K2]]): Self = StObject.set(x, "selectionChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeChanged(value: JetElementCustomEvent[single | multiple | none]): Self = StObject.set(x, "selectionModeChanged", value.asInstanceOf[js.Any])
    
    inline def setStartChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "startChanged", value.asInstanceOf[js.Any])
    
    inline def setTaskDataChanged(value: JetElementCustomEvent[js.UndefOr[DataProvider[K2, D2]]]): Self = StObject.set(x, "taskDataChanged", value.asInstanceOf[js.Any])
    
    inline def setTaskDefaultsChanged(value: JetElementCustomEvent[Baseline]): Self = StObject.set(x, "taskDefaultsChanged", value.asInstanceOf[js.Any])
    
    inline def setTooltipChanged(value: JetElementCustomEvent[`9`[K2, D2]]): Self = StObject.set(x, "tooltipChanged", value.asInstanceOf[js.Any])
    
    inline def setValueFormatsChanged(value: JetElementCustomEvent[BaselineDate]): Self = StObject.set(x, "valueFormatsChanged", value.asInstanceOf[js.Any])
    
    inline def setViewportEndChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "viewportEndChanged", value.asInstanceOf[js.Any])
    
    inline def setViewportStartChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "viewportStartChanged", value.asInstanceOf[js.Any])
  }
}
