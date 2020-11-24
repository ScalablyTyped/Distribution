package typings.oracleOraclejet.ojtreemapMod

import typings.oracleOraclejet.anon.GroupLabelDisplay
import typings.oracleOraclejet.anon.`28`
import typings.oracleOraclejet.anon.`29`
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typings.oracleOraclejet.ojtreemapMod.ojTreemap.ojBeforeDrill
import typings.oracleOraclejet.ojtreemapMod.ojTreemap.ojDrill
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bevels
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.gaps
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.outer
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.sliceAndDiceHorizontal
import typings.oracleOraclejet.oracleOraclejetStrings.sliceAndDiceVertical
import typings.oracleOraclejet.oracleOraclejetStrings.squarified
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojTreemapEventMap[K, D] extends dvtBaseComponentEventMap[ojTreemapSettableProperties[K, D]] {
  
  var animationDurationChanged: JetElementCustomEvent[Double] = js.native
  
  var animationOnDataChangeChanged: JetElementCustomEvent[auto | none] = js.native
  
  var animationOnDisplayChanged: JetElementCustomEvent[auto | none] = js.native
  
  var animationUpdateColorChanged: JetElementCustomEvent[String] = js.native
  
  var asChanged: JetElementCustomEvent[String] = js.native
  
  var colorLabelChanged: JetElementCustomEvent[String] = js.native
  
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null] = js.native
  
  var displayLevelsChanged: JetElementCustomEvent[Double] = js.native
  
  var drillingChanged: JetElementCustomEvent[on | off] = js.native
  
  var groupGapsChanged: JetElementCustomEvent[all | none | outer] = js.native
  
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]] = js.native
  
  var highlightMatchChanged: JetElementCustomEvent[any | all] = js.native
  
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]] = js.native
  
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none] = js.native
  
  var hoverBehaviorDelayChanged: JetElementCustomEvent[Double] = js.native
  
  var isolatedNodeChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['isolatedNode'] */ js.Any
  ] = js.native
  
  var layoutChanged: JetElementCustomEvent[sliceAndDiceHorizontal | sliceAndDiceVertical | squarified] = js.native
  
  var nodeContentChanged: JetElementCustomEvent[`28`[K, D]] = js.native
  
  var nodeDefaultsChanged: JetElementCustomEvent[GroupLabelDisplay] = js.native
  
  var nodeSeparatorsChanged: JetElementCustomEvent[bevels | gaps] = js.native
  
  var ojBeforeDrill: typings.oracleOraclejet.ojtreemapMod.ojTreemap.ojBeforeDrill = js.native
  
  var ojDrill: typings.oracleOraclejet.ojtreemapMod.ojTreemap.ojDrill = js.native
  
  var rootNodeChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['rootNode'] */ js.Any
  ] = js.native
  
  var selectionChanged: JetElementCustomEvent[js.Array[_]] = js.native
  
  var selectionModeChanged: JetElementCustomEvent[none | single | multiple] = js.native
  
  var sizeLabelChanged: JetElementCustomEvent[String] = js.native
  
  var sortingChanged: JetElementCustomEvent[on | off] = js.native
  
  var tooltipChanged: JetElementCustomEvent[`29`[K, D]] = js.native
  
  var touchResponseChanged: JetElementCustomEvent[touchStart | auto] = js.native
}
object ojTreemapEventMap {
  
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    animationDurationChanged: JetElementCustomEvent[Double],
    animationOnDataChangeChanged: JetElementCustomEvent[auto | none],
    animationOnDisplayChanged: JetElementCustomEvent[auto | none],
    animationUpdateColorChanged: JetElementCustomEvent[String],
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asChanged: JetElementCustomEvent[String],
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    colorLabelChanged: JetElementCustomEvent[String],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
    dblclick: MouseEvent,
    displayLevelsChanged: JetElementCustomEvent[Double],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drillingChanged: JetElementCustomEvent[on | off],
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    groupGapsChanged: JetElementCustomEvent[all | none | outer],
    hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    highlightMatchChanged: JetElementCustomEvent[any | all],
    highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hoverBehaviorChanged: JetElementCustomEvent[dim | none],
    hoverBehaviorDelayChanged: JetElementCustomEvent[Double],
    input: Event,
    invalid: Event,
    isolatedNodeChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['isolatedNode'] */ js.Any
    ],
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    layoutChanged: JetElementCustomEvent[sliceAndDiceHorizontal | sliceAndDiceVertical | squarified],
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
    nodeContentChanged: JetElementCustomEvent[`28`[K, D]],
    nodeDefaultsChanged: JetElementCustomEvent[GroupLabelDisplay],
    nodeSeparatorsChanged: JetElementCustomEvent[bevels | gaps],
    ojBeforeDrill: ojBeforeDrill,
    ojDrill: ojDrill,
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
    rootNodeChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['rootNode'] */ js.Any
    ],
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[js.Array[_]],
    selectionModeChanged: JetElementCustomEvent[none | single | multiple],
    selectionchange: Event,
    selectstart: Event,
    sizeLabelChanged: JetElementCustomEvent[String],
    sortingChanged: JetElementCustomEvent[on | off],
    stalled: Event,
    submit: Event,
    suspend: Event,
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: JetElementCustomEvent[`29`[K, D]],
    touchResponseChanged: JetElementCustomEvent[touchStart | auto],
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
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojTreemapEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationDurationChanged = animationDurationChanged.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationUpdateColorChanged = animationUpdateColorChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorLabelChanged = colorLabelChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], displayLevelsChanged = displayLevelsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], groupGapsChanged = groupGapsChanged.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], hoverBehaviorDelayChanged = hoverBehaviorDelayChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], isolatedNodeChanged = isolatedNodeChanged.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], layoutChanged = layoutChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], nodeContentChanged = nodeContentChanged.asInstanceOf[js.Any], nodeDefaultsChanged = nodeDefaultsChanged.asInstanceOf[js.Any], nodeSeparatorsChanged = nodeSeparatorsChanged.asInstanceOf[js.Any], ojBeforeDrill = ojBeforeDrill.asInstanceOf[js.Any], ojDrill = ojDrill.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rootNodeChanged = rootNodeChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], sizeLabelChanged = sizeLabelChanged.asInstanceOf[js.Any], sortingChanged = sortingChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTreemapEventMap[K, D]]
  }
  
  @scala.inline
  implicit class ojTreemapEventMapOps[Self <: ojTreemapEventMap[_, _], K, D] (val x: Self with (ojTreemapEventMap[K, D])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimationDurationChanged(value: JetElementCustomEvent[Double]): Self = this.set("animationDurationChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDataChangeChanged(value: JetElementCustomEvent[auto | none]): Self = this.set("animationOnDataChangeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDisplayChanged(value: JetElementCustomEvent[auto | none]): Self = this.set("animationOnDisplayChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUpdateColorChanged(value: JetElementCustomEvent[String]): Self = this.set("animationUpdateColorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsChanged(value: JetElementCustomEvent[String]): Self = this.set("asChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorLabelChanged(value: JetElementCustomEvent[String]): Self = this.set("colorLabelChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataChanged(value: JetElementCustomEvent[(DataProvider[K, D]) | Null]): Self = this.set("dataChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLevelsChanged(value: JetElementCustomEvent[Double]): Self = this.set("displayLevelsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillingChanged(value: JetElementCustomEvent[on | off]): Self = this.set("drillingChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupGapsChanged(value: JetElementCustomEvent[all | none | outer]): Self = this.set("groupGapsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = this.set("hiddenCategoriesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightMatchChanged(value: JetElementCustomEvent[any | all]): Self = this.set("highlightMatchChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = this.set("highlightedCategoriesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBehaviorChanged(value: JetElementCustomEvent[dim | none]): Self = this.set("hoverBehaviorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBehaviorDelayChanged(value: JetElementCustomEvent[Double]): Self = this.set("hoverBehaviorDelayChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolatedNodeChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['isolatedNode'] */ js.Any
        ]
    ): Self = this.set("isolatedNodeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutChanged(value: JetElementCustomEvent[sliceAndDiceHorizontal | sliceAndDiceVertical | squarified]): Self = this.set("layoutChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeContentChanged(value: JetElementCustomEvent[`28`[K, D]]): Self = this.set("nodeContentChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeDefaultsChanged(value: JetElementCustomEvent[GroupLabelDisplay]): Self = this.set("nodeDefaultsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeSeparatorsChanged(value: JetElementCustomEvent[bevels | gaps]): Self = this.set("nodeSeparatorsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeDrill(value: ojBeforeDrill): Self = this.set("ojBeforeDrill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjDrill(value: ojDrill): Self = this.set("ojDrill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNodeChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemap<K, D>['rootNode'] */ js.Any
        ]
    ): Self = this.set("rootNodeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionChanged(value: JetElementCustomEvent[js.Array[_]]): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeChanged(value: JetElementCustomEvent[none | single | multiple]): Self = this.set("selectionModeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeLabelChanged(value: JetElementCustomEvent[String]): Self = this.set("sizeLabelChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingChanged(value: JetElementCustomEvent[on | off]): Self = this.set("sortingChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipChanged(value: JetElementCustomEvent[`29`[K, D]]): Self = this.set("tooltipChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchResponseChanged(value: JetElementCustomEvent[touchStart | auto]): Self = this.set("touchResponseChanged", value.asInstanceOf[js.Any])
  }
}
