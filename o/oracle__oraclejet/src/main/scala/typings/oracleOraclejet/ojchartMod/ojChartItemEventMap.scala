package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.anon.MedianSvgStyle
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.oracleOraclejetStrings.aboveMarker
import typings.oracleOraclejet.oracleOraclejetStrings.afterMarker
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.beforeMarker
import typings.oracleOraclejet.oracleOraclejetStrings.belowMarker
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.insideBarEdge
import typings.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typings.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.outsideBarEdge
import typings.oracleOraclejet.oracleOraclejetStrings.outsideSlice
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typings.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
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

trait ojChartItemEventMap
  extends StObject
     with HTMLElementEventMap {
  
  var borderColorChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var borderWidthChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var boxPlotChanged: JetElementCustomEvent[js.UndefOr[MedianSvgStyle]]
  
  var categoriesChanged: JetElementCustomEvent[js.UndefOr[js.Array[String]]]
  
  var closeChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var colorChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var drillingChanged: JetElementCustomEvent[js.UndefOr[on | off | inherit]]
  
  var groupIdChanged: JetElementCustomEvent[js.Array[String | Double]]
  
  var highChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var itemsChanged: JetElementCustomEvent[js.UndefOr[js.Array[Double | js.Object]]]
  
  var labelChanged: JetElementCustomEvent[js.UndefOr[String | js.Array[String]]]
  
  var labelPositionChanged: JetElementCustomEvent[
    js.UndefOr[
      center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
    ]
  ]
  
  var labelStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object | js.Array[js.Object]]]
  
  var lowChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var markerDisplayedChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]]
  
  var markerShapeChanged: JetElementCustomEvent[
    js.UndefOr[
      circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
    ]
  ]
  
  var markerSizeChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var openChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var patternChanged: JetElementCustomEvent[
    js.UndefOr[
      smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
    ]
  ]
  
  var q1Changed: JetElementCustomEvent[js.UndefOr[Double]]
  
  var q2Changed: JetElementCustomEvent[js.UndefOr[Double]]
  
  var q3Changed: JetElementCustomEvent[js.UndefOr[Double]]
  
  var seriesIdChanged: JetElementCustomEvent[String | Double]
  
  var shortDescChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var sourceChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var sourceHoverChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var sourceHoverSelectedChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var sourceSelectedChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var svgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]]
  
  var svgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]]
  
  var targetValueChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var valueChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var volumeChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var xChanged: JetElementCustomEvent[js.UndefOr[Double | String]]
  
  var yChanged: JetElementCustomEvent[js.UndefOr[Double]]
  
  var zChanged: JetElementCustomEvent[js.UndefOr[Double]]
}
object ojChartItemEventMap {
  
  inline def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    beforeinput: InputEvent,
    blur: FocusEvent,
    borderColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    borderWidthChanged: JetElementCustomEvent[js.UndefOr[Double]],
    boxPlotChanged: JetElementCustomEvent[js.UndefOr[MedianSvgStyle]],
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    categoriesChanged: JetElementCustomEvent[js.UndefOr[js.Array[String]]],
    change: Event,
    click: MouseEvent,
    close: Event,
    closeChanged: JetElementCustomEvent[js.UndefOr[Double]],
    colorChanged: JetElementCustomEvent[js.UndefOr[String]],
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
    groupIdChanged: JetElementCustomEvent[js.Array[String | Double]],
    highChanged: JetElementCustomEvent[js.UndefOr[Double]],
    input: Event,
    invalid: Event,
    itemsChanged: JetElementCustomEvent[js.UndefOr[js.Array[Double | js.Object]]],
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: JetElementCustomEvent[js.UndefOr[String | js.Array[String]]],
    labelPositionChanged: JetElementCustomEvent[
      js.UndefOr[
        center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
      ]
    ],
    labelStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object | js.Array[js.Object]]],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    lowChanged: JetElementCustomEvent[js.UndefOr[Double]],
    markerDisplayedChanged: JetElementCustomEvent[js.UndefOr[on | off | auto]],
    markerShapeChanged: JetElementCustomEvent[
      js.UndefOr[
        circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
      ]
    ],
    markerSizeChanged: JetElementCustomEvent[js.UndefOr[Double]],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    openChanged: JetElementCustomEvent[js.UndefOr[Double]],
    paste: ClipboardEvent,
    patternChanged: JetElementCustomEvent[
      js.UndefOr[
        smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
      ]
    ],
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
    q1Changed: JetElementCustomEvent[js.UndefOr[Double]],
    q2Changed: JetElementCustomEvent[js.UndefOr[Double]],
    q3Changed: JetElementCustomEvent[js.UndefOr[Double]],
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
    seriesIdChanged: JetElementCustomEvent[String | Double],
    shortDescChanged: JetElementCustomEvent[js.UndefOr[String]],
    slotchange: Event,
    sourceChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceHoverChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceHoverSelectedChanged: JetElementCustomEvent[js.UndefOr[String]],
    sourceSelectedChanged: JetElementCustomEvent[js.UndefOr[String]],
    stalled: Event,
    submit: SubmitEvent,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]],
    svgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]],
    targetValueChanged: JetElementCustomEvent[js.UndefOr[Double]],
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
    valueChanged: JetElementCustomEvent[js.UndefOr[Double]],
    volumeChanged: JetElementCustomEvent[js.UndefOr[Double]],
    volumechange: Event,
    waiting: Event,
    webkitanimationend: Event,
    webkitanimationiteration: Event,
    webkitanimationstart: Event,
    webkittransitionend: Event,
    wheel: WheelEvent,
    xChanged: JetElementCustomEvent[js.UndefOr[Double | String]],
    yChanged: JetElementCustomEvent[js.UndefOr[Double]],
    zChanged: JetElementCustomEvent[js.UndefOr[Double]]
  ): ojChartItemEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderColorChanged = borderColorChanged.asInstanceOf[js.Any], borderWidthChanged = borderWidthChanged.asInstanceOf[js.Any], boxPlotChanged = boxPlotChanged.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], categoriesChanged = categoriesChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], closeChanged = closeChanged.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], groupIdChanged = groupIdChanged.asInstanceOf[js.Any], highChanged = highChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], itemsChanged = itemsChanged.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelChanged = labelChanged.asInstanceOf[js.Any], labelPositionChanged = labelPositionChanged.asInstanceOf[js.Any], labelStyleChanged = labelStyleChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], lowChanged = lowChanged.asInstanceOf[js.Any], markerDisplayedChanged = markerDisplayedChanged.asInstanceOf[js.Any], markerShapeChanged = markerShapeChanged.asInstanceOf[js.Any], markerSizeChanged = markerSizeChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], openChanged = openChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], patternChanged = patternChanged.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q1Changed = q1Changed.asInstanceOf[js.Any], q2Changed = q2Changed.asInstanceOf[js.Any], q3Changed = q3Changed.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], seriesIdChanged = seriesIdChanged.asInstanceOf[js.Any], shortDescChanged = shortDescChanged.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], sourceChanged = sourceChanged.asInstanceOf[js.Any], sourceHoverChanged = sourceHoverChanged.asInstanceOf[js.Any], sourceHoverSelectedChanged = sourceHoverSelectedChanged.asInstanceOf[js.Any], sourceSelectedChanged = sourceSelectedChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], targetValueChanged = targetValueChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], volumeChanged = volumeChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], xChanged = xChanged.asInstanceOf[js.Any], yChanged = yChanged.asInstanceOf[js.Any], zChanged = zChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartItemEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ojChartItemEventMap] (val x: Self) extends AnyVal {
    
    inline def setBorderColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "borderColorChanged", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "borderWidthChanged", value.asInstanceOf[js.Any])
    
    inline def setBoxPlotChanged(value: JetElementCustomEvent[js.UndefOr[MedianSvgStyle]]): Self = StObject.set(x, "boxPlotChanged", value.asInstanceOf[js.Any])
    
    inline def setCategoriesChanged(value: JetElementCustomEvent[js.UndefOr[js.Array[String]]]): Self = StObject.set(x, "categoriesChanged", value.asInstanceOf[js.Any])
    
    inline def setCloseChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "closeChanged", value.asInstanceOf[js.Any])
    
    inline def setColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "colorChanged", value.asInstanceOf[js.Any])
    
    inline def setDrillingChanged(value: JetElementCustomEvent[js.UndefOr[on | off | inherit]]): Self = StObject.set(x, "drillingChanged", value.asInstanceOf[js.Any])
    
    inline def setGroupIdChanged(value: JetElementCustomEvent[js.Array[String | Double]]): Self = StObject.set(x, "groupIdChanged", value.asInstanceOf[js.Any])
    
    inline def setHighChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "highChanged", value.asInstanceOf[js.Any])
    
    inline def setItemsChanged(value: JetElementCustomEvent[js.UndefOr[js.Array[Double | js.Object]]]): Self = StObject.set(x, "itemsChanged", value.asInstanceOf[js.Any])
    
    inline def setLabelChanged(value: JetElementCustomEvent[js.UndefOr[String | js.Array[String]]]): Self = StObject.set(x, "labelChanged", value.asInstanceOf[js.Any])
    
    inline def setLabelPositionChanged(
      value: JetElementCustomEvent[
          js.UndefOr[
            center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
          ]
        ]
    ): Self = StObject.set(x, "labelPositionChanged", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleChanged(value: JetElementCustomEvent[js.UndefOr[js.Object | js.Array[js.Object]]]): Self = StObject.set(x, "labelStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setLowChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "lowChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerDisplayedChanged(value: JetElementCustomEvent[js.UndefOr[on | off | auto]]): Self = StObject.set(x, "markerDisplayedChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerShapeChanged(
      value: JetElementCustomEvent[
          js.UndefOr[
            circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
          ]
        ]
    ): Self = StObject.set(x, "markerShapeChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerSizeChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "markerSizeChanged", value.asInstanceOf[js.Any])
    
    inline def setOpenChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "openChanged", value.asInstanceOf[js.Any])
    
    inline def setPatternChanged(
      value: JetElementCustomEvent[
          js.UndefOr[
            smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
          ]
        ]
    ): Self = StObject.set(x, "patternChanged", value.asInstanceOf[js.Any])
    
    inline def setQ1Changed(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "q1Changed", value.asInstanceOf[js.Any])
    
    inline def setQ2Changed(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "q2Changed", value.asInstanceOf[js.Any])
    
    inline def setQ3Changed(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "q3Changed", value.asInstanceOf[js.Any])
    
    inline def setSeriesIdChanged(value: JetElementCustomEvent[String | Double]): Self = StObject.set(x, "seriesIdChanged", value.asInstanceOf[js.Any])
    
    inline def setShortDescChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "shortDescChanged", value.asInstanceOf[js.Any])
    
    inline def setSourceChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "sourceChanged", value.asInstanceOf[js.Any])
    
    inline def setSourceHoverChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "sourceHoverChanged", value.asInstanceOf[js.Any])
    
    inline def setSourceHoverSelectedChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "sourceHoverSelectedChanged", value.asInstanceOf[js.Any])
    
    inline def setSourceSelectedChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "sourceSelectedChanged", value.asInstanceOf[js.Any])
    
    inline def setSvgClassNameChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = StObject.set(x, "svgClassNameChanged", value.asInstanceOf[js.Any])
    
    inline def setSvgStyleChanged(value: JetElementCustomEvent[js.UndefOr[js.Object]]): Self = StObject.set(x, "svgStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setTargetValueChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "targetValueChanged", value.asInstanceOf[js.Any])
    
    inline def setValueChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "valueChanged", value.asInstanceOf[js.Any])
    
    inline def setVolumeChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "volumeChanged", value.asInstanceOf[js.Any])
    
    inline def setXChanged(value: JetElementCustomEvent[js.UndefOr[Double | String]]): Self = StObject.set(x, "xChanged", value.asInstanceOf[js.Any])
    
    inline def setYChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "yChanged", value.asInstanceOf[js.Any])
    
    inline def setZChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = StObject.set(x, "zChanged", value.asInstanceOf[js.Any])
  }
}
