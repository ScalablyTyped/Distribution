package typings.preact.srcMod.hNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSXNs {
  import typings.preact.srcJsxMod.Defaultize
  import typings.preact.srcMod.Component
  import typings.preact.srcMod.VNode
  import typings.std.AnimationEvent
  import typings.std.ClipboardEvent
  import typings.std.CompositionEvent
  import typings.std.DragEvent
  import typings.std.Event
  import typings.std.FocusEvent
  import typings.std.KeyboardEvent
  import typings.std.MouseEvent
  import typings.std.PointerEvent
  import typings.std.TouchEvent
  import typings.std.TransitionEvent
  import typings.std.UIEvent
  import typings.std.WheelEvent

  type AnimationEventHandler = typings.preact.srcJsxMod.JSXInternalNs.EventHandler[AnimationEvent]
  type ClipboardEventHandler = typings.preact.srcJsxMod.JSXInternalNs.EventHandler[ClipboardEvent]
  type CompositionEventHandler = typings.preact.srcJsxMod.JSXInternalNs.EventHandler[CompositionEvent]
  type DragEventHandler = typings.preact.srcJsxMod.JSXInternalNs.EventHandler[DragEvent]
  type Element = VNode[js.Any]
  type ElementClass = Component[js.Any, js.Any]
  type EventHandler[E /* <: Event */] = js.Function1[/* event */ E, Unit]
  type FocusEventHandler = typings.preact.srcJsxMod.JSXInternalNs.EventHandler[FocusEvent]
  type GenericEventHandler = typings.preact.srcJsxMod.JSXInternalNs.EventHandler[Event]
  type KeyboardEventHandler = typings.preact.srcJsxMod.JSXInternalNs.EventHandler[KeyboardEvent]
  type LibraryManagedAttributes[Component, Props] = Props | (Defaultize[Props, js.Any])
  type MouseEventHandler = typings.preact.srcJsxMod.JSXInternalNs.EventHandler[MouseEvent]
  type PointerEventHandler = typings.preact.srcJsxMod.JSXInternalNs.EventHandler[PointerEvent]
  type TouchEventHandler = typings.preact.srcJsxMod.JSXInternalNs.EventHandler[TouchEvent]
  type TransitionEventHandler = typings.preact.srcJsxMod.JSXInternalNs.EventHandler[TransitionEvent]
  type UIEventHandler = typings.preact.srcJsxMod.JSXInternalNs.EventHandler[UIEvent]
  type WheelEventHandler = typings.preact.srcJsxMod.JSXInternalNs.EventHandler[WheelEvent]
}
