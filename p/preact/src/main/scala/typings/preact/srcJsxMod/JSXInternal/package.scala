package typings.preact.srcJsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSXInternal {
  import typings.preact.Anon_CurrentTarget
  import typings.preact.preactStrings.currentTarget
  import typings.preact.srcJsxMod.Defaultize
  import typings.preact.srcMod.Component
  import typings.preact.srcMod.VNode
  import typings.std.AnimationEvent
  import typings.std.ClipboardEvent
  import typings.std.CompositionEvent
  import typings.std.DragEvent
  import typings.std.Event
  import typings.std.EventTarget
  import typings.std.FocusEvent
  import typings.std.KeyboardEvent
  import typings.std.MouseEvent
  import typings.std.Omit
  import typings.std.PointerEvent
  import typings.std.TouchEvent
  import typings.std.TransitionEvent
  import typings.std.UIEvent
  import typings.std.WheelEvent

  type AnimationEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedAnimationEvent[Target]]
  type ClipboardEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedClipboardEvent[Target]]
  type CompositionEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedCompositionEvent[Target]]
  type DragEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedDragEvent[Target]]
  type Element = VNode[js.Any]
  type ElementClass = Component[js.Any, js.Any]
  type EventHandler[E /* <: TargetedEvent[EventTarget, Event] */] = js.Function1[/* event */ E, Unit]
  type FocusEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedFocusEvent[Target]]
  type GenericEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedEvent[Target, Event]]
  type KeyboardEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedKeyboardEvent[Target]]
  type LibraryManagedAttributes[Component, Props] = Props | (Defaultize[Props, js.Any])
  type MouseEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedMouseEvent[Target]]
  type PointerEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedPointerEvent[Target]]
  type TargetedAnimationEvent[Target /* <: EventTarget */] = TargetedEvent[Target, AnimationEvent]
  type TargetedClipboardEvent[Target /* <: EventTarget */] = TargetedEvent[Target, ClipboardEvent]
  type TargetedCompositionEvent[Target /* <: EventTarget */] = TargetedEvent[Target, CompositionEvent]
  type TargetedDragEvent[Target /* <: EventTarget */] = TargetedEvent[Target, DragEvent]
  type TargetedEvent[Target /* <: EventTarget */, TypedEvent /* <: Event */] = (Omit[TypedEvent, currentTarget]) with Anon_CurrentTarget[Target]
  type TargetedFocusEvent[Target /* <: EventTarget */] = TargetedEvent[Target, FocusEvent]
  type TargetedKeyboardEvent[Target /* <: EventTarget */] = TargetedEvent[Target, KeyboardEvent]
  type TargetedMouseEvent[Target /* <: EventTarget */] = TargetedEvent[Target, MouseEvent]
  type TargetedPointerEvent[Target /* <: EventTarget */] = TargetedEvent[Target, PointerEvent]
  type TargetedTouchEvent[Target /* <: EventTarget */] = TargetedEvent[Target, TouchEvent]
  type TargetedTransitionEvent[Target /* <: EventTarget */] = TargetedEvent[Target, TransitionEvent]
  type TargetedUIEvent[Target /* <: EventTarget */] = TargetedEvent[Target, UIEvent]
  type TargetedWheelEvent[Target /* <: EventTarget */] = TargetedEvent[Target, WheelEvent]
  type TouchEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedTouchEvent[Target]]
  type TransitionEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedTransitionEvent[Target]]
  type UIEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedUIEvent[Target]]
  type WheelEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedWheelEvent[Target]]
}
