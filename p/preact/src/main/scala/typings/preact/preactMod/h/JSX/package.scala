package typings.preact.preactMod.h

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSX {
  import typings.preact.Anon_CurrentTarget
  import typings.preact.preactMod.Component
  import typings.preact.preactMod.VNode
  import typings.preact.preactStrings.currentTarget
  import typings.preact.srcJsxMod.Defaultize
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

  type AnimationEventHandler[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.EventHandler[typings.preact.srcJsxMod.JSXInternal.TargetedAnimationEvent[Target]]
  type ClipboardEventHandler[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.EventHandler[typings.preact.srcJsxMod.JSXInternal.TargetedClipboardEvent[Target]]
  type CompositionEventHandler[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.EventHandler[typings.preact.srcJsxMod.JSXInternal.TargetedCompositionEvent[Target]]
  type DragEventHandler[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.EventHandler[typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target]]
  type Element = VNode[js.Any]
  type ElementClass = Component[js.Any, js.Any]
  type EventHandler[E /* <: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[EventTarget, Event] */] = js.Function1[/* event */ E, Unit]
  type FocusEventHandler[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.EventHandler[typings.preact.srcJsxMod.JSXInternal.TargetedFocusEvent[Target]]
  type GenericEventHandler[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.EventHandler[typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event]]
  type KeyboardEventHandler[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.EventHandler[typings.preact.srcJsxMod.JSXInternal.TargetedKeyboardEvent[Target]]
  type LibraryManagedAttributes[Component, Props] = Props | (Defaultize[Props, js.Any])
  type MouseEventHandler[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.EventHandler[typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target]]
  type PointerEventHandler[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.EventHandler[typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target]]
  type TargetedAnimationEvent[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, AnimationEvent]
  type TargetedClipboardEvent[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, ClipboardEvent]
  type TargetedCompositionEvent[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, CompositionEvent]
  type TargetedDragEvent[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, DragEvent]
  type TargetedEvent[Target /* <: EventTarget */, TypedEvent /* <: Event */] = (Omit[TypedEvent, currentTarget]) with Anon_CurrentTarget[Target]
  type TargetedFocusEvent[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, FocusEvent]
  type TargetedKeyboardEvent[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, KeyboardEvent]
  type TargetedMouseEvent[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, MouseEvent]
  type TargetedPointerEvent[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, PointerEvent]
  type TargetedTouchEvent[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, TouchEvent]
  type TargetedTransitionEvent[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, TransitionEvent]
  type TargetedUIEvent[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, UIEvent]
  type TargetedWheelEvent[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, WheelEvent]
  type TouchEventHandler[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.EventHandler[typings.preact.srcJsxMod.JSXInternal.TargetedTouchEvent[Target]]
  type TransitionEventHandler[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.EventHandler[typings.preact.srcJsxMod.JSXInternal.TargetedTransitionEvent[Target]]
  type UIEventHandler[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.EventHandler[typings.preact.srcJsxMod.JSXInternal.TargetedUIEvent[Target]]
  type WheelEventHandler[Target /* <: EventTarget */] = typings.preact.srcJsxMod.JSXInternal.EventHandler[typings.preact.srcJsxMod.JSXInternal.TargetedWheelEvent[Target]]
}
