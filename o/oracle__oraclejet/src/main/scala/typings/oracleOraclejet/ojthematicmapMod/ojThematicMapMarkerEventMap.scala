package typings.oracleOraclejet.ojthematicmapMod

import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.ellipse
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.rectangle
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.top
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

trait ojThematicMapMarkerEventMap
  extends StObject
     with HTMLElementEventMap {
  
  var borderColorChanged: JetElementCustomEvent[String]
  
  var borderStyleChanged: JetElementCustomEvent[solid | none]
  
  var borderWidthChanged: JetElementCustomEvent[Double]
  
  var categoriesChanged: JetElementCustomEvent[js.Array[String]]
  
  var colorChanged: JetElementCustomEvent[String]
  
  var heightChanged: JetElementCustomEvent[Double]
  
  var labelChanged: JetElementCustomEvent[String]
  
  var labelPositionChanged: JetElementCustomEvent[bottom | center | top]
  
  var labelStyleChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapMarker['labelStyle'] */ js.Any
  ]
  
  var locationChanged: JetElementCustomEvent[String]
  
  var opacityChanged: JetElementCustomEvent[Double]
  
  var rotationChanged: JetElementCustomEvent[Double]
  
  var selectableChanged: JetElementCustomEvent[auto | off]
  
  var shapeChanged: JetElementCustomEvent[
    js.UndefOr[
      circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
    ]
  ]
  
  var shortDescChanged: JetElementCustomEvent[String]
  
  var sourceChanged: JetElementCustomEvent[String]
  
  var sourceHoverChanged: JetElementCustomEvent[String]
  
  var sourceHoverSelectedChanged: JetElementCustomEvent[String]
  
  var sourceSelectedChanged: JetElementCustomEvent[String]
  
  var svgClassNameChanged: JetElementCustomEvent[String]
  
  var svgStyleChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapMarker['svgStyle'] */ js.Any
  ]
  
  var valueChanged: JetElementCustomEvent[Double]
  
  var widthChanged: JetElementCustomEvent[Double]
  
  var xChanged: JetElementCustomEvent[Double | Null]
  
  var yChanged: JetElementCustomEvent[Double | Null]
}
object ojThematicMapMarkerEventMap {
  
  inline def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    beforeinput: InputEvent,
    blur: FocusEvent,
    borderColorChanged: JetElementCustomEvent[String],
    borderStyleChanged: JetElementCustomEvent[solid | none],
    borderWidthChanged: JetElementCustomEvent[Double],
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    categoriesChanged: JetElementCustomEvent[js.Array[String]],
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: JetElementCustomEvent[String],
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
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    formdata: FormDataEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    heightChanged: JetElementCustomEvent[Double],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: JetElementCustomEvent[String],
    labelPositionChanged: JetElementCustomEvent[bottom | center | top],
    labelStyleChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapMarker['labelStyle'] */ js.Any
    ],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    locationChanged: JetElementCustomEvent[String],
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    opacityChanged: JetElementCustomEvent[Double],
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
    reset: Event,
    resize: UIEvent,
    rotationChanged: JetElementCustomEvent[Double],
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectableChanged: JetElementCustomEvent[auto | off],
    selectionchange: Event,
    selectstart: Event,
    shapeChanged: JetElementCustomEvent[
      js.UndefOr[
        circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
      ]
    ],
    shortDescChanged: JetElementCustomEvent[String],
    slotchange: Event,
    sourceChanged: JetElementCustomEvent[String],
    sourceHoverChanged: JetElementCustomEvent[String],
    sourceHoverSelectedChanged: JetElementCustomEvent[String],
    sourceSelectedChanged: JetElementCustomEvent[String],
    stalled: Event,
    submit: SubmitEvent,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[String],
    svgStyleChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapMarker['svgStyle'] */ js.Any
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
    valueChanged: JetElementCustomEvent[Double],
    volumechange: Event,
    waiting: Event,
    webkitanimationend: Event,
    webkitanimationiteration: Event,
    webkitanimationstart: Event,
    webkittransitionend: Event,
    wheel: WheelEvent,
    widthChanged: JetElementCustomEvent[Double],
    xChanged: JetElementCustomEvent[Double | Null],
    yChanged: JetElementCustomEvent[Double | Null]
  ): ojThematicMapMarkerEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderColorChanged = borderColorChanged.asInstanceOf[js.Any], borderStyleChanged = borderStyleChanged.asInstanceOf[js.Any], borderWidthChanged = borderWidthChanged.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], categoriesChanged = categoriesChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], heightChanged = heightChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelChanged = labelChanged.asInstanceOf[js.Any], labelPositionChanged = labelPositionChanged.asInstanceOf[js.Any], labelStyleChanged = labelStyleChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], locationChanged = locationChanged.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], opacityChanged = opacityChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rotationChanged = rotationChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectableChanged = selectableChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], shapeChanged = shapeChanged.asInstanceOf[js.Any], shortDescChanged = shortDescChanged.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], sourceChanged = sourceChanged.asInstanceOf[js.Any], sourceHoverChanged = sourceHoverChanged.asInstanceOf[js.Any], sourceHoverSelectedChanged = sourceHoverSelectedChanged.asInstanceOf[js.Any], sourceSelectedChanged = sourceSelectedChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], widthChanged = widthChanged.asInstanceOf[js.Any], xChanged = xChanged.asInstanceOf[js.Any], yChanged = yChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapMarkerEventMap]
  }
  
  extension [Self <: ojThematicMapMarkerEventMap](x: Self) {
    
    inline def setBorderColorChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "borderColorChanged", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleChanged(value: JetElementCustomEvent[solid | none]): Self = StObject.set(x, "borderStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "borderWidthChanged", value.asInstanceOf[js.Any])
    
    inline def setCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = StObject.set(x, "categoriesChanged", value.asInstanceOf[js.Any])
    
    inline def setColorChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "colorChanged", value.asInstanceOf[js.Any])
    
    inline def setHeightChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "heightChanged", value.asInstanceOf[js.Any])
    
    inline def setLabelChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "labelChanged", value.asInstanceOf[js.Any])
    
    inline def setLabelPositionChanged(value: JetElementCustomEvent[bottom | center | top]): Self = StObject.set(x, "labelPositionChanged", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapMarker['labelStyle'] */ js.Any
        ]
    ): Self = StObject.set(x, "labelStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setLocationChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "locationChanged", value.asInstanceOf[js.Any])
    
    inline def setOpacityChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "opacityChanged", value.asInstanceOf[js.Any])
    
    inline def setRotationChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "rotationChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectableChanged(value: JetElementCustomEvent[auto | off]): Self = StObject.set(x, "selectableChanged", value.asInstanceOf[js.Any])
    
    inline def setShapeChanged(
      value: JetElementCustomEvent[
          js.UndefOr[
            circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
          ]
        ]
    ): Self = StObject.set(x, "shapeChanged", value.asInstanceOf[js.Any])
    
    inline def setShortDescChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "shortDescChanged", value.asInstanceOf[js.Any])
    
    inline def setSourceChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "sourceChanged", value.asInstanceOf[js.Any])
    
    inline def setSourceHoverChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "sourceHoverChanged", value.asInstanceOf[js.Any])
    
    inline def setSourceHoverSelectedChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "sourceHoverSelectedChanged", value.asInstanceOf[js.Any])
    
    inline def setSourceSelectedChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "sourceSelectedChanged", value.asInstanceOf[js.Any])
    
    inline def setSvgClassNameChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "svgClassNameChanged", value.asInstanceOf[js.Any])
    
    inline def setSvgStyleChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapMarker['svgStyle'] */ js.Any
        ]
    ): Self = StObject.set(x, "svgStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setValueChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "valueChanged", value.asInstanceOf[js.Any])
    
    inline def setWidthChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "widthChanged", value.asInstanceOf[js.Any])
    
    inline def setXChanged(value: JetElementCustomEvent[Double | Null]): Self = StObject.set(x, "xChanged", value.asInstanceOf[js.Any])
    
    inline def setYChanged(value: JetElementCustomEvent[Double | Null]): Self = StObject.set(x, "yChanged", value.asInstanceOf[js.Any])
  }
}
