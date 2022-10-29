package typings.pixiEvents

import typings.pixiCore.mod.utils.EventEmitter
import typings.pixiEvents.libFederatedPointerEventMod.FederatedPointerEvent
import typings.pixiEvents.libFederatedWheelEventMod.FederatedWheelEvent
import typings.pixiEvents.pixiEventsStrings.click
import typings.pixiEvents.pixiEventsStrings.mousedown
import typings.pixiEvents.pixiEventsStrings.mouseenter
import typings.pixiEvents.pixiEventsStrings.mouseleave
import typings.pixiEvents.pixiEventsStrings.mousemove
import typings.pixiEvents.pixiEventsStrings.mouseout
import typings.pixiEvents.pixiEventsStrings.mouseover
import typings.pixiEvents.pixiEventsStrings.mouseup
import typings.pixiEvents.pixiEventsStrings.mouseupoutside
import typings.pixiEvents.pixiEventsStrings.pointercancel
import typings.pixiEvents.pixiEventsStrings.pointerdown
import typings.pixiEvents.pixiEventsStrings.pointerenter
import typings.pixiEvents.pixiEventsStrings.pointerleave
import typings.pixiEvents.pixiEventsStrings.pointermove
import typings.pixiEvents.pixiEventsStrings.pointerout
import typings.pixiEvents.pixiEventsStrings.pointerover
import typings.pixiEvents.pixiEventsStrings.pointertap
import typings.pixiEvents.pixiEventsStrings.pointerup
import typings.pixiEvents.pixiEventsStrings.pointerupoutside
import typings.pixiEvents.pixiEventsStrings.rightclick
import typings.pixiEvents.pixiEventsStrings.rightdown
import typings.pixiEvents.pixiEventsStrings.rightup
import typings.pixiEvents.pixiEventsStrings.rightupoutside
import typings.pixiEvents.pixiEventsStrings.tap
import typings.pixiEvents.pixiEventsStrings.touchcancel
import typings.pixiEvents.pixiEventsStrings.touchend
import typings.pixiEvents.pixiEventsStrings.touchendoutside
import typings.pixiEvents.pixiEventsStrings.touchmove
import typings.pixiEvents.pixiEventsStrings.touchstart
import typings.pixiEvents.pixiEventsStrings.wheel
import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFederatedEventTargetMod {
  
  @JSImport("@pixi/events/lib/FederatedEventTarget", "FederatedDisplayObject")
  @js.native
  val FederatedDisplayObject: IFederatedDisplayObject = js.native
  
  type AddListenerOptions = Boolean | AddEventListenerOptions
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiEvents.pixiEventsStrings.auto
    - typings.pixiEvents.pixiEventsStrings.default
    - typings.pixiEvents.pixiEventsStrings.none
    - typings.pixiEvents.pixiEventsStrings.`context-menu`
    - typings.pixiEvents.pixiEventsStrings.help
    - typings.pixiEvents.pixiEventsStrings.pointer
    - typings.pixiEvents.pixiEventsStrings.progress
    - typings.pixiEvents.pixiEventsStrings.wait
    - typings.pixiEvents.pixiEventsStrings.cell
    - typings.pixiEvents.pixiEventsStrings.crosshair
    - typings.pixiEvents.pixiEventsStrings.text
    - typings.pixiEvents.pixiEventsStrings.`vertical-text`
    - typings.pixiEvents.pixiEventsStrings.alias
    - typings.pixiEvents.pixiEventsStrings.copy
    - typings.pixiEvents.pixiEventsStrings.move
    - typings.pixiEvents.pixiEventsStrings.`no-drop`
    - typings.pixiEvents.pixiEventsStrings.`not-allowed`
    - typings.pixiEvents.pixiEventsStrings.`e-resize`
    - typings.pixiEvents.pixiEventsStrings.`n-resize`
    - typings.pixiEvents.pixiEventsStrings.`ne-resize`
    - typings.pixiEvents.pixiEventsStrings.`nw-resize`
    - typings.pixiEvents.pixiEventsStrings.`s-resize`
    - typings.pixiEvents.pixiEventsStrings.`se-resize`
    - typings.pixiEvents.pixiEventsStrings.`sw-resize`
    - typings.pixiEvents.pixiEventsStrings.`w-resize`
    - typings.pixiEvents.pixiEventsStrings.`ns-resize`
    - typings.pixiEvents.pixiEventsStrings.`ew-resize`
    - typings.pixiEvents.pixiEventsStrings.`nesw-resize`
    - typings.pixiEvents.pixiEventsStrings.`col-resize`
    - typings.pixiEvents.pixiEventsStrings.`nwse-resize`
    - typings.pixiEvents.pixiEventsStrings.`row-resize`
    - typings.pixiEvents.pixiEventsStrings.`all-scroll`
    - typings.pixiEvents.pixiEventsStrings.`zoom-in`
    - typings.pixiEvents.pixiEventsStrings.`zoom-out`
    - typings.pixiEvents.pixiEventsStrings.grab
    - typings.pixiEvents.pixiEventsStrings.grabbing
  */
  trait Cursor extends StObject
  object Cursor {
    
    inline def default: typings.pixiEvents.pixiEventsStrings.default = "default".asInstanceOf[typings.pixiEvents.pixiEventsStrings.default]
    
    inline def alias: typings.pixiEvents.pixiEventsStrings.alias = "alias".asInstanceOf[typings.pixiEvents.pixiEventsStrings.alias]
    
    inline def `all-scroll`: typings.pixiEvents.pixiEventsStrings.`all-scroll` = "all-scroll".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`all-scroll`]
    
    inline def auto: typings.pixiEvents.pixiEventsStrings.auto = "auto".asInstanceOf[typings.pixiEvents.pixiEventsStrings.auto]
    
    inline def cell: typings.pixiEvents.pixiEventsStrings.cell = "cell".asInstanceOf[typings.pixiEvents.pixiEventsStrings.cell]
    
    inline def `col-resize`: typings.pixiEvents.pixiEventsStrings.`col-resize` = "col-resize".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`col-resize`]
    
    inline def `context-menu`: typings.pixiEvents.pixiEventsStrings.`context-menu` = "context-menu".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`context-menu`]
    
    inline def copy: typings.pixiEvents.pixiEventsStrings.copy = "copy".asInstanceOf[typings.pixiEvents.pixiEventsStrings.copy]
    
    inline def crosshair: typings.pixiEvents.pixiEventsStrings.crosshair = "crosshair".asInstanceOf[typings.pixiEvents.pixiEventsStrings.crosshair]
    
    inline def `e-resize`: typings.pixiEvents.pixiEventsStrings.`e-resize` = "e-resize".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`e-resize`]
    
    inline def `ew-resize`: typings.pixiEvents.pixiEventsStrings.`ew-resize` = "ew-resize".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`ew-resize`]
    
    inline def grab: typings.pixiEvents.pixiEventsStrings.grab = "grab".asInstanceOf[typings.pixiEvents.pixiEventsStrings.grab]
    
    inline def grabbing: typings.pixiEvents.pixiEventsStrings.grabbing = "grabbing".asInstanceOf[typings.pixiEvents.pixiEventsStrings.grabbing]
    
    inline def help: typings.pixiEvents.pixiEventsStrings.help = "help".asInstanceOf[typings.pixiEvents.pixiEventsStrings.help]
    
    inline def move: typings.pixiEvents.pixiEventsStrings.move = "move".asInstanceOf[typings.pixiEvents.pixiEventsStrings.move]
    
    inline def `n-resize`: typings.pixiEvents.pixiEventsStrings.`n-resize` = "n-resize".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`n-resize`]
    
    inline def `ne-resize`: typings.pixiEvents.pixiEventsStrings.`ne-resize` = "ne-resize".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`ne-resize`]
    
    inline def `nesw-resize`: typings.pixiEvents.pixiEventsStrings.`nesw-resize` = "nesw-resize".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`nesw-resize`]
    
    inline def `no-drop`: typings.pixiEvents.pixiEventsStrings.`no-drop` = "no-drop".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`no-drop`]
    
    inline def none: typings.pixiEvents.pixiEventsStrings.none = "none".asInstanceOf[typings.pixiEvents.pixiEventsStrings.none]
    
    inline def `not-allowed`: typings.pixiEvents.pixiEventsStrings.`not-allowed` = "not-allowed".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`not-allowed`]
    
    inline def `ns-resize`: typings.pixiEvents.pixiEventsStrings.`ns-resize` = "ns-resize".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`ns-resize`]
    
    inline def `nw-resize`: typings.pixiEvents.pixiEventsStrings.`nw-resize` = "nw-resize".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`nw-resize`]
    
    inline def `nwse-resize`: typings.pixiEvents.pixiEventsStrings.`nwse-resize` = "nwse-resize".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`nwse-resize`]
    
    inline def pointer: typings.pixiEvents.pixiEventsStrings.pointer = "pointer".asInstanceOf[typings.pixiEvents.pixiEventsStrings.pointer]
    
    inline def progress: typings.pixiEvents.pixiEventsStrings.progress = "progress".asInstanceOf[typings.pixiEvents.pixiEventsStrings.progress]
    
    inline def `row-resize`: typings.pixiEvents.pixiEventsStrings.`row-resize` = "row-resize".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`row-resize`]
    
    inline def `s-resize`: typings.pixiEvents.pixiEventsStrings.`s-resize` = "s-resize".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`s-resize`]
    
    inline def `se-resize`: typings.pixiEvents.pixiEventsStrings.`se-resize` = "se-resize".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`se-resize`]
    
    inline def `sw-resize`: typings.pixiEvents.pixiEventsStrings.`sw-resize` = "sw-resize".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`sw-resize`]
    
    inline def text: typings.pixiEvents.pixiEventsStrings.text = "text".asInstanceOf[typings.pixiEvents.pixiEventsStrings.text]
    
    inline def `vertical-text`: typings.pixiEvents.pixiEventsStrings.`vertical-text` = "vertical-text".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`vertical-text`]
    
    inline def `w-resize`: typings.pixiEvents.pixiEventsStrings.`w-resize` = "w-resize".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`w-resize`]
    
    inline def `zoom-in`: typings.pixiEvents.pixiEventsStrings.`zoom-in` = "zoom-in".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`zoom-in`]
    
    inline def `zoom-out`: typings.pixiEvents.pixiEventsStrings.`zoom-out` = "zoom-out".asInstanceOf[typings.pixiEvents.pixiEventsStrings.`zoom-out`]
  }
  
  @js.native
  trait FederatedEventTarget
    extends EventEmitter[String | js.Symbol, Any]
       with EventTarget {
    
    /** The children of this event target. */
    val children: js.UndefOr[js.Array[FederatedEventTarget]] = js.native
    
    /** The cursor preferred when the mouse pointer is hovering over. */
    var cursor: Cursor | String = js.native
    
    /** The hit-area specifies the area for which pointer events should be captured by this event target. */
    var hitArea: IHitArea | Null = js.native
    
    /** Whether this event target should fire UI events. */
    var interactive: Boolean = js.native
    
    /** Whether this event target has any children that need UI events. This can be used optimize event propagation. */
    var interactiveChildren: Boolean = js.native
    
    /** The parent of this event target. */
    val parent: js.UndefOr[FederatedEventTarget] = js.native
  }
  
  /* Inlined parent std.Omit<@pixi/events.@pixi/events/lib/FederatedEventTarget.FederatedEventTarget, 'parent' | 'children' | keyof @pixi/core.@pixi/core.utils.EventEmitter<string | symbol, any> | 'cursor'> */
  trait IFederatedDisplayObject extends StObject {
    
    def addEventListener(`type`: String): Unit
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddListenerOptions): Unit
    @JSName("addEventListener")
    var addEventListener_Original: js.Function1[/* type */ String, Unit]
    @JSName("addEventListener")
    def addEventListener_click(`type`: click, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_click(
      `type`: click,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_mousedown(`type`: mousedown, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_mousedown(
      `type`: mousedown,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_mouseenter(`type`: mouseenter, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_mouseleave(`type`: mouseleave, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_mousemove(`type`: mousemove, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_mousemove(
      `type`: mousemove,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_mouseout(`type`: mouseout, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_mouseout(
      `type`: mouseout,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_mouseover(`type`: mouseover, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_mouseover(
      `type`: mouseover,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_mouseup(`type`: mouseup, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_mouseup(
      `type`: mouseup,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_mouseupoutside(`type`: mouseupoutside, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_mouseupoutside(
      `type`: mouseupoutside,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_pointercancel(`type`: pointercancel, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_pointerdown(`type`: pointerdown, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_pointerenter(`type`: pointerenter, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_pointerleave(`type`: pointerleave, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_pointermove(`type`: pointermove, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_pointermove(
      `type`: pointermove,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_pointerout(`type`: pointerout, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_pointerout(
      `type`: pointerout,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_pointerover(`type`: pointerover, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_pointerover(
      `type`: pointerover,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_pointertap(`type`: pointertap, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_pointertap(
      `type`: pointertap,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_pointerup(`type`: pointerup, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_pointerup(
      `type`: pointerup,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_pointerupoutside(`type`: pointerupoutside, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_pointerupoutside(
      `type`: pointerupoutside,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_rightclick(`type`: rightclick, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_rightclick(
      `type`: rightclick,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_rightdown(`type`: rightdown, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_rightdown(
      `type`: rightdown,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_rightup(`type`: rightup, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_rightup(
      `type`: rightup,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_rightupoutside(`type`: rightupoutside, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_rightupoutside(
      `type`: rightupoutside,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_tap(`type`: tap, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_tap(
      `type`: tap,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_touchcancel(`type`: touchcancel, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_touchend(`type`: touchend, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_touchend(
      `type`: touchend,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_touchendoutside(`type`: touchendoutside, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_touchendoutside(
      `type`: touchendoutside,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_touchmove(`type`: touchmove, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_touchstart(`type`: touchstart, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: AddListenerOptions
    ): Unit
    @JSName("addEventListener")
    def addEventListener_wheel(`type`: wheel, listener: js.Function1[/* e */ FederatedWheelEvent, Any]): Unit
    @JSName("addEventListener")
    def addEventListener_wheel(
      `type`: wheel,
      listener: js.Function1[/* e */ FederatedWheelEvent, Any],
      options: AddListenerOptions
    ): Unit
    
    def dispatchEvent(event: Event): Boolean
    @JSName("dispatchEvent")
    var dispatchEvent_Original: js.Function1[/* event */ Event, Boolean]
    
    var hitArea: js.UndefOr[IHitArea | Null] = js.undefined
    
    var interactive: Boolean
    
    var interactiveChildren: Boolean
    
    def removeEventListener(`type`: String): Unit
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: RemoveListenerOptions): Unit
    @JSName("removeEventListener")
    var removeEventListener_Original: js.Function1[/* type */ String, Unit]
    @JSName("removeEventListener")
    def removeEventListener_click(`type`: click, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_click(
      `type`: click,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_mousedown(`type`: mousedown, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_mousedown(
      `type`: mousedown,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(`type`: mouseenter, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(`type`: mouseleave, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_mousemove(`type`: mousemove, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_mousemove(
      `type`: mousemove,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_mouseout(`type`: mouseout, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_mouseout(
      `type`: mouseout,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_mouseover(`type`: mouseover, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_mouseover(
      `type`: mouseover,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_mouseup(`type`: mouseup, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_mouseup(
      `type`: mouseup,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_mouseupoutside(`type`: mouseupoutside, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_mouseupoutside(
      `type`: mouseupoutside,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(`type`: pointercancel, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(`type`: pointerdown, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(`type`: pointerenter, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(`type`: pointerleave, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointermove(`type`: pointermove, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      `type`: pointermove,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointerout(`type`: pointerout, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      `type`: pointerout,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointerover(`type`: pointerover, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      `type`: pointerover,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointertap(`type`: pointertap, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointertap(
      `type`: pointertap,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointerup(`type`: pointerup, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointerup(
      `type`: pointerup,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointerupoutside(`type`: pointerupoutside, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_pointerupoutside(
      `type`: pointerupoutside,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_rightclick(`type`: rightclick, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_rightclick(
      `type`: rightclick,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_rightdown(`type`: rightdown, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_rightdown(
      `type`: rightdown,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_rightup(`type`: rightup, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_rightup(
      `type`: rightup,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_rightupoutside(`type`: rightupoutside, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_rightupoutside(
      `type`: rightupoutside,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_tap(`type`: tap, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_tap(
      `type`: tap,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(`type`: touchcancel, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_touchend(`type`: touchend, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      `type`: touchend,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_touchendoutside(`type`: touchendoutside, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_touchendoutside(
      `type`: touchendoutside,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_touchmove(`type`: touchmove, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      `type`: touchmove,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_touchstart(`type`: touchstart, listener: js.Function1[/* e */ FederatedPointerEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      `type`: touchstart,
      listener: js.Function1[/* e */ FederatedPointerEvent, Any],
      options: RemoveListenerOptions
    ): Unit
    @JSName("removeEventListener")
    def removeEventListener_wheel(`type`: wheel, listener: js.Function1[/* e */ FederatedWheelEvent, Any]): Unit
    @JSName("removeEventListener")
    def removeEventListener_wheel(
      `type`: wheel,
      listener: js.Function1[/* e */ FederatedWheelEvent, Any],
      options: RemoveListenerOptions
    ): Unit
  }
  object IFederatedDisplayObject {
    
    inline def apply(
      addEventListener: /* type */ String => Unit,
      dispatchEvent: /* event */ Event => Boolean,
      interactive: Boolean,
      interactiveChildren: Boolean,
      removeEventListener: /* type */ String => Unit
    ): IFederatedDisplayObject = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction1(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), interactive = interactive.asInstanceOf[js.Any], interactiveChildren = interactiveChildren.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction1(removeEventListener))
      __obj.asInstanceOf[IFederatedDisplayObject]
    }
    
    extension [Self <: IFederatedDisplayObject](x: Self) {
      
      inline def setAddEventListener(value: /* type */ String => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction1(value))
      
      inline def setDispatchEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
      
      inline def setHitArea(value: IHitArea): Self = StObject.set(x, "hitArea", value.asInstanceOf[js.Any])
      
      inline def setHitAreaNull: Self = StObject.set(x, "hitArea", null)
      
      inline def setHitAreaUndefined: Self = StObject.set(x, "hitArea", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveChildren(value: Boolean): Self = StObject.set(x, "interactiveChildren", value.asInstanceOf[js.Any])
      
      inline def setRemoveEventListener(value: /* type */ String => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction1(value))
    }
  }
  
  trait IHitArea extends StObject {
    
    def contains(x: Double, y: Double): Boolean
  }
  object IHitArea {
    
    inline def apply(contains: (Double, Double) => Boolean): IHitArea = {
      val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains))
      __obj.asInstanceOf[IHitArea]
    }
    
    extension [Self <: IHitArea](x: Self) {
      
      inline def setContains(value: (Double, Double) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
    }
  }
  
  type RemoveListenerOptions = Boolean | EventListenerOptions
}
