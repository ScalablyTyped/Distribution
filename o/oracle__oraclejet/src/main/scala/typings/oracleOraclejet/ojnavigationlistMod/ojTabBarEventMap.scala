package typings.oracleOraclejet.ojnavigationlistMod

import typings.oracleOraclejet.anon.RendererSelectable
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojAnimateEnd
import typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojAnimateStart
import typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeCurrentItem
import typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeDeselect
import typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeRemove
import typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeSelect
import typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojDeselect
import typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojRemove
import typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojReorder
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.hidden
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.popup
import typings.oracleOraclejet.oracleOraclejetStrings.progressive
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
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
trait ojTabBarEventMap[K, D] extends baseComponentEventMap[ojTabBarSettableProperties[K, D]] {
  
  var asChanged: JetElementCustomEvent[String] = js.native
  
  var currentItemChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any
  ] = js.native
  
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null] = js.native
  
  var displayChanged: JetElementCustomEvent[all | icons] = js.native
  
  var edgeChanged: JetElementCustomEvent[top | bottom | start | end] = js.native
  
  var itemChanged: JetElementCustomEvent[RendererSelectable[K, D]] = js.native
  
  var ojAnimateEnd: typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojAnimateEnd = js.native
  
  var ojAnimateStart: typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojAnimateStart = js.native
  
  var ojBeforeCurrentItem: typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeCurrentItem = js.native
  
  var ojBeforeDeselect: typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeDeselect = js.native
  
  var ojBeforeRemove: typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeRemove = js.native
  
  var ojBeforeSelect: typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeSelect = js.native
  
  var ojDeselect: typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojDeselect = js.native
  
  var ojRemove: typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojRemove = js.native
  
  var ojReorder: typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojReorder = js.native
  
  var overflowChanged: JetElementCustomEvent[popup | hidden] = js.native
  
  var reorderableChanged: JetElementCustomEvent[enabled | disabled] = js.native
  
  var selectionChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any
  ] = js.native
  
  var truncationChanged: JetElementCustomEvent[none | progressive] = js.native
}
object ojTabBarEventMap {
  
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
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
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    currentItemChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any
    ],
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
    dblclick: MouseEvent,
    displayChanged: JetElementCustomEvent[all | icons],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event,
    edgeChanged: JetElementCustomEvent[top | bottom | start | end],
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    input: Event,
    invalid: Event,
    itemChanged: JetElementCustomEvent[RendererSelectable[K, D]],
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
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
    ojAnimateEnd: ojAnimateEnd,
    ojAnimateStart: ojAnimateStart,
    ojBeforeCurrentItem: ojBeforeCurrentItem,
    ojBeforeDeselect: ojBeforeDeselect,
    ojBeforeRemove: ojBeforeRemove,
    ojBeforeSelect: ojBeforeSelect,
    ojDeselect: ojDeselect,
    ojRemove: ojRemove,
    ojReorder: ojReorder,
    overflowChanged: JetElementCustomEvent[popup | hidden],
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
    reorderableChanged: JetElementCustomEvent[enabled | disabled],
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any
    ],
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    submit: Event,
    suspend: Event,
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
    translationsChanged: JetElementCustomEvent[js.Object | Null],
    truncationChanged: JetElementCustomEvent[none | progressive],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojTabBarEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentItemChanged = currentItemChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], displayChanged = displayChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], edgeChanged = edgeChanged.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], itemChanged = itemChanged.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeCurrentItem = ojBeforeCurrentItem.asInstanceOf[js.Any], ojBeforeDeselect = ojBeforeDeselect.asInstanceOf[js.Any], ojBeforeRemove = ojBeforeRemove.asInstanceOf[js.Any], ojBeforeSelect = ojBeforeSelect.asInstanceOf[js.Any], ojDeselect = ojDeselect.asInstanceOf[js.Any], ojRemove = ojRemove.asInstanceOf[js.Any], ojReorder = ojReorder.asInstanceOf[js.Any], overflowChanged = overflowChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reorderableChanged = reorderableChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], truncationChanged = truncationChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTabBarEventMap[K, D]]
  }
  
  @scala.inline
  implicit class ojTabBarEventMapOps[Self <: ojTabBarEventMap[_, _], K, D] (val x: Self with (ojTabBarEventMap[K, D])) extends AnyVal {
    
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
    def setAsChanged(value: JetElementCustomEvent[String]): Self = this.set("asChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentItemChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any
        ]
    ): Self = this.set("currentItemChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataChanged(value: JetElementCustomEvent[(DataProvider[K, D]) | Null]): Self = this.set("dataChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayChanged(value: JetElementCustomEvent[all | icons]): Self = this.set("displayChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeChanged(value: JetElementCustomEvent[top | bottom | start | end]): Self = this.set("edgeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemChanged(value: JetElementCustomEvent[RendererSelectable[K, D]]): Self = this.set("itemChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjAnimateEnd(value: ojAnimateEnd): Self = this.set("ojAnimateEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjAnimateStart(value: ojAnimateStart): Self = this.set("ojAnimateStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeCurrentItem(value: ojBeforeCurrentItem): Self = this.set("ojBeforeCurrentItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeDeselect(value: ojBeforeDeselect): Self = this.set("ojBeforeDeselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeRemove(value: ojBeforeRemove): Self = this.set("ojBeforeRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjBeforeSelect(value: ojBeforeSelect): Self = this.set("ojBeforeSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjDeselect(value: ojDeselect): Self = this.set("ojDeselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjRemove(value: ojRemove): Self = this.set("ojRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOjReorder(value: ojReorder): Self = this.set("ojReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowChanged(value: JetElementCustomEvent[popup | hidden]): Self = this.set("overflowChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReorderableChanged(value: JetElementCustomEvent[enabled | disabled]): Self = this.set("reorderableChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any
        ]
    ): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncationChanged(value: JetElementCustomEvent[none | progressive]): Self = this.set("truncationChanged", value.asInstanceOf[js.Any])
  }
}
