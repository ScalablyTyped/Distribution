package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.anon.Q2Color
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.oracleOraclejetStrings.area
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bar
import typings.oracleOraclejet.oracleOraclejetStrings.boxPlot
import typings.oracleOraclejet.oracleOraclejetStrings.candlestick
import typings.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typings.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.curved
import typings.oracleOraclejet.oracleOraclejetStrings.dashed
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.dotted
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typings.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.line
import typings.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.segmented
import typings.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typings.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.stepped
import typings.oracleOraclejet.oracleOraclejetStrings.straight
import typings.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typings.oracleOraclejet.oracleOraclejetStrings.triangleUp
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

trait ojChartSeriesEventMap
  extends StObject
     with HTMLElementEventMap {
  
  var areaColorChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var areaSvgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var areaSvgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]]
  
  var assignedToY2Changed: JetElementCustomEvent[js.UndefOr[on | off]]
  
  var borderColorChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var borderWidthChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var boxPlotChanged: JetElementCustomEvent[js.UndefOr[Q2Color]]
  
  var categoriesChanged: JetElementCustomEvent[js.UndefOr[js.Array[String]]]
  
  var colorChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var displayInLegendChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]]
  
  var drillingChanged: JetElementCustomEvent[js.UndefOr[on | off | inherit]]
  
  var lineStyleChanged: JetElementCustomEvent[js.UndefOr[dotted | dashed | solid]]
  
  var lineTypeChanged: JetElementCustomEvent[
    js.UndefOr[
      straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
    ]
  ]
  
  var lineWidthChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var markerColorChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var markerDisplayedChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]]
  
  var markerShapeChanged: JetElementCustomEvent[
    js.UndefOr[
      circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
    ]
  ]
  
  var markerSizeChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var markerSvgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var markerSvgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]]
  
  var nameChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var patternChanged: JetElementCustomEvent[
    js.UndefOr[
      smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
    ]
  ]
  
  var pieSliceExplodeChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var shortDescChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var sourceChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var sourceHoverChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var sourceHoverSelectedChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var sourceSelectedChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var stackCategoryChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var svgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var svgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]]
  
  var typeChanged: JetElementCustomEvent[js.UndefOr[bar | line | area | lineWithArea | candlestick | boxPlot | auto]]
}
object ojChartSeriesEventMap {
  
  inline def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    areaColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    areaSvgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]],
    areaSvgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]],
    assignedToY2Changed: JetElementCustomEvent[js.UndefOr[on | off]],
    auxclick: MouseEvent,
    beforeinput: InputEvent,
    blur: FocusEvent,
    borderColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    borderWidthChanged: JetElementCustomEvent[js.UndefOr[Double]],
    boxPlotChanged: JetElementCustomEvent[js.UndefOr[Q2Color]],
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    categoriesChanged: JetElementCustomEvent[js.UndefOr[js.Array[String]]],
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: JetElementCustomEvent[js.UndefOr[String]],
    compositionend: CompositionEvent,
    compositionstart: CompositionEvent,
    compositionupdate: CompositionEvent,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    displayInLegendChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drillingChanged: JetElementCustomEvent[js.UndefOr[on | off | inherit]],
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    formdata: FormDataEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    lineStyleChanged: JetElementCustomEvent[js.UndefOr[dotted | dashed | solid]],
    lineTypeChanged: JetElementCustomEvent[
      js.UndefOr[
        straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
      ]
    ],
    lineWidthChanged: JetElementCustomEvent[js.UndefOr[Double]],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    markerColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    markerDisplayedChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]],
    markerShapeChanged: JetElementCustomEvent[
      js.UndefOr[
        circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
      ]
    ],
    markerSizeChanged: JetElementCustomEvent[js.UndefOr[Double]],
    markerSvgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]],
    markerSvgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    nameChanged: JetElementCustomEvent[js.UndefOr[String]],
    paste: ClipboardEvent,
    patternChanged: JetElementCustomEvent[
      js.UndefOr[
        smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
      ]
    ],
    pause: Event,
    pieSliceExplodeChanged: JetElementCustomEvent[js.UndefOr[Double]],
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
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    shortDescChanged: JetElementCustomEvent[js.UndefOr[String]],
    slotchange: Event,
    sourceChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceHoverChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceHoverSelectedChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceSelectedChanged: JetElementCustomEvent[js.UndefOr[String]],
    stackCategoryChanged: JetElementCustomEvent[js.UndefOr[String]],
    stalled: Event,
    submit: SubmitEvent,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]],
    svgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]],
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
    typeChanged: JetElementCustomEvent[js.UndefOr[bar | line | area | lineWithArea | candlestick | boxPlot | auto]],
    volumechange: Event,
    waiting: Event,
    webkitanimationend: Event,
    webkitanimationiteration: Event,
    webkitanimationstart: Event,
    webkittransitionend: Event,
    wheel: WheelEvent
  ): ojChartSeriesEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], areaColorChanged = areaColorChanged.asInstanceOf[js.Any], areaSvgClassNameChanged = areaSvgClassNameChanged.asInstanceOf[js.Any], areaSvgStyleChanged = areaSvgStyleChanged.asInstanceOf[js.Any], assignedToY2Changed = assignedToY2Changed.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderColorChanged = borderColorChanged.asInstanceOf[js.Any], borderWidthChanged = borderWidthChanged.asInstanceOf[js.Any], boxPlotChanged = boxPlotChanged.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], categoriesChanged = categoriesChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], displayInLegendChanged = displayInLegendChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], lineStyleChanged = lineStyleChanged.asInstanceOf[js.Any], lineTypeChanged = lineTypeChanged.asInstanceOf[js.Any], lineWidthChanged = lineWidthChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], markerColorChanged = markerColorChanged.asInstanceOf[js.Any], markerDisplayedChanged = markerDisplayedChanged.asInstanceOf[js.Any], markerShapeChanged = markerShapeChanged.asInstanceOf[js.Any], markerSizeChanged = markerSizeChanged.asInstanceOf[js.Any], markerSvgClassNameChanged = markerSvgClassNameChanged.asInstanceOf[js.Any], markerSvgStyleChanged = markerSvgStyleChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], nameChanged = nameChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], patternChanged = patternChanged.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pieSliceExplodeChanged = pieSliceExplodeChanged.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], shortDescChanged = shortDescChanged.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], sourceChanged = sourceChanged.asInstanceOf[js.Any], sourceHoverChanged = sourceHoverChanged.asInstanceOf[js.Any], sourceHoverSelectedChanged = sourceHoverSelectedChanged.asInstanceOf[js.Any], sourceSelectedChanged = sourceSelectedChanged.asInstanceOf[js.Any], stackCategoryChanged = stackCategoryChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], typeChanged = typeChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartSeriesEventMap]
  }
  
  extension [Self <: ojChartSeriesEventMap](x: Self) {
    
    inline def setAreaColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "areaColorChanged", value.asInstanceOf[js.Any])
    
    inline def setAreaSvgClassNameChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "areaSvgClassNameChanged", value.asInstanceOf[js.Any])
    
    inline def setAreaSvgStyleChanged(value: JetElementCustomEvent[js.UndefOr[js.Object]]): Self = StObject.set(x, "areaSvgStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setAssignedToY2Changed(value: JetElementCustomEvent[js.UndefOr[on | off]]): Self = StObject.set(x, "assignedToY2Changed", value.asInstanceOf[js.Any])
    
    inline def setBorderColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "borderColorChanged", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "borderWidthChanged", value.asInstanceOf[js.Any])
    
    inline def setBoxPlotChanged(value: JetElementCustomEvent[js.UndefOr[Q2Color]]): Self = StObject.set(x, "boxPlotChanged", value.asInstanceOf[js.Any])
    
    inline def setCategoriesChanged(value: JetElementCustomEvent[js.UndefOr[js.Array[String]]]): Self = StObject.set(x, "categoriesChanged", value.asInstanceOf[js.Any])
    
    inline def setColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "colorChanged", value.asInstanceOf[js.Any])
    
    inline def setDisplayInLegendChanged(value: JetElementCustomEvent[js.UndefOr[on | off | auto]]): Self = StObject.set(x, "displayInLegendChanged", value.asInstanceOf[js.Any])
    
    inline def setDrillingChanged(value: JetElementCustomEvent[js.UndefOr[on | off | inherit]]): Self = StObject.set(x, "drillingChanged", value.asInstanceOf[js.Any])
    
    inline def setLineStyleChanged(value: JetElementCustomEvent[js.UndefOr[dotted | dashed | solid]]): Self = StObject.set(x, "lineStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setLineTypeChanged(
      value: JetElementCustomEvent[
          js.UndefOr[
            straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
          ]
        ]
    ): Self = StObject.set(x, "lineTypeChanged", value.asInstanceOf[js.Any])
    
    inline def setLineWidthChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "lineWidthChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "markerColorChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerDisplayedChanged(value: JetElementCustomEvent[js.UndefOr[on | off | auto]]): Self = StObject.set(x, "markerDisplayedChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerShapeChanged(
      value: JetElementCustomEvent[
          js.UndefOr[
            circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
          ]
        ]
    ): Self = StObject.set(x, "markerShapeChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerSizeChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "markerSizeChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerSvgClassNameChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "markerSvgClassNameChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerSvgStyleChanged(value: JetElementCustomEvent[js.UndefOr[js.Object]]): Self = StObject.set(x, "markerSvgStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setNameChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "nameChanged", value.asInstanceOf[js.Any])
    
    inline def setPatternChanged(
      value: JetElementCustomEvent[
          js.UndefOr[
            smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
          ]
        ]
    ): Self = StObject.set(x, "patternChanged", value.asInstanceOf[js.Any])
    
    inline def setPieSliceExplodeChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "pieSliceExplodeChanged", value.asInstanceOf[js.Any])
    
    inline def setShortDescChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "shortDescChanged", value.asInstanceOf[js.Any])
    
    inline def setSourceChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "sourceChanged", value.asInstanceOf[js.Any])
    
    inline def setSourceHoverChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "sourceHoverChanged", value.asInstanceOf[js.Any])
    
    inline def setSourceHoverSelectedChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "sourceHoverSelectedChanged", value.asInstanceOf[js.Any])
    
    inline def setSourceSelectedChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "sourceSelectedChanged", value.asInstanceOf[js.Any])
    
    inline def setStackCategoryChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "stackCategoryChanged", value.asInstanceOf[js.Any])
    
    inline def setSvgClassNameChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "svgClassNameChanged", value.asInstanceOf[js.Any])
    
    inline def setSvgStyleChanged(value: JetElementCustomEvent[js.UndefOr[js.Object]]): Self = StObject.set(x, "svgStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setTypeChanged(
      value: JetElementCustomEvent[js.UndefOr[bar | line | area | lineWithArea | candlestick | boxPlot | auto]]
    ): Self = StObject.set(x, "typeChanged", value.asInstanceOf[js.Any])
  }
}
