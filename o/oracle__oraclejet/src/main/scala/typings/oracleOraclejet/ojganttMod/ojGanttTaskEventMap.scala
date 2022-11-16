package typings.oracleOraclejet.ojganttMod

import typings.oracleOraclejet.anon.End
import typings.oracleOraclejet.anon.Value
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.innerCenter
import typings.oracleOraclejet.oracleOraclejetStrings.innerEnd
import typings.oracleOraclejet.oracleOraclejetStrings.innerStart
import typings.oracleOraclejet.oracleOraclejetStrings.milestone
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.normal
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.summary
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.HTMLElementEventMap
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

trait ojGanttTaskEventMap
  extends StObject
     with HTMLElementEventMap {
  
  var baselineChanged: JetElementCustomEvent[End]
  
  var borderRadiusChanged: JetElementCustomEvent[String]
  
  var endChanged: JetElementCustomEvent[String]
  
  var heightChanged: JetElementCustomEvent[Double | Null]
  
  var labelChanged: JetElementCustomEvent[String]
  
  var labelPositionChanged: JetElementCustomEvent[start | innerCenter | innerStart | innerEnd | end | none]
  
  var labelStyleChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttTask['labelStyle'] */ js.Any
  ]
  
  var progressChanged: JetElementCustomEvent[Value]
  
  var rowIdChanged: JetElementCustomEvent[js.UndefOr[Any]]
  
  var shortDescChanged: JetElementCustomEvent[String | Null]
  
  var startChanged: JetElementCustomEvent[String]
  
  var svgClassNameChanged: JetElementCustomEvent[String]
  
  var svgStyleChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttTask['svgStyle'] */ js.Any
  ]
  
  var typeChanged: JetElementCustomEvent[normal | milestone | summary | auto]
}
object ojGanttTaskEventMap {
  
  inline def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    baselineChanged: JetElementCustomEvent[End],
    beforeinput: InputEvent,
    blur: FocusEvent,
    borderRadiusChanged: JetElementCustomEvent[String],
    cancel: Event,
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
    heightChanged: JetElementCustomEvent[Double | Null],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: JetElementCustomEvent[String],
    labelPositionChanged: JetElementCustomEvent[start | innerCenter | innerStart | innerEnd | end | none],
    labelStyleChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttTask['labelStyle'] */ js.Any
    ],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
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
    progressChanged: JetElementCustomEvent[Value],
    ratechange: Event,
    reset: Event,
    resize: UIEvent,
    rowIdChanged: JetElementCustomEvent[js.UndefOr[Any]],
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    shortDescChanged: JetElementCustomEvent[String | Null],
    slotchange: Event,
    stalled: Event,
    startChanged: JetElementCustomEvent[String],
    submit: SubmitEvent,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[String],
    svgStyleChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttTask['svgStyle'] */ js.Any
    ],
    timeupdate: Event,
    toggle: Event,
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    typeChanged: JetElementCustomEvent[normal | milestone | summary | auto],
    volumechange: Event,
    waiting: Event,
    webkitanimationend: Event,
    webkitanimationiteration: Event,
    webkitanimationstart: Event,
    webkittransitionend: Event,
    wheel: WheelEvent
  ): ojGanttTaskEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], baselineChanged = baselineChanged.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderRadiusChanged = borderRadiusChanged.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], endChanged = endChanged.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], heightChanged = heightChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelChanged = labelChanged.asInstanceOf[js.Any], labelPositionChanged = labelPositionChanged.asInstanceOf[js.Any], labelStyleChanged = labelStyleChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], progressChanged = progressChanged.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowIdChanged = rowIdChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], shortDescChanged = shortDescChanged.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], startChanged = startChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], typeChanged = typeChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttTaskEventMap]
  }
  
  extension [Self <: ojGanttTaskEventMap](x: Self) {
    
    inline def setBaselineChanged(value: JetElementCustomEvent[End]): Self = StObject.set(x, "baselineChanged", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "borderRadiusChanged", value.asInstanceOf[js.Any])
    
    inline def setEndChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "endChanged", value.asInstanceOf[js.Any])
    
    inline def setHeightChanged(value: JetElementCustomEvent[Double | Null]): Self = StObject.set(x, "heightChanged", value.asInstanceOf[js.Any])
    
    inline def setLabelChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "labelChanged", value.asInstanceOf[js.Any])
    
    inline def setLabelPositionChanged(value: JetElementCustomEvent[start | innerCenter | innerStart | innerEnd | end | none]): Self = StObject.set(x, "labelPositionChanged", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttTask['labelStyle'] */ js.Any
        ]
    ): Self = StObject.set(x, "labelStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setProgressChanged(value: JetElementCustomEvent[Value]): Self = StObject.set(x, "progressChanged", value.asInstanceOf[js.Any])
    
    inline def setRowIdChanged(value: JetElementCustomEvent[js.UndefOr[Any]]): Self = StObject.set(x, "rowIdChanged", value.asInstanceOf[js.Any])
    
    inline def setShortDescChanged(value: JetElementCustomEvent[String | Null]): Self = StObject.set(x, "shortDescChanged", value.asInstanceOf[js.Any])
    
    inline def setStartChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "startChanged", value.asInstanceOf[js.Any])
    
    inline def setSvgClassNameChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "svgClassNameChanged", value.asInstanceOf[js.Any])
    
    inline def setSvgStyleChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttTask['svgStyle'] */ js.Any
        ]
    ): Self = StObject.set(x, "svgStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setTypeChanged(value: JetElementCustomEvent[normal | milestone | summary | auto]): Self = StObject.set(x, "typeChanged", value.asInstanceOf[js.Any])
  }
}
